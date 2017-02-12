package com.gmail.user0abc.wildkings.mob.render;

import com.gmail.user0abc.wildkings.mob.EntityPigKing;
import com.gmail.user0abc.wildkings.mob.model.ModelPigKing;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

/**
 * @author Sergii Ivanov
 */
public class RenderPigKing extends RenderLiving<EntityPigKing> {

    private static final ResourceLocation texture = new ResourceLocation("textures/entity/pig/pig.png");

    public RenderPigKing(RenderManager renderManager) {
        super(renderManager, new ModelPigKing(), 1.0f);
    }

    public static IRenderFactory<EntityPigKing> getRenderFactory() {
        return new IRenderFactory<EntityPigKing>() {
            @Override
            public Render createRenderFor(RenderManager manager) {
                return new RenderPigKing(manager);
            }
        };
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityPigKing entity) {
        return texture;
    }
}
