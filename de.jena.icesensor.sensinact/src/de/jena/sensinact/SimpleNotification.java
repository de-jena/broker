package de.jena.sensinact;

import org.eclipse.sensinact.prototype.notification.ResourceDataNotification;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.typedevent.TypedEventHandler;
import org.osgi.service.typedevent.propertytypes.EventTopics;

/**
 * Notified for all data events
 */
@Component
@EventTopics("DATA/*")
public class SimpleNotification implements TypedEventHandler<ResourceDataNotification> {

	@Override
	public void notify(String topic, ResourceDataNotification event) {
		System.out.println(event.timestamp + " - " + event.provider + ": " + event.oldValue + "->" + event.newValue);
	}

}