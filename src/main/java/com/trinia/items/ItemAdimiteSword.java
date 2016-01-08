package com.trinia.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemAdimiteSword extends ItemSword{

	public ItemAdimiteSword(String unlocalizedName, ToolMaterial material) {
		super(material);
	    this.setUnlocalizedName(unlocalizedName);
	}

}
