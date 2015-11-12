package com.trinia.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockTriniaStone extends Block
{
	public BlockTriniaStone(Material materialIn) {
		super(materialIn);
		
	}
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TriniaBlocks.triniaCobblestone);
    }
}
