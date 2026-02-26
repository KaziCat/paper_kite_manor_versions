package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.PaintingNo3FirstEncounterDisplayItem;

public class PaintingNo3FirstEncounterDisplayModel extends GeoModel<PaintingNo3FirstEncounterDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PaintingNo3FirstEncounterDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/painting_no_3_first_encounter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PaintingNo3FirstEncounterDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/painting_no_3_first_encounter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PaintingNo3FirstEncounterDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/painting_no_3_first_encounter.png");
	}
}
