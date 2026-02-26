package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.MangaMeatGrillTileEntity;

public class MangaMeatGrillBlockModel extends GeoModel<MangaMeatGrillTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MangaMeatGrillTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/manga_meat_grill.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MangaMeatGrillTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/manga_meat_grill.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MangaMeatGrillTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/manga_meat.png");
	}
}
