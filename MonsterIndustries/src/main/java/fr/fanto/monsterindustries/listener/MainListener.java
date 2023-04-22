package fr.fanto.monsterindustries.listener;

import fr.fanto.monsterindustries.gameclass.Game;
import fr.fanto.monsterindustries.gameclass.GameTeam;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class MainListener implements Listener {

    private final Game game;

    public MainListener(Game game) {
        this.game = game;
    }


    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.NATURAL) event.setCancelled(true);
    }

    @EventHandler
    public void onInteractCoin(PlayerInteractEvent event) {

    }

    @EventHandler
    public void onDeathPlayer(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player p) {
            if (p.getHealth() - event.getFinalDamage() <= 0) {
                GameTeam gameTeam = game.getTeamOf(p);

                if (gameTeam == null) return;

                if (gameTeam.equals(game.getTeam1())) {
                    game.getTeam2().addScore(100);
                    p.teleport(game.getMap().getSpawnPoints().get(0));

                } else if (gameTeam.equals(game.getTeam2())) {
                    game.getTeam1().addScore(100);
                    p.teleport(game.getMap().getSpawnPoints().get(1));
                }

                p.setHealth(20);
                p.addPotionEffect(new PotionEffect(PotionEffectType.DARKNESS, 100, 10));
                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 2));
                p.playSound(p, Sound.BLOCK_ANVIL_PLACE, 1, 1);
                p.sendTitle("§cVous êtes mort", null, 10, 80, 10);
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onWeatherChange(WeatherChangeEvent event) {
        if (event.toWeatherState()) event.setCancelled(true);
    }

    @EventHandler
    public void onMobTargetVillagerEvent(EntityTargetLivingEntityEvent event) {
        Entity entity = event.getEntity();
        Entity target = event.getTarget();

        if (target.getType() == EntityType.VILLAGER) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onVillagerDamageEvent (EntityDamageEvent event) {
        Entity entity = event.getEntity();

        if (entity.getType() == EntityType.VILLAGER) {
            event.setCancelled(true);
        }
    }
}
