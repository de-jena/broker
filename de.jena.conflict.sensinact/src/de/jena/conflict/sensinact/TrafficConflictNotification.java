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
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.typedevent.TypedEventHandler;
import org.osgi.service.typedevent.propertytypes.EventTopics;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.PromiseFactory;

import de.jena.conflict.sensinact.model.conflictProvider.Conflict;
import de.jena.conflict.sensinact.model.conflictProvider.ConflictFactory;
import de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictAdmin;
import de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictProvider;

@Component(configurationPolicy = ConfigurationPolicy.OPTIONAL)
@EventTopics({ "DATA/Ilsa/K440/K4/1/*", "DATA/TraficamProvider/Felsenkeller/3/*" })
public class TrafficConflictNotification implements TypedEventHandler<ResourceDataNotification> {

	private static final Logger logger = System.getLogger(TrafficConflictNotification.class.getName());

	@Reference
	private DataUpdate sensiNact;

	private Conflict conflict;

	private Boolean conflictOld = null;

	private PromiseFactory promiseFactory;

	private State state = new State();

	private TrafficConflictProvider provider;

	private ConflictConfiguration config;

	public @interface ConflictConfiguration {

	    @AttributeDefinition(name = "MinBikeSpeed", description = "Minimum speed to detect a class 3 object as bike")
		double minBikeSpeed() default 7.0;

	    @AttributeDefinition(name = "MaxHeading", description = "Maximum heading a bike has to move to be considered for a conflict")
		double maxHeading() default 230;

	    @AttributeDefinition(name = "MinHeading", description = "Minimum heading a bike has to move to be considered for a conflict")
		double minHeading() default 90;

	}

	private static class State {

		private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME
				.withZone(ZoneId.systemDefault());

		private boolean bike;
		private Long bikeId;
		private String currentColor;
		private Instant bikeTimestamp = Instant.EPOCH;
		private Instant trafficLightTimestamp = Instant.EPOCH;

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
	public void activate(ConflictConfiguration configuration) {
		this.config = configuration;
		provider = ConflictFactory.eINSTANCE.createTrafficConflictProvider();
		TrafficConflictAdmin admin = ConflictFactory.eINSTANCE.createTrafficConflictAdmin();
		provider.setId("FelsenkellerRadAuto");
		provider.setAdmin(admin);
		admin.setLocation(createViewport());
		conflict = ConflictFactory.eINSTANCE.createConflict();
		conflict.setConflict(true);
		provider.setConflict(conflict);
		sensiNact.pushUpdate(provider);
		promiseFactory = new PromiseFactory(Executors.newCachedThreadPool());
	}

	@Modified
	public void modify(ConflictConfiguration config) {
		this.config = config;
	}
	
	
	@Override
	public void notify(String topic, ResourceDataNotification event) {
		promiseFactory.submit(() -> handleNotify(topic, event))
				.onFailure(e -> logger.log(Level.ERROR, "Error while handling notification from {0}.\n{1}", topic, e));
	}

	public boolean handleNotify(String topic, ResourceDataNotification event) {

		logger.log(Level.DEBUG, "Event: {0} - {1}", event.getTopic(), event.timestamp);

		boolean isCam = "Felsenkeller".equals(event.provider) && "objects".equals(event.resource)
				&& "3".equals(event.service);
		if (isCam) {
			state.bike = isBikeToSouth(event);
			state.bikeTimestamp = event.timestamp;
		}

		boolean isIlsa = "K440".equals(event.provider) && "color".equals(event.resource);
		if (isIlsa) {
			state.currentColor = (String) event.newValue;
			state.trafficLightTimestamp = event.timestamp;
			logger.log(Level.DEBUG, "Traffic light changed to: {0}", state.currentColor);
		}

		boolean conflict = state.isConflict();
		if (conflictOld == null || conflict != conflictOld) {
			this.conflict.setConflict(conflict);
			this.conflict.setBikeId(state.bikeId);
			conflictOld = conflict;
			Promise<?> promise = sensiNact.pushUpdate(provider);
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
		if (event.newValue == null) {
			return false;
		}
		List<Feature> features = ((FeatureCollection) event.newValue).features;
		for (Feature feature : features) {
			Double heading = (Double) feature.properties.get("heading");
			Double speed = (Double) feature.properties.get("speed");
			Long id = (Long) feature.properties.get("id");
			if (heading > config.minHeading() && heading < config.maxHeading()
					&& speed > config.minBikeSpeed()) {
				state.bikeId = id;
				return true;
			}
		}
		logger.log(Level.INFO, "No Bike to south but {0} MotorCyclePlus", features.size());
		state.bikeId = 0l;
		return false;
	}
}
