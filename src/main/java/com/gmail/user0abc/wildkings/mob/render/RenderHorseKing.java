package com.gmail.user0abc.wildkings.mob.render;

import com.gmail.user0abc.wildkings.mob.EntityHorseKing;
import com.gmail.user0abc.wildkings.mob.model.ModelHorseKing;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

/**
 * @author Sergii Ivanov
 */
public class RenderHorseKing  extends RenderLiving<EntityHorseKing> {

    private static final ResourceLocation texture = new ResourceLocation("textures/entity/horse/horse_black.png");

    public RenderHorseKing(RenderManager renderManager){
        super(renderManager, new ModelHorseKing(), 1.0f);
    }

    public static IRenderFactory<EntityHorseKing> getRenderFactory() {
        return new IRenderFactory<EntityHorseKing>() {
            @Override
            public Render createRenderFor(RenderManager manager) {
                return new RenderHorseKing(manager);
            }
        };
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityHorseKing entity) {
        return texture;
    }
}
