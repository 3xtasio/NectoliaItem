package nectoliacore;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class NectoliaCommands implements CommandExecutor {

	public NectoliaCommands(Nectoliacore nectoliacore) {
		// TODO Auto-generated constructor stub
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
	    if (label.equalsIgnoreCase("nourriture")){
	    	if(!player.hasPermission("nourriture")){
	    		player.sendMessage("§cVous n'avez pas la permission.");
	         }else{
	             StringBuilder builder = new StringBuilder();
	             for(int i = 0; i < args.length; i++){
	                builder.append(args).append(" ");
	             }
	             String m = builder.toString();
	             m = m.replaceAll("&", "§");
	             if(sender instanceof Player){
	            	if (args.length == 1) {
		                if(args[0].equalsIgnoreCase("speed")){
		                	ItemStack ispeed = Nectoliacore.getInstance().getConfig().getItemStack("Main.item.speed");
		                    player.getInventory().addItem(ispeed);
		                    player.updateInventory();
		                }
		                if(args[0].equalsIgnoreCase("force")){
		                    ItemStack iforce = Nectoliacore.getInstance().getConfig().getItemStack("Main.item.force");
		                    player.getInventory().addItem(iforce);
			                
		                }    
			            if(args[0].equalsIgnoreCase("regen")){
		                    ItemStack iregen = Nectoliacore.getInstance().getConfig().getItemStack("Main.item.regen");
		                    player.getInventory().addItem(iregen);
				            
			            }    
			            if(args[0].equalsIgnoreCase("fire")){
		                    ItemStack ifire = Nectoliacore.getInstance().getConfig().getItemStack("Main.item.fire");
		                    player.getInventory().addItem(ifire);
			            }
		                if(args[0].equalsIgnoreCase("help")){
			                player.sendMessage("§7----- §6§lNourritureNectolia §7-----");
			                player.sendMessage(" ");
			                player.sendMessage("§7Type: §bpatatespeed§7, §bpatateforce§7, §bpatateregen§7, §bpatatefire");
			                player.sendMessage(" ");
			                player.sendMessage(" ");
			                player.sendMessage("§7Version : §81.2");
			                player.sendMessage("§7Made by : §8Extasio15");
			                player.sendMessage("§7--------------");
		                }  
		                }else{
		                   player.sendMessage("§6§lNectolia §7>> §cVous devez faire /nourriture <objet>");
		                } 
	            	}else{
	            		player.sendMessage("§6§lNectolia §7>> §cVous devez faire /nourriture <objet>");
	            	}
		                }
		    }
		return true;
	}
}	             