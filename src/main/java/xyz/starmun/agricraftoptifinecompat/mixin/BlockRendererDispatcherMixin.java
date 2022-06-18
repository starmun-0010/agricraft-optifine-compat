package xyz.starmun.agricraftoptifinecompat.mixin;

import com.infinityraider.infinitylib.render.fluid.InfFluidRenderer;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.FluidBlockRenderer;
import net.minecraft.resources.IResourceManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import xyz.starmun.agricraftoptifinecompat.contracts.InfFluidRendererExtensions;


@Mixin(BlockRendererDispatcher.class)
public class BlockRendererDispatcherMixin {
    @Shadow
    private FluidBlockRenderer liquidBlockRenderer;
    @Inject(method = "onResourceManagerReload", at=@At("TAIL"))
    public void onResourceManagerReload(IResourceManager resourceManager, CallbackInfo ci) {
        if(liquidBlockRenderer instanceof InfFluidRenderer){
            ((InfFluidRendererExtensions)liquidBlockRenderer).aoc$initPreviousAtlasSprites();
        }
    }
}
