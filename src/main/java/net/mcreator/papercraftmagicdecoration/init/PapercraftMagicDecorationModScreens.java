
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.papercraftmagicdecoration.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.papercraftmagicdecoration.client.gui.TheNameTapScreen;
import net.mcreator.papercraftmagicdecoration.client.gui.LobbyBoyBackpackScreen;
import net.mcreator.papercraftmagicdecoration.client.gui.KaziLuckyCatTankScreen;
import net.mcreator.papercraftmagicdecoration.client.gui.InsideTheDirtHoleScreen;
import net.mcreator.papercraftmagicdecoration.client.gui.CopperBartenderUIScreen;
import net.mcreator.papercraftmagicdecoration.client.gui.CocktailRecipeBookUiScreen;
import net.mcreator.papercraftmagicdecoration.client.gui.BunnySuitcaseScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PapercraftMagicDecorationModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PapercraftMagicDecorationModMenus.LOBBY_BOY_BACKPACK.get(), LobbyBoyBackpackScreen::new);
			MenuScreens.register(PapercraftMagicDecorationModMenus.KAZI_LUCKY_CAT_TANK.get(), KaziLuckyCatTankScreen::new);
			MenuScreens.register(PapercraftMagicDecorationModMenus.INSIDE_THE_DIRT_HOLE.get(), InsideTheDirtHoleScreen::new);
			MenuScreens.register(PapercraftMagicDecorationModMenus.COPPER_BARTENDER_UI.get(), CopperBartenderUIScreen::new);
			MenuScreens.register(PapercraftMagicDecorationModMenus.THE_NAME_TAP.get(), TheNameTapScreen::new);
			MenuScreens.register(PapercraftMagicDecorationModMenus.BUNNY_SUITCASE.get(), BunnySuitcaseScreen::new);
			MenuScreens.register(PapercraftMagicDecorationModMenus.COCKTAIL_RECIPE_BOOK_UI.get(), CocktailRecipeBookUiScreen::new);
		});
	}
}
