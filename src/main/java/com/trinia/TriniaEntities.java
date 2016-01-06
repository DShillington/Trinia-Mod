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
import com.trinia.mob.entity.EntityAngelBoss;
import com.trinia.mob.entity.EntityBlemmyae;
import com.trinia.mob.entity.EntityButterfly;
import com.trinia.mob.entity.EntityCentaur;
import com.trinia.mob.entity.EntityIceDragon;
import com.trinia.mob.entity.EntityMermaid;
import com.trinia.mob.entity.EntityRedDragon;
import com.trinia.mob.entity.EntityTownsmen;
import com.trinia.mob.entity.EntityTownswoman;
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
		int entityID6 = 86;
		int entityID7 = 87;
		int entityID8 = 88;
		int entityID9 = 89;
		
		TriniaMod.mobid = entityID;
		TriniaMod.mobid2 = entityID2;
		TriniaMod.mobid3 = entityID3;
		TriniaMod.mobid4 = entityID4;
		TriniaMod.mobid5 = entityID5;
		TriniaMod.mobid6 = entityID6;
		TriniaMod.mobid7 = entityID7;
		TriniaMod.mobid8 = entityID8;
		TriniaMod.mobid9 = entityID9;
		
		EntityRegistry.registerGlobalEntityID(EntityMermaid.class, "mermaid", entityID);
		EntityRegistry.registerGlobalEntityID(EntityBlemmyae.class, "blemmyae", entityID2);
		EntityRegistry.registerGlobalEntityID(EntityIceDragon.class, "icedragon", entityID3);
		EntityRegistry.registerGlobalEntityID(EntityRedDragon.class, "reddragon", entityID4);
		EntityRegistry.registerGlobalEntityID(EntityTownsmen.class, "townsmen", entityID5);
		EntityRegistry.registerGlobalEntityID(EntityTownswoman.class, "townswoman", entityID6);
		EntityRegistry.registerGlobalEntityID(EntityAngelBoss.class, "angelboss", entityID7);
		EntityRegistry.registerGlobalEntityID(EntityButterfly.class, "butterfly", entityID8);
		EntityRegistry.registerGlobalEntityID(EntityCentaur.class, "centaur", entityID9);
		
		EntityRegistry.registerModEntity(EntityMermaid.class, "mermaid", entityID, TriniaMod.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityBlemmyae.class, "blemmyae", entityID2, TriniaMod.instance, 65, 2, true);
		EntityRegistry.registerModEntity(EntityIceDragon.class, "icedragon", entityID3, TriniaMod.instance, 66, 3, true);
		EntityRegistry.registerModEntity(EntityRedDragon.class, "reddragon", entityID4, TriniaMod.instance, 67, 4, true);
		EntityRegistry.registerModEntity(EntityTownsmen.class, "townsmen", entityID5, TriniaMod.instance, 68, 5, true);
		EntityRegistry.registerModEntity(EntityTownswoman.class, "townswoman", entityID6, TriniaMod.instance, 69, 6, true);
		EntityRegistry.registerModEntity(EntityAngelBoss.class, "angelboss", entityID7, TriniaMod.instance, 70, 7, true);
		EntityRegistry.registerModEntity(EntityButterfly.class, "butterfly", entityID8, TriniaMod.instance, 71, 8, true);
		EntityRegistry.registerModEntity(EntityCentaur.class, "centaur", entityID9, TriniaMod.instance, 72, 9, true);
		
		EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, (0 << 16) + (255 << 8) + 255, (0 << 16) + (0 << 8) + 204));
		EntityList.entityEggs.put(Integer.valueOf(entityID2), new EntityList.EntityEggInfo(entityID2, (0 << 16) + (255 << 8) + 255, (0 << 16) + (0 << 8) + 204));
		EntityList.entityEggs.put(Integer.valueOf(entityID3), new EntityList.EntityEggInfo(entityID3, (0 << 16) + (255 << 8) + 255, (0 << 16) + (0 << 8) + 204));
		EntityList.entityEggs.put(Integer.valueOf(entityID4), new EntityList.EntityEggInfo(entityID4, (0 << 16) + (255 << 8) + 255, (0 << 16) + (0 << 8) + 204));
		EntityList.entityEggs.put(Integer.valueOf(entityID5), new EntityList.EntityEggInfo(entityID5, (0 << 16) + (255 << 8) + 255, (0 << 16) + (0 << 8) + 204));
		EntityList.entityEggs.put(Integer.valueOf(entityID6), new EntityList.EntityEggInfo(entityID6, (0 << 16) + (255 << 8) + 255, (0 << 16) + (0 << 8) + 204));
		EntityList.entityEggs.put(Integer.valueOf(entityID7), new EntityList.EntityEggInfo(entityID7, (0 << 16) + (255 << 8) + 255, (0 << 16) + (0 << 8) + 204));
		EntityList.entityEggs.put(Integer.valueOf(entityID8), new EntityList.EntityEggInfo(entityID8, (0 << 16) + (255 << 8) + 255, (0 << 16) + (0 << 8) + 204));
		EntityList.entityEggs.put(Integer.valueOf(entityID9), new EntityList.EntityEggInfo(entityID9, (0 << 16) + (255 << 8) + 255, (0 << 16) + (0 << 8) + 204));
	
		EntityRegistry.addSpawn(EntityMermaid.class, 30, 1, 3, EnumCreatureType.MONSTER, TriniaBiomes.biomeTrinia);
		EntityRegistry.addSpawn(EntityBlemmyae.class, 31, 2, 4, EnumCreatureType.MONSTER, TriniaBiomes.biomeTrinia);
		EntityRegistry.addSpawn(EntityIceDragon.class, 20, 1, 1, EnumCreatureType.MONSTER, TriniaBiomes.biomeTrinia);
		EntityRegistry.addSpawn(EntityRedDragon.class, 21, 1, 2, EnumCreatureType.MONSTER, TriniaBiomes.biomeTrinia);
		EntityRegistry.addSpawn(EntityTownsmen.class, 21, 1, 2, EnumCreatureType.CREATURE, TriniaBiomes.biomeTrinia);
		EntityRegistry.addSpawn(EntityTownswoman.class, 21, 1, 2, EnumCreatureType.CREATURE, TriniaBiomes.biomeTrinia);
		EntityRegistry.addSpawn(EntityAngelBoss.class, 21, 1, 2, EnumCreatureType.CREATURE, TriniaBiomes.biomeTrinia);
		EntityRegistry.addSpawn(EntityButterfly.class, 21, 1, 2, EnumCreatureType.CREATURE, TriniaBiomes.biomeTrinia);
		EntityRegistry.addSpawn(EntityCentaur.class, 21, 1, 2, EnumCreatureType.CREATURE, TriniaBiomes.biomeTrinia);
		
	}
	
}
