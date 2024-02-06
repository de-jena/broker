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
package de.dim.trafficos.publictransport.component.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.gecko.emf.repository.EMFRepository;
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

import de.dim.trafficos.publictransport.apis.PTStopService;
import de.dim.trafficos.publictransport.apis.PTTimetableEntryService;
import de.dim.trafficos.publictransport.apis.PTScheduleService;
import de.dim.trafficos.publictransport.apis.index.PTStopIndexService;
import de.dim.trafficos.publictransport.apis.index.PTTimetableEntryIndexService;
import de.dim.trafficos.publictransport.apis.index.PTScheduleIndexService;
import de.dim.trafficos.publictransport.apis.search.PTScheduleSearchService;
import de.dim.trafficos.publictransport.component.tests.helper.PublicTransportTestHelper;
import de.jena.udp.model.trafficos.publictransport.PTFrequencyType;
import de.jena.udp.model.trafficos.publictransport.PTStop;
import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;
import de.jena.udp.model.trafficos.publictransport.PTSchedule;



/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class PTScheduleSearchServiceTest {
	
	public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
	
	@Test
	public void testServices(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService(timeout=5000l) ServiceAware<PTScheduleService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTScheduleSearchService> searchAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTScheduleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTScheduleSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
	}
	
	@Test
	public void testSearchScheduleById(@InjectService(timeout=5000l) ServiceAware<PTScheduleService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTScheduleSearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTScheduleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTScheduleSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		PTSchedule schedule = PublicTransportTestHelper.getTestPTSchedule("2", 2, LocalDate.parse("20230707", DATE_TIME_FORMATTER).minusDays(1), LocalDate.parse("20230707", DATE_TIME_FORMATTER).plusDays(3));
		String scheduleId = schedule.getScheduleId();
		service.savePTSchedule(schedule);
				
		schedule = searchService.searchScheduleById(scheduleId);
		assertThat(schedule).isNotNull();
	}
	
	@Test
	public void testSearchScheduleByDay(@InjectService(timeout=5000l) ServiceAware<PTScheduleService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTScheduleSearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTScheduleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTScheduleSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		PTSchedule schedule = PublicTransportTestHelper.getTestPTSchedule("2", 2, LocalDate.parse("20230707", DATE_TIME_FORMATTER).minusDays(1), LocalDate.parse("20230707", DATE_TIME_FORMATTER).plusDays(3));
		service.savePTSchedule(schedule);
				
		List<PTSchedule> schedules = searchService.searchScheduleByDay(LocalDate.parse("20230707", DATE_TIME_FORMATTER));
		assertThat(schedules).hasSize(0); //The day was not in the frequency days nor in the included
	}
	
	@Test
	public void testSearchScheduleByDayWithFrequency(@InjectService(timeout=5000l) ServiceAware<PTScheduleService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTScheduleSearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTScheduleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTScheduleSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		PTSchedule schedule = PublicTransportTestHelper.getTestPTSchedule("2", 2, LocalDate.parse("20230707", DATE_TIME_FORMATTER).minusDays(1), LocalDate.parse("20230707", DATE_TIME_FORMATTER).plusDays(3));
		schedule.getFrequencyDays().add(PTFrequencyType.SATURDAY);
		schedule.getFrequencyDays().add(PTFrequencyType.SUNDAY);
		service.savePTSchedule(schedule);
				
		List<PTSchedule> schedules = searchService.searchScheduleByDay(LocalDate.parse("20230707", DATE_TIME_FORMATTER));
		assertThat(schedules).hasSize(0); //should be 0 because 20230707 was Friday and we have frequency on Saturday and Sunday
		
		schedules = searchService.searchScheduleByDay(LocalDate.parse("20230708", DATE_TIME_FORMATTER));
		assertThat(schedules).hasSize(1); 
	}
	
	@Test
	public void testSearchScheduleByDayWithIncluded(@InjectService(timeout=5000l) ServiceAware<PTScheduleService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTScheduleSearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTScheduleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTScheduleSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		PTSchedule schedule = PublicTransportTestHelper.getTestPTSchedule("2", 2, LocalDate.parse("20230707", DATE_TIME_FORMATTER).minusDays(1), LocalDate.parse("20230707", DATE_TIME_FORMATTER).plusDays(3));
		schedule.getFrequencyDays().add(PTFrequencyType.SATURDAY);
		schedule.getFrequencyDays().add(PTFrequencyType.SUNDAY);
		schedule.getIncludedDate().add(LocalDate.parse("20230707", DATE_TIME_FORMATTER));
		service.savePTSchedule(schedule);
				
		List<PTSchedule> schedules = searchService.searchScheduleByDay(LocalDate.parse("20230707", DATE_TIME_FORMATTER));
		assertThat(schedules).hasSize(1); //should be 1 because 20230707 was Friday but we added into the included dates
		
		schedules = searchService.searchScheduleByDay(LocalDate.parse("20230708", DATE_TIME_FORMATTER));
		assertThat(schedules).hasSize(1); 
	}
	
	@Test
	public void testSearchScheduleByDayWithExcluded(@InjectService(timeout=5000l) ServiceAware<PTScheduleService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTScheduleSearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTScheduleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTScheduleSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		PTSchedule schedule = PublicTransportTestHelper.getTestPTSchedule("2", 2, LocalDate.parse("20230707", DATE_TIME_FORMATTER).minusDays(1), LocalDate.parse("20230707", DATE_TIME_FORMATTER).plusDays(3));
		schedule.getFrequencyDays().add(PTFrequencyType.SATURDAY);
		schedule.getFrequencyDays().add(PTFrequencyType.SUNDAY);
		schedule.getIncludedDate().add(LocalDate.parse("20230707", DATE_TIME_FORMATTER));
		schedule.getExcludedDate().add(LocalDate.parse("20230708", DATE_TIME_FORMATTER));
		service.savePTSchedule(schedule);
				
		List<PTSchedule> schedules = searchService.searchScheduleByDay(LocalDate.parse("20230707", DATE_TIME_FORMATTER));
		assertThat(schedules).hasSize(1); //should be 1 because 20230707 was Friday but we added into the included dates
		
		schedules = searchService.searchScheduleByDay(LocalDate.parse("20230708", DATE_TIME_FORMATTER));
		assertThat(schedules).hasSize(0); //should be 0 because we added it into the excluded
	}

	@Test
	public void testSearchScheduleByDayAndLine(@InjectService(timeout=5000l) ServiceAware<PTScheduleService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTScheduleSearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTScheduleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTScheduleSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		PTSchedule schedule = PublicTransportTestHelper.getTestPTSchedule("2", 2, LocalDate.parse("20230707", DATE_TIME_FORMATTER).minusDays(1), LocalDate.parse("20230707", DATE_TIME_FORMATTER).plusDays(3));
		schedule.setRefRouteNumber(7);
		schedule.getFrequencyDays().add(PTFrequencyType.FRIDAY);
		service.savePTSchedule(schedule);
				
		List<PTSchedule> schedules = searchService.searchScheduleByDayAndLine(LocalDate.parse("20230707", DATE_TIME_FORMATTER), 7);
		assertThat(schedules).hasSize(1);
		
		schedules = searchService.searchScheduleByDayAndLine(LocalDate.parse("20230707", DATE_TIME_FORMATTER), 8);
		assertThat(schedules).hasSize(0);
		
		schedule = PublicTransportTestHelper.getTestPTSchedule("2", 2, LocalDate.parse("20230707", DATE_TIME_FORMATTER).minusDays(1), LocalDate.parse("20230707", DATE_TIME_FORMATTER).plusDays(3));
		schedule.setRefRouteNumber(8);
		schedule.getFrequencyDays().add(PTFrequencyType.FRIDAY);
		service.savePTSchedule(schedule);
		
		schedules = searchService.searchScheduleByDayAndLine(LocalDate.parse("20230707", DATE_TIME_FORMATTER), 8);
		assertThat(schedules).hasSize(1);
		
		schedules = searchService.searchScheduleByDayAndLine(LocalDate.parse("20230707", DATE_TIME_FORMATTER), 7, 8);
		assertThat(schedules).hasSize(2);
	}
	
	@Test
	public void testSearchScheduleByDayAndTime(@InjectService(timeout=5000l) ServiceAware<PTScheduleService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTTimetableEntryService> tteAware,
			@InjectService(timeout=5000l) ServiceAware<PTScheduleSearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTScheduleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTScheduleSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		PTTimetableEntryService tteService = tteAware.getService();
		assertThat(tteService).isNotNull();
		
		PTSchedule schedule = PublicTransportTestHelper.getTestPTSchedule("2", 2, LocalDate.parse("20230707", DATE_TIME_FORMATTER).minusDays(1), LocalDate.parse("20230707", DATE_TIME_FORMATTER).plusDays(3));
		schedule.getFrequencyDays().add(PTFrequencyType.FRIDAY);
		service.savePTSchedule(schedule);
		
		PTTimetableEntry entry1 = PublicTransportTestHelper.getTestPTTimetableEntry("stopRef1", LocalTime.of(6, 35), LocalTime.of(6, 36), 0);
		entry1.setRefScheduleId(schedule.getScheduleId());
		PTTimetableEntry entry2 = PublicTransportTestHelper.getTestPTTimetableEntry("stopRef2", LocalTime.of(6, 40), LocalTime.of(6, 40), 1);
		entry2.setRefScheduleId(schedule.getScheduleId());
		PTTimetableEntry entry3 = PublicTransportTestHelper.getTestPTTimetableEntry("stopRef3", LocalTime.of(6, 45), LocalTime.of(6, 45), 2);
		entry3.setRefScheduleId(schedule.getScheduleId());
		tteService.savePTTimetableEntry(entry1, entry2, entry3);
				
		List<PTSchedule> schedules = searchService.searchScheduleByDayAndTime(LocalDate.parse("20230707", DATE_TIME_FORMATTER), LocalTime.of(6, 00), LocalTime.of(7, 00));
		assertThat(schedules).hasSize(1);
		
		schedules = searchService.searchScheduleByDayAndTime(LocalDate.parse("20230707", DATE_TIME_FORMATTER), LocalTime.of(7, 00), LocalTime.of(8, 00));
		assertThat(schedules).hasSize(0);
	}
	
	@Test
	public void testSearchScheduleByDayAndStopDHID(@InjectService(timeout=5000l) ServiceAware<PTScheduleService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTTimetableEntryService> tteAware,
			@InjectService(timeout=5000l) ServiceAware<PTStopService> stopAware,
			@InjectService(timeout=5000l) ServiceAware<PTScheduleSearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTScheduleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTScheduleSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		PTTimetableEntryService tteService = tteAware.getService();
		assertThat(tteService).isNotNull();
		
		PTStopService stopService = stopAware.getService();
		assertThat(stopService).isNotNull();
		
		PTSchedule schedule = PublicTransportTestHelper.getTestPTSchedule("2", 2, LocalDate.parse("20230707", DATE_TIME_FORMATTER).minusDays(1), LocalDate.parse("20230707", DATE_TIME_FORMATTER).plusDays(3));
		schedule.getFrequencyDays().add(PTFrequencyType.FRIDAY);
		service.savePTSchedule(schedule);
		
		PTStop stop1 = PublicTransportTestHelper.getTestPTStop("stop1", "de:test:test1", PublicTransportTestHelper.getTestPosition(50.1234, 11.1235));
		PTStop stop2 = PublicTransportTestHelper.getTestPTStop("stop2", "de:test:test2", PublicTransportTestHelper.getTestPosition(50.3755, 11.2355));
		PTStop stop3 = PublicTransportTestHelper.getTestPTStop("stop3", "de:test:test3", PublicTransportTestHelper.getTestPosition(50.7829, 11.3928));
		stopService.savePTStop(stop1, stop2, stop3);
		
		PTTimetableEntry entry1 = PublicTransportTestHelper.getTestPTTimetableEntry(stop1.getStopId(), LocalTime.of(6, 35), LocalTime.of(6, 36), 0);
		entry1.setRefScheduleId(schedule.getScheduleId());
		PTTimetableEntry entry2 = PublicTransportTestHelper.getTestPTTimetableEntry(stop2.getStopId(), LocalTime.of(6, 40), LocalTime.of(6, 40), 1);
		entry2.setRefScheduleId(schedule.getScheduleId());
		PTTimetableEntry entry3 = PublicTransportTestHelper.getTestPTTimetableEntry(stop3.getStopId(), LocalTime.of(6, 45), LocalTime.of(6, 45), 2);
		entry3.setRefScheduleId(schedule.getScheduleId());
		tteService.savePTTimetableEntry(entry1, entry2, entry3);
				
		List<PTSchedule> schedules = searchService.searchScheduleByDayAndStopDHIds(LocalDate.parse("20230707", DATE_TIME_FORMATTER), "de:test:test2");
		assertThat(schedules).hasSize(1);
		
		schedules = searchService.searchScheduleByDayAndStopDHIds(LocalDate.parse("20230707", DATE_TIME_FORMATTER), "de:test:test2", "de:test:test3");
		assertThat(schedules).hasSize(1);
		
		schedules = searchService.searchScheduleByDayAndStopDHIds(LocalDate.parse("20230707", DATE_TIME_FORMATTER), "de:test:test5");
		assertThat(schedules).hasSize(0);
	}
	
	@Test
	public void testSearchScheduleByDayAndStopName(@InjectService(timeout=5000l) ServiceAware<PTScheduleService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTTimetableEntryService> tteAware,
			@InjectService(timeout=5000l) ServiceAware<PTStopService> stopAware,
			@InjectService(timeout=5000l) ServiceAware<PTScheduleSearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTScheduleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTScheduleSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		PTTimetableEntryService tteService = tteAware.getService();
		assertThat(tteService).isNotNull();
		
		PTStopService stopService = stopAware.getService();
		assertThat(stopService).isNotNull();
		
		PTSchedule schedule = PublicTransportTestHelper.getTestPTSchedule("2", 2, LocalDate.parse("20230707", DATE_TIME_FORMATTER).minusDays(1), LocalDate.parse("20230707", DATE_TIME_FORMATTER).plusDays(3));
		schedule.getFrequencyDays().add(PTFrequencyType.FRIDAY);
		service.savePTSchedule(schedule);
		
		PTStop stop1 = PublicTransportTestHelper.getTestPTStop("stop1", "de:test:test1", PublicTransportTestHelper.getTestPosition(50.1234, 11.1235));
		PTStop stop2 = PublicTransportTestHelper.getTestPTStop("stop2", "de:test:test2", PublicTransportTestHelper.getTestPosition(50.3755, 11.2355));
		PTStop stop3 = PublicTransportTestHelper.getTestPTStop("stop3", "de:test:test3", PublicTransportTestHelper.getTestPosition(50.7829, 11.3928));
		stopService.savePTStop(stop1, stop2, stop3);
		
		PTTimetableEntry entry1 = PublicTransportTestHelper.getTestPTTimetableEntry(stop1.getStopId(), LocalTime.of(6, 35), LocalTime.of(6, 36), 0);
		entry1.setRefScheduleId(schedule.getScheduleId());
		PTTimetableEntry entry2 = PublicTransportTestHelper.getTestPTTimetableEntry(stop2.getStopId(), LocalTime.of(6, 40), LocalTime.of(6, 40), 1);
		entry2.setRefScheduleId(schedule.getScheduleId());
		PTTimetableEntry entry3 = PublicTransportTestHelper.getTestPTTimetableEntry(stop3.getStopId(), LocalTime.of(6, 45), LocalTime.of(6, 45), 2);
		entry3.setRefScheduleId(schedule.getScheduleId());
		tteService.savePTTimetableEntry(entry1, entry2, entry3);
				
		List<PTSchedule> schedules = searchService.searchScheduleByDayAndStopNames(LocalDate.parse("20230707", DATE_TIME_FORMATTER), "stop2");
		assertThat(schedules).hasSize(1);
		
		schedules = searchService.searchScheduleByDayAndStopNames(LocalDate.parse("20230707", DATE_TIME_FORMATTER), "stop1", "stop3");
		assertThat(schedules).hasSize(1);
		
		schedules = searchService.searchScheduleByDayAndStopNames(LocalDate.parse("20230707", DATE_TIME_FORMATTER), "stop5");
		assertThat(schedules).hasSize(0);
	}

	@BeforeEach
	@AfterEach
	public void clean(@InjectService(cardinality = 1, timeout = 5000, filter = "(database=trafficos)") ServiceAware<MongoDatabaseProvider> dbProviderAware,
			@InjectService ServiceAware<PTScheduleIndexService> scheduleIndexAware, @InjectService ServiceAware<PTStopIndexService> stopIndexAware, 
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
