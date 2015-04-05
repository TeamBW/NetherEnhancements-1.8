package com.teambw.ne.api.block;

import net.minecraft.item.ItemStack;

public interface IBlockWithVariants
{
    String getVariantNameFromStack(ItemStack stack);
}