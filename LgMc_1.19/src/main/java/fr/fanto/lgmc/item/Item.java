package fr.fanto.lgmc.item;


import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_19_R1.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class Item {

    // --------------------- Creation Item

    static CreationItem cupiarcN = new CreationItem.ItemBuilder().withItem(Material.BOW)
            .withName("§dFoudroyeur")
            .withDescription1("§7§oVous serez")
            .withDescription2("§7§otouché")
            .withDescription3("§dEn Bah LA!").build();

    static CreationItem cupiarcJ = new CreationItem.ItemBuilder().withItem(Material.IRON_SWORD)
            .withName("§dFoudroyeur")
            .withDescription1("§7§oVous serez")
            .withDescription2("§7§otouché")
            .withDescription3("§dEn Bah LA!").build();

    static CreationItem bertaN = new CreationItem.ItemBuilder().withItem(Material.CROSSBOW)
            .withName("§2La Grosse BERTA")
            .withDescription1("§7§oUn coup de 12")
            .withDescription2("§7§oy'a plus de §2problème").build();

    static CreationItem bertaJ = new CreationItem.ItemBuilder().withItem(Material.IRON_SWORD)
            .withName("§2La Grosse BERTA")
            .withDescription1("§7§oUn coup de 12")
            .withDescription2("§7§oy'a plus de §2problème").build();

    static CreationItem oeilN = new CreationItem.ItemBuilder().withItem(Material.ENDER_EYE)
            .withName("§5L'Oeil de Sauron")
            .withDescription1("§7§obig brother is")
            .withDescription2("§5watching you").build();

    static CreationItem oeilJ = new CreationItem.ItemBuilder().withItem(Material.IRON_SWORD)
            .withName("§5L'Oeil de Sauron")
            .withDescription1("§7§obig brother is")
            .withDescription2("§5watching you").build();

    static CreationItem marmiteN = new CreationItem.ItemBuilder().withItem(Material.CAULDRON)
            .withName("§6La Marmite")
            .withDescription1("§7§oVous adorerez ou")
            .withDescription2("§7§ovous §6Détesterez").build();


    static CreationItem marmiteJ = new CreationItem.ItemBuilder().withItem(Material.IRON_SWORD)
            .withName("§6La Marmite")
            .withDescription1("§7§oVous adorerez ou")
            .withDescription2("§7§ovous §6Détesterez").build();

    static CreationItem potionPfN = new CreationItem.ItemBuilder().withItem(Material.GLASS_BOTTLE)
            .withName("§bPotionPf")
            .withDescription1("A TROUVER")
            .withDescription2("A TROUVER").build();

    static CreationItem potionPfJ = new CreationItem.ItemBuilder().withItem(Material.IRON_SWORD)
            .withName("§bPotionPf")
            .withDescription1("A TROUVER")
            .withDescription2("A TROUVER").build();

    static CreationItem itemLoupGN = new CreationItem.ItemBuilder().withItem(Material.NETHERITE_SWORD)
            .withName("ItemLoup")
            .withDescription1("A TROUVER")
            .withDescription2("A TROUVER").build();

    static CreationItem itemLoupGJ = new CreationItem.ItemBuilder().withItem(Material.IRON_SWORD)
            .withName("ItemLoup")
            .withDescription1("A TROUVER")
            .withDescription2("A TROUVER").build();


    // ------------- attribut Item

    private static ItemStack cupidonN = cupiarcN.createItem();
    private static ItemStack cupidonJ = cupiarcJ.createItem();
    private static ItemStack chasseurN = bertaN.createItem();
    private static ItemStack chasseurJ = bertaJ.createItem();
    private static ItemStack voyanteN = oeilN.createItem();
    private static ItemStack voyanteJ = oeilJ.createItem();
    private static ItemStack sorciereN = createItemso();
    private static ItemStack sorciereJ = marmiteJ.createItem();
    private static ItemStack petiteFilleN = potionPfN.createItem();
    private static ItemStack petiteFilleJ = potionPfJ.createItem();
    private static ItemStack LoupGarouN = itemLoupGN.createItem();
    private static ItemStack LoupGarouJ = itemLoupGJ.createItem();

    // ------------- Getters

    public static ItemStack getCupidonN() {
        return cupidonN;
    }

    public static ItemStack getCupidonJ() {
        return cupidonJ;
    }

    public static ItemStack getChasseurN() {
        return chasseurN;
    }

    public static ItemStack getChasseurJ() {
        return chasseurJ;
    }

    public static ItemStack getVoyanteN() {
        return voyanteN;
    }

    public static ItemStack getVoyanteJ() {
        return voyanteJ;
    }

    public static ItemStack getSorciereN() {
        return sorciereN;
    }

    public static ItemStack getSorciereJ() {
        return sorciereJ;
    }

    public static ItemStack getPetiteFilleN() {
        return petiteFilleN;
    }

    public static ItemStack getPetiteFilleJ() {
        return petiteFilleJ;
    }

    public static ItemStack getLoupGarouN() {
        return LoupGarouN;
    }

    public static ItemStack getLoupGarouJ() {
        return LoupGarouJ;
    }

    //Methodes

    public static void setItem(Player player, ItemStack item, int place, ItemStack itemr) {
        player.getInventory().remove(itemr);
        player.getInventory().setItem(place, item);
        player.updateInventory();
    }

    //Item pour toutes les classes

    static CreationItem pioche1 = new CreationItem.ItemBuilder().withItem(Material.IRON_PICKAXE)
            .withName("Pioche")
            .withDescription1("Une pioche").withDescription2("pour miner").build();


    //Attribut
    private static ItemStack pioche = createpioche();


    //Getter
    public static ItemStack getPioche() {
        return pioche;
    }

    //Creation NMS Des 2 Items

    public static ItemStack createpioche() {
        net.minecraft.world.item.ItemStack nmspioche = CraftItemStack.asNMSCopy(pioche1.createItem());
        NBTTagCompound compound = nmspioche.v();
        NBTTagList breaklist = new NBTTagList();
        breaklist.add(NBTTagString.a("minecraft:iron_ore"));
        compound.a("CanDestroy", breaklist);
        nmspioche.a(compound);
        return CraftItemStack.asBukkitCopy(nmspioche);
    }

    public static ItemStack createItemso() {

        net.minecraft.world.item.ItemStack nmsmarmite = CraftItemStack.asNMSCopy(marmiteN.createItem());
        NBTTagCompound compound = nmsmarmite.v();
        NBTTagList breaklist = new NBTTagList();
        breaklist.add(NBTTagString.a("minecraft:stone"));
        compound.a("CanPlaceOn", breaklist);
        nmsmarmite.a(compound);
        return CraftItemStack.asBukkitCopy(nmsmarmite);

    }


    // Item sorcière craft elle meme

    static CreationItem batonSo = new CreationItem.ItemBuilder().withItem(Material.BLAZE_ROD)
            .withName("Le Baton")
            .withDescription1("A TROUVER")
            .withDescription2("A TROUVER")
            .withEnchant(true).build();

    static CreationItem potionDeVie1 = new CreationItem.ItemBuilder().withItem(Material.LINGERING_POTION)
            .withName("§aPotion de Vie I")
            .withDescription1("Pour soigner")
            .withDescription2("les blessures")
            .withDescription3("fatal")
            .withColor(Color.LIME).build();

    static CreationItem potionDeMort1 = new CreationItem.ItemBuilder().withItem(Material.LINGERING_POTION)
            .withName("§0Potion de Mort I")
            .withDescription1("Pour tuer")
            .withDescription2("quelqu'un")
            .withColor(Color.BLACK).build();


    //----------Attributs

    private static ItemStack batonSoN = batonSo.createItem();
    private static ItemStack potionDeVieI = potionDeVie1.createPotion();
    private static ItemStack potionDeMortI = potionDeMort1.createPotion();

    //get

    public static ItemStack getBatonSoN() {
        return batonSoN;
    }

    public static ItemStack getPotionDeVieI() {
        return potionDeVieI;
    }

    public static ItemStack getPotionDeMortI() {
        return potionDeMortI;
    }


    //-----------------------------item d'amelioration selection du chasseur

    static CreationItem damage1ch = new CreationItem.ItemBuilder().withItem(Material.WOODEN_SWORD)
            .withName("Dégâts I")
            .withDescription1("inflige 3")
            .withDescription2("coeurs")
            .withEnchant(true).build();

    static CreationItem damage2ch = new CreationItem.ItemBuilder().withItem(Material.IRON_SWORD)
            .withName("Dégâts II")
            .withDescription1("inflige 5")
            .withDescription2("coeurs")
            .withEnchant(false).build();

    static CreationItem damage2cht = new CreationItem.ItemBuilder().withItem(Material.IRON_SWORD)
            .withName("Dégâts II")
            .withDescription1("inflige 5")
            .withDescription2("coeurs")
            .withEnchant(true).build();

    static CreationItem damage3ch = new CreationItem.ItemBuilder().withItem(Material.NETHERITE_SWORD)
            .withName("Dégâts III")
            .withDescription1("tue la")
            .withDescription2("cible")
            .withEnchant(false).build();

    static CreationItem damage3cht = new CreationItem.ItemBuilder().withItem(Material.NETHERITE_SWORD)
            .withName("Dégâts III")
            .withDescription1("tue la")
            .withDescription2("cible")
            .withEnchant(true).build();

    static CreationItem multicible = new CreationItem.ItemBuilder().withItem(Material.CROSSBOW)
            .withName("2 Cibles")
            .withDescription1("Décoche")
            .withDescription2("2 flèches")
            .withEnchant(false).build();

    static CreationItem multiciblet = new CreationItem.ItemBuilder().withItem(Material.CROSSBOW)
            .withName("2 Cibles")
            .withDescription1("Décoche")
            .withDescription2("2 flèches")
            .withEnchant(true).build();

    static CreationItem marquage = new CreationItem.ItemBuilder().withItem(Material.SPECTRAL_ARROW)
            .withName("Marque du chasseur")
            .withDescription1("Marque la")
            .withDescription2("cible")
            .withEnchant(false).build();

    static CreationItem marquaget = new CreationItem.ItemBuilder().withItem(Material.SPECTRAL_ARROW)
            .withName("Marque du chasseur")
            .withDescription1("Marque la")
            .withDescription2("cible")
            .withEnchant(true).build();

    static CreationItem voyancech = new CreationItem.ItemBuilder().withItem(Material.ENDER_EYE)
            .withName("second chance")
            .withDescription1("donne une")
            .withDescription2("2nd chance")
            .withEnchant(false).build();

    static CreationItem voyancecht = new CreationItem.ItemBuilder().withItem(Material.ENDER_EYE)
            .withName("second chance")
            .withDescription1("donne une")
            .withDescription2("2nd chance")
            .withEnchant(true).build();

    //Attributs

    private static ItemStack damageIch = damage1ch.createItem();
    private static ItemStack damageIIch = damage2ch.createItem();
    private static ItemStack damageIIcht = damage2cht.createItem();
    private static ItemStack damageIIIcht = damage3cht.createItem();
    private static ItemStack damageIIIch = damage3ch.createItem();
    private static ItemStack multiCible = multicible.createItem();
    private static ItemStack multiCiblet = multiciblet.createItem();
    private static ItemStack marQuage = marquage.createItem();
    private static ItemStack marQuaget = marquaget.createItem();
    private static ItemStack voyanceCh = voyancech.createItem();
    private static ItemStack voyanceCht = voyancecht.createItem();

    //Getters


    public static ItemStack getDamageIch() {
        return damageIch;
    }

    public static ItemStack getDamageIIch() {
        return damageIIch;
    }

    public static ItemStack getDamageIIcht() {
        return damageIIcht;
    }

    public static ItemStack getDamageIIIcht() {
        return damageIIIcht;
    }

    public static ItemStack getDamageIIIch() {
        return damageIIIch;
    }

    public static CreationItem getCupiarcN() {
        return cupiarcN;
    }

    public static ItemStack getMultiCible() {
        return multiCible;
    }

    public static ItemStack getMultiCiblet() {
        return multiCiblet;
    }

    public static ItemStack getMarQuage() {
        return marQuage;
    }

    public static ItemStack getMarQuaget() {
        return marQuaget;
    }

    public static ItemStack getVoyanceCh() {
        return voyanceCh;
    }

    public static ItemStack getVoyanceCht() {
        return voyanceCht;
    }

    // -----------------------------------------     item ramdom

    static CreationItem rouleesCanelles = new CreationItem.ItemBuilder().withItem(Material.COOKIE)
            .withName("§6Roulé à la cannelle")
            .withDescription1("effets secondaires")
            .withDescription2(":)")
            .build();

    static CreationItem blenoir = new CreationItem.ItemBuilder().withItem(Material.WHEAT)
            .withName("§0blé noir")
            .withDescription1("douce odeur de")
            .withDescription2("décomposition...")
            .build();

    static CreationItem bavedeGhast = new CreationItem.ItemBuilder().withItem(Material.POTION)
            .withName("§6bave de Ghast")
            .withColor(Color.fromRGB(26, 188, 156))
            .withDescription1("gluant mais")
            .withDescription2("apétissant")
            .build();


    static CreationItem batondeCanelle = new CreationItem.ItemBuilder().withItem(Material.STICK)
            .withName("§6Bâton de canelle")
            .withDescription1("à consommer")
            .withDescription2("avec")
            .withDescription3("modération")
            .build();

    static CreationItem boisdeCanelle = new CreationItem.ItemBuilder().withItem(Material.ACACIA_WOOD)
            .withName("§6Bois de cannelle")
            .withDescription1("c'est pas")
            .withDescription2("moi ;)")
            .build();

    // Attributs

    private static ItemStack rouleCanelle = rouleesCanelles.createItem();
    private static ItemStack bleNoir = blenoir.createItem();
    private static ItemStack baveDeGhast = bavedeGhast.createPotion();
    private static ItemStack batonDeCanelle = batondeCanelle.createItem();
    private static ItemStack boisDeCanelle = boisdeCanelle.createItem();

    // getters

    public static ItemStack getRouleCanelle() {
        return rouleCanelle;
    }

    public static ItemStack getBleNoir() {
        return bleNoir;
    }

    public static ItemStack getBaveDeGhast() {
        return baveDeGhast;
    }

    public static ItemStack getBatonDeCanelle() {
        return batonDeCanelle;
    }

    public static ItemStack getBoisDeCanelle() {
        return boisDeCanelle;
    }


}
