package com.nitka.mcguns.event;

import net.minecraft.util.ActionResultType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class InteractEvents {
    @SubscribeEvent
    public static void onInteract(PlayerInteractEvent.LeftClickEmpty event){
        System.out.println("LEFT CLICK ITEM");

    }

}
