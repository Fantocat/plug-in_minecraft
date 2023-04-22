package fr.fanto.monsterindustries.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;

public class CustomItem {
    private static ItemStack coins = new ItemStack(Material.SUNFLOWER);

    private static ItemStack jackiecoal;
    private static ItemStack frankyiron;
    private static ItemStack benoitredstone;
    private static ItemStack didierlapis;
    private static ItemStack francoisdiamond;
    private static ItemStack bone1;
    private static ItemStack bone2;
    private static ItemStack bone3;
    private static ItemStack blaze1;
    private static ItemStack blaze2;
    private static ItemStack blaze3;
    private static ItemStack spider1;
    private static ItemStack spider2;
    private static ItemStack spider3;
    private static ItemStack gunpowder1;
    private static ItemStack gunpowder2;
    private static ItemStack gunpowder3;
    private static ItemStack skullwhither;
    private static ItemStack shulker1;
    private static ItemStack zombieskull;
    private static ItemStack foudre;
    private static ItemStack dark;


    public void createCoins(){
        ItemMeta m = coins.getItemMeta();
        m.setDisplayName("§6Coin ⛀");
        coins.setItemMeta(m);

    }

    public void createJackieCoal(){
        jackiecoal = new ItemStack(Material.COAL_ORE);
        ItemMeta m = jackiecoal.getItemMeta();
        m.setDisplayName("§6Jackie §7Coal");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l2 stacks §6Coin");
        lore.add("§7Genere §6§l1 §6Coin §7par 3 seconde");
        m.setLore(lore);
        jackiecoal.setItemMeta(m);
    }

    public void createFrankyIron(){
        frankyiron = new ItemStack(Material.IRON_ORE);
        ItemMeta m = frankyiron.getItemMeta();
        m.setDisplayName("§6Franky §7Iron");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l2 stacks §6Coin");
        lore.add("§7Genere §6§l1 §6Coin §7par 3 seconde");
        m.setLore(lore);
        frankyiron.setItemMeta(m);
    }

    public void createBenoitRedstone(){
        benoitredstone = new ItemStack(Material.REDSTONE_ORE);
        ItemMeta m = benoitredstone.getItemMeta();
        m.setDisplayName("§6Benoit §7Redstone");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l2 stacks §6Coin");
        lore.add("§7Genere §6§l1 §6Coin §7par 3 seconde");
        m.setLore(lore);
        benoitredstone.setItemMeta(m);
    }

    public void createDidierLapis(){
        didierlapis = new ItemStack(Material.LAPIS_ORE);
        ItemMeta m = didierlapis.getItemMeta();
        m.setDisplayName("§6Didier §7Lapis");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l2 stacks §6Coin");
        lore.add("§7Genere §6§l1 §6Coin §7par 3 seconde");
        m.setLore(lore);
        didierlapis.setItemMeta(m);
    }

    public void createFrancoisDiamond(){
        francoisdiamond = new ItemStack(Material.DIAMOND_ORE);
        ItemMeta m = francoisdiamond.getItemMeta();
        m.setDisplayName("§6Francois §7Diamond");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l2 stacks §6Coin");
        lore.add("§7Genere §6§l1 §6Coin §7par 3 seconde");
        m.setLore(lore);
        francoisdiamond.setItemMeta(m);
    }

    public void createBone1(){
        bone1 = new ItemStack(Material.BONE);
        ItemMeta m = bone1.getItemMeta();
        m.setDisplayName("§6Usine a Os §7I");
        m.addEnchant(Enchantment.ARROW_INFINITE, 1,true);
        m.addItemFlags(org.bukkit.inventory.ItemFlag.HIDE_ENCHANTS);
        bone1.setItemMeta(m);
    }

    public void createBone2(){
        bone2 = new ItemStack(Material.BONE);
        ItemMeta m = bone2.getItemMeta();
        m.setDisplayName("§6Usine a Os §7II");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l2 stacks §6Coin");
        lore.add("§7Ameliore la production de l'usine a Os");
        m.setLore(lore);
        bone2.setItemMeta(m);
    }

    public void createBone3(){
        bone3 = new ItemStack(Material.BONE);
        ItemMeta m = bone3.getItemMeta();
        m.setDisplayName("§6Usine a Os §7III");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l2 stacks §6Coin");
        lore.add("§7Ameliore la production de l'usine a Os");
        m.setLore(lore);
        bone3.setItemMeta(m);
    }

    public void createBlaze1(){
        blaze1 = new ItemStack(Material.BLAZE_ROD);
        ItemMeta m = blaze1.getItemMeta();
        m.setDisplayName("§6Usine a Blaze §7I");
        m.addEnchant(Enchantment.ARROW_INFINITE, 1,true);
        m.addItemFlags(org.bukkit.inventory.ItemFlag.HIDE_ENCHANTS);
        blaze1.setItemMeta(m);
    }

    public void createBlaze2(){
        blaze2 = new ItemStack(Material.BLAZE_ROD);
        ItemMeta m = blaze2.getItemMeta();
        m.setDisplayName("§6Usine a Blaze §7II");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l2 stacks §6Coin");
        lore.add("§7Ameliore la production de l'usine a Blaze");
        m.setLore(lore);
        blaze2.setItemMeta(m);
    }

    public void createBlaze3(){
        blaze3 = new ItemStack(Material.BLAZE_ROD);
        ItemMeta m = blaze3.getItemMeta();
        m.setDisplayName("§6Usine a Blaze §7III");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l2 stacks §6Coin");
        lore.add("§7Ameliore la production de l'usine a Blaze");
        m.setLore(lore);
        blaze3.setItemMeta(m);
    }

    public void createGunpowder1(){
        gunpowder1 = new ItemStack(Material.GUNPOWDER);
        ItemMeta m = gunpowder1.getItemMeta();
        m.setDisplayName("§6Usine a Poudre a canon §7I");
        m.addEnchant(Enchantment.ARROW_INFINITE, 1,true);
        m.addItemFlags(org.bukkit.inventory.ItemFlag.HIDE_ENCHANTS);
        gunpowder1.setItemMeta(m);
    }

    public void createGunpowder2(){
        gunpowder2 = new ItemStack(Material.GUNPOWDER);
        ItemMeta m = gunpowder2.getItemMeta();
        m.setDisplayName("§6Usine a Poudre a canon §7II");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l2 stacks §6Coin");
        lore.add("§7Ameliore la production de l'usine a Poudre a canon");
        m.setLore(lore);
        gunpowder2.setItemMeta(m);
    }

    public void createGunpowder3(){
        gunpowder3 = new ItemStack(Material.GUNPOWDER);
        ItemMeta m = gunpowder3.getItemMeta();
        m.setDisplayName("§6Usine a Poudre a canon §7III");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l2 stacks §6Coin");
        lore.add("§7Ameliore la production de l'usine a Poudre a canon");
        m.setLore(lore);
        gunpowder3.setItemMeta(m);
    }

    public void createSpider1(){
        spider1 = new ItemStack(Material.SPIDER_EYE);
        ItemMeta m = spider1.getItemMeta();
        m.setDisplayName("§6Usine a Oeil §7I");
        m.addEnchant(Enchantment.ARROW_INFINITE, 1,true);
        m.addItemFlags(org.bukkit.inventory.ItemFlag.HIDE_ENCHANTS);
        spider1.setItemMeta(m);
    }

    public void createSpider2(){
        spider2 = new ItemStack(Material.SPIDER_EYE);
        ItemMeta m = spider2.getItemMeta();
        m.setDisplayName("§6Usine a Oeil §7II");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l2 stacks §6Coin");
        lore.add("§7Ameliore la production de l'usine a Oeil");
        m.setLore(lore);
        spider2.setItemMeta(m);
    }

    public void createSpider3(){
        spider3 = new ItemStack(Material.SPIDER_EYE);
        ItemMeta m = spider3.getItemMeta();
        m.setDisplayName("§6Usine a Oeil §7III");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l2 stacks §6Coin");
        lore.add("§7Ameliore la production de l'usine a Oeil");
        m.setLore(lore);
        spider3.setItemMeta(m);
    }

    public void createSkullWither(){
        ItemStack skullwither = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta m = skullwither.getItemMeta();
        m.setDisplayName("§6Wither");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l500 Points");
        lore.add("§7Permet de faire apparaître un wither");
        m.setLore(lore);
        skullwither.setItemMeta(m);
    }

    public void createShulker(){
        ItemStack shulker = new ItemStack(Material.SHULKER_SHELL);
        ItemMeta m = shulker.getItemMeta();
        m.setDisplayName("§6Fly");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l200 Points");
        lore.add("§7Fait voler les ennemis");
        lore.add("§7durant 20 secondes");
        m.setLore(lore);
        shulker.setItemMeta(m);
    }

    public void createZombieSkull(){
        ItemStack zombieskull = new ItemStack(Material.ZOMBIE_HEAD);
        ItemMeta m = zombieskull.getItemMeta();
        m.setDisplayName("§6Coronavirus");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l200 Points");
        lore.add("§7Applique le virus les ennemis");
        lore.add("§7durant 20 secondes");
        zombieskull.setItemMeta(m);
    }

    public void createFoudre(){
        ItemStack foudre = new ItemStack(Material.LIGHTNING_ROD);
        ItemMeta m = foudre.getItemMeta();
        m.setDisplayName("§6Foudre");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l200 Points");
        lore.add("§7Fait tomber la foudre sur les ennemis");
        lore.add("§7tue les farmer ennemis");
        foudre.setItemMeta(m);
    }

    public void createDark(){
        ItemStack dark = new ItemStack(Material.BLACK_WOOL);
        ItemMeta m = dark.getItemMeta();
        m.setDisplayName("§0Dark");
        List<String> lore = new ArrayList<>();
        lore.add("§7Prix : §6§l100 Points");
        lore.add("§7Applique Darkness sur les ennemis");
        lore.add("§7durant 20 secondes");
        dark.setItemMeta(m);
    }


    public void init(){
        createCoins();
        createJackieCoal();
        createFrankyIron();
        createBenoitRedstone();
        createDidierLapis();
        createFrancoisDiamond();
        createBone1();
        createBone2();
        createBone3();
        createBlaze1();
        createBlaze2();
        createBlaze3();
        createGunpowder1();
        createGunpowder2();
        createGunpowder3();
        createSpider1();
        createSpider2();
        createSpider3();
        createSkullWither();
        createShulker();
        createZombieSkull();
        createFoudre();
        createDark();
    }

    public static ItemStack getCoins() {
        return coins;
    }

    public static ItemStack getJackiecoal() {
        return jackiecoal;
    }

    public static ItemStack getFrankyiron() {
        return frankyiron;
    }

    public static ItemStack getBenoitredstone() {
        return benoitredstone;
    }

    public static ItemStack getDidierlapis() {
        return didierlapis;
    }

    public static ItemStack getFrancoisdiamond() {
        return francoisdiamond;
    }

    public static ItemStack getBone1() {
        return bone1;
    }

    public static ItemStack getBone2() {
        return bone2;
    }

    public static ItemStack getBone3() {
        return bone3;
    }

    public static ItemStack getBlaze1() {
        return blaze1;
    }

    public static ItemStack getBlaze2() {
        return blaze2;
    }

    public static ItemStack getBlaze3() {
        return blaze3;
    }

    public static ItemStack getSpider1() {
        return spider1;
    }

    public static ItemStack getSpider2() {
        return spider2;
    }

    public static ItemStack getSpider3() {
        return spider3;
    }

    public static ItemStack getGunpowder1() {
        return gunpowder1;
    }

    public static ItemStack getGunpowder2() {
        return gunpowder2;
    }

    public static ItemStack getGunpowder3() {
        return gunpowder3;
    }

    public static ItemStack getSkullwhither() {
        return skullwhither;
    }

    public static ItemStack getShulker1() {
        return shulker1;
    }

    public static ItemStack getZombieskull() {
        return zombieskull;
    }

    public static ItemStack getFoudre() {
        return foudre;
    }

    public static ItemStack getDark() {
        return dark;
    }
}
