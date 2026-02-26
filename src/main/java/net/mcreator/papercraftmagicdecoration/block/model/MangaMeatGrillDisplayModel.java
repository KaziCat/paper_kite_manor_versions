package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.MangaMeatGrillDisplayItem;

public class MangaMeatGrillDisplayModel extends GeoModel<MangaMeatGrillDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MangaMeatGrillDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/manga_meat_grill.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MangaMeatGrillDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/manga_meat_grill.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MangaMeatGrillDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/manga_meat.png");
	}
}
