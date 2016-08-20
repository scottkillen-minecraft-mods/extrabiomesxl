package ttftcuts.atg.api.events;

import ttftcuts.atg.api.ATGBiomes.BiomeType;
import  net.minecraft.fml.common.eventhandler.Event;

public class ATGBiomeGroupEvent extends Event {

	public static enum EventType { SUITABILITY };
	public static enum ResponseType { NONE, OK, FAILED };
	
	public EventType type;
	public BiomeType biomeType;
	public ResponseType response;
	public String name;
	public double modifier;

	public ATGBiomeGroupEvent( EventType type, BiomeType biomeType, String name, double modifier ) {
		this.type = type;
		this.biomeType = biomeType;
		this.name = name;
		this.modifier = modifier;
		this.response = ResponseType.NONE;
	}
}
