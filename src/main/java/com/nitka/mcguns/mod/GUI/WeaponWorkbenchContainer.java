package com.nitka.mcguns.mod.GUI;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.nitka.mcguns.mod.items.weapons.M4A4s;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;

public class WeaponWorkbenchContainer extends Container {
    public WeaponWorkbenchContainer(int p_i50105_2_) {
        super(null, p_i50105_2_);
    }

    @Override
    public boolean stillValid(PlayerEntity p_75145_1_) {
        return false;
    }

    @Override
    public ItemStack clicked(int p_184996_1_, int p_184996_2_, ClickType p_184996_3_, PlayerEntity p_184996_4_) {
        System.out.println(p_184996_1_ + " " + p_184996_2_);

        return new ItemStack(M4A4s::new);
    }
}