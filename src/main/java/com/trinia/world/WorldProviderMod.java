package com.trinia.world;

import com.trinia.TriniaMod;
import com.trinia.world.biome.TriniaBiomes;

import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderMod extends WorldProvider {
	
	@Override
	public void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerHell(TriniaBiomes.biomeBloom, 0.5F);
		this.dimensionId = TriniaMod.DIM_TRINIA_ID;
	}
	
	@Override
	public IChunkProvider createChunkGenerator() {
		return new ChunkProviderTrinia(this.worldObj, this.worldObj.getSeed());
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public Vec3 getFogColor(float f1, float f2) {
    	return new Vec3(0.0D,5.0D,5.0D);
    }

	@Override
    public boolean canRespawnHere() {
        return false;
    }

	@Override
    public boolean isSurfaceWorld() {
        return false;
    }

	@Override
    @SideOnly(Side.CLIENT)
    public float getCloudHeight() {
        return 0.5F;
    }

	@Override
    public int getAverageGroundLevel() {
        return 63;
    }

	@Override
    @SideOnly(Side.CLIENT)
    public boolean doesXZShowFog(int x, int z) {
        return false;
    }

	@Override
    public String getDimensionName() {
        return "Trinia";
    }

	@Override
	public String getSaveFolder() {
		return getDimensionName();
	}

	@Override
	public String getInternalNameSuffix() {
		return getDimensionName();
	}
}