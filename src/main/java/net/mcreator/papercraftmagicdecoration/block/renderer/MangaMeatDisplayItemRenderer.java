package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.MangaMeatDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.MangaMeatDisplayItem;

public class MangaMeatDisplayItemRenderer extends GeoItemRenderer<MangaMeatDisplayItem> {
	public MangaMeatDisplayItemRenderer() {
		super(new MangaMeatDisplayModel());
	}

	@Override
	public RenderType getRenderType(MangaMeatDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
