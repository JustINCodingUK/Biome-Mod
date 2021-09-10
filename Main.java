package com.hastev.biomes;


import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod("tutorial")
@Mod.EventBusSubscriber(modid="tutorial", bus=Bus.MOD)
public class Main {
     
	public static final RegistryKey<Biome> stony = RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("tutorial", "tutorial_biome"));
	
	@SubscribeEvent
	public void commonSetup(FMLCommonSetupEvent e) {
		e.enqueueWork(() -> {
			BiomeManager.addAdditionalOverworldBiomes(stony);
		}
		);
	}
	
}
