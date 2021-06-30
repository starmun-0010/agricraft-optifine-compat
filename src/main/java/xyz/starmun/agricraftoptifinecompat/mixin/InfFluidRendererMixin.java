package xyz.starmun.agricraftoptifinecompat.mixin;

import com.infinityraider.infinitylib.render.fluid.InfFluidRenderer;
import net.minecraft.client.renderer.FluidBlockRenderer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import xyz.starmun.agricraftoptifinecompat.contracts.IFluidBlockRendererExtensions;
import xyz.starmun.agricraftoptifinecompat.contracts.InfFluidRendererExtensions;

@Mixin(value = InfFluidRenderer.class, remap = false)
public class InfFluidRendererMixin extends FluidBlockRenderer implements InfFluidRendererExtensions {

    @Shadow
    @Final
    private FluidBlockRenderer previous;

    @Override
    public void aoc$initPreviousAtlasSprites() {
        ((IFluidBlockRendererExtensions)this.previous).aoc$initAtlasSprites();
    }
}
