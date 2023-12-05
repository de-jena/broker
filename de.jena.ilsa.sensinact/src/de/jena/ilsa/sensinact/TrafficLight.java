package de.jena.ilsa.sensinact;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.core.push.dto.GenericDto;
import org.gecko.emf.json.configuration.ConfigurableJsonResource;
import org.gecko.emf.json.configuration.ConfigurableJsonResourceFactory;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.promise.Promise;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushEvent.EventType;
import org.osgi.util.pushstream.PushStream;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.jena.udp.model.trafficos.trafficlight.TLSignalState;
import de.jena.udp.model.trafficos.trafficlight.TOSTrafficLightPackage;

@Component
public class TrafficLight {
	private static final Logger logger = System.getLogger(TrafficLight.class.getName());

	private static final String ILSA = "ilsa";
	private static final URI TEMP_URI = URI.createFileURI("temp.json");

	@Reference(target = "(id=full)")
	private MessagingService messaging;

	@Reference
	private DataUpdate sensiNact;

	@Reference
	private TOSTrafficLightPackage tosPackage;

	@Reference
	private ComponentServiceObjects<ResourceSet> resourceSetServiceObjects;

	private PushStream<Message> subcribtion;

	private Pattern topicPattern;

	private ConfigurableJsonResourceFactory rFactory;

	@Activate
	public void activate() {

		String topic = "5g/ilsa/";
		topicPattern = Pattern.compile(topic + "(\\w+)/([A-Za-z0-9-]+)/([0-9])");

		ConfigurableJsonResource configurableJsonResource = new ConfigurableJsonResource(URI.createFileURI("/"));

		ObjectMapper mapper = configurableJsonResource
				.configureMapper(Collections.singletonMap(EMFJs.OPTION_DATE_FORMAT, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'z"));

		this.rFactory = new ConfigurableJsonResourceFactory(mapper);
		try {
			subcribtion = messaging.subscribe(topic + "#");
			subcribtion.forEachEvent(this::handle);
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error subscribing mqtt {0}.\n{1}", topic, e);
		}
		logger.log(Level.INFO, "Sensinact Traffic Light started.");
	}

	@Deactivate
	private void deactivate() {
		subcribtion.close();
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

				TLSignalState transmitter = (TLSignalState) resource.getContents().get(0);

				TrafficLightDto dto = new TrafficLightDto();
				dto.model = ILSA;
				dto.intersection = intersectionId;
				dto.signalGroup = signalGroup;
				dto.resource = output;
				dto.timestamp = transmitter.getTimestamp().getTime();
				dto.data = TrafficLightState.parse(transmitter.getState()).toString();
				logger.log(Level.DEBUG, "push {0} {1}", signalGroup, dto.data);
				Promise<?> promise = sensiNact.pushUpdate(dto);
				promise.onFailure(e -> logger.log(Level.ERROR, "Error while pushing to sensinact.", e));
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
