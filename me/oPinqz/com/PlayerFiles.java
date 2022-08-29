package me.oPinqz.com;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class PlayerFiles {
	
	
	public void SetupPlayer(Player p) {
		File PlayerData = new File("plugins/SkyPvP/playerdata/" + p.getName() + ".yml");
		if(!PlayerData.exists())
		{
			try {
				PlayerData.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		YamlConfiguration yml = YamlConfiguration.loadConfiguration(PlayerData);
		yml.addDefault("Name", p.getName());
		yml.addDefault("Kills", 0);
		yml.addDefault("Deaths", 0);
		yml.addDefault("Rank", "Trainer");
		yml.addDefault("Points", 0);
		yml.options().copyDefaults(true);
		
		try {
			yml.save(PlayerData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getKills(Player p) {
		File PlayerData = new File("plugins/SkyPvP/playerdata/" + p.getName() + ".yml");
		YamlConfiguration yml = YamlConfiguration.loadConfiguration(PlayerData);
		return yml.getInt("Kills");
	}
	
	public int getDeaths(Player p) {
		File PlayerData = new File("plugins/SkyPvP/playerdata/" + p.getName() + ".yml");
		YamlConfiguration yml = YamlConfiguration.loadConfiguration(PlayerData);
		
		return yml.getInt("Deaths");
	}
	
	public int getPoints(Player p) {
		File PlayerData = new File("plugins/SkyPvP/playerdata/" + p.getName() + ".yml");
		YamlConfiguration yml = YamlConfiguration.loadConfiguration(PlayerData);
		
		return yml.getInt("Points");
	}
	
	public String getRank(Player p) {
		File PlayerData = new File("plugins/SkyPvP/playerdata/" + p.getName() + ".yml");
		YamlConfiguration yml = YamlConfiguration.loadConfiguration(PlayerData);
		
		return yml.getString("Rank");
	}

}
