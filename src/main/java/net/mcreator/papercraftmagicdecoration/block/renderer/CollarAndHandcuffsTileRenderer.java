package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.CollarAndHandcuffsBlockModel;
import net.mcreator.papercraftmagicdecoration.block.entity.CollarAndHandcuffsTileEntity;

public class CollarAndHandcuffsTileRenderer extends GeoBlockRenderer<CollarAndHandcuffsTileEntity> {
	public CollarAndHandcuffsTileRenderer() {
		super(new CollarAndHandcuffsBlockModel());
	}

	@Override
	public RenderType getRenderType(CollarAndHandcuffsTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
