package com.trinia;


import com.trinia.blocks.TriniaBlocks;
import com.trinia.items.TriniaItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

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
