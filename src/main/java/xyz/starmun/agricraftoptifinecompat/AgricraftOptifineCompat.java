package xyz.starmun.agricraftoptifinecompat;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static xyz.starmun.agricraftoptifinecompat.AgricraftOptifineCompat.MOD_ID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MOD_ID)
public class AgricraftOptifineCompat
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID= "agricraftoptifinecompat";

}
