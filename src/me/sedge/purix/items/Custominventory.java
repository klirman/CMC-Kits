package me.sedge.purix.items;

import me.sedge.purix.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class Custominventory implements Listener {

    private Plugin plugin = Main.getPlugin(Main.class);

    public void newInventory(Player player){
        Inventory i = plugin.getServer().createInventory(null,27, ChatColor.RED + "Clash");
        int healthint = (int) player.getHealth();
        int foodint = player.getFoodLevel();
        int levelint = player.getLevel();

        ItemStack empty = new ItemStack(Material.AIR, 1);
        ItemMeta emptyMeta = empty.getItemMeta();
        emptyMeta.setDisplayName("");
        empty.setItemMeta(emptyMeta);

        ItemStack health =  new ItemStack(Material.INK_SACK, healthint, (byte) 10);
        ItemMeta hmeta = health.getItemMeta();
        hmeta.setDisplayName(ChatColor.RED + "❤");
        health.setItemMeta(hmeta);

        ItemStack food =  new ItemStack(Material.BAKED_POTATO, foodint);
        ItemMeta fmeta = food.getItemMeta();
        hmeta.setDisplayName(ChatColor.RED + "✿");
        food.setItemMeta(fmeta);

        ItemStack level =  new ItemStack(Material.NETHER_STAR, levelint);
        ItemMeta cmeta = level.getItemMeta();
        hmeta.setDisplayName(ChatColor.RED + "★");
        level.setItemMeta(cmeta);


        i.setItem(0, empty);
        i.setItem(1, empty);
        i.setItem(2, health);
        i.setItem(3, empty);
        i.setItem(4, level);
        i.setItem(5, empty);
        i.setItem(6, food);
        i.setItem(7, empty);
        i.setItem(8, empty);

        player.openInventory(i);
    }

}
