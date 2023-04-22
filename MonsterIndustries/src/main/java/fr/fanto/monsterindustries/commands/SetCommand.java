package fr.fanto.monsterindustries.commands;

import fr.fanto.monsterindustries.gameclass.Game;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetCommand implements CommandExecutor {

    private Game game;
    private int farmplatecoins = 0;
    private int farmplatet1 = 0;
    private int farmplatet2 = 0;
    private int pnjt1 = 0;
    private int pnjt2 = 0;
    private int signlvl1 = 0;
    private int signlvl2 = 0;

    public SetCommand(Game game) {
        this.game = game;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                player.sendMessage("§cUsage: /set <Point>");
            } else if (args.length == 1) {
                switch (args[0].toLowerCase()) {
                    case "spawn":
                        game.getMap().setSpawnHome(player.getLocation());
                        player.sendMessage("§aSpawn set");
                        break;
                    case "buttont1":
                        game.getMap().getTeamButton().add(player.getLocation());
                        player.sendMessage("§aT1 button set");
                        break;
                    case "buttont2":
                        if (game.getMap().getTeamButton().size() == 1) {
                            game.getMap().getTeamButton().add(player.getLocation());
                            player.sendMessage("§aT2 button set");
                        } else {
                            player.sendMessage("§cYou must set the T1 button first");
                        }
                        break;
                    case "spawnt1":
                        game.getMap().getSpawnPoints().add(player.getLocation());
                        player.sendMessage("§aT1 spawn set");
                        break;
                    case "spawnt2":
                        if (game.getMap().getSpawnPoints().size() == 1) {
                            game.getMap().getSpawnPoints().add(player.getLocation());
                            player.sendMessage("§aT2 spawn set");
                        } else {
                            player.sendMessage("§cYou must set the T1 spawn first");
                        }
                        break;
                    case "farmplatecoins":
                        if (farmplatecoins < 13) {
                            game.getMap().getFarmPlatesCoins().add(player.getLocation());
                            player.sendMessage("platecoins " + farmplatecoins + " set");
                        } else {
                            game.getMap().getFarmPlatesCoins().set(farmplatecoins % 12, player.getLocation());
                            player.sendMessage("platecoins " + farmplatecoins % 12 + " overwritten");
                        }
                        farmplatecoins++;
                        break;
                    case "farmplatet1":
                        player.sendMessage("Nom des farmplates dans l'ordre :");
                        player.sendMessage("§a- bonePlateT1");
                        player.sendMessage("§a- boneTpT1");
                        player.sendMessage("§a- blazeT1");
                        player.sendMessage("§a- gunpowderT1");
                        player.sendMessage("§a- spider1T1");
                        player.sendMessage("§a- spider2T1");
                        player.sendMessage("§a- spider3T1");
                        break;
                    case "boneplatet1":
                        if (farmplatet1 == 0) {
                            game.getMap().getFarmPlatesT1().add(player.getLocation());
                            farmplatet1++;
                            player.sendMessage("§abonePlateT1 set");
                        } else if (farmplatet1 == 7) {
                            game.getMap().getFarmPlatesT1().set(0, player.getLocation());
                            player.sendMessage("§abonePlateT1 overwritten");
                        } else {
                            player.sendMessage("§cError");
                        }
                        break;
                    case "bonetpt1":
                        if (farmplatet1 == 1) {
                            game.getMap().getFarmPlatesT1().add(player.getLocation());
                            farmplatet1++;
                            player.sendMessage("§aboneTpT1 set");
                        } else if (farmplatet1 == 7) {
                            game.getMap().getFarmPlatesT1().set(1, player.getLocation());
                            player.sendMessage("§aboneTpT1 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the bonePlateT1 first");
                        }
                        break;
                    case "blazet1":
                        if (farmplatet1 == 2) {
                            game.getMap().getFarmPlatesT1().add(player.getLocation());
                            farmplatet1++;
                            player.sendMessage("§ablazeT1 set");
                        } else if (farmplatet1 == 7) {
                            game.getMap().getFarmPlatesT1().set(2, player.getLocation());
                            player.sendMessage("§ablazeT1 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the boneTpT1 first");
                        }
                        break;
                    case "gunpowdert1":
                        if (farmplatet1 == 3) {
                            game.getMap().getFarmPlatesT1().add(player.getLocation());
                            farmplatet1++;
                            player.sendMessage("§agunpowderT1 set");
                        } else if (farmplatet1 == 7) {
                            game.getMap().getFarmPlatesT1().set(3, player.getLocation());
                            player.sendMessage("§agunpowderT1 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the blazeT1 first");
                        }
                        break;
                    case "spider1t1":
                        if (farmplatet1 == 4) {
                            game.getMap().getFarmPlatesT1().add(player.getLocation());
                            farmplatet1++;
                            player.sendMessage("§aspider1T1 set");
                        } else if (farmplatet1 == 7) {
                            game.getMap().getFarmPlatesT1().set(4, player.getLocation());
                            player.sendMessage("§aspider1T1 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the gunpowderT1 first");
                        }
                        break;
                    case "spider2t1":
                        if (farmplatet1 == 5) {
                            game.getMap().getFarmPlatesT1().add(player.getLocation());
                            farmplatet1++;
                            player.sendMessage("§aspider2T1 set");
                        } else if (farmplatet1 == 7) {
                            game.getMap().getFarmPlatesT1().set(5, player.getLocation());
                            player.sendMessage("§aspider2T1 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the spider1T1 first");
                        }
                        break;
                    case "spider3t1":
                        if (farmplatet1 == 6) {
                            game.getMap().getFarmPlatesT1().add(player.getLocation());
                            farmplatet1++;
                            player.sendMessage("§aspider3T1 set");
                        } else if (farmplatet1 == 7) {
                            game.getMap().getFarmPlatesT1().set(6, player.getLocation());
                            player.sendMessage("§aspider3T1 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the spider2T1 first");
                        }
                        break;
                    case "farmplatet2":
                        player.sendMessage("Nom des farmplates dans l'ordre :");
                        player.sendMessage("§a- bonePlateT2");
                        player.sendMessage("§a- boneTpT2");
                        player.sendMessage("§a- blazeT2");
                        player.sendMessage("§a- gunpowderT2");
                        player.sendMessage("§a- spider1T2");
                        player.sendMessage("§a- spider2T2");
                        player.sendMessage("§a- spider3T2");
                        break;
                    case "boneplatet2":
                        if (farmplatet2 == 0) {
                            game.getMap().getFarmPlatesT2().add(player.getLocation());
                            farmplatet2++;
                            player.sendMessage("§abonePlateT2 set");
                        } else if (farmplatet2 == 7) {
                            game.getMap().getFarmPlatesT2().set(0, player.getLocation());
                            player.sendMessage("§abonePlateT2 overwritten");
                        } else {
                            player.sendMessage("§cError");
                        }
                        break;
                    case "bonetpt2":
                        if (farmplatet2 == 1) {
                            game.getMap().getFarmPlatesT2().add(player.getLocation());
                            farmplatet2++;
                            player.sendMessage("§aboneTpT2 set");
                        } else if (farmplatet2 == 7) {
                            game.getMap().getFarmPlatesT2().set(1, player.getLocation());
                            player.sendMessage("§aboneTpT2 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the bonePlateT2 first");
                        }
                        break;
                    case "blazet2":
                        if (farmplatet2 == 2) {
                            game.getMap().getFarmPlatesT2().add(player.getLocation());
                            farmplatet2++;
                            player.sendMessage("§ablazeT2 set");
                        } else if (farmplatet2 == 7) {
                            game.getMap().getFarmPlatesT2().set(2, player.getLocation());
                            player.sendMessage("§ablazeT2 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the boneTpT2 first");
                        }
                        break;
                    case "gunpowdert2":
                        if (farmplatet2 == 3) {
                            game.getMap().getFarmPlatesT2().add(player.getLocation());
                            farmplatet2++;
                            player.sendMessage("§agunpowderT2 set");
                        } else if (farmplatet2 == 7) {
                            game.getMap().getFarmPlatesT2().set(3, player.getLocation());
                            player.sendMessage("§agunpowderT2 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the blazeT2 first");
                        }
                        break;
                    case "spider1t2":
                        if (farmplatet2 == 4) {
                            game.getMap().getFarmPlatesT2().add(player.getLocation());
                            farmplatet2++;
                            player.sendMessage("§aspider1T2 set");
                        } else if (farmplatet2 == 7) {
                            game.getMap().getFarmPlatesT2().set(4, player.getLocation());
                            player.sendMessage("§aspider1T2 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the gunpowderT2 first");
                        }
                        break;
                    case "spider2t2":
                        if (farmplatet2 == 5) {
                            game.getMap().getFarmPlatesT2().add(player.getLocation());
                            farmplatet2++;
                            player.sendMessage("§aspider2T2 set");
                        } else if (farmplatet2 == 7) {
                            game.getMap().getFarmPlatesT2().set(5, player.getLocation());
                            player.sendMessage("§aspider2T2 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the spider1T2 first");
                        }
                        break;
                    case "spider3t2":
                        if (farmplatet2 == 6) {
                            game.getMap().getFarmPlatesT2().add(player.getLocation());
                            farmplatet2++;
                            player.sendMessage("§aspider3T2 set");
                        } else if (farmplatet2 == 7) {
                            game.getMap().getFarmPlatesT2().set(6, player.getLocation());
                            player.sendMessage("§aspider3T2 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the spider2T2 first");
                        }
                        break;
                    case "pnjt1":
                        player.sendMessage("Nom des pnj dans l'ordre :");
                        player.sendMessage("§a- pnjMobStartT1");
                        player.sendMessage("§a- pnjMobMiddleT1");
                        player.sendMessage("§a- pnjMobEndT1");
                        player.sendMessage("§a- pnjToolT1");
                        player.sendMessage("§a- pnjArmorT1");
                        player.sendMessage("§a- pnjFoodT1");
                        player.sendMessage("§a- pnjSlaveT1");
                        player.sendMessage("§a- pnjCapaT1");
                        player.sendMessage("§a- pnjUpgradeT1");
                        break;
                    case "pnjmobstartt1":
                        if (pnjt1 == 0) {
                            game.getMap().getPnjT1().add(player.getLocation());
                            pnjt1++;
                            player.sendMessage("§apnjMobStartT1 set");
                        } else if (pnjt1 == 9) {
                            game.getMap().getPnjT1().set(0, player.getLocation());
                            player.sendMessage("§apnjMobStartT1 overwritten");
                        } else {
                            player.sendMessage("§cError");
                        }
                        break;
                    case "pnjmobmiddlet1":
                        if (pnjt1 == 1) {
                            game.getMap().getPnjT1().add(player.getLocation());
                            pnjt1++;
                            player.sendMessage("§apnjMobMiddleT1 set");
                        } else if (pnjt1 == 9) {
                            game.getMap().getPnjT1().set(1, player.getLocation());
                            player.sendMessage("§apnjMobMiddleT1 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the pnjMobStartT1 first");
                        }
                        break;
                    case "pnjmobendt1":
                        if (pnjt1 == 2) {
                            game.getMap().getPnjT1().add(player.getLocation());
                            pnjt1++;
                            player.sendMessage("§apnjMobEndT1 set");
                        } else if (pnjt1 == 9) {
                            game.getMap().getPnjT1().set(2, player.getLocation());
                            player.sendMessage("§apnjMobEndT1 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the pnjMobMiddleT1 first");
                        }
                        break;
                    case "pnjtoolt1":
                        if (pnjt1 == 3) {
                            game.getMap().getPnjT1().add(player.getLocation());
                            pnjt1++;
                            player.sendMessage("§apnjToolT1 set");
                        } else if (pnjt1 == 9) {
                            game.getMap().getPnjT1().set(3, player.getLocation());
                            player.sendMessage("§apnjToolT1 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the pnjMobEndT1 first");
                        }
                        break;
                    case "pnjarmort1":
                        if (pnjt1 == 4) {
                            game.getMap().getPnjT1().add(player.getLocation());
                            pnjt1++;
                            player.sendMessage("§apnjArmorT1 set");
                        } else if (pnjt1 == 9) {
                            game.getMap().getPnjT1().set(4, player.getLocation());
                            player.sendMessage("§apnjArmorT1 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the pnjToolT1 first");
                        }
                        break;
                    case "pnjfoodt1":
                        if (pnjt1 == 5) {
                            game.getMap().getPnjT1().add(player.getLocation());
                            pnjt1++;
                            player.sendMessage("§apnjFoodT1 set");
                        } else if (pnjt1 == 9) {
                            game.getMap().getPnjT1().set(5, player.getLocation());
                            player.sendMessage("§apnjFoodT1 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the pnjArmorT1 first");
                        }
                        break;
                    case "pnjslavet1":
                        if (pnjt1 == 6) {
                            game.getMap().getPnjT1().add(player.getLocation());
                            pnjt1++;
                            player.sendMessage("§apnjSlaveT1 set");
                        } else if (pnjt1 == 9) {
                            game.getMap().getPnjT1().set(6, player.getLocation());
                            player.sendMessage("§apnjSlaveT1 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the pnjFoodT1 first");
                        }
                        break;
                    case "pnjcapat1":
                        if (pnjt1 == 7) {
                            game.getMap().getPnjT1().add(player.getLocation());
                            pnjt1++;
                            player.sendMessage("§apnjCapaT1 set");
                        } else if (pnjt1 == 9) {
                            game.getMap().getPnjT1().set(7, player.getLocation());
                            player.sendMessage("§apnjCapaT1 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the pnjSlaveT1 first");
                        }
                        break;
                    case "pnjupgradet1":
                        if (pnjt1 == 8) {
                            game.getMap().getPnjT1().add(player.getLocation());
                            pnjt1++;
                            player.sendMessage("§apnjUpgradeT1 set");
                        } else if (pnjt1 == 9) {
                            game.getMap().getPnjT1().set(8, player.getLocation());
                            player.sendMessage("§apnjUpgradeT1 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the pnjCapaT1 first");
                        }
                        break;
                    case "pnjt2":
                        player.sendMessage("Nom des pnj dans l'ordre :");
                        player.sendMessage("§a- pnjMobStartT2");
                        player.sendMessage("§a- pnjMobMiddleT2");
                        player.sendMessage("§a- pnjMobEndT2");
                        player.sendMessage("§a- pnjToolT2");
                        player.sendMessage("§a- pnjArmorT2");
                        player.sendMessage("§a- pnjFoodT2");
                        player.sendMessage("§a- pnjSlaveT2");
                        player.sendMessage("§a- pnjCapaT2");
                        player.sendMessage("§a- pnjUpgradeT2");
                        break;
                    case "pnjmobstartt2":
                        if (pnjt2 == 0) {
                            game.getMap().getPnjT2().add(player.getLocation());
                            pnjt2++;
                            player.sendMessage("§apnjMobStartT2 set");
                        } else if (pnjt2 == 9) {
                            game.getMap().getPnjT2().set(0, player.getLocation());
                            player.sendMessage("§apnjMobStartT2 overwritten");
                        } else {
                            player.sendMessage("§cError");
                        }
                        break;
                    case "pnjmobmiddlet2":
                        if (pnjt2 == 1) {
                            game.getMap().getPnjT2().add(player.getLocation());
                            pnjt2++;
                            player.sendMessage("§apnjMobMiddleT2 set");
                        } else if (pnjt2 == 9) {
                            game.getMap().getPnjT2().set(1, player.getLocation());
                            player.sendMessage("§apnjMobMiddleT2 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the pnjMobStartT2 first");
                        }
                        break;
                    case "pnjmobendt2":
                        if (pnjt2 == 2) {
                            game.getMap().getPnjT2().add(player.getLocation());
                            pnjt2++;
                            player.sendMessage("§apnjMobEndT2 set");
                        } else if (pnjt2 == 9) {
                            game.getMap().getPnjT2().set(2, player.getLocation());
                            player.sendMessage("§apnjMobEndT2 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the pnjMobMiddleT2 first");
                        }
                        break;
                    case "pnjtoolt2":
                        if (pnjt2 == 3) {
                            game.getMap().getPnjT2().add(player.getLocation());
                            pnjt2++;
                            player.sendMessage("§apnjToolT2 set");
                        } else if (pnjt2 == 9) {
                            game.getMap().getPnjT2().set(3, player.getLocation());
                            player.sendMessage("§apnjToolT2 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the pnjMobEndT2 first");
                        }
                        break;
                    case "pnjarmort2":
                        if (pnjt2 == 4) {
                            game.getMap().getPnjT2().add(player.getLocation());
                            pnjt2++;
                            player.sendMessage("§apnjArmorT2 set");
                        } else if (pnjt2 == 9) {
                            game.getMap().getPnjT2().set(4, player.getLocation());
                            player.sendMessage("§apnjArmorT2 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the pnjToolT2 first");
                        }
                        break;
                    case "pnjfoodt2":
                        if (pnjt2 == 5) {
                            game.getMap().getPnjT2().add(player.getLocation());
                            pnjt2++;
                            player.sendMessage("§apnjFoodT2 set");
                        } else if (pnjt2 == 9) {
                            game.getMap().getPnjT2().set(5, player.getLocation());
                            player.sendMessage("§apnjFoodT2 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the pnjArmorT2 first");
                        }
                        break;
                    case "pnjslavet2":
                        if (pnjt2 == 6) {
                            game.getMap().getPnjT2().add(player.getLocation());
                            pnjt2++;
                            player.sendMessage("§apnjSlaveT2 set");
                        } else if (pnjt2 == 9) {
                            game.getMap().getPnjT2().set(6, player.getLocation());
                            player.sendMessage("§apnjSlaveT2 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the pnjFoodT2 first");
                        }
                        break;
                    case "pnjcapat2":
                        if (pnjt2 == 7) {
                            game.getMap().getPnjT2().add(player.getLocation());
                            pnjt2++;
                            player.sendMessage("§apnjCapaT2 set");
                        } else if (pnjt2 == 9) {
                            game.getMap().getPnjT2().set(7, player.getLocation());
                            player.sendMessage("§apnjCapaT2 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the pnjSlaveT2 first");
                        }
                        break;
                    case "pnjupgradet2":
                        if (pnjt2 == 8) {
                            game.getMap().getPnjT2().add(player.getLocation());
                            pnjt2++;
                            player.sendMessage("§apnjUpgradeT2 set");
                        } else if (pnjt2 == 9) {
                            game.getMap().getPnjT2().set(8, player.getLocation());
                            player.sendMessage("§apnjUpgradeT2 overwritten");
                        } else {
                            player.sendMessage("§cYou must set the pnjCapaT2 first");
                        }
                        break;
                    case "barrierelvl1t1":
                        game.getMap().getBarrierlvl1T1().add(player.getLocation());
                        player.sendMessage("§abarrierelvl1T1 set");
                        break;
                    case "barrierelvl2t1":
                        game.getMap().getBarrierlvl2T1().add(player.getLocation());
                        player.sendMessage("§abarrierelvl2T1 set");
                        break;
                    case "barrierelvl1t2":
                        game.getMap().getBarrierlvl1T2().add(player.getLocation());
                        player.sendMessage("§abarrierelvl1T2 set");
                        break;
                    case "barrierelvl2t2":
                        game.getMap().getBarrierlvl2T2().add(player.getLocation());
                        player.sendMessage("§abarrierelvl2T2 set");
                        break;
                    case "signlvl1":
                        if (signlvl1 == 0) {
                            game.getMap().getSignlvl1().add(player.getLocation());
                            signlvl1++;
                            player.sendMessage("§asignlvl1T1 set");
                        } else if (signlvl1 == 1) {
                            game.getMap().getSignlvl1().add(player.getLocation());
                            player.sendMessage("§asignlvl1T2 set");
                        } else if (signlvl1 % 2 == 0) {
                            game.getMap().getSignlvl1().set(0, player.getLocation());
                            player.sendMessage("§asignlvl1T1 overwritten");
                        } else if (signlvl1 % 2 == 1) {
                            game.getMap().getSignlvl1().set(1, player.getLocation());
                            player.sendMessage("§asignlvl1T2 overwritten");
                        }
                        break;
                    case "signlvl2":
                        if (signlvl2 == 0) {
                            game.getMap().getSignlvl2().add(player.getLocation());
                            signlvl2++;
                            player.sendMessage("§asignlvl2T1 set");
                        } else if (signlvl2 == 1) {
                            game.getMap().getSignlvl2().add(player.getLocation());
                            player.sendMessage("§asignlvl2T2 set");
                        } else if (signlvl2 % 2 == 0) {
                            game.getMap().getSignlvl2().set(0, player.getLocation());
                            player.sendMessage("§asignlvl2T1 overwritten");
                        } else if (signlvl2 % 2 == 1) {
                            game.getMap().getSignlvl2().set(1, player.getLocation());
                            player.sendMessage("§asignlvl2T2 overwritten");
                        }
                        break;
                    case "withert1":
                        game.getMap().getWitherSpawnT1().add(player.getLocation());
                        player.sendMessage("§awitherT1 set");
                        break;
                    case "withert2":
                        game.getMap().getWitherSpawnT2().add(player.getLocation());
                        player.sendMessage("§awitherT2 set");
                        break;
                    case "chestfarm":
                        game.getMap().getChest().add(player.getLocation());
                        player.sendMessage("§achest set");
                        break;

                    default:
                        player.sendMessage("§cUsage: /set <Point>");
                        break;
                }
            }

        }
        return false;
    }
}
