package com.trinia.handler;

import com.trinia.gui.GuideGui;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class keyboardHandler {
@SubscribeEvent
public void onKeyInput(InputEvent.KeyInputEvent event) {
  if(KeyBindings.openGUI.isPressed()){
   System.out.println("KEY Z");
   //OPEN GUI
  
 System.out.println("Opened Trinia Guide");
	   Minecraft.getMinecraft().displayGuiScreen(
  			new GuideGui());
}
}
}