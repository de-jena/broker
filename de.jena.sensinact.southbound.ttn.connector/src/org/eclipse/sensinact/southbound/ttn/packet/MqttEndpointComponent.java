package org.eclipse.sensinact.southbound.ttn.packet;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emfcloud.jackson.databind.EMFContext;
import org.eclipse.sensinact.prototype.PrototypePush;
import org.eclipse.sensinact.prototype.generic.dto.GenericDto;
import org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload;
import org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage;
import org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadPackage;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.util.pushstream.PushStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.gecko.emf.json.constants.EMFJs;
import org.osgi.service.component.ComponentServiceObjects;

@Component(immediate = true, configurationPolicy = ConfigurationPolicy.REQUIRE, configurationPid = "MqttEndpointComponent")
public class MqttEndpointComponent {

	public @interface Config {
		String[] deviceIds() default {};
	}

	private Logger logger = LoggerFactory.getLogger(MqttEndpointComponent.class.getName());
	
	@Reference(name="ttn", target = "(need=configuration)")
	private MessagingService messagingTtnSensors;

	@Reference
	private UplinkPayloadPackage uplinkPackage;
	
	@Reference(target="(emf.resource.configurator.name=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ResourceSet> resourceSetServiceObjects;
	
	@Reference
	private UplinkPayloadPackage uplinkPayloadPackage;
	
	@Reference
	PrototypePush prototypePushService;
	
	private List<PushStream<Message>> subscriptions = new ArrayList<>();
	private Map<String, GenericDto> deviceRegistrationMap = new HashMap<>();

	private static final String SUBSCRIPTION_TOPIC = "v3/scj-sensors-01@ttn/devices/";

	@Activate
	public void activate(BundleContext bctx, Config config) {
		String[] deviceIds = config.deviceIds();
		try {
			for(String deviceId : deviceIds) {
				if("#".equals(deviceId) || "*".equals(deviceId)) {
					subscriptions.add(subscribe(SUBSCRIPTION_TOPIC+"#"));
				} else {
					subscriptions.add(subscribe(SUBSCRIPTION_TOPIC+"/" + deviceId + "/#"));
				}
			}
//			subscriptionSensors = messagingTtnSensors.subscribe(SUBSCRIPTION_TOPIC);
			subscriptions.forEach(ps -> ps.forEach(this::handleMessage));

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private PushStream<Message> subscribe(String topic) throws Exception{
		logger.info("Subscribing for ttn device topic " + topic);
		return messagingTtnSensors.subscribe(topic);
	}
	
	@Deactivate
	public void deactivate() {
		logger.debug("deactivating TTN");
		subscriptions.forEach(s -> s.close());
	}
	
	public void handleMessage(Message message) {

		logger.warn("Topic " +  message.topic());
		byte[] content = message.payload().array();
		logger.warn("Message" +  new String(content));
		logger.debug(new String(content));

		ResourceSet resourceSet = resourceSetServiceObjects.getService();
		
		try {
			Resource res = resourceSet.createResource(URI.createFileURI("temp.json"));
			Map<?, ?> options = Collections.singletonMap(EMFJs.OPTION_ROOT_ELEMENT, uplinkPayloadPackage.getTtnUplinkPayload());
			res.load(new ByteArrayInputStream(content), options);
			if(!res.getContents().isEmpty()) {
				EObject eObj = res.getContents().get(0);
				if(eObj instanceof TtnUplinkPayload) {
					TtnUplinkPayload payload = (TtnUplinkPayload) eObj;
					if(deviceRegistrationMap.get(payload.getEndDeviceIds().getDeviceId()) == null) {
						GenericDto genericDTO = createGenericDTO(payload);
						try {
							prototypePushService.pushUpdate(genericDTO)
								.onFailure(t -> logger.error("Error registering device " + payload.getEndDeviceIds().getDeviceId() + " "  + t.getMessage()))
								.getValue();
							deviceRegistrationMap.put(payload.getEndDeviceIds().getDeviceId(), genericDTO);
						} catch (InvocationTargetException | InterruptedException e) {
							e.printStackTrace();
						}
					}
//					List<? extends AbstractUpdateDto> updateDTOs = createDTOs(payload);
//					updateDTOs.forEach(prototypePushService::pushUpdate);
					SoilDto soilDto = createSoilDTO(payload);
					prototypePushService.pushUpdate(soilDto);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e.getMessage(),e);
		} finally {
			resourceSetServiceObjects.ungetService(resourceSet);
		}
	}
	
	private SoilDto createSoilDTO(TtnUplinkPayload payload) {
		
		UplinkMessage msg = payload.getUplinkMessage();
		EMap<String, Object> decodedPayload = msg.getDecodedPayload();
		SoilDto soilDto = new SoilDto();
		soilDto.provider = payload.getEndDeviceIds().getDeviceId();
		LocalDateTime dateTime = LocalDateTime.parse(payload.getReceivedAt());
		Timestamp timestamp = Timestamp.valueOf(dateTime);
		soilDto.timestamp = timestamp.getTime();
		if(decodedPayload.containsKey("Bat")) {
			soilDto.battery = (double) decodedPayload.get("Bat");
		}
//		if(decodedPayload.containsKey("TempC_DS18B20")) {
//			soilDto.battery = (double) decodedPayload.get("TempC_DS18B20");
//		}
		if(decodedPayload.containsKey("conduct_SOIL")) {
			soilDto.conductivity = (int) decodedPayload.get("conduct_SOIL");
		}
		if(decodedPayload.containsKey("temp_SOIL")) {
			soilDto.temperature = Double.parseDouble((String)decodedPayload.get("temp_SOIL"));
		}
		if(decodedPayload.containsKey("water_SOIL")) {
			soilDto.water = Double.parseDouble((String)decodedPayload.get("water_SOIL"));
		}
		return soilDto;
	}

	private GenericDto createGenericDTO(TtnUplinkPayload payload) {
		GenericDto genericDto = new GenericDto();
		genericDto.provider = payload.getEndDeviceIds().getDeviceId();
		genericDto.service = "admin";
		genericDto.resource = "friendlyName";
		genericDto.value = payload.getEndDeviceIds().getDeviceId();		
		genericDto.type = String.class;
		return genericDto;
	}

//	private List<? extends AbstractUpdateDto> createDTOs(TtnUplinkPayload payload) {
//		Objects.requireNonNull(payload, () -> "TtnUplinkPayload cannot be null!");
//		UplinkMessage uplinkMessage = payload.getUplinkMessage();
//		Objects.requireNonNull(uplinkMessage, () -> "UplinkMessage cannot be null!");
//		List<MetadataUpdateDto> metadataDTOs = new ArrayList<>();
//		List<RxMetadata> rxMetadata = uplinkMessage.getRxMetadata();
//		rxMetadata.forEach(mt -> {
//			MetadataUpdateDto metadataDTO = new MetadataUpdateDto();
//			mt.eClass().getEAllStructuralFeatures().stream().forEach(sf -> {
//				metadataDTO.provider = payload.getEndDeviceIds().getDeviceId();
//				metadataDTO.timestamp = Instant.parse(payload.getReceivedAt());
//				metadataDTO.service = payload.getEndDeviceIds().getDevAddr(); //I have no idea what to put here!
//				metadataDTO.resource = sf.getName();
//				metadataDTO.metadata.put(sf.getName(), mt.eGet(sf));
//			});			
//			metadataDTOs.add(metadataDTO);
//		});
//		
//		List<DataUpdateDto> dataUpdateDTOs = new ArrayList<>();
//		EMap<String, Object> decodedPayload = uplinkMessage.getDecodedPayload();
//		if(decodedPayload != null) {
//			decodedPayload.forEach(entry -> {
//				DataUpdateDto dataUpdateDTO = new DataUpdateDto();
//				dataUpdateDTO.data = entry.getValue();
//				dataUpdateDTO.type = entry.getValue().getClass();
//				dataUpdateDTO.resource = entry.getKey();
//				dataUpdateDTO.provider = payload.getEndDeviceIds().getDeviceId();
//				dataUpdateDTO.timestamp = Instant.parse(payload.getReceivedAt());
//				dataUpdateDTO.service = payload.getEndDeviceIds().getDevAddr(); //I have no idea what to put here!
//				dataUpdateDTOs.add(dataUpdateDTO);
//			});
//		}
//		
//		List<AbstractUpdateDto> updateDTOs = new ArrayList<>();
//		updateDTOs.addAll(metadataDTOs);
//		updateDTOs.addAll(dataUpdateDTOs);
//		return updateDTOs;
//	}
}
