package com.trinia.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.trinia.TriniaEntities;
import com.trinia.TriniaMod;
import com.trinia.TriniaRecipes;
import com.trinia.TriniaRenderRegistry;
import com.trinia.TriniaTileEntities;
import com.trinia.blocks.TriniaBlocks;
import com.trinia.items.ItemAmulet;
import com.trinia.items.TriniaItems;
import com.trinia.mob.Render.RenderBlemmyae;
import com.trinia.mob.Render.RenderIceDragon;
import com.trinia.mob.Render.RenderMermaid;
import com.trinia.mob.Render.RenderRedDragon;
import com.trinia.mob.Render.RenderTownsmen;
import com.trinia.mob.Render.RenderTownswoman;
import com.trinia.mob.entity.EntityBlemmyae;
import com.trinia.mob.entity.EntityIceDragon;
import com.trinia.mob.entity.EntityMermaid;
import com.trinia.mob.entity.EntityRedDragon;
import com.trinia.mob.entity.EntityTownsmen;
import com.trinia.mob.entity.EntityTownswoman;
import com.trinia.mob.model.ModelBlemmyae;
import com.trinia.mob.model.ModelIceDragon;
import com.trinia.mob.model.ModelMermaid;
import com.trinia.mob.model.ModelRedDragon;
import com.trinia.model.ModelAmulet;
import com.trinia.world.gen.TriniaBiomes;

public class ClientProxy extends CommonProxy{
	
private static final ModelAmulet masque_loup = new ModelAmulet(0.5F);
	
	public ModelBiped getArmorModel(){
		return masque_loup;
		}

	
	public void register() {
    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		  renderItem.getItemModelMesher().register(TriniaItems.triniaAmulet, 0, new ModelResourceLocation(TriniaMod.ASSET_PREFIX, "textures/models/armor/Amulet.png"));
		 // renderItem.getItemModelMesher().register(TriniaItems.triniaAmulet, 0, new ModelResourceLocation("trinia:triniaAmulet", "inventory"));
			
	}
	
	@Override
	public EntityPlayer getClientPlayer()
	{
		return Minecraft.getMinecraft().thePlayer;
	}
	@Override
	public boolean isSinglePlayer()
	{
		return Minecraft.getMinecraft().isSingleplayer();
	}

	@Override
	public boolean isDedicatedServer()
	{
		return false;
	}

	@SubscribeEvent
	public void onClientWorldLoad(WorldEvent.Load event)
	{
		
	}

	@SubscribeEvent
	public void onClientWorldUnload(WorldEvent.Unload event)
	{
		
	}


	@SubscribeEvent
	public void onPrePlayerRender(RenderPlayerEvent.Pre event)
	{
		
	}

	@SubscribeEvent
	public void onPostPlayerRender(RenderPlayerEvent.Post event)
	{
		
	}
	public void registerRenderThings()
	{
    RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
	}

	

	@Override
	public void registerRenders() 
	{
		TriniaBlocks.registerRenders();
		TriniaItems.registerRenders();
		RenderingRegistry.registerEntityRenderingHandler(EntityMermaid.class, new RenderMermaid(Minecraft.getMinecraft().getRenderManager(), new ModelMermaid(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/entity/mermaid/mermaid.png");}});
		RenderingRegistry.registerEntityRenderingHandler(EntityBlemmyae.class, new RenderBlemmyae(Minecraft.getMinecraft().getRenderManager(), new ModelBlemmyae(), 1){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/entity/blemmyae/ModelBlemmyae.png");}});
		RenderingRegistry.registerEntityRenderingHandler(EntityIceDragon.class, new RenderIceDragon(Minecraft.getMinecraft().getRenderManager(), new ModelIceDragon(), 2){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/entity/dragon/ice/dragon_ice.png");}});
		RenderingRegistry.registerEntityRenderingHandler(EntityRedDragon.class, new RenderRedDragon(Minecraft.getMinecraft().getRenderManager(), new ModelRedDragon(), 3){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/entity/dragon/red/dragon_red.png");}});
		RenderingRegistry.registerEntityRenderingHandler(EntityTownsmen.class, new RenderTownsmen(Minecraft.getMinecraft().getRenderManager(), new ModelBiped(), 4){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/entity/people/townsmen.png");}});
		RenderingRegistry.registerEntityRenderingHandler(EntityTownswoman.class, new RenderTownswoman(Minecraft.getMinecraft().getRenderManager(), new ModelBiped(), 5){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/entity/people/townswoman.png");}});
	}
}
