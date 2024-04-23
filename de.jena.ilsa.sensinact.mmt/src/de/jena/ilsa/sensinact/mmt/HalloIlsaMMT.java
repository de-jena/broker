package de.jena.ilsa.sensinact.mmt;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.core.annotation.dto.Model;
import org.eclipse.sensinact.core.annotation.dto.ModelPackageUri;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.core.push.dto.GenericDto;
import org.eclipse.sensinact.model.core.provider.Provider;
import org.eclipse.sensinact.model.core.provider.ProviderFactory;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.json.configuration.ConfigurableJsonResource;
import org.gecko.emf.json.configuration.ConfigurableJsonResourceFactory;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.gecko.qvt.osgi.api.ModelTransformator;
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

import com.fasterxml.jackson.databind.ObjectMapper;

import de.jena.ilsa.sensinact.model.ilsa.IlsaFactory;
import de.jena.ilsa.sensinact.model.ilsa.IlsaPackage;
import de.jena.udp.model.trafficos.trafficlight.TLConfiguration;
import de.jena.udp.model.trafficos.trafficlight.TLModule;
import de.jena.udp.model.trafficos.trafficlight.TLSignal;
import de.jena.udp.model.trafficos.trafficlight.TLSignalState;
import de.jena.udp.model.trafficos.trafficlight.TOSTrafficLightFactory;
import de.jena.udp.model.trafficos.trafficlight.TOSTrafficLightPackage;

@RequireEMFJson
@Component(immediate = true)
public class HalloIlsaMMT {

	@Reference
	TOSTrafficLightPackage tlPackage;
	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME
			+ "=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ResourceSet> serviceObjects;
	@Reference
	private DataUpdate sensiNact;

	@Reference(target = "(transformator.id=TLSTraficLightToIlsa)")
	private ModelTransformator traf;

	private static final Logger logger = System.getLogger(HalloIlsaMMT.class.getName());

	private static final String ILSA = "Ilsa";
	private static final URI TEMP_URI = URI.createFileURI("temp.json");

	@Reference(target = "(id=full)")
	private MessagingService messaging;

	@Reference
	private TOSTrafficLightPackage tosPackage;

	@Reference
	private ComponentServiceObjects<ResourceSet> resourceSetServiceObjects;

	private PushStream<Message> subscription;

	private Pattern topicPattern;
	private ConfigurableJsonResourceFactory rFactory;

	@Activate
	public void activate() {

		String topic = "5g/data/ilsa/";
		topicPattern = Pattern.compile(topic + "(\\w+)/([A-Za-z0-9-]+)/([0-9])");

		ConfigurableJsonResource configurableJsonResource = new ConfigurableJsonResource(URI.createFileURI("/"));

		ObjectMapper mapper = configurableJsonResource
				.configureMapper(Collections.singletonMap(EMFJs.OPTION_DATE_FORMAT, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'z"));

		this.rFactory = new ConfigurableJsonResourceFactory(mapper);
		try {
			subscription = messaging.subscribe(topic + "#");
			subscription.forEachEvent(this::handle);
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error subscribing mqtt {0}.\n{1}", topic, e);
			
		}
		logger.log(Level.INFO, "Sensinact Traffic Light started.");
	}

	@Deactivate
	private void deactivate() {
		subscription.close();
	}

	// @Activate
	/*
	 * public void activate() throws IOException {
	 * 
	 * System.out.println("Load config"); TLConfiguration config = loadConfig();
	 * /*Ilsa ilsa = ilsaFactory.createIlsa(); // Provider Admin admin =
	 * providerFactory.createAdmin();
	 * admin.setLocation(GeoJsonBlackBox.convertToFeatureCollection(config.
	 * getGeoJson()));
	 */

	/*
	 * ilsa.setId(config.getIntersectionId()); ilsa.setAdmin(admin); //ilsa.set
	 * admin.setFriendlyName(config.getIntersectionId()); //admin.setLocation(fc);
	 * EMap<String, Service> services = ilsa.getServices();
	 * 
	 * List<TLSignal> signals = getSignals(config.getModules()); for (TLSignal
	 * tlSignal : signals) {
	 * 
	 * //FeatureCollection observedArea = tlSignal.getObservedArea(); EList<Integer>
	 * positions = tlSignal.getPositions(); String channel = tlSignal.getChannel();
	 * String id = tlSignal.getId(); TLSignalGroup signalGroup =
	 * tlSignal.getSignalGroup();
	 * 
	 * 
	 * 
	 * // EObject service = trafSignalState.doTransformation(signalState); // s und
	 * signalstate über id mappen
	 * 
	 * Signal signal = ilsaFactory.createSignal(); // Service
	 * signal.setSignalGroup(signalGroup.getId());
	 * signal.setType(tlSignal.getSignalType().getName());
	 * signal.setColor(signalState.getState()); FeatureCollection fc =
	 * GeoJsonBlackBox.convertToFeatureCollection(tlSignal.getObservedArea());
	 * signal.setOberservedArea(fc); // signal. // signal.
	 * 
	 * services.put(id, signal); } Ilsa test = traf.doTransformation(config);
	 * sensiNact.pushUpdate(test);
	 * 
	 * TLSignalState signalState = tlFactory.createTLSignalState();
	 * signalState.setState("🟢🟡");// 🔴 signalState.setId("K1/1");
	 * 
	 * StateChange atomarChange = new StateChange(); atomarChange.color =
	 * signalState.getState(); atomarChange.service = signalState.getId();
	 * 
	 * sensiNact.pushUpdate(atomarChange);
	 * 
	 * }
	 */

	@ModelPackageUri(IlsaPackage.eNS_URI)
	@Model("Ilsa")
	public class StateChange {
		@org.eclipse.sensinact.core.annotation.dto.Provider
		public String providerID;

		@org.eclipse.sensinact.core.annotation.dto.Service
		public String service;

		@org.eclipse.sensinact.core.annotation.dto.Resource("state")
		public String color;
	}

	private List<TLSignal> getSignals(EList<TLModule> modules) {
		return modules.stream().flatMap(m -> m.getSignals().stream()).collect(Collectors.toList());
	}

	/**
	 * @return
	 * @throws IOException
	 * 
	 */
	private TLConfiguration loadConfig() throws IOException {
		ResourceSet resourceSet = serviceObjects.getService();
		Resource res = resourceSet.createResource(
				URI.createFileURI("/home/markus/dev/broker/de.jena.ilsa.sensinact.mmt/config.json"),
				"application/json");
		try {
			res.load(null);
			return (TLConfiguration) res.getContents().get(0);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}
	}

	private void onMessage(Message message) {
		String topic = message.topic();
		Matcher matcher = topicPattern.matcher(topic);
		if (matcher.find()) {
			String intersectionId = matcher.group(1);
			String signalGroup = matcher.group(2);
			String output = matcher.group(3);
			ResourceSet set = resourceSetServiceObjects.getService();
			try {
				Resource resource = rFactory.createResource(TEMP_URI);
				set.getResources().add(resource);

				resource.load(new ByteArrayInputStream(message.payload().array()), Collections.emptyMap());

				TLSignalState signalState = (TLSignalState) resource.getContents().get(0);

//				StateChange stateChange = new StateChange();
//				stateChange.providerID = intersectionId;
//				stateChange.color = signalState.getState();
//				stateChange.service = signalState.getId();
			
				GenericDto dto = new GenericDto();
				dto.model = ILSA;
				dto.provider = intersectionId;
				dto.service = signalState.getId();
				dto.resource = "color";
				dto.value = signalState.getState();
				dto.type = String.class;

				logger.log(Level.INFO, "push {0} {1}", signalGroup, dto.value);
				Promise<?> promise = sensiNact.pushUpdate(dto);
				promise.onFailure(e -> logger.log(Level.ERROR, "Error while pushing to sensinact.", e));
			} catch (IOException e) {
				logger.log(Level.ERROR, "Error while parsing json.", e);
			} finally {
				resourceSetServiceObjects.ungetService(set);
				
			}
		} else if (topic.endsWith("config/retained")) {
			ResourceSet set = resourceSetServiceObjects.getService();
			try {

				Resource resource = rFactory.createResource(TEMP_URI);
				set.getResources().add(resource);

				resource.load(new ByteArrayInputStream(message.payload().array()), Collections.emptyMap());
				TLConfiguration configuration = (TLConfiguration) resource.getContents().get(0);

				Provider provider = (Provider) traf.doTransformation(configuration);
				Promise<?> promise = sensiNact.pushUpdate(provider);
				promise.onFailure(e -> {
					logger.log(Level.ERROR, "Error while pushing configuration to sensinact.", e);
				});
			} catch (IOException e) {
				logger.log(Level.ERROR, "Error while parsing json.", e);
			} finally {
				resourceSetServiceObjects.ungetService(set);
			}
		} else if (topic.endsWith("thermal")) {
			CharBuffer decode = StandardCharsets.UTF_8.decode(message.payload());
			GenericDto dto = new GenericDto();
			dto.model = ILSA;
			dto.provider = "Felsenkeller";
			dto.service = "admina";
			dto.resource = "thermal";
			dto.value = decode.toString();
			dto.type = String.class;
			logger.log(Level.INFO, "push thermal {0} ", dto.value);
			Promise<?> promise = sensiNact.pushUpdate(dto);
			promise.onFailure(e -> logger.log(Level.ERROR, "Error while pushing to sensinact.", e));

		}
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

	enum TrafficLightState {
		Red("⚪⚪🔴"), Red_Amber("⚪🟡🔴"), Amber("⚪🟡⚪"), Green("🟢⚪⚪"), Off("⚪⚪⚪");
		// 🟢🟡🔴⚪

		private String value;

		TrafficLightState(String value) {
			this.value = value;
		}

		static TrafficLightState parse(String s) {
			for (TrafficLightState state : values()) {
				if (state.value.equals(s))
					return state;
			}
			return Off;
		}
	}
}
