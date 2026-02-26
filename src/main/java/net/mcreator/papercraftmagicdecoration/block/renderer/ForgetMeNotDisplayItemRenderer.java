package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.ForgetMeNotDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.ForgetMeNotDisplayItem;

public class ForgetMeNotDisplayItemRenderer extends GeoItemRenderer<ForgetMeNotDisplayItem> {
	public ForgetMeNotDisplayItemRenderer() {
		super(new ForgetMeNotDisplayModel());
	}

	@Override
	public RenderType getRenderType(ForgetMeNotDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
