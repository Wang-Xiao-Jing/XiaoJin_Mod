package xiaojin.xiaojin_mod.datagen.language_provider;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredHolder;

import static xiaojin.xiaojin_mod.XiaojinModMain.MOD_ID;

/**
 * @author 尽
 * @apiNote 本地化数据生成器
 */
public class DatagenZhCn extends LanguageProvider {
    public DatagenZhCn(PackOutput output, String locale) {
        super(output, MOD_ID, "zh_CN");
    }

    @Override
    protected void addTranslations() {

    }

    public void add(DeferredHolder itemGroup, String name){
        add(itemGroup.getRegisteredName(), name);
    }
}
