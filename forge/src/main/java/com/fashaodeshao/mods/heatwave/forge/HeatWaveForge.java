package com.fashaodeshao.mods.heatwave.forge;

import dev.architectury.platform.forge.EventBuses;
import com.fashaodeshao.mods.heatwave.HeatWave;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HeatWave.MOD_ID)
public class HeatWaveForge {
    public HeatWaveForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(HeatWave.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        HeatWave.init();
    }
}