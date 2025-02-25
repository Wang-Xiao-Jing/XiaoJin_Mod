package xiaojin.xiaojin_mod.create;

import net.neoforged.neoforge.registries.DeferredRegister;
import xiaojin.xiaojin_mod.create.template.ModBlock;

import static xiaojin.xiaojin_mod.XiaojinModMain.*;

/**
 * @apiNote 创建方块
 * @author 尽
 */
public class CreateBlock {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    public static final ModBlock EXAMPLE_BLOCK = new ModBlock("example_block");
}
