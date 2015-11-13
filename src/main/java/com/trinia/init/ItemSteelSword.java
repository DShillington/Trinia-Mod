package com.trinia.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemSteelSword extends ItemSword{

	public ItemSteelSword(String unlocalizedName, ToolMaterial material) {
		super(material);
	    this.setUnlocalizedName(unlocalizedName);
	}

}
