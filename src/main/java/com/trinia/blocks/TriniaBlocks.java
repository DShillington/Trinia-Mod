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
	//Fluids
	//public static Fluid steel = new Fluid("steel");
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
	//public static Block Ore;
	public static Block redLeaves;
	public static Block greenLeaves;
	public static Block purpleLeaves;
	public static Block yellowLeaves;
	public static Block blueLeaves;
	//public static Block triniaFarmland;
	public static Block FlowerStem;
	public static Block FlowerBlue;
	public static Block FlowerGreen;
	public static Block FlowerOrange;
	public static Block FlowerPink;
	public static Block FlowerPurple;
	public static Block FlowerRed;
	public static Block FlowerYellow;
	//public static Block redlog;
	//public static Block greenlog;
	//Trinia Blocks
	public static Block steelBlock;
	public static Block copperBlock;
	public static Block silverBlock;
	public static Block tinBlock;
	public static Block triniaBubble;
	//public static Block hardenedBucket;
	//World Gen Blocks Medeival World
	public static Block adimiteOre;
	public static Block bridroneOre;
	public static Block orcaOre;
	public static Block orisoneOre;
	public static Block spikes;
	public static Block tombstone;
	public static Block medievalStone;
	public static Block medievalCobble;
	public static Block medievalDirt;
	public static Block medievalGrass;
	public static Block medievalGravel;
	//Medeival Blocks
	//public static Block craftingTable;
	public static Block lantern;
	public static Block smelter;
	public static Block smelterLit;
	public static Block cobbleStair;
	public static Block kingChairOne;
	public static Block barrel;
	//public static Block rockWheel;
	//Wattle
	public static Block wattleOne;
	public static Block wattleTwo;
	public static Block wattleThree;
	public static Block wattleFour;
	public static Block wattleFive;
	public static Block wattleSix;
	public static Block wattleSeven;
	public static Block wattleEight;
	public static Block wattleNine;
	public static Block wattleTen;
	public static Block wattleEleven;
	public static Block wattleThirteen;
	public static Block wattleFourteen;
	public static Block wattleFifteen;
	//Portal Stuffs
	//public static Block TriniaFire;
	public static Block portalTrinia;
	public static Block portalMedieval;
	public static Block portalTriniaFrame;
	public static Block portalMedievalFrame;
	//Stairs Walls Slabs
	//public static Block cobbleWall;
	//public static Block stoneBrickWall;
	//public static Block cobbleStairs;
	//public static Block stoneBrickStairs;
	//public static Block cobbleSlab;
	//public static Block stoneBrickSlab;
	
	public static void init()
	{
		//Stairs Walls Slabs
		//cobbleWall = new BlockTriniaWall(cobbleWall).setUnlocalizedName("cobbleWall").setLightOpacity(0);
		//stoneBrickWall = new BlockWall(triniaStoneBrick).setUnlocalizedName("stoneBrickWall").setLightOpacity(0);
		//cobbleStairs = new BlockStairs().setUnlocalizedName("cobbleStairs").setLightOpacity(0);
		//stoneBrickStairs = new BlockWattle(Material.wood).setUnlocalizedName("stoneBrickStairs").setLightOpacity(0);
		//cobbleSlab = new BlockWattle(Material.wood).setUnlocalizedName("cobbleSlab").setLightOpacity(0);
		//stoneBrickSlab = new BlockWattle(Material.wood).setUnlocalizedName("stoneBrickSlab").setLightOpacity(0);
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
		//redlog = new BlockFlower(Material.wood).setUnlocalizedName("redlog");
		//greenlog = new BlockFlower(Material.wood).setUnlocalizedName("greenlog");
		adimiteOre = new BlockAdimiteOre().setUnlocalizedName("adimiteOre");
		bridroneOre = new BlockTrinia(Material.rock).setUnlocalizedName("bridroneOre");
		orcaOre = new BlockTrinia(Material.rock).setUnlocalizedName("orcaOre");
		orisoneOre = new BlockTrinia(Material.rock).setUnlocalizedName("orisoneOre");
		
		
		//Trinia Blocks
		//triniaFarmland = new BlockTriniaFarmland().setUnlocalizedName("triniaFarmland").setLightOpacity(0);
		steelBlock = new BlockTrinia(Material.rock).setUnlocalizedName("steelBlock");
		copperBlock = new BlockTrinia(Material.rock).setUnlocalizedName("copperBlock");
		silverBlock = new BlockTrinia(Material.rock).setUnlocalizedName("silverBlock");
		tinBlock = new BlockTrinia(Material.rock).setUnlocalizedName("tinBlock");
		//hardenedBucket = new BlockHardenedBucket(Material.wood).setUnlocalizedName("hardenedBucket");
		//Wattle
		wattleOne = new BlockWattle(Material.wood).setUnlocalizedName("wattleOne");
		wattleTwo = new BlockWattle(Material.wood).setUnlocalizedName("wattleTwo");
		wattleThree = new BlockWattle(Material.wood).setUnlocalizedName("wattleThree");
		wattleFour = new BlockWattle(Material.wood).setUnlocalizedName("wattleFour");
		wattleFive = new BlockWattle(Material.wood).setUnlocalizedName("wattleFive");
		wattleSix = new BlockWattle(Material.wood).setUnlocalizedName("wattleSix");
		wattleSeven = new BlockWattle(Material.wood).setUnlocalizedName("wattleSeven");
		wattleEight = new BlockWattle(Material.wood).setUnlocalizedName("wattleEight");
		wattleNine = new BlockWattle(Material.wood).setUnlocalizedName("wattleNine");
		wattleTen = new BlockWattle(Material.wood).setUnlocalizedName("wattleTen");
		wattleEleven = new BlockWattleRotate(Material.wood).setUnlocalizedName("wattleEleven");
		wattleThirteen = new BlockWattle(Material.wood).setUnlocalizedName("wattleThirteen");
		wattleFourteen = new BlockWattle(Material.wood).setUnlocalizedName("wattleFourteen");
		wattleFifteen = new BlockWattle(Material.wood).setUnlocalizedName("wattleFifteen");
		//Medieval World Gen Blocks
		medievalCobble = new BlockMedieval(Material.rock).setUnlocalizedName("medievalCobble");
		medievalStone = new BlockMedieval(Material.rock).setUnlocalizedName("medievalStone");
		medievalGravel = new BlockTriniaGravel().setUnlocalizedName("medievalGravel");
		spikes = new BlockSpikes(Material.rock).setUnlocalizedName("spikes").setLightOpacity(0);
		//Medieval Blocks
		//craftingTable = new BlockTriniaCraftingTable(Material.rock).setUnlocalizedName("craftingtable").setLightOpacity(0);
		tombstone = new BlockTombstone(Material.rock).setUnlocalizedName("tombstone").setLightOpacity(0);
		lantern = new BlockLantern().setUnlocalizedName("lantern").setLightOpacity(0).setLightLevel(0.9375F);
		barrel = new BlockTriniaBarrel(Material.wood).setUnlocalizedName("barrel").setLightOpacity(0);
		smelter = new BlockTriniaSmelter().setUnlocalizedName("smelter").setLightOpacity(0);
		smelterLit = new BlockTriniaSmelter().setUnlocalizedName("smelterLit").setLightOpacity(0);
		triniaBubble = new BlockTombstone(Material.circuits).setUnlocalizedName("triniaBubble");
		//rockWheel = new BlockRockWheel(Material.wood).setUnlocalizedName("rockWheel");
		//Ore = new BlockTrinia(Material.circuits).setUnlocalizedName("Ore");
		kingChairOne = new BlockKingChair(Material.rock).setUnlocalizedName("KingChairOne");
		//Portal Stuffs
		portalTrinia = new BlockTriniaPortal().setUnlocalizedName("portaltrinia");;
		portalMedieval = new BlockTriniaMedieval().setUnlocalizedName("portalmedieval");
		portalTriniaFrame = new BlockTriniaFrame(Material.rock).setUnlocalizedName("portalTriniaFrame");
		portalMedievalFrame = new BlockMedievalFrame(Material.rock).setUnlocalizedName("portalMedievalFrame");
		//TriniaFire = new BlockTriniaFire().setUnlocalizedName("fire");
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
		GameRegistry.registerBlock(triniaStoneBrick, triniaStoneBrick.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(triniaMossyStoneBrick, triniaMossyStoneBrick.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(triniaChiseledStoneBrick, triniaChiseledStoneBrick.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(triniaCrackedStoneBrick, triniaCrackedStoneBrick.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(triniaMossyCobblestone, triniaMossyCobblestone.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(triniaGravel, triniaGravel.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeGravel).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(redLeaves, redLeaves.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(greenLeaves, greenLeaves.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(blueLeaves, blueLeaves.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(yellowLeaves, yellowLeaves.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(purpleLeaves, purpleLeaves.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		//GameRegistry.registerBlock(triniaFarmland, triniaFarmland.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(1.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(FlowerStem, FlowerStem.getUnlocalizedName().substring(5)).setHardness(0.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(FlowerBlue, FlowerBlue.getUnlocalizedName().substring(5)).setHardness(0.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(FlowerGreen, FlowerGreen.getUnlocalizedName().substring(5)).setHardness(0.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(FlowerOrange, FlowerOrange.getUnlocalizedName().substring(5)).setHardness(0.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(FlowerPink, FlowerPink.getUnlocalizedName().substring(5)).setHardness(0.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(FlowerPurple, FlowerPurple.getUnlocalizedName().substring(5)).setHardness(0.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(FlowerRed, FlowerRed.getUnlocalizedName().substring(5)).setHardness(0.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(FlowerYellow, FlowerYellow.getUnlocalizedName().substring(5)).setHardness(0.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		//GameRegistry.registerBlock(redlog, redlog.getUnlocalizedName().substring(5)).setHardness(2.0F).setResistance(10.0F).setStepSound(Block.soundTypeWood).setCreativeTab(TriniaMod.TriniaMainTab);
		//GameRegistry.registerBlock(greenlog, greenlog.getUnlocalizedName().substring(5)).setHardness(2.0F).setResistance(10.0F).setStepSound(Block.soundTypeWood).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(adimiteOre, adimiteOre.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(bridroneOre, bridroneOre.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(orcaOre, orcaOre.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(orisoneOre, orisoneOre.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		
		//Trinia Blocks
		GameRegistry.registerBlock(lantern, lantern.getUnlocalizedName().substring(5)).setStepSound(Block.soundTypeMetal).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(triniaBubble, triniaBubble.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);;
		GameRegistry.registerBlock(steelBlock, steelBlock.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(copperBlock, copperBlock.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(silverBlock, silverBlock.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(tinBlock, tinBlock.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		//GameRegistry.registerBlock(hardenedBucket, hardenedBucket.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);;
		
		//Medieval World Gen Blocks
		GameRegistry.registerBlock(medievalCobble, medievalCobble.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(medievalStone, medievalStone.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(medievalGravel, medievalGravel.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeGravel).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(tombstone, tombstone.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(spikes, spikes.getUnlocalizedName().substring(5)).setHardness(0.1F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		//GameRegistry.registerBlock(medievalDirt, medievalDirt.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeGravel).setCreativeTab(TriniaMod.TriniaMedievalTab);
		
		//Medieval Blocks
		GameRegistry.registerBlock(barrel, barrel.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(smelter, smelter.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(smelterLit, smelterLit.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeStone);
		//GameRegistry.registerBlock(rockWheel, rockWheel.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);;
		//GameRegistry.registerBlock(craftingTable, craftingTable.getUnlocalizedName().substring(5)).setHardness(1.5F).setStepSound(Block.soundTypeWood).setCreativeTab(TriniaMod.TriniaMedievalTab);
		//GameRegistry.registerBlock(Ore, Ore.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone);
		GameRegistry.registerBlock(kingChairOne, kingChairOne.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		
		//Wattle
		GameRegistry.registerBlock(wattleOne, wattleOne.getUnlocalizedName().substring(5)).setHardness(1.5F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(wattleTwo, wattleTwo.getUnlocalizedName().substring(5)).setHardness(1.5F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(wattleThree, wattleThree.getUnlocalizedName().substring(5)).setHardness(1.5F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(wattleFour, wattleFour.getUnlocalizedName().substring(5)).setHardness(1.5F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(wattleFive, wattleFive.getUnlocalizedName().substring(5)).setHardness(1.5F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(wattleSix, wattleSix.getUnlocalizedName().substring(5)).setHardness(1.5F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(wattleSeven, wattleSeven.getUnlocalizedName().substring(5)).setHardness(1.5F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(wattleEight, wattleEight.getUnlocalizedName().substring(5)).setHardness(1.5F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(wattleNine, wattleNine.getUnlocalizedName().substring(5)).setHardness(1.5F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(wattleTen, wattleTen.getUnlocalizedName().substring(5)).setHardness(1.5F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(wattleEleven, wattleEleven.getUnlocalizedName().substring(5)).setHardness(1.5F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(wattleThirteen, wattleThirteen.getUnlocalizedName().substring(5)).setHardness(1.5F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(wattleFourteen, wattleFourteen.getUnlocalizedName().substring(5)).setHardness(1.5F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		GameRegistry.registerBlock(wattleFifteen, wattleFifteen.getUnlocalizedName().substring(5)).setHardness(1.5F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		
		//Portal Stuffs
		GameRegistry.registerBlock(portalTrinia, portalTrinia.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(portalMedieval, portalMedieval.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(portalTriniaFrame, portalTriniaFrame.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		GameRegistry.registerBlock(portalMedievalFrame, portalMedievalFrame.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		//GameRegistry.registerBlock(TriniaFire, TriniaFire.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMainTab);
		
		//Steps Walls Slabs
		//GameRegistry.registerBlock(cobbleWall, cobbleWall.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
		//GameRegistry.registerBlock(stoneBrickWall, stoneBrickWall.getUnlocalizedName().substring(5)).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setCreativeTab(TriniaMod.TriniaMedievalTab);
				
	}
	public static void registerTileEntitys()
	{
		GameRegistry.registerTileEntity(TileEntityTriniaWorkBench.class, "craftingTileEntity");
	}
	
	public static void registerRenders()
	{
		//fluids
		//FluidRegistry.registerFluid(steel);
		//Wattle
		RegisterRender(wattleOne);
		RegisterRender(wattleTwo);
		RegisterRender(wattleThree);
		RegisterRender(wattleFour);
		RegisterRender(wattleFive);
		RegisterRender(wattleSix);
		RegisterRender(wattleSeven);
		RegisterRender(wattleEight);
		RegisterRender(wattleNine);
		RegisterRender(wattleTen);
		RegisterRender(wattleEleven);
		RegisterRender(wattleThirteen);
		RegisterRender(wattleFourteen);
		RegisterRender(wattleFifteen);
		RegisterRender(barrel);
		RegisterRender(smelter);
		RegisterRender(smelterLit);
		//RegisterRender(rockWheel);
		//RegisterRender(triniaFarmland);
		RegisterRender(FlowerStem);
		RegisterRender(FlowerBlue);
		RegisterRender(FlowerGreen);
		RegisterRender(FlowerOrange);
		RegisterRender(FlowerPink);
		RegisterRender(FlowerPurple);
		RegisterRender(FlowerRed);
		RegisterRender(FlowerYellow);
		RegisterRender(medievalCobble);
		RegisterRender(medievalGravel);
		RegisterRender(medievalStone);
		//RegisterRender(hardenedBucket);
		//Random
		//RegisterRender(craftingTable);
		RegisterRender(tombstone);
		RegisterRender(spikes);
		RegisterRender(lantern);
		RegisterRender(triniaBubble);
		RegisterRender(redLeaves);
		RegisterRender(greenLeaves);
		RegisterRender(blueLeaves);
		RegisterRender(yellowLeaves);
		RegisterRender(purpleLeaves);
		//RegisterRender(redlog);
		//RegisterRender(greenlog);
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
		//Ores
		RegisterRender(steelOre);
		RegisterRender(copperOre);
		RegisterRender(silverOre);
		RegisterRender(tinOre);
		RegisterRender(adimiteOre);
		RegisterRender(bridroneOre);
		RegisterRender(orcaOre);
		RegisterRender(orisoneOre);
		//RegisterRender(Ore);
		//Ore Blocks
		RegisterRender(steelBlock);
		RegisterRender(copperBlock);
		RegisterRender(silverBlock);
		RegisterRender(tinBlock);
		//King Chair's
		RegisterRender(kingChairOne);
		//portal
		RegisterRender(portalTrinia);
		RegisterRender(portalMedieval);
		RegisterRender(portalTriniaFrame);
		RegisterRender(portalMedievalFrame);
		//RegisterRender(TriniaFire);
	}
	
	public static void RegisterRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
