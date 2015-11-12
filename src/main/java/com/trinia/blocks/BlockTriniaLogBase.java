package com.trinia.blocks;

import com.google.common.base.Predicate;

import java.util.List;

import net.minecraft.block.BlockLog;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockTriniaLogBase extends BlockTriniaLog
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", BlockTriniaPlanks.EnumType.class, new Predicate()
    {
        private static final String __OBFID = "CL_00002084";
        public boolean apply(BlockTriniaPlanks.EnumType type)
        {
            return type.getMetadata() < 4;
        }
        public boolean apply(Object p_apply_1_)
        {
            return this.apply((BlockTriniaPlanks.EnumType)p_apply_1_);
        }
    });
    private static final String __OBFID = "CL_00000281";

    public BlockTriniaLogBase()
    {
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, BlockTriniaPlanks.EnumType.RED).withProperty(LOG_AXIS, BlockTriniaLog.EnumAxis.Y));
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list)
    {
        list.add(new ItemStack(itemIn, 1, BlockTriniaPlanks.EnumType.RED.getMetadata()));
        list.add(new ItemStack(itemIn, 1, BlockTriniaPlanks.EnumType.GREEN.getMetadata()));
        list.add(new ItemStack(itemIn, 1, BlockTriniaPlanks.EnumType.BLUE.getMetadata()));
        list.add(new ItemStack(itemIn, 1, BlockTriniaPlanks.EnumType.YELLOW.getMetadata()));
        list.add(new ItemStack(itemIn, 1, BlockTriniaPlanks.EnumType.PURPLE.getMetadata()));
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, BlockTriniaPlanks.EnumType.byMetadata((meta & 3) % 4));

        switch (meta & 12)
        {
            case 0:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockTriniaLog.EnumAxis.Y);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockTriniaLog.EnumAxis.X);
                break;
            case 8:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockTriniaLog.EnumAxis.Z);
                break;
            default:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockTriniaLog.EnumAxis.NONE);
        }

        return iblockstate;
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        byte b0 = 0;
        int i = b0 | ((BlockTriniaPlanks.EnumType)state.getValue(VARIANT)).getMetadata();

        switch (BlockTriniaLogBase.SwitchEnumAxis.AXIS_LOOKUP[((BlockTriniaLog.EnumAxis)state.getValue(LOG_AXIS)).ordinal()])
        {
            case 1:
                i |= 4;
                break;
            case 2:
                i |= 8;
                break;
            case 3:
                i |= 12;
        }

        return i;
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {VARIANT, LOG_AXIS});
    }

    protected ItemStack createStackedBlock(IBlockState state)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1, ((BlockTriniaPlanks.EnumType)state.getValue(VARIANT)).getMetadata());
    }

    /**
     * Get the damage value that this Block should drop
     */
    public int damageDropped(IBlockState state)
    {
        return ((BlockTriniaPlanks.EnumType)state.getValue(VARIANT)).getMetadata();
    }

    static final class SwitchEnumAxis
        {
            static final int[] AXIS_LOOKUP = new int[BlockTriniaLog.EnumAxis.values().length];
            private static final String __OBFID = "CL_00002083";

            static
            {
                try
                {
                    AXIS_LOOKUP[BlockTriniaLog.EnumAxis.X.ordinal()] = 1;
                }
                catch (NoSuchFieldError var3)
                {
                    ;
                }

                try
                {
                    AXIS_LOOKUP[BlockTriniaLog.EnumAxis.Z.ordinal()] = 2;
                }
                catch (NoSuchFieldError var2)
                {
                    ;
                }

                try
                {
                    AXIS_LOOKUP[BlockTriniaLog.EnumAxis.NONE.ordinal()] = 3;
                }
                catch (NoSuchFieldError var1)
                {
                    ;
                }
            }
        }
}