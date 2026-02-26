package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.GiftFromKaziManorTileEntity;

public class GiftFromKaziManorBlockModel extends GeoModel<GiftFromKaziManorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GiftFromKaziManorTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/gift_from_kazi_manor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GiftFromKaziManorTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/gift_from_kazi_manor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GiftFromKaziManorTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/gift_from_kazi_manor.png");
	}
}
