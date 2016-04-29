package com.trinia.world.biome;

import com.trinia.blocks.TriniaBlocks;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeGenBloom extends BiomeGenBase {

	public BiomeGenBloom(int par1) {
		super(par1);
		this.topBlock = TriniaBlocks.triniaGrass.getDefaultState();
		this.fillerBlock = TriniaBlocks.triniaGrass.getDefaultState();
		this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        setColor(0xffef96);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float f) {
		return 0xffef96;
    }
}