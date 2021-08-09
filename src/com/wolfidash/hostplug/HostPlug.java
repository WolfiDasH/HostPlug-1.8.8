package com.wolfidash.hostplug;

import com.wolfidash.hostplug.commands.CommandBroadcast;
import com.wolfidash.hostplug.commands.CommandBvn;
import com.wolfidash.hostplug.commands.CommandWarn;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class HostPlug extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("Plugin Enabled !");
        System.out.println("Version : 1.0");
        getCommand("bvn").setExecutor(new CommandBvn());
        getCommand("broadcast").setExecutor(new CommandBroadcast());
        getCommand("warn").setExecutor(new CommandWarn());
    }

    @Override
    public void onLoad() {
        System.out.println("Loading...");
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin Disabled !");
    }
}
