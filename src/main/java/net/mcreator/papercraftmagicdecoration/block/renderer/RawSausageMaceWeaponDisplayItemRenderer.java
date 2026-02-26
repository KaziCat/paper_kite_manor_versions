package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.RawSausageMaceWeaponDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.RawSausageMaceWeaponDisplayItem;

public class RawSausageMaceWeaponDisplayItemRenderer extends GeoItemRenderer<RawSausageMaceWeaponDisplayItem> {
	public RawSausageMaceWeaponDisplayItemRenderer() {
		super(new RawSausageMaceWeaponDisplayModel());
	}

	@Override
	public RenderType getRenderType(RawSausageMaceWeaponDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
