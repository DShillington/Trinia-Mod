package com.trinia.world.biome;

import com.trinia.TriniaMod;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;


public class TriniaBiomes {

	public static void init(){
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomeBloom;
	public static void initializeBiome(){
		
		biomeBloom = new BiomeGenBloom(TriniaMod.DIM_TRINIA_ID).setBiomeName("Bloom");
		
		}
	
	public static void registerBiome(){
		BiomeDictionary.registerBiomeType(biomeBloom, Type.MAGICAL);
	
		BiomeManager.addSpawnBiome(biomeBloom);
		
		
	}
	
}
