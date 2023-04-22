package fr.fanto.monsterindustries.commands;

import fr.fanto.monsterindustries.gameclass.Game;
import fr.fanto.monsterindustries.gsonUtils.FilesUtils;
import fr.fanto.monsterindustries.gsonUtils.MapSerializationManager;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Sign;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Directional;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;

import java.io.File;

public class LoadCommand implements CommandExecutor {

    private Game game;
    private MapSerializationManager mapSerializationManager;

    public LoadCommand(Game game, MapSerializationManager mapSerializationManager) {
        this.game = game;
        this.mapSerializationManager = mapSerializationManager;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0){
                player.sendMessage("§cUsage: /load <MapName>");
            } else if (args.length == 1) {
                File file = new File("plugins/MonsterIndustries/" + args[0] + ".json");
                if (file.exists()) {
                    game.setMap(mapSerializationManager.deserializeMap(FilesUtils.load(file)));
                    for(Player p : Bukkit.getOnlinePlayers()){
                        p.teleport(game.getMap().getSpawnHome());
                        p.setGameMode(GameMode.ADVENTURE);
                        p.getInventory().clear();
                    }
                    createSign();
                    for(LivingEntity e:Bukkit.getWorld("world").getLivingEntities()){
                        if(!(e instanceof Player)){
                            e.remove();
                        }
                    }
                    player.sendMessage("§aMap loaded");
                } else {
                    player.sendMessage("§cMap not found");
                }
            }
        }
        return false;
    }
    public void createSign(){
        game.getMap().getTeamButton().get(0).getBlock().setType(Material.OAK_WALL_SIGN);
        Block signBlock = game.getMap().getTeamButton().get(0).getBlock();
        Sign s1 = (Sign) game.getMap().getTeamButton().get(0).getBlock().getState();
        s1.setLine(0, "§a§l======");
        s1.setLine(1, "§a§lTeam Slime");
        s1.setLine(2, "§a§l======");
        s1.update();
        BlockData data = signBlock.getBlockData();
        if (data instanceof Directional) {
            Directional directional = (Directional) data;
            directional.setFacing(BlockFace.EAST);
            signBlock.setBlockData(data);
        }
        game.getMap().getTeamButton().get(1).getBlock().setType(Material.OAK_WALL_SIGN);
        Block signBlock2 = game.getMap().getTeamButton().get(1).getBlock();
        Sign s2 = (Sign) game.getMap().getTeamButton().get(1).getBlock().getState();
        s2.setLine(0, "§6§l======");
        s2.setLine(1, "§6§lTeam 2");
        s2.setLine(2, "§6§l======");
        s2.update();
        BlockData data2 = signBlock2.getBlockData();
        if (data2 instanceof Directional) {
            Directional directional = (Directional) data2;
            directional.setFacing(BlockFace.WEST);
            signBlock2.setBlockData(data2);
        }
    }
}
