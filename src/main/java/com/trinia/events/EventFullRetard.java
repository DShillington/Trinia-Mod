package com.trinia.events;

import com.trinia.TriniaMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class EventFullRetard {

	
	@SubscribeEvent
	public void onPlayerLogin(PlayerEvent.PlayerChangedDimensionEvent e) {
		EntityPlayer player = (EntityPlayer) e.player;
		
	}
}
