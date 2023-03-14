package org.eclipse.sensinact.southbound.ttn.packet;

import org.eclipse.sensinact.prototype.annotation.dto.Data;
import org.eclipse.sensinact.prototype.annotation.dto.Provider;

public class SoilDto {
	
	@Provider
	String provider;
	
	@Data
	double battery;
	@Data
	int conductivity;
	@Data
	double temperature;
	@Data
	double water;
	@Data
	long timestamp;

}
