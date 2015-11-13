package com.trinia.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelMermaid extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Tail4;
    ModelRenderer Tail5;
    ModelRenderer Tail6;
    ModelRenderer Tail7;
    ModelRenderer Tail8;
    ModelRenderer Tail9;
    ModelRenderer Tail10;
    ModelRenderer Tail11;
    ModelRenderer Tail12;
    ModelRenderer Tail13;
    ModelRenderer Tail14;
    ModelRenderer Tail16;
    private static final String __OBFID = "CL_00000837";

  public ModelMermaid()
  {
    textureWidth = 128;
    textureHeight = 64;
      this.head = new ModelRenderer(this, 93, 30);
      this.head.addBox(-4F, -8F, -4F, 8, 8, 8);
      this.head.setRotationPoint(0F, 0F, 0F);
      this.setRotation(head, 0F, 0F, 0F);
      
      this.body = new ModelRenderer(this, 57, 47);
      this.body.addBox(-4F, 0F, -2F, 8, 12, 4);
      this.body.setRotationPoint(0F, 0F, 0F);
      this.setRotation(body, 0F, 0F, 0F);
      
      this.rightarm = new ModelRenderer(this, 23, 47);
      this.rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      this.rightarm.setRotationPoint(-5F, 2F, 0F);
      this.setRotation(rightarm, 0F, 0F, 0.1745329F);
      
      this.leftarm = new ModelRenderer(this, 40, 47);
      this.leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      this.leftarm.setRotationPoint(5F, 2F, 0F);
      this.setRotation(leftarm, 0F, 0F, -0.1745329F);
      
      this.Tail1 = new ModelRenderer(this, 0, 0);
      this.Tail1.addBox(-4F, 0F, -2F, 8, 4, 4);
      this.Tail1.setRotationPoint(0F, 11F, 0F);
      this.setRotation(Tail1, 0.1745329F, 0F, 0F);
      
      this.Tail2 = new ModelRenderer(this, 0, 9);
      this.Tail2.addBox(-4F, 0F, -2F, 8, 4, 4);
      this.Tail2.setRotationPoint(0F, 14F, 0.5F);
      this.setRotation(Tail2, 0.3490659F, 0F, 0F);
      
      this.Tail3 = new ModelRenderer(this, 0, 18);
      this.Tail3.addBox(-3F, 0F, -2F, 6, 4, 4);
      this.Tail3.setRotationPoint(0F, 17F, 1.5F);
      this.setRotation(Tail3, 0.5235988F, 0F, 0F);
      
      this.Tail4 = new ModelRenderer(this, 0, 27);
      this.Tail4.addBox(-3F, 0F, -2F, 6, 6, 4);
      this.Tail4.setRotationPoint(0.0F, 20.0F, 3.0F);
      this.setRotation(Tail4, 0.958382F, 0F, 0F);
      
      this.Tail5 = new ModelRenderer(this, 0, 38);
      this.Tail5.addBox(-2F, -2F, 0F, 6, 2, 5);
      this.Tail5.setRotationPoint(-1F, 24F, 7F);
      this.setRotation(Tail5, 0F, 0F, 0F);
      
      this.Tail6 = new ModelRenderer(this, 47, 22);
      this.Tail6.addBox(0F, 0F, 0F, 6, 1, 2);
      this.Tail6.setRotationPoint(-3F, 23F, 12F);
      this.setRotation(Tail6, 0F, 0F, 0F);
      
      this.Tail7 = new ModelRenderer(this, 45, 26);
      this.Tail7.addBox(0F, 0F, 0F, 8, 1, 2);
      this.Tail7.setRotationPoint(-4F, 23F, 14F);
      this.setRotation(Tail7, 0F, 0F, 0F);
      
      this.Tail8 = new ModelRenderer(this, 47, 31);
      this.Tail8.addBox(0F, 0F, 0F, 6, 1, 2);
      this.Tail8.setRotationPoint(-3F, 23F, 16F);
      this.setRotation(Tail8, 0F, 0F, 0F);
      
      this.Tail9 = new ModelRenderer(this, 50, 15);
      this.Tail9.addBox(0F, 0F, 0F, 4, 1, 1);
      this.Tail9.setRotationPoint(-2F, 22F, 12F);
      this.setRotation(Tail9, 0F, 0F, 0F);
      
      this.Tail10 = new ModelRenderer(this, 51, 18);
      this.Tail10.addBox(0F, 0F, 0F, 2, 1, 2);
      this.Tail10.setRotationPoint(-1F, 22F, 13F);
      this.setRotation(Tail10, 0F, 0F, 0F);
      
      this.Tail11 = new ModelRenderer(this, 39, 38);
      this.Tail11.addBox(0F, 0F, 0F, 3, 1, 5);
      this.Tail11.setRotationPoint(-6F, 23F, 16F);
      this.setRotation(Tail11, 0F, 0F, 0F);
      
      this.Tail12 = new ModelRenderer(this, 56, 38);
      this.Tail12.addBox(0F, 0F, 0F, 3, 1, 5);
      this.Tail12.setRotationPoint(3F, 23F, 16F);
      this.setRotation(Tail12, 0F, 0F, 0F);
      
      this.Tail13 = new ModelRenderer(this, 59, 35);
      this.Tail13.addBox(0F, 0F, 0F, 1, 1, 1);
      this.Tail13.setRotationPoint(-3F, 23F, 18F);
      this.setRotation(Tail13, 0F, 0F, 0F);
      
      this.Tail14 = new ModelRenderer(this, 47, 35);
      this.Tail14.addBox(0F, 0F, 0F, 1, 1, 1);
      this.Tail14.setRotationPoint(2F, 23F, 18F);
      this.setRotation(Tail14, 0F, 0F, 0F);

      this.Tail16 = new ModelRenderer(this, 88, 47);
      this.Tail16.addBox(-4F, 0F, 4F, 8, 13, 0);
      this.Tail16.setRotationPoint(0F, 0F, 0F);
      this.setRotation(Tail16, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.head.render(f5);
    this.body.render(f5);
    this.rightarm.render(f5);
    this.leftarm.render(f5);
    this.Tail1.render(f5);
    this.Tail2.render(f5);
    this.Tail3.render(f5);
    this.Tail4.render(f5);
    this.Tail5.render(f5);
    this.Tail6.render(f5);
    this.Tail7.render(f5);
    this.Tail8.render(f5);
    this.Tail9.render(f5);
    this.Tail10.render(f5);
    this.Tail11.render(f5);
    this.Tail12.render(f5);
    this.Tail13.render(f5);
    this.Tail14.render(f5);
    this.Tail16.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
  {
      this.head.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
      this.head.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
      this.Tail16.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
      this.Tail16.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
      this.rightarm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 2.0F * p_78087_2_ * 0.5F;
      this.leftarm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 2.0F * p_78087_2_ * 0.5F;
      this.rightarm.rotateAngleZ = 0.0F;
      this.leftarm.rotateAngleZ = 0.0F;

  }
  

}
