package com.trinia.items;

import com.trinia.TriniaMod;
import com.trinia.gui.GameOverGUI;
import com.trinia.gui.SunDialGui;
import com.trinia.tileentity.TileEntitySunDial;
import com.trinia.world.TriniaTeleporter;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemWritableBook;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;

public class ItemScroll extends ItemWritableBook{

	  @Override
	    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {

	        if (!world.isRemote) {
	            entityPlayer.openGui(TriniaMod.instance, 0, world, (int) entityPlayer.posX, (int) entityPlayer.posY, (int) entityPlayer.posZ);
	        	//FMLNetworkHandler.openGui(entityPlayer, TriniaMod.instance, 0, world, pos.getX(), pos.getY(), pos.getZ());
	        	
	        }

	        return itemStack;
	    }
}
