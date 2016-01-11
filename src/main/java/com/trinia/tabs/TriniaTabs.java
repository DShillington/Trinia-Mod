package com.trinia.tabs;

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.BlockDoublePlant;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class TriniaTabs extends CreativeTabs
{

    //private final int tabIndex;
  //  private final String tabLabel;
    /** Texture to use. */
    private String theTexture = "items.png";
  

    public TriniaTabs(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

    @SideOnly(Side.CLIENT)
    public TriniaTabs getTabIndex(String texture)
    {
    	this.theTexture = texture;
        return this;
    }

   }