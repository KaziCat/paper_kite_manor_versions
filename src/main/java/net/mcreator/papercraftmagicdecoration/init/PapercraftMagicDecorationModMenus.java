
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.papercraftmagicdecoration.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.papercraftmagicdecoration.world.inventory.TheNameTapMenu;
import net.mcreator.papercraftmagicdecoration.world.inventory.LobbyBoyBackpackMenu;
import net.mcreator.papercraftmagicdecoration.world.inventory.KaziLuckyCatTankMenu;
import net.mcreator.papercraftmagicdecoration.world.inventory.InsideTheDirtHoleMenu;
import net.mcreator.papercraftmagicdecoration.world.inventory.CopperBartenderUIMenu;
import net.mcreator.papercraftmagicdecoration.world.inventory.CocktailRecipeBookUiMenu;
import net.mcreator.papercraftmagicdecoration.world.inventory.BunnySuitcaseMenu;
import net.mcreator.papercraftmagicdecoration.PapercraftMagicDecorationMod;

public class PapercraftMagicDecorationModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PapercraftMagicDecorationMod.MODID);
	public static final RegistryObject<MenuType<LobbyBoyBackpackMenu>> LOBBY_BOY_BACKPACK = REGISTRY.register("lobby_boy_backpack", () -> IForgeMenuType.create(LobbyBoyBackpackMenu::new));
	public static final RegistryObject<MenuType<KaziLuckyCatTankMenu>> KAZI_LUCKY_CAT_TANK = REGISTRY.register("kazi_lucky_cat_tank", () -> IForgeMenuType.create(KaziLuckyCatTankMenu::new));
	public static final RegistryObject<MenuType<InsideTheDirtHoleMenu>> INSIDE_THE_DIRT_HOLE = REGISTRY.register("inside_the_dirt_hole", () -> IForgeMenuType.create(InsideTheDirtHoleMenu::new));
	public static final RegistryObject<MenuType<CopperBartenderUIMenu>> COPPER_BARTENDER_UI = REGISTRY.register("copper_bartender_ui", () -> IForgeMenuType.create(CopperBartenderUIMenu::new));
	public static final RegistryObject<MenuType<TheNameTapMenu>> THE_NAME_TAP = REGISTRY.register("the_name_tap", () -> IForgeMenuType.create(TheNameTapMenu::new));
	public static final RegistryObject<MenuType<BunnySuitcaseMenu>> BUNNY_SUITCASE = REGISTRY.register("bunny_suitcase", () -> IForgeMenuType.create(BunnySuitcaseMenu::new));
	public static final RegistryObject<MenuType<CocktailRecipeBookUiMenu>> COCKTAIL_RECIPE_BOOK_UI = REGISTRY.register("cocktail_recipe_book_ui", () -> IForgeMenuType.create(CocktailRecipeBookUiMenu::new));
}
