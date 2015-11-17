package com.trinia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.trinia.Reference;
import com.trinia.TriniaMod;
import com.trinia.tileentity.TileEntityTriniaWorkBench;

public class TriniaBlocks 
	{
	//World gen Blocks Trinia World
	public static Block triniaCobblestone;
	public static Block triniaGrass;
	public static Block triniaDirt;
	public static Block triniaStone;
	public static Block triniaStoneBrick;
	public static Block triniaMossyStoneBrick;
	public static Block triniaChiseledStoneBrick;
	public static Block triniaCrackedStoneBrick;
	public static Block triniaMossyCobblestone;
	public static Block triniaGravel;
	public static Block steelOre;
	public static Block copperOre;
	public static Block silverOre;
	public static Block tinOre;
	public static Block redLeaves;
	public static Block greenLeaves;
	public static Block purpleLeaves;
	public static Block yellowLeaves;
	public static Block blueLeaves;
	public static Block FlowerStem;
	public static Block FlowerBlue;
	public static Block FlowerGreen;
	public static Block FlowerOrange;
	public static Block FlowerPink;
	public static Block FlowerPurple;
	public static Block FlowerRed;
	public static Block FlowerYellow;
	public static Block MagicalBed;
	public static Block CastingBench;
	//Trinia Blocks
	public static Block steelBlock;
	public static Block copperBlock;
	public static Block silverBlock;
	public static Block tinBlock;
	public static Block hardenedBucket;
	public static Block hardenedBucketLava;
	public static Block hardenedBucketSilver;
	public static Block hardenedBucketSteel;
	public static Block hardenedBucketTin;
	public static Block hardenedBucketCopper;
	
	//World Gen Blocks Medeival World
	public static Block adimiteOre;
	public static Block bridroneOre;
	public static Block orcaOre;
	public static Block orisoneOre;
	//public static Block rockWheel;
	
	public static void init()
	{
		//Trinia World Gen Blocks
		triniaCobblestone = new BlockTrinia(Material.rock).setUnlocalizedName("triniaCobblestone");
		triniaGrass = new BlockTriniaGrass().setUnlocalizedName("triniaGrass");
		triniaDirt = new BlockTriniaDirt().setUnlocalizedName("triniaDirt");
		triniaStone = new BlockTriniaStone(Material.rock).setUnlocalizedName("triniaStone");
		triniaStoneBrick = new BlockTrinia(Material.rock).setUnlocalizedName("triniaStoneBrick");
		triniaMossyStoneBrick = new BlockTrinia(Material.rock).setUnlocalizedName("triniaMossyStoneBrick");
		triniaChiseledStoneBrick = new BlockTrinia(Material.rock).setUnlocalizedName("triniaChiseledStoneBrick");
		triniaCrackedStoneBrick = new BlockTrinia(Material.rock).setUnlocalizedName("triniaCrackedStoneBrick");
		triniaMossyCobblestone = new BlockTrinia(Material.rock).setUnlocalizedName("triniaMossyCobblestone");
		triniaGravel = new BlockTriniaGravel().setUnlocalizedName("triniaGravel");
		redLeaves = new BlockTriniaLeavesBase(Material.leaves, true).setUnlocalizedName("redLeaves").setLightOpacity(0);
		greenLeaves = new BlockTriniaLeavesBase(Material.leaves, true).setUnlocalizedName("greenLeaves").setLightOpacity(0);
		blueLeaves = new BlockTriniaLeavesBase(Material.leaves, true).setUnlocalizedName("blueLeaves").setLightOpacity(0);
		yellowLeaves = new BlockTriniaLeavesBase(Material.leaves, true).setUnlocalizedName("yellowLeaves").setLightOpacity(0);
		purpleLeaves = new BlockTriniaLeavesBase(Material.leaves, true).setUnlocalizedName("purpleLeaves").setLightOpacity(0);
		steelOre = new BlockTrinia(Material.rock).setUnlocalizedName("steelOre");
		copperOre = new BlockTrinia(Material.rock).setUnlocalizedName("copperOre");
		silverOre = new BlockTrinia(Material.rock).setUnlocalizedName("silverOre");
		tinOre = new BlockTrinia(Material.rock).setUnlocalizedName("tinOre");
		FlowerStem = new BlockFlower(Material.plants).setUnlocalizedName("FlowerStem");
		FlowerBlue = new BlockFlower(Material.plants).setUnlocalizedName("FlowerBlue");
		FlowerGreen = new BlockFlower(Material.plants).setUnlocalizedName("FlowerGreen");
		FlowerOrange = new BlockFlower(Material.plants).setUnlocalizedName("FlowerOrange");
		FlowerPink = new BlockFlower(Material.plants).setUnlocalizedName("FlowerPink");
		FlowerPurple = new BlockFlower(Material.plants).setUnlocalizedName("FlowerPurple");
		FlowerRed = new BlockFlower(Material.plants).setUnlocalizedName("FlowerRed");
		FlowerYellow = new BlockFlower(Material.plants).setUnlocalizedName("FlowerYellow");
		adimiteOre = new BlockAdimiteOre().setUnlocalizedName("adimiteOre");
		bridroneOre = new BlockTrinia(Material.rock).setUnlocalizedName("bridroneOre");
		orcaOre = new BlockTrinia(Material.rock).setUnlocalizedName("orcaOre");
		orisoneOre = new BlockTrinia(Material.rock).setUnlocalizedName("orisoneOre");
		MagicalBed = new BlockMagicalBed().setUnlocalizedName("MagicalBed");
		CastingBench = new BlockCastingBench(Material.iron).setUnlocalizedName("CastingBench");
		
		
		//Trinia Blocks
		steelBlock = new BlockTrinia(Material.rock).setUnlocalizedName("steelBlock");
		copperBlock = new BlockTrinia(Material.rock).setUnlocalizedName("copperBlock");
		silverBlock = new BlockTrinia(Material.rock).setUnlocalizedName("silverBlock");
		tinBlock = new BlockTrinia(Material.rock).setUnlocalizedName("tinBlock");
		hardenedBucket = new BlockHardenedBucket(Material.iron).setUnlocalizedName("hardenedBucket");
		hardenedBucketLava = new BlockHardenedBucket(Material.iron).setUnlocalizedName("hardenedBucketLava");
		hardenedBucketCopper = new BlockHardenedBucket(Material.iron).setUnlocalizedName("hardenedBucketCopper");
		hardenedBucketSilver = new BlockHardenedBucket(Material.iron).setUnlocalizedName("hardenedBucketSilver");
		hardenedBucketSteel = new BlockHardenedBucket(Material.iron).setUnlocalizedName("hardenedBucketSteel");
		hardenedBucketTin = new BlockHardenedBucket(Material.iron).setUnlocalizedName("hardenedBucketTin");
		
	}
	public static void register()
	{
		//Trinia World Gen Blocks
		GameRegistry.registerBlock(steelOre, steelOre.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(copperOre, copperOre.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(silverOre, silverOre.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(tinOre, tinOre.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(triniaCobblestone, triniaCobblestone.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(triniaGrass, triniaGrass.getUnlocalizedName().substring(5)).setHardness(0.6F).setStepSound(Block.soundTypeGrass).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(triniaDirt, triniaDirt.getUnlocalizedName().substring(5)).setHardness(0.6F).setStepSound(Block.soundTypeGrass).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(triniaStone, triniaStone.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(triniaStoneBrick, triniaStoneBrick.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(triniaMossyStoneBrick, triniaMossyStoneBrick.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(triniaChiseledStoneBrick, triniaChiseledStoneBrick.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(triniaCrackedStoneBrick, triniaCrackedStoneBrick.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(triniaMossyCobblestone, triniaMossyCobblestone.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(triniaGravel, triniaGravel.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeGravel).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(redLeaves, redLeaves.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(greenLeaves, greenLeaves.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(blueLeaves, blueLeaves.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(yellowLeaves, yellowLeaves.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(purpleLeaves, purpleLeaves.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(FlowerStem, FlowerStem.getUnlocalizedName().substring(5)).setHardness(0.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(FlowerBlue, FlowerBlue.getUnlocalizedName().substring(5)).setHardness(0.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(FlowerGreen, FlowerGreen.getUnlocalizedName().substring(5)).setHardness(0.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(FlowerOrange, FlowerOrange.getUnlocalizedName().substring(5)).setHardness(0.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(FlowerPink, FlowerPink.getUnlocalizedName().substring(5)).setHardness(0.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(FlowerPurple, FlowerPurple.getUnlocalizedName().substring(5)).setHardness(0.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(FlowerRed, FlowerRed.getUnlocalizedName().substring(5)).setHardness(0.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(FlowerYellow, FlowerYellow.getUnlocalizedName().substring(5)).setHardness(0.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(adimiteOre, adimiteOre.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(bridroneOre, bridroneOre.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(orcaOre, orcaOre.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(orisoneOre, orisoneOre.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(MagicalBed, MagicalBed.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone);
		GameRegistry.registerBlock(CastingBench, CastingBench.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		
		//Trinia Blocks
		GameRegistry.registerBlock(steelBlock, steelBlock.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(copperBlock, copperBlock.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(silverBlock, silverBlock.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(tinBlock, tinBlock.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(hardenedBucket, hardenedBucket.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);;
		GameRegistry.registerBlock(hardenedBucketLava, hardenedBucketLava.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);;
		GameRegistry.registerBlock(hardenedBucketCopper, hardenedBucketCopper.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);;
		GameRegistry.registerBlock(hardenedBucketSilver, hardenedBucketSilver.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);;
		GameRegistry.registerBlock(hardenedBucketSteel, hardenedBucketSteel.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);;
		GameRegistry.registerBlock(hardenedBucketTin, hardenedBucketTin.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);;

	}
	public static void registerTileEntitys()
	{
		GameRegistry.registerTileEntity(TileEntityTriniaWorkBench.class, "craftingTileEntity");
	}
	
	public static void registerRenders()
	{
		RegisterRender(FlowerStem);
		RegisterRender(FlowerBlue);
		RegisterRender(FlowerGreen);
		RegisterRender(FlowerOrange);
		RegisterRender(FlowerPink);
		RegisterRender(FlowerPurple);
		RegisterRender(FlowerRed);
		RegisterRender(FlowerYellow);
		RegisterRender(CastingBench);
		RegisterRender(hardenedBucket);
		RegisterRender(hardenedBucketLava);
		RegisterRender(hardenedBucketCopper);
		RegisterRender(hardenedBucketSilver);
		RegisterRender(hardenedBucketSteel);
		RegisterRender(hardenedBucketTin);
		//Random
		RegisterRender(redLeaves);
		RegisterRender(greenLeaves);
		RegisterRender(blueLeaves);
		RegisterRender(yellowLeaves);
		RegisterRender(purpleLeaves);
		//worldgen
		RegisterRender(triniaCobblestone);
		RegisterRender(triniaGrass);
		RegisterRender(triniaDirt);
		RegisterRender(triniaStone);
		RegisterRender(triniaStoneBrick);
		RegisterRender(triniaMossyStoneBrick);
		RegisterRender(triniaChiseledStoneBrick);
		RegisterRender(triniaCrackedStoneBrick);
		RegisterRender(triniaMossyCobblestone);
		RegisterRender(triniaGravel);
		RegisterRender(MagicalBed);
		//Ores
		RegisterRender(steelOre);
		RegisterRender(copperOre);
		RegisterRender(silverOre);
		RegisterRender(tinOre);
		RegisterRender(adimiteOre);
		RegisterRender(bridroneOre);
		RegisterRender(orcaOre);
		RegisterRender(orisoneOre);
		//Ore Blocks
		RegisterRender(steelBlock);
		RegisterRender(copperBlock);
		RegisterRender(silverBlock);
		RegisterRender(tinBlock);
	}
	
	public static void RegisterRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
