package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.OldOrganDisplayItem;

public class OldOrganDisplayModel extends GeoModel<OldOrganDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OldOrganDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/old_organ.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OldOrganDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/old_organ.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OldOrganDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/old_organ.png");
	}
}
