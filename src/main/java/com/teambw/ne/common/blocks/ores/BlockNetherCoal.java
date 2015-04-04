package com.teambw.ne.common.blocks.ores;

import com.teambw.ne.common.blocks.ModBlock;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockNetherCoal extends ModBlock {
    public BlockNetherCoal(Material material) {
        super(material);
        this.setUnlocalizedName("netherCoalOre");
        this.setStepSound(soundTypePiston);
        this.setResistance(2.0F);
        this.setHardness(2.5F);
        this.setHarvestLevel("pickaxe", 3);
    }
    public Item getItemDropped(int metaData, Random random, int fortune) {
        return Items.coal;
    }
    public  int quantityDropped(Random random) {
        return 1 + random.nextInt(2);
    }
}
