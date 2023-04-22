package fr.fanto.lgmc.item;


import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;

import java.util.Arrays;

public class CreationItem {
    private Material item;
    private String name;
    private String description1;
    private String description2;
    private String description3;
    private boolean enchant;

    private Color color;

    public static class ItemBuilder {
        private Material item;
        private String name;
        private String description1;
        private String description2;
        private String description3;
        private boolean enchant = false;

        private Color color;

        public ItemBuilder withItem(Material item) {
            this.item = item;
            return this;
        }

        public ItemBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ItemBuilder withDescription1(String description1) {
            this.description1 = description1;
            return this;
        }

        public ItemBuilder withDescription2(String description2) {
            this.description2 = description2;
            return this;
        }

        public ItemBuilder withDescription3(String description3) {
            this.description3 = description3;
            return this;
        }

        public ItemBuilder withEnchant(boolean enchant) {
            this.enchant = enchant;
            return this;
        }

        public ItemBuilder withColor(Color color) {
            this.color = color;
            return this;
        }

        public CreationItem build() {
            CreationItem newItem = new CreationItem();
            newItem.item = item;
            newItem.name = name;
            newItem.description1 = description1;
            newItem.description2 = description2;
            newItem.description3 = description3;
            newItem.enchant = enchant;
            newItem.color = color;
            return newItem;
        }

    }

    public ItemStack createItem() {

        ItemStack itemstack = new ItemStack(this.item);
        ItemMeta itemmeta = itemstack.getItemMeta();
        itemmeta.setDisplayName(this.name);
        itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemmeta.addItemFlags(ItemFlag.HIDE_DESTROYS);
        itemmeta.addItemFlags(ItemFlag.HIDE_PLACED_ON);

        if (this.description3 == null) {
            itemmeta.setLore(Arrays.asList(this.description1, this.description2));
        } else {
            itemmeta.setLore(Arrays.asList(this.description1, this.description2, this.description3));
        }

        if (enchant) {
            itemmeta.addEnchant(Enchantment.DURABILITY, 1, true);
            itemmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }

        itemstack.setItemMeta(itemmeta);
        return itemstack;
    }

    public ItemStack createPotion() {
        ItemStack potion = new ItemStack(this.item);
        PotionMeta potionM = (PotionMeta) potion.getItemMeta();
        potionM.setDisplayName(this.name);
        if (this.description3 == null) {
            potionM.setLore(Arrays.asList(this.description1, this.description2));
        } else {
            potionM.setLore(Arrays.asList(this.description1, this.description2, this.description3));
        }
        potionM.setColor(this.color);
        potionM.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        potion.setItemMeta(potionM);
        return potion;
    }
}
