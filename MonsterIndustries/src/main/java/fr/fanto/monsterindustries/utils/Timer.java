package fr.fanto.monsterindustries.utils;

import fr.fanto.monsterindustries.gameclass.Game;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Timer {

    private static int time = 0;

    private Plugin main;
    private Game game;
    private int count = 0;


    public Timer(Plugin main, Game game) {
        this.main = main;
        this.game = game;
    }

    public int getSecond() {
        return time % 60;
    }

    public int getMinute() {
        return time / 60;
    }


    public void startTimer() {
        new BukkitRunnable() {
            @Override
            public void run() {
                time++;
                coinchestfarm();
                gameEnd();
            }
        }.runTaskTimer(main, 0, 20);
    }

    public void coinchestfarm() {
        Chest chestt1 = (Chest) game.getMap().getChest().get(0).getBlock().getState();
        Chest chestt2 = (Chest) game.getMap().getChest().get(1).getBlock().getState();
        ItemStack coinst1 = CustomItem.getCoins().clone();
        coinst1.setAmount(game.getTeam1().getFarmer());
        ItemStack coinst2 = CustomItem.getCoins().clone();
        coinst2.setAmount(game.getTeam2().getFarmer());
        count++;
        if (count % 3 == 0) {
            chestt1.getBlockInventory().addItem(coinst1);
            chestt2.getBlockInventory().addItem(coinst2);
        }
    }

    public void gameEnd() {
        if (game.isStarted()) {
            if (game.getTeam1().getScore() >= 1000) {
                Location loc1 = new Location(Bukkit.getWorld("world"), 175, 96, -155);
                Location loc2 = new Location(Bukkit.getWorld("world"), 175, 96, -51);
                game.setStarted(false);
                for (Player player : game.getTeam1().getPlayers()) {
                    player.sendTitle("YOU WIN", "", 10, 60, 10);
                }
                for (Player player : game.getTeam2().getPlayers()) {
                    player.sendTitle("YOU LOSE", "", 10, 60, 10);
                    player.teleport(loc2);
                }
            }
            if (game.getTeam2().getScore() >= 1000) {
                Location loc1 = new Location(Bukkit.getWorld("world"), 175, 96, -155);
                Location loc2 = new Location(Bukkit.getWorld("world"), 175, 96, -51);
                game.setStarted(false);
                for (Player player : game.getTeam2().getPlayers()) {
                    player.sendTitle("YOU WIN", "", 10, 60, 10);
                }
                for (Player player : game.getTeam1().getPlayers()) {
                    player.sendTitle("YOU LOSE", "", 10, 60, 10);
                    player.teleport(loc1);
                }
            }
        }
    }

}
