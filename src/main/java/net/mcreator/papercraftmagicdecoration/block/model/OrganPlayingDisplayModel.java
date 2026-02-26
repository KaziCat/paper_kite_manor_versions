package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.OrganPlayingDisplayItem;

public class OrganPlayingDisplayModel extends GeoModel<OrganPlayingDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OrganPlayingDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/old_organ.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrganPlayingDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/old_organ.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrganPlayingDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/old_organ.png");
	}
}
