package com.gmail.user0abc.wildkings.mob.render;

import com.gmail.user0abc.wildkings.mob.EntityBatKing;
import com.gmail.user0abc.wildkings.mob.EntityChickenKing;
import com.gmail.user0abc.wildkings.mob.model.ModelBatKing;
import com.gmail.user0abc.wildkings.mob.model.ModelChickenKing;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

/**
 * @author Sergii Ivanov
 */
public class RenderChickenKing extends RenderLiving<EntityChickenKing> {

    private static final ResourceLocation texture = new ResourceLocation("textures/entity/chicken.png");

    public RenderChickenKing(RenderManager renderManager){
        super(renderManager, new ModelChickenKing(), 1.0f);
    }

    public static IRenderFactory<EntityChickenKing> getRenderFactory() {
        return new IRenderFactory<EntityChickenKing>() {
            @Override
            public Render createRenderFor(RenderManager manager) {
                return new RenderChickenKing(manager);
            }
        };
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityChickenKing entity) {
        return texture;
    }
}
