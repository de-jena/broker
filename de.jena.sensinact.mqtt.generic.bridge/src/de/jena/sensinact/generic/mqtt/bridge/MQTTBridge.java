package de.jena.sensinact.generic.mqtt.bridge;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.pushstream.PushStream;

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
@Component
public class MQTTBridge {

	private static final String[] TOPICS = new String[] { "5g/devices/#", "5g/Actemium/#", "5g/test/#" };
	private static final Logger logger = System.getLogger(MQTTBridge.class.getName());

	MessagingService messaging;

	private List<PushStream<Message>> emSubscribe;

	@Activate
	public MQTTBridge(BundleContext bctx, @Reference(target = "(id=full)") MessagingService messaging) {
		this.messaging = messaging;
		emSubscribe = new ArrayList<>();
		Arrays.asList(TOPICS).forEach(topic -> {
			try {
				logger.log(Level.INFO, "Connecting to " + topic);
				PushStream<Message> subscribe = messaging.subscribe(topic);
				subscribe.forEach(this::forward);
				emSubscribe.add(subscribe);
			} catch (Exception e) {
				logger.log(Level.ERROR, "Could not connect to topic " + topic, e);
			}
		});
	}

	@Deactivate
	public void deactivate() {
		emSubscribe.forEach(PushStream::close);
	}

	public void forward(Message message) {
		String topic = message.topic();
		String forwardTopic = "5g/data/" + topic.substring(3);
		try {
			messaging.publish(forwardTopic, message.payload());
		} catch (Exception e) {
			logger.log(Level.ERROR, "Could not forward topic on %s to %s", topic, forwardTopic);
		}
	}

}