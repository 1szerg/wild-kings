package com.gmail.user0abc.wildkings.mob.render;

import com.gmail.user0abc.wildkings.mob.EntityCowKing;
import com.gmail.user0abc.wildkings.mob.model.ModelCowKing;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

/**
 * @author Sergii Ivanov
 */
public class RenderCowKing extends RenderLiving<EntityCowKing> {

    private static final ResourceLocation texture = new ResourceLocation("textures/entity/Cow.png");

    public RenderCowKing(RenderManager renderManager) {
        super(renderManager, new ModelCowKing(), 1.0f);
    }

    public static IRenderFactory<EntityCowKing> getRenderFactory() {
        return new IRenderFactory<EntityCowKing>() {
            @Override
            public Render createRenderFor(RenderManager manager) {
                return new RenderCowKing(manager);
            }
        };
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityCowKing entity) {
        return texture;
    }
}
