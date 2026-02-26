package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.SilverFoodDomeTileEntity;

public class SilverFoodDomeBlockModel extends GeoModel<SilverFoodDomeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SilverFoodDomeTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/silver_food_dome.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SilverFoodDomeTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/silver_food_dome.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SilverFoodDomeTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/silver_food_dome.png");
	}
}
