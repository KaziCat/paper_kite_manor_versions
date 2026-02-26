package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.OrganPlayingBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.OrganPlayingTileEntity;

public class OrganPlayingTileRenderer extends GeoBlockRenderer<OrganPlayingTileEntity> {
	public OrganPlayingTileRenderer() {
		super(new OrganPlayingBlockModel());
	}

	@Override
	public RenderType getRenderType(OrganPlayingTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
