package com.trinia.tabs;


import com.trinia.blocks.TriniaBlocks;
import com.trinia.items.TriniaItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TriniaBlocksTab extends CreativeTabs {
	
	public TriniaBlocksTab(String label) {
		super(label);
		this.setBackgroundImageName("Trinia.png");
		
	}

	

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(TriniaBlocks.triniaGrass);
	}

}
