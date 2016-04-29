package com.trinia.items;


import java.util.List;

import com.trinia.TriniaMod;
import com.trinia.util.Reference;
import com.trinia.world.teleporter.TriniaTeleporter;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class MaterialArmor extends ItemArmor {
	public static float defensePoints;
    public MaterialArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TriniaMod.TriniaArmorTab);
    }
    
    @Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == TriniaItems.triniaCape)
		{
		return Reference.MOD_ID + ":" + "textures/models/armor/CapeTrinia.png";
		}
		if(stack.getItem() == TriniaItems.triniaCapeBlue)
		{
		return Reference.MOD_ID + ":" + "textures/models/armor/CapeBlue.png";
		}
		if(stack.getItem() == TriniaItems.triniaCapeGreen)
		{
		return Reference.MOD_ID + ":" + "textures/models/armor/CapeGreen.png";
		}
		if(stack.getItem() == TriniaItems.triniaCapeOrange)
		{
		return Reference.MOD_ID + ":" + "textures/models/armor/CapeOrange.png";
		}
		if(stack.getItem() == TriniaItems.triniaCapePurple)
		{
		return Reference.MOD_ID + ":" + "textures/models/armor/CapePurple.png";
		}
		if(stack.getItem() == TriniaItems.triniaCapeRed)
		{
		return Reference.MOD_ID + ":" + "textures/models/armor/CapeRed.png";
		}
		if(stack.getItem() == TriniaItems.triniaCapeYellow)
		{
		return Reference.MOD_ID + ":" + "textures/models/armor/CapeYellow.png";
		}
		if(stack.getItem() == TriniaItems.triniaCapeWhite)
		{
		return Reference.MOD_ID + ":" + "textures/models/armor/CapeWhite.png";
		}
		if(stack.getItem() == TriniaItems.triniaAmulet)
		{
		return Reference.MOD_ID + ":" + "textures/models/armor/Amulet.png";
		}
		if(stack.getItem() == TriniaItems.angelWings)
		{
		return Reference.MOD_ID + ":" + "textures/models/armor/AngelWings.png";
		}
		else if(stack.getItem() == TriniaItems.angelHalo)
		{
		return Reference.MOD_ID + ":" + "textures/models/armor/AngelHalo.png";
		}
		return null;
		}
    @SideOnly(Side.CLIENT)
	  public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot)
	  {
	    ModelBiped armorModel = null;
	    if (itemStack != null) {
	      if (itemStack.getItem() == TriniaItems.triniaCape) {
	        armorModel = TriniaMod.proxy.getArmorModelTriniaCape();
	      }
	      if (itemStack.getItem() == TriniaItems.triniaCapeBlue) {
		        armorModel = TriniaMod.proxy.getArmorModelTriniaCape();
		      }
	      if (itemStack.getItem() == TriniaItems.triniaCapeGreen) {
		        armorModel = TriniaMod.proxy.getArmorModelTriniaCape();
		      }
	      if (itemStack.getItem() == TriniaItems.triniaCapeOrange) {
		        armorModel = TriniaMod.proxy.getArmorModelTriniaCape();
		      }
	      if (itemStack.getItem() == TriniaItems.triniaCapePurple) {
		        armorModel = TriniaMod.proxy.getArmorModelTriniaCape();
		      }
	      if (itemStack.getItem() == TriniaItems.triniaCapeRed) {
		        armorModel = TriniaMod.proxy.getArmorModelTriniaCape();
		      }
	      if (itemStack.getItem() == TriniaItems.triniaCapeYellow) {
		        armorModel = TriniaMod.proxy.getArmorModelTriniaCape();
		      }
	      if (itemStack.getItem() == TriniaItems.triniaCapeWhite) {
		        armorModel = TriniaMod.proxy.getArmorModelTriniaCape();
		      }
	      if (itemStack.getItem() == TriniaItems.triniaAmulet) {
		        armorModel = TriniaMod.proxy.getArmorModel();
		      }
	      if (itemStack.getItem() == TriniaItems.angelWings) {
		        armorModel = TriniaMod.proxy.getArmorModelWings();
		      }
		  if (itemStack.getItem() == TriniaItems.angelHalo) {
			        armorModel = TriniaMod.proxy.getArmorModelHalo();
			      }
	    }
	    if(armorModel != null){
	    	armorModel.bipedHead.showModel = armorSlot == 0;
	    	armorModel.bipedHeadwear.showModel = armorSlot == 0;
	    	armorModel.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
	    	armorModel.bipedRightArm.showModel = armorSlot == 1;
	    	armorModel.bipedLeftArm.showModel = armorSlot == 1;
	    	armorModel.bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3;
	    	armorModel.bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3;
	    	armorModel.isSneak = entityLiving.isSneaking();
	    	armorModel.isRiding = entityLiving.isRiding();
	    	armorModel.isChild = entityLiving.isChild();
	    	armorModel.heldItemRight = entityLiving.getCurrentArmor(0) != null ? 1 :0;
	    	if(entityLiving instanceof EntityPlayer){
	    		armorModel.aimedBow =((EntityPlayer)entityLiving).getItemInUseDuration() > 2;
	    		} 
	    	return armorModel;
	    		}
	    return null;
	  }
    
}