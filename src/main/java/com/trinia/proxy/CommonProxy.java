package com.trinia.proxy;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.trinia.blocks.BlockTriniaSmelter;
import com.trinia.items.ItemAmuletArmor;
import com.trinia.model.ModelAmulet;
import com.trinia.world.gen.TriniaWorldGen;

public class CommonProxy implements ProxyInterface
{
	
	public void init(FMLInitializationEvent e)
	{
		GameRegistry.registerWorldGenerator(new TriniaWorldGen(), 0);
	}

	public void registerRenders() 
	{
		
	}
private static final ModelAmulet tutChest = new ModelAmulet(); 
	
	public ModelBiped getArmorModel(int id){ switch (id) { 
	case 0: return tutChest; 
	default: break; } 
	return tutChest; //default, if whenever you should have passed on a wrong id 
	} 
	public static Block blockInventoryAdvanced;  // this holds the unique instance of your block

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

			@Override
			public void preInit()
			{
				
			}
			
			public void preInit(FMLPreInitializationEvent e) {

		    }

		    public void postInit(FMLPostInitializationEvent e) {

		    }
}