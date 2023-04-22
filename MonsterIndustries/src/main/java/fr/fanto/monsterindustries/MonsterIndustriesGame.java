package fr.fanto.monsterindustries;

import fr.fanto.monsterindustries.gsonUtils.MapSerializationManager;
import fr.fanto.monsterindustries.listener.InventoryListener;
import fr.fanto.monsterindustries.listener.MainListener;
import fr.fanto.monsterindustries.listener.TeamListener;
import fr.fanto.monsterindustries.commands.*;
import fr.fanto.monsterindustries.utils.CustomItem;
import fr.fanto.monsterindustries.utils.Scoreboard;
import fr.fanto.monsterindustries.utils.Timer;
import fr.fanto.monsterindustries.gameclass.Game;
import fr.fanto.monsterindustries.gameclass.GameTeam;
import fr.fanto.monsterindustries.gameclass.Map;
import fr.fanto.monsterindustries.gameclass.TeamName;
import fr.fanto.monsterindustries.utils.VillagerInventory;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class MonsterIndustriesGame extends JavaPlugin {

    /*
    Probleme que j'ai eu la flemme de changer
    - Le nom des map est en uuid
    - save une map ne clear que le getMapName()
    - obbligé de rl le plugin pour reset des coordonées car les attribut reste à leur valeur
    - on ne peut pas creer de map si on a pas save celle d'avant
    - le systeme de setpoint pue la merde
    - on ne peut pas delete de map sans acceder au fichier
    - si on creer une map avec un nom deja pris ca va overwritte la map
    - non possibilité d'avoir des joueur qui ne joues pas
    - on peut pas set la couleur de la team sans passer par le fichier
    - creer 6 methodes dans setCommand pour faire propre
    - pas de bouton start dans une Map
    - on peut load une map sur un map deja load
    - on peut lancer la game meme si la map n'est pas load
    -poser les oeauf en aventure
    -les point ne compte pas temps que la game n'a pas commencé
    -spawn au spawn quand la game a pas commencé
    -se co en spectateur
    -prbleme sur upgrade spider eye
    -baisser le prix de la bouffe
    -baisser la saturation
    -baisser le loot des pnj marchants
    -mettre en survie et on clic gauche cancel
    -capa marche pas
     */



    @Override
    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage("§2Le plugin c'est bien lance");


        MapSerializationManager mapManager = new MapSerializationManager();
        Map map = new Map();

        CustomItem customItem = new CustomItem();
        customItem.init();

        VillagerInventory villagerInventory = new VillagerInventory();
        villagerInventory.init();

        GameTeam gameTeam1 = new GameTeam(ChatColor.GREEN,TeamName.SLIME_INDUSTRIES);
        GameTeam gameTeam2 = new GameTeam(ChatColor.GOLD,TeamName.MAGMA_CORP);


        Game game = new Game(gameTeam1, gameTeam2, map);
        Timer t1 = new Timer(this, game);
        Scoreboard scoreboard = new Scoreboard(game, t1, this);

        getCommand("start").setExecutor(new StartCommand(this, game,scoreboard, t1));
        getCommand("restart").setExecutor(new RestartCommand(this));
        getCommand("pause").setExecutor(new PauseCommand(this));
        getCommand("random").setExecutor(new RandomTeamCommand(this, game));
        getCommand("create").setExecutor(new CreateCommand(game));
        getCommand("load").setExecutor(new LoadCommand(game, mapManager));
        getCommand("save").setExecutor(new SaveCommand(game, mapManager));
        getCommand("set").setExecutor(new SetCommand(game));

        Bukkit.getServer().getPluginManager().registerEvents(new MainListener(game), this);
        Bukkit.getServer().getPluginManager().registerEvents(new TeamListener(game,villagerInventory), this);
        Bukkit.getServer().getPluginManager().registerEvents(new InventoryListener(villagerInventory,game), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
