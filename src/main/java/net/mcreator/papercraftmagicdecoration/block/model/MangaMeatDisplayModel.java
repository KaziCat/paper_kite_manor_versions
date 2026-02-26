package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.MangaMeatDisplayItem;

public class MangaMeatDisplayModel extends GeoModel<MangaMeatDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MangaMeatDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/manga_meat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MangaMeatDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/manga_meat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MangaMeatDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/manga_meat_food.png");
	}
}
