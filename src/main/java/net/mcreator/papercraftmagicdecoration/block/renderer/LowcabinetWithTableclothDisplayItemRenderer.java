package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.LowcabinetWithTableclothDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.LowcabinetWithTableclothDisplayItem;

public class LowcabinetWithTableclothDisplayItemRenderer extends GeoItemRenderer<LowcabinetWithTableclothDisplayItem> {
	public LowcabinetWithTableclothDisplayItemRenderer() {
		super(new LowcabinetWithTableclothDisplayModel());
	}

	@Override
	public RenderType getRenderType(LowcabinetWithTableclothDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
