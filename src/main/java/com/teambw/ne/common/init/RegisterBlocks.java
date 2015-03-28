package com.teambw.ne.common.init;

import com.teambw.ne.common.blocks.test.BlockTest;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

public class RegisterBlocks {

    public static BlockTest blockTest;

    public static void init() {
        blockTest = new BlockTest(Material.ground);
        GameRegistry.registerBlock(blockTest, "blockTest");
    }
}
