package com.trinia.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAmulet extends ModelBiped
{
   
    ModelRenderer ChainRightOne;
    ModelRenderer ChainLeftOne;
    ModelRenderer ChainRightTwo;
    ModelRenderer ChainRightThree;
    ModelRenderer BaseTop;
    ModelRenderer BaseMiddle;
    ModelRenderer BaseBottom;
    ModelRenderer StoneHorizontal;
    ModelRenderer StoneVertical;
  
  public ModelAmulet(float f)
  {
	  super(f, 0, 64,64);
    textureWidth = 64;
    textureHeight = 64;
    
      
      ChainRightOne = new ModelRenderer(this, 0, 33);
      ChainRightOne.addBox(-3F, 0F, -3F, 1, 2, 1);
      ChainRightOne.setRotationPoint(0F, 0F, 0F);
      ChainRightOne.setTextureSize(64, 64);
      ChainRightOne.mirror = true;
      setRotation(ChainRightOne, 0F, 0F, 0F);
      ChainLeftOne = new ModelRenderer(this, 14, 33);
      ChainLeftOne.addBox(2F, 0F, -3F, 1, 2, 1);
      ChainLeftOne.setRotationPoint(0F, 0F, 0F);
      ChainLeftOne.setTextureSize(64, 64);
      ChainLeftOne.mirror = true;
      setRotation(ChainLeftOne, 0F, 0F, 0F);
      ChainRightTwo = new ModelRenderer(this, 4, 37);
      ChainRightTwo.addBox(-2F, 2F, -3F, 1, 1, 1);
      ChainRightTwo.setRotationPoint(0F, 0F, 0F);
      ChainRightTwo.setTextureSize(64, 64);
      ChainRightTwo.mirror = true;
      setRotation(ChainRightTwo, 0F, 0F, 0F);
      ChainRightThree = new ModelRenderer(this, 9, 37);
      ChainRightThree.addBox(1F, 2F, -3F, 1, 1, 1);
      ChainRightThree.setRotationPoint(0F, 0F, 0F);
      ChainRightThree.setTextureSize(64, 64);
      ChainRightThree.mirror = true;
      setRotation(ChainRightThree, 0F, 0F, 0F);
      BaseTop = new ModelRenderer(this, 5, 40);
      BaseTop.addBox(-1F, 3F, -3F, 2, 1, 1);
      BaseTop.setRotationPoint(0F, 0F, 0F);
      BaseTop.setTextureSize(64, 64);
      BaseTop.mirror = true;
      setRotation(BaseTop, 0F, 0F, 0F);
      BaseMiddle = new ModelRenderer(this, 3, 43);
      BaseMiddle.addBox(-2F, 4F, -3F, 4, 2, 1);
      BaseMiddle.setRotationPoint(0F, 0F, 0F);
      BaseMiddle.setTextureSize(64, 64);
      BaseMiddle.mirror = true;
      setRotation(BaseMiddle, 0F, 0F, 0F);
      BaseBottom = new ModelRenderer(this, 5, 47);
      BaseBottom.addBox(-1F, 6F, -3F, 2, 1, 1);
      BaseBottom.setRotationPoint(0F, 0F, 0F);
      BaseBottom.setTextureSize(64, 64);
      BaseBottom.mirror = true;
      setRotation(BaseBottom, 0F, 0F, 0F);
      StoneHorizontal = new ModelRenderer(this, 1, 51);
      StoneHorizontal.addBox(-1F, 1F, -6F, 2, 1, 1);
      StoneHorizontal.setRotationPoint(0F, 0F, 0F);
      StoneHorizontal.setTextureSize(64, 64);
      StoneHorizontal.mirror = true;
      setRotation(StoneHorizontal, 0.7853982F, 0F, 0F);
      StoneVertical = new ModelRenderer(this, 1, 56);
      StoneVertical.addBox(4F, -2.5F, -2.5F, 2, 1, 1);
      StoneVertical.setRotationPoint(0F, 0F, 0F);
      StoneVertical.setTextureSize(64, 64);
      StoneVertical.mirror = true;
      setRotation(StoneVertical, 0.7853982F, 0F, 1.570796F);
     
     /** this.bipedBody.addChild(ChainRightOne);
		this.bipedBody.addChild(ChainRightTwo);
		this.bipedBody.addChild(ChainRightThree);
		this.bipedBody.addChild(BaseTop);
		this.bipedBody.addChild(BaseMiddle);
		this.bipedBody.addChild(BaseBottom);
		this.bipedBody.addChild(StoneHorizontal);
		this.bipedBody.addChild(StoneVertical); */
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
