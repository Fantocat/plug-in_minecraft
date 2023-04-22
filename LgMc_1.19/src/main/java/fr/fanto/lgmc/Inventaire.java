package fr.fanto.lgmc;

import fr.fanto.lgmc.item.Item;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class Inventaire {

    private static Inventory invcuN1;
    private static Inventory validation;
    private static Inventory invchN1;

    //--------------------------------------------------------------------------------------------

    public static Inventory getInvcuN1() {
        return invcuN1;
    }

    public static void setInvcuN1(Inventory invcuN1) {
        Inventaire.invcuN1 = invcuN1;
    }

    public static Inventory getValidation() {
        return validation;
    }

    public static void setValidation(Inventory validation) {
        Inventaire.validation = validation;
    }

    public static Inventory getInvchN1() {
        return invchN1;
    }

    public static void setInvchN1(Inventory invchN1) {
        Inventaire.invchN1 = invchN1;
    }

    //-----------------------------------------------------------------------------------------------
    public static void createInvCu() {           // Menu choix du Couple
        getInvcuN1().clear();
        for (Player plr : Bukkit.getServer().getOnlinePlayers()) {

            ItemStack i = new ItemStack(Material.PLAYER_HEAD);
            SkullMeta im = (SkullMeta) i.getItemMeta();

            im.setOwner(plr.getName());
            im.setDisplayName("§7" + plr.getName());
            i.setItemMeta(im);


            getInvcuN1().addItem(i);
        }
    }

    public static void createValidation() {
        ItemStack wog = new ItemStack(Material.GREEN_WOOL, 1);
        ItemMeta wogM = wog.getItemMeta();
        wogM.setDisplayName("§a Oui!");
        wog.setItemMeta(wogM);
        ItemStack wor = new ItemStack(Material.RED_WOOL, 1);
        ItemMeta worM = wor.getItemMeta();
        worM.setDisplayName("§4 Non!");
        wor.setItemMeta(worM);
        getValidation().setItem(3, wog);
        getValidation().setItem(5, wor);
    }

    public static void createInvChN1() {
        getInvchN1().setItem(0, Item.getDamageIch());
        getInvchN1().setItem(9, Item.getDamageIIch());
        getInvchN1().setItem(18, Item.getDamageIIIch());
        getInvchN1().setItem(11, Item.getMultiCible());
        getInvchN1().setItem(13, Item.getMarQuage());
        getInvchN1().setItem(15, Item.getVoyanceCh());
    }

    public static void init() {

        invcuN1 = Bukkit.createInventory(null, 27, "§dChoisis le couple");
        validation = Bukkit.createInventory(null, 9, "Es-tu sûr ?");
        invchN1 = Bukkit.createInventory(null, 27, "Qui est la cible?");
        createInvCu();
        createValidation();
        createInvChN1();

    }
}
