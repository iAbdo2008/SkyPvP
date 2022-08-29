package me.oPinqz.com;

import org.bukkit.plugin.java.JavaPlugin;
import org.spigotmc.SpigotConfig;

public class Main extends JavaPlugin{

	FileManager FManage = new FileManager();
	
	@Override
	public void onEnable() {
		FManage.SetupFiles();
	}
	
	@Override
	public void onDisable() {
		
	}
	
	
	
	
	
	
}
