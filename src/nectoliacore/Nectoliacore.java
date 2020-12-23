package nectoliacore;


import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;




public class Nectoliacore extends JavaPlugin {
private static Plugin plugin;
	
public static Plugin getInstance() {
		
	return plugin;
}
	
	public void onEnable(){
		plugin = this;
		saveDefaultConfig();
		System.out.println("NectoliaCore - Enabled");
		getCommand("nourriture").setExecutor(new NectoliaCommands(this));
		Bukkit.getServer().getPluginManager().registerEvents(new NectoliaListeners(), this); 
		} 
	
	@Override
	public void onDisable() {
		System.out.println("NectoliaCore - Disabled");
		}
}
