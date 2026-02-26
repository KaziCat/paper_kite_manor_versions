package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.entity.PaperCuttingTableTileEntity;

public class PaperCuttingTableBlockModel extends GeoModel<PaperCuttingTableTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PaperCuttingTableTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/paper_cutting_table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PaperCuttingTableTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/paper_cutting_table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PaperCuttingTableTileEntity animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/paper_cutting_table.png");
	}
}
