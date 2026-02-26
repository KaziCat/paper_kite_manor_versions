package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.CopperBartenderDisplayItem;

public class CopperBartenderDisplayModel extends GeoModel<CopperBartenderDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CopperBartenderDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/copper_bartender.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CopperBartenderDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/copper_bartender.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CopperBartenderDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/copper_bartender.png");
	}
}
