package com.trinia.tabs;

import com.trinia.blocks.TriniaBlocks;
import com.trinia.items.TriniaItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class TriniaArmorTab extends CreativeTabs {

	public TriniaArmorTab(String label) {
		super(label);
		this.setBackgroundImageName("TriniaNoScroll.png");
		this.setNoScrollbar();
		}
	@Override
	public Item getTabIconItem() {
		return TriniaItems.armorAnimated;
	}

}
