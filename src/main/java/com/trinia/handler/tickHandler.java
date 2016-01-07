package com.trinia.handler;

import com.trinia.Reference;
import com.trinia.TriniaMod;
import com.trinia.gui.ButtonCustomGui;
import com.trinia.gui.GameOverGUI;
import com.trinia.gui.MainMenuGui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiGameOver;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class tickHandler {
	private Minecraft mc;
	private ButtonCustomGui buttonSingle;

	// create a constructor that takes a Minecraft argument; now we have it whenever we need it
	public tickHandler(Minecraft mc) {
	this.mc = mc;
	}
	
	@SubscribeEvent
	public void onGuiOpenEvent(GuiOpenEvent event) {
		
			
	}
	
	
	@SubscribeEvent
	 public void onPlayerTick(TickEvent.PlayerTickEvent event) {

	}

	 //Called when the client ticks. 
	 @SubscribeEvent
	 public void onClientTick(TickEvent.ClientTickEvent event) {
		
		 if (mc.currentScreen != null && mc.currentScreen.getClass() == GuiMainMenu.class){
			 Minecraft.getMinecraft().displayGuiScreen(
			new MainMenuGui(null));
			}
		 
		 if (mc.currentScreen != null && mc.currentScreen.getClass() == GuiGameOver.class){
			 Minecraft.getMinecraft().displayGuiScreen(
			new GameOverGUI());
			}
		
	}
	 
	 //Called when the server ticks. Usually 20 ticks a second. 
	 @SubscribeEvent
	 public void onServerTick(TickEvent.ServerTickEvent event) {

	}
	
	 //Called when a new frame is displayed (See fps) 
	 @SubscribeEvent
	 public void onRenderTick(TickEvent.RenderTickEvent event) {
		
	}
	 
	 //Called when the world ticks
	 @SubscribeEvent
	 public void onWorldTick(TickEvent.WorldTickEvent event) {

	}
}
