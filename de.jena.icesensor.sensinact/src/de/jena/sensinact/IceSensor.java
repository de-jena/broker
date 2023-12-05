package de.jena.sensinact;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import org.eclipse.sensinact.core.push.DataUpdate;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushEvent.EventType;
import org.osgi.util.pushstream.PushStream;

import de.jena.icesensor.api.IceSensorService;
import de.jena.model.icesensor.SensorData;

@Component(immediate = true)
public class IceSensor {
	private static final Logger logger = System.getLogger(IceSensor.class.getName());

	@Reference
	private IceSensorService service;

	@Reference
	private DataUpdate sensiNact;

	private PushStream<SensorData> subcribtion;

	@Activate
	public void activate() {

		subcribtion = service.subcribe();
		subcribtion.forEachEvent(this::handle);
		logger.log(Level.INFO, "Sensinact IceSensor started.");
	}

	@Deactivate
	private void deactivate() {
		subcribtion.close();
	}

	private void onMessage(SensorData iceSENSOR) {
		try {
			sensiNact.pushUpdate(iceSENSOR);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private long handle(PushEvent<? extends SensorData> event) {
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
