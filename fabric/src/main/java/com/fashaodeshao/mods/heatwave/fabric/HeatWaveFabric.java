package com.fashaodeshao.mods.heatwave.fabric;

import com.fashaodeshao.mods.heatwave.HeatWave;
import net.fabricmc.api.ModInitializer;

public class HeatWaveFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        HeatWave.init();
    }
}