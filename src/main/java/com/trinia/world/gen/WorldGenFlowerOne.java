package com.trinia.world.gen;

import java.util.Random;

import com.trinia.blocks.TriniaBlocks;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenFlowerOne extends WorldGenerator {
	
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		int i = pos.getX(), j = pos.getY(), k = pos.getZ();
		
world.setBlockState(new BlockPos( i + 0, j + 4, k + 2), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 0, j + 4, k + 3), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 0, j + 4, k + 4), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 0, j + 11, k + 2), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 0, j + 11, k + 3), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 0, j + 11, k + 4), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 0, j + 12, k + 2), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 0, j + 12, k + 3), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 0, j + 12, k + 4), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 1, j + 4, k + 1), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 1, j + 4, k + 2), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 1, j + 4, k + 3), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 1, j + 4, k + 4), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 1, j + 4, k + 5), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 1, j + 10, k + 2), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 1, j + 10, k + 3), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 1, j + 10, k + 4), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 1, j + 11, k + 1), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 1, j + 11, k + 2), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 1, j + 11, k + 3), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 1, j + 11, k + 4), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 1, j + 11, k + 5), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 1, j + 12, k + 1), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 1, j + 12, k + 5), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 4, k + 0), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 4, k + 1), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 4, k + 2), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 4, k + 3), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 4, k + 4), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 4, k + 5), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 4, k + 6), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 7, k + 3), TriniaBlocks.FlowerStem.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 8, k + 3), TriniaBlocks.FlowerStem.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 9, k + 3), TriniaBlocks.FlowerStem.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 10, k + 2), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 10, k + 3), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 10, k + 4), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 11, k + 1), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 11, k + 2), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 11, k + 4), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 11, k + 5), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 12, k + 1), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 2, j + 12, k + 5), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 4, k + 0), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 4, k + 1), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 4, k + 2), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 4, k + 3), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 4, k + 4), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 4, k + 5), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 4, k + 6), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 5, k + 3), TriniaBlocks.FlowerStem.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 6, k + 3), TriniaBlocks.FlowerStem.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 10, k + 2), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 10, k + 3), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 10, k + 4), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 11, k + 1), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 11, k + 2), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 11, k + 3), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 11, k + 4), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 11, k + 5), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 12, k + 1), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 3, j + 12, k + 5), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 4, j + 4, k + 1), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 4, j + 4, k + 2), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 4, j + 4, k + 3), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 4, j + 4, k + 4), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 4, j + 4, k + 5), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 4, j + 11, k + 2), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 4, j + 11, k + 3), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 4, j + 11, k + 4), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 4, j + 12, k + 2), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 4, j + 12, k + 3), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 4, j + 12, k + 4), TriniaBlocks.FlowerPurple.getDefaultState());
		world.setBlockState(new BlockPos( i + 5, j + 4, k + 2), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 5, j + 4, k + 3), TriniaBlocks.triniaGrass.getDefaultState());
		world.setBlockState(new BlockPos( i + 5, j + 4, k + 4), TriniaBlocks.triniaGrass.getDefaultState());

		return true;
	}
}