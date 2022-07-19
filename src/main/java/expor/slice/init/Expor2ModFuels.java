
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package expor.slice.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.level.block.Blocks;

@Mod.EventBusSubscriber
public class Expor2ModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == Blocks.MAGMA_BLOCK.asItem())
			event.setBurnTime(19200);
	}
}
