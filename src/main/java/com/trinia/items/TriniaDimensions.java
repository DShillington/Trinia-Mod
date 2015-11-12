package com.trinia.items;

import com.trinia.world.WorldProviderMod;

import net.minecraftforge.common.DimensionManager;

public class TriniaDimensions {
	
	public static final int dimensionId = 57;
	
	public static void init()
	{
		registerDimension();
	}

	private static void registerDimension() 
	{
		DimensionManager.registerProviderType(dimensionId, WorldProviderMod.class, false);
		DimensionManager.registerDimension(dimensionId, dimensionId);
	}

}
