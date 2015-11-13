package com.trinia.init;

import com.google.common.base.Function;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;
import net.minecraft.world.ColorizerGrass;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemTimeMachine extends ItemMultiTexture
{
    private static final String __OBFID = "CL_00000021";

    public ItemTimeMachine(Block block, Block block2, Function nameFunction)
    {
        super(block, block2, nameFunction);
    }
}