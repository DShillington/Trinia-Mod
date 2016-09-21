package com.trinia.events;

import com.trinia.TriniaMod;
import com.trinia.gui.SunDialGui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class EventSunDial {

	
	@SubscribeEvent
	protected void actionPerformed(GuiButton button)
	{
		EntityPlayer pl = Minecraft.getMinecraft().thePlayer;
		if(button.id == 0)
		{
		pl.inventory.addItemStackToInventory(new ItemStack(Items.diamond, 10));
		}
	}
}
