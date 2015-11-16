/*******************************************************************************
 * Copyright (c) 2015 papertazer.
 * All rights reserved.
 *
 * Contributors:
 *     papertazer - Codeing/modeling/textures
 *     OMGitsMiniMe -  Codeing/modeling/textures
 *     MagikModder - Coding
 *     Snurly - Textures
 ******************************************************************************/

package com.trinia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.trinia.blocks.TriniaBlocks;
import com.trinia.blocks.gui.GuiHandler;
import com.trinia.events.ConfigurationHandler;
import com.trinia.events.EventHandlerCommon;
import com.trinia.events.EventUpdate;
import com.trinia.events.UpdateHandler;
import com.trinia.items.TriniaItems;
import com.trinia.proxy.ClientProxy;
import com.trinia.proxy.CommonProxy;
import com.trinia.web.Update;
import com.trinia.world.gen.TriniaBiomes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

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
	public static int mobid4 = 3;
	public static int mobid5 = 4;
	public static int mobid6 = 6;
	
	//Dimension ID
	public static int DIM_TRINIA_ID = 6;
	
	public Random ChunkGenRand;
	public int ChunkGenRandNum = 0;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	
	public static CommonProxy proxy;
    
	public static CreativeTabs TriniaMainTab = new TriniaModTab("tabTriniaMain");
	public static CreativeTabs TriniaToolsTab = new TriniaToolsTab("tabTriniaTools");

	public static String ASSET_PREFIX = "trinia";
    public static String TEXTURE_PREFIX = TriniaMod.ASSET_PREFIX + ":";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);	

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
<<<<<<< HEAD

=======
>>>>>>> origin/master
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{	
		proxy.register();
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("postInit done");
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
}