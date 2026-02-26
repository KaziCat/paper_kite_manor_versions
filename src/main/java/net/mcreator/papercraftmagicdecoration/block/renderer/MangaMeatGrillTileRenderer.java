package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.MangaMeatGrillBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.MangaMeatGrillTileEntity;

public class MangaMeatGrillTileRenderer extends GeoBlockRenderer<MangaMeatGrillTileEntity> {
	public MangaMeatGrillTileRenderer() {
		super(new MangaMeatGrillBlockModel());
	}

	@Override
	public RenderType getRenderType(MangaMeatGrillTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
