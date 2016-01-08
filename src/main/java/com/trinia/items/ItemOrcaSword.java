package com.trinia.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemOrcaSword extends ItemSword{

	public ItemOrcaSword(String unlocalizedName, ToolMaterial material) {
		super(material);
	    this.setUnlocalizedName(unlocalizedName);
	}

}
