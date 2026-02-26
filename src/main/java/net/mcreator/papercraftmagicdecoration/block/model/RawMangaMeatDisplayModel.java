package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.RawMangaMeatDisplayItem;

public class RawMangaMeatDisplayModel extends GeoModel<RawMangaMeatDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RawMangaMeatDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/manga_meat_grill.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RawMangaMeatDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/manga_meat_grill.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RawMangaMeatDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/raw_manga_meat.png");
	}
}
