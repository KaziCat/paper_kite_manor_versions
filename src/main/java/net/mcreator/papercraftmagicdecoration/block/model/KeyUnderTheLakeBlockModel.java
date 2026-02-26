package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.KeyUnderTheLakeTileEntity;

public class KeyUnderTheLakeBlockModel extends GeoModel<KeyUnderTheLakeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(KeyUnderTheLakeTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/key_under_the_lake.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KeyUnderTheLakeTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/key_under_the_lake.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KeyUnderTheLakeTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/key_under_the_lake.png");
	}
}
