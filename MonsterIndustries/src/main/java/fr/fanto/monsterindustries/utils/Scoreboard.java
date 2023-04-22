package fr.fanto.monsterindustries.utils;

import fr.fanto.monsterindustries.gameclass.Game;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.scoreboard.*;

public class Scoreboard {

    private Game game;
    private Timer t1;
    private Plugin main;

    public Scoreboard(Game game, Timer t1, Plugin main) {
        this.game = game;
        this.t1 = t1;
        this.main = main;
    }

    public void createScoreBoard(Player player) {

        String team = game.getTeamOf(player).getName().toString();
        ChatColor color = game.getTeamOf(player).getColor();


        ScoreboardManager m = Bukkit.getScoreboardManager();
        org.bukkit.scoreboard.Scoreboard b = m.getNewScoreboard();

        Objective o = b.registerNewObjective("Gold", "");
        o.setDisplaySlot(DisplaySlot.SIDEBAR);
        o.setDisplayName(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Monster Industries");

        Score score1 = o.getScore("score⬅ ");
        Score score2 = o.getScore(game.getTeam2().getColor() + game.getTeam2().getName().getShortName());
        Score score3 = o.getScore(ChatColor.WHITE + "   ");
        Score score4 = o.getScore("score➡ ");
        Score score5 = o.getScore(game.getTeam1().getColor() + game.getTeam1().getName().getShortName());
        Score score6 = o.getScore(ChatColor.WHITE + "  ");
        Score score7 = o.getScore(ChatColor.YELLOW + "-");
        Score score8 = o.getScore(ChatColor.WHITE + "Temps de jeu:");
        Score score9 = o.getScore(ChatColor.WHITE + " ");
        Score score10 = o.getScore(color + team + ".");
        Score score11 = o.getScore(ChatColor.WHITE + "Team:");
        Score score12 = o.getScore(ChatColor.WHITE + "");

        Team team1 = b.registerNewTeam("time");
        team1.addEntry(ChatColor.YELLOW + "-");
        team1.setSuffix("7");
        Team team2 = b.registerNewTeam("point1");
        team2.addEntry("score➡ ");
        team2.setSuffix("4");
        Team team3 = b.registerNewTeam("point2");
        team3.addEntry("score⬅ ");
        team3.setSuffix("1");

        score1.setScore(1);
        score2.setScore(2);
        score3.setScore(3);
        score4.setScore(4);
        score5.setScore(5);
        score6.setScore(6);
        score7.setScore(7);
        score8.setScore(8);
        score9.setScore(9);
        score10.setScore(10);
        score11.setScore(11);
        score12.setScore(12);

        player.setScoreboard(b);

        BukkitTask temp = new BukkitRunnable() {
            @Override
            public void run() {

                Team team = b.getTeam("time");
                team.setSuffix(ChatColor.YELLOW+""+t1.getMinute()+":"+t1.getSecond());
                Team team1 = b.getTeam("point1");
                team1.setSuffix(ChatColor.YELLOW+""+game.getTeam1().getScore());
                Team team2 = b.getTeam("point2");
                team2.setSuffix(ChatColor.YELLOW+""+game.getTeam2().getScore());

            }
        }.runTaskTimer(main, 0, 20);
    }

}
