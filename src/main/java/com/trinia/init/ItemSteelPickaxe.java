package com.trinia.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemSteelPickaxe extends ItemPickaxe{

	public ItemSteelPickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
	    this.setUnlocalizedName(unlocalizedName);
	}

}
