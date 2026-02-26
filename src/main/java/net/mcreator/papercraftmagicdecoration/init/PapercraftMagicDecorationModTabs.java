
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.papercraftmagicdecoration.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.papercraftmagicdecoration.PapercraftMagicDecorationMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PapercraftMagicDecorationModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PapercraftMagicDecorationMod.MODID);
	public static final RegistryObject<CreativeModeTab> PAPERCRAFT_MAGIC_DECORATION = REGISTRY.register("papercraft_magic_decoration", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.papercraft_magic_decoration.papercraft_magic_decoration")).icon(() -> new ItemStack(PapercraftMagicDecorationModItems.KITE_ICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PapercraftMagicDecorationModItems.KAZI_STAR.get());
				tabData.accept(PapercraftMagicDecorationModItems.GARDEN_TROWEL.get());
				tabData.accept(PapercraftMagicDecorationModItems.AMETHYST_SCISSORS.get());
				tabData.accept(PapercraftMagicDecorationModBlocks.PAPER_CUTTING_TABLE.get().asItem());
				tabData.accept(PapercraftMagicDecorationModItems.COCKTAIL_RECIPE_BOOK.get());
				tabData.accept(PapercraftMagicDecorationModBlocks.GIFT_FROM_KAZI_MANOR.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.KEY_UNDER_THE_LAKE.get().asItem());
				tabData.accept(PapercraftMagicDecorationModItems.DUSTY_PAINTING.get());
				tabData.accept(PapercraftMagicDecorationModBlocks.AEROGEL.get().asItem());
				tabData.accept(PapercraftMagicDecorationModItems.BLACK_PAPER.get());
				tabData.accept(PapercraftMagicDecorationModItems.WHITE_PAPER.get());
				tabData.accept(PapercraftMagicDecorationModItems.RED_PAPER.get());
				tabData.accept(PapercraftMagicDecorationModItems.BLUE_PAPER.get());
				tabData.accept(PapercraftMagicDecorationModItems.YELLOW_PAPER.get());
				tabData.accept(PapercraftMagicDecorationModItems.DEWY_MEMBRANE.get());
				tabData.accept(PapercraftMagicDecorationModItems.COTTON_SERGE.get());
				tabData.accept(PapercraftMagicDecorationModBlocks.BLACK_PAPER_BLICK.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.WHITE_PAPER_BLOCK.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.RED_PAPER_BLOCK.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.BLUE_PAPER_BLOCK.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.YELLOW_PAPER_BLOCK.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.DEWY_MEMBRANE_BLOCK.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.COTTON_SERGE_BLOCK.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.KAZI_LUCKYCAT.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.LOUD_BUTTON.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.SILVER_FOOD_DOME.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.FOAM_BOX_WITH_DIRT.get().asItem());
				tabData.accept(PapercraftMagicDecorationModItems.PAPER_FOLD_TIGER.get());
				tabData.accept(PapercraftMagicDecorationModItems.WOODWORKING_TABLE_ORIGAMI.get());
				tabData.accept(PapercraftMagicDecorationModItems.LOWCABINET_WITH_TABLECLOTH_ORIGAMI.get());
				tabData.accept(PapercraftMagicDecorationModItems.WOODEN_BARREL_BOOKSHELF_ORIGAMI.get());
				tabData.accept(PapercraftMagicDecorationModItems.EDGED_CHALKBOARD_ORIGAMI.get());
				tabData.accept(PapercraftMagicDecorationModItems.LONG_STORAGE_TABLE_ORIGAMI.get());
				tabData.accept(PapercraftMagicDecorationModItems.CUPBOARD_ORIGAMI.get());
				tabData.accept(PapercraftMagicDecorationModItems.OLD_ORGAN_ORIGAMI.get());
				tabData.accept(PapercraftMagicDecorationModItems.LARGE_DINING_TABLE_ORIGAMI.get());
				tabData.accept(PapercraftMagicDecorationModItems.RED_VELVET_CHAISE_LONGUE_ORIGAMI.get());
				tabData.accept(PapercraftMagicDecorationModItems.FIREPLACE_DECORATION_ORIGAMI.get());
			})

			.build());
	public static final RegistryObject<CreativeModeTab> PAPER_MAGIC_BLOCKS = REGISTRY.register("paper_magic_blocks", () -> CreativeModeTab.builder().title(Component.translatable("item_group.papercraft_magic_decoration.paper_magic_blocks"))
			.icon(() -> new ItemStack(PapercraftMagicDecorationModBlocks.WOODWORKING_TABLE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PapercraftMagicDecorationModBlocks.WOODWORKING_TABLE.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.LOWCABINET_WITH_TABLECLOTH.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.WOODEN_BARREL_BOOKSHELF.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.EDGED_CHALKBOARD.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.LONG_STORAGE_TABLE.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.CUPBOARD.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.OLD_ORGAN.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.LARGE_DINING_TABLE.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.RED_VELVET_CHAISE_LONGUE.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.BLACK_AND_WHITE_TILE_FOORING.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.UNDERGROUND_PANELLING.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.UNDERGROUND_WALLPAPER_WALLS.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.UNDERGROUND_DOOR_FRAMES.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.PALM_TREE_CROWN.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.PALM_TREE_TOP.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.PALM_TREE_TRUNK_TOP.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.PALM_TREE_TRUNK.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.ROUGH_PALM_TREE_TRUNK.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.KNITTED_LEOPARD_RUG.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.FIREPLACE_DECORATION.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.RUSTIC_BLUE_WALLPAPER_WALLS.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.RUSTIC_PANELLING.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.BLUE_AND_WHITE_TILE_FOORING.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.STAR_EMBELLISHED_CEILING.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.WINE_AROMA_RED_WALLPAPER_WALLS.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.WINE_AROMA_BLUE_WALLPAPER_WALLS.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.MARBLE_ANGEL.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.EMERALD_BLUE_EARTH_TILE.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.CANOPY_TREE_TRUNK.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.CANOPY_TREE_DROOPING_ROOT.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.CANOPY_TREE_FOLIAGE.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.CANOPY_TREE_LIMB.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.CANOPY_TREE_FERN.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.CANOPY_TREE_MUSHROOM.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.DWARF_PLUM_BLOSSOM.get().asItem());
				tabData.accept(PapercraftMagicDecorationModBlocks.MINI_PALM_TREE.get().asItem());
			})

			.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(PapercraftMagicDecorationModBlocks.SPORES_COLLECTION_PLATE.get().asItem());
			tabData.accept(PapercraftMagicDecorationModBlocks.COPPER_BARTENDER.get().asItem());
			tabData.accept(PapercraftMagicDecorationModBlocks.PAINTING_NO_1_BUNNY_MAID.get().asItem());
			tabData.accept(PapercraftMagicDecorationModBlocks.PAINTING_NO_2_AOAO.get().asItem());
			tabData.accept(PapercraftMagicDecorationModBlocks.PAINTING_NO_3_FIRST_ENCOUNTER.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(PapercraftMagicDecorationModItems.SAUSAGE_MACE_WEAPON.get());
			tabData.accept(PapercraftMagicDecorationModItems.ALIEN_CAT_HEADGEAR_HELMET.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PapercraftMagicDecorationModItems.BLACK_CAT_LOBBY_BOY_SPAWN_EGG.get());
			tabData.accept(PapercraftMagicDecorationModItems.WHITE_RABBIT_MAID_SPAWN_EGG.get());
			tabData.accept(PapercraftMagicDecorationModItems.AOAO_SPAWN_EGG.get());
			tabData.accept(PapercraftMagicDecorationModItems.AIR_FLOW_CARP_SPAWN_EGG.get());
			tabData.accept(PapercraftMagicDecorationModItems.PAPER_TIGER_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(PapercraftMagicDecorationModItems.BOTTLE_VITALITY_SPORES.get());
			tabData.accept(PapercraftMagicDecorationModItems.WHISKEYRAW.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(PapercraftMagicDecorationModBlocks.RAW_MANGA_MEAT.get().asItem());
			tabData.accept(PapercraftMagicDecorationModBlocks.MANGA_MEAT.get().asItem());
			tabData.accept(PapercraftMagicDecorationModItems.BREADED_RAW_CHICKEN.get());
			tabData.accept(PapercraftMagicDecorationModBlocks.BUCKET_OF_FRIED_CHICKEN.get().asItem());
			tabData.accept(PapercraftMagicDecorationModItems.FRIED_CHICKEN_LEG.get());
			tabData.accept(PapercraftMagicDecorationModBlocks.RAW_MONSTER_STEAK.get().asItem());
			tabData.accept(PapercraftMagicDecorationModItems.LARGE_STEAKS.get());
			tabData.accept(PapercraftMagicDecorationModBlocks.JUMBO_SALMON.get().asItem());
			tabData.accept(PapercraftMagicDecorationModItems.CHUNKY_SMOKED_SALMON.get());
			tabData.accept(PapercraftMagicDecorationModItems.SMOKED_SALMON_HEAD.get());
			tabData.accept(PapercraftMagicDecorationModBlocks.BLAZEWHISKEY.get().asItem());
			tabData.accept(PapercraftMagicDecorationModItems.A_GLASS_OF_BLAZE_WHISKEY.get());
			tabData.accept(PapercraftMagicDecorationModBlocks.FERRY_WHISKEY.get().asItem());
			tabData.accept(PapercraftMagicDecorationModItems.A_GLASS_OF_FERRY_WHISKEY.get());
			tabData.accept(PapercraftMagicDecorationModBlocks.RAW_SAUSAGE_MACE_WEAPON.get().asItem());
			tabData.accept(PapercraftMagicDecorationModItems.CUBED_SAUSAGE.get());
			tabData.accept(PapercraftMagicDecorationModBlocks.FLY_WHISKEY.get().asItem());
			tabData.accept(PapercraftMagicDecorationModItems.A_GLASS_OF_FLY_WHISKEY.get());
			tabData.accept(PapercraftMagicDecorationModBlocks.LUCKY_CACTUS.get().asItem());
			tabData.accept(PapercraftMagicDecorationModItems.A_GLASS_OF_LUCKY_CACTUS.get());
			tabData.accept(PapercraftMagicDecorationModBlocks.POISON_RUM.get().asItem());
			tabData.accept(PapercraftMagicDecorationModItems.A_GLASS_OF_POISON_RUM.get());
			tabData.accept(PapercraftMagicDecorationModBlocks.PACK_OF_GUANG_S.get().asItem());
			tabData.accept(PapercraftMagicDecorationModItems.CAN_OF_GUANG_S.get());
			tabData.accept(PapercraftMagicDecorationModBlocks.LAND_NO_1.get().asItem());
			tabData.accept(PapercraftMagicDecorationModItems.A_GLASS_OF_LAND_NO_1.get());
			tabData.accept(PapercraftMagicDecorationModItems.BLOODY_MARY.get());
			tabData.accept(PapercraftMagicDecorationModItems.GROUND_GROWN_COFFEE_FRUIT.get());
			tabData.accept(PapercraftMagicDecorationModItems.COFFEE_PASTINACA_SATIVA_TUBER.get());
			tabData.accept(PapercraftMagicDecorationModItems.DEVIL_MARGARITA.get());
			tabData.accept(PapercraftMagicDecorationModItems.GOLDEN_COFFEE_FRUIT.get());
			tabData.accept(PapercraftMagicDecorationModBlocks.POT_OF_NOCTURNAL_CAT_COFFEE.get().asItem());
			tabData.accept(PapercraftMagicDecorationModBlocks.POT_OF_BOILED_NOCTURNAL_CAT_COFFEE.get().asItem());
			tabData.accept(PapercraftMagicDecorationModItems.NOCTURNAL_CAT_COFFEE.get());
			tabData.accept(PapercraftMagicDecorationModItems.GOLD_MEDAL_COFFEE.get());
			tabData.accept(PapercraftMagicDecorationModBlocks.POT_OF_GOLD_MEDAL_COFFEE.get().asItem());
			tabData.accept(PapercraftMagicDecorationModBlocks.POT_OF_BOILED_GOLD_MEDAL_COFFEE.get().asItem());
			tabData.accept(PapercraftMagicDecorationModItems.DIPLOMATICO_COFFEE.get());
			tabData.accept(PapercraftMagicDecorationModItems.GLOW_CASHEWS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(PapercraftMagicDecorationModBlocks.DIRT_HOLE.get().asItem());
			tabData.accept(PapercraftMagicDecorationModBlocks.COFFEE_PASTINACA_SATIVA_FLOWERS.get().asItem());
			tabData.accept(PapercraftMagicDecorationModBlocks.FORGET_ME_NOT.get().asItem());
		}
	}
}
