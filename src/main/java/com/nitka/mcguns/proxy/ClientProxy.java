package com.nitka.mcguns.proxy;

import com.nitka.mcguns.register.ModRegister;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


public class ClientProxy {
    public static void init(final FMLClientSetupEvent e){
        System.out.println("Привет из клиента");

        ModRegister.TABS.WEAPON.setIcon(ModRegister.modItems.get("m4a4s").get());
        ModRegister.TABS.OTHER.setIcon(ModRegister.modItems.get("glock15").get());
    }
}
