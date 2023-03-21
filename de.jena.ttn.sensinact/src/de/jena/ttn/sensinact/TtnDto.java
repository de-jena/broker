package de.jena.ttn.sensinact;

import java.util.Map;

import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.prototype.annotation.dto.Data;
import org.eclipse.sensinact.prototype.annotation.dto.Model;
import org.eclipse.sensinact.prototype.annotation.dto.Provider;
import org.eclipse.sensinact.prototype.annotation.dto.Service;
import org.eclipse.sensinact.prototype.annotation.dto.Timestamp;

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
