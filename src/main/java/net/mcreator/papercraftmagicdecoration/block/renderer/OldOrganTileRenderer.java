package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.OldOrganBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.OldOrganTileEntity;

public class OldOrganTileRenderer extends GeoBlockRenderer<OldOrganTileEntity> {
	public OldOrganTileRenderer() {
		super(new OldOrganBlockModel());
	}

	@Override
	public RenderType getRenderType(OldOrganTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
