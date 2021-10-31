package com.nitka.mcguns.proxy;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerAboutToStartEvent;

@Mod.EventBusSubscriber(value = Dist.DEDICATED_SERVER)
public class ServerProxy {
    @SubscribeEvent
    public static void init(final FMLServerAboutToStartEvent e){
        System.out.println("Привет из сервера");
    }
}
