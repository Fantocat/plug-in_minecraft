package fr.fanto.monsterindustries.utils;

import fr.fanto.monsterindustries.gameclass.Game;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Merchant;
import org.bukkit.inventory.MerchantRecipe;

import java.util.ArrayList;
import java.util.List;

public class CustomTrader {


    public static void spawnMerchantTool(Location l) {

        Merchant v = (Merchant) l.getWorld().spawnEntity(l, EntityType.VILLAGER);
        Villager m = (Villager) v;
        m.setAI(false);
        m.setCustomName("§a§lTOOL MERCHANT");

        List<MerchantRecipe> recipes = new ArrayList<>();

        MerchantRecipe wonden = new MerchantRecipe(new ItemStack(Material.WOODEN_SWORD, 1), 9999);
        recipes.add(wonden);
        ItemStack coins10 = CustomItem.getCoins().clone();
        coins10.setAmount(10);
        wonden.addIngredient(coins10);

        MerchantRecipe iron = new MerchantRecipe(new ItemStack(Material.IRON_SWORD, 1), 9999);
        recipes.add(iron);
        ItemStack coins25 = CustomItem.getCoins().clone();
        coins25.setAmount(25);
        iron.addIngredient(coins25);

        MerchantRecipe diamond = new MerchantRecipe(new ItemStack(Material.DIAMOND_SWORD, 1), 9999);
        recipes.add(diamond);
        ItemStack coins50 = CustomItem.getCoins().clone();
        coins50.setAmount(50);
        diamond.addIngredient(coins50);

        ItemStack diamondsword = new ItemStack(Material.DIAMOND_SWORD, 1);
        diamondsword.addEnchantment(Enchantment.DAMAGE_ALL, 2);
        MerchantRecipe diamondS = new MerchantRecipe(diamondsword, 9999);
        recipes.add(diamondS);
        ItemStack coins60 = CustomItem.getCoins().clone();
        coins60.setAmount(60);
        diamondS.addIngredient(coins60);
        ItemStack coins20 = CustomItem.getCoins().clone();
        coins20.setAmount(20);
        diamondS.addIngredient(coins20);

        MerchantRecipe arrow = new MerchantRecipe(new ItemStack(Material.ARROW, 1), 99999);
        recipes.add(arrow);
        arrow.addIngredient(CustomItem.getCoins());

        MerchantRecipe bow = new MerchantRecipe(new ItemStack(Material.BOW, 1), 9999);
        recipes.add(bow);
        ItemStack coins15 = CustomItem.getCoins().clone();
        coins15.setAmount(15);
        bow.addIngredient(coins15);

        ItemStack bowPp = new ItemStack(Material.BOW, 1);
        bowPp.addEnchantment(Enchantment.ARROW_DAMAGE, 1);
        MerchantRecipe bowP = new MerchantRecipe(new ItemStack(Material.BOW, 1), 9999);
        recipes.add(bowP);
        bowP.addIngredient(coins60);

        MerchantRecipe crossBow = new MerchantRecipe(new ItemStack(Material.CROSSBOW, 1), 9999);
        recipes.add(crossBow);
        crossBow.addIngredient(coins20);

        ItemStack crossBowPp = new ItemStack(Material.CROSSBOW, 1);
        crossBowPp.addEnchantment(Enchantment.MULTISHOT, 1);
        crossBowPp.addEnchantment(Enchantment.QUICK_CHARGE, 2);
        MerchantRecipe crossBowP = new MerchantRecipe(crossBowPp, 9999);
        recipes.add(crossBowP);
        crossBowP.addIngredient(coins60);

        v.setRecipes(recipes);
    }

    public static void spawnMerchantUpgrade(Location l) {
        Villager v = (Villager) l.getWorld().spawnEntity(l, EntityType.VILLAGER);
        v.setAI(false);
        v.setCustomName("§a§lUpgrade");
    }

    public static void spawnMerchantCapacity(Location l) {
        Villager v = (Villager) l.getWorld().spawnEntity(l, EntityType.VILLAGER);
        v.setAI(false);
        v.setCustomName("§a§lcapa");
    }

    public static void spawnMerchantSlave(Location l) {
        Villager v = (Villager) l.getWorld().spawnEntity(l, EntityType.VILLAGER);
        v.setAI(false);
        v.setCustomName("§a§lslave");
    }

    public static void spawnMerchantArmor(Location l) {
        Merchant v = (Merchant) l.getWorld().spawnEntity(l, EntityType.VILLAGER);
        Villager m = (Villager) v;
        m.setAI(false);
        m.setCustomName("§a§larmor");

        List<MerchantRecipe> recipes = new ArrayList<>();

        MerchantRecipe leatherhead = new MerchantRecipe(new ItemStack(Material.LEATHER_HELMET, 1), 9999);
        recipes.add(leatherhead);
        ItemStack coins10 = CustomItem.getCoins().clone();
        coins10.setAmount(10);
        leatherhead.addIngredient(coins10);

        MerchantRecipe leatherchest = new MerchantRecipe(new ItemStack(Material.LEATHER_CHESTPLATE, 1), 9999);
        recipes.add(leatherchest);
        ItemStack coins20 = CustomItem.getCoins().clone();
        coins20.setAmount(20);
        leatherchest.addIngredient(coins20);

        MerchantRecipe leatherleg = new MerchantRecipe(new ItemStack(Material.LEATHER_LEGGINGS, 1), 9999);
        recipes.add(leatherleg);
        ItemStack coins15 = CustomItem.getCoins().clone();
        coins15.setAmount(15);
        leatherleg.addIngredient(coins15);

        MerchantRecipe leatherboot = new MerchantRecipe(new ItemStack(Material.LEATHER_BOOTS, 1), 9999);
        recipes.add(leatherboot);
        leatherboot.addIngredient(coins10);

        MerchantRecipe ironhead = new MerchantRecipe(new ItemStack(Material.IRON_HELMET, 1), 9999);
        recipes.add(ironhead);
        ItemStack coins30 = CustomItem.getCoins().clone();
        coins30.setAmount(30);
        ironhead.addIngredient(coins30);

        MerchantRecipe ironchest = new MerchantRecipe(new ItemStack(Material.IRON_CHESTPLATE, 1), 9999);
        recipes.add(ironchest);
        ItemStack coins40 = CustomItem.getCoins().clone();
        coins40.setAmount(40);
        ironchest.addIngredient(coins40);

        MerchantRecipe ironleg = new MerchantRecipe(new ItemStack(Material.IRON_LEGGINGS, 1), 9999);
        recipes.add(ironleg);
        ItemStack coins35 = CustomItem.getCoins().clone();
        coins35.setAmount(35);
        ironleg.addIngredient(coins35);

        MerchantRecipe ironboot = new MerchantRecipe(new ItemStack(Material.IRON_BOOTS, 1), 9999);
        recipes.add(ironboot);
        ironboot.addIngredient(coins30);

        MerchantRecipe diamondhead = new MerchantRecipe(new ItemStack(Material.DIAMOND_HELMET, 1), 9999);
        recipes.add(diamondhead);
        ItemStack coins60 = CustomItem.getCoins().clone();
        coins60.setAmount(60);
        diamondhead.addIngredient(coins60);

        MerchantRecipe diamondchest = new MerchantRecipe(new ItemStack(Material.DIAMOND_CHESTPLATE, 1), 9999);
        recipes.add(diamondchest);
        diamondchest.addIngredient(coins60);
        diamondchest.addIngredient(coins10);

        MerchantRecipe diamondleg = new MerchantRecipe(new ItemStack(Material.DIAMOND_LEGGINGS, 1), 9999);
        recipes.add(diamondleg);
        diamondleg.addIngredient(coins60);
        ItemStack coins5 = CustomItem.getCoins().clone();
        coins5.setAmount(5);
        diamondleg.addIngredient(coins5);

        MerchantRecipe diamondboot = new MerchantRecipe(new ItemStack(Material.DIAMOND_BOOTS, 1), 9999);
        recipes.add(diamondboot);
        diamondboot.addIngredient(coins60);

        v.setRecipes(recipes);
    }

    public static void spawnMerchantFood(Location l) {
        Merchant v = (Merchant) l.getWorld().spawnEntity(l, EntityType.VILLAGER);
        Villager m = (Villager) v;
        m.setAI(false);
        m.setCustomName("§a§lfood");

        List<MerchantRecipe> recipes = new ArrayList<>();

        MerchantRecipe melon = new MerchantRecipe(new ItemStack(Material.MELON_SLICE, 1), 9999);
        recipes.add(melon);
        ItemStack coins3 = CustomItem.getCoins().clone();
        coins3.setAmount(3);
        melon.addIngredient(coins3);

        MerchantRecipe Steak = new MerchantRecipe(new ItemStack(Material.COOKED_BEEF, 1), 9999);
        recipes.add(Steak);
        ItemStack coins10 = CustomItem.getCoins().clone();
        coins10.setAmount(10);
        Steak.addIngredient(coins10);

        MerchantRecipe goldenapple = new MerchantRecipe(new ItemStack(Material.GOLDEN_APPLE, 1), 9999);
        recipes.add(goldenapple);
        ItemStack coins60 = CustomItem.getCoins().clone();
        coins60.setAmount(60);
        goldenapple.addIngredient(coins60);

        MerchantRecipe nuchApple = new MerchantRecipe(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1), 9999);
        recipes.add(nuchApple);
        ItemStack coins64 = CustomItem.getCoins().clone();
        coins64.setAmount(64);
        nuchApple.addIngredient(coins64);
        nuchApple.addIngredient(coins64);

        v.setRecipes(recipes);
    }

    public static void spawnMerchantMobStart(Location l) {
        Merchant v = (Merchant) l.getWorld().spawnEntity(l, EntityType.VILLAGER);
        Villager m = (Villager) v;
        m.setAI(false);
        m.setCustomName("§a§lmob1");

        List<MerchantRecipe> recipes = new ArrayList<>();

        MerchantRecipe zombie = new MerchantRecipe(new ItemStack(Material.ZOMBIE_SPAWN_EGG, 1), 9999);
        recipes.add(zombie);
        ItemStack coins5 = CustomItem.getCoins().clone();
        coins5.setAmount(5);
        zombie.addIngredient(coins5);
        zombie.addIngredient(new ItemStack(Material.SPIDER_EYE, 4));

        MerchantRecipe skeleton = new MerchantRecipe(new ItemStack(Material.SKELETON_SPAWN_EGG, 1), 9999);
        recipes.add(skeleton);
        skeleton.addIngredient(coins5);
        skeleton.addIngredient(new ItemStack(Material.BONE, 4));

        MerchantRecipe creeper = new MerchantRecipe(new ItemStack(Material.CREEPER_SPAWN_EGG, 1), 9999);
        recipes.add(creeper);
        creeper.addIngredient(coins5);
        creeper.addIngredient(new ItemStack(Material.GUNPOWDER, 4));

        MerchantRecipe spider = new MerchantRecipe(new ItemStack(Material.SPIDER_SPAWN_EGG, 1), 9999);
        recipes.add(spider);
        spider.addIngredient(coins5);
        spider.addIngredient(new ItemStack(Material.SPIDER_EYE, 3));

        MerchantRecipe blaze = new MerchantRecipe(new ItemStack(Material.BLAZE_SPAWN_EGG, 1), 9999);
        recipes.add(blaze);
        ItemStack coins10 = CustomItem.getCoins().clone();
        coins10.setAmount(10);
        blaze.addIngredient(coins10);
        blaze.addIngredient(new ItemStack(Material.BLAZE_ROD, 8));

        MerchantRecipe vindicator = new MerchantRecipe(new ItemStack(Material.VINDICATOR_SPAWN_EGG, 1), 9999);
        recipes.add(vindicator);
        ItemStack coins15 = CustomItem.getCoins().clone();
        coins15.setAmount(15);
        vindicator.addIngredient(coins15);
        vindicator.addIngredient(new ItemStack(Material.BLAZE_ROD, 6));

        MerchantRecipe pillager = new MerchantRecipe(new ItemStack(Material.PILLAGER_SPAWN_EGG, 1), 9999);
        recipes.add(pillager);
        pillager.addIngredient(coins15);
        pillager.addIngredient(new ItemStack(Material.BONE, 6));

        MerchantRecipe ghast = new MerchantRecipe(new ItemStack(Material.GHAST_SPAWN_EGG, 1), 9999);
        recipes.add(ghast);
        ghast.addIngredient(coins15);
        ghast.addIngredient(new ItemStack(Material.GUNPOWDER, 8));

        MerchantRecipe phantom = new MerchantRecipe(new ItemStack(Material.PHANTOM_SPAWN_EGG, 1), 9999);
        recipes.add(phantom);
        phantom.addIngredient(coins10);
        phantom.addIngredient(new ItemStack(Material.SPIDER_EYE, 5));

        v.setRecipes(recipes);
    }

    public static void spawnMerchantMobMid(Location l) {
        Merchant v = (Merchant) l.getWorld().spawnEntity(l, EntityType.VILLAGER);
        Villager m = (Villager) v;
        m.setAI(false);
        m.setCustomName("§a§lmob2");

        List<MerchantRecipe> recipes = new ArrayList<>();

        MerchantRecipe hoglin = new MerchantRecipe(new ItemStack(Material.HOGLIN_SPAWN_EGG, 1), 9999);
        recipes.add(hoglin);
        ItemStack coins20 = CustomItem.getCoins().clone();
        coins20.setAmount(20);
        hoglin.addIngredient(coins20);
        hoglin.addIngredient(new ItemStack(Material.BLAZE_ROD, 12));

        MerchantRecipe zoglin = new MerchantRecipe(new ItemStack(Material.ZOGLIN_SPAWN_EGG, 1), 9999);
        recipes.add(zoglin);
        zoglin.addIngredient(coins20);
        zoglin.addIngredient(new ItemStack(Material.BLAZE_ROD, 12));

        MerchantRecipe piglin = new MerchantRecipe(new ItemStack(Material.PIGLIN_SPAWN_EGG, 1), 9999);
        recipes.add(piglin);
        ItemStack coins10 = CustomItem.getCoins().clone();
        piglin.addIngredient(coins10);
        piglin.addIngredient(new ItemStack(Material.GUNPOWDER, 5));

        MerchantRecipe piglinBrute = new MerchantRecipe(new ItemStack(Material.PIGLIN_BRUTE_SPAWN_EGG, 1), 9999);
        recipes.add(piglinBrute);
        piglinBrute.addIngredient(coins10);
        piglinBrute.addIngredient(new ItemStack(Material.GUNPOWDER, 5));

        MerchantRecipe enderman = new MerchantRecipe(new ItemStack(Material.ENDERMAN_SPAWN_EGG, 1), 9999);
        recipes.add(enderman);
        ItemStack coins15 = CustomItem.getCoins().clone();
        coins15.setAmount(15);
        enderman.addIngredient(coins15);
        enderman.addIngredient(new ItemStack(Material.BONE, 8));

        MerchantRecipe Evoker = new MerchantRecipe(new ItemStack(Material.EVOKER_SPAWN_EGG, 1), 9999);
        recipes.add(Evoker);
        Evoker.addIngredient(coins20);
        Evoker.addIngredient(new ItemStack(Material.BONE, 10));

        MerchantRecipe witch = new MerchantRecipe(new ItemStack(Material.WITCH_SPAWN_EGG, 1), 9999);
        recipes.add(witch);
        witch.addIngredient(coins15);
        witch.addIngredient(new ItemStack(Material.SPIDER_EYE, 8));

        MerchantRecipe guardian = new MerchantRecipe(new ItemStack(Material.GUARDIAN_SPAWN_EGG, 1), 9999);
        recipes.add(guardian);
        guardian.addIngredient(coins15);
        guardian.addIngredient(new ItemStack(Material.SPIDER_EYE, 10));

        v.setRecipes(recipes);
    }

    public static void spawnMerchantMobEnd(Location l) {
        Merchant v = (Merchant) l.getWorld().spawnEntity(l, EntityType.VILLAGER);
        Villager m = (Villager) v;
        m.setAI(false);
        m.setCustomName("§a§lmob3");

        List<MerchantRecipe> recipes = new ArrayList<>();

        MerchantRecipe ravager = new MerchantRecipe(new ItemStack(Material.RAVAGER_SPAWN_EGG, 1), 9999);
        recipes.add(ravager);
        ravager.addIngredient(new ItemStack(Material.BONE, 40));
        ravager.addIngredient(new ItemStack(Material.GUNPOWDER, 20));

        MerchantRecipe warden = new MerchantRecipe(new ItemStack(Material.WARDEN_SPAWN_EGG, 1), 9999);
        recipes.add(warden);
        warden.addIngredient(new ItemStack(Material.BLAZE_ROD, 60));
        warden.addIngredient(new ItemStack(Material.SPIDER_EYE, 60));

        MerchantRecipe witherSkeleton = new MerchantRecipe(new ItemStack(Material.WITHER_SKELETON_SPAWN_EGG, 1), 9999);
        recipes.add(witherSkeleton);
        ItemStack coins30 = CustomItem.getCoins().clone();
        coins30.setAmount(30);
        witherSkeleton.addIngredient(coins30);
        witherSkeleton.addIngredient(new ItemStack(Material.BONE, 15));


        v.setRecipes(recipes);
    }


}
