package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.KaziLuckycatBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.KaziLuckycatTileEntity;

public class KaziLuckycatTileRenderer extends GeoBlockRenderer<KaziLuckycatTileEntity> {
	public KaziLuckycatTileRenderer() {
		super(new KaziLuckycatBlockModel());
	}

	@Override
	public RenderType getRenderType(KaziLuckycatTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
