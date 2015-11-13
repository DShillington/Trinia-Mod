package com.trinia.render;

import com.trinia.TriniaMod;
import com.trinia.items.ItemAmulet;
import com.trinia.mob.entity.EntityBlemmyae;
import com.trinia.mob.entity.EntityMermaid;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderAmulet extends RenderLiving
{
   private static final ResourceLocation amuletTextures = new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/models/armor/Amulet.png");
 
    private static final String __OBFID = "CL_00000984";

    public RenderAmulet(RenderManager i, ModelBase p_i46187_2_, float p_i46187_3_)
    {
        super(i, p_i46187_2_, p_i46187_3_);
    }

	protected ResourceLocation func_180572_a(ItemAmulet entity)
    {
        return amuletTextures;
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		return null;
	}


}