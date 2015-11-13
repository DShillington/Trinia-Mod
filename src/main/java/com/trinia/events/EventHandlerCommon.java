package com.trinia.events;
 
import java.util.regex.Pattern;

import com.trinia.TriniaMod;
import com.trinia.web.Update;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

 
	public class EventHandlerCommon
	{

	    private boolean displayedUpdates;
	    
		@SubscribeEvent
		public void onPlayerLogin(PlayerLoggedInEvent e)
		{
			EntityPlayer player = (EntityPlayer) e.player;
			if (ConfigurationHandler.canDisplay)
			{
				if (!player.worldObj.isRemote)
				{
					if (!ConfigurationHandler.hasDisplayedOnce)
					{
						player.addChatMessage(new ChatComponentText("Make sure you check out the PMC Page! http://www.planetminecraft.com/mod/125-trinia/"));
						ConfigurationHandler.hasDisplayedOnce = true;
					}
				}
			}
		
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

      
}
}

}