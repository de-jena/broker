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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;
import java.util.UUID;

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
import de.dim.trafficos.publictransport.apis.PTApiUpdateService;
import de.dim.trafficos.publictransport.apis.PTScheduleService;
import de.dim.trafficos.publictransport.apis.PTStopService;
import de.dim.trafficos.publictransport.apis.PTTimetableEntryService;
import de.dim.trafficos.publictransport.apis.PTUpdateService;
import de.dim.trafficos.publictransport.apis.index.PTScheduleIndexService;
import de.dim.trafficos.publictransport.apis.index.PTStopIndexService;
import de.dim.trafficos.publictransport.apis.index.PTTimetableEntryIndexService;
import de.jena.udp.model.trafficos.common.Position;
import de.jena.udp.model.trafficos.common.TOSCommonFactory;
import de.jena.udp.model.trafficos.publictransport.PTFrequencyType;
import de.jena.udp.model.trafficos.publictransport.PTLocationStateType;
import de.jena.udp.model.trafficos.publictransport.PTOnlineUpdate;
import de.jena.udp.model.trafficos.publictransport.PTPositionUpdate;
import de.jena.udp.model.trafficos.publictransport.PTSchedule;
import de.jena.udp.model.trafficos.publictransport.PTStop;
import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;
import de.jena.udp.model.trafficos.publictransport.PTTripUpdate;
import de.jena.udp.model.trafficos.publictransport.PTType;
import de.jena.udp.model.trafficos.publictransport.PTUpdate;
import de.jena.udp.model.trafficos.publictransport.PTUpdateValueType;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportFactory;
import de.jena.udp.model.trafficos.publictransport_api.OnlineUpdate;
import de.jena.udp.model.trafficos.publictransport_api.PositionUpdate;
import de.jena.udp.model.trafficos.publictransport_api.TripUpdate;
import de.jena.udp.model.trafficos.publictransport_api.Update;



/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class PTApiUpdateServiceTest {
	
	
	@Test
	public void testLatestUpdateByTypeAndVehicle(@InjectService(timeout=5000l) ServiceAware<PTApiUpdateService> apiAware) {
		
		assertThat(apiAware).isNotNull();
		PTApiUpdateService apiService = apiAware.getService();
		assertThat(apiService).isNotNull();
		
		Update apiUpdate = apiService.getLatestUpdateByTypeAndVehicle("vehicleRef", PTUpdateValueType.GEO_INFO);
		assertThat(apiUpdate).isNotNull();
		assertThat(apiUpdate).isInstanceOf(PositionUpdate.class);
		
		apiUpdate = apiService.getLatestUpdateByTypeAndVehicle("vehicleRef", PTUpdateValueType.TRIP_DATA);
		assertThat(apiUpdate).isNotNull();
		assertThat(apiUpdate).isInstanceOf(TripUpdate.class);
		
		TripUpdate tripUpdate = (TripUpdate) apiUpdate;
		assertThat(tripUpdate.getCurrentSchedule()).isNotNull();
		assertThat(tripUpdate.getCurrentSchedule().getScheduleId()).isEqualTo("scheduleId");		
	}
	
	@Test
	public void testLatestUpdatesByType(@InjectService(timeout=5000l) ServiceAware<PTApiUpdateService> apiAware) {
		
		assertThat(apiAware).isNotNull();
		PTApiUpdateService apiService = apiAware.getService();
		assertThat(apiService).isNotNull();
		
		List<Update> apiUpdates = apiService.getLatestUpdatesByType(PTUpdateValueType.ONLINE);
		assertThat(apiUpdates).hasSize(2);
		
		OnlineUpdate u1 = null, u2 = null;
		for(Update u : apiUpdates) {
			if(u instanceof OnlineUpdate ou) {
				if("vehicleRef".equals(u.getRefVehicleId())) u1 = ou;
				else if("vehicle2".equals(u.getRefVehicleId())) u2 = ou;
			}
		}
		assertThat(u1).isNotNull();
		assertThat(u2).isNotNull();
		assertFalse(u1.isOnline());
		assertTrue(u2.isOnline());
	}
	
	
	@BeforeEach
	public void beforeEach(@InjectService(cardinality = 1, timeout = 5000, filter = "(database=trafficos)") ServiceAware<MongoDatabaseProvider> dbProviderAware,
			@InjectService ServiceAware<PTStopService> stopServiceAware, 
			@InjectService ServiceAware<PTTimetableEntryService> tteServiceAware, 
			@InjectService ServiceAware<PTScheduleService> scheduleServiceAware,
			@InjectService ServiceAware<PTUpdateService> updateServiceAware) {
		
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
		
		PTUpdateService updateService = updateServiceAware.getService();
		assertThat(updateService).isNotNull();
		
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
		
		PTUpdate update1 = PublicTransportTestHelper.getTestPTUpdate("vehicleRef", PTUpdateValueType.GEO_INFO, Instant.now().minusSeconds(5).toEpochMilli());
		PTPositionUpdate value1 = TOSPublicTransportFactory.eINSTANCE.createPTPositionUpdate();
		Position position = TOSCommonFactory.eINSTANCE.createPosition();
		position.setLatitude(50.1234);
		position.setLongitude(11.345);
		value1.setPosition(position);
		value1.setId(UUID.randomUUID().toString());
		update1.setValue(value1);
		
		PTUpdate update2 = PublicTransportTestHelper.getTestPTUpdate("vehicleRef", PTUpdateValueType.TRIP_DATA, Instant.now().minusSeconds(2).toEpochMilli());
		PTTripUpdate value2 = TOSPublicTransportFactory.eINSTANCE.createPTTripUpdate();
		value2.setCurrentStopIndex(1);
		value2.setLocationState(PTLocationStateType.AT_STOP);
		value2.setRefScheduleId("scheduleId");
		value2.setTimetableDelay(3);
		value2.setRunNumber(2);
		value2.setPatternNumber(3);
		value2.setPathDestinationNumber(4);
		value2.setId(UUID.randomUUID().toString());
		update2.setValue(value2);
		
		PTUpdate update3 = PublicTransportTestHelper.getTestPTUpdate("vehicleRef", PTUpdateValueType.ONLINE, Instant.now().toEpochMilli());
		PTOnlineUpdate value3 = TOSPublicTransportFactory.eINSTANCE.createPTOnlineUpdate();
		value3.setOnline(true);
		value3.setType(PTType.CITY_BUS);
		update3.setValue(value3);
		
		PTUpdate update4 = PublicTransportTestHelper.getTestPTUpdate("vehicleRef", PTUpdateValueType.ONLINE, Instant.now().plusSeconds(5).toEpochMilli());
		PTOnlineUpdate value4 = TOSPublicTransportFactory.eINSTANCE.createPTOnlineUpdate();
		value4.setOnline(false);
		value4.setType(PTType.CITY_BUS);
		update4.setValue(value4);
		
		PTUpdate update5 = PublicTransportTestHelper.getTestPTUpdate("vehicle2", PTUpdateValueType.ONLINE, Instant.now().toEpochMilli());
		PTOnlineUpdate value5 = TOSPublicTransportFactory.eINSTANCE.createPTOnlineUpdate();
		value5.setOnline(true);
		value5.setType(PTType.TRAM);
		update5.setValue(value5);	
		
		updateService.savePTUpdate(update1, update2, update3, update4, update5);
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
