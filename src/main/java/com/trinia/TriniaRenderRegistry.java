package com.trinia;

import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.trinia.blocks.gui.GuiHandler;
import com.trinia.blocks.gui.TileInventorySmelter;
import com.trinia.world.WorldProviderMod;

public class TriniaRenderRegistry {
	public static void loadEntities()
	{
		//Trinia Dimension
		DimensionManager.registerProviderType(TriniaMod.DIM_TRINIA_ID, WorldProviderMod.class, false);
		DimensionManager.registerDimension(TriniaMod.DIM_TRINIA_ID, TriniaMod.DIM_TRINIA_ID);
		
		//Medieval Dimension
		DimensionManager.registerProviderType(TriniaMod.DIM_MEDIEVAL_ID, WorldProviderMod.class, false);
		DimensionManager.registerDimension(TriniaMod.DIM_MEDIEVAL_ID, TriniaMod.DIM_MEDIEVAL_ID);
		
		//FUTURISTIC Dimension
		DimensionManager.registerProviderType(TriniaMod.DIM_FUTURISTIC_ID, WorldProviderMod.class, false);
		DimensionManager.registerDimension(TriniaMod.DIM_FUTURISTIC_ID, TriniaMod.DIM_FUTURISTIC_ID);
		GameRegistry.registerTileEntity(TileInventorySmelter.class, "smelter");
		
	}

	
}
