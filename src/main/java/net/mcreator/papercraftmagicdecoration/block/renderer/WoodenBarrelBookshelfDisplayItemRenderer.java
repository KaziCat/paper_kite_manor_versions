package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.WoodenBarrelBookshelfDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.WoodenBarrelBookshelfDisplayItem;

public class WoodenBarrelBookshelfDisplayItemRenderer extends GeoItemRenderer<WoodenBarrelBookshelfDisplayItem> {
	public WoodenBarrelBookshelfDisplayItemRenderer() {
		super(new WoodenBarrelBookshelfDisplayModel());
	}

	@Override
	public RenderType getRenderType(WoodenBarrelBookshelfDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
