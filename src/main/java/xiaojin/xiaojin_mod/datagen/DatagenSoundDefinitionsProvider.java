package xiaojin.xiaojin_mod.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;

/**
 * @author 尽
 * @apiNote 音频数据生成器
 */
public class DatagenSoundDefinitionsProvider extends SoundDefinitionsProvider {
    /**
     * Creates a new instance of this data provider.
     *
     * @param output The {@linkplain PackOutput} instance provided by the data generator.
     * @param modId  The mod ID of the current mod.
     */
    protected DatagenSoundDefinitionsProvider(PackOutput output, String modId) {
        super(output, modId);
    }

    /**
     * Registers the sound definitions that should be generated via one of the {@code add} methods.
     */
    @Override
    public void registerSounds() {

    }
}
