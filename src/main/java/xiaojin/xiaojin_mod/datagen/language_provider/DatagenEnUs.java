package xiaojin.xiaojin_mod.datagen.language_provider;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

import static xiaojin.xiaojin_mod.XiaojinModMain.MOD_ID;

/**
 * @author 尽
 * @apiNote 本地化数据生成器
 */
public class DatagenEnUs extends LanguageProvider {
    public DatagenEnUs(PackOutput output, String locale) {
        super(output, MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.xiaojin_mod_building_blocks","");

        addItem();
        addBlock();
    }
}
