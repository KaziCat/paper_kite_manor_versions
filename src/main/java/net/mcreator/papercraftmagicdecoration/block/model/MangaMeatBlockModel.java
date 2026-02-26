package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.MangaMeatTileEntity;

public class MangaMeatBlockModel extends GeoModel<MangaMeatTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MangaMeatTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/manga_meat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MangaMeatTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/manga_meat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MangaMeatTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/manga_meat_food.png");
	}
}
