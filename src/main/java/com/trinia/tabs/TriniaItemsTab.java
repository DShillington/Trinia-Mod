package com.trinia.tabs;


import com.trinia.items.TriniaItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TriniaItemsTab extends CreativeTabs {

	public TriniaItemsTab(String label) {
		super(label);
		this.setBackgroundImageName("TriniaNoScroll.png");
		this.setNoScrollbar();
	}

	@Override
	public Item getTabIconItem() {
		return TriniaItems.itemsAnimated;
	}

}
