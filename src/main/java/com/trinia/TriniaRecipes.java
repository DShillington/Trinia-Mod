package com.trinia;
 
import com.trinia.blocks.TriniaBlocks;
import com.trinia.init.TriniaItems;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.registry.GameRegistry;
 
public class TriniaRecipes 
{
	public static void loadRecipes() 
	{
		//-Crafting-
				//Blocks
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.steelBlock),"CCC", "CCC", "CCC",'C', TriniaItems.SteelIngot);
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.copperBlock),"CCC", "CCC", "CCC",'C', TriniaItems.copperIngot);
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.silverBlock),"CCC", "CCC", "CCC",'C', TriniaItems.silverIngot);
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.tinBlock),"CCC", "CCC", "CCC",'C', TriniaItems.tinIngot);
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.lantern),"III", "ITI", "III",'I', TriniaItems.SteelIngot,'T', Blocks.torch);
				
				//Wattle
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.wattleEight, 4),"CCC", "SSS", "CCC",'C', Items.clay_ball,'S', Items.stick);
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.wattleOne, 1),"SSS", "SWS", "SSS",'S', Items.stick,'W', TriniaBlocks.wattleEight);
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.wattleTwo, 1),"SSS", "SSS", "SWS",'S', Items.stick,'W', TriniaBlocks.wattleEight);
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.wattleThree, 3),"SSS", "SWS", "WSW",'S', Items.stick,'W', TriniaBlocks.wattleEight);
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.wattleFour, 4),"SWS", "SWS", "WSW",'S', Items.stick,'W', TriniaBlocks.wattleEight);
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.wattleFive, 2),"SSS", "SWS", "SWS",'S', Items.stick,'W', TriniaBlocks.wattleEight);
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.wattleSix,2),"SWS", "SWS", "SSS",'S', Items.stick,'W', TriniaBlocks.wattleEight);
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.wattleSeven,3),"SWS", "SSS", "WSW",'S', Items.stick,'W', TriniaBlocks.wattleEight);
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.wattleNine,3),"SWS", "SWS", "SWS",'S', Items.stick,'W', TriniaBlocks.wattleEight);
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.wattleTen,3),"SSS", "WWW", "SSS",'S', Items.stick,'W', TriniaBlocks.wattleEight);
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.wattleThirteen,5),"SWS", "WWW", "SWS",'S', Items.stick,'W', TriniaBlocks.wattleEight);
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.wattleFourteen,5),"SSS", "WWW", "SSS",'S', Items.stick,'W', TriniaBlocks.wattleEight);
				GameRegistry.addRecipe(new ItemStack(TriniaBlocks.wattleFifteen, 4),"WSW", "SWS", "SWS",'S', Items.stick,'W', TriniaBlocks.wattleEight);
				//Crafting Table
				//GameRegistry.addRecipe(new ItemStack(TriniaBlocks.craftingTable),"WCW", " R ", "RRR",'C', Blocks.crafting_table,'R', TriniaBlocks.triniaCobblestone,'W', Blocks.planks);
				//Smelting
				GameRegistry.addSmelting(TriniaBlocks.steelOre, new ItemStack(TriniaItems.SteelIngot), 1.5F); 
				GameRegistry.addSmelting(TriniaBlocks.silverOre, new ItemStack(TriniaItems.silverIngot), 1.5F); 
				GameRegistry.addSmelting(TriniaBlocks.copperOre, new ItemStack(TriniaItems.copperIngot), 1.5F); 
				GameRegistry.addSmelting(TriniaBlocks.tinOre, new ItemStack(TriniaItems.tinIngot), 1.5F); 
				//-Crafting armor-
				//Steel
				GameRegistry.addRecipe(new ItemStack(TriniaItems.triniaSteelHelmet), "SSS", "S S",'S', TriniaItems.SteelIngot);
				GameRegistry.addRecipe(new ItemStack(TriniaItems.triniaSteelChestplate),"S S", "SSS", "SSS",'S', TriniaItems.SteelIngot);
				GameRegistry.addRecipe(new ItemStack(TriniaItems.triniaSteelLeggings),"SSS", "S S", "S S",'S', TriniaItems.SteelIngot);
				GameRegistry.addRecipe(new ItemStack(TriniaItems.triniaSteelBoots), "S S", "S S",'S', TriniaItems.SteelIngot);
				//Templates
				GameRegistry.addRecipe(new ItemStack(TriniaItems.CastPickaxe),"SSP", "PSS", "PPS",'S', Items.stick, 'P', Blocks.planks);
				GameRegistry.addRecipe(new ItemStack(TriniaItems.CastAxe),"PSP", "SSS", "PSS",'S', Items.stick, 'P', Blocks.planks);
				GameRegistry.addRecipe(new ItemStack(TriniaItems.CastSword),"PSS", "SSS", "SSP",'S', Items.stick, 'P', Blocks.planks);
				GameRegistry.addRecipe(new ItemStack(TriniaItems.CastSwordHandle),"SPP", "PSP", "PPS",'S', Items.stick, 'P', Blocks.planks);
				GameRegistry.addRecipe(new ItemStack(TriniaItems.CastSpade),"PSS", "SPS", "PSP",'S', Items.stick, 'P', Blocks.planks);
				//-Tool Parts-
				//Steel
				GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.SteelPickaxeHead, 1), TriniaItems.CastPickaxe, TriniaItems.moltenSteel);
				GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.SteelAxeHead, 1), TriniaItems.CastAxe, TriniaItems.moltenSteel);
				GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.SteelSwordHead, 1), TriniaItems.CastSword, TriniaItems.moltenSteel);
				GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.SteelSwordHandle, 1), TriniaItems.CastSwordHandle, TriniaItems.moltenSteel);
				GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.SteelSpadeHead, 1), TriniaItems.CastSpade, TriniaItems.moltenSteel);
				//Tin
				GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.TinPickaxeHead, 1), TriniaItems.CastPickaxe, TriniaItems.moltenTin);
				GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.TinAxeHead, 1), TriniaItems.CastAxe, TriniaItems.moltenTin);
				GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.TinSwordHead, 1), TriniaItems.CastSword, TriniaItems.moltenTin);
				GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.TinSwordHandle, 1), TriniaItems.CastSwordHandle, TriniaItems.moltenTin);
				GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.TinSpadeHead, 1), TriniaItems.CastSpade, TriniaItems.moltenTin);
				//Silver
				GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.SilverPickaxeHead, 1), TriniaItems.CastPickaxe, TriniaItems.moltenSilver);
				GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.SilverAxeHead, 1), TriniaItems.CastAxe, TriniaItems.moltenSilver);
				GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.SilverSwordHead, 1), TriniaItems.CastSword, TriniaItems.moltenSilver);
				GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.SilverSwordHandle, 1), TriniaItems.CastSwordHandle, TriniaItems.moltenSilver);
				GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.SilverSpadeHead, 1), TriniaItems.CastSpade, TriniaItems.moltenSilver);
				//-Tools-
				//Steel
				GameRegistry.addRecipe(new ItemStack(TriniaItems.SteelPickaxe),"P", "S", 'S', Items.stick, 'P', TriniaItems.SteelPickaxeHead);
				GameRegistry.addRecipe(new ItemStack(TriniaItems.SteelAxe),"A", "S",'S', Items.stick, 'A', TriniaItems.SteelAxeHead);
				GameRegistry.addRecipe(new ItemStack(TriniaItems.SteelSpade),"P", "S",'S', Items.stick, 'P', TriniaItems.SteelSpadeHead);
				GameRegistry.addRecipe(new ItemStack(TriniaItems.SteelSword),"P", "H", "S",'S', Items.stick, 'P', TriniaItems.SteelSwordHead, 'H', TriniaItems.SteelSwordHandle);
				//Tin
				GameRegistry.addRecipe(new ItemStack(TriniaItems.TinPickaxe),"P", "S",'S', Items.stick, 'P', TriniaItems.TinPickaxeHead);
				GameRegistry.addRecipe(new ItemStack(TriniaItems.TinAxe),"A", "S",'S', Items.stick, 'A', TriniaItems.TinAxeHead);
				GameRegistry.addRecipe(new ItemStack(TriniaItems.TinSpade),"P", "S",'S', Items.stick, 'P', TriniaItems.TinSpadeHead);
				GameRegistry.addRecipe(new ItemStack(TriniaItems.TinSword),"P", "H", "S",'S', Items.stick, 'P', TriniaItems.TinSwordHead, 'H', TriniaItems.TinSwordHandle);
				//Silver
				GameRegistry.addRecipe(new ItemStack(TriniaItems.SilverPickaxe),"P", "S",'S', Items.stick, 'P', TriniaItems.SilverPickaxeHead);
				GameRegistry.addRecipe(new ItemStack(TriniaItems.SilverAxe),"A", "S",'S', Items.stick, 'A', TriniaItems.SilverAxeHead);
				GameRegistry.addRecipe(new ItemStack(TriniaItems.SilverSpade),"P", "S",'S', Items.stick, 'P', TriniaItems.SilverSpadeHead);
				GameRegistry.addRecipe(new ItemStack(TriniaItems.SilverSword),"P", "H", "S",'S', Items.stick, 'P', TriniaItems.SilverSwordHead, 'H', TriniaItems.SilverSwordHandle);
				
	}
}