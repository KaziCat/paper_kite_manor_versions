package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.KeyUnderTheLakeBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.KeyUnderTheLakeTileEntity;

public class KeyUnderTheLakeTileRenderer extends GeoBlockRenderer<KeyUnderTheLakeTileEntity> {
	public KeyUnderTheLakeTileRenderer() {
		super(new KeyUnderTheLakeBlockModel());
	}

	@Override
	public RenderType getRenderType(KeyUnderTheLakeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
