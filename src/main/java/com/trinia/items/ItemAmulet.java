package com.trinia.items;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> origin/master
import com.trinia.TriniaMod;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
<<<<<<< HEAD
import net.minecraftforge.fml.relauncher.SideOnly;
=======
>>>>>>> origin/master

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
<<<<<<< HEAD
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List info, boolean p_77624_4_) 
    {
    	info.add("Place this amulet in the ChestPlate Slot.");
    }
    
=======
>>>>>>> origin/master
}