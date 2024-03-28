package de.jena.sensinact.mqtt.topic.bridge;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.adapter.mqtt.MQTTContext;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingContext;
import org.gecko.osgi.messaging.MessagingService;
import org.gecko.osgi.messaging.SimpleMessagingContextBuilder;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushStream;
import org.osgi.util.pushstream.ThresholdPushbackPolicy;

/**
 * Forwards messages from the incomming topics, to the ones that people are
 * allowed to read from.
 * 
 * 5g-write 5g/response/* r 
 * 5g-write 5g/Actemium w 
 * 5g-write 5g/test w 
 * 5g-write 5g/devices w 
 * 5g-read  5g/data/* r 
 * iwoms    5g/* r/w
 * 
 */
@Component(name = "MQTTBridge", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class MQTTBridge {

	private static final Logger logger = System.getLogger(MQTTBridge.class.getName());

	private List<MessagingService> messaging = new ArrayList<>();
	private List<MessagingService> senders = new ArrayList<>();

	private AtomicInteger current = new AtomicInteger(0);

	private List<String> knownTopics = new ArrayList<>();

	private List<PushStream<Message>> emSubscribe;
	private ComponentServiceObjects<MessagingService> messagingServiceObjects;
	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME
			+ "=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ResourceSet> serviceObjects;

	private String inputContentType;
	private String outputContentType;
	private Map<String, Object> inputOptions;
	private Map<String, Object> outputOptions;

	private @interface Config {
		int forwardClients() default 1;

		String[] topics();

		String inputContentType() default "application/json";

		String outputContenType() default "application/json";
	}

	@Activate
	public MQTTBridge(BundleContext bctx,
			@Reference(target = "(id=full)") ComponentServiceObjects<MessagingService> messagingServiceObjects,
			Config config, Map<String, Object> properties) {
		this.messagingServiceObjects = messagingServiceObjects;
		for (int i = 0; i < config.forwardClients(); i++) {
			senders.add(messagingServiceObjects.getService());
		}
		inputContentType = config.inputContentType();
		outputContentType = config.outputContenType();

		inputOptions = readOption(properties, "inputOptions.");
		outputOptions = readOption(properties, "outputOptions.");

		emSubscribe = new ArrayList<>();
		MessagingContext messagingContext = new SimpleMessagingContextBuilder()
				.withPushbackPolicy(ThresholdPushbackPolicy.createSimpleThresholdPushbackPolicy(600))
				.withExecutor(Executors.newCachedThreadPool()).withParallelism(4)
				.withBufferQueue(new ArrayBlockingQueue<PushEvent<? extends Message>>(4000)).build();
		Arrays.asList(config.topics()).forEach(topic -> {
			MessagingService messaging = messagingServiceObjects.getService();
			try {
				logger.log(Level.INFO, "Connecting to " + topic);
				PushStream<Message> subscribe = messaging.subscribe(topic, messagingContext);

				subscribe.onError(e -> logger.log(Level.ERROR, "Error in Pushstream ", e));
				subscribe.forEach(this::forward);
				emSubscribe.add(subscribe);
				this.messaging.add(messaging);
			} catch (Exception e) {
				logger.log(Level.ERROR, "Could not connect to topic " + topic, e);
				messagingServiceObjects.ungetService(messaging);
			}
		});
	}

	@Deactivate
	public void deactivate() {
		emSubscribe.forEach(PushStream::close);
		messaging.forEach(messagingServiceObjects::ungetService);
	}

	private Map<String, Object> readOption(Map<String, Object> properties, String prefix) {
		Map<String, Object> result = new HashMap<>();
		for (String key : properties.keySet()) {
			if (key.startsWith(prefix)) {
				result.put(key.replace(prefix, ""), properties.get(key));
			}
		}
		return result;
	}

	public void forward(Message message) {
		String topic = message.topic();
		MQTTContext context = (MQTTContext) message.getContext();
		if(!knownTopics.contains(topic)) {
			knownTopics.add(topic);
			logger.log(Level.INFO, "New Topic: " + topic + " Retained: " + context.isRetained());
		}
		
		String baseTopic = topic.substring(3);
		boolean retained = context.isRetained();
		
		if(!retained) {
			retained = BridgeUtil.isRetained(baseTopic);
		}
		String forwardTopic = "5g/data/" + baseTopic;
//		System.out.println("Forwarding from  " + topic + " to " + forwardTopic);
		try {
			int sender = current.getAndUpdate(i -> {
				if (i != senders.size() - 1) {
					i++;
				}
				return 0;
			});
			context.setRetained(retained);
			ByteBuffer inPayload = message.payload();
			ByteBuffer outPayload = convertPayload(inPayload);
			senders.get(sender).publish(forwardTopic, outPayload, context);
		} catch (Exception e) {
			logger.log(Level.ERROR, "Could not forward message from " + topic + " to " + forwardTopic, e);
		}
	}

	private ByteBuffer convertPayload(ByteBuffer inPayload) throws IOException {
		if (inputContentType.equals(outputContentType) && inputOptions.isEmpty() && outputOptions.isEmpty()) {
			return inPayload;
		} else {
			ResourceSet resourceSet = serviceObjects.getService();
			try {
				Resource inputResource = resourceSet.createResource(URI.createURI("dummy"), inputContentType);

				InputStream bai = new ByteArrayInputStream(inPayload.array());
				inputResource.load(bai, inputOptions);

				Resource outResource = resourceSet.createResource(URI.createFileURI(UUID.randomUUID().toString()),
						outputContentType);
				outResource.getContents().addAll(inputResource.getContents());

				ByteArrayOutputStream bao = new ByteArrayOutputStream();
				outResource.save(bao, outputOptions);
				return ByteBuffer.wrap(bao.toByteArray());
			} finally {
				serviceObjects.ungetService(resourceSet);
			}
		}
	}
}