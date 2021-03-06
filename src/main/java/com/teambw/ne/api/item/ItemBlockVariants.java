package com.teambw.ne.api.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import com.teambw.ne.api.block.IBlockWithVariants;

public class ItemBlockVariants extends ItemBlock
{
    private final IBlockWithVariants variantBlock;

    public ItemBlockVariants(Block block)
    {
        super(block);

        this.variantBlock = (IBlockWithVariants) block;
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damage)
    {
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return super.getUnlocalizedName() + "." + this.variantBlock.getVariantNameFromStack(stack);
    }

}