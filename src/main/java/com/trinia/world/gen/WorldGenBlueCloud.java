package com.trinia.world.gen;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.google.common.base.Predicate;
import com.trinia.blocks.TriniaBlocks;

public class WorldGenBlueCloud extends WorldGenerator {
	
    private final IBlockState stone;
    private final int numberOfBlocks;
    private final Predicate replace;
    
    public WorldGenBlueCloud() {
    	stone = TriniaBlocks.bluecloud.getDefaultState();
    	numberOfBlocks = 60;
    	replace = BlockHelper.forBlock(Blocks.air);
    }

    @Override
    public boolean generate(World w, Random r, BlockPos pos) {
    	int x1 = pos.getX(), y1 = pos.getY(), z1 = pos.getZ();
        float f = r.nextFloat() * (float)Math.PI;
        double d0 = (double)((float)(pos.getX() + 8) + MathHelper.sin(f) * (float)this.numberOfBlocks / 8.0F);
        double d1 = (double)((float)(pos.getX() + 8) - MathHelper.sin(f) * (float)this.numberOfBlocks / 8.0F);
        double d2 = (double)((float)(pos.getZ() + 8) + MathHelper.cos(f) * (float)this.numberOfBlocks / 8.0F);
        double d3 = (double)((float)(pos.getZ() + 8) - MathHelper.cos(f) * (float)this.numberOfBlocks / 8.0F);
        double d4 = (double)(pos.getY() + r.nextInt(3) - 2);
        double d5 = (double)(pos.getY() + r.nextInt(3) - 2);
        for(int i = 0; i < this.numberOfBlocks; i++) {
            float f1 = (float)i / (float)this.numberOfBlocks;
            double d6 = d0 + (d1 - d0) * (double)f1;
            double d7 = d4 + (d5 - d4) * (double)f1;
            double d8 = d2 + (d3 - d2) * (double)f1;
            double d9 = r.nextDouble() * (double)this.numberOfBlocks / 16.0D;
            double d10 = (double)(MathHelper.sin((float)Math.PI * f1) + 1.0F) * d9 + 1.0D;
            double d11 = (double)(MathHelper.sin((float)Math.PI * f1) + 1.0F) * d9 + 1.0D;
            int j = MathHelper.floor_double(d6 - d10 / 2.0D);
            int k = MathHelper.floor_double(d7 - d11 / 2.0D);
            int l = MathHelper.floor_double(d8 - d10 / 2.0D);
            int i1 = MathHelper.floor_double(d6 + d10 / 2.0D);
            int j1 = MathHelper.floor_double(d7 + d11 / 2.0D);
            int k1 = MathHelper.floor_double(d8 + d10 / 2.0D);
            for(int l1 = j; l1 <= i1; ++l1) {
                double d12 = ((double)l1 + 0.5D - d6) / (d10 / 2.0D);
                if(d12 * d12 < 1.0D) {
                    for(int i2 = k; i2 <= j1; ++i2) {
                        double d13 = ((double)i2 + 0.5D - d7) / (d11 / 2.0D);
                        if(d12 * d12 + d13 * d13 < 1.0D) {
                            for(int j2 = l; j2 <= k1; ++j2) {
                                double d14 = ((double)j2 + 0.5D - d8) / (d10 / 2.0D);
                                if(d12 * d12 + d13 * d13 + d14 * d14 < 1.0D) {
                                    BlockPos blockpos1 = new BlockPos(l1, i2, j2);
                                    int x = blockpos1.getX(), y = blockpos1.getY(), z = blockpos1.getZ();
                                    if(w.getBlockState(blockpos1).getBlock().isReplaceableOreGen(w, blockpos1, this.replace)) {
                                    	w.setBlockState(new BlockPos(x, y, z), TriniaBlocks.bluecloud.getDefaultState(), 2);
                                    	w.setBlockState(new BlockPos(x, y - 1, z), TriniaBlocks.bluecloud.getDefaultState(), 2);
                                    	w.setBlockState(new BlockPos(x, y - 2, z), this.stone, 2);
                                    	w.setBlockState(new BlockPos(x, y - 3, z), this.stone, 2);
                                    	
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        return true;
    }
}