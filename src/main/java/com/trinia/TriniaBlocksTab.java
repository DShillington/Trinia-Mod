package com.trinia;


import com.trinia.items.TriniaItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TriniaBlocksTab extends CreativeTabs {

	public TriniaBlocksTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return TriniaItems.goldenKey;
	}

}
