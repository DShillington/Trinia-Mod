package com.trinia.world;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderHell;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.trinia.TriniaMod;
import com.trinia.world.gen.TriniaBiomes;

public class WorldProviderMod extends WorldProvider{

    public void registerWorldChunkManager(){
        this.worldChunkMgr = new WorldChunkManagerHell(TriniaBiomes.biomeTrinia, TriniaMod.DIM_TRINIA_ID);
        this.isHellWorld = false;
        this.hasNoSky = true;
        this.dimensionId = TriniaMod.DIM_TRINIA_ID;
    }
    public BiomeGenBase getBiome()
    {
		return TriniaBiomes.biomeTrinia;
    	
    }
	public String getInternalNameSuffix()
    {
        return "_trinia";
    }

    @SideOnly(Side.CLIENT)
	public Vec3 getFogColor(float par1, float par2){
	    return new Vec3(1.0D,1.0D,8.0D);
    }
    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderTrinia(this.worldObj, this.worldObj.getSeed());
    }

    public String getWelcomeMessage()
    {
        if (this instanceof WorldProviderMod)
        {
            return "Entering Trinia";
        }
        else if (this instanceof WorldProviderMod)
        {
            return "Entering Trinia";
        }
        return null;
    }

    public String getSunTexture()
    {
    	return "trinia:textures/blocks/sunTrinia.png";
    }

    public String getDepartMessage()
    {
        if (this instanceof WorldProviderMod)
        {
            return "Leaving Trinia.. Already?";
        }
        else if (this instanceof WorldProviderMod)
        {
            return "Leaving Trinia.. Already?";
        }
        return null;
    }

    public boolean isSurfaceWorld(){
        return true;
    }

    public boolean canCoordinateBeSpawn(int par1, int par2){
        return true;
    }

    public boolean canRespawnHere(){
        return true;
    }

    @SideOnly(Side.CLIENT)
    public boolean doesXZShowFog(int par1, int par2){
        return false;
    }

    public String getDimensionName(){
        return "trinia";
    }

    @Override protected void generateLightBrightnessTable() {float f = 0.5F;for(int i = 0; i <= 15; ++i) {float f1 = 1.0F - (float) i / 15.0F;this.lightBrightnessTable[i] = (1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f;}}

}