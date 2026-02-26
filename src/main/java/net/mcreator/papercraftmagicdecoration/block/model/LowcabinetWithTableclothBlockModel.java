package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.LowcabinetWithTableclothTileEntity;

public class LowcabinetWithTableclothBlockModel extends GeoModel<LowcabinetWithTableclothTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LowcabinetWithTableclothTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/lowcabinet_with_tablecloth.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LowcabinetWithTableclothTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/lowcabinet_with_tablecloth.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LowcabinetWithTableclothTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/lowcabinet_with_tablecloth.png");
	}
}
