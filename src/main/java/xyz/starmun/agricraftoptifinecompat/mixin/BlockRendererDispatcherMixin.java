package xyz.starmun.agricraftoptifinecompat.mixin;

import com.infinityraider.infinitylib.render.fluid.InfFluidRenderer;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.block.LiquidBlockRenderer;
import net.minecraft.server.packs.resources.ResourceManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import xyz.starmun.agricraftoptifinecompat.contracts.InfFluidRendererExtensions;


@Mixin(BlockRenderDispatcher.class)
public class BlockRendererDispatcherMixin {
    @Shadow
    private LiquidBlockRenderer liquidBlockRenderer;
    @Inject(method = "onResourceManagerReload", at=@At("TAIL"))
    public void onResourceManagerReload(ResourceManager resourceManager, CallbackInfo ci) {
        if(liquidBlockRenderer instanceof InfFluidRenderer){
            ((InfFluidRendererExtensions)liquidBlockRenderer).aoc$initPreviousAtlasSprites();
        }
    }
}
