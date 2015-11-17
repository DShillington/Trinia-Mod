package com.trinia.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAngelWings extends ModelBiped
{
    ModelRenderer LeftWing;
    ModelRenderer RightWing;
  
  public ModelAngelWings(float f)
  {
	  super(f, 0, 64,64);
    textureWidth = 64;
    textureHeight = 64;
    
      LeftWing = new ModelRenderer(this, 24, 33);
      LeftWing.addBox(1F, -7F, 3F, 0, 17, 12);
      LeftWing.setRotationPoint(0F, 0F, 0F);
      LeftWing.setTextureSize(64, 64);
      LeftWing.mirror = true;
      setRotation(LeftWing, 0F, 0.6108652F, 0F);
      RightWing = new ModelRenderer(this, 0, 33);
      RightWing.addBox(-1F, -7F, 3F, 0, 17, 12);
      RightWing.setRotationPoint(0F, 0F, 0F);
      RightWing.setTextureSize(64, 64);
      RightWing.mirror = true;
      setRotation(RightWing, 0F, -0.6108652F, 0F);
      
      this.bipedBody.addChild(LeftWing);
      this.bipedBody.addChild(RightWing);
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
