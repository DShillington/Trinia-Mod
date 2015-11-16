package com.trinia.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAmulet extends ModelBiped
{
   
	ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
  
  public ModelAmulet(float f)
  {
	  super(f, 0, 64,64);
    textureWidth = 64;
    textureHeight = 64;
    
      
    Shape1 = new ModelRenderer(this, 37, 0);
    Shape1.addBox(-3F, 0F, -2.5F, 1, 2, 1);
    Shape1.setRotationPoint(0F, 0F, 0F);
    Shape1.setTextureSize(64, 64);
    Shape1.mirror = true;
    setRotation(Shape1, 0F, 0F, 0F);
    Shape2 = new ModelRenderer(this, 44, 0);
    Shape2.addBox(2F, 0F, -2.5F, 1, 2, 1);
    Shape2.setRotationPoint(0F, 0F, 0F);
    Shape2.setTextureSize(64, 64);
    Shape2.mirror = true;
    setRotation(Shape2, 0F, 0F, 0F);
    Shape3 = new ModelRenderer(this, 44, 4);
    Shape3.addBox(1F, 2F, -2.5F, 1, 1, 1);
    Shape3.setRotationPoint(0F, 0F, 0F);
    Shape3.setTextureSize(64, 64);
    Shape3.mirror = true;
    setRotation(Shape3, 0F, 0F, 0F);
    Shape4 = new ModelRenderer(this, 37, 4);
    Shape4.addBox(-2F, 2F, -2.5F, 1, 1, 1);
    Shape4.setRotationPoint(0F, 0F, 0F);
    Shape4.setTextureSize(64, 64);
    Shape4.mirror = true;
    setRotation(Shape4, 0F, 0F, 0F);
    Shape5 = new ModelRenderer(this, 40, 7);
    Shape5.addBox(-1F, 3F, -3F, 2, 1, 1);
    Shape5.setRotationPoint(0F, 0F, 0F);
    Shape5.setTextureSize(64, 64);
    Shape5.mirror = true;
    setRotation(Shape5, 0F, 0F, 0F);
    Shape6 = new ModelRenderer(this, 38, 9);
    Shape6.addBox(-2F, 4F, -3F, 4, 2, 1);
    Shape6.setRotationPoint(0F, 0F, 0F);
    Shape6.setTextureSize(64, 64);
    Shape6.mirror = true;
    setRotation(Shape6, 0F, 0F, 0F);
    Shape7 = new ModelRenderer(this, 40, 12);
    Shape7.addBox(-1F, 6F, -3F, 2, 1, 1);
    Shape7.setRotationPoint(0F, 0F, 0F);
    Shape7.setTextureSize(64, 64);
    Shape7.mirror = true;
    setRotation(Shape7, 0F, 0F, 0F);
    Shape8 = new ModelRenderer(this, 50, 0);
    Shape8.addBox(-1F, 1F, -6F, 2, 1, 1);
    Shape8.setRotationPoint(0F, 0F, 0F);
    Shape8.setTextureSize(64, 64);
    Shape8.mirror = true;
    setRotation(Shape8, 0.7853982F, 0F, 0F);
    Shape9 = new ModelRenderer(this, 52, 3);
    Shape9.addBox(-2.5F, 4F, -2.5F, 1, 2, 1);
    Shape9.setRotationPoint(0F, 0F, 0F);
    Shape9.setTextureSize(64, 64);
    Shape9.mirror = true;
    setRotation(Shape9, 0F, -0.7853982F, 0F);
    Shape10 = new ModelRenderer(this, 50, 9);
    Shape10.addBox(-1.5F, 3.5F, -2.5F, 3, 3, 1);
    Shape10.setRotationPoint(0F, 0F, 0F);
    Shape10.setTextureSize(64, 64);
    Shape10.mirror = true;
    setRotation(Shape10, 0F, 0F, 0F);
    
        this.bipedBody.addChild(Shape1);
        this.bipedBody.addChild(Shape2);
        this.bipedBody.addChild(Shape3);
        this.bipedBody.addChild(Shape4);
        this.bipedBody.addChild(Shape5);
        this.bipedBody.addChild(Shape6);
        this.bipedBody.addChild(Shape7);
        this.bipedBody.addChild(Shape8);
        this.bipedBody.addChild(Shape9);
        this.bipedBody.addChild(Shape10);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);

  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }


}
