package de.jena.ttn.sensinact;

import org.eclipse.sensinact.core.annotation.dto.Data;
import org.eclipse.sensinact.core.annotation.dto.Model;
import org.eclipse.sensinact.core.annotation.dto.Provider;
import org.eclipse.sensinact.core.annotation.dto.Service;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

@Model("TTN")
public class TtnDto {
	
	@Provider
	String provider;
	
	@Service("admin")
	GeoJsonObject location;
	
	@Data
	@Service("data")
	Object data;
	
}
