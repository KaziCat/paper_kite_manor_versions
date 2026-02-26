package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.KaziLuckycatDisplayItem;

public class KaziLuckycatDisplayModel extends GeoModel<KaziLuckycatDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(KaziLuckycatDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/kazi_lucky_cat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KaziLuckycatDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/kazi_lucky_cat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KaziLuckycatDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/kazi_lucky_cat.png");
	}
}
