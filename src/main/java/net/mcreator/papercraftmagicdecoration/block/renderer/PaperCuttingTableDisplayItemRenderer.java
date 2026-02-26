package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.PaperCuttingTableDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.PaperCuttingTableDisplayItem;

public class PaperCuttingTableDisplayItemRenderer extends GeoItemRenderer<PaperCuttingTableDisplayItem> {
	public PaperCuttingTableDisplayItemRenderer() {
		super(new PaperCuttingTableDisplayModel());
	}

	@Override
	public RenderType getRenderType(PaperCuttingTableDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
