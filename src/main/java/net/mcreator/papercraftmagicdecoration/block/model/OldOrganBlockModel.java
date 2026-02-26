package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.OldOrganTileEntity;

public class OldOrganBlockModel extends GeoModel<OldOrganTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OldOrganTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/old_organ.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OldOrganTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/old_organ.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OldOrganTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/old_organ.png");
	}
}
