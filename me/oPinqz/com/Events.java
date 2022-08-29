package me.oPinqz.com;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class Events implements Listener{

	
	Main main = Main.getPlugin(Main.class);
	
	public void onJoin(PlayerJoinEvent e) {
		
		
		
	}
	
	public void onHunger(FoodLevelChangeEvent e) {
		Player p = (Player) e.getEntity();
		
		e.setCancelled(true);
		p.setFoodLevel(20);
	}
	
	public void onItemConsume(PlayerItemConsumeEvent e) {
		e.setCancelled(true);
	}
	
	public void onDeath(PlayerDeathEvent e) {
		
		Player p = e.getEntity();
		Player killer = p.getKiller();
		
		e.setDeathMessage("§7| §3Sky§cPvP §7| §c" + killer.getName() + " §aHas Killed The Player §e" + p.getName());
		
		
		
	}
	
}
