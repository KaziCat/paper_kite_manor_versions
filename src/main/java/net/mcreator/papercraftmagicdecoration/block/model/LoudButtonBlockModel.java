package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.LoudButtonTileEntity;

public class LoudButtonBlockModel extends GeoModel<LoudButtonTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LoudButtonTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/loud_button.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LoudButtonTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/loud_button.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LoudButtonTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/loud_button.png");
	}
}
