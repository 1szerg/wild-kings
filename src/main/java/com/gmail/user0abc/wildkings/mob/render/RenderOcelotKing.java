package com.gmail.user0abc.wildkings.mob.render;

import com.gmail.user0abc.wildkings.mob.EntityLlamaKing;
import com.gmail.user0abc.wildkings.mob.EntityOcelotKing;
import com.gmail.user0abc.wildkings.mob.model.ModelLlamaKing;
import com.gmail.user0abc.wildkings.mob.model.ModelOcelotKing;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

/**
 * @author Sergii Ivanov
 */
public class RenderOcelotKing extends RenderLiving<EntityOcelotKing> {

    private static final ResourceLocation texture = new ResourceLocation("textures/entity/cat/red.png");

    public RenderOcelotKing(RenderManager renderManager){
        super(renderManager, new ModelOcelotKing(), 1.0f);
    }

    public static IRenderFactory<EntityOcelotKing> getRenderFactory() {
        return new IRenderFactory<EntityOcelotKing>() {
            @Override
            public Render createRenderFor(RenderManager manager) {
                return new RenderOcelotKing(manager);
            }
        };
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityOcelotKing entity) {
        return texture;
    }
}
