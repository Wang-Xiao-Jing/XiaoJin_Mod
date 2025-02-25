package xiaojin.xiaojin_mod.datagen.loot;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.server.ReloadableServerRegistries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import xiaojin.xiaojin_mod.create.CreateBlock;

import java.util.Set;

/**
 * @author 尽
 * @apiNote 创建方块的战利品表
 */
public class DatagenBlockLootTableProvider extends BlockLootSubProvider {
    public DatagenBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(CreateBlock.EXAMPLE_BLOCK.getBlock());
    }

    /**
     * 获取所有方块
     * @return
     */
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return CreateBlock.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
