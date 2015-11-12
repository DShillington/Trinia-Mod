package com.trinia.world.medieval;

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
import com.trinia.items.TriniaBiomes;

public class WorldProviderMedieval extends WorldProvider{

    public void registerWorldChunkManager(){
        this.worldChunkMgr = new WorldChunkManagerHell(TriniaBiomes.biomeTriniaMedieval, TriniaMod.DIM_MEDIEVAL_ID);
        this.isHellWorld = false;
        this.hasNoSky = true;
        this.dimensionId = TriniaMod.DIM_MEDIEVAL_ID;
    }
    public BiomeGenBase getBiome()
    {
		return TriniaBiomes.biomeTriniaMedieval;
    	
    }
	public String getInternalNameSuffix()
    {
        return "_triniaMedieval";
    }

    @SideOnly(Side.CLIENT)
	public Vec3 getFogColor(float par1, float par2){
	    return new Vec3(1.0D,1.0D,8.0D);
    }
    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderHell(this.worldObj, hasNoSky, this.worldObj.getSeed());
    }

    public String getWelcomeMessage()
    {
        if (this instanceof WorldProviderMedieval)
        {
            return "Entering Trinia Medieval";
        }
        else if (this instanceof WorldProviderMedieval)
        {
            return "Entering Trinia Medieval";
        }
        return null;
    }

    public String getSunTexture()
    {
    	return "trinia:textures/blocks/sunTrinia.png";
    }

    public String getDepartMessage()
    {
        if (this instanceof WorldProviderMedieval)
        {
            return "Leaving Trinia Medieval.. Already?";
        }
        else if (this instanceof WorldProviderMedieval)
        {
            return "Leaving Trinia Medieval.. Already?";
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
        return "trinia Medieval";
    }

    @Override protected void generateLightBrightnessTable() {float f = 0.5F;for(int i = 0; i <= 15; ++i) {float f1 = 1.0F - (float) i / 15.0F;this.lightBrightnessTable[i] = (1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f;}}

}