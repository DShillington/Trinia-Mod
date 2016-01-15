/*******************************************************************************
 * Copyright (c) 2015 papertazer;
 * All rights reserved.
 *
 * Contributors:
 *     papertazer - Codeing/modeling/textures
 *     OMGitsMiniMe -  Codeing/modeling/textures
 *     MagikModder - Coding help
 *     Snurly - Textures
 ******************************************************************************/

package com.trinia;

import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.text.JTextComponent.KeyBinding;

import com.trinia.blocks.TriniaBlocks;
import com.trinia.blocks.gui.GuiHandler;
import com.trinia.events.EventHandlerCommon;
import com.trinia.events.EventUpdate;
import com.trinia.events.UpdateHandler;
import com.trinia.handler.ConfigurationHandler;
import com.trinia.handler.GuiHandlerTrinia;
import com.trinia.handler.KeyBindings;
import com.trinia.handler.keyboardHandler;
import com.trinia.handler.tickHandler;
import com.trinia.items.TriniaItems;
import com.trinia.proxy.ClientProxy;
import com.trinia.proxy.CommonProxy;
import com.trinia.tabs.TriniaArmorTab;
import com.trinia.tabs.TriniaBlocksTab;
import com.trinia.tabs.TriniaItemsTab;
import com.trinia.tabs.TriniaTabs;
import com.trinia.tabs.TriniaToolsTab;
import com.trinia.tileentity.TileEntityPipeLine;
import com.trinia.tileentity.TileEntityScroll;
import com.trinia.tileentity.TileEntitySunDial;
import com.trinia.web.Update;
import com.trinia.world.gen.TriniaBiomes;

import net.java.games.input.Keyboard;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
	public static int mobid7 = 7;
	public static int mobid8 = 8;
	public static int mobid9 = 9;
	
	//Dimension ID
	public static int DIM_TRINIA_ID = 6;
	public Random ChunkGenRand;
	public int ChunkGenRandNum = 0;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	
	public static CommonProxy proxy;
    
	public static CreativeTabs TriniaBlocksTab = new TriniaBlocksTab("tabTriniaBlocks");
	public static CreativeTabs TriniaItemsTab = new TriniaItemsTab("tabTriniaItems");
	public static CreativeTabs TriniaToolsTab = new TriniaToolsTab("tabTriniaTools");
	public static CreativeTabs TriniaArmorTab = new TriniaArmorTab("tabTriniaArmor");
	public static int SunDialGui;
	public static int ScrollGui;
	public static int Compressor;
	public static String ASSET_PREFIX = "trinia";
    public static String TEXTURE_PREFIX = TriniaMod.ASSET_PREFIX + ":";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);	

		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		FMLCommonHandler.instance().bus().register(new EventHandlerCommon());
		FMLCommonHandler.instance().bus().register(new GuiHandler());
		FMLCommonHandler.instance().bus().register(new tickHandler(Minecraft.getMinecraft()));
		FMLCommonHandler.instance().bus().register(new EventUpdate());
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
		 FMLCommonHandler.instance().bus().register(new keyboardHandler());
		 KeyBindings.init();
		GameRegistry.registerTileEntity(TileEntitySunDial.class, "sunDial");
		GameRegistry.registerTileEntity(TileEntityScroll.class, "scroll");
		GameRegistry.registerTileEntity(TileEntityPipeLine.class, "pipe");
		// load config
		
		
		}

	 
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{	
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandlerTrinia());
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