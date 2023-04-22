package fr.fanto.monsterindustries.commands;

import fr.fanto.monsterindustries.MonsterIndustriesGame;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class RestartCommand implements CommandExecutor {

        static private MonsterIndustriesGame monsterIndustriesGame;
        public RestartCommand(MonsterIndustriesGame monsterIndustriesGame) {
            this.monsterIndustriesGame = monsterIndustriesGame;
        }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }
}
