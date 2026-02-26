package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.LongStorageTableBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.LongStorageTableTileEntity;

public class LongStorageTableTileRenderer extends GeoBlockRenderer<LongStorageTableTileEntity> {
	public LongStorageTableTileRenderer() {
		super(new LongStorageTableBlockModel());
	}

	@Override
	public RenderType getRenderType(LongStorageTableTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
