package com.teambw.ne.common.init;

import com.teambw.ne.common.blocks.ores.BlockNetherCoal;
import com.teambw.ne.common.blocks.test.BlockTest;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterBlocks {

    public static BlockTest blockTest;

    //Nether Ores
    public static BlockNetherCoal blockNetherCoal;

    public static void init() {
        blockTest = new BlockTest(Material.ground);
        GameRegistry.registerBlock(blockTest, "blockTest");

        //Nether Ores
        blockNetherCoal = new BlockNetherCoal(Material.rock);
        GameRegistry.registerBlock(blockNetherCoal, "blockNetherCoal");
    }
}
