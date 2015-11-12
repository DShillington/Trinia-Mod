package com.trinia.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockTriniaMedieval extends Block
{

public static final PropertyEnum AXIS = PropertyEnum.create("axis", EnumFacing.Axis.class, new EnumFacing.Axis[] {EnumFacing.Axis.X, EnumFacing.Axis.Z});

public BlockTriniaMedieval()
{
	super(Material.portal);
this.setDefaultState(this.blockState.getBaseState().withProperty(AXIS, EnumFacing.Axis.Z));
this.setTickRandomly(true);
this.setHardness(-1.0F);
this.setLightLevel(0.75F);
}

    public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state)
    {
        return null;
    }
	
	public boolean isOpaqueCube()
    {
        return false;
    }

    public void setBlockBoundsBasedOnState(IBlockAccess worldIn, BlockPos pos)
    {
        EnumFacing.Axis axis = (EnumFacing.Axis)worldIn.getBlockState(pos).getValue(AXIS);
        float f = 0.125F;
        float f1 = 0.125F;

        if (axis == EnumFacing.Axis.X)
        {
            f = 0.5F;
        }

        if (axis == EnumFacing.Axis.Z)
        {
            f1 = 0.5F;
        }

        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f1, 0.5F + f, 1.0F, 0.5F + f1);
    }

    public static int getMetaForAxis(EnumFacing.Axis axis)
    {
        return axis == EnumFacing.Axis.X ? 1 : (axis == EnumFacing.Axis.Z ? 2 : 0);
    }

    public boolean isFullCube()
    {
        return false;
    }
	
	 public int getMetaFromState(IBlockState state)
    {
        return getMetaForAxis((EnumFacing.Axis)state.getValue(AXIS));
    }
	
	public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(AXIS, (meta & 3) == 2 ? EnumFacing.Axis.Z : EnumFacing.Axis.X);
    }
/**
* If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
*/
/**
* Checks to see if this location is valid to create a portal and will return True if it does. Args: world, x, y, z
*/
public boolean tryToCreatePortal(World par1World, int par2, int par3, int par4)
{
byte b0 = 0;
byte b1 = 0;
if (getBlock(par1World,par2 - 1, par3, par4) == Blocks.gold_block || getBlock(par1World,par2 + 1, par3, par4) == Blocks.gold_block)
{
b0 = 1;
}
if (getBlock(par1World,par2, par3, par4 - 1) == Blocks.gold_block || getBlock(par1World,par2, par3, par4 + 1) == Blocks.gold_block)
{
b1 = 1;
}
if (b0 == b1)
{
return false;
}
else
{
if (getBlock(par1World,par2 - b0, par3, par4 - b1) == Blocks.air)
{
par2 -= b0;
par4 -= b1;
}
int l;
int i1;
for (l = -1; l <= 2; ++l)
{
for (i1 = -1; i1 <= 3; ++i1)
{
         boolean flag = l == -1 || l == 2 || i1 == -1 || i1 == 3;
         if (l != -1 && l != 2 || i1 != -1 && i1 != 3)
         {
         Block j1 = getBlock(par1World,par2 + b0 * l, par3 + i1, par4 + b1 * l);
         if (flag)
         {
         if (j1 != Blocks.gold_block)
         {
         return false;
         }
         }

         }
}
}
for (l = 0; l < 2; ++l)
{
for (i1 = 0; i1 < 3; ++i1)
{
		 IBlockState iblockstate = this.getDefaultState().withProperty(BlockPortal.AXIS, b0 == 0 ? EnumFacing.Axis.Z : EnumFacing.Axis.X);
         par1World.setBlockState(new BlockPos(par2 + b0 * l, par3 + i1, par4 + b1 * l), iblockstate, 3);
}
}
return true;
}
}
/**
* Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
* their own) Args: x, y, z, neighbor blockID
*/
public void onNeighborBlockChange(World par1World, BlockPos pos, IBlockState state, Block neighborBlock)
{
	
int par2 = pos.getX();
int par3 = pos.getY();
int par4 = pos.getZ();
	
byte b0 = 0;
byte b1 = 1;
if (getBlock(par1World,par2 - 1, par3, par4) == this || getBlock(par1World,par2 + 1, par3, par4) == this)
{
b0 = 1;
b1 = 0;
}
int i1;
for (i1 = par3; getBlock(par1World,par2, i1 - 1, par4) == this; --i1)
{
;
}
if (getBlock(par1World,par2, i1 - 1, par4) != Blocks.gold_block)
{
par1World.setBlockToAir(new BlockPos(par2, par3, par4));
}
else
{
int j1;
for (j1 = 1; j1 < 4 && getBlock(par1World,par2, i1 + j1, par4) == this; ++j1)
{
;
}
if (j1 == 3 && getBlock(par1World,par2, i1 + j1, par4) == Blocks.gold_block)
{
boolean flag = getBlock(par1World,par2 - 1, par3, par4) == this || getBlock(par1World,par2 + 1, par3, par4) == this;
boolean flag1 = getBlock(par1World,par2, par3, par4 - 1) == this || getBlock(par1World,par2, par3, par4 + 1) == this;
if (flag && flag1)
{
         par1World.setBlockToAir(new BlockPos(par2, par3, par4));
}
else
{
         if ((getBlock(par1World,par2 + b0, par3, par4 + b1) != Blocks.gold_block || getBlock(par1World,par2 - b0, par3, par4 - b1) != this) && (getBlock(par1World,par2 - b0, par3, par4 - b1) != Blocks.gold_block || getBlock(par1World,par2 + b0, par3, par4 + b1) != this))
         {
         par1World.setBlockToAir(new BlockPos(par2, par3, par4));
         }
}
}
else
{
par1World.setBlockToAir(new BlockPos(par2, par3, par4));
}
}
}

@SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side)
    {
        EnumFacing.Axis axis = null;
        IBlockState iblockstate = worldIn.getBlockState(pos);

        if (worldIn.getBlockState(pos).getBlock() == this)
        {
            axis = (EnumFacing.Axis)iblockstate.getValue(AXIS);

            if (axis == null)
            {
                return false;
            }

            if (axis == EnumFacing.Axis.Z && side != EnumFacing.EAST && side != EnumFacing.WEST)
            {
                return false;
            }

            if (axis == EnumFacing.Axis.X && side != EnumFacing.SOUTH && side != EnumFacing.NORTH)
            {
                return false;
            }
        }

        boolean flag = worldIn.getBlockState(pos.west()).getBlock() == this && worldIn.getBlockState(pos.west(2)).getBlock() != this;
        boolean flag1 = worldIn.getBlockState(pos.east()).getBlock() == this && worldIn.getBlockState(pos.east(2)).getBlock() != this;
        boolean flag2 = worldIn.getBlockState(pos.north()).getBlock() == this && worldIn.getBlockState(pos.north(2)).getBlock() != this;
        boolean flag3 = worldIn.getBlockState(pos.south()).getBlock() == this && worldIn.getBlockState(pos.south(2)).getBlock() != this;
        boolean flag4 = flag || flag1 || axis == EnumFacing.Axis.X;
        boolean flag5 = flag2 || flag3 || axis == EnumFacing.Axis.Z;
        return flag4 && side == EnumFacing.WEST ? true : (flag4 && side == EnumFacing.EAST ? true : (flag5 && side == EnumFacing.NORTH ? true : flag5 && side == EnumFacing.SOUTH));
    }
	
	 @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.TRANSLUCENT;
    }
	
	  protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {AXIS});
    }

//@SideOnly(Side.CLIENT)
/**
* Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
* coordinates. Args: blockAccess, x, y, z, side
*/
/*public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
{
if (getBlock(par1IBlockAccess,par2, par3, par4) == this)
{
return false;
}
else
{
boolean flag = getBlock(par1IBlockAccess,par2 - 1, par3, par4) == this && getBlock(par1IBlockAccess,par2 - 2, par3, par4) != this;
boolean flag1 = getBlock(par1IBlockAccess,par2 + 1, par3, par4) == this && getBlock(par1IBlockAccess,par2 + 2, par3, par4) != this;
boolean flag2 = getBlock(par1IBlockAccess,par2, par3, par4 - 1) == this && getBlock(par1IBlockAccess,par2, par3, par4 - 2) != this;
boolean flag3 = getBlock(par1IBlockAccess,par2, par3, par4 + 1) == this && getBlock(par1IBlockAccess,par2, par3, par4 + 2) != this;
boolean flag4 = flag || flag1;
boolean flag5 = flag2 || flag3;
return flag4 && par5 == 4 ? true : (flag4 && par5 == 5 ? true : (flag5 && par5 == 2 ? true : flag5 && par5 == 3));
}
}*/
/**
* Returns the quantity of items to drop on block destruction.
*/
public int quantityDropped(Random par1Random)
{
return 0;
}
/**
* Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
*/
//@Override
public void onEntityCollidedWithBlock(World par1World, BlockPos pos, IBlockState state, Entity par5Entity)
{
	
	int par2 = pos.getX();
int par3 = pos.getY();
int par4 = pos.getZ();
	
	
	//par1World.createExplosion((Entity)null, par2, par3, par4, 0.004F, true);
if (par5Entity.ridingEntity == null && par5Entity.riddenByEntity == null && par5Entity instanceof EntityPlayerMP){
			 
         EntityPlayerMP thePlayer = (EntityPlayerMP)par5Entity;
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
}
	
@SideOnly(Side.CLIENT)
/**
* A randomly called display update to be able to add particles or other items for display
*/
public void randomDisplayTick(World par1World, BlockPos pos, IBlockState state, Random par5Random)
{
	
int par2 = pos.getX();
int par3 = pos.getY();
int par4 = pos.getZ();
	
if (par5Random.nextInt(100) == 0)
{
par1World.playSound((double)par2 + 0.5D, (double)par3 + 0.5D, (double)par4 + 0.5D, "portal.portal", 0.5F, par5Random.nextFloat() * 0.4F + 0.8F, false);
}
for (int l = 0; l < 4; ++l)
{
double d0 = (double)((float)par2 + par5Random.nextFloat());
double d1 = (double)((float)par3 + par5Random.nextFloat());
double d2 = (double)((float)par4 + par5Random.nextFloat());
double d3 = 0.0D;
double d4 = 0.0D;
double d5 = 0.0D;
int i1 = par5Random.nextInt(2) * 2 - 1;
d3 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
d4 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
d5 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
if (getBlock(par1World,par2 - 1, par3, par4) != this && getBlock(par1World,par2 + 1, par3, par4) != this)
{
d0 = (double)par2 + 0.5D + 0.25D * (double)i1;
d3 = (double)(par5Random.nextFloat() * 2.0F * (float)i1);
}
else
{
d2 = (double)par4 + 0.5D + 0.25D * (double)i1;
d5 = (double)(par5Random.nextFloat() * 2.0F * (float)i1);
}
par1World.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, d0, d1, d2, d3, d4, d5);
}
}
@SideOnly(Side.CLIENT)
/**
* only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
*/
public int idPicked(World par1World, int par2, int par3, int par4)
{
return 0;
}

public static Block getBlock(IBlockAccess world, int i, int j, int k){
	return world.getBlockState(new BlockPos(i,j,k)).getBlock();
}

}
//portal block
