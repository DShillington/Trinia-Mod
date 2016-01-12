package com.trinia.gui.buttons;

import java.awt.Desktop;
import java.net.URI;
import java.net.URL;

import com.trinia.Reference;
import com.trinia.TriniaMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;

public class ButtonPMC extends GuiButton{

	 private static final ResourceLocation res = new ResourceLocation(TriniaMod.ASSET_PREFIX, "textures/gui/ButtonMedia.png");

	public ButtonPMC(int buttonId, int x, int y, int widthIn, int heightIn, String buttonText)
    {
	super(buttonId, x, y, widthIn, heightIn, "");
        this.width = 200;
        this.height = 20;
        this.enabled = true;
        this.visible = true;
        this.id = buttonId;
        this.xPosition = x;
        this.yPosition = y;
        this.width = widthIn;
        this.height = heightIn;
        this.displayString = buttonText;
        
    }
	
	@Override
	public void drawButton(Minecraft mc, int mouseX, int mouseY)
    {
        if (this.visible)
        {
        	FontRenderer fontrenderer = mc.fontRendererObj;
            mc.getTextureManager().bindTexture(res);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            this.hovered = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
            int k = this.getHoverState(this.hovered);
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
            GlStateManager.blendFunc(770, 771);
            this.mouseDragged(mc, mouseX, mouseY);
            int l = 14737632;
           if (packedFGColour != 0)
            {
                l = packedFGColour;
            }
            else if (!this.enabled)
            {
                l = 10526880;
            }
            else if (this.hovered)
            {
                l = 16777120;
            }

           this.drawTexturedModalRect(this.xPosition, this.yPosition, 61, 0, 19, 20);
        }
    }
}