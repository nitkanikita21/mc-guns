package com.nitka.mcguns;

import com.nitka.mcguns.mod.items.basic.Weapon;
import com.nitka.mcguns.mod.items.weapons.M4A4s;
import com.nitka.mcguns.proxy.ClientProxy;
import com.nitka.mcguns.proxy.CommonProxy;
import com.nitka.mcguns.proxy.ServerProxy;
import com.nitka.mcguns.register.ModRegister;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("mcguns")
public class McGuns
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();


    public McGuns() {
        // Регистрируем в модлоадере листенеры
        IEventBus BUS = FMLJavaModLoadingContext.get().getModEventBus();
        BUS.addListener(this::enqueueIMC);
        BUS.addListener(this::processIMC);

        // Регистрируем в евент бус этот класс как слушатель евентов
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(CommonProxy.class);
        MinecraftForge.EVENT_BUS.register(ClientProxy.class);
        MinecraftForge.EVENT_BUS.register(ServerProxy.class);

        ModRegister.init();

        ModRegister.register(BUS);
        ModRegister.registerItem("m4a4s",new Weapon());

    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // сообщение по IMC от нас к другому моду
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // сообщение по IMC к нам
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
}
