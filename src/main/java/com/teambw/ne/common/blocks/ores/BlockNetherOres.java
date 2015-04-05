package com.teambw.ne.common.blocks.ores;

import com.teambw.ne.api.block.BlockVariant;
import com.teambw.ne.api.block.IBlockWithVariants;
import com.teambw.ne.api.block.PropertyVariant;
import com.teambw.ne.common.init.ModTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

public class BlockNetherOres extends Block implements IBlockWithVariants
{
    public static final BlockVariant
            COAL = new BlockVariant(0, "netherore_coal"),
            GOLD = new BlockVariant(1, "netherore_gold"),
            IRON = new BlockVariant(2, "netherore_iron"),
            LAPIS = new BlockVariant(3, "netherore_lapis"),
            DIAMOND = new BlockVariant(4, "netherore_diamond"),
            EMERALD = new BlockVariant(5, "netherore_emerald"),
            REDSTONE = new BlockVariant(6, "netherore_redstone"),
            OMNIITE = new BlockVariant(7, "netherore_omniite");


    public static final PropertyVariant ORE_TYPE = PropertyVariant.create("variant", COAL, GOLD, IRON, LAPIS, DIAMOND, EMERALD, REDSTONE, OMNIITE);

    public BlockNetherOres()
    {
        super(Material.rock);
        this.setStepSound(soundTypePiston);
        this.setResistance(2.0F);
        this.setHardness(2.5F);
        this.setHarvestLevel("pickaxe", 3);

        this.setDefaultState(this.getBlockState().getBaseState().withProperty(ORE_TYPE, COAL));
        this.setCreativeTab(ModTab.MAIN);
    }

    @Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list)
    {
        for (BlockVariant type : ORE_TYPE.getAllowedValues())
        {
            list.add(new ItemStack(itemIn, 1, type.getMeta()));
        }
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        switch (((BlockVariant) state.getValue(ORE_TYPE)).getMeta())
        {
            case 0:
                return Item.getItemFromBlock(Blocks.coal_ore);
            case 1:
                return Item.getItemFromBlock(Blocks.gold_ore);
            case 2:
                return Item.getItemFromBlock(Blocks.iron_ore);
            case 3:
                return Item.getItemFromBlock(Blocks.lapis_ore);
            case 4:
                return Item.getItemFromBlock(Blocks.diamond_ore);
            case 5:
                return Item.getItemFromBlock(Blocks.emerald_ore);
            case 6:
                return Item.getItemFromBlock(Blocks.redstone_ore);
            case 7:
                return Item.getItemFromBlock(Blocks.bedrock);
        }

        return Items.coal;
    }

    @Override
    public int quantityDropped(Random random)
    {
        return 2 + random.nextInt(3);
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(ORE_TYPE, ORE_TYPE.getVariantFromMeta(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((BlockVariant) state.getValue(ORE_TYPE)).getMeta();
    }

    @Override
    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] { ORE_TYPE });
    }

    @Override
    public String getVariantNameFromStack(ItemStack stack)
    {
        return ORE_TYPE.getVariantFromMeta(stack.getMetadata()).getName();
    }
}