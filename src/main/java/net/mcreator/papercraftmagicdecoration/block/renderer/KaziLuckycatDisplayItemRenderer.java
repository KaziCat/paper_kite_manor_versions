package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.KaziLuckycatDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.KaziLuckycatDisplayItem;

public class KaziLuckycatDisplayItemRenderer extends GeoItemRenderer<KaziLuckycatDisplayItem> {
	public KaziLuckycatDisplayItemRenderer() {
		super(new KaziLuckycatDisplayModel());
	}

	@Override
	public RenderType getRenderType(KaziLuckycatDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
