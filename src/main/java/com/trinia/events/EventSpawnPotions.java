package com.trinia.events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;

public class EventSpawnPotions extends EventHandlerCommon {
	public void PlayerEvent(PlayerRespawnEvent event, EntityPlayer player) {
		if (player.isAirBorne) {
			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id,
					500, 4));
		} else {
			return;
		}

	}
}
