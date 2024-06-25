package de.jena.chirpstack.sensinact.configuration;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.AttributeDefinition;

@Component(configurationPid = "ChirpstackConfig")
public class ChirpstackConfigurator {
	private static final Logger logger = System.getLogger(ChirpstackConfigurator.class.getName());

	private static final String DEVICE_FACTORY_PID = "sensinact.mqtt.device.factory";
	private static final String MQTT_PID = "sensinact.southbound.mqtt";

	@interface ChirpstackConfig {
	    @AttributeDefinition(name = "id", description = "Identifier to bind mqtt gateway to device factory")
		String id();

	    @AttributeDefinition(name = "mappingFile", description = "Absolute path to the file containing the device mapping")
		String mappingFile();

	    @AttributeDefinition(name = "protocol", description = "Network protocol to communicate with the chirpstack gateway")
		String protocol() default "ssl";

	    @AttributeDefinition(name = "host", description = "Hostname of the chirpstack gateway")
		String host();

	    @AttributeDefinition(name = "port", description = "Network port of the chirpstack gateway")
		int port();

	    @AttributeDefinition(name = "topics", description = "mqtt topics of the chirpstack applications")
		String[] topics();

	    @AttributeDefinition(name = "certPath", description = "Absolute path to the file containing the client certificate (.pem)")
		String certPath();

	    @AttributeDefinition(name = "certKey", description = "Absolute path to the file containing the client key (.key)")
		String certKey();

	    @AttributeDefinition(name = "caPath", description = "Absolute path to the file containing the ca certificate (.pem)")
		String caPath();

	    @AttributeDefinition(name = "caChainPath", description = "List of absolute paths to the files containing the ca cert chain")
		String[] caChainPath();
	}

	@Reference
	private ConfigurationAdmin configAdmin;

	@Activate
	public void activate(ChirpstackConfig config) {
		String id = config.id();
		logger.log(Level.DEBUG, "Start loading chirpstack configuration {0}", id);
		try {
			Path mappingFile = Paths.get(config.mappingFile());
			configureGateway(id, config);
			configureDeviceFactory(id, mappingFile);
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error while reading configuration from {0}", id, e);
		}
	}

	void configureDeviceFactory(String name, Path mappingFile) throws IOException {
		Configuration config = configAdmin.getFactoryConfiguration(DEVICE_FACTORY_PID, name, "?");
		String mapping = Files.readString(mappingFile);
		Dictionary<String, Object> props = new Hashtable<>();
		props.put("mqtt.handler.id", name);
		props.put("mapping", mapping);
		
		logger.log(Level.DEBUG, "Update configuration for {0} with {1}", config, props);
		config.updateIfDifferent(props);
	}

	void configureGateway(String name, ChirpstackConfig csConfig) throws IOException {
		Configuration config = configAdmin.getFactoryConfiguration(MQTT_PID, name, "?");
		Dictionary<String, Object> props = new Hashtable<>();
		props.put("id", name);
		props.put("protocol", csConfig.protocol());
		props.put("host", csConfig.host());
		props.put("port", csConfig.port());
		props.put("topics", csConfig.topics());
		props.put("auth.clientcert.path", csConfig.certPath());
		props.put("auth.clientcert.key", csConfig.certKey());
		props.put("auth.clientcert.ca.path", csConfig.caPath());
		props.put("auth.trusted.certs", csConfig.caChainPath());
		props.put("auth.allow.expired", true);

		logger.log(Level.DEBUG, "Update configuration for {0} with {1}", config, props);
		config.updateIfDifferent(props);
	}

}