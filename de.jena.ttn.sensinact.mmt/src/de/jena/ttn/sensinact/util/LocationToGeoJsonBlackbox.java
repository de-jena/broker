package de.jena.ttn.sensinact.util;

import org.eclipse.m2m.qvt.oml.blackbox.java.Module;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.gecko.qvt.osgi.api.ModelTransformationConstants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.condition.Condition;

import de.jena.model.ttn.Location;
import de.jena.model.ttn.TTNPackage;


/**
 * 
 * @author mark
 * @since 24.11.2022
 */
@Component(service = {LocationToGeoJsonBlackbox.class, Condition.class}, immediate=true, property = {ModelTransformationConstants.QVT_BLACKBOX + "=true", ModelTransformationConstants.BLACKBOX_MODULENAME + "=LocationToGeoJsonBlackbox", ModelTransformationConstants.BLACKBOX_QUALIFIED_UNIT_NAME + "=de.jena.ttn.sensinact.util.LocationToGeoJsonBlackbox", Condition.CONDITION_ID +"=ttnBlackboxes"})
@Module(packageURIs={TTNPackage.eNS_URI})
public class LocationToGeoJsonBlackbox implements Condition {
	
	/**
	 * Contextual method that can be called on each {@link com.swarco.sdg.sdgtlc.CommunicationStateType}
	 * @param self the instance the method is called from
	 * @return the double value of the  
	 */
	@Operation(contextual = true, description = "Converts from UTM into degree latitude")
	public static GeoJsonObject toGeoJson(Location location) {
		return new GeoJsonObject(null) {
		};
	}

}
