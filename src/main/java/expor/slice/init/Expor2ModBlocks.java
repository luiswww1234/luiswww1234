
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package expor.slice.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import expor.slice.block.MissingTextureBlockBlock;
import expor.slice.Expor2Mod;

public class Expor2ModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Expor2Mod.MODID);
	public static final RegistryObject<Block> MISSING_TEXTURE_BLOCK = REGISTRY.register("missing_texture_block",
			() -> new MissingTextureBlockBlock());
}
