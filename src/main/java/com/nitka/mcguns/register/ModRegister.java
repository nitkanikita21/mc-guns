package com.nitka.mcguns.register;

import com.nitka.mcguns.mod.items.ModTab;
import com.nitka.mcguns.mod.items.basic.Weapon;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRegister {


    private static HashMap<String,RegistryObject<Item>> modItems = new HashMap<>();
    private static HashMap<String,RegistryObject<Block>> modBlocks = new HashMap<>();

    //Регистратор для предметов
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, "mcguns");

    //Регистратор для блоков
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, "mcguns");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }

    //Зарегать предмет
    public static void registerItem(String id,Item item){
        modItems.put(id,ITEMS.register(id,() -> item));
    }

    //Зарегать блок
    public static void registerBlock(String id,Block block){
        modBlocks.put(id,BLOCKS.register(id,() -> block));
    }

    public static void init(){

    }

    @SubscribeEvent
    public static void onBlockRegistry(final RegistryEvent.Register<Block> blockRegistryEvent){

    }

    @SubscribeEvent
    public static void onItemRegistry(final RegistryEvent.Register<Item> itemRegistryEvent){

    }
}
