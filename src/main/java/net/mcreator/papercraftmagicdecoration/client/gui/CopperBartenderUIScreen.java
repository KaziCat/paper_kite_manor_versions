package net.mcreator.papercraftmagicdecoration.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.papercraftmagicdecoration.world.inventory.CopperBartenderUIMenu;
import net.mcreator.papercraftmagicdecoration.network.CopperBartenderUIButtonMessage;
import net.mcreator.papercraftmagicdecoration.PapercraftMagicDecorationMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CopperBartenderUIScreen extends AbstractContainerScreen<CopperBartenderUIMenu> {
	private final static HashMap<String, Object> guistate = CopperBartenderUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_clockwork_key_button;

	public CopperBartenderUIScreen(CopperBartenderUIMenu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("papercraft_magic_decoration:textures/screens/copper_bartender_ui.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

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
		imagebutton_clockwork_key_button = new ImageButton(this.leftPos + 72, this.topPos + 48, 32, 32, 0, 0, 32, new ResourceLocation("papercraft_magic_decoration:textures/screens/atlas/imagebutton_clockwork_key_button.png"), 32, 64, e -> {
			if (true) {
				PapercraftMagicDecorationMod.PACKET_HANDLER.sendToServer(new CopperBartenderUIButtonMessage(0, x, y, z));
				CopperBartenderUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clockwork_key_button", imagebutton_clockwork_key_button);
		this.addRenderableWidget(imagebutton_clockwork_key_button);
	}
}
