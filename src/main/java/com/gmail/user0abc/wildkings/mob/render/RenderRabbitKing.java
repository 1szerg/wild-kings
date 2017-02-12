package com.gmail.user0abc.wildkings.mob.render;

import com.gmail.user0abc.wildkings.mob.EntityRabbitKing;
import com.gmail.user0abc.wildkings.mob.model.ModelRabbitKing;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

/**
 * @author Sergii Ivanov
 */
public class RenderRabbitKing extends RenderLiving<EntityRabbitKing> {

    private static final ResourceLocation texture = new ResourceLocation("textures/entity/rabbit/black.png");

    public RenderRabbitKing(RenderManager renderManager) {
        super(renderManager, new ModelRabbitKing(), 1.0f);
    }

    public static IRenderFactory<EntityRabbitKing> getRenderFactory() {
        return new IRenderFactory<EntityRabbitKing>() {
            @Override
            public Render createRenderFor(RenderManager manager) {
                return new RenderRabbitKing(manager);
            }
        };
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityRabbitKing entity) {
        return texture;
    }
}
