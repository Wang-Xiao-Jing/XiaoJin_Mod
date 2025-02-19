package xiaojin.xiaojin_mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import xiaojin.xiaojin_mod.datagen.loot.DatagenBlockLootTableProvider;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static xiaojin.xiaojin_mod.XiaojinModMain.MOD_ID;

/**
 * @author 尽
 * @apiNote 数据生成
 */
@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = MOD_ID)
public class Datage{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(DatagenLanguageProvider::new);
        event.createProvider(DatagenModelProvider::new);
        event.createProvider(DatagenParticleDescriptionProvider::new);
        event.createProvider(DatagenSoundDefinitionsProvider::new);
        DataGenerator gen = event.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        gen.addProvider(true, new DatagenAdvancementProvider(packOutput, lookupProvider, List.of()));
//        gen.addProvider(event.includeReports(),
//                new LootTableProvider(packOutput, Collections.emptySet(),
//                        List.of(new LootTableProvider.SubProviderEntry(DatagenBlockLootTableProvider::new, LootContextParamSets.BLOCK)),
//                        lookupProvider));
    }
}
