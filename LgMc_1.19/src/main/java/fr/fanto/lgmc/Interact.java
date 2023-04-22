package fr.fanto.lgmc;

import fr.fanto.lgmc.item.Item;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.Levelled;
import org.bukkit.craftbukkit.v1_19_R1.entity.CraftItem;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;

public class Interact implements Listener {


    //----------------variable pour le beugue du clic droit


    //event test clic droit arc cupidon
    //clicdroit une seul ouverture


    @EventHandler
    public void testCu(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack it = event.getItem();
        Action act = event.getAction();
        if (act == Action.RIGHT_CLICK_AIR || act == Action.RIGHT_CLICK_BLOCK) {

            if (it != null && it.getItemMeta().getDisplayName().equalsIgnoreCase(Item.getCupidonN().getItemMeta().getDisplayName())) {

                player.openInventory(Inventaire.getInvcuN1());

            }

        }
    }

    //----------------------ANNULER LE DROP DES ITEMS

    @EventHandler
    public void onDropItemClass(PlayerDropItemEvent e) {
        Player player = (Player) e.getPlayer();
        ItemStack it = e.getItemDrop().getItemStack();

        if (it == null) return;
        //-------------------------------ANNULATION au DisplayName pour annuler tout les Types d'item de classe
        //----------------------------comparaison par rapport au item nuit puisque meme nom jour et nuit
        if (it.getItemMeta().getDisplayName().equalsIgnoreCase(Item.getCupidonN().getItemMeta().getDisplayName())) {
            e.setCancelled(true);
            //CDDropCu = false;
        }

        if (it.getItemMeta().getDisplayName().equalsIgnoreCase(Item.getChasseurN().getItemMeta().getDisplayName())) {
            e.setCancelled(true);
        }

        if (it.getItemMeta().getDisplayName().equalsIgnoreCase(Item.getVoyanteN().getItemMeta().getDisplayName())) {
            e.setCancelled(true);
        }

        if (it.getItemMeta().getDisplayName().equalsIgnoreCase(Item.getSorciereN().getItemMeta().getDisplayName())) {
            e.setCancelled(true);

        }

        if (it.getItemMeta().getDisplayName().equalsIgnoreCase(Item.getPetiteFilleN().getItemMeta().getDisplayName())) {
            e.setCancelled(true);

        }

        if (it.getItemMeta().getDisplayName().equalsIgnoreCase(Item.getLoupGarouN().getItemMeta().getDisplayName())) {
            e.setCancelled(true);

        }


    }

    //------------------------------Changement des loots des blocs
    @EventHandler
    public void onblocclearloot(BlockBreakEvent e) {
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), null);
    }

    //--------------------------------------creation du couple
    //variable de l'event
    Player membre1 = null;
    Player membre2 = null;
    int nbCouple = 0;
    ItemStack current2 = null;
    boolean creationcouple = false;

    //------------------------------------Event creation de couple
    @EventHandler
    public void onCLickCu(InventoryClickEvent event) {

        Inventory inv = event.getInventory();
        Player player = (Player) event.getWhoClicked();
        ItemStack current = event.getCurrentItem();
        InventoryAction act = event.getAction();
        SkullMeta head;
        String name;

        if (current == null) return;
        if (creationcouple == false) {
            if (inv == Inventaire.getInvcuN1()) {
                event.setCancelled(true);


                if (act == InventoryAction.PICKUP_HALF || act == InventoryAction.PICKUP_ALL) {

                    if (current.getType() == Material.PLAYER_HEAD) {

                        head = (SkullMeta) current.getItemMeta();
                        name = head.getOwner();

                        for (Player plr : Bukkit.getServer().getOnlinePlayers()) {

                            if (name.equalsIgnoreCase(plr.getName())) {

                                player.closeInventory();
                                player.openInventory(Inventaire.getValidation());
                                if (nbCouple == 0) {
                                    membre1 = plr;
                                }
                                if (nbCouple == 1) {
                                    membre2 = plr;
                                }
                                current2 = current;

                            }
                        }
                    }
                }
            }
        }

        if (inv == Inventaire.getValidation()) {
            event.setCancelled(true);
            if (act == InventoryAction.PICKUP_HALF || act == InventoryAction.PICKUP_ALL) {
                if (current.getType() == Material.GREEN_WOOL) {
                    Inventaire.getInvcuN1().removeItem(current2);
                    player.closeInventory();
                    nbCouple++;
                    if (nbCouple < 2) {
                        player.openInventory(Inventaire.getInvcuN1());
                    } else { //tout les action en dessous ce font si le groupe est bien formé
                        role.couple.put(membre1, true);
                        role.couple.put(membre2, true);
                        player.sendMessage("Le couple formé est " + membre1.getName() + " et " + membre2.getName());
                        creationcouple = true;
                    }
                }
                if (current.getType() == Material.RED_WOOL) {
                    player.closeInventory();
                    player.openInventory(Inventaire.getInvcuN1());
                    if (nbCouple == 0) {
                        membre1 = null;
                    }
                    if (nbCouple == 1) {
                        membre2 = null;
                    }
                }
            }
        }
    }


    //--------------------------------------Empecher le spawn des mob-------------------------------------------------
    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (event.getSpawnReason().equals(CreatureSpawnEvent.SpawnReason.NATURAL)) event.setCancelled(true);
    }

    //--------------------------------------Cancel Itemframe
    @EventHandler
    public void onItemFrame(EntityDamageEvent e) {
        if (e.getEntity() instanceof ItemFrame) e.setCancelled(true);
    }


    //-----------------------------------Creation Inventaire


    //---------------------------------- Give baton de la Sorcière

    @EventHandler
    public void onGiveItemSo(PlayerInteractEvent e) {

        if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (e.getClickedBlock().getType() == Material.WATER_CAULDRON) {
                ItemMeta test = e.getPlayer().getInventory().getItemInMainHand().getItemMeta();
                if (test == null) return;
                if (test.getDisplayName().equalsIgnoreCase(Item.getBatonSoN().getItemMeta().getDisplayName())) {
                    e.getClickedBlock().setType(Material.AIR);
                    e.getPlayer().getInventory().addItem(Item.getSorciereN());
                    e.getPlayer().getInventory().remove(Item.getBatonSoN());
                }
            }
        }
    }

    // Besoin de la location pour verif les recettes
    Location chaudron;

    //Give du baton de la sorciere
    @EventHandler
    public void onGiveBatonSo(BlockPlaceEvent e) {
        Block bloc = e.getBlock();
        if (e.getBlockPlaced().getType() == Item.getSorciereN().getType()) {
            e.getPlayer().getInventory().addItem(Item.getBatonSoN());
            chaudron = e.getBlockPlaced().getLocation();

            chaudron.getBlock().setType(Material.WATER_CAULDRON);

            Block yourCauldron = chaudron.getBlock();
            Levelled cauldronData = (Levelled) yourCauldron.getBlockData();
            cauldronData.setLevel(cauldronData.getMaximumLevel());
            yourCauldron.setBlockData(cauldronData);

        }
    }


    //Faire les recettes pour la sorciere ici
    @EventHandler
    public void onRecettePotion(PlayerInteractEvent e) {

        ArrayList<ItemStack> nearby;
        CraftItem c = null;
        ItemStack i = e.getItem();
        Action a = e.getAction();


        if (a == Action.LEFT_CLICK_AIR) {  // Click dans le vide
            if (i.equals(Item.getBatonSoN())) {
                for (Entity ent : e.getPlayer().getWorld().getNearbyEntities(chaudron, 1, 1, 1)) {
                    if (ent instanceof CraftItem) {
                        c = (CraftItem) ent;

                        if (c.getItemStack().getType() == Material.DIRT) {

                            ent.remove();
                            e.getPlayer().getInventory().addItem(Item.getPotionDeMortI());

                        }

                    }
                }
            }
        }
    }

    //------------------------------------Event chasseur
    @EventHandler
    public void testCh(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack it = event.getItem();
        Action act = event.getAction();
        if (act == Action.RIGHT_CLICK_AIR || act == Action.RIGHT_CLICK_BLOCK) {

            if (it != null && it.getItemMeta().getDisplayName().equalsIgnoreCase(Item.getChasseurN().getItemMeta().getDisplayName())) {

                player.openInventory(Inventaire.getInvchN1());

            }

        }
    }

    //------------------------------------Event amelioration chasseur

    @EventHandler
    public void onCLickCh(InventoryClickEvent event) {

        Inventory inv = event.getInventory();
        Player player = (Player) event.getWhoClicked();
        ItemStack current = event.getCurrentItem();
        InventoryAction act = event.getAction();

        if (current == null) return;

        if (inv == Inventaire.getInvchN1()) {
            event.setCancelled(true);


            if (act == InventoryAction.PICKUP_HALF || act == InventoryAction.PICKUP_ALL) {

                if (current.getType() == Material.IRON_SWORD) {
                    if (player.getInventory().contains(new ItemStack(Material.DIRT, 3))) {
                        Bukkit.broadcastMessage("test");
                        inv.setItem(9, Item.getDamageIIcht());
                    }

                } else if (current.getType() == Material.NETHERITE_SWORD) {

                } else if (current.getType() == Material.CROSSBOW) {

                } else if (current.getType() == Material.SPECTRAL_ARROW) {

                } else if (current.getType() == Material.ENDER_EYE) {

                }

            }
        }
    }
/*
        if (inv == Inventaire.getValidation()) {
            event.setCancelled(true);
            if (act == InventoryAction.PICKUP_HALF || act == InventoryAction.PICKUP_ALL) {
                if (current.getType() == Material.GREEN_WOOL) {
                    Inventaire.getInvcuN1().removeItem(current2);
                    player.closeInventory();
                    nbCouple++;
                    if (nbCouple < 2) {
                        player.openInventory(Inventaire.getInvcuN1());
                    } else { //tout les action en dessous ce font si le groupe est bien formé
                        role.couple.put(membre1, true);
                        role.couple.put(membre2, true);
                        player.sendMessage("Le couple formé est " + membre1.getName() + " et " + membre2.getName());
                        creationcouple = true;
                    }
                }
                if (current.getType() == Material.RED_WOOL) {
                    player.closeInventory();
                    player.openInventory(Inventaire.getInvcuN1());
                    if (nbCouple == 0) {
                        membre1 = null;
                    }
                    if (nbCouple == 1) {
                        membre2 = null;
                    }
                }
            }
        }
    }

 */


}
