package com.trinia.mob.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Toad extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape41;
    ModelRenderer Shape5;
    ModelRenderer Shape51;
  
  public Toad()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 7, 0);
      Shape1.addBox(0F, 0F, 0F, 1, 1, 2);
      Shape1.setRotationPoint(1F, 23F, -4F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 1, 1, 2);
      Shape2.setRotationPoint(-2F, 23F, -4F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 7);
      Shape3.addBox(0F, 0F, 0F, 6, 3, 7);
      Shape3.setRotationPoint(-3F, 20F, -3F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 14, 0);
      Shape4.addBox(0F, 0F, -4F, 2, 2, 4);
      Shape4.setRotationPoint(-4F, 22F, 5F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape41 = new ModelRenderer(this, 0, 18);
      Shape41.addBox(0F, 0F, -4F, 2, 2, 4);
      Shape41.setRotationPoint(2F, 22F, 5F);
      Shape41.setTextureSize(64, 32);
      Shape41.mirror = true;
      setRotation(Shape41, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 27, 0);
      Shape5.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape5.setRotationPoint(-2F, 19F, -2F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape51 = new ModelRenderer(this, 32, 0);
      Shape51.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape51.setRotationPoint(1F, 19F, -2F);
      Shape51.setTextureSize(64, 32);
      Shape51.mirror = true;
      setRotation(Shape51, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape5.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
