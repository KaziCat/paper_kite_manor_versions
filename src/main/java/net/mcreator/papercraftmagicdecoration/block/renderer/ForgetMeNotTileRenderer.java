package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.ForgetMeNotBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.ForgetMeNotTileEntity;

public class ForgetMeNotTileRenderer extends GeoBlockRenderer<ForgetMeNotTileEntity> {
	public ForgetMeNotTileRenderer() {
		super(new ForgetMeNotBlockModel());
	}

	@Override
	public RenderType getRenderType(ForgetMeNotTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
