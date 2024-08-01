package de.jena.ttn.sensinact.util;

import org.eclipse.m2m.qvt.oml.blackbox.java.Module;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.gecko.qvt.osgi.annotations.ModuleName;
import org.gecko.qvt.osgi.annotations.QvtBlackbox;
import org.gecko.qvt.osgi.annotations.TemplatePath;
import org.gecko.qvt.osgi.annotations.TransformatorId;
import org.gecko.qvt.osgi.annotations.UnitQualifiedName;
import org.osgi.service.component.annotations.Component;

import de.jena.model.ttn.Location;
import de.jena.model.ttn.TTNPackage;


/**
 * 
 * @author mark
 * @since 24.11.2022
 */
@Component(service = {LocationToGeoJsonBlackbox.class})
@QvtBlackbox
@TransformatorId("TTN2SensinactTTNApi")
@ModuleName("LocationToGeoJsonBlackbox")
@UnitQualifiedName("de.jena.ttn.sensinact.util.LocationToGeoJsonBlackbox")
@TemplatePath("de.jena.ttn.sensinact.mmt/ttn.qvto")
@Module(packageURIs={TTNPackage.eNS_URI})
public class LocationToGeoJsonBlackbox{
	
	@Operation(contextual = true, description = "Converts from UTM into degree latitude")
	public static GeoJsonObject toGeoJson(Location location) {
		Point point = new Point();
		point.coordinates = new Coordinates();
		point.coordinates.latitude = location.getLatitude();
		point.coordinates.longitude = location.getLongitude();
		point.coordinates.elevation = location.getAltitude();
		
		return point;
	}

}
