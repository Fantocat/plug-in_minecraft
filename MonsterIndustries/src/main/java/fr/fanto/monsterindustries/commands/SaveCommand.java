package fr.fanto.monsterindustries.commands;

import fr.fanto.monsterindustries.gsonUtils.FilesUtils;
import fr.fanto.monsterindustries.gsonUtils.MapSerializationManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import fr.fanto.monsterindustries.gameclass.Game;

import java.io.File;
import java.io.IOException;

public class SaveCommand implements CommandExecutor {
    private Game game;
    private MapSerializationManager mapSerializationManager;

    public SaveCommand(Game game, MapSerializationManager mapSerializationManager) {
        this.game = game;
        this.mapSerializationManager = mapSerializationManager;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            File file = new File("plugins/MonsterIndustries/" + game.getMap().getMapName() + ".json");
            try {
                FilesUtils.createFile(file);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            FilesUtils.save(file, mapSerializationManager.serializeMap(game.getMap()));
            player.sendMessage("§aMap "+ game.getMap().getMapName() +".json saved");
            game.getMap().setMapName(null);
        }
        return false;
    }
}
