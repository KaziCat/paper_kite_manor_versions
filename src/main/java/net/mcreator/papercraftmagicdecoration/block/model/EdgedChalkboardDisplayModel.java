package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.EdgedChalkboardDisplayItem;

public class EdgedChalkboardDisplayModel extends GeoModel<EdgedChalkboardDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(EdgedChalkboardDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/edged_chalkboard.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EdgedChalkboardDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/edged_chalkboard.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EdgedChalkboardDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/edged_chalkboard.png");
	}
}
