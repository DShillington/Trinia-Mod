package com.trinia.mob.Render;

import com.trinia.TriniaMod;
import com.trinia.mob.entity.EntityButterfly;
import com.trinia.mob.entity.EntityCentaur;
import com.trinia.mob.entity.EntityMermaid;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderButterFly extends RenderLiving
{
   private static final ResourceLocation TRINIA = new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/entity/butterfly/ButterFly_Trinia.png");
   private static final ResourceLocation ORANGE = new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/entity/butterfly/ButterFly_Orange.png");
   private static final ResourceLocation RED = new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/entity/butterfly/ButterFly_Red.png");
   private static final ResourceLocation BLUE = new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/entity/butterfly/ButterFly_Blue.png");
   private static final ResourceLocation GREEN = new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/entity/butterfly/ButterFly_Green.png");
   private static final ResourceLocation PURPLE = new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/entity/butterfly/ButterFly_Purple.png");
   private static final ResourceLocation YELLOW = new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/entity/butterfly/ButterFly_Yellow.png");
   private static final ResourceLocation RAINBOW = new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/entity/butterfly/ButterFly_Rainbow.png");
    
    private static final String __OBFID = "CL_00000984";


    public RenderButterFly(RenderManager p_i46146_1_, ModelBase p_i46146_2_, float p_i46146_3_)
    {
        super(p_i46146_1_, p_i46146_2_, p_i46146_3_);
    }


    protected ResourceLocation func_177125_a(EntityButterfly p_177125_1_)
    {
        String s = EnumChatFormatting.getTextWithoutFormattingCodes(p_177125_1_.getName());

        if (s != null && s.equals("Trinia"))
        {
            return TRINIA;
        }
        else
        {
            switch (p_177125_1_.getRabbitType())
            {
                case 0:
                default:
                    return ORANGE;
                case 1:
                    return RED;
                case 2:
                    return BLUE;
                case 3:
                    return GREEN;
                case 4:
                    return PURPLE;
                case 5:
                    return YELLOW;
            }
        }
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return this.func_177125_a((EntityButterfly)entity);
    }
}