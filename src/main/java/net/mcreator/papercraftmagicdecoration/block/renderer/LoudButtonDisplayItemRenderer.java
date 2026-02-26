package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.LoudButtonDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.LoudButtonDisplayItem;

public class LoudButtonDisplayItemRenderer extends GeoItemRenderer<LoudButtonDisplayItem> {
	public LoudButtonDisplayItemRenderer() {
		super(new LoudButtonDisplayModel());
	}

	@Override
	public RenderType getRenderType(LoudButtonDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
