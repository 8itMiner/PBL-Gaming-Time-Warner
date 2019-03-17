package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ui.Welcome;

public class AreGamesRunning {
	
	static boolean CheckAreGamesRunning() throws IOException {
		String line;
		String pidInfo = "";

		Process p = Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");

		BufferedReader input =  new BufferedReader(new InputStreamReader(p.getInputStream()));

		while ((line = input.readLine()) != null) {
		    pidInfo+=line; 
		}

		input.close();
		
		boolean areGamesRunning = false;

		if(pidInfo.contains("steam.exe"))
		{
		    areGamesRunning = true;
		}
		
		else if(pidInfo.contains("discord.exe")) {
			areGamesRunning = true;
		}
		
		else if(pidInfo.contains("fortnite.exe")) {
			areGamesRunning = true;
		}
		
		else if(pidInfo.contains("pubg.exe")) {
			areGamesRunning = true;
		}
		
		return areGamesRunning;
	}
	
	public static void main(String[] args) throws IOException {
		boolean areGamesRunning = CheckAreGamesRunning();
		String string = Boolean.toString(areGamesRunning);
		System.out.println(string);
		
		if(areGamesRunning == true) {
			Welcome.main(null);
		}
	}
	
}


