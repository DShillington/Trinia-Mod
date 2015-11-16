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
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
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
	
		MinecraftForge.EVENT_BUS.register(new EventHandlerCommon());

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

public void register(){
	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
	  renderItem.getItemModelMesher().register(TriniaItems.triniaAmulet, 0, new ModelResourceLocation(TriniaMod.ASSET_PREFIX, "textures/models/armor/Amulet2.png"));
	
	}
	public static Block blockInventoryAdvanced;

	
	public static void preInitCommon()
	 
	{
		blockInventoryAdvanced = new BlockTriniaSmelter().setUnlocalizedName("mbe31_block_inventory_furnace");
		GameRegistry.registerBlock(blockInventoryAdvanced, "mbe31_block_inventory_furnace");
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
    
			
			private static final ModelAmulet masque_loup = new ModelAmulet(0.5F);
			
			public ModelBiped getArmorModel(){
				return masque_loup;
				}
			
}