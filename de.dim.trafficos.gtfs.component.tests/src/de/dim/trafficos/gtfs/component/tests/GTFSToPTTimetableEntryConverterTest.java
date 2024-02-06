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
import java.time.LocalTime;
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

import de.dim.trafficos.publictransport.apis.gtfs.GTFSToPTTimetableEntryConverter;
import de.jena.udp.model.trafficos.publictransport.PTPickUpDropOffType;
import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;


/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class GTFSToPTTimetableEntryConverterTest {

	@InjectService
	ConfigurationAdmin configAdmin;

	@Test
	@Order(-1)
	public void testServices(@InjectService ServiceAware<GTFSToPTTimetableEntryConverter> converterAware) {
		assertThat(converterAware).isNotNull();
		GTFSToPTTimetableEntryConverter converter = converterAware.getService();
		assertThat(converter).isNotNull();
	}

	@Test
	public void testConvertTimetableEntry(@InjectService ServiceAware<GTFSToPTTimetableEntryConverter> converterAware) {
		assertThat(converterAware).isNotNull();
		GTFSToPTTimetableEntryConverter converter = converterAware.getService();
		assertThat(converter).isNotNull();
		assertThat(configAdmin).isNotNull();
		try {
			Configuration config = configAdmin.getFactoryConfiguration("GTFSToTOSPublicTransportConverter", "pt", "?");
			Dictionary<String, Object> properties = config.getProperties();
			List<PTTimetableEntry> entries = converter.convertGTFSToPTTimetableEntryFromFile(System.getProperty("base.path") + "/data/"+ properties.get("pathToGTFSScheduleFolder")+ "stop_times.txt");
			assertThat(entries).isNotNull();
			assertThat(entries).isNotEmpty();
			PTTimetableEntry entry = entries.get(0);
			assertThat(entry.getRefScheduleId()).isEqualTo("21956434");
			assertThat(entry.getRefStopId()).isEqualTo("de:16053:153093::15309300");
			assertThat(entry.getEntryIndex()).isEqualTo(0);
			assertThat(entry.getScheduledArrivalTime()).isEqualTo(LocalTime.parse("06:15:00"));
			assertThat(entry.getScheduledDepartureTime()).isEqualTo(LocalTime.parse("06:15:00"));
			assertThat(entry.getPickUpType()).isEqualTo(PTPickUpDropOffType.REGULARLY_SCHEDULED);
			assertThat(entry.getDropOffType()).isEqualTo(PTPickUpDropOffType.REGULARLY_SCHEDULED);
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

}
