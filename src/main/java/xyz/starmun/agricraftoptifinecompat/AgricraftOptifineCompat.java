package xyz.starmun.agricraftoptifinecompat;

import net.minecraftforge.fml.ExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.network.FMLNetworkConstants;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static xyz.starmun.agricraftoptifinecompat.AgricraftOptifineCompat.MOD_ID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MOD_ID)
public class AgricraftOptifineCompat {
    public static final Logger LOGGER = LogManager.getLogger("Agricraft Optifine Compat");
    public static final String MOD_ID = "agricraftoptifinecompat";

    public AgricraftOptifineCompat() {
        ModLoadingContext.get().registerExtensionPoint(ExtensionPoint.DISPLAYTEST, () -> Pair.of(() -> FMLNetworkConstants.IGNORESERVERONLY, (a, b) -> true));
    }
}
