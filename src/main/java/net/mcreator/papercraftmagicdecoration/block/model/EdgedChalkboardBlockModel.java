package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.EdgedChalkboardTileEntity;

public class EdgedChalkboardBlockModel extends GeoModel<EdgedChalkboardTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(EdgedChalkboardTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/edged_chalkboard.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EdgedChalkboardTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/edged_chalkboard.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EdgedChalkboardTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/edged_chalkboard.png");
	}
}
