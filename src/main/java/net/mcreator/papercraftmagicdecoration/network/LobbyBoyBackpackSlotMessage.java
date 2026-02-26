
package net.mcreator.papercraftmagicdecoration.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.papercraftmagicdecoration.world.inventory.LobbyBoyBackpackMenu;
import net.mcreator.papercraftmagicdecoration.procedures.Dealings03Procedure;
import net.mcreator.papercraftmagicdecoration.procedures.Dealings02Procedure;
import net.mcreator.papercraftmagicdecoration.procedures.Dealings01Procedure;
import net.mcreator.papercraftmagicdecoration.procedures.Dealings00Procedure;
import net.mcreator.papercraftmagicdecoration.procedures.Dealing05Procedure;
import net.mcreator.papercraftmagicdecoration.procedures.Dealing04Procedure;
import net.mcreator.papercraftmagicdecoration.procedures.CancellationOfTransactionProcedure;
import net.mcreator.papercraftmagicdecoration.PapercraftMagicDecorationMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LobbyBoyBackpackSlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public LobbyBoyBackpackSlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public LobbyBoyBackpackSlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(LobbyBoyBackpackSlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(LobbyBoyBackpackSlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int slotID = message.slotID;
			int changeType = message.changeType;
			int meta = message.meta;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleSlotAction(entity, slotID, changeType, meta, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleSlotAction(Player entity, int slot, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = LobbyBoyBackpackMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slot == 0 && changeType == 1) {

			Dealings00Procedure.execute(entity);
		}
		if (slot == 0 && changeType == 2) {
			int amount = meta;

			Dealings00Procedure.execute(entity);
		}
		if (slot == 1 && changeType == 1) {

			Dealings01Procedure.execute(entity);
		}
		if (slot == 1 && changeType == 2) {
			int amount = meta;

			Dealings01Procedure.execute(entity);
		}
		if (slot == 2 && changeType == 1) {

			Dealings02Procedure.execute(entity);
		}
		if (slot == 2 && changeType == 2) {
			int amount = meta;

			Dealings02Procedure.execute(entity);
		}
		if (slot == 3 && changeType == 1) {

			Dealings03Procedure.execute(entity);
		}
		if (slot == 3 && changeType == 2) {
			int amount = meta;

			Dealings03Procedure.execute(entity);
		}
		if (slot == 4 && changeType == 1) {

			Dealing04Procedure.execute(entity);
		}
		if (slot == 4 && changeType == 2) {
			int amount = meta;

			Dealing04Procedure.execute(entity);
		}
		if (slot == 5 && changeType == 1) {

			Dealing05Procedure.execute(entity);
		}
		if (slot == 5 && changeType == 2) {
			int amount = meta;

			Dealing05Procedure.execute(entity);
		}
		if (slot == 6 && changeType == 0) {

			CancellationOfTransactionProcedure.execute(entity);
		}
		if (slot == 6 && changeType == 1) {

			CancellationOfTransactionProcedure.execute(entity);
		}
		if (slot == 6 && changeType == 2) {
			int amount = meta;

			CancellationOfTransactionProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PapercraftMagicDecorationMod.addNetworkMessage(LobbyBoyBackpackSlotMessage.class, LobbyBoyBackpackSlotMessage::buffer, LobbyBoyBackpackSlotMessage::new, LobbyBoyBackpackSlotMessage::handler);
	}
}
