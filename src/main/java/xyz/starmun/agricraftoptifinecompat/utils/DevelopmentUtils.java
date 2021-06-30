package xyz.starmun.agricraftoptifinecompat.utils;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DevelopmentUtils {
    @OnlyIn(Dist.CLIENT)
    public static boolean ungrabMouse() {
        Minecraft.getInstance().mouseHelper.ungrabMouse();
        return true;
    }
    public static boolean isDebug(){
        try {
            return java.lang.management.ManagementFactory.getRuntimeMXBean().getInputArguments().toString().contains("-agentlib:jdwp");
        }catch (Exception ex){
            return false;
        }
    }
}
