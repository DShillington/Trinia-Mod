package com.trinia.items;


import java.util.List;

import com.trinia.Reference;
import com.trinia.TriniaMod;

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


public class ItemAmulet extends ItemArmor {
	public static float defensePoints;
    public ItemAmulet(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TriniaMod.TriniaMainTab);
    }
    
    @Override
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3){
    if (var3.ridingEntity == null && var3.riddenByEntity == null && var3 instanceof EntityPlayerMP){
		 
        EntityPlayerMP thePlayer = (EntityPlayerMP)var3;
        if (thePlayer.timeUntilPortal > 0)
        {
                thePlayer.timeUntilPortal = 10;
        }
        else if (thePlayer.dimension != 6)
        {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 6);
        }
        else {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0);
        }
        }
	return var1;
}
    
    @Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == TriniaItems.triniaAmulet)
		{
		return Reference.MOD_ID + ":" + "textures/models/armor/Amulet.png";
		}
		
		return null;
		}
    @SideOnly(Side.CLIENT)
	  public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot)
	  {
	    ModelBiped armorModel = null;
	    if (itemStack != null) {
	      if (itemStack.getItem() == TriniaItems.triniaAmulet) {
	        armorModel = TriniaMod.proxy.getArmorModel();
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
    @SuppressWarnings("unchecked")
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List info, boolean p_77624_4_) 
    {
    	info.add("Place this amulet in the ChestPlate Slot.");
    	info.add("Right Click to teleport to Trinia. (temporary)");
    	info.add("§4 *** Abilities ***");
    	info.add("");
    	info.add("§a * Cloaking Ability");
    	info.add("§a * Healing Factor");
    	info.add("");
    	info.add("§9 +10 Sword Damage");
    	info.add("§9 +5 Punch Damage");
    }

}