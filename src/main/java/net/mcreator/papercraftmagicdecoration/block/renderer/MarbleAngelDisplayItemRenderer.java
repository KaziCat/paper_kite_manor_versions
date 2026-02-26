package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.MarbleAngelDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.MarbleAngelDisplayItem;

public class MarbleAngelDisplayItemRenderer extends GeoItemRenderer<MarbleAngelDisplayItem> {
	public MarbleAngelDisplayItemRenderer() {
		super(new MarbleAngelDisplayModel());
	}

	@Override
	public RenderType getRenderType(MarbleAngelDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
