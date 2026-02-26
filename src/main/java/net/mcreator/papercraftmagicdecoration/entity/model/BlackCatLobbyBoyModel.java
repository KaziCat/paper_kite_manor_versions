package net.mcreator.papercraftmagicdecoration.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.papercraftmagicdecoration.entity.BlackCatLobbyBoyEntity;

public class BlackCatLobbyBoyModel extends GeoModel<BlackCatLobbyBoyEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlackCatLobbyBoyEntity entity) {
		return new ResourceLocation("papercraft_magic_decoration", "animations/black_cat_lobby_boy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlackCatLobbyBoyEntity entity) {
		return new ResourceLocation("papercraft_magic_decoration", "geo/black_cat_lobby_boy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlackCatLobbyBoyEntity entity) {
		return new ResourceLocation("papercraft_magic_decoration", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BlackCatLobbyBoyEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
