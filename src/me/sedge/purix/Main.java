package me.sedge.purix;

import me.sedge.purix.Commands.*;
import me.sedge.purix.Commands.classes.MageCommand;
import me.sedge.purix.Commands.classes.NinjaCommand;
import me.sedge.purix.Commands.classes.PvPCommand;
import me.sedge.purix.Commands.classes.WarriorCommand;
import me.sedge.purix.Events.KitsClass;
import me.sedge.purix.Events.classes.ArcherClass;
import me.sedge.purix.Events.classes.EventsClass;
import me.sedge.purix.listener.PlayerJoin;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main plugin;

    public void onEnable(){
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[!] Hypixel.net - KitPvP has loaded successfully");
        getServer().getPluginManager().registerEvents (new EventsClass(), this);
        getServer().getPluginManager().registerEvents(new ArcherClass(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new KitsClass(), this);
        loadConfig();

        this.getCommand("pvp").setExecutor(new PvPCommand());
        this.getCommand("mage").setExecutor(new MageCommand());
        this.getCommand("ninja").setExecutor(new NinjaCommand());
        this.getCommand("warrior").setExecutor(new WarriorCommand());
        this.getCommand("author").setExecutor(new AuthorCommand());
        this.getCommand("stats").setExecutor(new StatsCommand());
    }

    public static  Main getPlugin() {
        return plugin;
    }

    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[!] ClashMC - KitPvP has not loaded successfully");
    }

    public void loadConfig(){
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

}
