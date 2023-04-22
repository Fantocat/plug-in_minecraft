package fr.fanto.monsterindustries.gameclass;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Game {

    private GameTeam gameTeam1;
    private GameTeam gameTeam2;
    private boolean started;
    private boolean starting;
    private Map map;

    public Game(GameTeam gameTeam1, GameTeam gameTeam2, Map map) {
        this.gameTeam1 = gameTeam1;
        this.gameTeam2 = gameTeam2;
        this.started = false;
        this.map = map;
    }

    public Game(GameTeam gameTeam1, GameTeam gameTeam2) {
        this.gameTeam1 = gameTeam1;
        this.gameTeam2 = gameTeam2;
        this.started = false;
    }

    public boolean isStarting() {
        return starting;
    }

    public void setStarting(boolean starting) {
        this.starting = starting;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public GameTeam getTeam1() {
        return gameTeam1;
    }

    public void setTeam1(GameTeam gameTeam1) {
        this.gameTeam1 = gameTeam1;
    }

    public GameTeam getTeam2() {
        return gameTeam2;
    }

    public void setTeam2(GameTeam gameTeam2) {
        this.gameTeam2 = gameTeam2;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public GameTeam getTeamOf(Player player) {
        if (gameTeam1.getPlayers().contains(player)) return gameTeam1;
        else if (gameTeam2.getPlayers().contains(player)) return gameTeam2;
        else return null;
    }

    public Location getSpawnOf(Player player) {
        if (gameTeam1.getPlayers().contains(player)) return map.getSpawnPoints().get(0);
        else if (gameTeam2.getPlayers().contains(player)) return map.getSpawnPoints().get(1);
        else return null;
    }
}
