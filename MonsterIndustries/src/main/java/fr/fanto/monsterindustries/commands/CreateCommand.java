package fr.fanto.monsterindustries.commands;

import fr.fanto.monsterindustries.gameclass.Game;
import fr.fanto.monsterindustries.gameclass.TeamName;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.io.File;

public class CreateCommand implements CommandExecutor {

    private Game game;

    public CreateCommand(Game game) {
        this.game = game;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("§cUsage: /create <name> <T1name> <T2name>");
            return false;
        } else if (args.length == 1) {
            if (args[0].equalsIgnoreCase("list")) {
                File dir  = new File("plugins/MonsterIndustries/");
                File[] liste = dir.listFiles();
                sender.sendMessage("Liste des Maps: ");
                for(File item : liste) {
                    sender.sendMessage("    "+item.getName());
                }
                return false;
            }
        } else if (args.length == 3) {
            if (game.getMap().getMapName()!=null) {
                sender.sendMessage("§cUne map est deja load");
                return false;
            } else {
                game.getMap().setMapName(args[0]);
                game.getMap().setT1Name(getTeamName(args[1]));
                game.getMap().setT2Name(getTeamName(args[2]));
                if (game.getMap().getT1Name()==null || game.getMap().getT2Name()==null) {
                    sender.sendMessage("§cNom de team invalide");
                    return false;
                }
                sender.sendMessage("§aMap cree avec succes");
                return false;
            }
        }

        return false;
    }
    public TeamName getTeamName(String name) {
        for (TeamName teamName : TeamName.values()) {
            if (teamName.getShortName().equalsIgnoreCase(name)) {
                return teamName;
            }
        }
        return null;
    }
}
