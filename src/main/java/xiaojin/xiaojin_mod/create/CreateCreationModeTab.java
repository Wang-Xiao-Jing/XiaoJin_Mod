package xiaojin.xiaojin_mod.create;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static xiaojin.xiaojin_mod.XiaojinModMain.MOD_ID;
import static xiaojin.xiaojin_mod.create.CreateItem.EXAMPLE_ITEM;

/**
 * @author 尽
 * @apiNote
 */
public class CreateCreationModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("building_blocks", () -> CreativeModeTab.builder()
        .title(Component.translatable("itemGroup.xiaojin_mod_building_blocks"))
        .withTabsBefore(CreativeModeTabs.COMBAT)
        .icon(() -> EXAMPLE_ITEM.get().getDefaultInstance())
        .displayItems((parameters, output) -> {
            output.accept(EXAMPLE_ITEM.get());
        }).build());
}
