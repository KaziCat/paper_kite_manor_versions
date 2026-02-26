package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.PaintingNo3FirstEncounterDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.PaintingNo3FirstEncounterDisplayItem;

public class PaintingNo3FirstEncounterDisplayItemRenderer extends GeoItemRenderer<PaintingNo3FirstEncounterDisplayItem> {
	public PaintingNo3FirstEncounterDisplayItemRenderer() {
		super(new PaintingNo3FirstEncounterDisplayModel());
	}

	@Override
	public RenderType getRenderType(PaintingNo3FirstEncounterDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
