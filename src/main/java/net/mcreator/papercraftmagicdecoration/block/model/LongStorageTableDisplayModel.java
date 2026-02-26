package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.LongStorageTableDisplayItem;

public class LongStorageTableDisplayModel extends GeoModel<LongStorageTableDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LongStorageTableDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/long_storage_table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LongStorageTableDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/long_storage_table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LongStorageTableDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/long_storage_table.png");
	}
}
