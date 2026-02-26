package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.WoodworkingTableTileEntity;

public class WoodworkingTableBlockModel extends GeoModel<WoodworkingTableTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WoodworkingTableTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/woodworking_table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WoodworkingTableTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/woodworking_table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WoodworkingTableTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/woodworking_table.png");
	}
}
