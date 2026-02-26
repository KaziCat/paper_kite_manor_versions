package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.LoudButtonBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.LoudButtonTileEntity;

public class LoudButtonTileRenderer extends GeoBlockRenderer<LoudButtonTileEntity> {
	public LoudButtonTileRenderer() {
		super(new LoudButtonBlockModel());
	}

	@Override
	public RenderType getRenderType(LoudButtonTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
