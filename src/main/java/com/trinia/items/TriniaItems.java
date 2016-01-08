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
	public static ToolMaterial TriniaSlingshot = EnumHelper.addToolMaterial("Slingshot", 3, 5000, 15.0F, 4.0F, 20);
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
	public static Item Mace;
	public static Item Ring_Sword;
	public static Item Dagger;
	public static Item Nunchucks;
	public static Item Katar;
	public static Item Sai;
	public static Item Katana;
	public static Item Swallow;
	public static Item Scythe;
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
	
	public static Item AdimiteSword;
	public static Item OrcaSword;
	public static Item OrisoneSword;
	public static Item OrisoneFatSword;
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
	
	public static void init()
	{
		//-Weapons-
		//Steel
		steelBattleAxe = (new ItemSteelAxe(null, TriniaSteelBattleAxe).setUnlocalizedName("steelBattleAxe").setCreativeTab(TriniaMod.TriniaToolsTab));
		steelBastardSword = (new ItemSteelSword(null, TriniaSteelBastardSword).setUnlocalizedName("steelBastardSword").setCreativeTab(TriniaMod.TriniaToolsTab));
		Polearm = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("polearm").setCreativeTab(TriniaMod.TriniaToolsTab));
		Warhammer = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Warhammer").setCreativeTab(TriniaMod.TriniaToolsTab));
		Wand = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Wand").setCreativeTab(TriniaMod.TriniaToolsTab));
		Sickle = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Sickle").setCreativeTab(TriniaMod.TriniaToolsTab));
		Parasol = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Parasol").setCreativeTab(TriniaMod.TriniaToolsTab));
		//Bastard_Sword = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Bastard_Sword").setCreativeTab(TriniaMod.TriniaToolsTab));
		Quivver = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Quivver").setCreativeTab(TriniaMod.TriniaToolsTab));
		Staff = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Staff").setCreativeTab(TriniaMod.TriniaToolsTab));
		//Battle_Axe = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Battle_Axe").setCreativeTab(TriniaMod.TriniaToolsTab));
		Mace = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Mace").setCreativeTab(TriniaMod.TriniaToolsTab));
		Ring_Sword = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Ring_Sword").setCreativeTab(TriniaMod.TriniaToolsTab));
		Dagger = (new ItemSteelSword(null, TriniaDagger).setUnlocalizedName("Dagger").setCreativeTab(TriniaMod.TriniaToolsTab));
		Nunchucks = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Nunchucks").setCreativeTab(TriniaMod.TriniaToolsTab));
		Katar = (new ItemSteelSword(null, TriniaKatar).setUnlocalizedName("Katar").setCreativeTab(TriniaMod.TriniaToolsTab));
		Sai = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Sai").setCreativeTab(TriniaMod.TriniaToolsTab));
		Katana = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Katana").setCreativeTab(TriniaMod.TriniaToolsTab));
		Swallow = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Swallow").setCreativeTab(TriniaMod.TriniaToolsTab));
		Scythe = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Scythe").setCreativeTab(TriniaMod.TriniaToolsTab));
		Tonfa = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Tonfa").setCreativeTab(TriniaMod.TriniaToolsTab));
		Maul = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("Maul").setCreativeTab(TriniaMod.TriniaToolsTab));
		Halberd = (new ItemSteelSword(null, TriniaHalberd).setUnlocalizedName("Halberd").setCreativeTab(TriniaMod.TriniaToolsTab));
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
		SteelPickaxe = (new ItemSteelPickaxe(null, TriniaSteel).setUnlocalizedName("SteelPickaxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SteelAxe = (new ItemSteelAxe(null, TriniaSteel).setUnlocalizedName("steelAxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SteelSpade = (new ItemSteelSpade(null, TriniaSteel).setUnlocalizedName("steelSpade")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SteelSword = (new ItemSteelSword(null, TriniaSteel).setUnlocalizedName("steelSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SteelHammer = (new ItemSteelHammer(null, TriniaHammer).setUnlocalizedName("steelHammer")).setCreativeTab(TriniaMod.TriniaToolsTab);
		//Silver
		SilverPickaxe = (new ItemSteelPickaxe(null, TriniaSilver).setUnlocalizedName("silverPickaxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SilverAxe = (new ItemSteelAxe(null, TriniaSilver).setUnlocalizedName("silverAxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SilverSpade = (new ItemSteelSpade(null, TriniaSilver).setUnlocalizedName("silverSpade")).setCreativeTab(TriniaMod.TriniaToolsTab);
		SilverSword = (new ItemSteelSword(null, TriniaSilver).setUnlocalizedName("silverSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		//Tin
		TinPickaxe = (new ItemSteelPickaxe(null, TriniaTin).setUnlocalizedName("tinPickaxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		TinAxe = (new ItemSteelAxe(null, TriniaTin).setUnlocalizedName("tinAxe")).setCreativeTab(TriniaMod.TriniaToolsTab);
		TinSpade = (new ItemSteelSpade(null, TriniaTin).setUnlocalizedName("tinSpade")).setCreativeTab(TriniaMod.TriniaToolsTab);
		TinSword = (new ItemSteelSword(null, TriniaTin).setUnlocalizedName("tinSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		
		AdimiteSword = (new ItemAdimiteSword(null, TriniaAdimite).setUnlocalizedName("adimiteSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		OrcaSword = (new ItemOrcaSword(null, TriniaOrca).setUnlocalizedName("orcaSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		OrisoneSword = (new ItemOrisoneSword(null, TriniaOrisone).setUnlocalizedName("orisoneSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		OrisoneFatSword = (new ItemOrisoneFatSword(null, TriniaOrisone).setUnlocalizedName("orisoneFatSword")).setCreativeTab(TriniaMod.TriniaToolsTab);
		Slingshot = (new ItemSlingshot(null, TriniaSlingshot).setUnlocalizedName("slingshot")).setCreativeTab(TriniaMod.TriniaToolsTab);
		
		
		Chisel = (new ItemChisel().setUnlocalizedName("Chisel")).setCreativeTab(TriniaMod.TriniaItemsTab);
		goldenKey = (new ItemGoldenKey().setUnlocalizedName("goldenKey")).setCreativeTab(TriniaMod.TriniaItemsTab);
		
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
		triniaSteelHelmet = (new ItemSteelArmor("triniaHelmet", TriniaSteelArmor, 1, 0).setUnlocalizedName("steelHelmet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaSteelChestplate = (new ItemSteelArmor("triniaChestplate", TriniaSteelArmor, 1, 1).setUnlocalizedName("steelChestplate")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaSteelLeggings = (new ItemSteelArmor("triniaLeggings", TriniaSteelArmor, 2, 2).setUnlocalizedName("steelLeggings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaSteelBoots = (new ItemSteelArmor("triniaBoots", TriniaSteelArmor, 1, 3).setUnlocalizedName("steelBoots")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		triniaSilverHelmet = (new ItemSilverArmor("triniaSilverHelmet", TriniaSilverArmor, 1, 0).setUnlocalizedName("silverHelmet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaSilverChestplate = (new ItemSilverArmor("triniaSilverChestplate", TriniaSilverArmor, 1, 1).setUnlocalizedName("silverChestplate")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaSilverLeggings = (new ItemSilverArmor("triniaSilverLeggings", TriniaSilverArmor, 2, 2).setUnlocalizedName("silverLeggings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaSilverBoots = (new ItemSilverArmor("triniaSilverBoots", TriniaSilverArmor, 1, 3).setUnlocalizedName("silverBoots")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		triniaBridroneHelmet = (new ItemBridroneArmor("triniaBridroneHelmet", TriniaBridroneArmor, 1, 0).setUnlocalizedName("bridroneHelmet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaBridroneChestplate = (new ItemBridroneArmor("triniaBridroneChestplate", TriniaBridroneArmor, 1, 1).setUnlocalizedName("bridroneChestplate")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaBridroneLeggings = (new ItemBridroneArmor("triniaBridroneLeggings", TriniaBridroneArmor, 2, 2).setUnlocalizedName("bridroneLeggings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaBridroneBoots = (new ItemBridroneArmor("triniaBridroneBoots", TriniaBridroneArmor, 1, 3).setUnlocalizedName("bridroneBoots")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		triniaAdimiteHelmet = (new ItemAdimiteArmor("triniaAdimiteHelmet", TriniaAdimiteArmor, 1, 0).setUnlocalizedName("adimiteHelmet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaAdimiteChestplate = (new ItemAdimiteArmor("triniaAdimiteChestplate", TriniaAdimiteArmor, 1, 1).setUnlocalizedName("adimiteChestplate")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaAdimiteLeggings = (new ItemAdimiteArmor("triniaAdimiteLeggings", TriniaAdimiteArmor, 2, 2).setUnlocalizedName("adimiteLeggings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaAdimiteBoots = (new ItemAdimiteArmor("triniaAdimiteBoots", TriniaAdimiteArmor, 1, 3).setUnlocalizedName("adimiteBoots")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		triniaCopperHelmet = (new ItemCopperArmor("triniaCopperHelmet", TriniaCopperArmor, 1, 0).setUnlocalizedName("copperHelmet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaCopperChestplate = (new ItemCopperArmor("triniaCopperChestplate", TriniaCopperArmor, 1, 1).setUnlocalizedName("copperChestplate")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaCopperLeggings = (new ItemCopperArmor("triniaCopperLeggings", TriniaCopperArmor, 2, 2).setUnlocalizedName("copperLeggings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaCopperBoots = (new ItemCopperArmor("triniaCopperBoots", TriniaCopperArmor, 1, 3).setUnlocalizedName("copperBoots")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		triniaInomiteHelmet = (new ItemInomiteArmor("triniaInomiteHelmet", TriniaInomiteArmor, 1, 0).setUnlocalizedName("InomiteHelmet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaInomiteChestplate = (new ItemInomiteArmor("triniaInomiteChestplate", TriniaInomiteArmor, 1, 1).setUnlocalizedName("InomiteChestplate")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaInomiteLeggings = (new ItemInomiteArmor("triniaInomiteLeggings", TriniaInomiteArmor, 2, 2).setUnlocalizedName("InomiteLeggings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaInomiteBoots = (new ItemInomiteArmor("triniaInomiteBoots", TriniaInomiteArmor, 1, 3).setUnlocalizedName("InomiteBoots")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		triniaOrcaHelmet = (new ItemOrcaArmor("triniaOrcaHelmet", TriniaOrcaArmor, 1, 0).setUnlocalizedName("orcaHelmet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaOrcaChestplate = (new ItemOrcaArmor("triniaOrcaChestplate", TriniaOrcaArmor, 1, 1).setUnlocalizedName("orcaChestplate")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaOrcaLeggings = (new ItemOrcaArmor("triniaOrcaLeggings", TriniaOrcaArmor, 2, 2).setUnlocalizedName("orcaLeggings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaOrcaBoots = (new ItemOrcaArmor("triniaOrcaBoots", TriniaOrcaArmor, 1, 3).setUnlocalizedName("orcaBoots")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		triniaOrisoneHelmet = (new ItemOrisoneArmor("triniaOrisoneHelmet", TriniaOrisoneArmor, 1, 0).setUnlocalizedName("orisoneHelmet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaOrisoneChestplate = (new ItemOrisoneArmor("triniaOrisoneChestplate", TriniaOrisoneArmor, 1, 1).setUnlocalizedName("orisoneChestplate")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaOrisoneLeggings = (new ItemOrisoneArmor("triniaOrisoneLeggings", TriniaOrisoneArmor, 2, 2).setUnlocalizedName("orisoneLeggings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaOrisoneBoots = (new ItemOrisoneArmor("triniaOrisoneBoots", TriniaOrisoneArmor, 1, 3).setUnlocalizedName("orisoneBoots")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		triniaAmulet = (new ItemAmulet("triniaAmulet", TriniaAmuletArmor, 1, 1).setUnlocalizedName("triniaAmulet")).setCreativeTab(TriniaMod.TriniaArmorTab);
		angelWings = (new ItemAmulet("angelWings", TriniaAngelArmor, 1, 1).setUnlocalizedName("angelWings")).setCreativeTab(TriniaMod.TriniaArmorTab);
		angelHalo = (new ItemAmulet("angelHalo", TriniaAmuletArmor, 1, 0).setUnlocalizedName("angelHalo")).setCreativeTab(TriniaMod.TriniaArmorTab);
		triniaCape = (new ItemTriniaCape("triniaCape", TriniaCapeArmor, 1, 1).setUnlocalizedName("triniaCape")).setCreativeTab(TriniaMod.TriniaArmorTab);
		
		//Icons Animated
		toolsAnimated = (new ItemTrinia().setUnlocalizedName("toolsAnimated"));
		armorAnimated = (new ItemTrinia().setUnlocalizedName("armorAnimated"));
		itemsAnimated = (new ItemTrinia().setUnlocalizedName("itemsAnimated"));
		
	}
	
	public static void register()
	{
		GameRegistry.registerItem(triniaAmulet = new ItemAmulet("triniaAmulet", TriniaAmuletArmor, 1, 1), "triniaAmulet");
		GameRegistry.registerItem(angelWings = new ItemAngelArmor("angelWings", TriniaAngelArmor, 1, 1), "angelWings");
		GameRegistry.registerItem(angelHalo = new ItemAngelArmor("angelHalo", TriniaAngelArmor, 1, 0), "angelHalo");
		GameRegistry.registerItem(triniaCape = new ItemTriniaCape("triniaCape", TriniaCapeArmor, 1, 1), "triniaCape");
		
		//-Weapons-
		//Steel
		GameRegistry.registerItem(steelBattleAxe, steelBattleAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelBastardSword, steelBastardSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Dagger, Dagger.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Katar, Katar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Halberd, Halberd.getUnlocalizedName().substring(5));
		//Armor
		GameRegistry.registerItem(triniaSteelHelmet = new ItemSteelArmor("steelHelmet", TriniaSteelArmor, 1, 0), "steelHelmet");
		GameRegistry.registerItem(triniaSteelChestplate = new ItemSteelArmor("steelChestplate", TriniaSteelArmor, 1, 1), "steelChestplate");
		GameRegistry.registerItem(triniaSteelLeggings = new ItemSteelArmor("steelLeggings", TriniaSteelArmor, 2, 2), "steelLeggings");
		GameRegistry.registerItem(triniaSteelBoots = new ItemSteelArmor("steelBoots", TriniaSteelArmor, 1, 3), "steelBoots");       
		
		GameRegistry.registerItem(triniaSilverHelmet = new ItemSilverArmor("silverHelmet", TriniaSilverArmor, 1, 0), "silverHelmet");
		GameRegistry.registerItem(triniaSilverChestplate = new ItemSilverArmor("silverChestplate", TriniaSilverArmor, 1, 1), "silverChestplate");
		GameRegistry.registerItem(triniaSilverLeggings = new ItemSilverArmor("silverLeggings", TriniaSilverArmor, 2, 2), "silverLeggings");
		GameRegistry.registerItem(triniaSilverBoots = new ItemSilverArmor("silverBoots", TriniaSilverArmor, 1, 3), "silverBoots");       
		
		GameRegistry.registerItem(triniaBridroneHelmet = new ItemBridroneArmor("bridroneHelmet", TriniaBridroneArmor, 1, 0), "bridroneHelmet");
		GameRegistry.registerItem(triniaBridroneChestplate = new ItemBridroneArmor("bridroneChestplate", TriniaBridroneArmor, 1, 1), "bridroneChestplate");
		GameRegistry.registerItem(triniaBridroneLeggings = new ItemBridroneArmor("bridroneLeggings", TriniaBridroneArmor, 2, 2), "bridroneLeggings");
		GameRegistry.registerItem(triniaBridroneBoots = new ItemBridroneArmor("bridroneBoots", TriniaBridroneArmor, 1, 3), "bridroneBoots"); 
		
		GameRegistry.registerItem(triniaAdimiteHelmet = new ItemAdimiteArmor("adimiteHelmet", TriniaAdimiteArmor, 1, 0), "adimiteHelmet");
		GameRegistry.registerItem(triniaAdimiteChestplate = new ItemAdimiteArmor("adimiteChestplate", TriniaAdimiteArmor, 1, 1), "adimiteChestplate");
		GameRegistry.registerItem(triniaAdimiteLeggings = new ItemAdimiteArmor("adimiteLeggings", TriniaAdimiteArmor, 2, 2), "adimiteLeggings");
		GameRegistry.registerItem(triniaAdimiteBoots = new ItemAdimiteArmor("adimiteBoots", TriniaAdimiteArmor, 1, 3), "adimiteBoots"); 
		
		GameRegistry.registerItem(triniaCopperHelmet = new ItemCopperArmor("copperHelmet", TriniaCopperArmor, 1, 0), "copperHelmet");
		GameRegistry.registerItem(triniaCopperChestplate = new ItemCopperArmor("copperChestplate", TriniaCopperArmor, 1, 1), "copperChestplate");
		GameRegistry.registerItem(triniaCopperLeggings = new ItemCopperArmor("copperLeggings", TriniaCopperArmor, 2, 2), "copperLeggings");
		GameRegistry.registerItem(triniaCopperBoots = new ItemCopperArmor("copperBoots", TriniaCopperArmor, 1, 3), "copperBoots"); 
		
		GameRegistry.registerItem(triniaInomiteHelmet = new ItemInomiteArmor("inomiteHelmet", TriniaInomiteArmor, 1, 0), "inomiteHelmet");
		GameRegistry.registerItem(triniaInomiteChestplate = new ItemInomiteArmor("inomiteChestplate", TriniaInomiteArmor, 1, 1), "inomiteChestplate");
		GameRegistry.registerItem(triniaInomiteLeggings = new ItemInomiteArmor("inomiteLeggings", TriniaInomiteArmor, 2, 2), "inomiteLeggings");
		GameRegistry.registerItem(triniaInomiteBoots = new ItemInomiteArmor("inomiteBoots", TriniaInomiteArmor, 1, 3), "inomiteBoots"); 
		
		GameRegistry.registerItem(triniaOrcaHelmet = new ItemOrcaArmor("orcaHelmet", TriniaOrcaArmor, 1, 0), "orcaHelmet");
		GameRegistry.registerItem(triniaOrcaChestplate = new ItemOrcaArmor("orcaChestplate", TriniaOrcaArmor, 1, 1), "orcaChestplate");
		GameRegistry.registerItem(triniaOrcaLeggings = new ItemOrcaArmor("orcaLeggings", TriniaOrcaArmor, 2, 2), "orcaLeggings");
		GameRegistry.registerItem(triniaOrcaBoots = new ItemOrcaArmor("orcaBoots", TriniaOrcaArmor, 1, 3), "orcaBoots"); 
		
		GameRegistry.registerItem(triniaOrisoneHelmet = new ItemOrisoneArmor("orisoneHelmet", TriniaOrisoneArmor, 1, 0), "orisoneHelmet");
		GameRegistry.registerItem(triniaOrisoneChestplate = new ItemOrisoneArmor("orisoneChestplate", TriniaOrisoneArmor, 1, 1), "orisoneChestplate");
		GameRegistry.registerItem(triniaOrisoneLeggings = new ItemOrisoneArmor("orisoneLeggings", TriniaOrisoneArmor, 2, 2), "orisoneLeggings");
		GameRegistry.registerItem(triniaOrisoneBoots = new ItemOrisoneArmor("orisoneBoots", TriniaOrisoneArmor, 1, 3), "orisoneBoots"); 
		
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
		
		
		GameRegistry.registerItem(OrcaSword, OrcaSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(AdimiteSword, AdimiteSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(OrisoneSword, OrisoneSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(OrisoneFatSword, OrisoneFatSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Slingshot, Slingshot.getUnlocalizedName().substring(5));
		
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
		registerRender(OrisoneSword);
		registerRender(OrisoneFatSword);
		registerRender(OrcaSword);
		registerRender(AdimiteSword);
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
		
		registerRender(Chisel);
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
	}
	
	public static void registerRender(Item item)
	{
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		}
}
