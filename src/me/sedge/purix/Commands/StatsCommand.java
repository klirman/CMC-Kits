package me.sedge.purix.Commands;

import me.sedge.purix.Main;
import me.sedge.purix.Utils.Bar;
import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StatsCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args){

        Player p = (Player) sender;

        sender.sendMessage(Bar.LINE);
     sender.sendMessage("§6§lClash§e§lMC §7» §6" + sender.getName() + "§e's Statistics.");
     sender.sendMessage("");
     sender.sendMessage("§eKills:§6 " + p.getStatistic(Statistic.PLAYER_KILLS));
     sender.sendMessage("§eDeaths:§6 " + p.getStatistic(Statistic.DEATHS));
        sender.sendMessage(Bar.LINE);

     return true;
    }

}