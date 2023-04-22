package fr.fanto.lgmc.commands;

import fr.fanto.lgmc.role;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Pf implements CommandExecutor {

    String nl = System.getProperty("line.separator");

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player)commandSender;

        boolean test;

        if (role.petiteFille.get(player)==null){
            test = false;
        }
        else {
            test = role.petiteFille.get(player);
        }

        if(test) {

            if(strings.length==0){

                player.sendMessage("testpf");//A COMPLETER

            }

        } else {

                player.sendMessage("§4tu n'es pas la Petite Fille!");

            }

        return true;


    }
}
