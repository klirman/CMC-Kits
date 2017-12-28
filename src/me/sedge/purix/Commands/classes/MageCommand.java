package me.sedge.purix.Commands.classes;
import me.sedge.purix.Utils.Bar;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MageCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {

        sender.sendMessage(Bar.LINE);
        sender.sendMessage("§6§lClash§e§lMC §7» §d§lMage§6§l class.");
        sender.sendMessage("");
        sender.sendMessage("§eArmor §7» §e Protection 1.");
        sender.sendMessage("§eSword §7» Sharpness 1.");
        sender.sendMessage("§eRank §7» §aVIP");
        sender.sendMessage(Bar.LINE);
        return true;
    }
}