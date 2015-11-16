package com.trinia.proxy;

import java.util.logging.Level;

import com.trinia.TriniaEntities;
import com.trinia.TriniaMod;
import com.trinia.TriniaRecipes;
import com.trinia.TriniaRenderRegistry;
import com.trinia.TriniaTileEntities;
import com.trinia.blocks.BlockTriniaSmelter;
import com.trinia.blocks.TriniaBlocks;
import com.trinia.blocks.gui.GuiHandler;
import com.trinia.events.ConfigurationHandler;
import com.trinia.events.EventHandlerCommon;
import com.trinia.events.EventUpdate;
import com.trinia.events.UpdateHandler;
import com.trinia.handler.ChatHandler;
import com.trinia.items.TriniaItems;
import com.trinia.model.ModelAmulet;
import com.trinia.world.gen.TriniaBiomes;
import com.trinia.world.gen.TriniaWorldGen;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy implements ProxyInterface
{

	public void preInit(FMLPreInitializationEvent event) {
	
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		MinecraftForge.EVENT_BUS.register(new EventHandlerCommon());
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
    }

    public void postInit(FMLPostInitializationEvent event) {
    	   
    	
    		if (Loader.isModLoaded("TwilightForest"))
           {
               ChatHandler.logException(Level.SEVERE, "TwilightForest Mod is not compatible with Trinia, Trinia has it's own Dimension system. Remove the TwilightForest Mod to fix this error.");
           }
           
    }


	public void init(FMLInitializationEvent event)
	{

		NetworkRegistry.INSTANCE.registerGuiHandler(TriniaMod.instance, new GuiHandler());
		GameRegistry.registerWorldGenerator(new TriniaWorldGen(), 0);
	}

	public void registerRenders() 
	{
		
	}
	
	
	
	
	
	
	
	
	
private static final ModelAmulet Chest = new ModelAmulet(1.0f); 
	
public ModelBiped getArmorModel(int id) {
    switch (id) {
        case 0: {
            return Chest;
        }
        
    }
    return null;
}
public void register(){
	
	
	}


	public static Block blockInventoryAdvanced;

	
	public static void preInitCommon()
	 
	{
		
		// each instance of your block should have a name that is unique within your mod.  use lower case.
		blockInventoryAdvanced = new BlockTriniaSmelter().setUnlocalizedName("mbe31_block_inventory_furnace");
		GameRegistry.registerBlock(blockInventoryAdvanced, "mbe31_block_inventory_furnace");
		// Each of your tile entities needs to be registered with a name that is unique to your mod.
		// you don't need to register an item corresponding to the block, GameRegistry.registerBlock does this automatically.

		// You need to register a GUIHandler for the container.  However there can be only one handler per mod, so for the purposes
		//   of this project, we create a single GuiHandlerRegistry for all examples.
		// We register this GuiHandlerRegistry with the NetworkRegistry, and then tell the GuiHandlerRegistry about
		//   each example's GuiHandler, in this case GuiHandlerMBE31, so that when it gets a request from NetworkRegistry,
		//   it passes the request on to the correct example's GuiHandler.
	}
	 public void registerNetworkStuff(){
		  }

		 public void registerTileEntities(){
		 }
		 public World getClientWorld()
			{
				return null;
			}

			public EntityPlayer getClientPlayer()
			{
				return null;
			}

			@Override
			public boolean isSinglePlayer()
			{
				return false;
			}

			@Override
			public boolean isDedicatedServer()
			{
				return MinecraftServer.getServer().isDedicatedServer();
			}
    
		    public ModelBiped getArmorModel(String par1String)
			{
				return null;
			}

		
	
}