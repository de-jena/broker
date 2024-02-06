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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

import de.dim.trafficos.publictransport.apis.gtfs.GTFSToPTScheduleConverter;
import de.jena.udp.model.trafficos.publictransport.PTTripDirectionType;
import de.jena.udp.model.trafficos.publictransport.PTSchedule;


/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class GTFSToPTScheduleConverterTest {

	@InjectService
	ConfigurationAdmin configAdmin;

	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");

	@Test
	@Order(-1)
	public void testServices(@InjectService ServiceAware<GTFSToPTScheduleConverter> converterAware) {
		assertThat(converterAware).isNotNull();
		GTFSToPTScheduleConverter converter = converterAware.getService();
		assertThat(converter).isNotNull();
	}

	@Test
	public void testConvertSchedule(@InjectService ServiceAware<GTFSToPTScheduleConverter> converterAware) {
		assertThat(converterAware).isNotNull();
		GTFSToPTScheduleConverter converter = converterAware.getService();
		assertThat(converter).isNotNull();
		assertThat(configAdmin).isNotNull();
		try {
			Configuration config = configAdmin.getFactoryConfiguration("GTFSToTOSPublicTransportConverter", "pt", "?");
			Dictionary<String, Object> properties = config.getProperties();
			List<PTSchedule> schedules = 
					converter.convertGTFSToPTScheduleFromFile(System.getProperty("base.path") + "/data/"+ properties.get("pathToGTFSScheduleFolder")+ "trips.txt",
							System.getProperty("base.path") + "/data/"+ properties.get("pathToGTFSScheduleFolder")+ "calendar.txt",
							System.getProperty("base.path") + "/data/"+ properties.get("pathToGTFSScheduleFolder")+ "calendar_dates.txt");
			assertThat(schedules).isNotNull();
			assertThat(schedules).isNotEmpty();
			PTSchedule schedule = schedules.get(0);
			assertThat(schedule.getScheduleId()).isEqualTo("21956434");
			assertThat(schedule.getRefRouteId()).isEqualTo("7202_3");
			assertThat(schedule.getTripDirection()).isEqualTo(PTTripDirectionType.OUTBOUND);
			assertThat(schedule.getStartDate()).isEqualTo(LocalDate.parse("20230501", DATE_TIME_FORMATTER));
			assertThat(schedule.getEndDate()).isEqualTo(LocalDate.parse("20230831", DATE_TIME_FORMATTER));
			assertThat(schedule.getExcludedDate()).isNotEmpty();
			assertThat(schedule.getExcludedDate()).hasSize(34);
			assertThat(schedule.getIncludedDate()).isEmpty();	
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
