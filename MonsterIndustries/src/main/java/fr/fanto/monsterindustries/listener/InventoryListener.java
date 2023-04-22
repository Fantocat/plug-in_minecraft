package fr.fanto.monsterindustries.listener;

import fr.fanto.monsterindustries.gameclass.Game;
import fr.fanto.monsterindustries.gameclass.GameTeam;
import fr.fanto.monsterindustries.utils.CustomItem;
import fr.fanto.monsterindustries.utils.VillagerInventory;
import net.md_5.bungee.api.chat.hover.content.Item;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Team;

public class InventoryListener implements Listener {

    private final VillagerInventory villagerInventory;
    private final Game game;

    public InventoryListener(VillagerInventory villagerInventory, Game game) {
        this.villagerInventory = villagerInventory;
        this.game = game;
    }

    @EventHandler
    public void onInventoryInteractEvent(InventoryClickEvent event) {
        Inventory inventory = event.getInventory();
        ItemStack item = event.getCurrentItem();
        Player player = (Player) event.getWhoClicked();
        ItemStack coins64 = CustomItem.getCoins().clone();
        coins64.setAmount(64);
        if (inventory == null) return;
        if (item == null) return;

        if (inventory.equals(villagerInventory.getPnjSlaveT1())) {
            if (item.equals(CustomItem.getJackiecoal())) {
                if (contains2stacks(player)) {
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    ItemStack jackiecoalup = CustomItem.getJackiecoal().clone();
                    ItemMeta jackiecoalupmeta = jackiecoalup.getItemMeta();
                    jackiecoalupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                    jackiecoalupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    jackiecoalup.setItemMeta(jackiecoalupmeta);
                    villagerInventory.getPnjSlaveT1().setItem(2, jackiecoalup);
                    GameTeam team = game.getTeamOf(player);
                    team.setFarmer(team.getFarmer() + 1);
                } else {
                    event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                }
            }
            if (item.equals(CustomItem.getFrankyiron())) {
                if (contains2stacks(player)) {
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    ItemStack frankyironup = CustomItem.getFrankyiron().clone();
                    ItemMeta frankyironupmeta = frankyironup.getItemMeta();
                    frankyironupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                    frankyironupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    frankyironup.setItemMeta(frankyironupmeta);
                    villagerInventory.getPnjSlaveT1().setItem(3, frankyironup);
                    GameTeam team = game.getTeamOf(player);
                    team.setFarmer(team.getFarmer() + 1);
                } else {
                    event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                }
            }
            if (item.equals(CustomItem.getBenoitredstone())) {
                if (contains2stacks(player)) {
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    ItemStack benoitredstoneup = CustomItem.getBenoitredstone().clone();
                    ItemMeta benoitredstoneupmeta = benoitredstoneup.getItemMeta();
                    benoitredstoneupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                    benoitredstoneupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    benoitredstoneup.setItemMeta(benoitredstoneupmeta);
                    villagerInventory.getPnjSlaveT1().setItem(4, benoitredstoneup);
                    GameTeam team = game.getTeamOf(player);
                    team.setFarmer(team.getFarmer() + 1);
                } else {
                    event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                }
            }
            if (item.equals(CustomItem.getDidierlapis())) {
                if (contains2stacks(player)) {
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    ItemStack didierlapisup = CustomItem.getDidierlapis().clone();
                    ItemMeta didierlapisupmeta = didierlapisup.getItemMeta();
                    didierlapisupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                    didierlapisupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    didierlapisup.setItemMeta(didierlapisupmeta);
                    villagerInventory.getPnjSlaveT1().setItem(5, didierlapisup);
                    GameTeam team = game.getTeamOf(player);
                    team.setFarmer(team.getFarmer() + 1);
                } else {
                    event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                }
            }
            if (item.equals(CustomItem.getFrancoisdiamond())) {
                if (contains2stacks(player)) {
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    ItemStack francoisdiamondup = CustomItem.getFrancoisdiamond().clone();
                    ItemMeta francoisdiamondupmeta = francoisdiamondup.getItemMeta();
                    francoisdiamondupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                    francoisdiamondupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    francoisdiamondup.setItemMeta(francoisdiamondupmeta);
                    villagerInventory.getPnjSlaveT1().setItem(6, francoisdiamondup);
                    GameTeam team = game.getTeamOf(player);
                    team.setFarmer(team.getFarmer() + 1);
                } else {
                    event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                }
            }
            event.setCancelled(true);
        }
        if (inventory.equals(villagerInventory.getPnjSlaveT2())) {
            if (item.equals(CustomItem.getJackiecoal())) {
                if (contains2stacks(player)) {
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    ItemStack jackiecoalupup = CustomItem.getJackiecoal().clone();
                    ItemMeta jackiecoalupupmeta = jackiecoalupup.getItemMeta();
                    jackiecoalupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                    jackiecoalupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    jackiecoalupup.setItemMeta(jackiecoalupupmeta);
                    villagerInventory.getPnjSlaveT2().setItem(2, jackiecoalupup);
                    GameTeam team = game.getTeamOf(player);
                    team.setFarmer(team.getFarmer() + 1);
                } else {
                    event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                }
            }
            if (item.equals(CustomItem.getFrankyiron())) {
                if (contains2stacks(player)) {
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    ItemStack frankyironupup = CustomItem.getFrankyiron().clone();
                    ItemMeta frankyironupupmeta = frankyironupup.getItemMeta();
                    frankyironupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                    frankyironupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    frankyironupup.setItemMeta(frankyironupupmeta);
                    villagerInventory.getPnjSlaveT2().setItem(3, frankyironupup);
                    GameTeam team = game.getTeamOf(player);
                    team.setFarmer(team.getFarmer() + 1);
                } else {
                    event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                }
            }
            if (item.equals(CustomItem.getBenoitredstone())) {
                if (contains2stacks(player)) {
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    ItemStack benoitredstoneupup = CustomItem.getBenoitredstone().clone();
                    ItemMeta benoitredstoneupupmeta = benoitredstoneupup.getItemMeta();
                    benoitredstoneupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                    benoitredstoneupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    benoitredstoneupup.setItemMeta(benoitredstoneupupmeta);
                    villagerInventory.getPnjSlaveT2().setItem(4, benoitredstoneupup);
                    GameTeam team = game.getTeamOf(player);
                    team.setFarmer(team.getFarmer() + 1);
                } else {
                    event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                }
            }
            if (item.equals(CustomItem.getDidierlapis())) {
                if (contains2stacks(player)) {
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    ItemStack didierlapisupup = CustomItem.getDidierlapis().clone();
                    ItemMeta didierlapisupupmeta = didierlapisupup.getItemMeta();
                    didierlapisupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                    didierlapisupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    didierlapisupup.setItemMeta(didierlapisupupmeta);
                    villagerInventory.getPnjSlaveT2().setItem(5, didierlapisupup);
                    GameTeam team = game.getTeamOf(player);
                    team.setFarmer(team.getFarmer() + 1);
                } else {
                    event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                }
            }
            if (item.equals(CustomItem.getFrancoisdiamond())) {
                if (contains2stacks(player)) {
                    event.getWhoClicked().getInventory().removeItem(coins64);
                    ItemStack francoisdiamondupup = CustomItem.getFrancoisdiamond().clone();
                    ItemMeta francoisdiamondupupmeta = francoisdiamondupup.getItemMeta();
                    francoisdiamondupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                    francoisdiamondupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    francoisdiamondupup.setItemMeta(francoisdiamondupupmeta);
                    villagerInventory.getPnjSlaveT2().setItem(6, francoisdiamondupup);
                    GameTeam team = game.getTeamOf(player);
                    team.setFarmer(team.getFarmer() + 1);
                } else {
                    event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                }
            }
            event.setCancelled(true);
        }
        if (inventory.equals(villagerInventory.getPnjUpgradeT1())) {
            if (item.equals(CustomItem.getBone2())) {
                if (game.getTeamOf(player).getBoneFarm() == 1) {
                    if (contains2stacks(player)) {
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        ItemStack boneupup = CustomItem.getBone2().clone();
                        ItemMeta boneupupmeta = boneupup.getItemMeta();
                        boneupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        boneupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        boneupup.setItemMeta(boneupupmeta);
                        villagerInventory.getPnjUpgradeT1().setItem(2, boneupup);
                        GameTeam team = game.getTeamOf(player);
                        team.setBoneFarm(team.getBoneFarm() + 1);
                    } else {
                        event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                    }
                } else {
                    event.getWhoClicked().sendMessage("§cVous ne pouvez pas faire ça!");
                }
            }
            if (item.equals(CustomItem.getBone3())) {
                if (game.getTeamOf(player).getBoneFarm() == 2) {
                    if (contains2stacks(player)) {
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        ItemStack coalupup = CustomItem.getBone3().clone();
                        ItemMeta coalupupmeta = coalupup.getItemMeta();
                        coalupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        coalupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        coalupup.setItemMeta(coalupupmeta);
                        villagerInventory.getPnjUpgradeT1().setItem(3, coalupup);
                        GameTeam team = game.getTeamOf(player);
                        team.setBoneFarm(team.getBoneFarm() + 1);
                    } else {
                        event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                    }
                } else {
                    event.getWhoClicked().sendMessage("§cVous ne pouvez pas faire ça!");
                }
            }
            if (item.equals(CustomItem.getBlaze2())) {
                if (game.getTeamOf(player).getBlazeFarm() == 1) {
                    if (contains2stacks(player)) {
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        ItemStack ironupup = CustomItem.getBlaze2().clone();
                        ItemMeta ironupupmeta = ironupup.getItemMeta();
                        ironupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        ironupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        ironupup.setItemMeta(ironupupmeta);
                        villagerInventory.getPnjUpgradeT1().setItem(6, ironupup);
                        GameTeam team = game.getTeamOf(player);
                        team.setBlazeFarm(team.getBlazeFarm() + 1);
                    } else {
                        event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                    }
                } else {
                    event.getWhoClicked().sendMessage("§cVous ne pouvez pas faire ça!");
                }
            }
            if (item.equals(CustomItem.getBlaze3())) {
                if (game.getTeamOf(player).getBlazeFarm() == 2) {
                    if (contains2stacks(player)) {
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        ItemStack goldupup = CustomItem.getBlaze3().clone();
                        ItemMeta goldupupmeta = goldupup.getItemMeta();
                        goldupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        goldupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        goldupup.setItemMeta(goldupupmeta);
                        villagerInventory.getPnjUpgradeT1().setItem(7, goldupup);
                        GameTeam team = game.getTeamOf(player);
                        team.setBlazeFarm(team.getBlazeFarm() + 1);
                    } else {
                        event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                    }
                } else {
                    event.getWhoClicked().sendMessage("§cVous ne pouvez pas faire ça!");
                }
            }
            if (item.equals(CustomItem.getGunpowder2())) {
                if (game.getTeamOf(player).getGunPowderFarm() == 1) {
                    if (contains2stacks(player)) {
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        ItemStack diamondupup = CustomItem.getGunpowder2().clone();
                        ItemMeta diamondupupmeta = diamondupup.getItemMeta();
                        diamondupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        diamondupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        diamondupup.setItemMeta(diamondupupmeta);
                        villagerInventory.getPnjUpgradeT1().setItem(11, diamondupup);
                        GameTeam team = game.getTeamOf(player);
                        team.setGunPowderFarm(team.getGunPowderFarm() + 1);
                    } else {
                        event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                    }
                } else {
                    event.getWhoClicked().sendMessage("§cVous ne pouvez pas faire ça!");
                }
            }
            if (item.equals(CustomItem.getGunpowder3())) {
                if (game.getTeamOf(player).getGunPowderFarm() == 2) {
                    if (contains2stacks(player)) {
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        ItemStack emeraldupup = CustomItem.getGunpowder3().clone();
                        ItemMeta emeraldupupmeta = emeraldupup.getItemMeta();
                        emeraldupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        emeraldupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        emeraldupup.setItemMeta(emeraldupupmeta);
                        villagerInventory.getPnjUpgradeT1().setItem(12, emeraldupup);
                        GameTeam team = game.getTeamOf(player);
                        team.setGunPowderFarm(team.getGunPowderFarm() + 1);
                    } else {
                        event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                    }
                } else {
                    event.getWhoClicked().sendMessage("§cVous ne pouvez pas faire ça!");
                }
            }
            if (item.equals(CustomItem.getSpider2())) {
                if (game.getTeamOf(player).getSpiderFarm() == 1) {
                    if (contains2stacks(player)) {
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        ItemStack coalupup = CustomItem.getSpider2().clone();
                        ItemMeta coalupupmeta = coalupup.getItemMeta();
                        coalupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        coalupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        coalupup.setItemMeta(coalupupmeta);
                        villagerInventory.getPnjUpgradeT1().setItem(15, coalupup);
                        GameTeam team = game.getTeamOf(player);
                        team.setSpiderFarm(team.getSpiderFarm() + 1);
                    } else {
                        event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                    }
                } else {
                    event.getWhoClicked().sendMessage("§cVous ne pouvez pas faire ça!");
                }
            }
            if (item.equals(CustomItem.getSpider3())) {
                if (game.getTeamOf(player).getSpiderFarm() == 2) {
                    if (contains2stacks(player)) {
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        ItemStack redstoneupup = CustomItem.getSpider3().clone();
                        ItemMeta redstoneupupmeta = redstoneupup.getItemMeta();
                        redstoneupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        redstoneupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        redstoneupup.setItemMeta(redstoneupupmeta);
                        villagerInventory.getPnjUpgradeT1().setItem(16, redstoneupup);
                        GameTeam team = game.getTeamOf(player);
                        team.setSpiderFarm(team.getSpiderFarm() + 1);
                    } else {
                        event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                    }
                } else {
                    event.getWhoClicked().sendMessage("§cVous ne pouvez pas faire ça!");
                }
            }
            event.setCancelled(true);
        }
        if (inventory.equals(villagerInventory.getPnjUpgradeT2())) {
            if (item.equals(CustomItem.getBone2())) {
                if (game.getTeamOf(player).getBoneFarm() == 1) {
                    if (contains2stacks(player)) {
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        ItemStack goldupup = CustomItem.getBone2().clone();
                        ItemMeta goldupupmeta = goldupup.getItemMeta();
                        goldupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        goldupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        goldupup.setItemMeta(goldupupmeta);
                        villagerInventory.getPnjUpgradeT2().setItem(2, goldupup);
                        GameTeam team = game.getTeamOf(player);
                        team.setBoneFarm(team.getBoneFarm() + 1);
                    } else {
                        event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                    }
                } else {
                    event.getWhoClicked().sendMessage("§cVous ne pouvez pas faire ça!");
                }
            }
            if (item.equals(CustomItem.getBone3())) {
                if (game.getTeamOf(player).getBoneFarm() == 2) {
                    if (contains2stacks(player)) {
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        ItemStack ironupup = CustomItem.getBone3().clone();
                        ItemMeta ironupupmeta = ironupup.getItemMeta();
                        ironupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        ironupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        ironupup.setItemMeta(ironupupmeta);
                        villagerInventory.getPnjUpgradeT2().setItem(3, ironupup);
                        GameTeam team = game.getTeamOf(player);
                        team.setBoneFarm(team.getBoneFarm() + 1);
                    } else {
                        event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                    }
                } else {
                    event.getWhoClicked().sendMessage("§cVous ne pouvez pas faire ça!");
                }
            }
            if (item.equals(CustomItem.getBlaze2())) {
                if (game.getTeamOf(player).getBlazeFarm() == 1) {
                    if (contains2stacks(player)) {
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        ItemStack diamondupup = CustomItem.getBlaze2().clone();
                        ItemMeta diamondupupmeta = diamondupup.getItemMeta();
                        diamondupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        diamondupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        diamondupup.setItemMeta(diamondupupmeta);
                        villagerInventory.getPnjUpgradeT2().setItem(5, diamondupup);
                        GameTeam team = game.getTeamOf(player);
                        team.setBlazeFarm(team.getBlazeFarm() + 1);
                    } else {
                        event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                    }
                } else {
                    event.getWhoClicked().sendMessage("§cVous ne pouvez pas faire ça!");
                }
            }
            if (item.equals(CustomItem.getBlaze3())) {
                if (game.getTeamOf(player).getBlazeFarm() == 2) {
                    if (contains2stacks(player)) {
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        ItemStack emeraldupup = CustomItem.getBlaze3().clone();
                        ItemMeta emeraldupupmeta = emeraldupup.getItemMeta();
                        emeraldupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        emeraldupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        emeraldupup.setItemMeta(emeraldupupmeta);
                        villagerInventory.getPnjUpgradeT2().setItem(6, emeraldupup);
                        GameTeam team = game.getTeamOf(player);
                        team.setBlazeFarm(team.getBlazeFarm() + 1);
                    } else {
                        event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                    }
                } else {
                    event.getWhoClicked().sendMessage("§cVous ne pouvez pas faire ça!");
                }
            }
            if (item.equals(CustomItem.getGunpowder2())) {
                if (game.getTeamOf(player).getGunPowderFarm() == 1) {
                    if (contains2stacks(player)) {
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        ItemStack redstoneupup = CustomItem.getGunpowder2().clone();
                        ItemMeta redstoneupupmeta = redstoneupup.getItemMeta();
                        redstoneupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        redstoneupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        redstoneupup.setItemMeta(redstoneupupmeta);
                        villagerInventory.getPnjUpgradeT2().setItem(8, redstoneupup);
                        GameTeam team = game.getTeamOf(player);
                        team.setGunPowderFarm(team.getGunPowderFarm() + 1);
                    } else {
                        event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                    }
                } else {
                    event.getWhoClicked().sendMessage("§cVous ne pouvez pas faire ça!");
                }
            }
            if (item.equals(CustomItem.getGunpowder3())) {
                if (game.getTeamOf(player).getGunPowderFarm() == 2) {
                    if (contains2stacks(player)) {
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        ItemStack lapisupup = CustomItem.getGunpowder3().clone();
                        ItemMeta lapisupupmeta = lapisupup.getItemMeta();
                        lapisupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        lapisupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        lapisupup.setItemMeta(lapisupupmeta);
                        villagerInventory.getPnjUpgradeT2().setItem(9, lapisupup);
                        GameTeam team = game.getTeamOf(player);
                        team.setGunPowderFarm(team.getGunPowderFarm() + 1);
                    } else {
                        event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                    }
                } else {
                    event.getWhoClicked().sendMessage("§cVous ne pouvez pas faire ça!");
                }
            }
            if (item.equals(CustomItem.getSpider2())) {
                if (game.getTeamOf(player).getSpiderFarm() == 1) {
                    if (contains2stacks(player)) {
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        ItemStack goldupup = CustomItem.getSpider2().clone();
                        ItemMeta goldupupmeta = goldupup.getItemMeta();
                        goldupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        goldupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        goldupup.setItemMeta(goldupupmeta);
                        villagerInventory.getPnjUpgradeT2().setItem(11, goldupup);
                        GameTeam team = game.getTeamOf(player);
                        team.setSpiderFarm(team.getSpiderFarm() + 1);
                    } else {
                        event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                    }
                } else {
                    event.getWhoClicked().sendMessage("§cVous ne pouvez pas faire ça!");
                }
            }
            if (item.equals(CustomItem.getSpider3())) {
                if (game.getTeamOf(player).getSpiderFarm() == 2) {
                    if (contains2stacks(player)) {
                        event.getWhoClicked().getInventory().removeItem(coins64);
                        ItemStack ironupup = CustomItem.getSpider3().clone();
                        ItemMeta ironupupmeta = ironupup.getItemMeta();
                        ironupupmeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        ironupupmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        ironupup.setItemMeta(ironupupmeta);
                        villagerInventory.getPnjUpgradeT2().setItem(12, ironupup);
                        GameTeam team = game.getTeamOf(player);
                        team.setSpiderFarm(team.getSpiderFarm() + 1);
                    } else {
                        event.getWhoClicked().sendMessage("§cVous n'avez pas assez de coins !");
                    }
                } else {
                    event.getWhoClicked().sendMessage("§cVous ne pouvez pas faire ça!");
                }
            }
            event.setCancelled(true);
        }
        if (inventory.equals(villagerInventory.getPnjCapacityT1())) {
            if (item.equals(CustomItem.getSkullwhither())) {
                if (game.getTeam1().getScore() >= 200) {
                    game.getTeam1().setScore(game.getTeam1().getScore() - 200);
                    for (Location loc : game.getMap().getWitherSpawnT1()){
                        loc.getBlock().setType(Material.WITHER_SKELETON_SKULL);
                    }
                }
            }
            if (item.equals(CustomItem.getShulker1())) {
                if (game.getTeam1().getScore() >= 200) {
                    game.getTeam1().setScore(game.getTeam1().getScore() - 200);
                    for(Player player1 : game.getTeam2().getPlayers()){
                        player1.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 20*20, 1));
                    }
                }
            }
            if (item.equals(CustomItem.getZombieskull())) {
                if (game.getTeam1().getScore() >= 200) {
                    game.getTeam1().setScore(game.getTeam1().getScore() - 200);
                    for(Player player1 : game.getTeam2().getPlayers()){
                        player1.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20*20, 1));
                    }
                }
            }
            if (item.equals(CustomItem.getDark())) {
                if (game.getTeam1().getScore() >= 100) {
                    game.getTeam1().setScore(game.getTeam1().getScore() - 100);
                    for(Player player1 : game.getTeam2().getPlayers()){
                        player1.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20*20, 1));
                    }
                }
            }
            event.setCancelled(true);
        }
        if (inventory.equals(villagerInventory.getPnjCapacityT2())) {
            if (item.equals(CustomItem.getSkullwhither())) {
                if (game.getTeam2().getScore() >= 200) {
                    game.getTeam2().setScore(game.getTeam2().getScore() - 200);
                    for (Location loc : game.getMap().getWitherSpawnT2()){
                        loc.getBlock().setType(Material.WITHER_SKELETON_SKULL);
                    }
                }
            }
            if (item.equals(CustomItem.getShulker1())) {
                if (game.getTeam2().getScore() >= 200) {
                    game.getTeam2().setScore(game.getTeam2().getScore() - 200);
                    for(Player player1 : game.getTeam1().getPlayers()){
                        player1.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 20*20, 1));
                    }
                }
            }
            if (item.equals(CustomItem.getZombieskull())) {
                if (game.getTeam2().getScore() >= 200) {
                    game.getTeam2().setScore(game.getTeam2().getScore() - 200);
                    for(Player player1 : game.getTeam1().getPlayers()){
                        player1.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20*20, 1));
                    }
                }
            }
            if (item.equals(CustomItem.getDark())) {
                if (game.getTeam2().getScore() >= 100) {
                    game.getTeam2().setScore(game.getTeam2().getScore() - 100);
                    for(Player player1 : game.getTeam1().getPlayers()){
                        player1.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20*20, 1));
                    }
                }
            }
            event.setCancelled(true);
        }
    }

    public boolean contains2stacks(Player player){
        int count = 0;
        ItemStack itemCoins = CustomItem.getCoins().clone();
        itemCoins.setAmount(64);
        for (ItemStack item : player.getInventory().getContents()) {
            if (item != null && item.equals(itemCoins)){
                count += item.getAmount();
            }
        }
        return count >= 2;
    }
}
