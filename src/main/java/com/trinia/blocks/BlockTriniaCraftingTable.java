/**
package com.trinia.blocks;

import com.trinia.tileentity.TileEntityTriniaWorkBench;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;

public class BlockTriniaCraftingTable extends BlockContainer
{
    protected BlockTriniaCraftingTable(Material materialIn) 
    {
		super(materialIn);
	}

	private static final String __OBFID = "CL_00000221";

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
            playerIn.displayGui(new BlockTriniaCraftingTable.InterfaceCraftingTable(worldIn, pos));
            return true;
        }
    }

    public static class InterfaceCraftingTable implements IInteractionObject
        {
            private final World world;
            private final BlockPos position;
            private static final String __OBFID = "CL_00002127";

            public InterfaceCraftingTable(World worldIn, BlockPos pos)
            {
                this.world = worldIn;
                this.position = pos;
            }

            /**
             * Gets the name of this command sender (usually username, but possibly "Rcon")
             
            public String getName()
            {
                return null;
            }

            /**
             * eturns true if this thing is named
             
            public boolean hasCustomName()
            {
                return false;
            }

            public IChatComponent getDisplayName()
            {
                return new ChatComponentTranslation(TriniaBlocks.craftingTable.getUnlocalizedName() + ".name", new Object[0]);
            }

            public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
            {
                return new ContainerWorkbench(playerInventory, this.world, this.position);
            }

            public String getGuiID()
            {
                return "trinia:guiIDCraftStation";
            }
        }

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) 
	{
		return new TileEntityTriniaWorkBench();
	}
}
*/