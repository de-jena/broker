package de.jena.ilsa.sensinact;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.model.core.provider.Provider;
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

import de.jena.udp.model.trafficos.trafficlight.TLConfiguration;
import de.jena.udp.model.trafficos.trafficlight.TLSignalState;

@RequireEMFJson
@Component(immediate = true)
public class TrafficLight {

	private static final Logger logger = System.getLogger(TrafficLight.class.getName());

	private static final String TOPIC = "5g/data/ilsa/";
	private static final Pattern TOPIC_PATTERN = Pattern.compile(TOPIC + "(\\w+)/([A-Za-z0-9-]+)/([0-9])");
	private static final URI TEMP_URI = URI.createFileURI("temp.json");

	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME
			+ "=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ResourceSet> serviceObjects;
	@Reference
	private DataUpdate sensiNact;

	@Reference(target = "(transformator.id=TLSTraficLightToIlsa)")
	private ModelTransformator traf;

	@Reference(target = "(id=full)")
	private MessagingService messaging;

	@Reference
	private ComponentServiceObjects<ResourceSet> resourceSetServiceObjects;

	private PushStream<Message> subscription;

	private ConfigurableJsonResourceFactory rFactory;

	@Activate
	public void activate() {
		ConfigurableJsonResource configurableJsonResource = new ConfigurableJsonResource(URI.createFileURI("/"));
		ObjectMapper mapper = configurableJsonResource
				.configureMapper(Collections.singletonMap(EMFJs.OPTION_DATE_FORMAT, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'z"));

		this.rFactory = new ConfigurableJsonResourceFactory(mapper);
		try {
			subscription = messaging.subscribe(TOPIC + "#");
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

	private void onMessage(Message message) {
		String topic = message.topic();
		Matcher matcher = TOPIC_PATTERN.matcher(topic);
		if (matcher.find()) {
			String intersectionId = matcher.group(1);
			ResourceSet set = resourceSetServiceObjects.getService();
			try {
				Resource resource = rFactory.createResource(TEMP_URI);
				set.getResources().add(resource);

				resource.load(new ByteArrayInputStream(message.payload().array()), Collections.emptyMap());

				TLSignalState signalState = (TLSignalState) resource.getContents().get(0);

				TrafficLightDto dto = new TrafficLightDto();
				dto.intersection = intersectionId;
				dto.signal = signalState.getId();
				dto.resource = "color";
				dto.data = signalState.getState();

				logger.log(Level.INFO, "push {0} {1}", signalState.getId(), dto.data);
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
				promise.onFailure(e -> logger.log(Level.ERROR, "Error while pushing configuration to sensinact.", e));
			} catch (IOException e) {
				logger.log(Level.ERROR, "Error while parsing json.", e);
			} finally {
				resourceSetServiceObjects.ungetService(set);
			}
		} else if (topic.endsWith("thermal")) {
//			CharBuffer decode = StandardCharsets.UTF_8.decode(message.payload());
//			GenericDto dto = new GenericDto();
//			dto.model = ILSA;
//			dto.provider = "Felsenkeller";
//			dto.service = "admina";
//			dto.resource = "thermal";
//			dto.value = decode.toString();
//			dto.type = String.class;
//			logger.log(Level.INFO, "push thermal {0} ", dto.value);
//			Promise<?> promise = sensiNact.pushUpdate(dto);
//			promise.onFailure(e -> logger.log(Level.ERROR, "Error while pushing to sensinact.", e));

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

}
