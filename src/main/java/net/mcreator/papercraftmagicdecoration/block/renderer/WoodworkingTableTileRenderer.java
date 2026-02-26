package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.WoodworkingTableBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.WoodworkingTableTileEntity;

public class WoodworkingTableTileRenderer extends GeoBlockRenderer<WoodworkingTableTileEntity> {
	public WoodworkingTableTileRenderer() {
		super(new WoodworkingTableBlockModel());
	}

	@Override
	public RenderType getRenderType(WoodworkingTableTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
