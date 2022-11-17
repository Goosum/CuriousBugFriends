package com.goosum.curiousbugfriends.entity.client;

import com.goosum.curiousbugfriends.CuriousBugFriends;
import com.goosum.curiousbugfriends.entity.custom.BeetleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BeetleModel extends AnimatedGeoModel<BeetleEntity> {
    @Override
    public ResourceLocation getModelResource(BeetleEntity object) {
        return new ResourceLocation(CuriousBugFriends.MOD_ID, "geo/beetle.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BeetleEntity object) {
        return new ResourceLocation(CuriousBugFriends.MOD_ID, "textures/entity/beetle_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BeetleEntity animatable) {
        return new ResourceLocation(CuriousBugFriends.MOD_ID, "animations/beetle.animation.json");
    }
}
