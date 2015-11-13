/*******************************************************************************
 * Copyright (c) 2015 papertazer.
 * All rights reserved.
 *
 * Contributors:
 *     papertazer - Codeing/modeling/textures
 *     OMGitsMiniMe -  Codeing/modeling/textures
 *     Snurly - Textures
 ******************************************************************************/

package com.trinia;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.trinia.blocks.TriniaBlocks;
import com.trinia.blocks.gui.GuiHandler;
import com.trinia.blocks.gui.TileInventorySmelter;
import com.trinia.events.ConfigurationHandler;
import com.trinia.events.EventHandlerCommon;
import com.trinia.events.EventUpdate;
import com.trinia.events.UpdateHandler;
import com.trinia.items.TriniaItems;
import com.trinia.mob.Render.RenderBlemmyae;
import com.trinia.mob.Render.RenderIceDragon;
import com.trinia.mob.Render.RenderMermaid;
import com.trinia.mob.entity.EntityBlemmyae;
import com.trinia.mob.entity.EntityIceDragon;
import com.trinia.mob.entity.EntityMermaid;
import com.trinia.mob.model.ModelBlemmyae;
import com.trinia.mob.model.ModelIceDragon;
import com.trinia.mob.model.ModelMermaid;
import com.trinia.proxy.ClientProxy;
import com.trinia.proxy.CommonProxy;
import com.trinia.web.Update;
import com.trinia.world.WorldProviderMod;
import com.trinia.world.biome.BiomeGenTrinia;
import com.trinia.world.gen.TriniaBiomes;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TriniaMod {
	
	
	public static Update latestUpdate;
	//TESTING TRINIA-BETA GITHUB
	
	
	@Instance(Reference.MOD_ID)
	public static TriniaMod instance;
	
	//Mob ID
	public static int mobid = 0;
	public static int mobid2 = 1;
	public static int mobid3 = 2;
	
	//Dimension ID
	public static int DIM_TRINIA_ID = 6;
	public Random ChunkGenRand;
	public int ChunkGenRandNum = 0;
	
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	
	public static CommonProxy proxy_common;
    public static ClientProxy proxy_client;
    
	public static CreativeTabs TriniaMainTab = new TriniaModTab("tabTriniaMain");
	public static CreativeTabs TriniaToolsTab = new TriniaToolsTab("tabTriniaTools");

	public static String ASSET_PREFIX = "trinia";
    public static String TEXTURE_PREFIX = TriniaMod.ASSET_PREFIX + ":";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		FMLCommonHandler.instance().bus().register(new EventHandlerCommon());
		FMLCommonHandler.instance().bus().register(new GuiHandler());
		FMLCommonHandler.instance().bus().register(new EventUpdate());
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		UpdateHandler.init();
		TriniaBlocks.init();
		TriniaBlocks.register();
		TriniaItems.init();
		TriniaItems.register();
		TriniaTileEntities.register();
		TriniaBiomes.init();
		TriniaRecipes.loadRecipes();
		TriniaEntities.loadEntities();	
		TriniaRenderRegistry.loadEntities();

		proxy_common.preInit();
	}
	
	public void generateSurface(World world, Random rand, int i, int j)
	{
		ChunkGenRand = new Random();
		ChunkGenRandNum = ChunkGenRand.nextInt(2)+1;
		
		if(ChunkGenRandNum == 1)
		{
			int RandPosX = i + rand.nextInt(16);
			int RandPosZ = j + rand.nextInt(16);
			int j1 = world.getChunksLowestHorizon(RandPosX, RandPosZ);
			(new WorldGenCastleOne()).generate(world, rand, RandPosX, j1, RandPosZ);
		}
	}
	
	public static BiomeGenBase[] clean(final BiomeGenBase[] v) {
		List<BiomeGenBase> list = new ArrayList<BiomeGenBase>(Arrays.asList(v));
		list.removeAll(Collections.singleton(null));
		return list.toArray(new BiomeGenBase[list.size()]);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
		proxy_common.registerRenders();

		
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy_common.registerRenders();
	}
	
	@EventHandler
	 public void load(FMLInitializationEvent event)
	 {
	
	 }

	public void loadEntities() 
	{
		
	}
}