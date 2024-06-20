package de.jena.sensinact.generic.mqtt.bridge;

import java.io.ByteArrayOutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.concurrent.Executors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sensinact.core.notification.ResourceDataNotification;
import org.gecko.emf.json.configuration.ConfigurableJsonResourceFactory;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.typedevent.TypedEventHandler;
import org.osgi.service.typedevent.propertytypes.EventTopics;
import org.osgi.util.promise.PromiseFactory;

import de.jena.sensinact.mqtt.generic.message.UpdateMessage;
import de.jena.sensinact.mqtt.generic.message.util.MessageUtil;

/**
 * Default forward of any Sensinact events to MQTT
 */
@Component(name = "SensninactToMQTTBridgeNotification")
@EventTopics("DATA/*")
public class SensninactToMQTTBridgeNotification implements TypedEventHandler<ResourceDataNotification> {

	private static final Logger logger = System.getLogger(SensninactToMQTTBridgeNotification.class.getName());

	@Reference(target = "(id=full)")
	MessagingService messaging;

	private PromiseFactory promiseFactory = new PromiseFactory(Executors.newCachedThreadPool());
	private ConfigurableJsonResourceFactory factory = new ConfigurableJsonResourceFactory();

	@Override
	public void notify(String topic, ResourceDataNotification event) {
		promiseFactory.submit(() -> handleNotify(topic, event));
	}

	public boolean handleNotify(String topic, ResourceDataNotification event) {
		if (logger.isLoggable(Level.DEBUG)) {
			logger.log(Level.DEBUG, "received event on topic %s", topic);
		}
		try {
			UpdateMessage update = MessageUtil
					.createUpdateMessageForType(event.newValue != null ? event.newValue.getClass() : event.type);
			update.setTimestamp(event.timestamp);
			update.setResource(event.resource);
			setValue(update, event.oldValue, "oldValue");
			setValue(update, event.newValue, "newValue");
			send(String.format("5g/data/sensinact/event/%s/%s/%s/%s", event.model, event.provider, event.service,
					event.resource), update);
		} catch (Throwable e) {
			logger.log(Level.ERROR, "Could not send update message: {0}", e.getMessage(), e);
		}
		return true;
	}

	/**
	 * @param update
	 * @param value
	 */
	private void setValue(UpdateMessage update, Object value, String name) {
		EStructuralFeature feature = update.eClass().getEStructuralFeature(name);
		update.eSet(feature, value);
	}

	private void send(String topic, EObject object) {
		if (logger.isLoggable(Level.DEBUG)) {
			logger.log(Level.DEBUG, "forwarding event on topic %s", topic);
		}

		try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			Resource resource = factory.createResource(URI.createFileURI("temp.json"));
			resource.getContents().add(object);
			resource.save(baos, Collections.singletonMap(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true));
			messaging.publish(topic, ByteBuffer.wrap(baos.toByteArray()));
		} catch (Exception e) {
			logger.log(Level.ERROR, "Could not forward event on topic " + topic, e);
		}

	}

}