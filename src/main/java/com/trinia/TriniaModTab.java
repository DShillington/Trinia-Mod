package com.trinia;


import com.trinia.items.TriniaItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TriniaModTab extends CreativeTabs {

	public TriniaModTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return TriniaItems.orca;
	}

}
