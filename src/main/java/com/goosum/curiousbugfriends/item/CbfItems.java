package com.goosum.curiousbugfriends.item;


import com.goosum.curiousbugfriends.CuriousBugFriends;
import com.goosum.curiousbugfriends.entity.CbfEntityTypes;
import com.goosum.curiousbugfriends.item.custom.BeetleFriendshipToken;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CbfItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CuriousBugFriends.MOD_ID);

    public static final RegistryObject<Item> BEETLE_SPAWN_EGG = ITEMS.register("beetle_spawn_egg",
            () -> new ForgeSpawnEggItem(CbfEntityTypes.BEETLE, 0x1a0204, 0xab0513,
                    new Item.Properties().tab(CbfCreativeModeTab.CBF_TAB).stacksTo(64)));
    public static final RegistryObject<Item> BEETLE_FRIENDSHIP_TOKEN = ITEMS.register("beetle_friendship_token",
            () -> new BeetleFriendshipToken(new Item.Properties().tab(CbfCreativeModeTab.CBF_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
