package xyz.starmun.agricraftoptifinecompat.mixin;

import com.infinityraider.infinitylib.modules.dynamiccamera.DynamicCamera;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.ModList;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xyz.starmun.agricraftoptifinecompat.renderer.DynamicCameraRenderer;
import xyz.starmun.agricraftoptifinecompat.utils.DevelopmentUtils;

@Mixin(value = DynamicCamera.class, remap = false)
public class DynamicCameraMixin {

    @Shadow
    private static DynamicCamera INSTANCE;

    @Inject(method = "getInstance", at=@At(value = "FIELD", target = "Lcom/infinityraider/infinitylib/modules/dynamiccamera/DynamicCamera;INSTANCE:Lcom/infinityraider/infinitylib/modules/dynamiccamera/DynamicCamera;", shift = At.Shift.AFTER, opcode = Opcodes.PUTSTATIC ))
    private static void getInstance(CallbackInfoReturnable<DynamicCamera> cir){
        Minecraft.getInstance().getRenderManager()
                .register((EntityType<DynamicCamera>)INSTANCE.getType(),
                        new DynamicCameraRenderer(Minecraft.getInstance().getRenderManager()));
    }
}
