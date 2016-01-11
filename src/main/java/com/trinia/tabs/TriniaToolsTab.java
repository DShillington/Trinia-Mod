package com.trinia.tabs;

import com.trinia.blocks.TriniaBlocks;
import com.trinia.items.TriniaItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TriniaToolsTab extends CreativeTabs {

	public TriniaToolsTab(String label) {
		super(label);
		this.setBackgroundImageName("Trinia.png");
	}
	
	@Override
	public Item getTabIconItem() {
		return TriniaItems.toolsAnimated;
	}

}
