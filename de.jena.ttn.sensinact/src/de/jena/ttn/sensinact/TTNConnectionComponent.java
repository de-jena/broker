package de.jena.ttn.sensinact;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.model.core.Admin;
import org.eclipse.sensinact.model.core.Provider;
import org.eclipse.sensinact.model.core.SensiNactFactory;
import org.eclipse.sensinact.model.core.SensiNactPackage;
import org.eclipse.sensinact.prototype.PrototypePush;
import org.eclipse.sensinact.prototype.generic.dto.BulkGenericDto;
import org.eclipse.sensinact.prototype.generic.dto.GenericDto;
import org.gecko.core.pool.Pool;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.gecko.qvt.osgi.api.ConfigurableModelTransformatorPool;
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

import de.jena.model.ttn.Location;
import de.jena.model.ttn.RxMetadata;
import de.jena.model.ttn.TTNPackage;
import de.jena.model.ttn.TtnUplinkPayload;
import de.jena.model.ttn.UplinkMessage;

@Component(immediate = true, configurationPolicy = ConfigurationPolicy.REQUIRE, configurationPid = "TTNConnectionComponent")
public class TTNConnectionComponent {

	public @interface Config {
		String[] deviceIds() default {};
		String topic();
	}

	private Logger logger = LoggerFactory.getLogger(TTNConnectionComponent.class.getName());

	@Reference(name = "ttn", target = "(need=configuration)")
	private MessagingService messagingTtnSensors;
	@Reference(target = ("(pool.componentName=ttn)"))
	private ConfigurableModelTransformatorPool poolComponent;

	@Reference(target = "(emf.resource.configurator.name=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ResourceSet> resourceSetServiceObjects;

	@Reference
	private TTNPackage ttnPackage;
	
	@Reference
	PrototypePush sensinact;

	private List<PushStream<Message>> subscriptions = new ArrayList<>();
//	private Map<String, GenericDto> deviceRegistrationMap = new HashMap<>();

	@Activate
	public void activate(BundleContext bctx, Config config) {
//		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
//		executorService.scheduleAtFixedRate(this::dummy, 0, 1, TimeUnit.MINUTES);
		String[] deviceIds = config.deviceIds();
		String topic = config.topic();
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
			
		Map<String,Pool<ModelTransformator>> poolMap = poolComponent.getPoolMap();
		Pool<ModelTransformator> pool = poolMap.get("ttn-ttnPool");
		if(pool != null) {
			ModelTransformator transformator = pool.poll();
			try {
//					Provider push = (Provider) transformator.startTransformation(payload);
//					fixLocation(payload, push);
				sensinact.pushUpdate(createDTO(payload))
				.onFailure(t -> logger.error("Error registering device "
						+ payload.getEndDeviceIds().getDeviceId() + " " + t.getMessage(), t));
			} finally {
				pool.release(transformator);
			}
		}
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

		model.add(createGenericDto("TTNSensor", payload.getEndDeviceIds().getDeviceId(), "admin", "location", GeoJsonObject.class, location, timestamp));
		
		UplinkMessage uplinkMessage = payload.getUplinkMessage();
		
		model.add(createGenericDto("TTNSensor", payload.getEndDeviceIds().getDeviceId(), "data", "payloadRaw", String.class, uplinkMessage.getFrmPayload(), timestamp));
		
		uplinkMessage.getDecodedPayload().forEach(e -> {
			model.add(createGenericDto("TTNSensor", payload.getEndDeviceIds().getDeviceId(), "data", e.getKey(), e.getValue().getClass(), e.getValue(), timestamp));
		});
		
		BulkGenericDto result = new BulkGenericDto();
		result.dtos = model;
		return result;
	}
	
	private GenericDto createGenericDto(String model, String provider, String service, String resource, Class<?> type, Object value, Instant timestamp) {
		GenericDto dto = new GenericDto();
		dto.model = model;
		dto.provider = provider;
		dto.service = service;
		dto.resource = resource;
		dto.type = type;
		dto.value = value;
		dto.timestamp = timestamp;
		return dto;	
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
