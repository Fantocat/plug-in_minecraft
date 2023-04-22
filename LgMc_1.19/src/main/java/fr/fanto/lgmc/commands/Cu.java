package fr.fanto.lgmc.commands;

import fr.fanto.lgmc.role;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cu implements CommandExecutor {

    String nl = System.getProperty("line.separator");

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player)commandSender;

        boolean test;

        if (role.cupidon.get(player)==null){

            test = false;
        }
        else {
            test = role.cupidon.get(player);
        }

        if(test) {

            if(strings.length==0){
                player.sendMessage("testcu");//A COMPLETER;
            }
            if (strings[0].equalsIgnoreCase("couple")) {

            }
        } else {

                player.sendMessage("§4tu n'es pas Cupidon!");

            }

        return true;

    }
}
