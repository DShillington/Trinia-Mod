package com.trinia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInomiteTorch extends Block 
{

	protected BlockInomiteTorch(Material materialIn) {
		super(Material.circuits);
	}
	public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean isFullCube()
    {
        return false;
    }
}