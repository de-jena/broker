package de.jena.ttn.sensinact;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.core.push.dto.BulkGenericDto;
import org.eclipse.sensinact.core.push.dto.GenericDto;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.model.core.provider.Admin;
import org.eclipse.sensinact.model.core.provider.Provider;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.gecko.qvt.osgi.api.ModelTransformationConstants;
import org.gecko.qvt.osgi.api.ModelTransformator;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.util.pushstream.PushStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage;
import de.jena.model.ttn.Location;
import de.jena.model.ttn.RxMetadata;
import de.jena.model.ttn.TTNPackage;
import de.jena.model.ttn.TtnUplinkPayload;
import de.jena.model.ttn.UplinkMessage;

@Component(immediate = true, configurationPolicy = ConfigurationPolicy.REQUIRE, configurationPid = "TTNConnectionComponent")
@RequireEMFJson
public class TTNConnectionComponent {

	public @interface Config {
		String[] deviceIds() default {};
		String topic();
		String sensorThings_category() default "";
		String modelname() default "TTNSensor";
	}

	private Logger logger = LoggerFactory.getLogger(TTNConnectionComponent.class.getName());

	@Reference(name = "ttn", target = "(need=configuration)")
	private MessagingService messagingTtnSensors;
	
	@Reference(target = ("(" + ModelTransformationConstants.TRANSFORMATOR_ID + "=TTN2SensinactTTNApi)"))
	private ModelTransformator transformator;

	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME +  "=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ResourceSet> resourceSetServiceObjects;

	@Reference
	private TTNPackage ttnPackage;
	
	@Reference
	private TtnSensorSensinactPackage ttnSensorePackage;
	
	@Reference
	private DataUpdate sensinact;

	private List<PushStream<Message>> subscriptions = new ArrayList<>();
//	private Map<String, GenericDto> deviceRegistrationMap = new HashMap<>();

	private Map<String, Object> category = null;
	private String modelname = null;
	
	@Activate
	public void activate(BundleContext bctx, Config config) {
		String[] deviceIds = config.deviceIds();
		String topic = config.topic();
		modelname = config.modelname();
		if(!config.sensorThings_category().isEmpty()) {
			category = Map.of("sensorthings.datastream.type", config.sensorThings_category());
		}
		
		try {
			for (String deviceId : deviceIds) {
				if ("#".equals(deviceId) || "*".equals(deviceId)) {
					subscriptions.add(subscribe(topic + "#"));
				} else {
					subscriptions.add(subscribe(topic + "/" + deviceId + "/#"));
				}
			}
//			subscriptionSensors = messagingTtnSensors.subscribe(SUBSCRIPTION_TOPIC);
			subscriptions.forEach(ps -> ps.forEach(this::handleMessage));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private PushStream<Message> subscribe(String topic) throws Exception {
		logger.info("Subscribing for ttn device topic " + topic);
		return messagingTtnSensors.subscribe(topic);
	}

	@Deactivate
	public void deactivate() {
		logger.debug("deactivating TTN");
		subscriptions.forEach(s -> s.close());
	}

	public void handleMessage(Message message) {

		logger.warn("Topic " + message.topic());
		byte[] content = message.payload().array();
		logger.warn("Message" + new String(content));
		logger.debug(new String(content));

		ResourceSet resourceSet = resourceSetServiceObjects.getService();

		try {
			Resource res = resourceSet.createResource(URI.createFileURI("temp.json"));
			Map<?, ?> options = Collections.singletonMap(EMFJs.OPTION_ROOT_ELEMENT, ttnPackage.getTtnUplinkPayload());
			res.load(new ByteArrayInputStream(content), options);
			EList<EObject> contents = res.getContents();
			if (!contents.isEmpty() && contents.get(0) instanceof TtnUplinkPayload) {
				TtnUplinkPayload payload = (TtnUplinkPayload) contents.get(0);
				transformAndPublish(payload);
			}
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e.getMessage(), e);
		} finally {
			resourceSetServiceObjects.ungetService(resourceSet);
		}
	}
	
//	private void dummy() {
//		ResourceSet resourceSet = resourceSetServiceObjects.getService();
//		Resource res = resourceSet.createResource(URI.createFileURI("../../example.json"));
//		Map<?, ?> options = Collections.singletonMap(EMFJs.OPTION_ROOT_ELEMENT, ttnPackage.getTtnUplinkPayload());
//		try {
//			res.load(options);
//		EList<EObject> contents = res.getContents();
//		if (!contents.isEmpty() && contents.get(0) instanceof TtnUplinkPayload) {
//			TtnUplinkPayload payload = (TtnUplinkPayload) contents.get(0);
//			transformAndPublish(payload);
//		}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}

	private void transformAndPublish(TtnUplinkPayload payload) {
			
//					Provider push = (Provider) transformator.startTransformation(payload);
//					fixLocation(payload, push);
		sensinact.pushUpdate(createDTO(payload))
				.onFailure(t -> logger.error("Error registering device "
						+ payload.getEndDeviceIds().getDeviceId() + " " + t.getMessage(), t));
	}

	private BulkGenericDto createDTO(TtnUplinkPayload payload) {
		List<GenericDto> model = new ArrayList<>();
		Point location = new Point();
		RxMetadata rxMetadata = payload.getUplinkMessage().getRxMetadata().get(0);
		Location ttnLocation = rxMetadata.getLocation();
		location.coordinates = new Coordinates();
		location.coordinates.latitude = ttnLocation.getLatitude();
		location.coordinates.longitude = ttnLocation.getLongitude();
		location.coordinates.elevation = ttnLocation.getAltitude();

		Instant timestamp = Instant.parse(rxMetadata.getReceivedAt());
		UplinkMessage uplinkMessage = payload.getUplinkMessage();

		String theModelName = determineModelName(uplinkMessage);
		
		model.add(createGenericDto(theModelName, payload.getEndDeviceIds().getDeviceId(), "admin", "location", GeoJsonObject.class, location, timestamp, null));
		model.add(createGenericDto(theModelName, payload.getEndDeviceIds().getDeviceId(), "data", "payloadRaw", String.class, uplinkMessage.getFrmPayload(), timestamp, null));
		model.add(createGenericDto(theModelName, payload.getEndDeviceIds().getDeviceId(), "gateway", "applicationId", String.class, payload.getEndDeviceIds().getApplicationIds().getApplicationId(), timestamp, null));
		
		uplinkMessage.getDecodedPayload().forEach(e -> {
			model.add(createGenericDto(theModelName, payload.getEndDeviceIds().getDeviceId(), "data", e.getKey(), e.getValue().getClass(), e.getValue(), timestamp, category));
		});
		
		BulkGenericDto result = new BulkGenericDto();
		result.dtos = model;
		return result;
	}
	
	private String determineModelName(UplinkMessage uplinkMessage) {
		for (String key : uplinkMessage.getDecodedPayload().keySet()) {
			switch (key) {
			case "decibel": 
				return "TtnNoiseSensor";
			case "temp_SOIL": 
				return "TtnSoilMoistureSensor";
			case "PH1_SOIL": 
				return "TtnSoilMoistureAndPhSensor";
			case "TEMP_SOIL": 
				return "TtnSoilMoistureAndPhSensor";
			case "water_soil": 
				return "TtnSoilSensor";
			case "state": 
				return "TtnStateSensor";
			case "temperature": 
				return "TtnTemperatureSensor";
			default:
			}
		}
		return modelname;
	}
	
	private GenericDto createGenericDto(String model, String provider, String service, String resource, Class<?> type, Object value, Instant timestamp, Map<String, Object> metadata) {
		GenericDto dto = new GenericDto();
		dto.model = model;
		dto.provider = provider;
		dto.service = service;
		dto.resource = resource;
		dto.type = type;
		dto.value = value;
		dto.timestamp = timestamp;
		dto.metadata = getMetadata(resource);
		return dto;	
	}
	
	private Map<String, Object> getMetadata(String key){
		switch (key) {
		case "battery": 
			return Map.of("unit", "%", "sensorthings.unit.name", "%", "sensorthings.hide", "false", "sensorthings.datastream.type", "nois");
		case "decible": 
			return Map.of("unit", "dB", "sensorthings.unit.name", "dB", "sensorthings.hide", "false", "sensorthings.datastream.type", "nois");
		case "temperatureBoard": 
			return Map.of("unit", "°C", "sensorthings.unit.name", "°C", "sensorthings.hide", "false", "sensorthings.datastream.type", "nois");
		case "TEMP_SOIL": 
		case "temp_SOIL": 
			return Map.of("unit", "°C", "sensorthings.unit.name", "°C", "sensorthings.hide", "false", "sensorthings.datastream.type", "soil_moisture");
		case "PH1_SOIL": 
			return Map.of("unit", "pH", "sensorthings.unit.name", "pH", "sensorthings.hide", "false", "sensorthings.datastream.type", "soil_moisture");
		case "water_soil": 
			return Map.of("unit", "%", "sensorthings.unit.name", "%", "sensorthings.hide", "false", "sensorthings.datastream.type", "soil_moisture");
		case "conduct_soil": 
			return Map.of("unit", "EC", "sensorthings.unit.name", "EC", "sensorthings.hide", "false", "sensorthings.datastream.type", "soil_moisture");
		case "state": 
			return Map.of("sensorthings.hide", "false");
		case "temperature": 
			return Map.of("unit", "°C", "sensorthings.unit.name", "°C", "sensorthings.hide", "false", "sensorthings.datastream.type", "air_temprature");
		case "humidity ": 
			return Map.of("unit", "%", "sensorthings.unit.name", "%", "sensorthings.hide", "false", "sensorthings.datastream.type", "air_humidity");
		default:
			return Map.of("sensorthings.hide", "true");
		}
	}
	
	private void fixLocation(TtnUplinkPayload payload, Provider push) {
		Point location = new Point();
		RxMetadata rxMetadata = payload.getUplinkMessage().getRxMetadata().get(0);
		Location ttnLocation = rxMetadata.getLocation();
		location.coordinates = new Coordinates();
		location.coordinates.latitude = ttnLocation.getLatitude();
		location.coordinates.longitude = ttnLocation.getLongitude();
		location.coordinates.elevation = ttnLocation.getAltitude();
		Admin admin = push.getAdmin();
		admin.setLocation(location);
//		admin.setModelUri(EcoreUtil.getURI(push).toString());
	}

}
