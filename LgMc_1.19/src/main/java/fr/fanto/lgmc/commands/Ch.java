package fr.fanto.lgmc.commands;

import fr.fanto.lgmc.role;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Ch implements CommandExecutor {

    String nl = System.getProperty("line.separator");

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        Player player = (Player)commandSender;

        boolean test;

        if (role.chasseur.get(player)==null){
            test = false;
        }
        else {
            test = role.chasseur.get(player);
        }

        if(test) {

            if(strings.length==0){
                player.sendMessage("testch");//A COMPLETER
            }
        } else {

                player.sendMessage("§4tu n'es pas la Chasseur!");


        }
        return true;
    }
}
