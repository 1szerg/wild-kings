package com.gmail.user0abc.wildkings.mob.model;

import net.minecraft.client.model.ModelLlama;
import net.minecraft.entity.Entity;

/**
 * @author Sergii Ivanov
 */
public class ModelLlamaKing extends ModelLlama {

    public ModelLlamaKing(float p_i47226_1_) {
        super(p_i47226_1_);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale * 2);
    }
}
