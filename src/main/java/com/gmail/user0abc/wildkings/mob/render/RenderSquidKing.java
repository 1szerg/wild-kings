package com.gmail.user0abc.wildkings.mob.render;

import com.gmail.user0abc.wildkings.mob.EntitySquidKing;
import com.gmail.user0abc.wildkings.mob.model.ModelSquidKing;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

/**
 * @author Sergii Ivanov
 */
public class RenderSquidKing extends RenderLiving<EntitySquidKing> {

    private static final ResourceLocation texture = new ResourceLocation("textures/entity/squid.png");

    public RenderSquidKing(RenderManager renderManager){
        super(renderManager, new ModelSquidKing(), 1.0f);
    }

    public static IRenderFactory<EntitySquidKing> getRenderFactory() {
        return new IRenderFactory<EntitySquidKing>() {
            @Override
            public Render createRenderFor(RenderManager manager) {
                return new RenderSquidKing(manager);
            }
        };
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntitySquidKing entity) {
        return texture;
    }
}
