package com.trinia.world;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.trinia.blocks.TriniaBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.LongHashMap;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class TriniaTeleporterPlatform extends Teleporter {

	private final WorldServer worldServerInstance;
    /** A private Random() function in Teleporter */
    private final Random random;
    /** Stores successful portal placement locations for rapid lookup. */
    private final LongHashMap destinationCoordinateCache = new LongHashMap();
    /**
     * A list of valid keys for the destinationCoordainteCache. These are based on the X & Z of the players initial
     * location.
     */
    private final List destinationCoordinateKeys = com.google.common.collect.Lists.newArrayList();
    private static final String __OBFID = "CL_00000153";

    public TriniaTeleporterPlatform(WorldServer worldIn)
    {
		super(worldIn);
        this.worldServerInstance = worldIn;
        this.random = new Random(worldIn.getSeed());
    }

    public void placeInPortal(Entity entityIn, float rotationYaw)
    {
        
            int i = MathHelper.floor_double(entityIn.posX);
            int j = MathHelper.floor_double(entityIn.posY) - 1;
            int k = MathHelper.floor_double(entityIn.posZ);
            byte b0 = 1;
            byte b1 = 0;

            for (int l = -2; l <= 2; ++l)
            {
                for (int i1 = -2; i1 <= 2; ++i1)
                {
                    for (int j1 = -1; j1 < 3; ++j1)
                    {
                        int k1 = i + i1 * b0 + l * b1;
                        int l1 = j + j1;
                        int i2 = k + i1 * b1 - l * b0;
                        boolean flag = j1 < 0;
                        this.worldServerInstance.setBlockState(new BlockPos(k1, l1, i2), flag ? TriniaBlocks.triniaCobblestone.getDefaultState() : Blocks.air.getDefaultState());
                    }
                }
            }

            entityIn.setLocationAndAngles((double)i, (double)j, (double)k, entityIn.rotationYaw, 0.0F);
            entityIn.motionX = entityIn.motionY = entityIn.motionZ = 0.0D;
        }
    

    public boolean placeInExistingPortal(Entity entityIn, float p_180620_2_)
    {
       return false;
    }

    private boolean func_180265_a(BlockPos p_180265_1_)
    {
        return !this.worldServerInstance.isAirBlock(p_180265_1_) || !this.worldServerInstance.isAirBlock(p_180265_1_.up());
    }

    

    /**
     * called periodically to remove out-of-date portal locations from the cache list. Argument par1 is a
     * WorldServer.getTotalWorldTime() value.
     */
    public void removeStalePortalLocations(long p_85189_1_)
    {
        
    }
    public class PortalPosition extends BlockPos
    {
        /** The worldtime at which this PortalPosition was last verified */
        public long lastUpdateTime;
        private static final String __OBFID = "CL_00000154";

        public PortalPosition(BlockPos pos, long p_i45747_3_)
        {
            super(pos.getX(), pos.getY(), pos.getZ());
            this.lastUpdateTime = p_i45747_3_;
        }
    }
    public static Block getBlock(IBlockAccess world, int i, int j, int k){
    	return world.getBlockState(new BlockPos(i,j,k)).getBlock();
    }

    }