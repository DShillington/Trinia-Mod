package com.trinia.events;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler
{
	public static Configuration config;

	public static final String CATEGORY_RECIPE_SETTINGS = "recipe-settings";
	public static final String CATEGORY_API = "recipe-api";
	public static final String CATEGORY_SETTINGS = "settings";

	public static String[] items = new String[0];
	public static boolean canDisplay = true;
	public static boolean hasDisplayedOnce = false;
	public static boolean api_debug = true;

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
		api_debug = config.getBoolean("recipe-api-debug", CATEGORY_SETTINGS, true, "If true, prints out information about RecipeAPI. Recommended 'true' for people trying to add custom recipe.");
		canDisplay = config.getBoolean("display", CATEGORY_SETTINGS, canDisplay, "Enabled or disable the welcome message");
		items = config.getStringList("custom-recipes", CATEGORY_API, items, "Insert custom recipes here");
		config.addCustomCategoryComment(CATEGORY_RECIPE_SETTINGS, "Enabled or disable the default recipes");
		config.addCustomCategoryComment(CATEGORY_API, "RecipeAPI Configuration. How to use: http://mrcrayfishs-furniture-mod.wikia.com/wiki/Configuration");
		updateEnabledRecipes();

		if (config.hasChanged() && shouldChange)
		{
			
		}
		config.save();
	}

	private static void updateEnabledRecipes()
	{
		
	}

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs)
	{
		if (eventArgs.modID.equals("cfm"))
		{
			loadConfig(true);
		}
	}
}
