package com.PokerMod.pokerfirstmod.item;

import com.PokerMod.pokerfirstmod.Mymod;
import net.minecraft.core.Holder;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mymod.MOD_ID);

    public static final RegistryObject<Item> SILVER = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final Tier SILVERTIER = new ForgeTier(
            2,
            600,
            2f,
            2,
            350,
            null,
            () -> Ingredient.EMPTY
    );


    public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword", () -> new SwordItem(SILVERTIER, 2, 1, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}



