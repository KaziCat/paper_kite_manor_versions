package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.SilverFoodDomeDisplayItem;

public class SilverFoodDomeDisplayModel extends GeoModel<SilverFoodDomeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SilverFoodDomeDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/silver_food_dome.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SilverFoodDomeDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/silver_food_dome.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SilverFoodDomeDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/silver_food_dome.png");
	}
}
