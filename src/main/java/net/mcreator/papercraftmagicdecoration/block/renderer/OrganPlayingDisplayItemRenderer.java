package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.OrganPlayingDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.OrganPlayingDisplayItem;

public class OrganPlayingDisplayItemRenderer extends GeoItemRenderer<OrganPlayingDisplayItem> {
	public OrganPlayingDisplayItemRenderer() {
		super(new OrganPlayingDisplayModel());
	}

	@Override
	public RenderType getRenderType(OrganPlayingDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
