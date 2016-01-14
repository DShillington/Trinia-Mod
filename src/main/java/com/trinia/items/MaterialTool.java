package com.trinia.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class MaterialTool extends ItemSword{

	public MaterialTool(String unlocalizedName, ToolMaterial material) {
		super(material);
	    this.setUnlocalizedName(unlocalizedName);
	}

}
