package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.SilverFoodDomeBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.SilverFoodDomeTileEntity;

public class SilverFoodDomeTileRenderer extends GeoBlockRenderer<SilverFoodDomeTileEntity> {
	public SilverFoodDomeTileRenderer() {
		super(new SilverFoodDomeBlockModel());
	}

	@Override
	public RenderType getRenderType(SilverFoodDomeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
