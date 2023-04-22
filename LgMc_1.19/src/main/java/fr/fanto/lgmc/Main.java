package fr.fanto.lgmc;

import fr.fanto.lgmc.commands.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage("§2Le plugin c'est bien lance");


        getCommand("start").setExecutor(new Start(this));
        getCommand("lg").setExecutor(new Lg());
        getCommand("ch").setExecutor(new Ch());
        getCommand("cu").setExecutor(new Cu());
        getCommand("pf").setExecutor(new Pf());
        getCommand("so").setExecutor(new So());
        getCommand("vo").setExecutor(new Vo());
        getCommand("co").setExecutor(new Co());

        Bukkit.getServer().getPluginManager().registerEvents(new Interact(), this);

        Inventaire.init();
        super.onEnable();
    }

    @Override
    public void onDisable() {


        super.onDisable();
    }
}
