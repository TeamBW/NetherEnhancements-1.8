package com.teambw.ne.common.blocks.ores;

import com.teambw.ne.common.init.ModTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockNetherLapis extends Block {
    public BlockNetherLapis(Material material) {
        super(material);
        this.setStepSound(soundTypePiston);
        this.setResistance(2.0F);
        this.setHardness(2.5F);
        this.setHarvestLevel("pickaxe", 3);
        this.setCreativeTab(ModTab.MAIN);
    }
    public Item getItemDropped(int metaData, Random random, int fortune)
    {
        return Item.getItemFromBlock(Blocks.lapis_ore);
    }

    @Override
    public int quantityDropped(Random random)
    {
        return 1 + random.nextInt(2);
    }
}
