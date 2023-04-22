package fr.fanto.lgmc.commands;

import fr.fanto.lgmc.role;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

import java.util.List;
import java.text.*;


public class Lg implements CommandExecutor {

    String nl = System.getProperty("line.separator");


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player)commandSender;

        boolean test;

        if (role.loupGarou.get(player)==null){
            test = false;
        }
        else {
            test = role.loupGarou.get(player);
        }

        if(test) {

            if(strings.length==0){
                player.sendMessage(

                        "/lg chat : pour envoyer un msg au autre loup");//A COMPLETER
            }
            else {
                if (strings[0].equalsIgnoreCase("chat")) {
                    StringBuilder bc = new StringBuilder();
                    for(int i = 1; i< strings.length; i++){
                        bc.append(strings[i] + " ");
                    }
                    ArrayList<Player> lg = Start.allLg;
                    int i = 0;
                    for(;lg.size()>i;i++){
                        lg.get(i).sendMessage("§4lg chat : " + bc.toString());
                    }

                }
            }
        } else {

            player.sendMessage("§4tu n'es pas un Loup!");

        }
        return true;
    }


}
