package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.LongStorageTableDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.LongStorageTableDisplayItem;

public class LongStorageTableDisplayItemRenderer extends GeoItemRenderer<LongStorageTableDisplayItem> {
	public LongStorageTableDisplayItemRenderer() {
		super(new LongStorageTableDisplayModel());
	}

	@Override
	public RenderType getRenderType(LongStorageTableDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
