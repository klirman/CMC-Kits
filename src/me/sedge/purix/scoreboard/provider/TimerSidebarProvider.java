package me.sedge.purix.scoreboard.provider;

import me.sedge.purix.Main;
import me.sedge.purix.Utils.Bar;
import me.sedge.purix.scoreboard.SidebarEntry;
import me.sedge.purix.scoreboard.SidebarProvider;
import org.bukkit.ChatColor;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;

import java.util.*;

public class TimerSidebarProvider implements SidebarProvider {

    protected static String STRAIGHT_LINE = Bar.LINE.substring(0, 14);

    private Main plugin;

    public TimerSidebarProvider(Main plugin) {
        this.plugin = plugin;
    }

    public SidebarEntry add(String s) {

        if (s.length() < 10) {
            return new SidebarEntry(s);
        }

        if (s.length() > 10 && s.length() < 20) {
            return new SidebarEntry(s.substring(0, 10), s.substring(10, s.length()), "");
        }

        if (s.length() > 20) {
            return new SidebarEntry(s.substring(0, 10), s.substring(10, 20), s.substring(20, s.length()));
        }

        return null;
    }

    @Override
    public String getTitle() {
        return ChatColor.translateAlternateColorCodes('&',"&6KitPvP");
    }

    @Override
    public List<SidebarEntry> getLines(Player player) {
        List<SidebarEntry> lines = new ArrayList<>();


        lines.add(new SidebarEntry(ChatColor.translateAlternateColorCodes('&', "&4Kills&7: &c" + player.getStatistic(Statistic.PLAYER_KILLS))));

        if (!lines.isEmpty()) {
            lines.add(0, new SidebarEntry(ChatColor.GRAY, STRAIGHT_LINE, STRAIGHT_LINE));
            lines.add(lines.size(), new SidebarEntry(ChatColor.GRAY, ChatColor.STRIKETHROUGH + STRAIGHT_LINE, STRAIGHT_LINE));
        }

        return lines;
    }
}
