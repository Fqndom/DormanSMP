package me.gabriel.ashlynplugin;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;

public class AshlynCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            spawnTamedAnimals(player);
            player.sendMessage(ChatColor.GREEN + "Tamed animals have been spawned!");
            return true;
        }
        return false;
    }

    private void spawnTamedAnimals(Player player) {
        Location location = player.getLocation();

        // Spawn tamed Ocelot
        Ocelot ocelot = (Ocelot) player.getWorld().spawnEntity(location, EntityType.OCELOT);
        ocelot.setOwner(player);
        ocelot.setCustomName("Gabriel Christopher Kuss");
        ocelot.setCustomNameVisible(true);

        // Spawn tamed Wolf
        Wolf wolf = (Wolf) player.getWorld().spawnEntity(location, EntityType.WOLF);
        wolf.setOwner(player);
        wolf.setCustomName("Gabriel Christopher Kuss");
        wolf.setCustomNameVisible(true);
    }
}