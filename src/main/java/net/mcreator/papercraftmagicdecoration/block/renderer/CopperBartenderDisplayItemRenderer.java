package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.CopperBartenderDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.CopperBartenderDisplayItem;

public class CopperBartenderDisplayItemRenderer extends GeoItemRenderer<CopperBartenderDisplayItem> {
	public CopperBartenderDisplayItemRenderer() {
		super(new CopperBartenderDisplayModel());
	}

	@Override
	public RenderType getRenderType(CopperBartenderDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
