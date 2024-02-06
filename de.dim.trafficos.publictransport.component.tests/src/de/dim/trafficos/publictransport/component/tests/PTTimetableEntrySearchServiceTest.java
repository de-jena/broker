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

import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

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

import de.dim.trafficos.publictransport.apis.PTTimetableEntryService;
import de.dim.trafficos.publictransport.apis.index.PTStopIndexService;
import de.dim.trafficos.publictransport.apis.search.PTTimetableEntrySearchService;
import de.dim.trafficos.publictransport.component.tests.helper.PublicTransportTestHelper;
import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;



/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class PTTimetableEntrySearchServiceTest {
	
	@Test
	public void testServices(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService(timeout=5000l) ServiceAware<PTTimetableEntryService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTTimetableEntrySearchService> searchAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTTimetableEntryService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTTimetableEntrySearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
	}
	
	@Test
	public void testSearchTTEByExistingScheduleId(@InjectService(timeout=5000l) ServiceAware<PTTimetableEntryService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTTimetableEntrySearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTTimetableEntryService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTTimetableEntrySearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		PTTimetableEntry entry = PublicTransportTestHelper.getTestPTTimetableEntry("test", LocalTime.of(6, 30), LocalTime.of(6, 31), 0);
		String scheduleId = entry.getRefScheduleId();
		service.savePTTimetableEntry(entry);
				
		List<PTTimetableEntry> entries = searchService.searchTimetableEntryBySchedule(scheduleId);
		assertThat(entries).hasSize(1);
	}
	
	@Test
	public void testSearchTTEByNonExistingScheduleId(@InjectService(timeout=5000l) ServiceAware<PTTimetableEntryService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTTimetableEntrySearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTTimetableEntryService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTTimetableEntrySearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		service.savePTTimetableEntry(PublicTransportTestHelper.getTestPTTimetableEntry("test", LocalTime.of(6, 30), LocalTime.of(6, 31), 0));
				
		List<PTTimetableEntry> entries = searchService.searchTimetableEntryBySchedule(UUID.randomUUID().toString());
		assertThat(entries).hasSize(0);
	}
	
	@Test
	public void testSearchTTEByExistingScheduleAndTime(@InjectService(timeout=5000l) ServiceAware<PTTimetableEntryService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTTimetableEntrySearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTTimetableEntryService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTTimetableEntrySearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		PTTimetableEntry entry = PublicTransportTestHelper.getTestPTTimetableEntry("test", LocalTime.of(6, 30), LocalTime.of(6, 31), 0);
		String scheduleId = entry.getRefScheduleId();
		service.savePTTimetableEntry(entry);
				
		List<PTTimetableEntry> entries = searchService.searchTimetableEntryByScheduleAndTime(scheduleId, LocalTime.of(6, 0), LocalTime.of(8, 0));
		assertThat(entries).hasSize(1);
		
		entries = searchService.searchTimetableEntryByScheduleAndTime(scheduleId, LocalTime.of(5, 0), LocalTime.of(6, 0));
		assertThat(entries).hasSize(0);
	}
	
	@Test
	public void testSearchTTEByExistingScheduleAndTimeWithDayDiff(@InjectService(timeout=5000l) ServiceAware<PTTimetableEntryService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTTimetableEntrySearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTTimetableEntryService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTTimetableEntrySearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		PTTimetableEntry entry = PublicTransportTestHelper.getTestPTTimetableEntry("test", LocalTime.of(6, 30), LocalTime.of(6, 31), 0);
		entry.setArrivalDayAfterScheduleStart(1);
		String scheduleId = entry.getRefScheduleId();
		service.savePTTimetableEntry(entry);
				
		List<PTTimetableEntry> entries = searchService.searchTimetableEntryByScheduleAndTime(scheduleId, LocalTime.of(6, 0), LocalTime.of(8, 0));
		assertThat(entries).hasSize(0); //should not find anything because the arrival day is scheduled for the day after with respect to the schedule
	}

	@Test
	public void testSearchTTEByExistingScheduleAndStop(@InjectService(timeout=5000l) ServiceAware<PTTimetableEntryService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTTimetableEntrySearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTTimetableEntryService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTTimetableEntrySearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		PTTimetableEntry entry = PublicTransportTestHelper.getTestPTTimetableEntry("test", LocalTime.of(6, 30), LocalTime.of(6, 31), 0);
		String scheduleId = entry.getRefScheduleId();
		service.savePTTimetableEntry(entry);
				
		List<PTTimetableEntry> entries = searchService.searchTimetableEntryByScheduleAndStop(scheduleId, "test");
		assertThat(entries).hasSize(1);
		
		entries = searchService.searchTimetableEntryByScheduleAndStop(scheduleId, "something else");
		assertThat(entries).hasSize(0);
	}
	
	@BeforeEach
	@AfterEach
	public void clean(@InjectService(cardinality = 1, timeout = 5000, filter = "(database=trafficos)") ServiceAware<MongoDatabaseProvider> dbProviderAware,
			@InjectService ServiceAware<PTStopIndexService> indexAware) {
		
		assertThat(dbProviderAware.getServices()).hasSize(1);	
		MongoDatabaseProvider dbProvider = dbProviderAware.getService();
		assertThat(dbProvider).isNotNull();	
		
		MongoDatabase database = dbProvider.getDatabase();
		database.drop();
		
		assertThat(indexAware).isNotNull();
		PTStopIndexService indexService = indexAware.getService();
		indexService.resetIndex();
	}
}
