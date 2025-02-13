package me.gabriel.ashlynplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class AshlynPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register the command
        this.getCommand("ashlyn").setExecutor(new AshlynCommand());
    }
}