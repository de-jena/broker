package de.jena.ttn.sensinact;

import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.prototype.annotation.dto.Data;
import org.eclipse.sensinact.prototype.annotation.dto.Model;
import org.eclipse.sensinact.prototype.annotation.dto.Provider;
import org.eclipse.sensinact.prototype.annotation.dto.Service;

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
