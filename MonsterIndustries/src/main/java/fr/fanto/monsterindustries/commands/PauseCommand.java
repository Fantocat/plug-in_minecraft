package fr.fanto.monsterindustries.commands;

import fr.fanto.monsterindustries.MonsterIndustriesGame;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class PauseCommand implements CommandExecutor {

        static private MonsterIndustriesGame monsterIndustriesGame;
        public PauseCommand(MonsterIndustriesGame monsterIndustriesGame) {
            this.monsterIndustriesGame = monsterIndustriesGame;
        }



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }
}
