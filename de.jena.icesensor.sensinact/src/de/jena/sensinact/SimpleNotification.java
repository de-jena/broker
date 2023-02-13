package de.jena.sensinact;

import org.eclipse.sensinact.prototype.notification.ResourceDataNotification;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.typedevent.TypedEventHandler;
import org.osgi.service.typedevent.propertytypes.EventTopics;

/**
 * Notified for all data events
 */
@Component
@EventTopics("DATA/*")
public class SimpleNotification implements TypedEventHandler<ResourceDataNotification> {

	@Reference(target = "(id=full)")
	MessagingService messaging;
	
	@Override
	public void notify(String topic, ResourceDataNotification event) {
		
//		System.out.println(event.timestamp + " - " + event.provider + ": " + event.oldValue + "->" + event.newValue);
	}

}