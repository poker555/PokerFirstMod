package com.PokerMod.pokerfirstmod.item;

import com.PokerMod.pokerfirstmod.Mymod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mymod.MOD_ID);

    public static final RegistryObject<Item> SILVER = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
         ITEMS.register(eventBus); 
    }
}
