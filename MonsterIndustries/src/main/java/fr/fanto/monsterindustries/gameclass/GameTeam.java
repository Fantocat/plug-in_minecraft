package fr.fanto.monsterindustries.gameclass;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class GameTeam {

    private TeamName name;
    private int score;
    private int upgradeLvl;
    private int farmer;
    private ChatColor color;
    private int gunPowderFarm;
    private int boneFarm;
    private int spiderFarm;
    private int blazeFarm;

    private List<Player> players = new ArrayList<>();

    public GameTeam(ChatColor color, TeamName name) {
        this.name = name;
        this.score = 0;
        this.farmer = 0;
        this.upgradeLvl = 0;
        this.color = color;
        this.gunPowderFarm = 1;
        this.boneFarm = 1;
        this.spiderFarm = 1;
        this.blazeFarm = 1;
    }

    public TeamName getName() {
        return name;
    }

    public void setName(TeamName name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getUpgradeLvl() {
        return upgradeLvl;
    }

    public void setUpgradeLvl(int upgradeLvl) {
        this.upgradeLvl = upgradeLvl;
    }

    public int getFarmer() {
        return farmer;
    }

    public void setFarmer(int farmer) {
        this.farmer = farmer;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addFarmer() {
        farmer++;
    }

    public void addUpgrade() {
        upgradeLvl++;
    }

    public void addScore(int score) {
        this.score += score;
    }

    public ChatColor getColor() {
        return color;
    }

    public void setColor(ChatColor color) {
        this.color = color;
    }

    public int getGunPowderFarm() {
        return gunPowderFarm;
    }

    public void setGunPowderFarm(int gunPowderFarm) {
        this.gunPowderFarm = gunPowderFarm;
    }

    public int getBoneFarm() {
        return boneFarm;
    }

    public void setBoneFarm(int boneFarm) {
        this.boneFarm = boneFarm;
    }

    public int getSpiderFarm() {
        return spiderFarm;
    }

    public void setSpiderFarm(int spiderFarm) {
        this.spiderFarm = spiderFarm;
    }

    public int getBlazeFarm() {
        return blazeFarm;
    }

    public void setBlazeFarm(int blazeFarm) {
        this.blazeFarm = blazeFarm;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
