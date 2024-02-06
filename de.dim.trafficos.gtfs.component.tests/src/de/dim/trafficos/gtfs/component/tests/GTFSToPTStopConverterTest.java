/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.trafficos.gtfs.component.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.text.ParseException;
import java.util.Dictionary;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.dim.trafficos.publictransport.apis.gtfs.GTFSToPTStopConverter;
import de.jena.udp.model.trafficos.publictransport.PTStop;


/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class GTFSToPTStopConverterTest {
	
	
	@InjectService
	ConfigurationAdmin configAdmin;

	@Test
	@Order(-1)
	public void testServices(@InjectService ServiceAware<GTFSToPTStopConverter> converterAware) {
		assertThat(converterAware).isNotNull();
		GTFSToPTStopConverter converter = converterAware.getService();
		assertThat(converter).isNotNull();
	}

	@Test
	public void testConvertStop(@InjectService ServiceAware<GTFSToPTStopConverter> converterAware) throws ParseException {
		assertThat(converterAware).isNotNull();
		GTFSToPTStopConverter converter = converterAware.getService();
		assertThat(converter).isNotNull();
		assertThat(configAdmin).isNotNull();
		try {
			Configuration config = configAdmin.getFactoryConfiguration("GTFSToTOSPublicTransportConverter", "pt", "?");
			Dictionary<String, Object> properties = config.getProperties();

			List<PTStop> stops = converter.convertGTFSToPTStopFromFile(System.getProperty("base.path") + "/data/"+ (String) properties.get("pathToXMLStopFolder") + "zHV_aktuell_xml.2023-07-18.xml", System.getProperty("base.path") + "/data/"+ properties.get("pathToGTFSScheduleFolder")+"stops.txt", "Jena");
			assertThat(stops).isNotNull();
			assertThat(stops).isNotEmpty();
			PTStop stop = stops.get(0);
			assertThat(stop.getStopId()).isEqualTo("de:16053:153135::15313500");
			assertThat(stop.getName()).isEqualTo("Jena, Löbstedter Straße");
			assertThat(stop.getPosition().getLatitude()).isEqualTo(50.940792000000);
			assertThat(stop.getPosition().getLongitude()).isEqualTo(11.599214000000);
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

}
