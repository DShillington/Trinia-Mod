package com.trinia.gui;

import io.netty.buffer.Unpooled;

import java.io.IOException;
import java.util.Iterator;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ContainerBeacon;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.potion.Potion;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.trinia.TriniaMod;
import com.trinia.gui.container.ContainerSunDial;
import com.trinia.tileentity.TileEntitySunDial;

@SideOnly(Side.CLIENT)
public class SunDialGui extends GuiContainer {
	private static final Logger logger = LogManager.getLogger();
	private static final ResourceLocation beaconGuiTextures = new ResourceLocation(
			TriniaMod.ASSET_PREFIX, "textures/gui/SunDial.png");
	private IInventory tileBeacon;
	private boolean buttonsNotDrawn;
	private static final String __OBFID = "CL_00000739";

	public SunDialGui(InventoryPlayer p_i45507_1_, IInventory p_i45507_2_) {
		super(new ContainerSunDial(p_i45507_1_, p_i45507_2_));
		this.tileBeacon = p_i45507_2_;
		this.xSize = 230;
		this.ySize = 219;
	}

	public void initGui() {
		super.initGui();
		this.buttonsNotDrawn = true;

	}

	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		RenderHelper.disableStandardItemLighting();
		this.drawCenteredString(this.fontRendererObj,
				I18n.format("Sun Dial", new Object[0]), 115, 15, 23052600);
		this.fontRendererObj.drawString(
				I18n.format("Inventory", new Object[0]), 35, 127, 4210752);

		Iterator iterator = this.buttonList.iterator();

		RenderHelper.enableGUIStandardItemLighting();
	}

	protected void drawGuiContainerBackgroundLayer(float partialTicks,
			int mouseX, int mouseY) {
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(beaconGuiTextures);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
		this.itemRender.zLevel = 100.0F;
		this.itemRender.zLevel = 0.0F;
	}

}