package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.CopperBartenderBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.CopperBartenderTileEntity;

public class CopperBartenderTileRenderer extends GeoBlockRenderer<CopperBartenderTileEntity> {
	public CopperBartenderTileRenderer() {
		super(new CopperBartenderBlockModel());
	}

	@Override
	public RenderType getRenderType(CopperBartenderTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
