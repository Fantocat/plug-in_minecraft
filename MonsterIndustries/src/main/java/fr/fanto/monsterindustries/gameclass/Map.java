package fr.fanto.monsterindustries.gameclass;

import fr.fanto.monsterindustries.gsonUtils.MapSerializationManager;
import org.bukkit.Color;
import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;

public class Map {

    private String mapName; // ça va pas te plaire mais je vais mettre le nom de la map en uuid
    private TeamName t1Name;
    private TeamName t2Name;
    private Location spawnHome;
    private List<Location> teamButton;
    private List<Location> spawnPoints;
    private List<Location> farmPlatesCoins;
    private List<Location> farmPlatesT1;
    /*
    BonePlate
    BoneTp
    Blaze
    GunPowder
    Spider1
    Spider2
    Spider3
     */
    private List<Location> farmPlatesT2;

    private List<Location> pnjT1;
    /*
    pnjMobStart
    pnjMobMid
    pnjMobEnd
    pnjTool
    pnjArmor
    pnjFood
    pnjSlave
    pnjCapa
    pnjUpgrade
     */
    private List<Location> pnjT2;

    //a faire
    private List<Location> barrierlvl1T1;
    private List<Location> barrierlvl2T1;
    private List<Location> barrierlvl1T2;
    private List<Location> barrierlvl2T2;
    private List<Location> signlvl1;
    private List<Location> signlvl2;
    private List<Location> witherSpawnT1;
    private List<Location> witherSpawnT2;

    private List<Location> chest;

    public Map() {
        this.mapName = null;
        this.t1Name = null;
        this.t2Name = null;
        this.spawnHome = null;
        this.teamButton = new ArrayList<>();
        this.spawnPoints = new ArrayList<>();
        this.farmPlatesCoins = new ArrayList<>();
        this.farmPlatesT1 = new ArrayList<>();
        this.farmPlatesT2 = new ArrayList<>();
        this.pnjT1 = new ArrayList<>();
        this.pnjT2 = new ArrayList<>();
        this.barrierlvl1T1 = new ArrayList<>();
        this.barrierlvl2T1 = new ArrayList<>();
        this.barrierlvl1T2 = new ArrayList<>();
        this.barrierlvl2T2 = new ArrayList<>();
        this.signlvl1 = new ArrayList<>();
        this.signlvl2 = new ArrayList<>();
        this.witherSpawnT1 = new ArrayList<>();
        this.witherSpawnT2 = new ArrayList<>();
        this.chest = new ArrayList<>();
    }

    public String getMapName() {
        return mapName;
    }

    public TeamName getT1Name() {
        return t1Name;
    }

    public TeamName getT2Name() {
        return t2Name;
    }

    public Location getSpawnHome() {
        return spawnHome;
    }


    public List<Location> getTeamButton() {
        return teamButton;
    }

    public List<Location> getSpawnPoints() {
        return spawnPoints;
    }

    public List<Location> getFarmPlatesCoins() {
        return farmPlatesCoins;
    }

    public List<Location> getFarmPlatesT1() {
        return farmPlatesT1;
    }

    public List<Location> getFarmPlatesT2() {
        return farmPlatesT2;
    }

    public List<Location> getPnjT1() {
        return pnjT1;
    }

    public List<Location> getPnjT2() {
        return pnjT2;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public void setT1Name(TeamName t1Name) {
        this.t1Name = t1Name;
    }

    public void setT2Name(TeamName t2Name) {
        this.t2Name = t2Name;
    }

    public void setSpawnHome(Location spawnHome) {
        this.spawnHome = spawnHome;
    }

    public void setTeamButton(List<Location> teamButton) {
        this.teamButton = teamButton;
    }

    public void setSpawnPoints(List<Location> spawnPoints) {
        this.spawnPoints = spawnPoints;
    }

    public void setFarmPlatesCoins(List<Location> farmPlatesCoins) {
        this.farmPlatesCoins = farmPlatesCoins;
    }

    public void setFarmPlatesT1(List<Location> farmPlatesT1) {
        this.farmPlatesT1 = farmPlatesT1;
    }

    public void setFarmPlatesT2(List<Location> farmPlatesT2) {
        this.farmPlatesT2 = farmPlatesT2;
    }

    public void setPnjT1(List<Location> pnjT1) {
        this.pnjT1 = pnjT1;
    }

    public void setPnjT2(List<Location> pnjT2) {
        this.pnjT2 = pnjT2;
    }

    public List<Location> getBarrierlvl1T1() {
        return barrierlvl1T1;
    }

    public void setBarrierlvl1T1(List<Location> barrierlvl1T1) {
        this.barrierlvl1T1 = barrierlvl1T1;
    }

    public List<Location> getBarrierlvl2T1() {
        return barrierlvl2T1;
    }

    public void setBarrierlvl2T1(List<Location> barrierlvl2T1) {
        this.barrierlvl2T1 = barrierlvl2T1;
    }

    public List<Location> getBarrierlvl1T2() {
        return barrierlvl1T2;
    }

    public void setBarrierlvl1T2(List<Location> barrierlvl1T2) {
        this.barrierlvl1T2 = barrierlvl1T2;
    }

    public List<Location> getBarrierlvl2T2() {
        return barrierlvl2T2;
    }

    public void setBarrierlvl2T2(List<Location> barrierlvl2T2) {
        this.barrierlvl2T2 = barrierlvl2T2;
    }

    public List<Location> getSignlvl1() {
        return signlvl1;
    }

    public void setSignlvl1(List<Location> signlvl1) {
        this.signlvl1 = signlvl1;
    }

    public List<Location> getSignlvl2() {
        return signlvl2;
    }

    public void setSignlvl2(List<Location> signlvl2) {
        this.signlvl2 = signlvl2;
    }

    public List<Location> getWitherSpawnT1() {
        return witherSpawnT1;
    }

    public void setWitherSpawnT1(List<Location> witherSpawnT1) {
        this.witherSpawnT1 = witherSpawnT1;
    }

    public List<Location> getWitherSpawnT2() {
        return witherSpawnT2;
    }

    public void setWitherSpawnT2(List<Location> witherSpawnT2) {
        this.witherSpawnT2 = witherSpawnT2;
    }

    public List<Location> getChest() {
        return chest;
    }

    public void setChest(List<Location> chest) {
        this.chest = chest;
    }
}
