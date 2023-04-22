package fr.fanto.monsterindustries.commands;

import fr.fanto.monsterindustries.*;
import fr.fanto.monsterindustries.utils.CustomTrader;
import fr.fanto.monsterindustries.utils.Scoreboard;
import fr.fanto.monsterindustries.utils.Timer;
import fr.fanto.monsterindustries.gameclass.Game;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Sign;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Directional;
import org.bukkit.block.data.type.WallSign;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StartCommand implements CommandExecutor {

    static private MonsterIndustriesGame monsterIndustriesGame;
    private Game game;
    boolean allInTeam = false;
    private Scoreboard sb;
    private Timer t1;
    public StartCommand(MonsterIndustriesGame monsterIndustriesGame, Game game, Scoreboard sb, Timer t1) {
        this.monsterIndustriesGame = monsterIndustriesGame;
        this.game = game;
        this.sb = sb;
        this.t1 = t1;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (game.isStarted()) {
            Bukkit.broadcastMessage("Error: Game already started");
            return false;
        } else {

            for (Player player : Bukkit.getOnlinePlayers()) {
                if (game.getTeam1().getPlayers().contains(player) || game.getTeam2().getPlayers().contains(player)) {
                    allInTeam = true;
                } else {
                    allInTeam = false;
                    Bukkit.broadcastMessage("Error: All players must be in a team");
                    break;
                }
            }
            if (allInTeam) {
                if (game.getTeam1().getPlayers().size() == game.getTeam2().getPlayers().size() || true) { // true a enlever
                    game.setStarted(true);
                    Bukkit.broadcastMessage("Game started");
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.teleport(game.getSpawnOf(player));
                        player.getInventory().clear();
                        player.setHealth(20);
                        player.setFoodLevel(20);
                        player.setGameMode(GameMode.ADVENTURE);
                        sb.createScoreBoard(player);
                    }
                    spawnTrader();
                    createBarriere();
                    t1.startTimer();
                } else {
                    Bukkit.broadcastMessage("Error: Teams must have the same size");
                }
            }

            return false;
        }
    }
    public void spawnTrader(){
        CustomTrader.spawnMerchantMobStart(game.getMap().getPnjT1().get(0));
        CustomTrader.spawnMerchantMobStart(game.getMap().getPnjT2().get(0));
        CustomTrader.spawnMerchantMobMid(game.getMap().getPnjT1().get(1));
        CustomTrader.spawnMerchantMobMid(game.getMap().getPnjT2().get(1));
        CustomTrader.spawnMerchantMobEnd(game.getMap().getPnjT1().get(2));
        CustomTrader.spawnMerchantMobEnd(game.getMap().getPnjT2().get(2));
        CustomTrader.spawnMerchantTool(game.getMap().getPnjT1().get(3));
        CustomTrader.spawnMerchantTool(game.getMap().getPnjT2().get(3));
        CustomTrader.spawnMerchantArmor(game.getMap().getPnjT1().get(4));
        CustomTrader.spawnMerchantArmor(game.getMap().getPnjT2().get(4));
        CustomTrader.spawnMerchantFood(game.getMap().getPnjT1().get(5));
        CustomTrader.spawnMerchantFood(game.getMap().getPnjT2().get(5));
        CustomTrader.spawnMerchantSlave(game.getMap().getPnjT1().get(6));
        CustomTrader.spawnMerchantSlave(game.getMap().getPnjT2().get(6));
        CustomTrader.spawnMerchantCapacity(game.getMap().getPnjT1().get(7));
        CustomTrader.spawnMerchantCapacity(game.getMap().getPnjT2().get(7));
        CustomTrader.spawnMerchantUpgrade(game.getMap().getPnjT1().get(8));
        CustomTrader.spawnMerchantUpgrade(game.getMap().getPnjT2().get(8));
    }

    public void createBarriere (){
        for (Location barriere:game.getMap().getBarrierlvl1T1()){
            barriere.getBlock().setType(Material.IRON_BARS);
        }
        for (Location barriere:game.getMap().getBarrierlvl1T2()){
            barriere.getBlock().setType(Material.IRON_BARS);
        }
        for (Location barriere:game.getMap().getBarrierlvl2T1()){
            barriere.getBlock().setType(Material.IRON_BARS);
        }
        for (Location barriere:game.getMap().getBarrierlvl2T2()){
            barriere.getBlock().setType(Material.IRON_BARS);
        }

        game.getMap().getSignlvl1().get(0).getBlock().setType(Material.OAK_WALL_SIGN);
        Block signBlock = game.getMap().getSignlvl1().get(0).getBlock();
        Sign s1 = (Sign) game.getMap().getSignlvl1().get(0).getBlock().getState();
        s1.setLine(0, "§6Niveau 1");
        s1.setLine(1, "§6Prix : 4 stacks Coins");
        s1.update();
        BlockData data = signBlock.getBlockData();
        if (data instanceof Directional) {
            Directional directional = (Directional) data;
            directional.setFacing(BlockFace.NORTH);
            signBlock.setBlockData(data);
        }
        game.getMap().getSignlvl1().get(1).getBlock().setType(Material.OAK_WALL_SIGN);
        Block signBlock2 = game.getMap().getSignlvl1().get(1).getBlock();
        Sign s2 = (Sign) game.getMap().getSignlvl1().get(1).getBlock().getState();
        s2.setLine(0, "§6Niveau 1");
        s2.setLine(1, "§6Prix : 4 stacks Coins");
        s2.update();
        BlockData data2 = signBlock2.getBlockData();
        if (data2 instanceof Directional) {
            Directional directional2 = (Directional) data2;
            directional2.setFacing(BlockFace.SOUTH);
            signBlock2.setBlockData(data2);
        }

        game.getMap().getSignlvl2().get(0).getBlock().setType(Material.OAK_WALL_SIGN);
        Block signBlock3 = game.getMap().getSignlvl2().get(0).getBlock();
        Sign s3 = (Sign) game.getMap().getSignlvl2().get(0).getBlock().getState();
        s3.setLine(0, "§6Niveau 2");
        s3.setLine(1, "§6Prix : 5 stacks Coins");
        s3.update();
        BlockData data3 = signBlock3.getBlockData();
        if (data3 instanceof Directional) {
            Directional directional3 = (Directional) data3;
            directional3.setFacing(BlockFace.EAST);
            signBlock3.setBlockData(data3);
        }

        game.getMap().getSignlvl2().get(1).getBlock().setType(Material.OAK_WALL_SIGN);
        Block signBlock4 = game.getMap().getSignlvl2().get(1).getBlock();
        Sign s4 = (Sign) game.getMap().getSignlvl2().get(1).getBlock().getState();
        s4.setLine(0, "§6Niveau 2");
        s4.setLine(1, "§6Prix : 5 stacks Coins");
        s4.update();
        BlockData data4 = signBlock4.getBlockData();
        if (data4 instanceof Directional) {
            Directional directional4 = (Directional) data4;
            directional4.setFacing(BlockFace.EAST);
            signBlock4.setBlockData(data4);
        }
    }
}
