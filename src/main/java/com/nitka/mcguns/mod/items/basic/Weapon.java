package com.nitka.mcguns.mod.items.basic;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.nitka.mcguns.register.ModRegister;
import com.nitka.mcguns.render.CustomHandRender;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Weapon extends Item {
    public Weapon() {
        super(
                new Item.Properties()
                .tab(ModRegister.TABS.WEAPON)
                .durability(2)
                .setISTER(() -> CustomHandRender::new)
        );
    }
    public Weapon(Properties properties) {
        super(
                properties
        );
    }
}
