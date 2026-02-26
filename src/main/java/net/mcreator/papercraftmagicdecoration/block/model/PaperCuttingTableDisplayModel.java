package net.mcreator.papercraftmagicdecoration.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.block.display.PaperCuttingTableDisplayItem;

public class PaperCuttingTableDisplayModel extends GeoModel<PaperCuttingTableDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PaperCuttingTableDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/paper_cutting_table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PaperCuttingTableDisplayItem animatable) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/paper_cutting_table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PaperCuttingTableDisplayItem entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/block/paper_cutting_table.png");
	}
}
