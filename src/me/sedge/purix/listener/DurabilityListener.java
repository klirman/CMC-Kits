package me.sedge.purix.listener;


import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class DurabilityListener implements Listener {
    public static List<Material> ALLOWED;

    public DurabilityListener() {
    }

    @EventHandler
    public void onArmorDamage(PlayerItemDamageEvent event) {
        ItemStack item = event.getItem();
        if(item != null && ALLOWED.contains(item.getType()) && ThreadLocalRandom.current().nextInt(3) != 0);
        event.setCancelled(true);
    }


   static {
    ALLOWED = Arrays.asList(new Material[]{Material.DIAMOND_HELMET, Material.DIAMOND_CHESTPLATE, Material.DIAMOND_LEGGINGS, Material.DIAMOND_BOOTS, Material.IRON_HELMET, Material.IRON_CHESTPLATE, Material.IRON_LEGGINGS, Material.IRON_BOOTS});
        }
}