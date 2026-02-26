package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.LoudButtonDisplayItem;

public class LoudButtonDisplayModel extends GeoModel<LoudButtonDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LoudButtonDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/loud_button.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LoudButtonDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/loud_button.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LoudButtonDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/loud_button.png");
	}
}
