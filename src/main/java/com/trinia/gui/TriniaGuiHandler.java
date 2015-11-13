package com.trinia.gui;

import com.trinia.blocks.gui.ContainerSCT;
import com.trinia.blocks.gui.GuiCraftingTable;
import com.trinia.tileentity.TileEntityTriniaWorkBench;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class TriniaGuiHandler {
	public static final int TRINIA_TILE_ENTITY_GUI = 0;

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	    if (ID == TRINIA_TILE_ENTITY_GUI)
	        return new ContainerSCT(player.inventory, (TileEntityTriniaWorkBench) world.getTileEntity(new BlockPos(x, y, z)), world, null);

	    return null;
	}

}
