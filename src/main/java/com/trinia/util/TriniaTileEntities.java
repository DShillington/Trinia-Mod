package com.trinia.util;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.trinia.tileentity.TileEntityTriniaWorkBench;

public class TriniaTileEntities {
	// hi
	public static TileEntity tiletriniaTable;

	public static void init() {
		GameRegistry.registerTileEntity(TileEntityTriniaWorkBench.class,
				"tiletriniaTable");
	}

	public static void register() {
	}

}
