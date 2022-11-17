package com.goosum.curiousbugfriends.block.entity;

import com.goosum.curiousbugfriends.CuriousBugFriends;
import com.goosum.curiousbugfriends.block.CbfBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CbfBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CuriousBugFriends.MOD_ID);

    public static final RegistryObject<BlockEntityType<ArtificialNestBlockEntity>> ARTIFICIAL_NEST =
            BLOCK_ENTITIES.register("artificial_nest", () ->
                    BlockEntityType.Builder.of(ArtificialNestBlockEntity::new,
                            CbfBlocks.ARTIFICIAL_NEST.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
