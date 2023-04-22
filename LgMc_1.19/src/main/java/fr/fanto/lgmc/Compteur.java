package fr.fanto.lgmc;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class Compteur {


    private Plugin plugin;
    private int day;
    private boolean jour;
    private long temps;

    public Compteur(Plugin main) {
        this.plugin = main;
        this.day = 1;
        this.jour = true;
        this.temps = 0;
    }

    public Plugin getPlugin() {
        return plugin;
    }

    public void setPlugin(Plugin plugin) {
        this.plugin = plugin;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isJour() {
        return jour;
    }

    public void setJour(boolean jour) {
        this.jour = jour;
    }

    public long getTemps() {
        return temps;
    }

    public void setTemps(long temps) {
        this.temps = temps;
    }

    public void start() {
        BukkitTask temps = new BukkitRunnable() {

            @Override
            public void run() {

                if (getTemps() == 1) {

                    for (Player players : Bukkit.getOnlinePlayers()) {

                        players.sendTitle("Nuit " + getDay(), null, 20, 40, 20);
                        players.playSound(players.getLocation(), Sound.AMBIENT_CAVE, 2, 2);

                    }

                    setJour(false);
                }

                if (getTemps() % 600 == 0 && getTemps() != 0) {

                    if (getTemps() % 1200 == 0) {

                        setDay(getDay() + 1);

                        for (Player players : Bukkit.getOnlinePlayers()) {

                            players.sendTitle("Nuit " + getDay(), null, 20, 40, 20);
                            players.playSound(players.getLocation(), Sound.AMBIENT_CAVE, 2, 2);

                        }

                        setJour(false);

                    } else {

                        for (Player players : Bukkit.getOnlinePlayers()) {

                            players.sendTitle("Jour " + getDay(), null, 20, 40, 20);
                            players.playSound(players.getLocation(), Sound.ENTITY_CHICKEN_AMBIENT, 2, 2);
                            setJour(true);

                        }
                    }
                }
                setTemps(getTemps() + 1);
            }
        }.runTaskTimer(plugin, 0, 20);

    }


}
