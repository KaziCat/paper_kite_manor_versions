
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.papercraftmagicdecoration.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.papercraftmagicdecoration.client.renderer.WhiteRabbitMaidRenderer;
import net.mcreator.papercraftmagicdecoration.client.renderer.PaperTigerRenderer;
import net.mcreator.papercraftmagicdecoration.client.renderer.BlackCatLobbyBoyRenderer;
import net.mcreator.papercraftmagicdecoration.client.renderer.AoaoRenderer;
import net.mcreator.papercraftmagicdecoration.client.renderer.AirFlowCarpRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PapercraftMagicDecorationModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PapercraftMagicDecorationModEntities.BLACK_CAT_LOBBY_BOY.get(), BlackCatLobbyBoyRenderer::new);
		event.registerEntityRenderer(PapercraftMagicDecorationModEntities.WHITE_RABBIT_MAID.get(), WhiteRabbitMaidRenderer::new);
		event.registerEntityRenderer(PapercraftMagicDecorationModEntities.AOAO.get(), AoaoRenderer::new);
		event.registerEntityRenderer(PapercraftMagicDecorationModEntities.AIR_FLOW_CARP.get(), AirFlowCarpRenderer::new);
		event.registerEntityRenderer(PapercraftMagicDecorationModEntities.PAPER_TIGER.get(), PaperTigerRenderer::new);
		event.registerEntityRenderer(PapercraftMagicDecorationModEntities.FIRE_WHISKEY_THROW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PapercraftMagicDecorationModEntities.VODKA_THROW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PapercraftMagicDecorationModEntities.FLYING_CHICKEN.get(), ThrownItemRenderer::new);
	}
}
