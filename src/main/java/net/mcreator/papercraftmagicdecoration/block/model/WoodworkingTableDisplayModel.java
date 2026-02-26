package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.WoodworkingTableDisplayItem;

public class WoodworkingTableDisplayModel extends GeoModel<WoodworkingTableDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WoodworkingTableDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/woodworking_table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodworkingTableDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/woodworking_table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodworkingTableDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/woodworking_table.png");
	}
}
