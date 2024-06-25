package de.jena.traficam.mqtt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.jena.traficam.api.TrafiCamConfig;

@Component(configurationPid = "TrafiCamSender")
public class CPUTemp {
	private static final Logger logger = System.getLogger(CPUTemp.class.getName());

	private static final String FILE = "/sys/class/thermal/thermal_zone0/temp";
	private static final List<Integer> values = new ArrayList<>();
	@Reference(target = "(id=full)")
	private MessagingService messaging;

	private ScheduledExecutorService executor;

	private String topic;

	@Activate
	public void activate(TrafiCamConfig config) {
		String intersectionId = config.id();
		topic = "5g/admin/" + intersectionId + "/thermal";
		executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(this::checkTemp, 0, 2, TimeUnit.MINUTES);
	}

	@Deactivate
	public void deactivate() {
		executor.shutdown();
	}

	private void checkTemp() {

		try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
			int value = Integer.parseInt(br.readLine());
			values.add(value);
			int total = values.stream().mapToInt(Integer::valueOf).sum();
			logger.log(Level.INFO, "Now: {0}°C - Average: {1}°C - Number of measurements: {2}", toCelsius(value), toCelsius(total / values.size()),values.size());
			sendMqtt(value);
		} catch (Exception e) {
			logger.log(Level.INFO, "Error during temperature check: ",e);
		}

	}

	private void sendMqtt(int value) throws Exception {
		ByteBuffer buffer = ByteBuffer.wrap(("" + toCelsius(value)).getBytes());
		messaging.publish(topic, buffer);
	}

	private double toCelsius(int value) {
		return value / 1000d;
	}
}