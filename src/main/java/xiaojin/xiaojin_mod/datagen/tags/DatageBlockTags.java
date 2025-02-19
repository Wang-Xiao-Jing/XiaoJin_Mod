package xiaojin.xiaojin_mod.datagen.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

/**
 * @author 尽
 * @apiNote 方块标签数据生成器
 */
public class DatageBlockTags extends TagsProvider<Block> {
    protected DatageBlockTags(PackOutput output, ResourceKey<? extends Registry<Block>> registryKey, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId) {
        super(output, registryKey, lookupProvider, CompletableFuture.completedFuture(TagsProvider.TagLookup.empty()), modId);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

    }
}
