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
	public static void loadEntities() {

		// Medieval Dimension
		DimensionManager.registerProviderType(TriniaMod.DIM_TRINIA_ID,
				WorldProviderMod.class, false);
		DimensionManager.registerDimension(TriniaMod.DIM_TRINIA_ID,
				TriniaMod.DIM_TRINIA_ID);

		GameRegistry.registerTileEntity(TileInventorySmelter.class, "smelter");

	}

}
