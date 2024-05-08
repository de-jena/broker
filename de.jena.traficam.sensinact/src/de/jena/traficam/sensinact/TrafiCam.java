package de.jena.traficam.sensinact;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.geojson.Polygon;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.util.promise.Promise;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushEvent.EventType;
import org.osgi.util.pushstream.PushStream;

import de.jena.traficam.CamConfig;
import de.jena.traficam.GpsCoordinates;
import de.jena.traficam.Scene;
import de.jena.traficam.TrafiCamObject;

@RequireEMFJson
@Component(immediate = true)
public class TrafiCam {

	private static final Logger logger = System.getLogger(TrafiCam.class.getName());

	private static final String TOPIC = "5g/data/traficam/";
	private static final URI TEMP_URI = URI.createFileURI("temp.json");

	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME
			+ "=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ResourceSet> serviceObjects;

	@Reference
	private DataUpdate sensiNact;

	@Reference(target = "(id=full)")
	private MessagingService messaging;

	private PushStream<Message> subscription;

	private Map<String, CamConfig> configs = new HashMap<>();

	@Activate
	public void activate() {
		try {
			subscription = messaging.subscribe(TOPIC + "#");
//			subscription
			subscription.forEachEvent(this::handle);
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error subscribing mqtt {0}.\n{1}", TOPIC, e);
		}
		logger.log(Level.INFO, "Sensinact Traffic Light started.");
	}

	@Deactivate
	private void deactivate() {
		subscription.close();
	}

	private long handle(PushEvent<? extends Message> event) {
		EventType type = event.getType();
		switch (type) {
		case CLOSE:
			logger.log(Level.INFO, "PushStream closed.");
			break;
		case DATA:
			onMessage(event.getData());
			break;
		case ERROR:
			event.getFailure().printStackTrace();
			break;
		default:
			break;
		}
		return 0;
	}

	private void onMessage(Message message) {
		String topic = message.topic();
		String camId = topic.split("/")[3];
		if (topic.endsWith("config/retained")) {
			updateConfig(message, camId);
		} else if (topic.endsWith("lifesign")) {
		} else {
			update(message, camId);
		}
	}

	private void update(Message message, String camId) {
		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = resourceSet.createResource(TEMP_URI);
		try {
			resource.load(new ByteArrayInputStream(message.payload().array()), Collections.emptyMap());
			if (resource.getContents().size() == 0) {
				logger.log(Level.WARNING, "Can't load Traficam from {0}.", message);
				return;
			}
			TrafiCamObject tc = (TrafiCamObject) resource.getContents().get(0);
			short classId = tc.getClassId();
			String className = getClassName(camId, classId);
			FeatureCollection geo = createFeatureCollection(tc);
			TrafiCamDto dto = new TrafiCamDto(camId, classId, className, geo);
			dto.location = createLocation(camId);
			dto.viewport = createFeatureCollection(camId);
			Promise<?> promise = sensiNact.pushUpdate(dto);
			promise.onFailure(e -> logger.log(Level.ERROR, "Error while pushing configuration to sensinact.", e));
		} catch (IOException e) {
			logger.log(Level.ERROR, "Error while parsing json for {0}.", camId, e);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}
	}

	private String getClassName(String camId, short classId) {
		CamConfig camConfig = configs.get(camId);
		if (camConfig == null) {
			logger.log(Level.WARNING, "Warn: configuration for {0} not loaded.", camId);
			return "";
		}
		String className = camConfig.getClassMap().get("" + classId);
		return className;
	}

	private FeatureCollection createFeatureCollection(String camId) {
		FeatureCollection geo = new FeatureCollection();
		CamConfig camConfig = configs.get(camId);
		if (camConfig == null) {
			logger.log(Level.WARNING, "Warn: configuration for {0} not loaded.", camId);
			return geo;
		}
		Scene scene = camConfig.getScene();
		GpsCoordinates gps = scene.getLeftBottom();
		if (gps == null) {
			return geo;
		}
		Feature f = new Feature();
		f.geometry = createPolygon(scene.getLeftBottom(), scene.getRightBottom(), scene.getRightTop(),
				scene.getLeftTop());
		geo.features.add(f);
		return geo;
	}

	private Polygon createPolygon(GpsCoordinates... gps) {
		Polygon p = new Polygon();
		List<Coordinates> coordinates = new ArrayList<>();
		p.coordinates = Arrays.asList(coordinates);
		for (GpsCoordinates g : gps) {
			Coordinates c = new Coordinates();
			c.latitude = g.getLatitude();
			c.longitude = g.getLongitude();
			coordinates.add(c);
		}
		return p;
	}

	private FeatureCollection createFeatureCollection(TrafiCamObject tc) {
		FeatureCollection geo = new FeatureCollection();
		GpsCoordinates gps = tc.getGpsCoordinates().get(0);
		if (gps == null) {
			return geo;
		}
		Feature f = new Feature();
		Point point = new Point();
		point.coordinates = new Coordinates();
		point.coordinates.latitude = gps.getLatitude();
		point.coordinates.longitude = gps.getLongitude();
		f.geometry = point;
		geo.features.add(f);
		return geo;
	}

	private FeatureCollection createLocation(String camId) {
		FeatureCollection geo = new FeatureCollection();
		CamConfig camConfig = configs.get(camId);
		if (camConfig == null) {
			logger.log(Level.WARNING, "Warn: configuration for {0} not loaded.", camId);
			return geo;
		}

		GpsCoordinates gps = camConfig.getLocation();
		if (gps == null) {
			return geo;
		}
		Feature f = new Feature();
		Point point = new Point();
		point.coordinates = new Coordinates();
		point.coordinates.latitude = gps.getLatitude();
		point.coordinates.longitude = gps.getLongitude();
		f.geometry = point;
		geo.features.add(f);
		return geo;
	}

	private void updateConfig(Message message, String camId) {
		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = resourceSet.createResource(TEMP_URI);
		try {
			resource.load(new ByteArrayInputStream(message.payload().array()), Collections.emptyMap());
			CamConfig configuration = (CamConfig) resource.getContents().get(0);
			configs.put(camId, configuration);
		} catch (IOException e) {
			logger.log(Level.ERROR, "Error while parsing json.", e);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}
	}
}