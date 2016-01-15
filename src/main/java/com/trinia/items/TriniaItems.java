package com.trinia.items;

import com.google.common.base.Function;
import com.trinia.Reference;
import com.trinia.TriniaMod;
import com.trinia.blocks.TriniaBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TriniaItems {
		
	//Tool Materials
	public static ToolMaterial TriniaSteel = EnumHelper.addToolMaterial("Steel", 3, 5000, 15.0F, 4.0F, 20);
	public static ToolMaterial TriniaSilver = EnumHelper.addToolMaterial("Silver", 2, 4000, 10.0F, 2.0F, 15);
	public static ToolMaterial TriniaTin = EnumHelper.addToolMaterial("Tin", 1, 3500, 8.0F, 1.0F, 10);
	public static ToolMaterial TriniaHammer = EnumHelper.addToolMaterial("Hammer", 0, 1000, 0F, 0F, 0);
	public static ToolMaterial TriniaSteelBattleAxe = EnumHelper.addToolMaterial("SteelBattleAxe", 3, 10000, 40.0F, 17.0F, 25);
	public static ToolMaterial TriniaSteelBastardSword = EnumHelper.addToolMaterial("SteelBastardSword", 3, 10000, 40.0F, 17.0F, 25);
	public static ToolMaterial TriniaDagger = EnumHelper.addToolMaterial("TriniaDagger", 3, 400, 15.0F, 3.0F, 20);
	public static ToolMaterial TriniaKatar = EnumHelper.addToolMaterial("TriniaKatar", 3, 2000, 20.0F, 4.0F, 20);
	public static ToolMaterial TriniaHalberd = EnumHelper.addToolMaterial("TriniaHalberd", 3, 2500, 15.0F, 3.0F, 20);
	public static ToolMaterial TriniaOrca = EnumHelper.addToolMaterial("Orca", 3, 5000, 15.0F, 4.0F, 20);
	public static ToolMaterial TriniaOrisone = EnumHelper.addToolMaterial("Orisone", 3, 5000, 15.0F, 4.0F, 20);
	public static ToolMaterial TriniaAdimite = EnumHelper.addToolMaterial("Adimite", 3, 5000, 15.0F, 4.0F, 20);
	public static ToolMaterial TriniaBridrone = EnumHelper.addToolMaterial("Bridrone", 3, 5000, 15.0F, 4.0F, 20);
	public static ToolMaterial TriniaSlingshot = EnumHelper.addToolMaterial("Slingshot", 3, 5000, 15.0F, 4.0F, 20);
	public static ToolMaterial TriniaScythe = EnumHelper.addToolMaterial("Scythe", 3, 5000, 15.0F, 4.0F, 20);
	public static ToolMaterial TriniaSai = EnumHelper.addToolMaterial("Sai", 3, 5000, 15.0F, 4.0F, 20);
	public static ToolMaterial TriniaKatana = EnumHelper.addToolMaterial("Katana", 3, 5000, 15.0F, 4.0F, 20);
	public static ToolMaterial TriniaCrossbow = EnumHelper.addToolMaterial("Crossbow", 3, 5000, 15.0F, 4.0F, 20);
	public static ToolMaterial TriniaMace = EnumHelper.addToolMaterial("Mace", 3, 5000, 15.0F, 4.0F, 20);
	
	//Armor
	public static ArmorMaterial TriniaSteelArmor = EnumHelper.addArmorMaterial("Steel", "trinia:Steel", 30, new int[] {3, 8, 6, 3}, 20);
	public static ArmorMaterial TriniaSilverArmor = EnumHelper.addArmorMaterial("Silver", "trinia:Silver", 30, new int[] {3, 8, 6, 3}, 20);
	public static ArmorMaterial TriniaBridroneArmor = EnumHelper.addArmorMaterial("Bridrone", "trinia:Bridrone", 30, new int[] {3, 8, 6, 3}, 20);
	public static ArmorMaterial TriniaAdimiteArmor = EnumHelper.addArmorMaterial("Adimite", "trinia:Adimite", 30, new int[] {3, 8, 6, 3}, 20);
	public static ArmorMaterial TriniaCopperArmor = EnumHelper.addArmorMaterial("Copper", "trinia:Copper", 30, new int[] {3, 8, 6, 3}, 20);
	public static ArmorMaterial TriniaInomiteArmor = EnumHelper.addArmorMaterial("Inomite", "trinia:Inomite", 30, new int[] {3, 8, 6, 3}, 20);
	public static ArmorMaterial TriniaOrcaArmor = EnumHelper.addArmorMaterial("Orca", "trinia:Orca", 30, new int[] {3, 8, 6, 3}, 20);
	public static ArmorMaterial TriniaOrisoneArmor = EnumHelper.addArmorMaterial("Orisone", "trinia:Orisone", 30, new int[] {3, 8, 6, 3}, 20);
	public static ArmorMaterial TriniaAmuletArmor = EnumHelper.addArmorMaterial("amulet", "trinia:amulet", 26, new int[] {3, 8, 6, 3}, 20);
	public static ArmorMaterial TriniaAngelArmor = EnumHelper.addArmorMaterial("angel", "trinia:angel", 25, new int[] {3, 8, 6, 3}, 20);
	public static ArmorMaterial TriniaCapeArmor = EnumHelper.addArmorMaterial("cape", "trinia:cape", 26, new int[] {3, 8, 6, 3}, 20);
		
	//random shit I didn't know how to put into categories -papertazer
	public static Item triniaAmulet;
	public static Item triniaCape;
	public static Item triniaCapeBlue;
	public static Item triniaCapeGreen;
	public static Item triniaCapeOrange;
	public static Item triniaCapePurple;
	public static Item triniaCapeRed;
	public static Item triniaCapeYellow;
	public static Item triniaCapeWhite;
	public static Item MagicalBedItem;
	public static Item Chisel;
	public static Item angelWings;
	public static Item angelHalo;
	public static Item goldenKey;
	public static Item inomite;
	public static Item Slingshot;
	public static Item compressed_inomite;
	//Casts
	public static Item CastBlank;
    public static Item CastPickaxe;
	public static Item CastAxe;
	public static Item CastSword;
	public static Item CastSwordHandle;
	public static Item CastSpade;
	//-Weapons-
	//Steel
	public static Item steelBattleAxe;
	public static Item steelBastardSword;
	public static Item steelDagger;
	//Tin
	//Silver
	public static Item Polearm;
	public static Item Warhammer;
	public static Item Wand;
	public static Item Sickle;
	public static Item Parasol;
	public static Item Bastard_Sword;
	public static Item Quivver;
	public static Item Staff;
	public static Item Battle_Axe;
	public static Item Ring_Sword;
	public static Item Dagger;
	public static Item Nunchucks;
	public static Item Katar;
	public static Item Swallow;
	public static Item Tonfa;
	public static Item Maul;
	public static Item Halberd;
	//Random Items
	public static Item SteelIngot;
	public static Item copperIngot;
	public static Item silverIngot;
	public static Item tinIngot;
	public static Item adimite;
	public static Item bridroneIngot;
	public static Item orca;
	public static Item orisone;
	public static Item rock;
	public static Item scroll;
	
	//Animated Icons
	public static Item toolsAnimated;
	public static Item armorAnimated;
	public static Item itemsAnimated;
	
		//-Tools-
	//Steel
	public static Item SteelPickaxe;
	public static Item SteelAxe;
	public static Item SteelSword;
	public static Item SteelSpade;
	public static Item SteelHammer;
	//Silver
	public static Item SilverPickaxe;
	public static Item SilverAxe;
	public static Item SilverSword;
	public static Item SilverSpade;
	//Tin
	public static Item TinPickaxe;
	public static Item TinAxe;
	public static Item TinSword;
	public static Item TinSpade;
	//Adimite
	public static Item AdimitePickaxe;
	public static Item AdimiteAxe;
	public static Item AdimiteSword;
	public static Item AdimiteSpade;
	//Bridrone
	public static Item BridronePickaxe;
	public static Item BridroneAxe;
	public static Item BridroneSword;
	public static Item BridroneSpade;
	//Orca
	public static Item OrcaPickaxe;
	public static Item OrcaAxe;
	public static Item OrcaSword;
	public static Item OrcaSpade;
	//Orisone
	public static Item OrisonePickaxe;
	public static Item OrisoneAxe;
	public static Item OrisoneSword;
	public static Item OrisoneFatSword;
	public static Item OrisoneSpade;
	//Other
	public static Item Mace;
	public static Item MaceBase;
	public static Item Crossbow;
	public static Item CrossbowBolt;
	public static Item Katana;
	public static Item Sai;
	public static Item Scythe;
	//-Tool Parts-
	//Steel
	public static Item SteelPickaxeHead;
	public static Item SteelAxeHead;
	public static Item SteelSwordHead;
	public static Item SteelSpadeHead;
	public static Item SteelSwordHandle;
	//Silver
	public static Item SilverPickaxeHead;
	public static Item SilverAxeHead;
	public static Item SilverSwordHead;
	public static Item SilverSpadeHead;
	public static Item SilverSwordHandle;
	//Tin
	public static Item TinPickaxeHead;
	public static Item TinAxeHead;
	public static Item TinSwordHead;
	public static Item TinSpadeHead;
	public static Item TinSwordHandle;
	//-Armor-
	//Steel
	public static Item triniaSteelHelmet;
	public static Item triniaSteelChestplate;
	public static Item triniaSteelLeggings;
	public static Item triniaSteelBoots;
	//Silver
	public static Item triniaSilverHelmet;
	public static Item triniaSilverChestplate;
	public static Item triniaSilverLeggings;
	public static Item triniaSilverBoots;
	//Tin
	public static Item triniaTinHelmet;
	public static Item triniaTinChestplate;
	public static Item triniaTinLeggings;
	public static Item triniaTinBoots;
	//Bridrone
	public static Item triniaBridroneHelmet;
	public static Item triniaBridroneChestplate;
	public static Item triniaBridroneLeggings;
	public static Item triniaBridroneBoots;
	//Adimite
	public static Item triniaAdimiteHelmet;
	public static Item triniaAdimiteChestplate;
	public static Item triniaAdimiteLeggings;
	public static Item triniaAdimiteBoots;	
	//Copper
	public static Item triniaCopperHelmet;
	public static Item triniaCopperChestplate;
	public static Item triniaCopperLeggings;
	public static Item triniaCopperBoots;
	//Inomite
	public static Item triniaInomiteHelmet;
	public static Item triniaInomiteChestplate;
	public static Item triniaInomiteLeggings;
	public static Item triniaInomiteBoots;
	//Orca
	public static Item triniaOrcaHelmet;
	public static Item triniaOrcaChestplate;
	public static Item triniaOrcaLeggings;
	public static Item triniaOrcaBoots;
	//Orisone
	public static Item triniaOrisoneHelmet;
	public static Item triniaOrisoneChestplate;
	public static Item triniaOrisoneLeggings;
	public static Item triniaOrisoneBoots;
	public static Item coin;
	public static Item earthAmulat;
	public static Item waterAmulat;
	public static Item fireAmulat;
	public static Item Rock;
	public static void init()
	{
		//-Weapons-
		//Steel
		steelBattleAxe = (new MaterialTool(null, TriniaSteelBattleAxe).setUnlocalizedName("steelBattleAxe").setCreativeTab(TriniaMod.TriniaToolsTab));
		steelBastardSword = (new MaterialTool(null, TriniaSteelBastardSword).setUnlocalizedName("steelBastardSword").setCreativeTab(TriniaMod.TriniaToolsTab));
		Polearm = (new MaterialTool(null, TriniaSteel).setUnlocalizedName("polearm").setCreativeTab(TriniaMod.TriniaToolsTab));
		Warhammer = (new MaterialTool(null, TriniaSteel).setUnlocalizedName("Warhammer").setCreativeTab(TriniaMod.TriniaToolsTab));
		Wand = (new MaterialTool(null, TriniaSteel).setUnlocalizedName("Wand").setCreativeTab(TriniaMod.TriniaToolsTab));
		Sickle = (new MaterialTool(null, TriniaSteel).setUnlocalizedName("Sickle").setCreativeTab(TriniaMod.TriniaToolsTab));
		Parasol = (new MaterialTool(null, TriniaSteel).setUnlocalizedName("Parasol").setCreativeTab(TriniaMod.TriniaToolsTab));
		//Bastard_Sword = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Bastard_Sword").setCreativeTab(TriniaMod.TriniaToolsTab));
		Quivver = (new MaterialTool(null, TriniaSteel).setUnlocalizedName("Quivver").setCreativeTab(TriniaMod.TriniaToolsTab));
		Staff = (new MaterialTool(null, TriniaSteel).setUnlocalizedName("Staff").setCreativeTab(TriniaMod.TriniaToolsTab));
		//Battle_Axe = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Battle_Axe").setCreativeTab(TriniaMod.TriniaToolsTab));
		Mace = (new MaterialTool(null, TriniaMace).setUnlocalizedName("Mace").setCreativeTab(TriniaMod.TriniaToolsTab));
		Dagger = (new MaterialTool(null, TriniaDagger).setUnlocalizedName("Dagger").setCreativeTab(TriniaMod.TriniaToolsTab));
		Katar = (new MaterialTool(null, TriniaKatar).setUnlocalizedName("Katar").setCreativeTab(TriniaMod.TriniaToolsTab));
		Sai = (new MaterialTool(null, TriniaSai).setUnlocalizedName("Sai").setCreativeTab(TriniaMod.TriniaToolsTab));
		Katana = (new MaterialTool(null, TriniaKatana).setUnlocalizedName("Katana").setCreativeTab(TriniaMod.TriniaToolsTab));
		Scythe = (new MaterialTool(null, TriniaScythe).setUnlocalizedName("Scythe").setCreativeTab(TriniaMod.TriniaToolsTab));
    	Halberd = (new MaterialTool(null, TriniaHalberd).setUnlocalizedName("Halberd").setCreativeTab(TriniaMod.TriniaToolsTab));
		//Random Items
		SteelIngot = (new ItemTrinia().setUnlocalizedName("steelingot")).setCreativeTab(TriniaMod.TriniaItemsTab);
		copperIngot = (new ItemTrinia().setUnlocalizedName("copperIngot")).setCreativeTab(TriniaMod.TriniaItemsTab);
		silverIngot = (new ItemTrinia().setUnlocalizedName("silverIngot")).setCreativeTab(TriniaMod.TriniaItemsTab);
		tinIngot = (new ItemTrinia().setUnlocalizedName("tinIngot")).setCreativeTab(TriniaMod.TriniaItemsTab);
		adimite = (new ItemTrinia().setUnlocalizedName("adimite")).setCreativeTab(TriniaMod.TriniaItemsTab);
		bridroneIngot = (new ItemTrinia().setUnlocalizedName("bridroneIngot")).setCreativeTab(TriniaMod.TriniaItemsTab);
		orca = (new ItemTrinia().setUnlocalizedName("orca")).setCreativeTab(TriniaMod.TriniaItemsTab);
		orisone = (new ItemTrinia().setUnlocalizedName("orisone")).setCreativeTab(TriniaMod.TriniaItemsTab);
		MagicalBedItem = (new ItemMagicalBed().setUnlocalizedName("MagicalBedItem")).setCreativeTab(TriniaMod.TriniaBlocksTab);
		inomite = (new ItemTrinia().setUnlocalizedName("inomite")).setCreativeTab(TriniaMod.TriniaItemsTab);
		compressed_inomite = (new ItemTrinia().setUnlocalizedName("compressed_inomite")).setCreativeTab(TriniaMod.TriniaItemsTab);
		
		//-Tools-
		//Steel
		SteelPickaxe = (new MaterialTool(null, TriniaSteel).setUnlocalizedName("SteelPickaxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SteelAxe = (new MaterialTool(null, TriniaSteel).setUnlocalizedName("steelAxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SteelSpade = (new MaterialTool(null, TriniaSteel).setUnlocalizedName("steelSpade")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SteelSword = (new MaterialTool(null, TriniaSteel).setUnlocalizedName("steelSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SteelHammer = (new MaterialTool(null, TriniaHammer).setUnlocalizedName("steelHammer")).setCreativeTab(TriniaMod.TriniaToolsTab);
		
		//Silver
		SilverPickaxe = (new MaterialTool(null, TriniaSilver).setUnlocalizedName("silverPickaxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SilverAxe = (new MaterialTool(null, TriniaSilver).setUnlocalizedName("silverAxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SilverSpade = (new MaterialTool(null, TriniaSilver).setUnlocalizedName("silverSpade")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SilverSword = (new MaterialTool(null, TriniaSilver).setUnlocalizedName("silverSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		//Tin
		TinPickaxe = (new MaterialTool(null, TriniaTin).setUnlocalizedName("tinPickaxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		TinAxe = (new MaterialTool(null, TriniaTin).setUnlocalizedName("tinAxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		TinSpade = (new MaterialTool(null, TriniaTin).setUnlocalizedName("tinSpade")).setCreativeTab(TriniaMod.TriniaToolsTab);
		TinSword = (new MaterialTool(null, TriniaTin).setUnlocalizedName("tinSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		//Adimite
		AdimitePickaxe = (new MaterialTool(null, TriniaAdimite).setUnlocalizedName("adimitePickaxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		AdimiteAxe = (new MaterialTool(null, TriniaAdimite).setUnlocalizedName("adimiteAxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		AdimiteSpade = (new MaterialTool(null, TriniaAdimite).setUnlocalizedName("adimiteSpade")).setCreativeTab(TriniaMod.TriniaToolsTab);
		AdimiteSword = (new MaterialTool(null, TriniaAdimite).setUnlocalizedName("adimiteSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		
		//Orca
		OrcaPickaxe = (new MaterialTool(null, TriniaOrca).setUnlocalizedName("orcaPickaxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		OrcaAxe = (new MaterialTool(null, TriniaOrca).setUnlocalizedName("orcaAxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		OrcaSpade = (new MaterialTool(null, TriniaOrca).setUnlocalizedName("orcaSpade")).setCreativeTab(TriniaMod.TriniaToolsTab);
		OrcaSword = (new MaterialTool(null, TriniaOrca).setUnlocalizedName("orcaSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		//Orisone
		OrisonePickaxe = (new MaterialTool(null, TriniaOrisone).setUnlocalizedName("orisonePickaxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		OrisoneAxe = (new MaterialTool(null, TriniaOrisone).setUnlocalizedName("orisoneAxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		OrisoneSpade = (new MaterialTool(null, TriniaOrisone).setUnlocalizedName("orisoneSpade")).setCreativeTab(TriniaMod.TriniaToolsTab);
		OrisoneSword = (new MaterialTool(null, TriniaOrisone).setUnlocalizedName("orisoneSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		OrisoneFatSword = (new MaterialTool(null, TriniaOrisone).setUnlocalizedName("orisoneFatSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		//Bridrone
		BridronePickaxe = (new MaterialTool(null, TriniaBridrone).setUnlocalizedName("bridronePickaxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		BridroneAxe = (new MaterialTool(null, TriniaBridrone).setUnlocalizedName("bridroneAxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		BridroneSpade = (new MaterialTool(null, TriniaBridrone).setUnlocalizedName("bridroneSpade")).setCreativeTab(TriniaMod.TriniaToolsTab);
		BridroneSword = (new MaterialTool(null, TriniaBridrone).setUnlocalizedName("bridroneSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		//Other
		Slingshot = (new ItemSlingshot(null, TriniaSlingshot).setUnlocalizedName("Slingshot")).setCreativeTab(TriniaMod.TriniaToolsTab);
		Crossbow = (new ItemSlingshot(null, TriniaCrossbow).setUnlocalizedName("Crossbow")).setCreativeTab(TriniaMod.TriniaToolsTab);
		Katana = (new MaterialTool(null, TriniaKatana).setUnlocalizedName("Katana")).setCreativeTab(TriniaMod.TriniaToolsTab);
		Sai = (new MaterialTool(null, TriniaSai).setUnlocalizedName("Sai")).setCreativeTab(TriniaMod.TriniaToolsTab);
		Scythe = (new MaterialTool(null, TriniaScythe).setUnlocalizedName("Scythe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		Mace = (new MaterialTool(null, TriniaMace).setUnlocalizedName("Mace")).setCreativeTab(TriniaMod.TriniaToolsTab);
		
		MaceBase = (new ItemTrinia().setUnlocalizedName("MaceBase")).setCreativeTab(TriniaMod.TriniaToolsTab);
		CrossbowBolt = (new ItemTrinia().setUnlocalizedName("CrossbowBolt")).setCreativeTab(TriniaMod.TriniaToolsTab);
		Chisel = (new ItemTrinia().setUnlocalizedName("Chisel")).setCreativeTab(TriniaMod.TriniaItemsTab);
		goldenKey = (new ItemTrinia().setUnlocalizedName("goldenKey")).setCreativeTab(TriniaMod.TriniaItemsTab);
		Rock = (new ItemTrinia().setUnlocalizedName("Rock")).setCreativeTab(TriniaMod.TriniaItemsTab);
		TinPickaxe = (new MaterialTool(null, TriniaTin).setUnlocalizedName("tinPickaxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		TinAxe = (new MaterialTool(null, TriniaTin).setUnlocalizedName("tinAxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		TinSpade = (new MaterialTool(null, TriniaTin).setUnlocalizedName("tinSpade")).setCreativeTab(TriniaMod.TriniaToolsTab);
		TinSword = (new MaterialTool(null, TriniaTin).setUnlocalizedName("tinSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		
		AdimiteSword = (new MaterialTool(null, TriniaAdimite).setUnlocalizedName("adimiteSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		OrcaSword = (new MaterialTool(null, TriniaOrca).setUnlocalizedName("orcaSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		OrisoneSword = (new MaterialTool(null, TriniaOrisone).setUnlocalizedName("orisoneSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		OrisoneFatSword = (new MaterialTool(null, TriniaOrisone).setUnlocalizedName("orisoneFatSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		Slingshot = (new ItemSlingshot(null, TriniaSlingshot).setUnlocalizedName("Slingshot")).setCreativeTab(TriniaMod.TriniaToolsTab);
		
		
		Chisel = (new ItemTrinia().setUnlocalizedName("Chisel")).setCreativeTab(TriniaMod.TriniaItemsTab);
		goldenKey = (new ItemTrinia().setUnlocalizedName("goldenKey")).setCreativeTab(TriniaMod.TriniaItemsTab);
		
		//Casts
		CastBlank = (new ItemTrinia().setUnlocalizedName("castBlank")).setCreativeTab(TriniaMod.TriniaToolsTab);
		CastPickaxe = (new ItemTrinia().setUnlocalizedName("castPickaxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		CastAxe = (new ItemTrinia().setUnlocalizedName("castAxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		CastSword = (new ItemTrinia().setUnlocalizedName("castSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		CastSwordHandle = (new ItemTrinia().setUnlocalizedName("castSwordHandle")).setCreativeTab(TriniaMod.TriniaToolsTab);
		CastSpade = (new ItemTrinia().setUnlocalizedName("castSpade")).setCreativeTab(TriniaMod.TriniaToolsTab);
		//-Tool Parts-
		//Steel
		SteelPickaxeHead = (new ItemTrinia().setUnlocalizedName("steelPickaxeHead")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SteelAxeHead = (new ItemTrinia().setUnlocalizedName("steelAxeHead")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SteelSpadeHead = (new ItemTrinia().setUnlocalizedName("steelSpadeHead")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SteelSwordHead = (new ItemTrinia().setUnlocalizedName("steelSwordHead")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SteelSwordHandle = (new ItemTrinia().setUnlocalizedName("steelSwordHandle")).setCreativeTab(TriniaMod.TriniaToolsTab);
		//Silver
		SilverPickaxeHead = (new ItemTrinia().setUnlocalizedName("silverPickaxeHead")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SilverAxeHead = (new ItemTrinia().setUnlocalizedName("silverAxeHead")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SilverSpadeHead = (new ItemTrinia().setUnlocalizedName("silverSpadeHead")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SilverSwordHead = (new ItemTrinia().setUnlocalizedName("silverSwordHead")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SilverSwordHandle = (new ItemTrinia().setUnlocalizedName("silverSwordHandle")).setCreativeTab(TriniaMod.TriniaToolsTab);
		//Tin
		TinPickaxeHead = (new ItemTrinia().setUnlocalizedName("tinPickaxeHead")).setCreativeTab(TriniaMod.TriniaToolsTab);
		TinAxeHead = (new ItemTrinia().setUnlocalizedName("tinAxeHead")).setCreativeTab(TriniaMod.TriniaToolsTab);
		TinSpadeHead = (new ItemTrinia().setUnlocalizedName("tinSpadeHead")).setCreativeTab(TriniaMod.TriniaToolsTab);
		TinSwordHead = (new ItemTrinia().setUnlocalizedName("tinSwordHead")).setCreativeTab(TriniaMod.TriniaToolsTab);
		TinSwordHandle = (new ItemTrinia().setUnlocalizedName("tinSwordHandle")).setCreativeTab(TriniaMod.TriniaToolsTab);
		
		//-Armor-
		triniaSteelHelmet = (new MaterialArmor("triniaHelmet", TriniaSteelArmor, 1, 0).setUnlocalizedName("steelHelmet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaSteelChestplate = (new MaterialArmor("triniaChestplate", TriniaSteelArmor, 1, 1).setUnlocalizedName("steelChestplate")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaSteelLeggings = (new MaterialArmor("triniaLeggings", TriniaSteelArmor, 2, 2).setUnlocalizedName("steelLeggings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaSteelBoots = (new MaterialArmor("triniaBoots", TriniaSteelArmor, 1, 3).setUnlocalizedName("steelBoots")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		triniaSilverHelmet = (new MaterialArmor("triniaSilverHelmet", TriniaSilverArmor, 1, 0).setUnlocalizedName("silverHelmet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaSilverChestplate = (new MaterialArmor("triniaSilverChestplate", TriniaSilverArmor, 1, 1).setUnlocalizedName("silverChestplate")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaSilverLeggings = (new MaterialArmor("triniaSilverLeggings", TriniaSilverArmor, 2, 2).setUnlocalizedName("silverLeggings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaSilverBoots = (new MaterialArmor("triniaSilverBoots", TriniaSilverArmor, 1, 3).setUnlocalizedName("silverBoots")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		triniaBridroneHelmet = (new MaterialArmor("triniaBridroneHelmet", TriniaBridroneArmor, 1, 0).setUnlocalizedName("bridroneHelmet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaBridroneChestplate = (new MaterialArmor("triniaBridroneChestplate", TriniaBridroneArmor, 1, 1).setUnlocalizedName("bridroneChestplate")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaBridroneLeggings = (new MaterialArmor("triniaBridroneLeggings", TriniaBridroneArmor, 2, 2).setUnlocalizedName("bridroneLeggings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaBridroneBoots = (new MaterialArmor("triniaBridroneBoots", TriniaBridroneArmor, 1, 3).setUnlocalizedName("bridroneBoots")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		triniaAdimiteHelmet = (new MaterialArmor("triniaAdimiteHelmet", TriniaAdimiteArmor, 1, 0).setUnlocalizedName("adimiteHelmet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaAdimiteChestplate = (new MaterialArmor("triniaAdimiteChestplate", TriniaAdimiteArmor, 1, 1).setUnlocalizedName("adimiteChestplate")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaAdimiteLeggings = (new MaterialArmor("triniaAdimiteLeggings", TriniaAdimiteArmor, 2, 2).setUnlocalizedName("adimiteLeggings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaAdimiteBoots = (new MaterialArmor("triniaAdimiteBoots", TriniaAdimiteArmor, 1, 3).setUnlocalizedName("adimiteBoots")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		triniaCopperHelmet = (new MaterialArmor("triniaCopperHelmet", TriniaCopperArmor, 1, 0).setUnlocalizedName("copperHelmet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaCopperChestplate = (new MaterialArmor("triniaCopperChestplate", TriniaCopperArmor, 1, 1).setUnlocalizedName("copperChestplate")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaCopperLeggings = (new MaterialArmor("triniaCopperLeggings", TriniaCopperArmor, 2, 2).setUnlocalizedName("copperLeggings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaCopperBoots = (new MaterialArmor("triniaCopperBoots", TriniaCopperArmor, 1, 3).setUnlocalizedName("copperBoots")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		triniaInomiteHelmet = (new MaterialArmor("triniaInomiteHelmet", TriniaInomiteArmor, 1, 0).setUnlocalizedName("InomiteHelmet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaInomiteChestplate = (new MaterialArmor("triniaInomiteChestplate", TriniaInomiteArmor, 1, 1).setUnlocalizedName("InomiteChestplate")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaInomiteLeggings = (new MaterialArmor("triniaInomiteLeggings", TriniaInomiteArmor, 2, 2).setUnlocalizedName("InomiteLeggings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaInomiteBoots = (new MaterialArmor("triniaInomiteBoots", TriniaInomiteArmor, 1, 3).setUnlocalizedName("InomiteBoots")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		triniaOrcaHelmet = (new MaterialArmor("triniaOrcaHelmet", TriniaOrcaArmor, 1, 0).setUnlocalizedName("orcaHelmet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaOrcaChestplate = (new MaterialArmor("triniaOrcaChestplate", TriniaOrcaArmor, 1, 1).setUnlocalizedName("orcaChestplate")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaOrcaLeggings = (new MaterialArmor("triniaOrcaLeggings", TriniaOrcaArmor, 2, 2).setUnlocalizedName("orcaLeggings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaOrcaBoots = (new MaterialArmor("triniaOrcaBoots", TriniaOrcaArmor, 1, 3).setUnlocalizedName("orcaBoots")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		triniaOrisoneHelmet = (new MaterialArmor("triniaOrisoneHelmet", TriniaOrisoneArmor, 1, 0).setUnlocalizedName("orisoneHelmet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaOrisoneChestplate = (new MaterialArmor("triniaOrisoneChestplate", TriniaOrisoneArmor, 1, 1).setUnlocalizedName("orisoneChestplate")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaOrisoneLeggings = (new MaterialArmor("triniaOrisoneLeggings", TriniaOrisoneArmor, 2, 2).setUnlocalizedName("orisoneLeggings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaOrisoneBoots = (new MaterialArmor("triniaOrisoneBoots", TriniaOrisoneArmor, 1, 3).setUnlocalizedName("orisoneBoots")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		triniaAmulet = (new ItemAmulet("triniaAmulet", TriniaAmuletArmor, 1, 1).setUnlocalizedName("triniaAmulet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		angelWings = (new MaterialArmor("angelWings", TriniaAngelArmor, 1, 1).setUnlocalizedName("angelWings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		angelHalo = (new MaterialArmor("angelHalo", TriniaAmuletArmor, 1, 0).setUnlocalizedName("angelHalo")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaCape = (new MaterialArmor("triniaCape", TriniaCapeArmor, 1, 1).setUnlocalizedName("triniaCape")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaCapeBlue = (new MaterialArmor("triniaCapeBlue", TriniaCapeArmor, 1, 1).setUnlocalizedName("triniaCapeBlue")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaCapeGreen = (new MaterialArmor("triniaCapeGreen", TriniaCapeArmor, 1, 1).setUnlocalizedName("triniaCapeGreen")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaCapeOrange = (new MaterialArmor("triniaCapeOrange", TriniaCapeArmor, 1, 1).setUnlocalizedName("triniaCapeOrange")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaCapePurple = (new MaterialArmor("triniaCapePurple", TriniaCapeArmor, 1, 1).setUnlocalizedName("triniaCapePurple")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaCapeRed = (new MaterialArmor("triniaCapeRed", TriniaCapeArmor, 1, 1).setUnlocalizedName("triniaCapeRed")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaCapeYellow = (new MaterialArmor("triniaCapeYellow", TriniaCapeArmor, 1, 1).setUnlocalizedName("triniaCapeYellow")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaCapeWhite = (new MaterialArmor("triniaCapeWhite", TriniaCapeArmor, 1, 1).setUnlocalizedName("triniaCapeWhite")).setCreativeTab(TriniaMod.TriniaArmorTab);

		//Icons Animated
		toolsAnimated = (new ItemTrinia().setUnlocalizedName("toolsAnimated"));
		armorAnimated = (new ItemTrinia().setUnlocalizedName("armorAnimated"));
		itemsAnimated = (new ItemTrinia().setUnlocalizedName("itemsAnimated"));
		coin = (new ItemTrinia().setUnlocalizedName("coin")).setCreativeTab(TriniaMod.TriniaItemsTab);
		earthAmulat = (new ItemTrinia().setUnlocalizedName("earthAmulat")).setCreativeTab(TriniaMod.TriniaItemsTab);
		waterAmulat = (new ItemTrinia().setUnlocalizedName("waterAmulat")).setCreativeTab(TriniaMod.TriniaItemsTab);
		fireAmulat = (new ItemTrinia().setUnlocalizedName("fireAmulat")).setCreativeTab(TriniaMod.TriniaItemsTab);
		scroll = (new ItemScroll().setUnlocalizedName("scroll")).setCreativeTab(TriniaMod.TriniaItemsTab);
		
	}
	
	public static void register()
	{
		//Custom Model Armor
		GameRegistry.registerItem(triniaAmulet = new ItemAmulet("triniaAmulet", TriniaAmuletArmor, 1, 1), "triniaAmulet");
		GameRegistry.registerItem(angelWings = new MaterialArmor("angelWings", TriniaAngelArmor, 1, 1), "angelWings");
		GameRegistry.registerItem(angelHalo = new MaterialArmor("angelHalo", TriniaAngelArmor, 1, 0), "angelHalo");
		GameRegistry.registerItem(triniaCape = new MaterialArmor("triniaCape", TriniaCapeArmor, 1, 1), "triniaCape");
		GameRegistry.registerItem(triniaCapeBlue = new MaterialArmor("triniaCapeBlue", TriniaCapeArmor, 1, 1), "triniaCapeBlue");
		GameRegistry.registerItem(triniaCapeGreen = new MaterialArmor("triniaCapeGreen", TriniaCapeArmor, 1, 1), "triniaCapeGreen");
		GameRegistry.registerItem(triniaCapeOrange = new MaterialArmor("triniaCapeOrange", TriniaCapeArmor, 1, 1), "triniaCapeOrange");
		GameRegistry.registerItem(triniaCapePurple = new MaterialArmor("triniaCapePurple", TriniaCapeArmor, 1, 1), "triniaCapePurple");
		GameRegistry.registerItem(triniaCapeRed = new MaterialArmor("triniaCapeRed", TriniaCapeArmor, 1, 1), "triniaCapeRed");
		GameRegistry.registerItem(triniaCapeYellow = new MaterialArmor("triniaCapeYellow", TriniaCapeArmor, 1, 1), "triniaCapeYellow");
		GameRegistry.registerItem(triniaCapeWhite = new MaterialArmor("triniaCapeWhite", TriniaCapeArmor, 1, 1), "triniaCapeWhite");

		//-Weapons-
		//Steel
		GameRegistry.registerItem(steelBattleAxe, steelBattleAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelBastardSword, steelBastardSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Dagger, Dagger.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Katar, Katar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Halberd, Halberd.getUnlocalizedName().substring(5));
		//Armor
		GameRegistry.registerItem(triniaSteelHelmet = new MaterialArmor("steelHelmet", TriniaSteelArmor, 1, 0), "steelHelmet");
		GameRegistry.registerItem(triniaSteelChestplate = new MaterialArmor("steelChestplate", TriniaSteelArmor, 1, 1), "steelChestplate");
		GameRegistry.registerItem(triniaSteelLeggings = new MaterialArmor("steelLeggings", TriniaSteelArmor, 2, 2), "steelLeggings");
		GameRegistry.registerItem(triniaSteelBoots = new MaterialArmor("steelBoots", TriniaSteelArmor, 1, 3), "steelBoots");       
		
		GameRegistry.registerItem(triniaSilverHelmet = new MaterialArmor("silverHelmet", TriniaSilverArmor, 1, 0), "silverHelmet");
		GameRegistry.registerItem(triniaSilverChestplate = new MaterialArmor("silverChestplate", TriniaSilverArmor, 1, 1), "silverChestplate");
		GameRegistry.registerItem(triniaSilverLeggings = new MaterialArmor("silverLeggings", TriniaSilverArmor, 2, 2), "silverLeggings");
		GameRegistry.registerItem(triniaSilverBoots = new MaterialArmor("silverBoots", TriniaSilverArmor, 1, 3), "silverBoots");       
		
		GameRegistry.registerItem(triniaBridroneHelmet = new MaterialArmor("bridroneHelmet", TriniaBridroneArmor, 1, 0), "bridroneHelmet");
		GameRegistry.registerItem(triniaBridroneChestplate = new MaterialArmor("bridroneChestplate", TriniaBridroneArmor, 1, 1), "bridroneChestplate");
		GameRegistry.registerItem(triniaBridroneLeggings = new MaterialArmor("bridroneLeggings", TriniaBridroneArmor, 2, 2), "bridroneLeggings");
		GameRegistry.registerItem(triniaBridroneBoots = new MaterialArmor("bridroneBoots", TriniaBridroneArmor, 1, 3), "bridroneBoots"); 
		
		GameRegistry.registerItem(triniaAdimiteHelmet = new MaterialArmor("adimiteHelmet", TriniaAdimiteArmor, 1, 0), "adimiteHelmet");
		GameRegistry.registerItem(triniaAdimiteChestplate = new MaterialArmor("adimiteChestplate", TriniaAdimiteArmor, 1, 1), "adimiteChestplate");
		GameRegistry.registerItem(triniaAdimiteLeggings = new MaterialArmor("adimiteLeggings", TriniaAdimiteArmor, 2, 2), "adimiteLeggings");
		GameRegistry.registerItem(triniaAdimiteBoots = new MaterialArmor("adimiteBoots", TriniaAdimiteArmor, 1, 3), "adimiteBoots"); 
		
		GameRegistry.registerItem(triniaCopperHelmet = new MaterialArmor("copperHelmet", TriniaCopperArmor, 1, 0), "copperHelmet");
		GameRegistry.registerItem(triniaCopperChestplate = new MaterialArmor("copperChestplate", TriniaCopperArmor, 1, 1), "copperChestplate");
		GameRegistry.registerItem(triniaCopperLeggings = new MaterialArmor("copperLeggings", TriniaCopperArmor, 2, 2), "copperLeggings");
		GameRegistry.registerItem(triniaCopperBoots = new MaterialArmor("copperBoots", TriniaCopperArmor, 1, 3), "copperBoots"); 
		
		GameRegistry.registerItem(triniaInomiteHelmet = new MaterialArmor("inomiteHelmet", TriniaInomiteArmor, 1, 0), "inomiteHelmet");
		GameRegistry.registerItem(triniaInomiteChestplate = new MaterialArmor("inomiteChestplate", TriniaInomiteArmor, 1, 1), "inomiteChestplate");
		GameRegistry.registerItem(triniaInomiteLeggings = new MaterialArmor("inomiteLeggings", TriniaInomiteArmor, 2, 2), "inomiteLeggings");
		GameRegistry.registerItem(triniaInomiteBoots = new MaterialArmor("inomiteBoots", TriniaInomiteArmor, 1, 3), "inomiteBoots"); 
		
		GameRegistry.registerItem(triniaOrcaHelmet = new MaterialArmor("orcaHelmet", TriniaOrcaArmor, 1, 0), "orcaHelmet");
		GameRegistry.registerItem(triniaOrcaChestplate = new MaterialArmor("orcaChestplate", TriniaOrcaArmor, 1, 1), "orcaChestplate");
		GameRegistry.registerItem(triniaOrcaLeggings = new MaterialArmor("orcaLeggings", TriniaOrcaArmor, 2, 2), "orcaLeggings");
		GameRegistry.registerItem(triniaOrcaBoots = new MaterialArmor("orcaBoots", TriniaOrcaArmor, 1, 3), "orcaBoots"); 
		
		GameRegistry.registerItem(triniaOrisoneHelmet = new MaterialArmor("orisoneHelmet", TriniaOrisoneArmor, 1, 0), "orisoneHelmet");
		GameRegistry.registerItem(triniaOrisoneChestplate = new MaterialArmor("orisoneChestplate", TriniaOrisoneArmor, 1, 1), "orisoneChestplate");
		GameRegistry.registerItem(triniaOrisoneLeggings = new MaterialArmor("orisoneLeggings", TriniaOrisoneArmor, 2, 2), "orisoneLeggings");
		GameRegistry.registerItem(triniaOrisoneBoots = new MaterialArmor("orisoneBoots", TriniaOrisoneArmor, 1, 3), "orisoneBoots"); 
		
		//Ingots
		GameRegistry.registerItem(SteelIngot, SteelIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperIngot, copperIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(silverIngot, silverIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tinIngot, tinIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(adimite, adimite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bridroneIngot, bridroneIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(orca, orca.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(orisone, orisone.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(inomite, inomite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(compressed_inomite, compressed_inomite.getUnlocalizedName().substring(5));
		
		//-Tools-
		//Steel
		GameRegistry.registerItem(SteelPickaxe, SteelPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SteelAxe, SteelAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SteelSpade, SteelSpade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SteelSword, SteelSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SteelHammer, SteelHammer.getUnlocalizedName().substring(5));
		//Silver
		GameRegistry.registerItem(SilverPickaxe, SilverPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SilverAxe, SilverAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SilverSpade, SilverSpade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SilverSword, SilverSword.getUnlocalizedName().substring(5));
		//Tin
		GameRegistry.registerItem(TinPickaxe, TinPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TinAxe, TinAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TinSpade, TinSpade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TinSword, TinSword.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(Chisel, Chisel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(goldenKey, goldenKey.getUnlocalizedName().substring(5));
		
		//Casts
		GameRegistry.registerItem(CastBlank, CastBlank.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CastPickaxe, CastPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CastAxe, CastAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CastSword, CastSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CastSwordHandle, CastSwordHandle.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CastSpade, CastSpade.getUnlocalizedName().substring(5));
		
		//-Tool Parts-
		//Steel
		GameRegistry.registerItem(SteelPickaxeHead, SteelPickaxeHead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SteelAxeHead, SteelAxeHead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SteelSpadeHead, SteelSpadeHead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SteelSwordHead, SteelSwordHead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SteelSwordHandle, SteelSwordHandle.getUnlocalizedName().substring(5));
		//Silver
		GameRegistry.registerItem(SilverPickaxeHead, SilverPickaxeHead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SilverAxeHead, SilverAxeHead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SilverSpadeHead, SilverSpadeHead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SilverSwordHead, SilverSwordHead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SilverSwordHandle, SilverSwordHandle.getUnlocalizedName().substring(5));
		//Tin
		GameRegistry.registerItem(TinPickaxeHead, TinPickaxeHead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TinAxeHead, TinAxeHead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TinSpadeHead, TinSpadeHead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TinSwordHead, TinSwordHead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TinSwordHandle, TinSwordHandle.getUnlocalizedName().substring(5));
		
		
		//Icons Animated
		GameRegistry.registerItem(toolsAnimated, toolsAnimated.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorAnimated, armorAnimated.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemsAnimated, itemsAnimated.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(MagicalBedItem, MagicalBedItem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coin, coin.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(AdimitePickaxe, AdimitePickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(AdimiteAxe, AdimiteAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(AdimiteSpade, AdimiteSpade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(AdimiteSword, AdimiteSword.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(BridronePickaxe, BridronePickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BridroneAxe, BridroneAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BridroneSpade, BridroneSpade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BridroneSword, BridroneSword.getUnlocalizedName().substring(5));
	
		GameRegistry.registerItem(OrcaPickaxe, OrcaPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(OrcaAxe, OrcaAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(OrcaSpade, OrcaSpade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(OrcaSword, OrcaSword.getUnlocalizedName().substring(5));
	
		GameRegistry.registerItem(OrisonePickaxe, OrisonePickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(OrisoneAxe, OrisoneAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(OrisoneSpade, OrisoneSpade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(OrisoneSword, OrisoneSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(OrisoneFatSword, OrisoneFatSword.getUnlocalizedName().substring(5));
	
		GameRegistry.registerItem(Mace, Mace.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Crossbow, Crossbow.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Katana, Katana.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Sai, Sai.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Scythe, Scythe.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(Rock, Rock.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MaceBase, MaceBase.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CrossbowBolt, CrossbowBolt.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(Slingshot, Slingshot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthAmulat, earthAmulat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(waterAmulat, waterAmulat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fireAmulat, fireAmulat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(scroll, scroll.getUnlocalizedName().substring(5));
		
	}
	
	public static void registerRenders()
	{
		//Tools Animated
		registerRender(toolsAnimated);
		registerRender(armorAnimated);
		registerRender(itemsAnimated);
		
		registerRender(inomite);
		registerRender(compressed_inomite);
		//-Weapons-
		//Steel
		registerRender(steelBattleAxe);
		registerRender(steelBastardSword);
		registerRender(Dagger);
		registerRender(Katar);
		registerRender(Halberd);
		//Random Items
		registerRender(SteelIngot);
		registerRender(copperIngot);
		registerRender(silverIngot);
		registerRender(tinIngot);
		registerRender(adimite);
		registerRender(bridroneIngot);
		registerRender(orca);
		registerRender(orisone);
		
			//-Tools-
		registerRender(AdimitePickaxe);
		registerRender(AdimiteAxe);
		registerRender(AdimiteSpade);
		registerRender(AdimiteSword);
		
		registerRender(BridronePickaxe);
		registerRender(BridroneAxe);
		registerRender(BridroneSpade);
		registerRender(BridroneSword);
		
		registerRender(OrcaPickaxe);
		registerRender(OrcaAxe);
		registerRender(OrcaSpade);
		registerRender(OrcaSword);

		registerRender(OrisonePickaxe);
		registerRender(OrisoneAxe);
		registerRender(OrisoneSpade);
		registerRender(OrisoneSword);
		registerRender(OrisoneFatSword);
		//Steel
		registerRender(SteelPickaxe);
		registerRender(SteelAxe);
		registerRender(SteelSpade);
		registerRender(SteelSword);
		registerRender(SteelHammer);
		//Silver
		registerRender(SilverPickaxe);
		registerRender(SilverAxe);
		registerRender(SilverSpade);
		registerRender(SilverSword);
		//Tin
		registerRender(TinPickaxe);
		registerRender(TinAxe);
		registerRender(TinSpade);
		registerRender(TinSword);
		
		registerRender(Mace);
		registerRender(Crossbow);
		registerRender(Katana);
		registerRender(Sai);
		registerRender(Scythe);
		
		registerRender(Chisel);
		registerRender(Rock);
		registerRender(scroll);
		registerRender(MaceBase);
		registerRender(CrossbowBolt);
		//Casts
		registerRender(CastPickaxe);
		registerRender(CastAxe);
		registerRender(CastSword);
		registerRender(CastSwordHandle);
		registerRender(CastSpade);
		registerRender(CastBlank);
		
		//-Armor-
		registerRender(triniaSteelHelmet);
		registerRender(triniaSteelChestplate);
		registerRender(triniaSteelLeggings);
		registerRender(triniaSteelBoots);
		
		registerRender(triniaSilverHelmet);
		registerRender(triniaSilverChestplate);
		registerRender(triniaSilverLeggings);
		registerRender(triniaSilverBoots);
		
		registerRender(triniaBridroneHelmet);
		registerRender(triniaBridroneChestplate);
		registerRender(triniaBridroneLeggings);
		registerRender(triniaBridroneBoots);
		
		registerRender(triniaAdimiteHelmet);
		registerRender(triniaAdimiteChestplate);
		registerRender(triniaAdimiteLeggings);
		registerRender(triniaAdimiteBoots);
		
		registerRender(triniaCopperHelmet);
		registerRender(triniaCopperChestplate);
		registerRender(triniaCopperLeggings);
		registerRender(triniaCopperBoots);
		
		registerRender(triniaInomiteHelmet);
		registerRender(triniaInomiteChestplate);
		registerRender(triniaInomiteLeggings);
		registerRender(triniaInomiteBoots);
		
		registerRender(triniaOrcaHelmet);
		registerRender(triniaOrcaChestplate);
		registerRender(triniaOrcaLeggings);
		registerRender(triniaOrcaBoots);
		
		registerRender(triniaOrisoneHelmet);
		registerRender(triniaOrisoneChestplate);
		registerRender(triniaOrisoneLeggings);
		registerRender(triniaOrisoneBoots);

		registerRender(triniaAmulet);
		registerRender(triniaCape);
		registerRender(triniaCapeBlue);
		registerRender(triniaCapeGreen);
		registerRender(triniaCapeOrange);
		registerRender(triniaCapePurple);
		registerRender(triniaCapeRed);
		registerRender(triniaCapeYellow);
		registerRender(triniaCapeWhite);
		
		//-Tool Parts-
		//Steel
		registerRender(SteelPickaxeHead);
		registerRender(SteelAxeHead);
		registerRender(SteelSpadeHead);
		registerRender(SteelSwordHead);
		registerRender(SteelSwordHandle);
		//Silver
		registerRender(SilverPickaxeHead);
		registerRender(SilverAxeHead);
		registerRender(SilverSpadeHead);
		registerRender(SilverSwordHead);
		registerRender(SilverSwordHandle);
		//Tin
		registerRender(TinPickaxeHead);
		registerRender(TinAxeHead);
		registerRender(TinSpadeHead);
		registerRender(TinSwordHead);
		registerRender(TinSwordHandle);
		
		registerRender(Slingshot);
		registerRender(MagicalBedItem);
		registerRender(angelWings);
		registerRender(angelHalo);
		registerRender(goldenKey);
		registerRender(coin);
		registerRender(earthAmulat);
		registerRender(waterAmulat);
		registerRender(fireAmulat);
	}
	
	public static void registerRender(Item item)
	{
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		}
}
