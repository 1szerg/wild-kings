package com.gmail.user0abc.wildkings.mob.render;

import com.gmail.user0abc.wildkings.mob.EntityBatKing;
import com.gmail.user0abc.wildkings.mob.model.ModelBatKing;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

/**
 * @author Sergii Ivanov
 */
public class RenderBatKing extends RenderLiving<EntityBatKing> {

    private static final ResourceLocation texture = new ResourceLocation("entity/bat.png");

    public RenderBatKing(RenderManager renderManager) {
        super(renderManager, new ModelBatKing(), 1.0f);
    }

    public static IRenderFactory<EntityBatKing> getRenderFactory() {
        return new IRenderFactory<EntityBatKing>() {
            @Override
            public Render createRenderFor(RenderManager manager) {
                return new RenderBatKing(manager);
            }
        };
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityBatKing entity) {
        return texture;
    }
}
