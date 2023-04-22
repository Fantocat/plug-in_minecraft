package fr.fanto.monsterindustries.commands;

import fr.fanto.monsterindustries.gameclass.Game;
import fr.fanto.monsterindustries.MonsterIndustriesGame;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;


public class RandomTeamCommand implements CommandExecutor {

    static private MonsterIndustriesGame monsterIndustriesGame;
    private Game game;

    public RandomTeamCommand(MonsterIndustriesGame monsterIndustriesGame, Game game) {
        this.monsterIndustriesGame = monsterIndustriesGame;
        this.game = game;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (game.isStarted()) {
            Bukkit.broadcastMessage("Error: Game already started");
            return false;
        } else {
            int team1 = 0;
            int team2 = 0;
            game.getTeam1().getPlayers().clear();
            game.getTeam2().getPlayers().clear();
            for (Player player : Bukkit.getOnlinePlayers()) {
                if (team1 > team2) {
                    game.getTeam2().addPlayer(player);
                    player.sendMessage("You are in team §l§6Magma");
                    player.setPlayerListName(ChatColor.YELLOW + player.getName());
                    player.setDisplayName(ChatColor.YELLOW + player.getName());
                    team2++;
                } else if (team1 < team2) {
                    game.getTeam1().addPlayer(player);
                    player.sendMessage("You are in team §l§aSlime");
                    player.setPlayerListName(ChatColor.GREEN + player.getName());
                    player.setDisplayName(ChatColor.GREEN + player.getName());
                    team1++;
                } else if (team1 == team2) {
                    Random rd = new Random();
                    boolean rand = rd.nextBoolean();
                    if (rand) {
                        game.getTeam1().addPlayer(player);
                        player.sendMessage("You are in team §l§aSlime");
                        player.setPlayerListName(ChatColor.GREEN + player.getName());
                        player.setDisplayName(ChatColor.GREEN + player.getName());
                        team1++;
                    } else {
                        game.getTeam2().addPlayer(player);
                        player.sendMessage("You are in team §l§6Magma");
                        player.setPlayerListName(ChatColor.YELLOW + player.getName());
                        player.setDisplayName(ChatColor.YELLOW + player.getName());
                        team2++;
                    }
                }
            }

            return true;
        }
    }


}
