package com.trinia.world.gen;

import java.util.Random;

import com.trinia.blocks.TriniaBlocks;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenBlueFlower extends WorldGenerator {
	
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		int i = pos.getX(), j = pos.getY(), k = pos.getZ();
		
			world.setBlockState(new BlockPos(i + 0, j + 2, k + 1), TriniaBlocks.triniaDirt.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 3, k + 1), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 7, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 7, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 7, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 8, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 8, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 8, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 9, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 9, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 9, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 2, k + 1), TriniaBlocks.triniaDirt.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 2, k + 2), TriniaBlocks.triniaStone.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 2, k + 3), TriniaBlocks.triniaStone.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 3, k + 0), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 3, k + 1), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 3, k + 2), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 3, k + 3), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 4, k + 2), TriniaBlocks.FlowerStem.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 6, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 6, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 6, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 7, k + 0), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 7, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 7, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 7, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 7, k + 4), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 8, k + 0), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 8, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 8, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 8, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 8, k + 4), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 9, k + 0), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 9, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 9, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 9, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 9, k + 4), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 10, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 10, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 10, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 0, k + 2), TriniaBlocks.triniaStone.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 1, k + 1), TriniaBlocks.triniaDirt.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 1, k + 2), TriniaBlocks.triniaStone.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 2, k + 1), TriniaBlocks.triniaStone.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 2, k + 2), TriniaBlocks.triniaDirt.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 2, k + 3), TriniaBlocks.triniaDirt.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 3, k + 0), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 3, k + 1), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 3, k + 2), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 3, k + 3), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 3, k + 4), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 4, k + 1), TriniaBlocks.FlowerStem.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 4, k + 2), TriniaBlocks.FlowerStem.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 4, k + 3), TriniaBlocks.FlowerStem.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 5, k + 2), TriniaBlocks.FlowerStem.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 6, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 6, k + 2), TriniaBlocks.FlowerStem.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 6, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 7, k + 0), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 7, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 7, k + 2), TriniaBlocks.FlowerStem.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 7, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 7, k + 4), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 8, k + 0), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 8, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 8, k + 2), TriniaBlocks.FlowerStem.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 8, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 8, k + 4), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 9, k + 0), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 9, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 9, k + 2), TriniaBlocks.FlowerStem.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 9, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 9, k + 4), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 10, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 10, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 10, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 1, k + 2), TriniaBlocks.triniaStone.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 2, k + 1), TriniaBlocks.triniaDirt.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 2, k + 2), TriniaBlocks.triniaStone.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 3, k + 0), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 3, k + 1), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 3, k + 2), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 3, k + 3), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 3, k + 4), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 4, k + 2), TriniaBlocks.FlowerStem.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 6, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 6, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 6, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 7, k + 0), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 7, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 7, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 7, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 7, k + 4), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 8, k + 0), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 8, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 8, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 8, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 8, k + 4), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 9, k + 0), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 9, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 9, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 9, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 9, k + 4), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 10, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 10, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 10, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 3, k + 1), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 3, k + 2), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 3, k + 3), TriniaBlocks.triniaGrass.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 7, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 7, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 7, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 8, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 8, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 8, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 9, k + 1), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 9, k + 2), TriniaBlocks.FlowerBlue.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 9, k + 3), TriniaBlocks.FlowerBlue.getDefaultState());

		return true;
	}
}