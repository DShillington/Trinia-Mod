package com.trinia.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {
	
	public static Configuration config;
	
	public static boolean triniaMenu = true;
	public static boolean canDisplay = true;
	
	public static final String CATEGORY_SETTINGS = "settings";
	
	public static void init(File file)
	{
		if (config == null)
		{
			config = new Configuration(file);
			loadConfig(false);
		}
	}
	public static void loadConfig(boolean shouldChange)
	{
		triniaMenu = config.getBoolean("background-choice", CATEGORY_SETTINGS, true, "Determines if you use Trinia or Default Main Menu.");
		canDisplay = config.getBoolean("display", CATEGORY_SETTINGS, canDisplay, "Enabled or disable the welcome message");
		
		
		config.save();
	}
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs)
	{
		if (eventArgs.modID.equals("trinia"))
		{
			loadConfig(true);
		}
	}
}
