package com.teambw.ne.common.items;

import com.teambw.ne.common.init.ArmorMaterials;
import com.teambw.ne.common.init.ToolMaterials;
import com.teambw.ne.common.items.armor.netherbrick.ArmorNetherBrick;
import com.teambw.ne.common.items.tools.netherbrick.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.teambw.ne.client.renderer.ModelVariant;
import com.teambw.ne.common.NetherEnhancements;
import com.teambw.ne.common.items.test.ItemTest;

public class RegisterItems
{
	public Item itemTest;

    public ItemSword toolNetherBrickSword;

    public ItemPickaxe toolNetherBrickPickaxe;

    public ItemSpade toolNetherBrickShovel;

    public ItemAxe toolNetherBrickAxe;

    public ItemHoe toolNetherBrickHoe;

    public static ItemArmor armorNetherBrick;

	public void preInit()
	{
		this.itemTest = this.registerItem("itemTest", new ItemTest());

        //Tools
        this.toolNetherBrickSword = this.registerItem("toolNetherBrickSword", new ToolNetherBrickSword(ToolMaterials.NETHER_BRICK));
        this.toolNetherBrickPickaxe = this.registerItem("toolNetherBrickPickaxe", new ToolNetherBrickPickaxe(ToolMaterials.NETHER_BRICK));
        this.toolNetherBrickShovel = this.registerItem("toolNetherBrickShovel", new ToolNetherBrickShovel(ToolMaterials.NETHER_BRICK));
        this.toolNetherBrickAxe = this.registerItem("toolNetherBrickAxe", new ToolNetherBrickAxe(ToolMaterials.NETHER_BRICK));
        this.toolNetherBrickHoe = this.registerItem("toolNetherBrickHoe", new ToolNetherBrickHoe(ToolMaterials.NETHER_BRICK));

        //Armor
        //this.armorNetherBrick = this.registerItem("armorNetherBrick", new ArmorNetherBrick(ArmorMaterials.NETHER_BRICK, 0, 0));
	}

	private <T extends Item> T registerItem(String name, T item) {
		item.setUnlocalizedName(name);
		GameRegistry.registerItem(item, name);

		return item;
	}

	public void init() {
		if (NetherEnhancements.proxy.getModels() != null) {
			ModelVariant models = NetherEnhancements.proxy.getModels();

			models.registerItemRenderer(this.itemTest, 0);

            //Tools
            models.registerItemRenderer(this.toolNetherBrickSword, 0);
            models.registerItemRenderer(this.toolNetherBrickPickaxe, 0);
            models.registerItemRenderer(this.toolNetherBrickShovel, 0);
            models.registerItemRenderer(this.toolNetherBrickAxe, 0);
            models.registerItemRenderer(this.toolNetherBrickHoe, 0);
		}
	}
}
