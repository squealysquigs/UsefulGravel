package usefulgravel;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = UsefulGravel.modid, name = "Useful Gravel", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class UsefulGravel {
	
	public static final String modid = "squealy_UsefulGravel";
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
	}

}
//Enter BUH after this: 