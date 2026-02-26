package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.KeyUnderTheLakeDisplayItem;

public class KeyUnderTheLakeDisplayModel extends GeoModel<KeyUnderTheLakeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(KeyUnderTheLakeDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/key_under_the_lake.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KeyUnderTheLakeDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/key_under_the_lake.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KeyUnderTheLakeDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/key_under_the_lake.png");
	}
}
