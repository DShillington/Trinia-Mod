package com.trinia.events;
 
import java.util.regex.Pattern;

import javax.swing.JList;

import com.trinia.TriniaMod;
import com.trinia.web.Update;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;


	public class EventHandlerCommon
	{

	    private boolean displayedUpdates;
	    Minecraft mc = Minecraft.getMinecraft();

		@SubscribeEvent
		public void onSpawn(EntityJoinWorldEvent event)
		{			
			
			EntityPlayer player = (EntityPlayer) mc.thePlayer;
			
			   if (!displayedUpdates && ConfigurationHandler.checkForUpdates)
		        {
		            Update update = TriniaMod.latestUpdate;

		            if (update != null && update.isAvailable())
		            {
		                player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "TriniaMod version " + update.getVersion() + " is now available!"));
		                player.addChatMessage(new ChatComponentText(""));
		                player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "" + EnumChatFormatting.BOLD + "What's New: "));

		                String[] updates = update.getUpdateLog().split(Pattern.quote("(newline)"));

		                for (String updatePart : updates)
		                {
		                    EnumChatFormatting colour = EnumChatFormatting.RED;

		                    if (updatePart.trim().startsWith("*"))
		                    {
		                        colour = EnumChatFormatting.GOLD;
		                    }
		                    else if (updatePart.trim().startsWith("+"))
		                    {
		                        colour = EnumChatFormatting.GREEN;
		                    }
		                    else if (updatePart.trim().startsWith("-"))
		                    {
		                        colour = EnumChatFormatting.RED;
		                    }

		                    player.addChatMessage(new ChatComponentText(colour + updatePart));
		                }

		                player.addChatMessage(new ChatComponentText(""));
		            }

                    displayedUpdates = true;
		      
		        }
			
		
		}
		
		
		@SubscribeEvent
		public void onPlayerLogin(PlayerLoggedInEvent e)
		{
			        }}