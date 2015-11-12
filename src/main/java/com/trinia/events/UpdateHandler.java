package com.trinia.events;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import com.trinia.Reference;

import net.minecraft.launchwrapper.LogWrapper;

public class UpdateHandler 
{
// I have a variable that is my current version of my mod, which is "1.7.10 R1"
	private static String currentVersion = Reference.VERSION;
// This will be set later once we connect to internet and get the latest version
	private static String newestVersion;
// This is just a placeholder for the message that will be sent to the player
	public static String updateStatus = "NULL";
// I only out of date message to display once per session, not every time the player logs in and out.
	public static boolean show = false;

public static void init() {
	// Our method for getting the newest version
	getNewestVersion();

	// So if we do connect, cause by default newestVersion is not set, we will compare the strings
	if(newestVersion != null) {
	//Compare new version with running version
	if(newestVersion.equalsIgnoreCase(currentVersion)) {
	updateStatus = "§a[Trinia Mod] is up to date!";
	// Part of my log helper.
	LogWrapper.info("Trinia Mod is up to date!");
	}else {
	show = true;
	updateStatus = "§c[Trinia Mod] out of date! Your Version: " + currentVersion + " §cLatest Version: " + newestVersion;
	LogWrapper.info("Trinia Mod out of date! Your Version: " + currentVersion + " Latest Version: " + newestVersion);
	}
	}else {
	show = true;
	updateStatus = "[Trinia Mod] Failed to connect to check if update is available!";
	LogWrapper.info("Failed to connect to check if update is available!");
}
}

private static void getNewestVersion() {
// We use a try/catch incase something goes wrong AKA server is down, or no internet connection
try {
URL url = new URL("http://www.ugwgaming.com/minecraft/mods/dyeablebeds/version.txt");
Scanner s = new Scanner(url.openStream());
// The way I did this, well I have a space in my version so that why I add a space in and get the next
newestVersion = s.next();
newestVersion = newestVersion + " " + s.next();
// Close your connection!
s.close();
}
catch(IOException ex) {
ex.printStackTrace();
// Part of my log helper!
LogWrapper.info("Could not connect to determine if mod was up to date!");
}
}
}