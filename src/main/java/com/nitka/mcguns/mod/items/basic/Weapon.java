package com.nitka.mcguns.mod.items.basic;

import com.nitka.mcguns.register.ModRegister;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Weapon extends Item {
    public Weapon() {
        super(
                new Item.Properties()
                .tab(ItemGroup.TAB_COMBAT)
                .durability(2)
        );
    }
}
