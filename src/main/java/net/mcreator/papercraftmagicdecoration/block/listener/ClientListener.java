package net.mcreator.papercraftmagicdecoration.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.papercraftmagicdecoration.init.PapercraftMagicDecorationModBlockEntities;
import net.mcreator.papercraftmagicdecoration.block.renderer.WoodworkingTableTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.WoodenBarrelBookshelfTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.SilverFoodDomeTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.SausageMaceWeaponBlockTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.RawSausageMaceWeaponTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.RawMangaMeatTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.PaperCuttingTableTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.PaintingNo3FirstEncounterTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.OrganPlayingTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.OldOrganTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.MarbleAngelTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.MangaMeatTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.MangaMeatGrillTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.LowcabinetWithTableclothTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.LoudButtonTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.LongStorageTableTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.KeyUnderTheLakeTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.KaziLuckycatTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.GiftFromKaziManorTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.ForgetMeNotTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.EdgedChalkboardTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.CopperBartenderTileRenderer;
import net.mcreator.papercraftmagicdecoration.block.renderer.CollarAndHandcuffsTileRenderer;
import net.mcreator.papercraftmagicdecoration.PapercraftMagicDecorationMod;

@Mod.EventBusSubscriber(modid = PapercraftMagicDecorationMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.PAPER_CUTTING_TABLE.get(), context -> new PaperCuttingTableTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.GIFT_FROM_KAZI_MANOR.get(), context -> new GiftFromKaziManorTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.KEY_UNDER_THE_LAKE.get(), context -> new KeyUnderTheLakeTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.KAZI_LUCKYCAT.get(), context -> new KaziLuckycatTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.LOUD_BUTTON.get(), context -> new LoudButtonTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.SILVER_FOOD_DOME.get(), context -> new SilverFoodDomeTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.WOODWORKING_TABLE.get(), context -> new WoodworkingTableTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.LOWCABINET_WITH_TABLECLOTH.get(), context -> new LowcabinetWithTableclothTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.WOODEN_BARREL_BOOKSHELF.get(), context -> new WoodenBarrelBookshelfTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.EDGED_CHALKBOARD.get(), context -> new EdgedChalkboardTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.LONG_STORAGE_TABLE.get(), context -> new LongStorageTableTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.OLD_ORGAN.get(), context -> new OldOrganTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.MARBLE_ANGEL.get(), context -> new MarbleAngelTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.RAW_MANGA_MEAT.get(), context -> new RawMangaMeatTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.MANGA_MEAT.get(), context -> new MangaMeatTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.RAW_SAUSAGE_MACE_WEAPON.get(), context -> new RawSausageMaceWeaponTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.FORGET_ME_NOT.get(), context -> new ForgetMeNotTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.COPPER_BARTENDER.get(), context -> new CopperBartenderTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.PAINTING_NO_3_FIRST_ENCOUNTER.get(), context -> new PaintingNo3FirstEncounterTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.COLLAR_AND_HANDCUFFS.get(), context -> new CollarAndHandcuffsTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.MANGA_MEAT_GRILL.get(), context -> new MangaMeatGrillTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.ORGAN_PLAYING.get(), context -> new OrganPlayingTileRenderer());
		event.registerBlockEntityRenderer(PapercraftMagicDecorationModBlockEntities.SAUSAGE_MACE_WEAPON_BLOCK.get(), context -> new SausageMaceWeaponBlockTileRenderer());
	}
}
