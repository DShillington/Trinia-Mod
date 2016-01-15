package com.trinia.gui;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URL;

import org.lwjgl.opengl.GL11;

import com.trinia.TriniaMod;
import com.trinia.gui.buttons.ButtonBack;
import com.trinia.gui.buttons.ButtonInfo;
import com.trinia.gui.buttons.ButtonMods;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;

public class GuideGui extends GuiScreen
{
	private static final ResourceLocation GuideTextures = new ResourceLocation(
			TriniaMod.ASSET_PREFIX, "textures/gui/GuideGui.png");
    @Override
    public void initGui() {
    	int i = this.height / 4 + 48;
		this.addSingleplayerMultiplayerButtons(i, 24);
    }
	private ButtonInfo buttonInfo;
	
	private int xSize;
	private int ySize;

    public void addSingleplayerMultiplayerButtons(int p_73969_1_, int p_73969_2_) {
		
	this.buttonList.add(this.buttonInfo = new ButtonInfo(20, 20, 20, 20, 20,
				I18n.format("info", new Object[0])));

	buttonInfo.width = 120;

	buttonInfo.packedFGColour = 16777215;
	}
    
    protected void actionPerformed(GuiButton button) throws IOException {
		
		if (button.id == 1) {
			try {
				Desktop.getDesktop()
						.browse(new URL(
								"http://triniamod.weebly.com/crafting.html")
								.toURI());
			} catch (Exception e) {
			}
		}
		}
    
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.drawDefaultBackground();
        this.mc.getTextureManager().bindTexture(GuideTextures);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glColor4f(1, 1, 1, 1.0f);
		this.drawTexturedModalRect(this.width / 2 - 90, this.height / 2 - 100, 0, 0, 255, 255);

		this.fontRendererObj.drawString("Trinia Guide Book", this.width / 2 - 39, this.height / 2 - 81, 0xFFFFF888);
        this.drawCenteredString(this.fontRendererObj, "Trinia Amulet", this.width / 2 - 48, this.height / 2 - 52, 0xFFFFF888);
        this.fontRendererObj.drawString("-Right click to get back", this.width / 2 -70, this.height / 2 - 41, 0xFFFFFFFF);  
        this.fontRendererObj.drawString("from trinia", this.width / 2 -64, this.height / 2 - 31, 0xFFFFFFFF);
       
        this.drawCenteredString(this.fontRendererObj, "Magical Bed", this.width / 2 - 51, this.height / 2 + 14, 0xFFFFF888);
        this.fontRendererObj.drawString("-Sleep here to get", this.width / 2 -70, this.height / 2 + 25, 0xFFFFFFFF);  
        this.fontRendererObj.drawString("to trinia", this.width / 2 -64, this.height / 2 + 35, 0xFFFFFFFF);
      
        this.fontRendererObj.drawString("More Info", this.width / 2 -64, this.height / 2 + 65, 0xFFFFFFFF);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
    private void drawCenteredString(FontRenderer fontRendererObj,
			String format, int x, int y, float red) {

	}

	private void drawRect(int left, int top, int right, int bottom, Object rgb) {
	}
    @Override
    public void updateScreen() {
        super.updateScreen();
    }
}