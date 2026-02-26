package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.WoodenBarrelBookshelfBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.WoodenBarrelBookshelfTileEntity;

public class WoodenBarrelBookshelfTileRenderer extends GeoBlockRenderer<WoodenBarrelBookshelfTileEntity> {
	public WoodenBarrelBookshelfTileRenderer() {
		super(new WoodenBarrelBookshelfBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodenBarrelBookshelfTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
