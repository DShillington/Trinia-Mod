package com.trinia.gui;

import io.netty.buffer.Unpooled;

import java.io.IOException;
import java.util.Iterator;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ContainerBeacon;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.potion.Potion;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.GuiModList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.trinia.TriniaMod;
import com.trinia.gui.buttons.ButtonBack;
import com.trinia.gui.buttons.ButtonDawn;
import com.trinia.gui.buttons.ButtonDay;
import com.trinia.gui.buttons.ButtonDusk;
import com.trinia.gui.buttons.ButtonMods;
import com.trinia.gui.buttons.ButtonNight;
import com.trinia.gui.container.ContainerSunDial;
import com.trinia.tileentity.TileEntitySunDial;

@SideOnly(Side.CLIENT)
public class SunDialGui extends GuiContainer {

	private ButtonDay buttonDay;
	private ButtonNight buttonNight;
	private ButtonDawn buttonDawn;
	private ButtonDusk buttonDusk;

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

		int i = this.height / 4 + 48;
		this.addSingleplayerMultiplayerButtons(i, 24);

	}

	public void addSingleplayerMultiplayerButtons(int p_73969_1_, int p_73969_2_) {
		this.buttonList.add(this.buttonDay = new ButtonDay(1,
				this.width / 2 - 80, this.height / 2 - 65, 20, 20, I18n.format(
						"DAY", new Object[0])));
		this.buttonList.add(this.buttonNight = new ButtonNight(2,
				this.width / 2 + 60, this.height / 2 - 65, 20, 20, I18n.format(
						"NIGHT", new Object[0])));
		this.buttonList.add(this.buttonDawn = new ButtonDawn(3,
				this.width / 2 - 34, this.height / 2 - 65, 20, 20, I18n.format(
						"DAWN", new Object[0])));
		this.buttonList.add(this.buttonDusk = new ButtonDusk(4,
				this.width / 2 + 13, this.height / 2 - 65, 20, 20, I18n.format(
						"DUSK", new Object[0])));

		buttonDay.width = 20;
		buttonNight.width = 20;
		buttonDawn.width = 20;
		buttonDusk.width = 20;

		buttonDay.packedFGColour = 16777215;
		buttonNight.packedFGColour = 16777215;
		buttonDawn.packedFGColour = 16777215;
		buttonDusk.packedFGColour = 16777215;
	}

	protected void actionPerformed(GuiButton button, World world) throws IOException {
		if (button.id == 1) {
			System.out.println("Sun Dial: Changed Time To Mid Day");
			this.sendChatMessage("has set the sun dial to Day.");
		}
		if (button.id == 2) {
			System.out.println("Sun Dial: Changed Time To Midnight");
			this.sendChatMessage("has set the sun dial to Midnight.");
		}
		if (button.id == 3) {
			System.out.println("Sun Dial: Changed Time To Dawn");
			this.sendChatMessage("has set the sun dial to Dawn.");
		}
		if (button.id == 4) {
			System.out.println("Sun Dial: Changed Time To Dusk");
			this.sendChatMessage("has set the sun dial to Dusk.");
		}
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

	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();

		super.drawScreen(mouseX, mouseY, partialTicks);

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