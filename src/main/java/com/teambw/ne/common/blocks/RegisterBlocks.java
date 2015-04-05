package com.teambw.ne.common.blocks;

import com.teambw.ne.common.blocks.ores.*;
import com.teambw.ne.api.item.ItemBlockVariants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.teambw.ne.client.renderer.ModelVariant;
import com.teambw.ne.common.NetherEnhancements;
import com.teambw.ne.common.blocks.test.BlockTest;

public class RegisterBlocks
{
    public Block blockTest;

    public BlockNetherOres netherOres;

    public void preInit()
    {
        blockTest = this.registerBlock("blockTest", ItemBlock.class, new BlockTest(Material.ground));
        netherOres = this.registerBlock("netherOres", ItemBlockVariants.class, new BlockNetherOres());
    }

    private <T extends Block> T registerBlock(String name, Class<? extends ItemBlock> itemblock, T block)
    {
        block.setUnlocalizedName(name);
        GameRegistry.registerBlock(block, itemblock, name);

        return block;
    }

    public void init()
    {
        if (NetherEnhancements.proxy.getModels() != null)
        {
            ModelVariant models = NetherEnhancements.proxy.getModels();

            models.registerItemRenderer(blockTest, 0);
            models.registerItemRenderer(netherOres, BlockNetherOres.ORE_TYPE.getAllowedValues());
        }
    }
}
