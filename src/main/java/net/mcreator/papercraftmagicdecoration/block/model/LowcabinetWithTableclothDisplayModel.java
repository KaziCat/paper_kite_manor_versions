package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.LowcabinetWithTableclothDisplayItem;

public class LowcabinetWithTableclothDisplayModel extends GeoModel<LowcabinetWithTableclothDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LowcabinetWithTableclothDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/lowcabinet_with_tablecloth.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LowcabinetWithTableclothDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/lowcabinet_with_tablecloth.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LowcabinetWithTableclothDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/lowcabinet_with_tablecloth.png");
	}
}
