package com.nitka.mcguns.proxy;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class ClientProxy {
    @SubscribeEvent
    public static void init(final FMLClientSetupEvent e){
        System.out.println("Привет из клиента");
    }
}
