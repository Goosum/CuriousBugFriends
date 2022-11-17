package com.goosum.curiousbugfriends.entity.client;

import com.goosum.curiousbugfriends.CuriousBugFriends;
import com.goosum.curiousbugfriends.entity.custom.BeetleEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BeetleRenderer extends GeoEntityRenderer<BeetleEntity> {

    public BeetleRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BeetleModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(BeetleEntity instance) {
        return new ResourceLocation(CuriousBugFriends.MOD_ID, "textures/entity/beetle_texture.png");
    }

    @Override
    public RenderType getRenderType(BeetleEntity animatable, float partialTick, PoseStack poseStack,
                                    @Nullable MultiBufferSource bufferSource,
                                    @Nullable VertexConsumer buffer,
                                    int packedLight, ResourceLocation texture) {
        poseStack.scale(2.3f, 2.3f,2.3f);
        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
