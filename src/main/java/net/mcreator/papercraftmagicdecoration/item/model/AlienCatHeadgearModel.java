package net.mcreator.papercraftmagicdecoration.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.item.AlienCatHeadgearItem;

public class AlienCatHeadgearModel extends GeoModel<AlienCatHeadgearItem> {
	@Override
	public ResourceLocation getAnimationResource(AlienCatHeadgearItem object) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/alien_cat_headgear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AlienCatHeadgearItem object) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/alien_cat_headgear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AlienCatHeadgearItem object) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/item/alien_cat_headgear.png");
	}
}
