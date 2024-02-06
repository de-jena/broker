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
package de.dim.trafficos.publictransport.api.component.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;

import org.gecko.mongo.osgi.MongoDatabaseProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import com.mongodb.client.MongoDatabase;

import de.dim.trafficos.publictransport.api.component.tests.helper.PublicTransportTestHelper;
import de.dim.trafficos.publictransport.apis.PTApiScheduleService;
import de.dim.trafficos.publictransport.apis.PTStopService;
import de.dim.trafficos.publictransport.apis.PTTimetableEntryService;
import de.dim.trafficos.publictransport.apis.PTScheduleService;
import de.dim.trafficos.publictransport.apis.index.PTStopIndexService;
import de.dim.trafficos.publictransport.apis.index.PTTimetableEntryIndexService;
import de.dim.trafficos.publictransport.apis.index.PTScheduleIndexService;
import de.jena.udp.model.trafficos.publictransport.PTFrequencyType;
import de.jena.udp.model.trafficos.publictransport.PTStop;
import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;
import de.jena.udp.model.trafficos.publictransport.PTSchedule;
import de.jena.udp.model.trafficos.publictransport_api.Schedule;



/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
//@ExtendWith(ConfigurationExtension.class)
public class PTApiScheduleServiceTest {
	
	
	@Test
	public void testScheduleByDay(@InjectService(timeout=5000l) ServiceAware<PTApiScheduleService> apiScheduleAware) {
		
		assertThat(apiScheduleAware).isNotNull();
		PTApiScheduleService apiScheduleService = apiScheduleAware.getService();
		assertThat(apiScheduleService).isNotNull();
		
		List<Schedule> apiSchedules = apiScheduleService.getScheduleByDay(LocalDate.of(2023, Month.AUGUST, 2)); //Wednesday
		assertThat(apiSchedules).hasSize(1);
		
		apiSchedules = apiScheduleService.getScheduleByDay(LocalDate.of(2023, Month.AUGUST, 19)); //Saturday
		assertThat(apiSchedules).hasSize(0);
		
		apiSchedules = apiScheduleService.getScheduleByDay(LocalDate.of(2023, Month.SEPTEMBER, 16)); //Saturday but included
		assertThat(apiSchedules).hasSize(1);
		
		apiSchedules = apiScheduleService.getScheduleByDay(LocalDate.of(2023, Month.OCTOBER, 10)); //Tuesday but excluded
		assertThat(apiSchedules).hasSize(0);
		
	}
	
	
	@Test
	public void testScheduleByDayAndLine(@InjectService(timeout=5000l) ServiceAware<PTApiScheduleService> apiScheduleAware) {
		
		assertThat(apiScheduleAware).isNotNull();
		PTApiScheduleService apiScheduleService = apiScheduleAware.getService();
		assertThat(apiScheduleService).isNotNull();
		
		List<Schedule> apiSchedules = apiScheduleService.getScheduleByDayAndLine(LocalDate.of(2023, Month.AUGUST, 2), 2); //Wednesday - line 2
		assertThat(apiSchedules).hasSize(1);
		
		apiSchedules = apiScheduleService.getScheduleByDayAndLine(LocalDate.of(2023, Month.AUGUST, 2), 3); //Wednesday - line 3
		assertThat(apiSchedules).hasSize(0);		
	}
	
	@Test
	public void testScheduleByDayAndTime(@InjectService(timeout=5000l) ServiceAware<PTApiScheduleService> apiScheduleAware) {
		
		assertThat(apiScheduleAware).isNotNull();
		PTApiScheduleService apiScheduleService = apiScheduleAware.getService();
		assertThat(apiScheduleService).isNotNull();
		
		List<Schedule> apiSchedules = apiScheduleService.getScheduleByDayAndTime(LocalDate.of(2023, Month.AUGUST, 2), LocalTime.of(5, 0), LocalTime.of(8, 0)); //Wednesday - 5:00-8:00
		assertThat(apiSchedules).hasSize(1);
		
		apiSchedules = apiScheduleService.getScheduleByDayAndTime(LocalDate.of(2023, Month.AUGUST, 2), LocalTime.of(4, 0), LocalTime.of(6, 30)); //Wednesday - 4:00-6:30
		assertThat(apiSchedules).hasSize(0);		
	}
	
	@Test
	public void testScheduleByDayAndStopDHID(@InjectService(timeout=5000l) ServiceAware<PTApiScheduleService> apiScheduleAware) {
		
		assertThat(apiScheduleAware).isNotNull();
		PTApiScheduleService apiScheduleService = apiScheduleAware.getService();
		assertThat(apiScheduleService).isNotNull();
		
		List<Schedule> apiSchedules = apiScheduleService.getScheduleByDayAndStopDHID(LocalDate.of(2023, Month.AUGUST, 2),"de:test:test2"); //Wednesday - stop 2 dhid, which exists
		assertThat(apiSchedules).hasSize(1);
		
		apiSchedules = apiScheduleService.getScheduleByDayAndStopDHID(LocalDate.of(2023, Month.AUGUST, 2),"de:test:test5"); //Wednesday - non existing dhid
		assertThat(apiSchedules).hasSize(0);		
	}
	
	@Test
	public void testScheduleByDayAndStopName(@InjectService(timeout=5000l) ServiceAware<PTApiScheduleService> apiScheduleAware) {
		
		assertThat(apiScheduleAware).isNotNull();
		PTApiScheduleService apiScheduleService = apiScheduleAware.getService();
		assertThat(apiScheduleService).isNotNull();
		
		List<Schedule> apiSchedules = apiScheduleService.getScheduleByDayAndStopName(LocalDate.of(2023, Month.AUGUST, 2),"Jena Ost", "stop2"); //Wednesday - stop 1 and 2
		assertThat(apiSchedules).hasSize(1);
		
		apiSchedules = apiScheduleService.getScheduleByDayAndStopName(LocalDate.of(2023, Month.AUGUST, 2),"stop5"); //Wednesday - non existing stop
		assertThat(apiSchedules).hasSize(0);		
	}
	
	@BeforeEach
	public void beforeEach(@InjectService(cardinality = 1, timeout = 5000, filter = "(database=trafficos)") ServiceAware<MongoDatabaseProvider> dbProviderAware,
			@InjectService ServiceAware<PTStopService> stopServiceAware, 
			@InjectService ServiceAware<PTTimetableEntryService> tteServiceAware, 
			@InjectService ServiceAware<PTScheduleService> scheduleServiceAware) {
		
		assertThat(dbProviderAware.getServices()).hasSize(1);	
		MongoDatabaseProvider dbProvider = dbProviderAware.getService();
		assertThat(dbProvider).isNotNull();	
		
		MongoDatabase database = dbProvider.getDatabase();
		database.drop();
		
		PTStopService stopService = stopServiceAware.getService();
		assertThat(stopService).isNotNull();
		
		PTTimetableEntryService tteService = tteServiceAware.getService();
		assertThat(tteService).isNotNull();
		
		PTScheduleService scheduleService = scheduleServiceAware.getService();
		assertThat(scheduleService).isNotNull();
		
		PTStop stop1 = PublicTransportTestHelper.getTestPTStop("stop1", "Jena Ost", "de:test:test1", PublicTransportTestHelper.getTestPosition(50.1234, 11.6789));
		PTStop stop2 = PublicTransportTestHelper.getTestPTStop("stop2", "Jenzigweg", "de:test:test2", PublicTransportTestHelper.getTestPosition(50.58659, 11.234058));
		PTStop stop3 = PublicTransportTestHelper.getTestPTStop("stop3", "Stadtzentrum", "de:test:test3", PublicTransportTestHelper.getTestPosition(50.2849, 11.39480));
		stopService.savePTStop(stop1, stop2, stop3);
		
		PTTimetableEntry entry1 = PublicTransportTestHelper.getTestPTTimetableEntry("stop1", "scheduleId", LocalTime.of(6, 30), LocalTime.of(6, 31), 0);
		PTTimetableEntry entry2 = PublicTransportTestHelper.getTestPTTimetableEntry("stop2", "scheduleId", LocalTime.of(6, 35), LocalTime.of(6, 36), 1);
		PTTimetableEntry entry3 = PublicTransportTestHelper.getTestPTTimetableEntry("stop3", "scheduleId", LocalTime.of(6, 40), LocalTime.of(6, 41), 2);
		tteService.savePTTimetableEntry(entry1, entry2, entry3);
		
		PTSchedule schedule = PublicTransportTestHelper.getTestPTSchedule("scheduleId", "2", 2, LocalDate.of(2023, Month.JULY, 1), LocalDate.of(2023, Month.NOVEMBER, 30));
		schedule.getFrequencyDays().add(PTFrequencyType.MONDAY);
		schedule.getFrequencyDays().add(PTFrequencyType.TUESDAY);
		schedule.getFrequencyDays().add(PTFrequencyType.WEDNESDAY);
		schedule.getFrequencyDays().add(PTFrequencyType.THURSDAY);
		schedule.getFrequencyDays().add(PTFrequencyType.FRIDAY);
		schedule.getIncludedDate().add(LocalDate.of(2023, Month.SEPTEMBER, 16)); //Saturday
		schedule.getIncludedDate().add(LocalDate.of(2023, Month.SEPTEMBER, 24)); //Sunday
		schedule.getExcludedDate().add(LocalDate.of(2023, Month.OCTOBER, 9)); //Monday
		schedule.getExcludedDate().add(LocalDate.of(2023, Month.OCTOBER, 10)); //Tuesday
		scheduleService.savePTSchedule(schedule);
		
	}

	
	@AfterEach
	public void clean(@InjectService(cardinality = 1, timeout = 5000, filter = "(database=trafficos)") ServiceAware<MongoDatabaseProvider> dbProviderAware, 
			@InjectService ServiceAware<PTScheduleIndexService> scheduleIndexAware, 
			@InjectService ServiceAware<PTStopIndexService> stopIndexAware, 
			@InjectService ServiceAware<PTTimetableEntryIndexService> tteIndexAware) {
		
		assertThat(dbProviderAware.getServices()).hasSize(1);	
		MongoDatabaseProvider dbProvider = dbProviderAware.getService();
		assertThat(dbProvider).isNotNull();	
		
		MongoDatabase database = dbProvider.getDatabase();
		database.drop();
		
		assertThat(scheduleIndexAware).isNotNull();
		PTScheduleIndexService scheduleIndexService = scheduleIndexAware.getService();
		scheduleIndexService.resetIndex();
		
		assertThat(scheduleIndexAware).isNotNull();
		PTStopIndexService stopIndexService = stopIndexAware.getService();
		stopIndexService.resetIndex();
		
		assertThat(scheduleIndexAware).isNotNull();
		PTTimetableEntryIndexService tteIndexService = tteIndexAware.getService();
		tteIndexService.resetIndex();
	}

}
