package net.mcreator.papercraftmagicdecoration.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.papercraftmagicdecoration.block.model.SausageMaceWeaponBlockDisplayModel;
import net.mcreator.papercraftmagicdecoration.block.display.SausageMaceWeaponBlockDisplayItem;

public class SausageMaceWeaponBlockDisplayItemRenderer extends GeoItemRenderer<SausageMaceWeaponBlockDisplayItem> {
	public SausageMaceWeaponBlockDisplayItemRenderer() {
		super(new SausageMaceWeaponBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(SausageMaceWeaponBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
