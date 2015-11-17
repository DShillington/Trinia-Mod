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

public class TriniaTeleporter extends Teleporter {

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

    public TriniaTeleporter(WorldServer worldIn)
    {
		super(worldIn);
        this.worldServerInstance = worldIn;
        this.random = new Random(worldIn.getSeed());
    }

    public void placeInPortal(Entity entityIn, float rotationYaw)
    {
        
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