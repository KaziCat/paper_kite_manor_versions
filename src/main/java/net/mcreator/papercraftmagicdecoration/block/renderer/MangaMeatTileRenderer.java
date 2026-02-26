package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.MangaMeatBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.MangaMeatTileEntity;

public class MangaMeatTileRenderer extends GeoBlockRenderer<MangaMeatTileEntity> {
	public MangaMeatTileRenderer() {
		super(new MangaMeatBlockModel());
	}

	@Override
	public RenderType getRenderType(MangaMeatTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
