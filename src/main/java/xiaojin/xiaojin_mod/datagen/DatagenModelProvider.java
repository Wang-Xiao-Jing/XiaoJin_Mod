package xiaojin.xiaojin_mod.datagen;

import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;

/**
 * @author 尽
 * @apiNote 模型数据生成器
 */
public class DatagenModelProvider extends ModelProvider {
    public DatagenModelProvider(PackOutput output, String modId) {
        super(output, modId);
    }

    public DatagenModelProvider(PackOutput output) {
        super(output);
    }
}
