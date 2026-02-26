package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.RawMangaMeatDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.RawMangaMeatDisplayItem;

public class RawMangaMeatDisplayItemRenderer extends GeoItemRenderer<RawMangaMeatDisplayItem> {
	public RawMangaMeatDisplayItemRenderer() {
		super(new RawMangaMeatDisplayModel());
	}

	@Override
	public RenderType getRenderType(RawMangaMeatDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
