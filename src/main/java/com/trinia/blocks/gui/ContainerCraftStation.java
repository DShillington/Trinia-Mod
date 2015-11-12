package com.trinia.blocks.gui;

import com.trinia.tileentity.TileEntityTriniaWorkBench;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerCraftStation extends Container
{
	private IInventory freezerInventory;

	public ContainerCraftStation(IInventory playerInventory, IInventory freezerInventory)
	{
		this.freezerInventory = freezerInventory;
		freezerInventory.openInventory(null);

		
		
		
	}

	@Override
	public boolean canInteractWith(EntityPlayer par1EntityPlayer)
	{
		return this.freezerInventory.isUseableByPlayer(par1EntityPlayer);
	}


}