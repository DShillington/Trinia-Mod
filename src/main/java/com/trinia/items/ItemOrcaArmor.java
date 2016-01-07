package com.trinia.items;

import com.trinia.TriniaMod;

import net.minecraft.item.ItemArmor;

public class ItemOrcaArmor extends ItemArmor {

    public ItemOrcaArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TriniaMod.TriniaArmorTab);
    }
}