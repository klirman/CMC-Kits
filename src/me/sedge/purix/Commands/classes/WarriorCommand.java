package me.sedge.purix.Commands.classes;
import me.sedge.purix.Utils.Bar;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class WarriorCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {

        sender.sendMessage(Bar.LINE);
        sender.sendMessage("§6§lClash§e§lMC §7» §4§lWarrior§6§l class.");
        sender.sendMessage("");
        sender.sendMessage("§eArmor » §e Protection 1.");
        sender.sendMessage("§eSword » Sharpness 1.");
        sender.sendMessage("§eRank » §6§lHighroller");
        sender.sendMessage(Bar.LINE);
        return true;
    }
}