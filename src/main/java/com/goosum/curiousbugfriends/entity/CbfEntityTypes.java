package com.goosum.curiousbugfriends.entity;

import com.goosum.curiousbugfriends.CuriousBugFriends;
import com.goosum.curiousbugfriends.entity.custom.BeetleEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class CbfEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CuriousBugFriends.MOD_ID);

    public static final RegistryObject<EntityType<BeetleEntity>> BEETLE =
            ENTITY_TYPES.register("beetle",
                    () -> EntityType.Builder.of(BeetleEntity::new, MobCategory.MISC)
                            .sized(0.8f, 0.7f)
                            .build(new ResourceLocation(CuriousBugFriends.MOD_ID, "beetle").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
