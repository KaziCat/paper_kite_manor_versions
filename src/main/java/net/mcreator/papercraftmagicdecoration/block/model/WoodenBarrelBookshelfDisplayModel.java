package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.WoodenBarrelBookshelfDisplayItem;

public class WoodenBarrelBookshelfDisplayModel extends GeoModel<WoodenBarrelBookshelfDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WoodenBarrelBookshelfDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/wooden_barrel_bookshelf.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenBarrelBookshelfDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/wooden_barrel_bookshelf.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenBarrelBookshelfDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/wooden_barrel_bookshelf.png");
	}
}
