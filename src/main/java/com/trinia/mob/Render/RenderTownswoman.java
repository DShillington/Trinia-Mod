package com.trinia.mob.Render;

import com.trinia.TriniaMod;
import com.trinia.mob.entity.EntityBlemmyae;
import com.trinia.mob.entity.EntityTownswoman;

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
public class RenderTownswoman extends RenderLiving
{
   private static final ResourceLocation blemmyaeTextures = new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/entity/people/townswoman.png");
 
    private static final String __OBFID = "CL_00000984";

    public RenderTownswoman(RenderManager i, ModelBase p_i46187_2_, float p_i46187_3_)
    {
        super(i, p_i46187_2_, p_i46187_3_);
    }

	protected ResourceLocation func_180572_a(EntityTownswoman p_180572_1_)
    {
        return blemmyaeTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return this.func_180572_a((EntityTownswoman)entity);
    }
}