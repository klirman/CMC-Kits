package me.sedge.purix.Events;

import me.sedge.purix.items.Custominventory;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class KitsClass implements Listener {

    public String prefix = (ChatColor.GREEN + "test ");

    @EventHandler
    public void InvenClick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();

        Inventory open = event.getClickedInventory();
        ItemStack item = event.getCurrentItem();

        if(open == null) {
            return;
        }
        if (open.getName().equals(ChatColor.RED + "test")) {
            event.setCancelled(true);
            if(item.equals(null) || item.hasItemMeta()){
                return;
        }
            }
            if(item.getItemMeta().getDisplayName().equals(ChatColor.RED + "✿")){
                player.closeInventory();
                Custominventory ci = new Custominventory();
                player.setHealth(20);
                ci.newInventory(player);

        }

    }
}
