package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.PaintingNo3FirstEncounterTileEntity;

public class PaintingNo3FirstEncounterBlockModel extends GeoModel<PaintingNo3FirstEncounterTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PaintingNo3FirstEncounterTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/painting_no_3_first_encounter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PaintingNo3FirstEncounterTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/painting_no_3_first_encounter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PaintingNo3FirstEncounterTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/painting_no_3_first_encounter.png");
	}
}
