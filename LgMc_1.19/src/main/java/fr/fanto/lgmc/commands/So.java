package fr.fanto.lgmc.commands;

import fr.fanto.lgmc.role;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class So implements CommandExecutor {

    String nl = System.getProperty("line.separator");

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        Player player = (Player)commandSender;

        boolean test;

        if (role.sorciere.get(player)==null){
            test = false;
        }
        else {
            test = role.sorciere.get(player);
        }

        if(test) {

            if(strings.length==0){
                player.sendMessage("testso");//A COMPLETER
            }
        } else {

                player.sendMessage("§4tu n'es pas la Sorcière!");

            }

        return true;


    }
}
