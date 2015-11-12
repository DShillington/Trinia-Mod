package com.trinia;

import com.trinia.blocks.TriniaBlocks;
import com.trinia.items.TriniaItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TriniaToolsTab extends CreativeTabs {

	public TriniaToolsTab(String label) {
		super(label);
	}
	@Override
	public Item getTabIconItem() {
		return TriniaItems.SteelPickaxe;
	}

}
