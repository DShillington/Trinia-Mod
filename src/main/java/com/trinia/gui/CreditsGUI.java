package com.trinia.gui;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.lwjgl.opengl.GL11;

import com.trinia.Reference;
import com.trinia.gui.buttons.ButtonBack;
import com.trinia.gui.buttons.ButtonMods;
import com.trinia.TriniaMod;

import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.client.audio.SoundEventAccessorComposite;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiLanguage;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiOptionButton;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSelectWorld;
import net.minecraft.client.gui.GuiYesNo;
import net.minecraft.client.gui.GuiYesNoCallback;
import net.minecraft.client.gui.inventory.GuiBeacon;
import net.minecraft.client.gui.stream.GuiStreamOptions;
import net.minecraft.client.gui.stream.GuiStreamUnavailable;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.stream.IStream;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.demo.DemoWorldServer;
import net.minecraft.world.storage.ISaveFormat;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.fml.client.GuiModList;
import net.minecraftforge.fml.client.config.HoverChecker;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class CreditsGUI extends GuiScreen implements GuiYesNoCallback {
	private ButtonBack buttonBack;
	private ButtonMods buttonMods;

	private static final ResourceLocation minecraftTitleTextures = new ResourceLocation(
			TriniaMod.ASSET_PREFIX, "textures/gui/title/minecraft.png");
	
	private static final ResourceLocation CreditsOverlay = new ResourceLocation(
			TriniaMod.ASSET_PREFIX, "textures/gui/Black.png");

	private static final ResourceLocation test = new ResourceLocation(
			TriniaMod.ASSET_PREFIX, "textures/blocks/triniagrassSide.png");

	private static final ResourceLocation res = new ResourceLocation(
			TriniaMod.ASSET_PREFIX, "textures/blocks/triniagrassTop.png");

	public void drawBackground(int tint) {
		GlStateManager.disableLighting();
		GlStateManager.disableFog();
		Tessellator tessellator = Tessellator.getInstance();
		WorldRenderer worldrenderer = tessellator.getWorldRenderer();
		this.mc.getTextureManager().bindTexture(res);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		float f = 32.0F;
		worldrenderer.startDrawingQuads();
		// worldrenderer.setColorOpaque_I(4210752);
		worldrenderer.addVertexWithUV(0.0D, (double) this.height, 0.0D, 0.0D,
				(double) ((float) this.height / f + (float) tint));
		worldrenderer.addVertexWithUV((double) this.width,
				(double) this.height, 0.0D, (double) ((float) this.width / f),
				(double) ((float) this.height / f + (float) tint));
		worldrenderer.addVertexWithUV((double) this.width, 0.0D, 0.0D,
				(double) ((float) this.width / f), (double) tint);
		worldrenderer.addVertexWithUV(0.0D, 0.0D, 0.0D, 0.0D, (double) tint);
		tessellator.draw();
	}

	// protected void actionPerformed(GuiButton button) throws IOException{}
	public CreditsGUI(GuiScreen p_i1046_1_, GameSettings p_i1046_2_) {
	}

	public void initGui(int p_73969_1_, int p_73969_2_) {
	}

	public void confirmClicked(boolean result, int id) {
	}

	// title
	protected String creditPageName = "Credits!";

	// Positions
	protected String creditLeader = "Leaders:";
	protected String creditDeveloper = "Developers:";
	protected String creditArtist = "Artists:";

	// people who helped
	protected String creditPapertazer = "-Papertazer";
	protected String creditOMGitsMiniMe = "-OMGitsMiniMe";
	protected String creditSnurly = "-Snurly";
	protected String creditMagikModder = "-MagikModder (help)";
	protected String creditTerreen = "-Terreen";

	// Copyright
	protected String creditMojang = "Minecraft is copyright of MOJANG AB.";
	private int xSize;
	private int ySize;

	public void initGui() {
		int i = this.height / 4 + 48;
		this.addSingleplayerMultiplayerButtons(i, 24);

	}

	public void addSingleplayerMultiplayerButtons(int p_73969_1_, int p_73969_2_) {
		// The parameters of GuiButton are(id, x, y, width, height, text);
		this.buttonList.add(this.buttonBack = new ButtonBack(1, 10, 10, 20, 20,
				I18n.format("PMC", new Object[0])));
		this.buttonList.add(this.buttonMods = new ButtonMods(2, 10, 40, 20, 20,
				I18n.format("PMC", new Object[0])));

		buttonBack.width = 20;
		buttonMods.width = 20;

		buttonBack.packedFGColour = 16777215;
		buttonMods.packedFGColour = 16777215;

	}

	protected void actionPerformed(GuiButton button) throws IOException {
		if (button.id == 1) {
			this.mc.displayGuiScreen(new GuiMainMenu());
		}
		if (button.id == 2) {
			this.mc.displayGuiScreen(new GuiModList(null));
		}
	}

	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();

		int k = 0;
		byte b0 = 0;

		this.drawGradientRect(9000, 0, this.width, this.height, -2130706433,
				16777215);
		this.drawGradientRect(9000, 0, this.width, this.height, 0,
				Integer.MIN_VALUE);
		
		this.mc.getTextureManager().bindTexture(CreditsOverlay);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glColor4f(1, 1, 1, 0.6f);
		this.drawTexturedModalRect(this.width / 2 - 95, 0, 0, 0, 187, 1000);
		this.mc.getTextureManager().bindTexture(minecraftTitleTextures);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

		this.drawTexturedModalRect(this.width / 2 - 95, 10, 0, 0, 187, 44);
		
		// title
		this.drawCenteredString(this.fontRendererObj, this.creditPageName,
				this.width / 2, 60, 16777215);

		// Leaders
		this.drawCenteredString(this.fontRendererObj, this.creditLeader,
				this.width / 2, 75, 18668501);
		this.drawCenteredString(this.fontRendererObj, this.creditPapertazer,
				this.width / 2, 85, 18668801);
		this.drawCenteredString(this.fontRendererObj, this.creditOMGitsMiniMe,
				this.width / 2, 95, 18668801);

		// Developers
		this.drawCenteredString(this.fontRendererObj, this.creditDeveloper,
				this.width / 2, 110, 18668501);
		this.drawCenteredString(this.fontRendererObj, this.creditPapertazer,
				this.width / 2, 120, 18668801);
		this.drawCenteredString(this.fontRendererObj, this.creditOMGitsMiniMe,
				this.width / 2, 130, 18668801);
		this.drawCenteredString(this.fontRendererObj, this.creditMagikModder,
				this.width / 2, 140, 18668801);

		// Artists
		this.drawCenteredString(this.fontRendererObj, this.creditArtist,
				this.width / 2, 155, 18668501);
		this.drawCenteredString(this.fontRendererObj, this.creditSnurly,
				this.width / 2, 165, 18668801);
		this.drawCenteredString(this.fontRendererObj, this.creditTerreen,
				this.width / 2, 175, 18668801);

		// Copyright
		this.drawCenteredString(this.fontRendererObj, this.creditMojang,
				this.width / 2, 225, 18668501);

		super.drawScreen(mouseX, mouseY, partialTicks);
	}

	private void drawCenteredString(FontRenderer fontRendererObj,
			String format, int x, int y, float red) {
		// TODO Auto-generated method stub

	}

	private void drawRect(int left, int top, int right, int bottom, Object rgb) {

	}

}