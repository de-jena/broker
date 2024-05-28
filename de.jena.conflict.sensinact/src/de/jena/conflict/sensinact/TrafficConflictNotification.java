package de.jena.conflict.sensinact;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.sensinact.core.notification.ResourceDataNotification;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.Polygon;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.typedevent.TypedEventHandler;
import org.osgi.service.typedevent.propertytypes.EventTopics;
import org.osgi.util.promise.Promise;

import de.jena.conflict.sensinact.model.conflictProvider.Conflict;
import de.jena.conflict.sensinact.model.conflictProvider.ConflictFactory;
import de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictAdmin;
import de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictProvider;

@Component
@EventTopics({"DATA/K440/K4/*","DATA/Felsenkeller/*" })
public class TrafficConflictNotification implements TypedEventHandler<ResourceDataNotification> {
	private static final Logger logger = System.getLogger(TrafficConflictNotification.class.getName());

	@Reference
	private DataUpdate sensiNact;

	private Conflict conflict;

	private Object currentColor;

	private boolean isBike;

	private boolean isConflictOld;

	@Activate
	public void activate() {
		TrafficConflictProvider provider = ConflictFactory.eINSTANCE.createTrafficConflictProvider();
		TrafficConflictAdmin admin = ConflictFactory.eINSTANCE.createTrafficConflictAdmin();
		provider.setId("FelsenkellerRadAuto");
		provider.setAdmin(admin);
		Polygon view = new Polygon();
		view.coordinates = new ArrayList<>();
		List<Coordinates> coordRF2 = new ArrayList<>();
		view.coordinates.add(coordRF2);
		coordRF2.add(createCoordinate(50.92114749250047, 11.581174804340378 ));
		coordRF2.add(createCoordinate(50.92103629166223, 11.581092406951655));
		coordRF2.add(createCoordinate(50.921015807268105, 11.581132445119607));
		coordRF2.add(createCoordinate(50.92114163983149, 11.58123631225098));
		coordRF2.add(createCoordinate(50.92114749250047, 11.581174804340378 ));
		List<Coordinates> coordRF3 = new ArrayList<>();
		view.coordinates.add(coordRF3);
		coordRF3.add(createCoordinate(50.921183244297964, 11.581350041018055 ));
		coordRF3.add(createCoordinate(50.921157831897375, 11.58131050400172));
		coordRF3.add(createCoordinate(50.921121668072885, 11.581420587456762));
		coordRF3.add(createCoordinate(50.92115245619581, 11.581443069289548));
		coordRF3.add(createCoordinate(50.921183244297964, 11.581350041018055 ));
		admin.setViewport(view);
		conflict = ConflictFactory.eINSTANCE.createConflict();
		provider.setConflict(conflict);
		sensiNact.pushUpdate(provider);
	}

	private Coordinates createCoordinate(double latitude, double longitude) {
		Coordinates c = new Coordinates();
		c.latitude = latitude;
		c.longitude =longitude;
		return c;
	}
	
	@Override
	public void notify(String topic, ResourceDataNotification event) {
		logger.log(Level.INFO,"Event: {0} - {1}", event.getTopic(), event.timestamp);
		if("dataId".equals(event.resource)) {
			logger.log(Level.INFO,"DataId {0} - {1} ", event.newValue,event.timestamp);
		}
		
		boolean isCam = "Felsenkeller".equals(event.provider) && "objects".equals(event.resource) && "MotorcyclePlus".equals(event.service);
		if(isCam) {
			isBike = isBikeToSouth(event);
			if(isBike)
			logger.log(Level.INFO,"Bike incoming ");
		}
		
		boolean isIlsa = "K440".equals(event.provider) && "color".equals(event.resource);
		if(isIlsa) {
			currentColor = event.newValue;
			logger.log(Level.INFO,"Current Color: {0}", currentColor);
		}

		
		boolean isConflict = "🟢⚪⚪".equals(currentColor) && isBike;
		if(isConflict != isConflictOld) {
			conflict.setIsConflict(isConflict);
			
			isConflictOld = isConflict;
		}
		logger.log(Level.INFO,"Conflict: {0}", isConflictOld? "🔴" :"🟢");
		Promise<?> promise = sensiNact.pushUpdate(conflict);
		promise.onFailure(e -> logger.log(Level.ERROR, "Error while pushing to sensinact.", e));
	}

	private boolean isBikeToSouth(ResourceDataNotification event) {
		
		List<Feature> features = ((FeatureCollection) event.newValue).features;
		for (Feature feature : features) {
			Double heading = (Double) feature.properties.get("heading");
			Double speed = (Double) feature.properties.get("speed");
			
			logger.log(Level.INFO,"Heading: {0} Speed: {1}", heading, speed);
			if(heading > 90 && heading < 230 && speed > 7.0) {
				return true;
			}
		}
		if(features.isEmpty())
		logger.log(Level.INFO,"No MotorcyclePlus");
		return false;
	}
}
