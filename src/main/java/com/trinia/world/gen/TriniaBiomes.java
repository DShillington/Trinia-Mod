package com.trinia.world.gen;

import com.trinia.TriniaMod;
import com.trinia.world.biome.BiomeGenMedieval;
import com.trinia.world.biome.BiomeGenTrinia;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;


public class TriniaBiomes {

	public static void init(){
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomeTrinia;

	public static void initializeBiome(){
		
		biomeTrinia = new BiomeGenTrinia(TriniaMod.DIM_TRINIA_ID, false).setBiomeName("Trinia");
		}
	
	public static void registerBiome(){
		BiomeDictionary.registerBiomeType(biomeTrinia, Type.MAGICAL);

		
		BiomeManager.addSpawnBiome(biomeTrinia);
	
		
	}
	
}
