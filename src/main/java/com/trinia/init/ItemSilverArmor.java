package com.trinia.init;

import com.trinia.TriniaMod;

import net.minecraft.item.ItemArmor;

public class ItemSilverArmor extends ItemArmor {

    public ItemSilverArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TriniaMod.TriniaToolsTab);
    }
}