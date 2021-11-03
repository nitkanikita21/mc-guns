package com.nitka.mcguns.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.nitka.mcguns.register.ModRegister;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;

public class CustomHandRender extends ItemStackTileEntityRenderer {
    @Override
    public void renderByItem(ItemStack itemStackIn, ItemCameraTransforms.TransformType transformTypeIn, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
        //super.renderByItem(itemStackIn, transformTypeIn, matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn);

        //GL11.glTranslated(1,1,1);



        if(transformTypeIn.firstPerson()){
            Item model = ModRegister.modItems.get("m4a4s_firstperson").get();
            Minecraft.getInstance().getItemRenderer().renderStatic(new ItemStack(model),transformTypeIn,combinedLightIn,combinedOverlayIn,matrixStackIn,bufferIn);

            GL11.glTranslated(0.35d,0.4d,0.1d);
        }else {
            GL11.glTranslated(0.0d,0.4d,0.0d);
            Item model = ModRegister.modItems.get("m4a4s_base").get();
            Minecraft.getInstance().getItemRenderer().renderStatic(new ItemStack(model),transformTypeIn,combinedLightIn,combinedOverlayIn,matrixStackIn,bufferIn);
        }


    }
}
