package com.trinia.items;

import com.trinia.TriniaMod;

import net.minecraft.item.ItemArmor;

public class ItemInomiteArmor extends ItemArmor {

    public ItemInomiteArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TriniaMod.TriniaArmorTab);
    }
}