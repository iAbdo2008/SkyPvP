package me.oPinqz.com;

import java.io.File;

public class FileManager {

	public void SetupFiles() {
		File MainDir = new File("plugin/SkyPvP/playerdata");
		
		if(!MainDir.exists()) {
			MainDir.mkdir();
		}
		
		
		
	}
	
	
}
