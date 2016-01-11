package com.trinia.gui;

import com.trinia.handler.ConfigurationHandler;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;

public class GuiTriniaConfig extends GuiConfig {

	public GuiTriniaConfig(GuiScreen parent)
	{
		super(parent, new ConfigElement(ConfigurationHandler.config.getCategory(ConfigurationHandler.CATEGORY_SETTINGS)).getChildElements(), "trinia", false, false, GuiConfig.getAbridgedConfigPath(ConfigurationHandler.config.toString()));
	}
	
}
