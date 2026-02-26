package net.mcreator.papercraftmagicdecoration.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.papercraftmagicdecoration.world.inventory.CocktailRecipeBookUiMenu;
import net.mcreator.papercraftmagicdecoration.procedures.CocktailRecipe03Procedure;
import net.mcreator.papercraftmagicdecoration.procedures.CocktailRecipe02Procedure;
import net.mcreator.papercraftmagicdecoration.procedures.CocktailRecipe01Procedure;
import net.mcreator.papercraftmagicdecoration.network.CocktailRecipeBookUiButtonMessage;
import net.mcreator.papercraftmagicdecoration.PapercraftMagicDecorationMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CocktailRecipeBookUiScreen extends AbstractContainerScreen<CocktailRecipeBookUiMenu> {
	private final static HashMap<String, Object> guistate = CocktailRecipeBookUiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_cocktail_recipe_book_ui_button;

	public CocktailRecipeBookUiScreen(CocktailRecipeBookUiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("papercraft_magic_decoration:textures/screens/cocktail_recipe_book_ui.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		if (CocktailRecipe01Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("papercraft_magic_decoration:textures/screens/cocktail_recipe_01.png"), this.leftPos + 88, this.topPos + 0, 0, 0, 88, 166, 88, 166);
		}
		if (CocktailRecipe02Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("papercraft_magic_decoration:textures/screens/cocktail_recipe_02.png"), this.leftPos + 88, this.topPos + 0, 0, 0, 88, 166, 88, 166);
		}
		if (CocktailRecipe03Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("papercraft_magic_decoration:textures/screens/cocktail_recipe_03.png"), this.leftPos + 88, this.topPos + 0, 0, 0, 88, 166, 88, 166);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_cocktail_recipe_book_ui_button = new ImageButton(this.leftPos + 163, this.topPos + 70, 16, 48, 0, 0, 48, new ResourceLocation("papercraft_magic_decoration:textures/screens/atlas/imagebutton_cocktail_recipe_book_ui_button.png"),
				16, 96, e -> {
					if (true) {
						PapercraftMagicDecorationMod.PACKET_HANDLER.sendToServer(new CocktailRecipeBookUiButtonMessage(0, x, y, z));
						CocktailRecipeBookUiButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				});
		guistate.put("button:imagebutton_cocktail_recipe_book_ui_button", imagebutton_cocktail_recipe_book_ui_button);
		this.addRenderableWidget(imagebutton_cocktail_recipe_book_ui_button);
	}
}
