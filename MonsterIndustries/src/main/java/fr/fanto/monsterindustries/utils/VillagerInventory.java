package fr.fanto.monsterindustries.utils;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class VillagerInventory {

    private Inventory pnjSlaveT1;
    private Inventory pnjSlaveT2;
    private Inventory pnjUpgradeT1;
    private Inventory pnjUpgradeT2;
    private Inventory pnjCapacityT1;
    private Inventory pnjCapacityT2;


    public Inventory getPnjSlaveT1() {
        return pnjSlaveT1;
    }

    public void setPnjSlaveT1(Inventory pnjSlaveT1) {
        this.pnjSlaveT1 = pnjSlaveT1;
    }

    public Inventory getPnjSlaveT2() {
        return pnjSlaveT2;
    }

    public void setPnjSlaveT2(Inventory pnjSlaveT2) {
        this.pnjSlaveT2 = pnjSlaveT2;
    }

    public Inventory getPnjUpgradeT1() {
        return pnjUpgradeT1;
    }

    public void setPnjUpgradeT1(Inventory pnjUpgradeT1) {
        this.pnjUpgradeT1 = pnjUpgradeT1;
    }

    public Inventory getPnjUpgradeT2() {
        return pnjUpgradeT2;
    }

    public void setPnjUpgradeT2(Inventory pnjUpgradeT2) {
        this.pnjUpgradeT2 = pnjUpgradeT2;
    }

    public Inventory getPnjCapacityT1() {
        return pnjCapacityT1;
    }

    public void setPnjCapacityT1(Inventory pnjCapacityT1) {
        this.pnjCapacityT1 = pnjCapacityT1;
    }

    public Inventory getPnjCapacityT2() {
        return pnjCapacityT2;
    }

    public void setPnjCapacityT2(Inventory pnjCapacityT2) {
        this.pnjCapacityT2 = pnjCapacityT2;
    }

    public void createPnjSlaveT1() {
        this.pnjSlaveT1 = Bukkit.createInventory(null, 9, "§6§lAcheter des esclaves");
        this.pnjSlaveT1.setItem(2, CustomItem.getJackiecoal());
        this.pnjSlaveT1.setItem(3, CustomItem.getFrankyiron());
        this.pnjSlaveT1.setItem(4, CustomItem.getBenoitredstone());
        this.pnjSlaveT1.setItem(5, CustomItem.getDidierlapis());
        this.pnjSlaveT1.setItem(6, CustomItem.getFrancoisdiamond());
    }

    public void createPnjSlaveT2() {
        this.pnjSlaveT2 = Bukkit.createInventory(null, 9, "§6§lAcheter des esclaves");
        this.pnjSlaveT2.setItem(2, CustomItem.getJackiecoal());
        this.pnjSlaveT2.setItem(3, CustomItem.getFrankyiron());
        this.pnjSlaveT2.setItem(4, CustomItem.getBenoitredstone());
        this.pnjSlaveT2.setItem(5, CustomItem.getDidierlapis());
        this.pnjSlaveT2.setItem(6, CustomItem.getFrancoisdiamond());
    }

    public void createPnjUpgradeT1(){
        this.pnjUpgradeT1 = Bukkit.createInventory(null,18,"§6§lAméliorer vos Usines");
        this.pnjUpgradeT1.setItem(1,CustomItem.getBone1());
        this.pnjUpgradeT1.setItem(2,CustomItem.getBone2());
        this.pnjUpgradeT1.setItem(3,CustomItem.getBone3());
        this.pnjUpgradeT1.setItem(5,CustomItem.getBlaze1());
        this.pnjUpgradeT1.setItem(6,CustomItem.getBlaze2());
        this.pnjUpgradeT1.setItem(7,CustomItem.getBlaze3());
        this.pnjUpgradeT1.setItem(10,CustomItem.getGunpowder1());
        this.pnjUpgradeT1.setItem(11,CustomItem.getGunpowder2());
        this.pnjUpgradeT1.setItem(12,CustomItem.getGunpowder3());
        this.pnjUpgradeT1.setItem(14,CustomItem.getSpider1());
        this.pnjUpgradeT1.setItem(15,CustomItem.getSpider2());
        this.pnjUpgradeT1.setItem(16,CustomItem.getSpider3());
    }

    public void createPnjUpgradeT2(){
        this.pnjUpgradeT2 = Bukkit.createInventory(null,18,"§6§lAméliorer vos Usines");
        this.pnjUpgradeT2.setItem(1,CustomItem.getBone1());
        this.pnjUpgradeT2.setItem(2,CustomItem.getBone2());
        this.pnjUpgradeT2.setItem(3,CustomItem.getBone3());
        this.pnjUpgradeT2.setItem(5,CustomItem.getBlaze1());
        this.pnjUpgradeT2.setItem(6,CustomItem.getBlaze2());
        this.pnjUpgradeT2.setItem(7,CustomItem.getBlaze3());
        this.pnjUpgradeT2.setItem(10,CustomItem.getGunpowder1());
        this.pnjUpgradeT2.setItem(11,CustomItem.getGunpowder2());
        this.pnjUpgradeT2.setItem(12,CustomItem.getGunpowder3());
        this.pnjUpgradeT2.setItem(14,CustomItem.getSpider1());
        this.pnjUpgradeT2.setItem(15,CustomItem.getSpider2());
        this.pnjUpgradeT2.setItem(16,CustomItem.getSpider3());
    }

    public void createPnjCapacityT1(){
        this.pnjCapacityT1 = Bukkit.createInventory(null,18,"§6§lChoisr une capacité");
        this.pnjCapacityT1.setItem(1,CustomItem.getSkullwhither());
        this.pnjCapacityT1.setItem(2,CustomItem.getShulker1());
        this.pnjCapacityT1.setItem(3,CustomItem.getZombieskull());
        this.pnjCapacityT1.setItem(4,CustomItem.getDark());
    }

    public void createPnjCapacityT2(){
        this.pnjCapacityT2 = Bukkit.createInventory(null,18,"§6§lChoisr une capacité");
        this.pnjCapacityT2.setItem(1,CustomItem.getSkullwhither());
        this.pnjCapacityT2.setItem(2,CustomItem.getShulker1());
        this.pnjCapacityT2.setItem(3,CustomItem.getZombieskull());
        this.pnjCapacityT2.setItem(4,CustomItem.getDark());
    }

    public void init(){
        createPnjSlaveT1();
        createPnjSlaveT2();
        createPnjUpgradeT1();
        createPnjUpgradeT2();
        createPnjCapacityT1();
        createPnjCapacityT2();
    }



}
