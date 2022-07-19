
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package expor.slice.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import expor.slice.enchantment.PropelEnchantment;
import expor.slice.enchantment.HeatMetalEnchantment;
import expor.slice.Expor2Mod;

public class Expor2ModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Expor2Mod.MODID);
	public static final RegistryObject<Enchantment> HEAT_METAL = REGISTRY.register("heat_metal", () -> new HeatMetalEnchantment());
	public static final RegistryObject<Enchantment> PROPEL = REGISTRY.register("propel", () -> new PropelEnchantment());
}
