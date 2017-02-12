package com.gmail.user0abc.wildkings.mob.render;

import com.gmail.user0abc.wildkings.mob.EntitySheepKing;
import com.gmail.user0abc.wildkings.mob.model.ModelSheepKing;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

/**
 * @author Sergii Ivanov
 */
public class RenderSheepKing extends RenderLiving<EntitySheepKing> {

    private static final ResourceLocation texture = new ResourceLocation("textures/entity/sheep/sheep_fur.png");

    public RenderSheepKing(RenderManager renderManager) {
        super(renderManager, new ModelSheepKing(), 1.0f);
    }

    public static IRenderFactory<EntitySheepKing> getRenderFactory() {
        return new IRenderFactory<EntitySheepKing>() {
            @Override
            public Render createRenderFor(RenderManager manager) {
                return new RenderSheepKing(manager);
            }
        };
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntitySheepKing entity) {
        return texture;
    }
}
