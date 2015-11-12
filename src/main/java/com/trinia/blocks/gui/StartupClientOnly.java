package com.trinia.blocks.gui;

import com.trinia.TriniaMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupClientOnly
{
	public static void preInitClientOnly()
	{
	}

	public static void initClientOnly()
	{
	Item itemBlockSimple = GameRegistry.findItem("trinia", "mbe31_block_inventory_furnace");
		ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation(TriniaMod.ASSET_PREFIX, "textures/gui/smelter.png");
		final int DEFAULT_ITEM_SUBTYPE = 0;
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockSimple, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
	}

	public static void postInitClientOnly()
	{
	}
}