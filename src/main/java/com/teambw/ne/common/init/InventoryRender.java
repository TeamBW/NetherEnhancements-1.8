package com.teambw.ne.common.init;

import com.teambw.ne.common.util.Info;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class InventoryRender {
    public static void init() {
        //Blocks
        InventoryBlockRender(RegisterBlocks.blockTest, "testBlock");
        InventoryBlockRender(RegisterBlocks.blockNetherCoal, "netherCoalOre");

        //Items
        InventoryItemRender(RegisterItems.itemTest, "testItem");
    }
    public static void InventoryBlockRender(Block block, String blockName) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Info.ID + ":" + blockName, "inventory"));
    }

    public static void InventoryItemRender(Item item, String itemName) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Info.ID + ":" + itemName, "inventory"));
    }
}
