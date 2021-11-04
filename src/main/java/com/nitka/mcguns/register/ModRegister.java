package com.nitka.mcguns.register;

import com.nitka.mcguns.mod.GUI.WeaponWorkbenchContainer;

import com.nitka.mcguns.mod.ModTab;
import com.nitka.mcguns.mod.blocks.WeaponWorkbenchBlock;
import com.nitka.mcguns.mod.items.basic.ObjectModelItem;
import com.nitka.mcguns.mod.items.parts.m4a4s.M4A4s_Base;
import com.nitka.mcguns.mod.items.weapons.Glock15;
import com.nitka.mcguns.mod.items.weapons.M4A4s;
import net.minecraft.block.Block;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraftforge.common.extensions.IForgeContainerType;
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
    //Регистратор для предметов
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, "mcguns");

    //Регистратор для блоков
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, "mcguns");

    //public static final RegistryObject<Item> m4a4s = ITEMS.register("m4a4s",() -> new M4A4s());
    //public static final RegistryObject<Item> glock15 = ITEMS.register("glock15",() -> new Weapon());

    public static HashMap<String, RegistryObject<Item>> modItems = new HashMap<>();
    public static HashMap<String, RegistryObject<Block>> modBlocks = new HashMap<>();

    public static class TABS {
        public static ModTab WEAPON = new ModTab("weapons");
        public static ModTab OTHER  = new ModTab("other");
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }

    public static void init(IEventBus eventBus){
        ModRegister.register(eventBus);

        modItems.put("weapon_hand",ITEMS.register("weapon_hand", ObjectModelItem::new));
        modItems.put("m4a4s_firstperson",ITEMS.register("m4a4s_firstperson", ObjectModelItem::new));

        modItems.put("m4a4s_base",ITEMS.register("m4a4s_base", M4A4s_Base::new));


        modItems.put("m4a4s",ITEMS.register("m4a4s", M4A4s::new));
        modItems.put("glock15",ITEMS.register("glock15", Glock15::new));

        modBlocks.put("weapon_workbench",BLOCKS.register("weapon_workbench",WeaponWorkbenchBlock::new));
    }

    @SubscribeEvent
    public static void onBlockRegistry(final RegistryEvent.Register<Block> blockRegistryEvent){

    }

    @SubscribeEvent
    public static void onItemRegistry(final RegistryEvent.Register<Item> itemRegistryEvent){

    }

    @SubscribeEvent
    public static void onContainerRegistry(RegistryEvent.Register<ContainerType<?>> event){
        //event.getRegistry().register(IForgeContainerType.create((windowId, inv, data) -> new WeaponWorkbenchContainer(windowId)));
    }
}
