package tc.yuzko.mc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Base extends JavaPlugin {

	@Override 
	public void onEnable(){
		getLogger().info("[Trade] Plugin enabled!");
	}

	@Override
	public void onDisable(){
		getLogger().info("[Trade] Plugin disabled!");
	}

	public boolean onCommand(CommandSender caller, Command cmd,
			String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("Trade"))
			if(args.length != 3){ //If it's not /command arg0 arg1 arg2
				caller.sendMessage(ChatColor.RED + "#Trade: " + ChatColor.BLUE + "Please " +
						"use /trade <player> <amount> <price>");
				return true;
			}else{

				String target = args[0];
				Player p = Bukkit.getPlayer(target);

				if(args.length == 3){ 

					if(!p.isOnline()){
						caller.sendMessage(ChatColor.RED + "#Trade: " + 
								ChatColor.BLUE + p.getName() + ChatColor.BLUE + "Is not online!");
					}
				}else{
					for(int i = 0; i > 64; p.sendMessage(ChatColor.RED + "#Trade: " + 
							ChatColor.BLUE + "You cannot trade more than 64 of an item at once")){
						if(args[1].length() < i){
							
						}
					}
				}
			}

		return false;
	}
}
