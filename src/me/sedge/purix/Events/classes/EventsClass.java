// » Created by Sedge & bstrd.
// » Last updated (09/12/17)
// » Version BETA

package me.sedge.purix.Events.classes;

import me.sedge.purix.Main;
import me.sedge.purix.Utils.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.block.Action;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.*;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EventsClass implements Listener {
    ItemStack frespot;
    ItemStack healthpot;
    ItemStack speedpot;
    ItemStack sword;
    ItemStack bow;
    ItemStack soup;

    ItemStack ironhelmet;
    ItemStack ironchestplate;
    ItemStack ironleggings;
    ItemStack ironboots;

    public EventsClass(Main plugin) {
        this.healthpot = new ItemBuilder(Material.POTION, 1).data((short)16421).build();
        this.speedpot = new ItemBuilder(Material.POTION, 1).data((short)8226).build();
        this.frespot = new ItemBuilder(Material.POTION, 1).data((short)8259).build();
        this.sword = new ItemBuilder(Material.DIAMOND_SWORD, 1).build();
        this.bow = new ItemBuilder(Material.BOW, 1).build();
        this.soup = new ItemBuilder(Material.MUSHROOM_SOUP, 1).build();

        this.ironhelmet = new ItemBuilder(Material.IRON_HELMET, 1).build();
        this.ironchestplate = new ItemBuilder(Material.IRON_CHESTPLATE, 1).build();
        this.ironleggings = new ItemBuilder(Material.IRON_LEGGINGS, 1).build();
        this.ironboots = new ItemBuilder(Material.IRON_BOOTS, 1).build();
    }

    public EventsClass() {

    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        Action action = event.getAction();
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        ItemStack frespot;
        ItemStack healthpot;
        ItemStack speedpot;



        if(action == (Action.LEFT_CLICK_BLOCK));{
            if(block.getType() == (Material.DIAMOND_BLOCK)) {

                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100000000, 0));

                ItemStack ironhelmet = new ItemStack(Material.IRON_HELMET, 1);
                ironhelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);

                ItemStack ironchestplate = new ItemStack(Material.IRON_CHESTPLATE, 1);
                ironchestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);

                ItemStack ironleggings = new ItemStack(Material.IRON_LEGGINGS, 1);
                ironleggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);

                ItemStack ironboots = new ItemStack(Material.IRON_BOOTS, 1);
                ironboots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);

                ItemStack sword = new ItemStack(Material.DIAMOND_SWORD, 1);
                sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);
                sword.addEnchantment(Enchantment.DURABILITY, 3);

                ItemStack bow = new ItemStack(Material.BOW,1 );
                bow.addEnchantment(Enchantment.ARROW_DAMAGE, 2);
                bow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 1);

                player.sendMessage(ChatColor.DARK_PURPLE + "");
                player.sendMessage("§7§l(§6§lClash§e§lKits§7§l)  " + ChatColor.YELLOW + "You have received the" + ChatColor.DARK_AQUA + " PvP class.");
                player.sendMessage(ChatColor.DARK_PURPLE + "");

                PlayerInventory pi = player.getInventory();
                pi.setItem(0, sword);
                pi.setItem(1, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(2, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(3, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(4, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(5, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(6, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(7, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(8, new ItemStack(Material.GOLDEN_CARROT, 32));
                pi.setItem(9, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(10, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(11, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(12, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(13, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(14, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(15, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(16, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(17, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(18, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(19, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(20, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(21, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(22, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(23, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(24, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(25, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(26, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(27, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(28, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(29, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(30, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(31, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(32, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(33, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(34, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setItem(35, new ItemStack(Material.MUSHROOM_SOUP, 1));
                pi.setBoots(ironboots);
                pi.setLeggings(ironleggings);
                pi.setChestplate(ironchestplate);
                pi.setHelmet(ironhelmet);



            }else{
                //player.sendMessage(ChatColor.RED + "Block: " + block.getType().toString().toUpperCase());
            }
        }
    }
 }