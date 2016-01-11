package com.trinia.handler;

import com.trinia.gui.SunDialGui;
import com.trinia.gui.container.ContainerSunDial;
import com.trinia.tileentity.TileEntitySunDial;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandlerTrinia implements IGuiHandler {

	@Override
	  public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
	
		BlockPos pos = BlockPos.ORIGIN;
		if (id == 0) {
			TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
			if (tileEntity instanceof TileEntitySunDial) {
				return new ContainerSunDial(player.inventory, (TileEntitySunDial) tileEntity);
			}
		}
		return null;
	}

	@Override
	 public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		if (id == 0) {
			TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
			if (tileEntity instanceof TileEntitySunDial) {
				
				return new SunDialGui(player.inventory, (TileEntitySunDial) tileEntity);
				
			}
		
		}
		return null;
	}

}