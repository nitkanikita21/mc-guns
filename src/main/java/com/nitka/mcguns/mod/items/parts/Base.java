package com.nitka.mcguns.mod.items.parts;

import com.nitka.mcguns.register.ModRegister;
import com.nitka.mcguns.render.CustomHandRender;
import net.minecraft.item.Item;

public class Base extends Item {

    public Base() {
        super(
                new Item.Properties().setNoRepair()
        );
    }
}
