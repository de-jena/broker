package de.jena.traficam.config;

import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.file.Path;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ConfigurationUpdater {
	private static final Logger logger = System.getLogger(ConfigurationUpdater.class.getName());

	private static final Path CONFIG_PATH = Path.of("/opt/osgi/traficam.json");
	
	private static final String CLIENT_PID = "TrafiCamWSC"; 
	private static final String READER_PID = "TrafiCamReader"; 
	private static final String SENDER_PID = "TrafiCamSender"; 
	private static final String MQTT_PID = "MQTTService"; 

	@Reference
	private ConfigurationAdmin configAdmin;

	@Activate
	public void activate() {
		logger.log(Level.INFO,"Start configuration updater for {0}", CONFIG_PATH);
		try {
			File file = CONFIG_PATH.toFile();
			if (file.exists()) {
				@SuppressWarnings("unchecked")
				Map<String, List<Map<String,String>>> configMap = new ObjectMapper().readValue(file, HashMap.class);
				configMap.forEach((pid, p) -> updateConfig(pid, p));
			} else {
				logger.log(Level.INFO,"Configuration file {0} is missing.", CONFIG_PATH);
			}

		} catch (Exception e) {
			logger.log(Level.ERROR,"Error while reading configuration from {0}", CONFIG_PATH, e);
		}
	}

	private void updateConfig(String pid, List<Map<String,String>> list) {
		try {
			for (Map<String, String> map : list) {
				String id = map.get("id");
				configureMQTT(id, map);
				configureClient(id, map);
				configureReader(id, map);
				configureSender(id, map);
//				Configuration config = configAdmin.getFactoryConfiguration(pid, id, "?");
//				Dictionary<String, Object> props = new Hashtable<>(map);
//				logger.log(Level.INFO,"Update configuration for {0} with {1}", config, props);
//				config.updateIfDifferent(props);
				
			}
		} catch (IOException e) {
			logger.log(Level.ERROR,"Error while update configuration from {0}", CONFIG_PATH, e);
		}
	}
	
	void configureClient(String name, Map<String, String> map) throws IOException {
		Configuration config = configAdmin.getFactoryConfiguration(CLIENT_PID, name, "?");
		Dictionary<String, Object> props = new Hashtable<>(map);
		props.put("reader.target", "(id=" + name + ")");
		logger.log(Level.INFO,"Update configuration for {0} with {1}", config, props);
		config.updateIfDifferent(props);
	}
	
	void configureSender(String name, Map<String, String> map) throws IOException {
		Configuration config = configAdmin.getFactoryConfiguration(SENDER_PID, name, "?");
		Dictionary<String, Object> props = new Hashtable<>(map);
		props.put("trafficReader.target", "(id=" + name + ")");
		props.put("messaging.target", "(id=" + name + ")");
		logger.log(Level.INFO,"[{0}] Update sender configuration for {1} with {2}", name, config, props);
		config.updateIfDifferent(props);
	}
	
	void configureReader(String name, Map<String, String> map) throws IOException {
		Configuration config = configAdmin.getFactoryConfiguration(READER_PID, name, "?");
		Dictionary<String, Object> props = new Hashtable<>(map);
		logger.log(Level.INFO,"Update configuration for {0} with {1}", config, props);
		config.updateIfDifferent(props);
		
	}
	
//	"MQTTService~full":
//	{
//		"id" : "full",
//		"brokerUrl" : "ssl://$[env:MQTT_FULL_HOST;default=mqttbr.jena.de]:$[env:MQTT_FULL_PORT;default=8883]",
//		"username" : "$[env:MQTT_FULL_USER;default=]",
//		".password" : "$[env:MQTT_FULL_PWD;default=]",
//		"topic": "5g/ilsa/#"
//	}
	void configureMQTT(String name, Map<String, String> map) throws IOException {
		Configuration config = configAdmin.getFactoryConfiguration(MQTT_PID, name, "?");
		Dictionary<String, Object> props = new Hashtable<>();
		props.put("id", name);
		props.put("brokerUrl", "ssl://$[env:MQTT_FULL_HOST;default=mqttbr.jena.de]:$[env:MQTT_FULL_PORT;default=8883]");
		props.put("username", "$[env:MQTT_FULL_USER;default=]");
		props.put(".password", "$[env:MQTT_FULL_PWD;default=]");
		props.put("topic", "5g/ilsa/#");
		props.put("maxThreads", "4");
		logger.log(Level.INFO,"Update configuration for {0} with {1}", config, props);
		config.updateIfDifferent(props);
		
	}
	
	
}