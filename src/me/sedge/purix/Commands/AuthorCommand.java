package me.sedge.purix.Commands;
import me.sedge.purix.Main;
import me.sedge.purix.Utils.Bar;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AuthorCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {

        sender.sendMessage(Bar.LINE);
        sender.sendMessage("§6§lClash§e§lMC §7» §ePlugin created by:§c Sedge and bstrd.");
        sender.sendMessage(Bar.LINE);
        return true;
    }
}