package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.ForgetMeNotTileEntity;

public class ForgetMeNotBlockModel extends GeoModel<ForgetMeNotTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ForgetMeNotTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/forget_me_not.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ForgetMeNotTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/forget_me_not.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ForgetMeNotTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/forget_me_not.png");
	}
}
