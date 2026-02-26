package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.MarbleAngelDisplayItem;

public class MarbleAngelDisplayModel extends GeoModel<MarbleAngelDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MarbleAngelDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/marble_angel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MarbleAngelDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/marble_angel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MarbleAngelDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/marble_angel.png");
	}
}
