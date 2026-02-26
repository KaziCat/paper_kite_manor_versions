package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.WoodenBarrelBookshelfTileEntity;

public class WoodenBarrelBookshelfBlockModel extends GeoModel<WoodenBarrelBookshelfTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WoodenBarrelBookshelfTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/wooden_barrel_bookshelf.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodenBarrelBookshelfTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/wooden_barrel_bookshelf.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodenBarrelBookshelfTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/wooden_barrel_bookshelf.png");
	}
}
