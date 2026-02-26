package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.GiftFromKaziManorDisplayItem;

public class GiftFromKaziManorDisplayModel extends GeoModel<GiftFromKaziManorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GiftFromKaziManorDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/gift_from_kazi_manor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GiftFromKaziManorDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/gift_from_kazi_manor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GiftFromKaziManorDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/gift_from_kazi_manor.png");
	}
}
