package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.RawMangaMeatBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.RawMangaMeatTileEntity;

public class RawMangaMeatTileRenderer extends GeoBlockRenderer<RawMangaMeatTileEntity> {
	public RawMangaMeatTileRenderer() {
		super(new RawMangaMeatBlockModel());
	}

	@Override
	public RenderType getRenderType(RawMangaMeatTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
