package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.CopperBartenderTileEntity;

public class CopperBartenderBlockModel extends GeoModel<CopperBartenderTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CopperBartenderTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/copper_bartender.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CopperBartenderTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/copper_bartender.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CopperBartenderTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/copper_bartender.png");
	}
}
