package xiaojin.xiaojin_mod;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import xiaojin.xiaojin_mod.create.CreateBlock;
import xiaojin.xiaojin_mod.create.CreateCreationModeTab;
import xiaojin.xiaojin_mod.create.CreateItem;

import java.util.Locale;

@Mod(XiaojinModMain.MOD_ID)
public class XiaojinModMain
{
    public static final String MOD_ID = "xiaojin_mod";

    public XiaojinModMain(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(CreateCreationModeTab::registerCapabilities);
//        modEventBus.addListener(Datagen::gatherData);

        CreateBlock.BLOCKS.register(modEventBus);
        CreateItem.ITEMS.register(modEventBus);
        CreateCreationModeTab.CREATIVE_MODE_TABS.register(modEventBus);
    }

    /**
     * <p>生成获取资源路径</p>
     * <br/>
     * 取自ironchest项目 源代码仓库：<a href="https://github.com/progwml6/ironchest">ironchest</a>
     * <br/>
     * 经过修改 源代码许可证：GPL-3.0
     * @param name 资源名称
     * @return {@link ResourceLocation} 资源路径
     * */
    public static ResourceLocation prefix(String name) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, name.toLowerCase(Locale.ROOT));
    }
}
