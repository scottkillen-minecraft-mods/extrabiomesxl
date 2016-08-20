package ttftcuts.atg.api.events;

import java.util.List;

import net.minecraft.world.biome.BiomeGenBase;
import  net.minecraft.fml.common.eventhandler.Event;

public class ATGBiomeGroupRequestEvent extends Event {

	public BiomeGenBase biome;
	public List<String> groups;
	
	public ATGBiomeGroupRequestEvent(BiomeGenBase biome) {
		this.biome = biome;
		this.groups = null;
	}
}
