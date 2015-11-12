package com.trinia;


import com.trinia.blocks.TriniaBlocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TriniaWattleTab extends CreativeTabs {

	public TriniaWattleTab(String label) {
		super(label);
	}
	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(TriniaBlocks.wattleOne);
	}

}
