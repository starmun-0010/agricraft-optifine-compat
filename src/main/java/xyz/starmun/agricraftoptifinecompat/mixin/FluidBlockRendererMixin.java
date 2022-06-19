package xyz.starmun.agricraftoptifinecompat.mixin;

import net.minecraft.client.renderer.block.LiquidBlockRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import xyz.starmun.agricraftoptifinecompat.contracts.IFluidBlockRendererExtensions;

@Mixin(LiquidBlockRenderer.class)
public class FluidBlockRendererMixin implements IFluidBlockRendererExtensions {

    @Shadow
    protected void setupSprites(){}


    @Override
    public void aoc$initAtlasSprites() {
        this.setupSprites();
    }
}
