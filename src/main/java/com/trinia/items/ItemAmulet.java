package com.trinia.items;


import java.util.List;

import com.trinia.TriniaMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ItemAmulet extends ItemArmor {

    public ItemAmulet(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TriniaMod.TriniaMainTab);
    }
    
    @Override
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3){
    if (var3.ridingEntity == null && var3.riddenByEntity == null && var3 instanceof EntityPlayerMP){
		 
        EntityPlayerMP thePlayer = (EntityPlayerMP)var3;
        if (thePlayer.timeUntilPortal > 0)
        {
                thePlayer.timeUntilPortal = 10;
        }
        else if (thePlayer.dimension != 6)
        {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 6);
        }
        else {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0);
        }
        }
	return var1;
}

    @SuppressWarnings("unchecked")
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List info, boolean p_77624_4_) 
    {
    	info.add("Place this amulet in the ChestPlate Slot.");
    	info.add("Right Click to teleport to Trinia.");
    	info.add("§4 *** Abilities ***");
    	info.add("");
    	info.add("§a * Cloaking Ability");
    	info.add("§a * Healing Factor");
    	info.add("");
    	info.add("§9 +10 Sword Damage");
    	info.add("§9 +5 Punch Damage");
    }

}