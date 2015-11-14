package com.trinia;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import com.trinia.mob.Render.RenderBlemmyae;
import com.trinia.mob.Render.RenderIceDragon;
import com.trinia.mob.Render.RenderMermaid;
import com.trinia.mob.entity.EntityBlemmyae;
import com.trinia.mob.entity.EntityIceDragon;
import com.trinia.mob.entity.EntityMermaid;
import com.trinia.mob.entity.EntityRedDragon;
import com.trinia.mob.entity.EntityTownsmen;
import com.trinia.mob.model.ModelBlemmyae;
import com.trinia.mob.model.ModelIceDragon;
import com.trinia.mob.model.ModelMermaid;
import com.trinia.world.gen.TriniaBiomes;

public class TriniaEntities {
	
	public static void loadEntities(){
		int entityID = 80;
		int entityID2 = 81;
		int entityID3 = 83;
		int entityID4 = 84;
		int entityID5 = 85;
		
		TriniaMod.mobid = entityID;
		TriniaMod.mobid2 = entityID2;
		TriniaMod.mobid3 = entityID3;
		TriniaMod.mobid4 = entityID4;
		TriniaMod.mobid5 = entityID5;
		
		EntityRegistry.registerGlobalEntityID(EntityMermaid.class, "mermaid", entityID);
		EntityRegistry.registerGlobalEntityID(EntityBlemmyae.class, "blemmyae", entityID2);
		EntityRegistry.registerGlobalEntityID(EntityIceDragon.class, "icedragon", entityID3);
		EntityRegistry.registerGlobalEntityID(EntityRedDragon.class, "reddragon", entityID4);
		EntityRegistry.registerGlobalEntityID(EntityTownsmen.class, "townsmen", entityID5);
		
		EntityRegistry.registerModEntity(EntityMermaid.class, "mermaid", entityID, TriniaMod.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityBlemmyae.class, "blemmyae", entityID2, TriniaMod.instance, 65, 2, true);
		EntityRegistry.registerModEntity(EntityIceDragon.class, "icedragon", entityID3, TriniaMod.instance, 66, 3, true);
		EntityRegistry.registerModEntity(EntityRedDragon.class, "reddragon", entityID4, TriniaMod.instance, 67, 4, true);
		EntityRegistry.registerModEntity(EntityTownsmen.class, "townsmen", entityID5, TriniaMod.instance, 68, 5, true);
		
		EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, (0 << 16) + (255 << 8) + 255, (0 << 16) + (0 << 8) + 204));
		EntityList.entityEggs.put(Integer.valueOf(entityID2), new EntityList.EntityEggInfo(entityID2, (0 << 16) + (255 << 8) + 255, (0 << 16) + (0 << 8) + 204));
		EntityList.entityEggs.put(Integer.valueOf(entityID3), new EntityList.EntityEggInfo(entityID3, (0 << 16) + (255 << 8) + 255, (0 << 16) + (0 << 8) + 204));
		EntityList.entityEggs.put(Integer.valueOf(entityID4), new EntityList.EntityEggInfo(entityID4, (0 << 16) + (255 << 8) + 255, (0 << 16) + (0 << 8) + 204));
		EntityList.entityEggs.put(Integer.valueOf(entityID5), new EntityList.EntityEggInfo(entityID5, (0 << 16) + (255 << 8) + 255, (0 << 16) + (0 << 8) + 204));
		
		EntityRegistry.addSpawn(EntityMermaid.class, 30, 1, 3, EnumCreatureType.MONSTER, TriniaBiomes.biomeTrinia);
		EntityRegistry.addSpawn(EntityBlemmyae.class, 31, 2, 4, EnumCreatureType.MONSTER, TriniaBiomes.biomeTrinia);
		EntityRegistry.addSpawn(EntityIceDragon.class, 20, 1, 1, EnumCreatureType.MONSTER, TriniaBiomes.biomeTrinia);
		EntityRegistry.addSpawn(EntityRedDragon.class, 21, 1, 2, EnumCreatureType.MONSTER, TriniaBiomes.biomeTrinia);
		EntityRegistry.addSpawn(EntityTownsmen.class, 21, 1, 2, EnumCreatureType.CREATURE, TriniaBiomes.biomeTrinia);
		
	}
	
}
