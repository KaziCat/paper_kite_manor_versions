package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.ForgetMeNotDisplayItem;

public class ForgetMeNotDisplayModel extends GeoModel<ForgetMeNotDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ForgetMeNotDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/forget_me_not.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ForgetMeNotDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/forget_me_not.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ForgetMeNotDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/forget_me_not.png");
	}
}
