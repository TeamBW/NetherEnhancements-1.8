package com.teambw.ne.common.blocks;

import com.teambw.ne.common.init.ModTab;
import com.teambw.ne.common.util.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class ModBlock extends Block {
    public ModBlock(Material material) {
        super(material);
        this.setCreativeTab(ModTab.MAIN);
    }
    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
}
