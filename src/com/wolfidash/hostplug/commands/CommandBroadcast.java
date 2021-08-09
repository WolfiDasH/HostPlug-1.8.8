package com.wolfidash.hostplug.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandBroadcast implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player)sender;

            if(cmd.getName().equalsIgnoreCase("broadcast")) {

                if(sender.hasPermission("broadcast.use")) {

                    if(args.length == 0) {

                        sender.sendMessage("§4§4/broadcast <votremessage>");

                    }

                    if(args.length >= 1) {

                        StringBuilder broadcast = new StringBuilder("");

                        for(String morceaux : args) {

                            if(!broadcast.equals("")) broadcast.append(" ");

                            broadcast.append(morceaux);

                        }

                        Bukkit.broadcastMessage("§8[§6Broadcast§8] §r"+ broadcast);

                    }

                } else {

                    sender.sendMessage("§4§4Tu n'as pas la permissions d'effectuez ceci");

                }

            }

                return true;
            }
        return false;
    }
}