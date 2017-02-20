package com.gmail.user0abc.wildkings.mob.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * @author Sergii Ivanov
 */
public abstract class ModelKing extends ModelBase {

    public float getSizeScale(){
        return 2f;
    }

    public abstract float getHeightFix();

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(0.0F, getHeightFix() * getSizeScale(), 0f);
        super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale * getSizeScale());
        GlStateManager.popMatrix();
    }
}
