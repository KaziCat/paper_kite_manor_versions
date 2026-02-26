package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.SilverFoodDomeDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.SilverFoodDomeDisplayItem;

public class SilverFoodDomeDisplayItemRenderer extends GeoItemRenderer<SilverFoodDomeDisplayItem> {
	public SilverFoodDomeDisplayItemRenderer() {
		super(new SilverFoodDomeDisplayModel());
	}

	@Override
	public RenderType getRenderType(SilverFoodDomeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
