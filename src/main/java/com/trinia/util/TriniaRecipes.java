package com.trinia.util;

import com.trinia.blocks.TriniaBlocks;
import com.trinia.items.TriniaItems;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TriniaRecipes {
	public static void loadRecipes() {
		// -Crafting-
		// Blocks
		GameRegistry.addRecipe(new ItemStack(TriniaBlocks.steelBlock), "CCC",
				"CCC", "CCC", 'C', TriniaItems.SteelIngot);
		GameRegistry.addRecipe(new ItemStack(TriniaBlocks.copperBlock), "CCC",
				"CCC", "CCC", 'C', TriniaItems.copperIngot);
		GameRegistry.addRecipe(new ItemStack(TriniaBlocks.silverBlock), "CCC",
				"CCC", "CCC", 'C', TriniaItems.silverIngot);
		GameRegistry.addRecipe(new ItemStack(TriniaBlocks.tinBlock), "CCC",
				"CCC", "CCC", 'C', TriniaItems.tinIngot);
		// Crafting Table
		// GameRegistry.addRecipe(new
		// ItemStack(TriniaBlocks.craftingTable),"WCW", " R ", "RRR",'C',
		// Blocks.crafting_table,'R', TriniaBlocks.triniaCobblestone,'W',
		// Blocks.planks);
		// Smelting
		GameRegistry.addSmelting(TriniaBlocks.steelOre, new ItemStack(
				TriniaItems.SteelIngot), 1.5F);
		GameRegistry.addSmelting(TriniaBlocks.silverOre, new ItemStack(
				TriniaItems.silverIngot), 1.5F);
		GameRegistry.addSmelting(TriniaBlocks.copperOre, new ItemStack(
				TriniaItems.copperIngot), 1.5F);
		GameRegistry.addSmelting(TriniaBlocks.tinOre, new ItemStack(
				TriniaItems.tinIngot), 1.5F);
		// -Crafting armor-
		// Steel
		GameRegistry.addRecipe(new ItemStack(TriniaItems.triniaSteelHelmet),
				"SSS", "S S", 'S', TriniaItems.SteelIngot);
		GameRegistry.addRecipe(
				new ItemStack(TriniaItems.triniaSteelChestplate), "S S", "SSS",
				"SSS", 'S', TriniaItems.SteelIngot);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.triniaSteelLeggings),
				"SSS", "S S", "S S", 'S', TriniaItems.SteelIngot);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.triniaSteelBoots),
				"S S", "S S", 'S', TriniaItems.SteelIngot);
		//Tools
		GameRegistry.addRecipe(new ItemStack(TriniaItems.Chisel),
				" II"," II", "S  ", 'S', Items.stick, 'I', TriniaItems.SteelIngot);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.OrcaSword),
				"O O","IO ", "SIO", 'S', Items.stick, 'I', TriniaItems.SteelIngot, 'O', TriniaItems.orca);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.earthAmulat),
				"#I#","IGI", " I ", '#', TriniaItems.silverIngot, 'I', TriniaItems.inomite, 'G', TriniaBlocks.triniaGrass);
		
		// Templates
		GameRegistry.addRecipe(new ItemStack(TriniaItems.CastPickaxe), "SSP",
				"PSS", "PPS", 'S', Items.stick, 'P', Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.CastAxe), "PSP",
				"SSS", "PSS", 'S', Items.stick, 'P', Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.CastSword), "PSS",
				"SSS", "SSP", 'S', Items.stick, 'P', Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.CastSwordHandle),
				"SPP", "PSP", "PPS", 'S', Items.stick, 'P', Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.CastSpade), "PSS",
				"SPS", "PSP", 'S', Items.stick, 'P', Blocks.planks);
		// -Tool Parts-
		// Steel
		GameRegistry.addShapelessRecipe(new ItemStack(
				TriniaItems.SteelPickaxeHead, 1), TriniaItems.CastPickaxe,
				TriniaBlocks.hardenedBucketSteel);
		GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.SteelAxeHead,
				1), TriniaItems.CastAxe, TriniaBlocks.hardenedBucketSteel);
		GameRegistry.addShapelessRecipe(new ItemStack(
				TriniaItems.SteelSwordHead, 1), TriniaItems.CastSword,
				TriniaBlocks.hardenedBucketSteel);
		GameRegistry.addShapelessRecipe(new ItemStack(
				TriniaItems.SteelSwordHandle, 1), TriniaItems.CastSwordHandle,
				TriniaBlocks.hardenedBucketSteel);
		GameRegistry.addShapelessRecipe(new ItemStack(
				TriniaItems.SteelSpadeHead, 1), TriniaItems.CastSpade,
				TriniaBlocks.hardenedBucketSteel);
		// Tin
		GameRegistry.addShapelessRecipe(new ItemStack(
				TriniaItems.TinPickaxeHead, 1), TriniaItems.CastPickaxe,
				TriniaBlocks.hardenedBucketTin);
		GameRegistry.addShapelessRecipe(
				new ItemStack(TriniaItems.TinAxeHead, 1), TriniaItems.CastAxe,
				TriniaBlocks.hardenedBucketTin);
		GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.TinSwordHead,
				1), TriniaItems.CastSword, TriniaBlocks.hardenedBucketTin);
		GameRegistry.addShapelessRecipe(new ItemStack(
				TriniaItems.TinSwordHandle, 1), TriniaItems.CastSwordHandle,
				TriniaBlocks.hardenedBucketTin);
		GameRegistry.addShapelessRecipe(new ItemStack(TriniaItems.TinSpadeHead,
				1), TriniaItems.CastSpade, TriniaBlocks.hardenedBucketTin);
		// Silver
		GameRegistry.addShapelessRecipe(new ItemStack(
				TriniaItems.SilverPickaxeHead, 1), TriniaItems.CastPickaxe,
				TriniaBlocks.hardenedBucketSilver);
		GameRegistry.addShapelessRecipe(new ItemStack(
				TriniaItems.SilverAxeHead, 1), TriniaItems.CastAxe,
				TriniaBlocks.hardenedBucketSilver);
		GameRegistry.addShapelessRecipe(new ItemStack(
				TriniaItems.SilverSwordHead, 1), TriniaItems.CastSword,
				TriniaBlocks.hardenedBucketSilver);
		GameRegistry.addShapelessRecipe(new ItemStack(
				TriniaItems.SilverSwordHandle, 1), TriniaItems.CastSwordHandle,
				TriniaBlocks.hardenedBucketSilver);
		GameRegistry.addShapelessRecipe(new ItemStack(
				TriniaItems.SilverSpadeHead, 1), TriniaItems.CastSpade,
				TriniaBlocks.hardenedBucketSilver);
		// -Tools-
		// Steel
		GameRegistry.addRecipe(new ItemStack(TriniaItems.SteelPickaxe), "P",
				"S", 'S', Items.stick, 'P', TriniaItems.SteelPickaxeHead);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.SteelAxe), "A", "S",
				'S', Items.stick, 'A', TriniaItems.SteelAxeHead);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.SteelSpade), "P", "S",
				'S', Items.stick, 'P', TriniaItems.SteelSpadeHead);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.SteelSword), "P", "H",
				"S", 'S', Items.stick, 'P', TriniaItems.SteelSwordHead, 'H',
				TriniaItems.SteelSwordHandle);
		// Tin
		GameRegistry.addRecipe(new ItemStack(TriniaItems.TinPickaxe), "P", "S",
				'S', Items.stick, 'P', TriniaItems.TinPickaxeHead);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.TinAxe), "A", "S",
				'S', Items.stick, 'A', TriniaItems.TinAxeHead);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.TinSpade), "P", "S",
				'S', Items.stick, 'P', TriniaItems.TinSpadeHead);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.TinSword), "P", "H",
				"S", 'S', Items.stick, 'P', TriniaItems.TinSwordHead, 'H',
				TriniaItems.TinSwordHandle);
		// Silver
		GameRegistry.addRecipe(new ItemStack(TriniaItems.SilverPickaxe), "P",
				"S", 'S', Items.stick, 'P', TriniaItems.SilverPickaxeHead);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.SilverAxe), "A", "S",
				'S', Items.stick, 'A', TriniaItems.SilverAxeHead);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.SilverSpade), "P",
				"S", 'S', Items.stick, 'P', TriniaItems.SilverSpadeHead);
		GameRegistry.addRecipe(new ItemStack(TriniaItems.SilverSword), "P",
				"H", "S", 'S', Items.stick, 'P', TriniaItems.SilverSwordHead,
				'H', TriniaItems.SilverSwordHandle);

	}
}