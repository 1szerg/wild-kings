package com.gmail.user0abc.wildkings.mob.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * @author Sergii Ivanov
 */
public abstract class ModelQuadrupedKing extends ModelKing
{
    public ModelRenderer head;
    public ModelRenderer body;
    public ModelRenderer leg1;
    public ModelRenderer leg2;
    public ModelRenderer leg3;
    public ModelRenderer leg4;

    public ModelQuadrupedKing(int height, float scale)
    {
        buildModel(height, scale);
    }

    public void buildModel(int height, float scale){
        float renderScale = scale;// * getSizeScale();
        head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, renderScale);
        this.head.setRotationPoint(0.0F, (float) (18 - height), -6.0F);
        this.body = new ModelRenderer(this, 28, 8);
        this.body.addBox(-5.0F, -10.0F, -7.0F, 10, 16, 8, renderScale);
        this.body.setRotationPoint(0.0F, (float) (17 - height), 2.0F);
        this.leg1 = new ModelRenderer(this, 0, 16);
        this.leg1.addBox(-2.0F, 0.0F, -2.0F, 4, height, 4, renderScale);
        this.leg1.setRotationPoint(-3.0F, (float) (24 - height), 7.0F);
        this.leg2 = new ModelRenderer(this, 0, 16);
        this.leg2.addBox(-2.0F, 0.0F, -2.0F, 4, height, 4, renderScale);
        this.leg2.setRotationPoint(3.0F, (float) (24 - height), 7.0F);
        this.leg3 = new ModelRenderer(this, 0, 16);
        this.leg3.addBox(-2.0F, 0.0F, -2.0F, 4, height, 4, renderScale);
        this.leg3.setRotationPoint(-3.0F, (float) (24 - height), -5.0F);
        this.leg4 = new ModelRenderer(this, 0, 16);
        this.leg4.addBox(-2.0F, 0.0F, -2.0F, 4, height, 4, renderScale);
        this.leg4.setRotationPoint(3.0F, (float) (24 - height), -5.0F);

    }

    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        GlStateManager.pushMatrix();
        GlStateManager.translate(0.0F, getHeightFix() * scale * getSizeScale(), 0f);
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale * getSizeScale(), entityIn);
        this.head.render(scale * getSizeScale());
        this.body.render(scale * getSizeScale());
        this.leg1.render(scale * getSizeScale());
        this.leg2.render(scale * getSizeScale());
        this.leg3.render(scale * getSizeScale());
        this.leg4.render(scale * getSizeScale());
        GlStateManager.popMatrix();
    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        this.head.rotateAngleX = headPitch * 0.017453292F;
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.body.rotateAngleX = ((float) Math.PI / 2F);
        this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
}
