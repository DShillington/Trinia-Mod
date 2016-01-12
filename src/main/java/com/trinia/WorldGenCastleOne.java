package com.trinia;

import java.util.Random;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenCastleOne extends WorldGenerator {
	// J Prime Vars
	public int j1 = 0;
	public int Difference = 0;

	public WorldGenCastleOne() {

	}

	public boolean generate(World world, Random rand, int i, int j, int k) {
		for (int q9 = 0; q9 <= 9; q9++) {
			for (int q10 = 0; q10 <= 9; q10++) {
				int PosX = i + q9;
				int PosZ = k + q10;
				int current = world.getChunksLowestHorizon(PosX, PosZ);
				if (j1 < current) {
					j1 = current;
				}
			}
		}

		Difference = j1 - j;

		// This is where LayerCheck Goes

		// End
		for (int q6 = 0; q6 <= 19; q6++) {

		}

		return true;
	}

	@Override
	public boolean generate(World worldIn, Random p_180709_2_,
			BlockPos p_180709_3_) {
		return false;
	}

}
