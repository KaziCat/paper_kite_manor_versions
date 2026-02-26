
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.papercraftmagicdecoration.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.papercraftmagicdecoration.block.entity.WoodworkingTableTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.WoodenBarrelBookshelfTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.UmbrellaCashewFruitingStemBlockEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.UmbrellaCashewBlockEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.SporesCollectionPlateBlockEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.SilverFoodDomeTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.SausageMaceWeaponBlockTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.RawSausageMaceWeaponTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.RawMonsterSteakBlockEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.RawMangaMeatTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.PotOfNocturnalCatCoffeeBlockEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.PotOfGoldMedalCoffeeBlockEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.PaperCuttingTableTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.PaintingNo3FirstEncounterTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.OrganPlayingTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.OldOrganTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.MiniPalmTreeBlockEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.MarbleAngelTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.MangaMeatTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.MangaMeatGrillTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.LowcabinetWithTableclothTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.LoudButtonTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.LongStorageTableTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.KeyUnderTheLakeTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.KaziLuckycatTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.JumboSalmonBlockEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.GiftFromKaziManorTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.ForgetMeNotTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.EdgedChalkboardTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.DirtHoleBlockEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.CopperBartenderTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.CollarAndHandcuffsTileEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.CoffeePastinacaSativaSproutBlockEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.CoffeePastinacaSativaSeededBlockEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.CoffeePastinacaSativaGrowBlockEntity;
import net.mcreator.papercraftmagicdecoration.block.entity.CanopyTreeBudBlockEntity;
import net.mcreator.papercraftmagicdecoration.PapercraftMagicDecorationMod;

public class PapercraftMagicDecorationModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PapercraftMagicDecorationMod.MODID);
	public static final RegistryObject<BlockEntityType<PaperCuttingTableTileEntity>> PAPER_CUTTING_TABLE = REGISTRY.register("paper_cutting_table",
			() -> BlockEntityType.Builder.of(PaperCuttingTableTileEntity::new, PapercraftMagicDecorationModBlocks.PAPER_CUTTING_TABLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<GiftFromKaziManorTileEntity>> GIFT_FROM_KAZI_MANOR = REGISTRY.register("gift_from_kazi_manor",
			() -> BlockEntityType.Builder.of(GiftFromKaziManorTileEntity::new, PapercraftMagicDecorationModBlocks.GIFT_FROM_KAZI_MANOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<KeyUnderTheLakeTileEntity>> KEY_UNDER_THE_LAKE = REGISTRY.register("key_under_the_lake",
			() -> BlockEntityType.Builder.of(KeyUnderTheLakeTileEntity::new, PapercraftMagicDecorationModBlocks.KEY_UNDER_THE_LAKE.get()).build(null));
	public static final RegistryObject<BlockEntityType<KaziLuckycatTileEntity>> KAZI_LUCKYCAT = REGISTRY.register("kazi_luckycat",
			() -> BlockEntityType.Builder.of(KaziLuckycatTileEntity::new, PapercraftMagicDecorationModBlocks.KAZI_LUCKYCAT.get()).build(null));
	public static final RegistryObject<BlockEntityType<LoudButtonTileEntity>> LOUD_BUTTON = REGISTRY.register("loud_button",
			() -> BlockEntityType.Builder.of(LoudButtonTileEntity::new, PapercraftMagicDecorationModBlocks.LOUD_BUTTON.get()).build(null));
	public static final RegistryObject<BlockEntityType<SilverFoodDomeTileEntity>> SILVER_FOOD_DOME = REGISTRY.register("silver_food_dome",
			() -> BlockEntityType.Builder.of(SilverFoodDomeTileEntity::new, PapercraftMagicDecorationModBlocks.SILVER_FOOD_DOME.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodworkingTableTileEntity>> WOODWORKING_TABLE = REGISTRY.register("woodworking_table",
			() -> BlockEntityType.Builder.of(WoodworkingTableTileEntity::new, PapercraftMagicDecorationModBlocks.WOODWORKING_TABLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<LowcabinetWithTableclothTileEntity>> LOWCABINET_WITH_TABLECLOTH = REGISTRY.register("lowcabinet_with_tablecloth",
			() -> BlockEntityType.Builder.of(LowcabinetWithTableclothTileEntity::new, PapercraftMagicDecorationModBlocks.LOWCABINET_WITH_TABLECLOTH.get()).build(null));
	public static final RegistryObject<BlockEntityType<WoodenBarrelBookshelfTileEntity>> WOODEN_BARREL_BOOKSHELF = REGISTRY.register("wooden_barrel_bookshelf",
			() -> BlockEntityType.Builder.of(WoodenBarrelBookshelfTileEntity::new, PapercraftMagicDecorationModBlocks.WOODEN_BARREL_BOOKSHELF.get()).build(null));
	public static final RegistryObject<BlockEntityType<EdgedChalkboardTileEntity>> EDGED_CHALKBOARD = REGISTRY.register("edged_chalkboard",
			() -> BlockEntityType.Builder.of(EdgedChalkboardTileEntity::new, PapercraftMagicDecorationModBlocks.EDGED_CHALKBOARD.get()).build(null));
	public static final RegistryObject<BlockEntityType<LongStorageTableTileEntity>> LONG_STORAGE_TABLE = REGISTRY.register("long_storage_table",
			() -> BlockEntityType.Builder.of(LongStorageTableTileEntity::new, PapercraftMagicDecorationModBlocks.LONG_STORAGE_TABLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<OldOrganTileEntity>> OLD_ORGAN = REGISTRY.register("old_organ", () -> BlockEntityType.Builder.of(OldOrganTileEntity::new, PapercraftMagicDecorationModBlocks.OLD_ORGAN.get()).build(null));
	public static final RegistryObject<BlockEntityType<MarbleAngelTileEntity>> MARBLE_ANGEL = REGISTRY.register("marble_angel",
			() -> BlockEntityType.Builder.of(MarbleAngelTileEntity::new, PapercraftMagicDecorationModBlocks.MARBLE_ANGEL.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> MINI_PALM_TREE = register("mini_palm_tree", PapercraftMagicDecorationModBlocks.MINI_PALM_TREE, MiniPalmTreeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<RawMangaMeatTileEntity>> RAW_MANGA_MEAT = REGISTRY.register("raw_manga_meat",
			() -> BlockEntityType.Builder.of(RawMangaMeatTileEntity::new, PapercraftMagicDecorationModBlocks.RAW_MANGA_MEAT.get()).build(null));
	public static final RegistryObject<BlockEntityType<MangaMeatTileEntity>> MANGA_MEAT = REGISTRY.register("manga_meat", () -> BlockEntityType.Builder.of(MangaMeatTileEntity::new, PapercraftMagicDecorationModBlocks.MANGA_MEAT.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> RAW_MONSTER_STEAK = register("raw_monster_steak", PapercraftMagicDecorationModBlocks.RAW_MONSTER_STEAK, RawMonsterSteakBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> JUMBO_SALMON = register("jumbo_salmon", PapercraftMagicDecorationModBlocks.JUMBO_SALMON, JumboSalmonBlockEntity::new);
	public static final RegistryObject<BlockEntityType<RawSausageMaceWeaponTileEntity>> RAW_SAUSAGE_MACE_WEAPON = REGISTRY.register("raw_sausage_mace_weapon",
			() -> BlockEntityType.Builder.of(RawSausageMaceWeaponTileEntity::new, PapercraftMagicDecorationModBlocks.RAW_SAUSAGE_MACE_WEAPON.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> POT_OF_NOCTURNAL_CAT_COFFEE = register("pot_of_nocturnal_cat_coffee", PapercraftMagicDecorationModBlocks.POT_OF_NOCTURNAL_CAT_COFFEE, PotOfNocturnalCatCoffeeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POT_OF_GOLD_MEDAL_COFFEE = register("pot_of_gold_medal_coffee", PapercraftMagicDecorationModBlocks.POT_OF_GOLD_MEDAL_COFFEE, PotOfGoldMedalCoffeeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DIRT_HOLE = register("dirt_hole", PapercraftMagicDecorationModBlocks.DIRT_HOLE, DirtHoleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<ForgetMeNotTileEntity>> FORGET_ME_NOT = REGISTRY.register("forget_me_not",
			() -> BlockEntityType.Builder.of(ForgetMeNotTileEntity::new, PapercraftMagicDecorationModBlocks.FORGET_ME_NOT.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> SPORES_COLLECTION_PLATE = register("spores_collection_plate", PapercraftMagicDecorationModBlocks.SPORES_COLLECTION_PLATE, SporesCollectionPlateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<CopperBartenderTileEntity>> COPPER_BARTENDER = REGISTRY.register("copper_bartender",
			() -> BlockEntityType.Builder.of(CopperBartenderTileEntity::new, PapercraftMagicDecorationModBlocks.COPPER_BARTENDER.get()).build(null));
	public static final RegistryObject<BlockEntityType<PaintingNo3FirstEncounterTileEntity>> PAINTING_NO_3_FIRST_ENCOUNTER = REGISTRY.register("painting_no_3_first_encounter",
			() -> BlockEntityType.Builder.of(PaintingNo3FirstEncounterTileEntity::new, PapercraftMagicDecorationModBlocks.PAINTING_NO_3_FIRST_ENCOUNTER.get()).build(null));
	public static final RegistryObject<BlockEntityType<CollarAndHandcuffsTileEntity>> COLLAR_AND_HANDCUFFS = REGISTRY.register("collar_and_handcuffs",
			() -> BlockEntityType.Builder.of(CollarAndHandcuffsTileEntity::new, PapercraftMagicDecorationModBlocks.COLLAR_AND_HANDCUFFS.get()).build(null));
	public static final RegistryObject<BlockEntityType<MangaMeatGrillTileEntity>> MANGA_MEAT_GRILL = REGISTRY.register("manga_meat_grill",
			() -> BlockEntityType.Builder.of(MangaMeatGrillTileEntity::new, PapercraftMagicDecorationModBlocks.MANGA_MEAT_GRILL.get()).build(null));
	public static final RegistryObject<BlockEntityType<OrganPlayingTileEntity>> ORGAN_PLAYING = REGISTRY.register("organ_playing",
			() -> BlockEntityType.Builder.of(OrganPlayingTileEntity::new, PapercraftMagicDecorationModBlocks.ORGAN_PLAYING.get()).build(null));
	public static final RegistryObject<BlockEntityType<SausageMaceWeaponBlockTileEntity>> SAUSAGE_MACE_WEAPON_BLOCK = REGISTRY.register("sausage_mace_weapon_block",
			() -> BlockEntityType.Builder.of(SausageMaceWeaponBlockTileEntity::new, PapercraftMagicDecorationModBlocks.SAUSAGE_MACE_WEAPON_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> COFFEE_PASTINACA_SATIVA_SEEDED = register("coffee_pastinaca_sativa_seeded", PapercraftMagicDecorationModBlocks.COFFEE_PASTINACA_SATIVA_SEEDED, CoffeePastinacaSativaSeededBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_PASTINACA_SATIVA_SPROUT = register("coffee_pastinaca_sativa_sprout", PapercraftMagicDecorationModBlocks.COFFEE_PASTINACA_SATIVA_SPROUT, CoffeePastinacaSativaSproutBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_PASTINACA_SATIVA_GROW = register("coffee_pastinaca_sativa_grow", PapercraftMagicDecorationModBlocks.COFFEE_PASTINACA_SATIVA_GROW, CoffeePastinacaSativaGrowBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> UMBRELLA_CASHEW = register("umbrella_cashew", PapercraftMagicDecorationModBlocks.UMBRELLA_CASHEW, UmbrellaCashewBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> UMBRELLA_CASHEW_FRUITING_STEM = register("umbrella_cashew_fruiting_stem", PapercraftMagicDecorationModBlocks.UMBRELLA_CASHEW_FRUITING_STEM, UmbrellaCashewFruitingStemBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CANOPY_TREE_BUD = register("canopy_tree_bud", PapercraftMagicDecorationModBlocks.CANOPY_TREE_BUD, CanopyTreeBudBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
