package de.jena.sensinact.mqtt.topic.bridge;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingContext;
import org.gecko.osgi.messaging.MessagingService;
import org.gecko.osgi.messaging.SimpleMessagingContextBuilder;
import org.gecko.util.pushstreams.GeckoPushbackPolicyOption;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushStream;

import de.jena.mqtt.message.adapter.MQTTContext;

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
@Component(name = "MQTTBridge",  configurationPolicy = ConfigurationPolicy.REQUIRE)
public class MQTTBridge {

	private static final Logger logger = System.getLogger(MQTTBridge.class.getName());

	private List<MessagingService> messaging = new ArrayList<>();
	private List<MessagingService> senders = new ArrayList<>();

	private AtomicInteger current = new AtomicInteger(0);
	
	private List<String> knownTopics = new ArrayList<>();
	
	private List<PushStream<Message>> emSubscribe;
	private ComponentServiceObjects<MessagingService> messagingServiceObjects;

	private @interface Config {
		String[] topics();
		int forwardClients() default 1;
	}
	
	@Activate
	public MQTTBridge(BundleContext bctx, @Reference(target = "(id=full)") ComponentServiceObjects<MessagingService> messagingServiceObjects, Config config) {
		this.messagingServiceObjects = messagingServiceObjects;
		for(int i = 0; i < config.forwardClients(); i++) {
			senders.add(messagingServiceObjects.getService());
		}
		emSubscribe = new ArrayList<>();
		 MessagingContext messagingContext = new SimpleMessagingContextBuilder().
			withPushbackPolicy(GeckoPushbackPolicyOption.LINEAR_AFTER_THRESHOLD.getPolicy(600))
			.withExecutor(Executors.newCachedThreadPool())
			.withParallelism(4)
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

	public void forward(Message message) {
		String topic = message.topic();
		MQTTContext context = (MQTTContext) message.getContext();
		if(!knownTopics.contains(topic)) {
			knownTopics.add(topic);
			logger.log(Level.INFO, "New Topic: " + topic + " Retained: " + context.isRetained());
		}
		
		String forwardTopic = "5g/data/" + topic.substring(3);
//		System.out.println("Forwardning from  " + topic + " to " + forwardTopic);
		try {
			int sender = current.getAndUpdate(i -> {
				if(i != senders.size() -1){
					i++;
				}
				return 0;
			});
			senders.get(sender).publish(forwardTopic, message.payload(), context);
		} catch (Exception e) {
			logger.log(Level.ERROR, "Could not forward message from " + topic + " to " +  forwardTopic, e);
		}
	}

}