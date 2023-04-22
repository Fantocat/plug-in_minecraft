package fr.fanto.monsterindustries.listener;

import fr.fanto.monsterindustries.utils.CustomItem;
import fr.fanto.monsterindustries.gameclass.Game;
import fr.fanto.monsterindustries.utils.VillagerInventory;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.Attachable;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.material.Button;
import org.bukkit.inventory.ItemStack;

import java.awt.*;

public class TeamListener implements Listener {

    private final Game game;
    private final VillagerInventory villagerInventory;

    private boolean spider1t1 = false;
    private boolean spider2t1 = false;
    private boolean spider3t1 = false;
    private boolean spider1t2 = false;
    private boolean spider2t2 = false;
    private boolean spider3t2 = false;


    public TeamListener(Game game, VillagerInventory villagerInventory) {
        this.game = game;
        this.villagerInventory = villagerInventory;
    }

    @EventHandler
    public void onLootEvent(PlayerInteractEvent event) {
        Block item = event.getClickedBlock();
        Player player = event.getPlayer();
        ItemStack coins64 = CustomItem.getCoins().clone();
        coins64.setAmount(64);

        if (item == null) return;

        if (event.getAction() == Action.PHYSICAL) {

            if (item.getType() == Material.OAK_PRESSURE_PLATE) {
                if (game.getMap().getFarmPlatesCoins().contains(item.getLocation())) {
                    player.getInventory().addItem(CustomItem.getCoins());
                }
                if (game.getMap().getFarmPlatesT1().get(0).equals(item.getLocation())) {
                    player.getInventory().addItem(new ItemStack(Material.BONE, game.getTeam1().getBoneFarm()));
                }
                if (game.getMap().getFarmPlatesT2().get(0).equals(item.getLocation())) {
                    player.getInventory().addItem(new ItemStack(Material.BONE, game.getTeam2().getBoneFarm()));
                }
                if (game.getMap().getFarmPlatesT1().get(4).equals(item.getLocation())) {
                    spider1t1 = true;
                    spidertestt1(player);
                }
                if (game.getMap().getFarmPlatesT2().get(4).equals(item.getLocation())) {
                    spider1t2 = true;
                    spidertestt2(player);
                }
                if (game.getMap().getFarmPlatesT1().get(5).equals(item.getLocation())) {
                    spider2t1 = true;
                    spidertestt1(player);
                }
                if (game.getMap().getFarmPlatesT2().get(5).equals(item.getLocation())) {
                    spider2t2 = true;
                    spidertestt2(player);
                }
                if (game.getMap().getFarmPlatesT1().get(6).equals(item.getLocation())) {
                    spider3t1 = true;
                    spidertestt1(player);
                }
                if (game.getMap().getFarmPlatesT2().get(6).equals(item.getLocation())) {
                    spider3t2 = true;
                    spidertestt2(player);
                }
                if (game.getMap().getFarmPlatesT1().get(3).equals(item.getLocation())) {
                    player.getInventory().addItem(new ItemStack(Material.GUNPOWDER, game.getTeam1().getGunPowderFarm()));
                }
                if (game.getMap().getFarmPlatesT2().get(3).equals(item.getLocation())) {
                    player.getInventory().addItem(new ItemStack(Material.GUNPOWDER, game.getTeam2().getGunPowderFarm()));
                }
            }
        }
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (item.getType() == Material.OAK_BUTTON) {
                if (game.getMap().getFarmPlatesT1().get(2).equals(item.getLocation()) || game.getMap().getFarmPlatesT2().get(2).equals(item.getLocation())) {
                    player.getInventory().addItem(new ItemStack(Material.BLAZE_ROD, game.getTeamOf(player).getBlazeFarm()));
                }
            }
        }
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (game.getMap().getTeamButton().get(0).equals(item.getLocation())) {
                if (game.getTeam1().getPlayers().contains(player)) {
                    player.sendMessage("§cVous êtes déjà dans cette équipe !");
                } else {
                    game.getTeam1().addPlayer(player);
                    if (game.getTeam2().getPlayers().contains(player)) {
                        game.getTeam2().removePlayer(player);
                    }
                    player.sendMessage("§aVous avez rejoint l'équipe §6§l" + game.getTeam1().getName());
                    player.setPlayerListName(ChatColor.GREEN + player.getName());
                    player.setDisplayName(ChatColor.GREEN + player.getName());
                }
            }
            if (game.getMap().getTeamButton().get(1).equals(item.getLocation())) {
                if (game.getTeam2().getPlayers().contains(player)) {
                    player.sendMessage("§cVous êtes déjà dans cette équipe !");
                } else {
                    game.getTeam2().addPlayer(player);
                    if (game.getTeam1().getPlayers().contains(player)) {
                        game.getTeam1().removePlayer(player);
                    }
                    player.sendMessage("§aVous avez rejoint l'équipe §6§l" + game.getTeam2().getName());
                    player.setPlayerListName(ChatColor.YELLOW + player.getName());
                    player.setDisplayName(ChatColor.YELLOW + player.getName());
                }
            }
            if (game.getMap().getSignlvl1().get(0).equals(item.getLocation())) {
                if (contains4stacks(player)) {
                    player.getInventory().removeItem(coins64, coins64, coins64, coins64);
                    for (Location location : game.getMap().getBarrierlvl1T1()) {
                        location.getBlock().setType(Material.AIR);
                    }
                    game.getMap().getSignlvl1().get(0).getBlock().setType(Material.AIR);
                }
            }
            if (game.getMap().getSignlvl1().get(1).equals(item.getLocation())) {
                if (contains5stacks(player)) {
                    player.getInventory().removeItem(coins64, coins64, coins64, coins64);
                    for (Location location : game.getMap().getBarrierlvl1T2()) {
                        location.getBlock().setType(Material.AIR);
                    }
                    game.getMap().getSignlvl1().get(1).getBlock().setType(Material.AIR);
                }
            }
            if (game.getMap().getSignlvl2().get(0).equals(item.getLocation())) {
                if (contains5stacks(player)) {
                    player.getInventory().removeItem(coins64, coins64, coins64, coins64);
                    for (Location location : game.getMap().getBarrierlvl2T1()) {
                        location.getBlock().setType(Material.AIR);
                    }
                    game.getMap().getSignlvl2().get(0).getBlock().setType(Material.AIR);
                }
            }
            if (game.getMap().getSignlvl2().get(1).equals(item.getLocation())) {
                if (contains5stacks(player)) {
                    player.getInventory().removeItem(coins64, coins64, coins64, coins64);
                    for (Location location : game.getMap().getBarrierlvl2T2()) {
                        location.getBlock().setType(Material.AIR);
                    }
                    game.getMap().getSignlvl2().get(1).getBlock().setType(Material.AIR);
                }
            }
        }
    }

    @EventHandler
    public void onVillagerInteractEvent(PlayerInteractEntityEvent event) {

        if(event.getRightClicked().getType() != EntityType.VILLAGER) return;

        Player player = event.getPlayer();
        Entity entity = event.getRightClicked();


        if (entity.getType() == EntityType.VILLAGER) {
            if (game.getMap().getPnjT1().get(6).equals(entity.getLocation())) {
                player.openInventory(villagerInventory.getPnjSlaveT1());
                event.setCancelled(true);
            }

            if (game.getMap().getPnjT2().get(6).equals(entity.getLocation())) {
                player.openInventory(villagerInventory.getPnjSlaveT2());
                event.setCancelled(true);
            }

            if (game.getMap().getPnjT1().get(8).equals(entity.getLocation())) {
                player.openInventory(villagerInventory.getPnjUpgradeT1());
                event.setCancelled(true);
            }

            if (game.getMap().getPnjT2().get(8).equals(entity.getLocation())) {
                player.openInventory(villagerInventory.getPnjUpgradeT2());
                event.setCancelled(true);
            }

            if (game.getMap().getPnjT1().get(7).equals(entity.getLocation())) {
                player.openInventory(villagerInventory.getPnjCapacityT1());
                event.setCancelled(true);
            }

            if (game.getMap().getPnjT2().get(7).equals(entity.getLocation())) {
                player.openInventory(villagerInventory.getPnjCapacityT2());
                event.setCancelled(true);
            }
        }
    }

    public void spidertestt1(Player player) {
        if (spider1t1 && spider2t1 && spider3t1) {
            player.getInventory().addItem(new ItemStack(Material.SPIDER_EYE, game.getTeam1().getSpiderFarm()));
            spider1t1 = false;
            spider2t1 = false;
            spider3t1 = false;
        }
    }

    public void spidertestt2(Player player) {
        if (spider1t2 && spider2t2 && spider3t2) {
            player.getInventory().addItem(new ItemStack(Material.SPIDER_EYE, game.getTeam1().getSpiderFarm()));
            spider1t2 = false;
            spider2t2 = false;
            spider3t2 = false;
        }
    }

    public boolean contains4stacks(Player player) {
        int count = 0;
        ItemStack itemCoins = CustomItem.getCoins().clone();
        itemCoins.setAmount(64);
        for (ItemStack item : player.getInventory().getContents()) {
            if (item != null && item.equals(itemCoins)) {
                count += item.getAmount();
            }
        }
        return count >= 4;
    }

    public boolean contains5stacks(Player player) {
        int count = 0;
        ItemStack itemCoins = CustomItem.getCoins().clone();
        itemCoins.setAmount(64);
        for (ItemStack item : player.getInventory().getContents()) {
            if (item != null && item.equals(itemCoins)) {
                count += item.getAmount();
            }
        }
        return count >= 5;
    }
}
