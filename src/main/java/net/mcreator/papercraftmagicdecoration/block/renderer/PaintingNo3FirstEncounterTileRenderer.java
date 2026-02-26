package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.PaintingNo3FirstEncounterBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.PaintingNo3FirstEncounterTileEntity;

public class PaintingNo3FirstEncounterTileRenderer extends GeoBlockRenderer<PaintingNo3FirstEncounterTileEntity> {
	public PaintingNo3FirstEncounterTileRenderer() {
		super(new PaintingNo3FirstEncounterBlockModel());
	}

	@Override
	public RenderType getRenderType(PaintingNo3FirstEncounterTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
