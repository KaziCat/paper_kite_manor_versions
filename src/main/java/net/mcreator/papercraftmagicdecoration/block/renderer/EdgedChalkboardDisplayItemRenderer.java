package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.EdgedChalkboardDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.EdgedChalkboardDisplayItem;

public class EdgedChalkboardDisplayItemRenderer extends GeoItemRenderer<EdgedChalkboardDisplayItem> {
	public EdgedChalkboardDisplayItemRenderer() {
		super(new EdgedChalkboardDisplayModel());
	}

	@Override
	public RenderType getRenderType(EdgedChalkboardDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
