package com.gmail.user0abc.wildkings.mob.render;

import com.gmail.user0abc.wildkings.mob.EntityLlamaKing;
import com.gmail.user0abc.wildkings.mob.model.ModelLlamaKing;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

/**
 * @author Sergii Ivanov
 */
public class RenderLlamaKing extends RenderLiving<EntityLlamaKing> {

    private static final ResourceLocation texture = new ResourceLocation("textures/entity/llama/llama.png");

    public RenderLlamaKing(RenderManager renderManager) {
        super(renderManager, new ModelLlamaKing(2, 1f), 1.0f);
    }

    public static IRenderFactory<EntityLlamaKing> getRenderFactory() {
        return new IRenderFactory<EntityLlamaKing>() {
            @Override
            public Render createRenderFor(RenderManager manager) {
                return new RenderLlamaKing(manager);
            }
        };
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityLlamaKing entity) {
        return texture;
    }
}
