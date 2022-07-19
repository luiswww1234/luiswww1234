
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package expor.slice.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import expor.slice.item.MissingSwordItem;
import expor.slice.Expor2Mod;

public class Expor2ModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Expor2Mod.MODID);
	public static final RegistryObject<Item> MISSING_TEXTURE_BLOCK = block(Expor2ModBlocks.MISSING_TEXTURE_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MISSING_SWORD = REGISTRY.register("missing_sword", () -> new MissingSwordItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
