package com.trinia.items;


import java.util.List;

import com.trinia.Reference;
import com.trinia.TriniaMod;
import com.trinia.world.TriniaTeleporter;

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


public class ItemTriniaCape extends ItemArmor {
	public static float defensePoints;
    public ItemTriniaCape(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TriniaMod.TriniaArmorTab);
    }
    
    @Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == TriniaItems.triniaCape)
		{
		return Reference.MOD_ID + ":" + "textures/models/armor/TriniaCape.png";
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