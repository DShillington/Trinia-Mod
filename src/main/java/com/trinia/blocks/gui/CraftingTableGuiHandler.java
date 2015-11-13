package com.trinia.blocks.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;



public class CraftingTableGuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		System.out.println("GUIHANDLER2");
		if(ID == 1){
			return new ContainerSCT(player.inventory, world, x , y, z);
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		System.out.println("GUIHANDLER");
		if(ID == 1){
			System.out.println("Test2");
			return new GuiCraftingTable(player.inventory, world, x , y, z);
			}
		return null;
	}

}
