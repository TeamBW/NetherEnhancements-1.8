package com.teambw.ne.common.items.armor.netherbrick;

import com.teambw.ne.common.items.RegisterItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ArmorNetherBrick extends ItemArmor {
    public ArmorNetherBrick(ArmorMaterial armorMaterial, int renderIndex, int type) {
        super(armorMaterial, renderIndex, type);
    }
    //TODO Finish NetherBrick Armor
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(RegisterItems.armorNetherBrick)) {
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 40));
        }
    }
}
