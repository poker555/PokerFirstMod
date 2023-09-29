package com.PokerMod.pokerfirstmod.item;

import com.PokerMod.pokerfirstmod.Mymod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Mymod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab INDUSTRY_TAB;
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        INDUSTRY_TAB = event.registerCreativeModeTab(new ResourceLocation(Mymod.MOD_ID,"industry_tab")
        , builder -> builder.icon(() -> new ItemStack(ModItems.SILVER.get())).title(Component.translatable("creativemodetab.industry_tab")));
    }
}
