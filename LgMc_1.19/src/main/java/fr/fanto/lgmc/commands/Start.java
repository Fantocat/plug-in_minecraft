package fr.fanto.lgmc.commands;

import fr.fanto.lgmc.*;
import fr.fanto.lgmc.item.Item;
import fr.fanto.lgmc.Main;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.util.ArrayList;
import java.util.Random;

public class Start implements CommandExecutor {

    static private Plugin main1;
    private double dpt = 5;
    private int test;



    ArrayList<Player> allPlayers = new ArrayList<Player>();
    static ArrayList<Player> allLg = new ArrayList<Player>();

    public Start(Main main) {
        this.main1 = main;
        this.dpt = 6;

    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        //------------les trucs a faire au démarage d'une game

        Player player = (Player)commandSender;
        listeall();
        randomch();


        //Bukkit.broadcastMessage(player.getWorld().getBlockAt(player.getLocation()).getState().getBlockData().getAsString());
        //Compte a rebour

        BukkitTask depart = new BukkitRunnable() {

            @Override
            public void run() {

                if (dpt >= 1) {
                    for (Player players : allPlayers) {
                        players.sendTitle("§4"+(int)(dpt-1),"",5,10,5);
                    }
                    dpt--;
                }

                if (dpt == 0) {
                    for (Player players : allPlayers) {
                        players.sendTitle("GlHf","",5,10,5);
                        //players.playEffect(EntityEffect.);
                    }
                    player.getLocation().getWorld().setTime(13000);
                    randomGeneral();
                    Compteur temps = new Compteur(main1);
                    temps.start();
                    cancel();

                }


            }
        }.runTaskTimer(main1, 0, 20);






        return true;

    }


    public void listeall(){         //liste les player et fait les action de base sur les joueur
        for(Player players : Bukkit.getOnlinePlayers()) {
            allPlayers.add(players);
            players.setGameMode(GameMode.ADVENTURE);
            players.setHealth(20);
            players.setFoodLevel(20);
            players.getInventory().clear();
            
        }
    }

    public void randomGeneral(){       //ramdom toute les classes A Lier avec le config
        //randomcu();
        //randomch();
        //randompf();
        randomso();
        //randomvo();
        //randomlg();
    }



    public void randomlg(){

        int random = new Random().nextInt(allPlayers.size());
        Player picked = allPlayers.get(random);
        role.loupGarou.put(picked, true);
        allLg.add(picked);
        allPlayers.remove(picked);
        picked.sendMessage("Tu es un §4LoupGarou§r, ton but dans cette partie est de tuer les villageois. Si tu as " +
                "besoin de plus d'information tape '/lg'");
        picked.sendTitle("§4Loup",null,10,40,10);
        Item.setItem(picked,Item.getLoupGarouN(),22,Item.getLoupGarouJ());
        Item.setItem(picked,Item.getPioche(),1,null);

    }

    public void randomch(){

        int random = new Random().nextInt(allPlayers.size());
        Player picked = allPlayers.get(random);
        role.chasseur.put(picked, true);
        allPlayers.remove(picked);
        picked.sendMessage("Tu es le §2Chasseur§r, ton but dans cette partie est de gagner avec le village. Si tu as " +
                "besoin de plus d'information tape '/ch'");
        picked.sendTitle("§2Chasseur",null,10,40,10);
        Item.setItem(picked,Item.getChasseurN(),22,Item.getChasseurJ());
        Item.setItem(picked,Item.getChasseurJ(),23,Item.getChasseurJ());
        Item.setItem(picked,Item.getPioche(),1,null);

    }

    public void randomcu(){

        int random = new Random().nextInt(allPlayers.size());
        Player picked = allPlayers.get(random);
        role.cupidon.put(picked, true);
        allPlayers.remove(picked);
        picked.sendMessage("Tu es §dCupidon§r, ton but dans cette partie est de gagner avec le village ou de gagner " +
                "avec le couple (plus dure mais plus fun). Si tu as besoin de plus d'information tape '/cu'");
        picked.sendTitle("§dCupidon",null,10,40,10);
        Item.setItem(picked,Item.getCupidonN(),22,Item.getCupidonJ());
        Item.setItem(picked,Item.getPioche(),1,null);

    }

    public void randompf(){

        int random = new Random().nextInt(allPlayers.size());
        Player picked = allPlayers.get(random);
        role.petiteFille.put(picked, true);
        allPlayers.remove(picked);
        picked.sendMessage("Tu es la §bpetiteFille§r, ton but dans cette partie est de gagner avec le village. Si tu " +
                "as besoin de plus d'information tape '/pf'");
        picked.sendTitle("§bPetite Fille",null,10,40,10);
        Item.setItem(picked,Item.getPetiteFilleN(),22,Item.getPetiteFilleJ());
        Item.setItem(picked,Item.getPioche(),1,null);
        Item.setItem(picked,Item.getBleNoir(),2,null);
        Item.setItem(picked,Item.getRouleCanelle(),3,null);
        Item.setItem(picked,Item.getBatonDeCanelle(),4,null);
        Item.setItem(picked,Item.getBaveDeGhast(),5,null);
        Item.setItem(picked,Item.getBoisDeCanelle(),6,null);

    }

    public void randomso(){

        int random = new Random().nextInt(allPlayers.size());
        Player picked = allPlayers.get(random);
        role.sorciere.put(picked, true);
        allPlayers.remove(picked);
        picked.sendMessage("Tu es la §6Sorcière§r, ton but dans cette partie est de gagner avec le village. Si tu as " +
                "besoin de plus d'information tape '/so'");
        picked.sendTitle("§6Sorcière",null,10,40,10);
        Item.setItem(picked, Item.getSorciereN(), 22,null);
        Item.setItem(picked,Item.getPioche(),1,null);
        Item.setItem(picked,Item.getBleNoir(),2,null);
        Item.setItem(picked,Item.getRouleCanelle(),3,null);
        Item.setItem(picked,Item.getBatonDeCanelle(),4,null);
        Item.setItem(picked,Item.getBaveDeGhast(),5,null);
        Item.setItem(picked,Item.getBoisDeCanelle(),6,null);

    }

    public void randomvo(){

        int random = new Random().nextInt(allPlayers.size());
        Player picked = allPlayers.get(random);
        role.voyante.put(picked, true);
        allPlayers.remove(picked);
        picked.sendMessage("Tu es la §5Voyante§r, ton but dans cette partie est de gagner avec le village. Si tu as " +
                "besoin de plus d'information tape '/vo'");
        picked.sendTitle("§5Voyante",null,10,40,10);
        Item.setItem(picked,Item.getVoyanteN(),22,Item.getVoyanteJ());
        Item.setItem(picked,Item.getPioche(),1,null);

    }

    public void randomsv(){

        int random = new Random().nextInt(allPlayers.size());
        Player picked = allPlayers.get(random);
        role.simpleVillageois.put(picked, true);
        allPlayers.remove(picked);
        picked.sendMessage("Tu es un §4 SimpleVillageois §r, ton but dans cette partie est de gagner avec le village." +
                " Si tu as besoin de plus d'information, bah t'en a pas besoin ");
        picked.sendTitle("§7Villageois",null,10,40,10);
        Item.setItem(picked,Item.getPioche(),1,null);

    }






}
