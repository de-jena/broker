package de.jena.conflict.sensinact;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

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
import org.osgi.util.promise.PromiseFactory;

import de.jena.conflict.sensinact.model.conflictProvider.Conflict;
import de.jena.conflict.sensinact.model.conflictProvider.ConflictFactory;
import de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictAdmin;
import de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictProvider;

@Component
@EventTopics({ "DATA/K440/K4/*", "DATA/Felsenkeller/MotorcyclePlus/*" })
public class TrafficConflictNotification implements TypedEventHandler<ResourceDataNotification> {

	private static final Logger logger = System.getLogger(TrafficConflictNotification.class.getName());

	private static final double MIN_BIKE_SPEED = 7.0;
	private static final double MAX_HEADING = 230;
	private static final double MIN_HEADING = 90;

	@Reference
	private DataUpdate sensiNact;

	private Conflict conflict;

	private Boolean conflictOld = null;

	private PromiseFactory promiseFactory;

	private State state = new State();

	private static class State {

		private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME
				.withZone(ZoneId.systemDefault());

		private boolean bike;
		private String currentColor;
		public Instant bikeTimestamp = Instant.EPOCH;
		public Instant trafficLightTimestamp;

		boolean isConflict() {
			return ("🟢⚪⚪".equals(currentColor) || "⚪🟡🔴".equals(currentColor)) && bike;
		}

		@Override
		public String toString() {
			return "State [conflict=" + (isConflict() ? "🔴" : "🟢") + ", bike=" + bike + "("
					+ formatter.format(bikeTimestamp) + "), currentColor=" + currentColor + "("
					+ formatter.format(trafficLightTimestamp) + ")]";
		}

	}

	@Activate
	public void activate() {
		TrafficConflictProvider provider = ConflictFactory.eINSTANCE.createTrafficConflictProvider();
		TrafficConflictAdmin admin = ConflictFactory.eINSTANCE.createTrafficConflictAdmin();
		provider.setId("FelsenkellerRadAuto");
		provider.setAdmin(admin);
		admin.setLocation(createViewport());
		conflict = ConflictFactory.eINSTANCE.createConflict();
		provider.setConflict(conflict);
		sensiNact.pushUpdate(provider);
		promiseFactory = new PromiseFactory(Executors.newCachedThreadPool());
	}

	@Override
	public void notify(String topic, ResourceDataNotification event) {
		promiseFactory.submit(() -> handleNotify(topic, event));
	}

	public boolean handleNotify(String topic, ResourceDataNotification event) {

		logger.log(Level.DEBUG, "Event: {0} - {1}", event.getTopic(), event.timestamp);
//		if ("dataId".equals(event.resource)) {
//			logger.log(Level.INFO, "DataId {0} - {1} ", event.newValue, event.timestamp);
//		}

		boolean isCam = "Felsenkeller".equals(event.provider) && "objects".equals(event.resource)
				&& "MotorcyclePlus".equals(event.service);
		if (isCam) {
			state.bike = isBikeToSouth(event);
			state.bikeTimestamp = event.timestamp;
			if (state.bike)
				logger.log(Level.INFO, "Bike incoming ");
		}

		boolean isIlsa = "K440".equals(event.provider) && "color".equals(event.resource);
		if (isIlsa) {
			state.currentColor = (String) event.newValue;
			state.trafficLightTimestamp = event.timestamp;
			logger.log(Level.INFO, "Traffic light changed to: {0}", state.currentColor);
		}

		boolean conflict = state.isConflict();
		if (conflictOld == null || conflict != conflictOld) {
			this.conflict.setConflict(conflict);
			conflictOld = conflict;
			Promise<?> promise = sensiNact.pushUpdate(conflict);
			promise.onFailure(e -> logger.log(Level.ERROR, "Error while pushing to sensinact.", e));
		}
		logger.log(Level.INFO, "{0}", state);
		return conflictOld;
	}

	private Polygon createViewport() {
		Feature feature = new Feature();
		Polygon view = new Polygon();
		feature.geometry = view;
		view.coordinates = new ArrayList<>();
		List<Coordinates> coordRF2 = new ArrayList<>();
		view.coordinates.add(coordRF2);
		coordRF2.add(createCoordinate(50.92114749250047, 11.581174804340378));
		coordRF2.add(createCoordinate(50.92103629166223, 11.581092406951655));
		coordRF2.add(createCoordinate(50.921015807268105, 11.581132445119607));
		coordRF2.add(createCoordinate(50.92114163983149, 11.58123631225098));
		coordRF2.add(createCoordinate(50.92114749250047, 11.581174804340378));
		List<Coordinates> coordRF3 = new ArrayList<>();
		view.coordinates.add(coordRF3);
		coordRF3.add(createCoordinate(50.921183244297964, 11.581350041018055));
		coordRF3.add(createCoordinate(50.921157831897375, 11.58131050400172));
		coordRF3.add(createCoordinate(50.921121668072885, 11.581420587456762));
		coordRF3.add(createCoordinate(50.92115245619581, 11.581443069289548));
		coordRF3.add(createCoordinate(50.921183244297964, 11.581350041018055));
		return view;
	}

	private Coordinates createCoordinate(double latitude, double longitude) {
		Coordinates c = new Coordinates();
		c.latitude = latitude;
		c.longitude = longitude;
		return c;
	}

	private boolean isBikeToSouth(ResourceDataNotification event) {
		List<Feature> features = ((FeatureCollection) event.newValue).features;
		for (Feature feature : features) {
			Double heading = (Double) feature.properties.get("heading");
			Double speed = (Double) feature.properties.get("speed");
			Long time = (Long) feature.properties.get("times");

			logger.log(Level.INFO, "Heading: {0} Speed: {1} Time: {2}", heading, speed, Instant.ofEpochMilli(time));
			if (heading > MIN_HEADING && heading < MAX_HEADING && speed > MIN_BIKE_SPEED) {
				return true;
			}
		}
		logger.log(Level.INFO, "No Bike to south but {0} MotorCyclePlus", features.size());
		return false;
	}
}
