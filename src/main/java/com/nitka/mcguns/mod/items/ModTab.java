package com.nitka.mcguns.mod.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModTab extends ItemGroup {
    protected ItemStack icon;

    public ModTab(String label, ItemStack icon) {
        super(label);
        this.icon = icon;
    }

    @Override
    public ItemStack makeIcon() {
        return icon;
    }
}
