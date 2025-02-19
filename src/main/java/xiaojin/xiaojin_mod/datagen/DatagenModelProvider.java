package xiaojin.xiaojin_mod.datagen;

import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;

import static xiaojin.xiaojin_mod.XiaojinModMain.MOD_ID;

/**
 * @author 尽
 * @apiNote 模型数据生成器
 */
public class DatagenModelProvider extends ModelProvider {
    public DatagenModelProvider(PackOutput output) {
        super(output, MOD_ID);
    }
}
