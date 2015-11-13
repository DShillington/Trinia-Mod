package com.trinia.world;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.*;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.SCATTERED_FEATURE;

import java.util.List;
import java.util.Random;

import com.trinia.blocks.TriniaBlocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderSettings;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenLiquids;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenPumpkin;
import net.minecraft.world.gen.feature.WorldGenReed;
import net.minecraft.world.gen.feature.WorldGenSand;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class ChunkProviderModded implements IChunkProvider {
    
    private Random rand;
    private Random randomGenerator;
    private NoiseGeneratorOctaves noiseGen1, noiseGen2, noiseGen3, field_909_n, noiseGen4, noiseGen5, noiseGen6;
    private NoiseGeneratorPerlin field_147430_m;
    private World worldObj;
    private World currentWorld;
    private ChunkProviderSettings chunkProviderSettings;
    private BiomeGenBase[] biomesForGeneration;
    private MapGenScatteredFeature scatteredFeatureGenerator;
    private BlockPos field_180294_c;
    private WorldGenFlowers yellowFlowerGen;
    private WorldGenerator dirtGen;
    private WorldGenerator gravelGen;
    private WorldGenerator graniteGen;
    private WorldGenerator dioriteGen;
    private WorldGenerator andesiteGen;
    private WorldGenerator gravelAsSandGen;
    private WorldGenerator reedGen;
    private double[] noiseArray, stoneNoise = new double[256];
    private double[] noise3, noise1, noise2, noise5, noise6;
    private double[] generatedTemperatures;
    private int[][] field_914_i = new int[32][32];
    private int treesPerChunk;
    private int flowersPerChunk;
    private int grassPerChunk;
    private int reedsPerChunk;
    private int sandPerChunk;
    private boolean generateLakes;


    public ChunkProviderModded(World var1, long var2){
             worldObj = var1;
             rand = new Random(var2);
             noiseGen1 = new NoiseGeneratorOctaves( rand, 16);
             noiseGen2 = new NoiseGeneratorOctaves( rand, 16);
             noiseGen3 = new NoiseGeneratorOctaves( rand, 8);
             field_909_n = new NoiseGeneratorOctaves( rand, 4);
             field_147430_m = new NoiseGeneratorPerlin( rand, 4);
             noiseGen4 = new NoiseGeneratorOctaves( rand, 4);
             noiseGen5 = new NoiseGeneratorOctaves( rand, 10);
             noiseGen6 = new NoiseGeneratorOctaves( rand, 16);
             scatteredFeatureGenerator = new MapGenScatteredFeature();
            {
            	scatteredFeatureGenerator = (MapGenScatteredFeature)TerrainGen.getModdedMapGen(scatteredFeatureGenerator, SCATTERED_FEATURE);
            }
             gravelAsSandGen = new WorldGenSand(Blocks.gravel, 6);
             yellowFlowerGen = new WorldGenFlowers(Blocks.yellow_flower, BlockFlower.EnumFlowerType.DANDELION);
             reedGen = new WorldGenReed();
             flowersPerChunk = 2;
             grassPerChunk = 1;
             sandPerChunk = 1;
             treesPerChunk = 1;
             generateLakes = true;
    }

    @Override
    public boolean chunkExists(int i, int j) {
            return true;
    }

    @Override
    public Chunk provideChunk(int par1, int par2) {
             rand.setSeed((long)par1 * 391279128714L + (long)par2 * 132894987741L);
            ChunkPrimer primer = new ChunkPrimer();
             biomesForGeneration =  worldObj.getWorldChunkManager().loadBlockGeneratorData( biomesForGeneration, par1 * 16, par2 * 16, 16, 16);
             generateTerrain(par1, par2, primer);
             replaceBlocksForBiome(primer);
            Chunk chunk = new Chunk( worldObj, primer, par1, par2);
            byte[] abyte = chunk.getBiomeArray();
            for(int k = 0; k < abyte.length; ++k)
                    abyte[k] = (byte) biomesForGeneration[k].biomeID;
            chunk.generateSkylightMap();
            return chunk;
    }

    public void generateTerrain(int var1, int var2, ChunkPrimer primer) {
    	byte b0 = 2;
		int k = b0 + 1;
		byte b1 = 33;
		int l = b0 + 1;
		 noiseArray =  initializeNoiseField( noiseArray, var1 * b0, 0, var2 * b0, k, b1, l);

		for (int i1 = 0; i1 < b0; ++i1) {
			for (int j1 = 0; j1 < b0; ++j1) {
				for (int k1 = 0; k1 < 32; ++k1) {
					double d0 = 0.25D;
					double d1 =  noiseArray[((i1 + 0) * l + j1 + 0) * b1 + k1 + 0];
					double d2 =  noiseArray[((i1 + 0) * l + j1 + 1) * b1 + k1 + 0];
					double d3 =  noiseArray[((i1 + 1) * l + j1 + 0) * b1 + k1 + 0];
					double d4 =  noiseArray[((i1 + 1) * l + j1 + 1) * b1 + k1 + 0];
					double d5 = ( noiseArray[((i1 + 0) * l + j1 + 0) * b1 + k1 + 1] - d1) * d0;
					double d6 = ( noiseArray[((i1 + 0) * l + j1 + 1) * b1 + k1 + 1] - d2) * d0;
					double d7 = ( noiseArray[((i1 + 1) * l + j1 + 0) * b1 + k1 + 1] - d3) * d0;
					double d8 = ( noiseArray[((i1 + 1) * l + j1 + 1) * b1 + k1 + 1] - d4) * d0;
					for (int l1 = 0; l1 < 4; ++l1) {
						double d9 = 0.125D;
						double d10 = d1;
						double d11 = d2;
						double d12 = (d3 - d1) * d9;
						double d13 = (d4 - d2) * d9;
						for (int i2 = 0; i2 < 8; ++i2) {
							double d14 = 0.125D;
							double d15 = d10;
							double d16 = (d11 - d10) * d14;
							for (int j2 = 0; j2 < 8; ++j2) {
								IBlockState iblockstate = null;
								if(d15 > 0.0D) iblockstate = TriniaBlocks.triniaStone.getDefaultState();
								int k2 = i2 + i1 * 8;
								int l2 = l1 + k1 * 4;
								int i3 = j2 + j1 * 8;
								primer.setBlockState(k2, l2, i3, iblockstate);
								d15 += d16;
							}
							d10 += d12;
							d11 += d13;
						}
						d1 += d5;
						d2 += d6;
						d3 += d7;
						d4 += d8;
					}
				}
			}
		}
    }
   
    public final void replaceBlocksForBiome(ChunkPrimer c) {
            for (int i = 0; i < 16; ++i) {
    			for (int j = 0; j < 16; ++j) {
    				byte b0 = 1;
    				int k = -1;
    				IBlockState iblockstate = TriniaBlocks.triniaGrass.getDefaultState();
    				IBlockState iblockstate1 = TriniaBlocks.triniaDirt.getDefaultState();

    				for (int l = 127; l >= 0; --l) {
    					IBlockState iblockstate2 = c.getBlockState(i, l, j);
    					if (iblockstate2.getBlock().getMaterial() == Material.air) 
    						k = -1;

    					else if (iblockstate2.getBlock() == TriniaBlocks.triniaStone) {
    						if (k == -1) {
    							if (b0 <= 0) {
    								iblockstate = Blocks.air.getDefaultState();
    								iblockstate1 = TriniaBlocks.triniaDirt.getDefaultState();
    							}
    							k = b0;
    							if(l >= 0) {
    								c.setBlockState(i, l, j, iblockstate);
    							} else {
    								c.setBlockState(i, l, j, iblockstate1);
    								if(c.getBlockState(i, l - 1, j) == TriniaBlocks.triniaDirt.getDefaultState()) c.setBlockState(i, l - 1, j, iblockstate1);
    								if(c.getBlockState(i, l - 2, j) == TriniaBlocks.triniaStone.getDefaultState() && rand.nextInt(2) == 0) c.setBlockState(i, l - 2, j, iblockstate1);
    							}
    						}
    						else if (k > 0) {
    							--k;
    							c.setBlockState(i, l, j, iblockstate1);
    							if(c.getBlockState(i, l - 1, j) == TriniaBlocks.triniaDirt.getDefaultState()) c.setBlockState(i, l - 1, j, iblockstate1);
    							if(c.getBlockState(i, l - 2, j) == TriniaBlocks.triniaStone.getDefaultState() && rand.nextInt(2) == 0) c.setBlockState(i, l - 2, j, iblockstate1);
    						}
    					}
    				}
    			}
    		}
    }
   
    private double[] initializeNoiseField(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
            if(var1 == null) var1 = new double[var5 * var6 * var7];
            double var8 = 684.412D;
            double var10 = 684.412D;
             noise5 =  noiseGen5.generateNoiseOctaves( noise5, var2, var4, var5, var7, 1.121D, 1.121D, 0.5D);
             noise6 =  noiseGen6.generateNoiseOctaves( noise6, var2, var4, var5, var7, 10000.0D, 10000.0D, 0.5D);
            var8 *= 2.0D;
             noise3 =  noiseGen3.generateNoiseOctaves( noise3, var2, var3, var4, var5, var6, var7, var8 / 800.0D, var8 / 110.0D, var8 / 800.0D);
             noise1 =  noiseGen1.generateNoiseOctaves( noise1, var2, var3, var4, var5, var6, var7, var8, var10, var8);
             noise2 =  noiseGen2.generateNoiseOctaves( noise2, var2, var3, var4, var5, var6, var7, var8, var10, var8);
            int var12 = 0;
            int var13 = 0;
            int var14 = 16 / var5;

            for(int var15 = 0; var15 < var5; ++var15) {
                    int var16 = var15 * var14 + var14 / 2;
                    for(int var17 = 0; var17 < var7; ++var17) {
                            int var18 = var17 * var14 + var14 / 2;
                            double var19 = ( noise5[var13] + 256.0D) / 512.0D;
                            double var21 =  noise6[var13] / 8000.0D;
                            if(var21 < 0.0D) var21 = -var21 * 0.3D;
                            var21 = var21 * 3.0D - 2.0D;
                            if(var21 > 1.0D) var21 = 1.0D;
                            var21 /= 8.0D;
                            var21 = 0.0D;
                            if(var19 < 0.0D) var19 = 0.0D;
                            var19 += 0.5D;
                            var21 = var21 * var6 / 16.0D;
                            ++var13;
                            double var23 = var6 / 2.0D;
                            for(int var25 = 0; var25 < var6; ++var25) {
                                    double var26 = 0.0D;
                                    double var28 = (var25 - var23) * 8.0D / var19;
                                    if(var28 < 0.0D) var28 *= -1.0D;
                                    double var30 =  noise1[var12] / 512.0D;
                                    double var32 =  noise2[var12] / 512.0D;
                                    double var34 = ( noise3[var12] / 10.0D + 1.0D) / 2.0D;
                                    if(var34 < 0.0D) var26 = var30;
                                    else if(var34 > 1.0D) var26 = var32;
                                    else var26 = var30 + (var32 - var30) * var34;
                                    var26 -= 8.0D;
                                    byte var36 = 32;
                                    double var37;
                                    if(var25 > var6 - var36) {
                                            var37 = (var25 - (var6 - var36)) / (var36 - 1.0F);
                                            var26 = var26 * (1.0D - var37) + -30.0D * var37;
                                    }
                                    var36 = 8;
                                    if(var25 < var36) {
                                            var37 = (var36 - var25) / (var36 - 1.0F);
                                            var26 = var26 * (1.0D - var37) + -30.0D * var37;
                                    }
                                    var1[var12] = var26;
                                    ++var12;
                            }
                    }
            }
            return var1;
    }

    @Override
    public void populate(IChunkProvider ichunkprovider, int i, int j) {
    	BlockFalling.fallInstantly = true;
    	int k = i * 16;
        int l = j * 16;
        BlockPos blockpos = new BlockPos(k, 0, l);
        BiomeGenBase biomegenbase =  worldObj.getBiomeGenForCoords(blockpos.add(16, 0, 16));
         rand.setSeed( worldObj.getSeed());
        long i1 =  rand.nextLong() / 2L * 2L + 1L;
        long j1 =  rand.nextLong() / 2L * 2L + 1L;
         rand.setSeed((long)i * i1 + (long)j * j1 ^  worldObj.getSeed());
        boolean flag = false;
        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Pre(ichunkprovider, worldObj, rand, i, j, flag));

        if (currentWorld != null)
        {
            throw new RuntimeException("Already decorating");
        }
        else
        {
            currentWorld = worldObj;
            String s = worldObj.getWorldInfo().getGeneratorOptions();

            if (s != null)
            {
                chunkProviderSettings = ChunkProviderSettings.Factory.func_177865_a(s).func_177864_b();
            }
            else
            {
                chunkProviderSettings = ChunkProviderSettings.Factory.func_177865_a("").func_177864_b();
            }

            randomGenerator = rand;
            field_180294_c = blockpos;
            dirtGen = new WorldGenMinable(TriniaBlocks.triniaDirt.getDefaultState(), chunkProviderSettings.dirtSize);
            gravelGen = new WorldGenMinable(Blocks.gravel.getDefaultState(), chunkProviderSettings.gravelSize);
            genDecorations(biomegenbase);
            currentWorld = null;
            randomGenerator = null;
        }

        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Post(ichunkprovider, worldObj, rand, i, j, flag));
    	BlockFalling.fallInstantly = false;
    	
    }

    public void genDecorations(BiomeGenBase biomegenbase) {
    	MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(currentWorld, randomGenerator, field_180294_c));
        int i;
        int j;
        int k;

        boolean doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, SAND);

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, SAND_PASS2);
        for (i = 0; doGen && i <  sandPerChunk; ++i)
        {
            j = randomGenerator.nextInt(16) + 8;
            k = randomGenerator.nextInt(16) + 8;
            gravelAsSandGen.generate(currentWorld, randomGenerator, currentWorld.getTopSolidOrLiquidBlock(field_180294_c.add(j, 0, k)));
        }
        
        i = treesPerChunk;

        if (randomGenerator.nextInt(10) == 0)
        {
            ++i;
        }

        int l;
        BlockPos blockpos;

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, TREE);
        for (j = 0; doGen && j < i; ++j)
        {
            k = randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(16) + 8;
            WorldGenAbstractTree worldgenabstracttree = biomegenbase.genBigTreeChance(randomGenerator);
            worldgenabstracttree.func_175904_e();
            blockpos = currentWorld.getHorizon(field_180294_c.add(k, 0, l));

            if (worldgenabstracttree.generate(currentWorld, randomGenerator, blockpos))
            {
                worldgenabstracttree.func_180711_a(currentWorld, randomGenerator, blockpos);
            }
        }


        int i1;

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, FLOWERS);
        for (j = 0; doGen && j < flowersPerChunk; ++j)
        {
            k = randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(16) + 8;
            i1 = nextInt(currentWorld.getHorizon(field_180294_c.add(k, 0, l)).getY() + 32);
            blockpos = field_180294_c.add(k, i1, l);
            BlockFlower.EnumFlowerType enumflowertype = biomegenbase.pickRandomFlower(randomGenerator, blockpos);
            BlockFlower blockflower = enumflowertype.getBlockType().getBlock();

            if (blockflower.getMaterial() != Material.air)
            {
                yellowFlowerGen.setGeneratedBlock(blockflower, enumflowertype);
                yellowFlowerGen.generate(currentWorld, randomGenerator, blockpos);
            }
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, GRASS);
        for (j = 0; doGen && j < grassPerChunk; ++j)
        {
            k = randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(16) + 8;
            i1 = nextInt(currentWorld.getHorizon( field_180294_c.add(k, 0, l)).getY() * 2);
            biomegenbase.getRandomWorldGenForGrass(randomGenerator).generate(currentWorld, randomGenerator, field_180294_c.add(k, i1, l));
        }

        j = 0;

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, REED);
        for (j = 0; doGen && j < reedsPerChunk; ++j)
        {
            k = randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(16) + 8;
            i1 = nextInt(currentWorld.getHorizon( field_180294_c.add(k, 0, l)).getY() * 2);
             reedGen.generate(currentWorld, randomGenerator, field_180294_c.add(k, i1, l));
        }

        for (j = 0; doGen && j < 10; ++j)
        {
            k = randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(16) + 8;
            i1 = nextInt(currentWorld.getHorizon(field_180294_c.add(k, 0, l)).getY() * 2);
             reedGen.generate(currentWorld, randomGenerator, field_180294_c.add(k, i1, l));
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, PUMPKIN);
        if (doGen &&  randomGenerator.nextInt(32) == 0)
        {
            j = randomGenerator.nextInt(16) + 8;
            k = randomGenerator.nextInt(16) + 8;
            l = nextInt(currentWorld.getHorizon( field_180294_c.add(j, 0, k)).getY() * 2);
            (new WorldGenPumpkin()).generate(currentWorld, randomGenerator, field_180294_c.add(j, l, k));
        }

        if (generateLakes)
        {
            BlockPos blockpos1;

            doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, LAKE_WATER);
            for (j = 0; doGen && j < 50; ++j)
            {
                blockpos1 =  field_180294_c.add( randomGenerator.nextInt(16) + 8, randomGenerator.nextInt(randomGenerator.nextInt(248) + 8), randomGenerator.nextInt(16) + 8);
                (new WorldGenLiquids(Blocks.flowing_water)).generate(currentWorld, randomGenerator, blockpos1);
            }

        }

        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(currentWorld, randomGenerator, field_180294_c));
    }
	
	private int nextInt(int i)
	{
		if (i <= 1)
            return 0;
        return  randomGenerator.nextInt(i);
	}

	@Override
    public boolean saveChunks(boolean par1, IProgressUpdate par2) {
            return true;
    }

    @Override
    public boolean unloadQueuedChunks() {
            return false;
    }

    @Override
    public boolean canSave() {
            return true;
    }

    @Override
    public String makeString() {
            return "Trinia Dimension";
    }

    @Override
    public int getLoadedChunkCount() {
            return 0;
    }

    @Override
    public void saveExtraData() { }

    @Override
    public boolean func_177460_a(IChunkProvider p_177460_1_, Chunk p_177460_2_, int p_177460_3_, int p_177460_4_) {
            return false;
    }

    @Override
    public List func_177458_a(EnumCreatureType p_177458_1_, BlockPos p_177458_2_) {
            BiomeGenBase var5 =  worldObj.getBiomeGenForCoords(p_177458_2_);
            return var5 == null ? null : var5.getSpawnableList(p_177458_1_);
    }

    @Override
    public Chunk provideChunk(BlockPos pos) {
            return provideChunk(pos.getX() >> 4, pos.getZ() >> 4);
    }

    @Override
    public BlockPos getStrongholdGen(World worldIn, String p_180513_2_, BlockPos p_180513_3_) {
            return null;
    }

    @Override
    public void recreateStructures(Chunk p_180514_1_, int par1, int par2) { }
}