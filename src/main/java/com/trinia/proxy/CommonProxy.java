package com.trinia.proxy;

import java.util.logging.Level;

import com.trinia.TriniaMod;
import com.trinia.achievement.TriniaAchievements;
import com.trinia.blocks.BlockTriniaSmelter;
import com.trinia.blocks.TriniaBlocks;
import com.trinia.blocks.gui.GuiHandler;
import com.trinia.events.ConfigurationHandler;
import com.trinia.events.EventHandlerCommon;
import com.trinia.events.EventUpdate;
import com.trinia.events.UpdateHandler;
import com.trinia.handler.ChatHandler;
import com.trinia.items.TriniaItems;
import com.trinia.mob.register.TriniaEntities;
import com.trinia.model.ModelAmulet;
import com.trinia.util.TriniaRecipes;
import com.trinia.util.TriniaRenderRegistry;
import com.trinia.util.TriniaTileEntities;
import com.trinia.world.TriniaWorldGen;
import com.trinia.world.biome.TriniaBiomes;

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

public class CommonProxy implements ProxyInterface {

	public void preInit(FMLPreInitializationEvent event) {

		MinecraftForge.EVENT_BUS.register(new EventHandlerCommon());

	}

	public void postInit(FMLPostInitializationEvent event) {

	}

	public void init(FMLInitializationEvent event) {
		NetworkRegistry.INSTANCE.registerGuiHandler(TriniaMod.instance,
				new GuiHandler());
		GameRegistry.registerWorldGenerator(new TriniaWorldGen(), 2);
		TriniaAchievements.init();
	}

	public void registerRenders() {

	}

	public void register() {

	}

	public static Block blockInventoryAdvanced;

	public static void preInitCommon()

	{
		blockInventoryAdvanced = new BlockTriniaSmelter()
				.setUnlocalizedName("mbe31_block_inventory_furnace");
		GameRegistry.registerBlock(blockInventoryAdvanced,
				"mbe31_block_inventory_furnace");
	}

	public void registerNetworkStuff() {
	}

	public void registerTileEntities() {
	}

	public World getClientWorld() {
		return null;
	}

	public EntityPlayer getClientPlayer() {
		return null;
	}

	@Override
	public boolean isSinglePlayer() {
		return false;
	}

	@Override
	public boolean isDedicatedServer() {
		return MinecraftServer.getServer().isDedicatedServer();
	}

	public ModelBiped getArmorModelHalo() {
		return null;
	}

	public ModelBiped getArmorModel() {
		return null;
	}

	public ModelBiped getArmorModelWings() {

		return null;
	}

	public ModelBiped getArmorModelTriniaCape() {

		return null;
	}

}