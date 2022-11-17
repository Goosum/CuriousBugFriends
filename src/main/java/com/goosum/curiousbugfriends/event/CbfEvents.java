package com.goosum.curiousbugfriends.event;

import com.goosum.curiousbugfriends.CuriousBugFriends;
import com.goosum.curiousbugfriends.entity.CbfEntityTypes;
import com.goosum.curiousbugfriends.entity.custom.BeetleEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class CbfEvents {
    @Mod.EventBusSubscriber(modid = CuriousBugFriends.MOD_ID)
    public static class ForgeEvents {
        @Mod.EventBusSubscriber(modid = CuriousBugFriends.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
        public static class ModEventBusEvents {
            @SubscribeEvent
            public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
                event.put(CbfEntityTypes.BEETLE.get(), BeetleEntity.setAttributes());
            }
        }


    }
}
