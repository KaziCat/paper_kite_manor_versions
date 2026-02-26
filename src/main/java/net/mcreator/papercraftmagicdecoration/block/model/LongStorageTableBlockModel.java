package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.LongStorageTableTileEntity;

public class LongStorageTableBlockModel extends GeoModel<LongStorageTableTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LongStorageTableTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/long_storage_table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LongStorageTableTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/long_storage_table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LongStorageTableTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/long_storage_table.png");
	}
}
