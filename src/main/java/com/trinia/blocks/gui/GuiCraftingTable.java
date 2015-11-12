package com.trinia.blocks.gui;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.trinia.tileentity.TileEntityTriniaWorkBench;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import scala.actors.threadpool.Arrays;

public class GuiCraftingTable extends GuiContainer
{
	private TileEntityTriniaWorkBench freezer;
	private static final ResourceLocation gui = new ResourceLocation("cfm:textures/gui/freezer.png");

	private GuiButton button_start;
	
	public GuiCraftingTable(InventoryPlayer playerInventory, TileEntityTriniaWorkBench freezerInventory)
	{
		super(new ContainerCraftStation(playerInventory, freezerInventory));
		this.freezer = freezerInventory;
		this.xSize = 176;
		this.ySize = 159;
	}
	
	@Override
	public void initGui()
	{
		super.initGui();
		Keyboard.enableRepeatEvents(false);
		buttonList.clear();

		int posX = width / 2;
		int posY = height / 2;

		button_start = new GuiButton(0, posX - 40, posY - 76, 32, 20, "Start");
		buttonList.add(button_start);
	}
	
	@Override
	protected void actionPerformed(GuiButton guibutton)
	{
		if (!guibutton.enabled)
		{
			return;
		}
				
		
		
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) 
	{
		super.drawScreen(mouseX, mouseY, partialTicks);
		
		
		
		if(isPointInRegion(32, 8, 11, 11, mouseX, mouseY))
		{
			
		}
	}

	
	
	public void drawColour(int x, int y, int width, int height, int par4)
	{
		WorldRenderer renderer = Tessellator.getInstance().getWorldRenderer();
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		renderer.startDrawingQuads();
		renderer.setColorOpaque_I(par4);
		renderer.addVertex(x, y, 0.0D);
		renderer.addVertex(x, y + height, 0.0D);
		renderer.addVertex(x + width, y + height, 0.0D);
		renderer.addVertex(x + width, y, 0.0D);
		Tessellator.getInstance().draw();
		GL11.glEnable(GL11.GL_TEXTURE_2D);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int x, int z)	
	{
	         this.fontRendererObj.drawString(StatCollector.translateToLocal("Crafting"), 30, 6, 4210752);
	         this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int x, int y)
	{
	         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	         this.mc.getTextureManager().bindTexture(gui);
	         int k = (this.width - this.xSize) / 2;
	         int l = (this.height - this.ySize) / 2;
	         this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	}
}