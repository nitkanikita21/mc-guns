package com.nitka.mcguns.mod.items.parts;

import com.nitka.mcguns.register.ModRegister;
import com.nitka.mcguns.render.CustomHandRender;
import net.minecraft.item.Item;

public class Part extends Item {
    public Part() {
        super(
                new Item.Properties().setNoRepair()
        );
    }
}
