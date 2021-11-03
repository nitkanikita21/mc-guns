package com.nitka.mcguns.mod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModTab extends ItemGroup {
    protected Item icon;

    public ModTab(String label) {
        super(label);
    }

    public void setIcon(Item icon) {
        this.icon = icon;
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(icon);
    }
}
