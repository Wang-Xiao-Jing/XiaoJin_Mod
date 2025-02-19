package xiaojin.xiaojin_mod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import xiaojin.xiaojin_mod.create.CreateBlock;
import xiaojin.xiaojin_mod.create.CreateCreationModeTab;
import xiaojin.xiaojin_mod.create.CreateItem;

@Mod(XiaojinModMain.MOD_ID)
public class XiaojinModMain
{
    public static final String MOD_ID = "xiaojin_mod";

    public XiaojinModMain(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(CreateCreationModeTab::registerCapabilities);
//        modEventBus.addListener(Datage::gatherData);

        CreateBlock.BLOCKS.register(modEventBus);
        CreateItem.ITEMS.register(modEventBus);
        CreateCreationModeTab.CREATIVE_MODE_TABS.register(modEventBus);
    }
}
