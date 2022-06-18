package xyz.starmun.agricraftoptifinecompat.renderer;

import com.infinityraider.infinitylib.modules.dynamiccamera.DynamicCamera;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class DynamicCameraRenderer extends EntityRenderer<DynamicCamera> {
    public DynamicCameraRenderer(EntityRendererManager renderManager) {
        super(renderManager);
    }

    @Override
    public ResourceLocation getTextureLocation(DynamicCamera p_110775_1_) {
        return null;
    }
}
