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
package de.dim.trafficos.publictransport.api.mmt.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

import org.gecko.qvt.osgi.api.ModelTransformationConstants;
import org.gecko.qvt.osgi.api.ModelTransformator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.jena.udp.model.trafficos.common.Position;
import de.jena.udp.model.trafficos.common.TOSCommonFactory;
import de.jena.udp.model.trafficos.publictransport.PTAnnouncementUpdate;
import de.jena.udp.model.trafficos.publictransport.PTDoorOpenStateType;
import de.jena.udp.model.trafficos.publictransport.PTExitSideType;
import de.jena.udp.model.trafficos.publictransport.PTFrequencyType;
import de.jena.udp.model.trafficos.publictransport.PTLocationStateType;
import de.jena.udp.model.trafficos.publictransport.PTOnlineUpdate;
import de.jena.udp.model.trafficos.publictransport.PTPickUpDropOffType;
import de.jena.udp.model.trafficos.publictransport.PTPositionUpdate;
import de.jena.udp.model.trafficos.publictransport.PTRouteDeviationType;
import de.jena.udp.model.trafficos.publictransport.PTSchedule;
import de.jena.udp.model.trafficos.publictransport.PTStop;
import de.jena.udp.model.trafficos.publictransport.PTStopIndexUpdate;
import de.jena.udp.model.trafficos.publictransport.PTStopUpdate;
import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;
import de.jena.udp.model.trafficos.publictransport.PTTripStateType;
import de.jena.udp.model.trafficos.publictransport.PTTripUpdate;
import de.jena.udp.model.trafficos.publictransport.PTType;
import de.jena.udp.model.trafficos.publictransport.PTUpdate;
import de.jena.udp.model.trafficos.publictransport.PTUpdateValueType;
import de.jena.udp.model.trafficos.publictransport.PTVehicleUpdate;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportFactory;
import de.jena.udp.model.trafficos.publictransport_api.AnnouncementUpdate;
import de.jena.udp.model.trafficos.publictransport_api.DoorOpenStateType;
import de.jena.udp.model.trafficos.publictransport_api.ExitSideType;
import de.jena.udp.model.trafficos.publictransport_api.LocationStateType;
import de.jena.udp.model.trafficos.publictransport_api.OnlineUpdate;
import de.jena.udp.model.trafficos.publictransport_api.PickUpDropOffType;
import de.jena.udp.model.trafficos.publictransport_api.PositionUpdate;
import de.jena.udp.model.trafficos.publictransport_api.RouteDeviationType;
import de.jena.udp.model.trafficos.publictransport_api.Schedule;
import de.jena.udp.model.trafficos.publictransport_api.ScheduleEntry;
import de.jena.udp.model.trafficos.publictransport_api.ScheduleFrequencyDayType;
import de.jena.udp.model.trafficos.publictransport_api.StopIndexUpdate;
import de.jena.udp.model.trafficos.publictransport_api.StopInformation;
import de.jena.udp.model.trafficos.publictransport_api.StopUpdate;
import de.jena.udp.model.trafficos.publictransport_api.TripStateType;
import de.jena.udp.model.trafficos.publictransport_api.TripUpdate;
import de.jena.udp.model.trafficos.publictransport_api.VehicleType;
import de.jena.udp.model.trafficos.publictransport_api.VehicleUpdate;

/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
public class PublicTransportApiMMTTest {

	private ModelTransformator transformator;

	@BeforeEach
	private void before(@InjectService(timeout = 1000, cardinality = 0, filter="(" + ModelTransformationConstants.TRANSFORMATOR_ID + "=publictransportToApi)") 
		ModelTransformator transformator) {
			this.transformator = transformator;
	}
	
	
	@Test
	public void testScheduleMMT() {

		assertThat(transformator).isNotNull();
		
		PTSchedule schedule = TOSPublicTransportFactory.eINSTANCE.createPTSchedule();
		schedule.setDataSource("OpenData");
		Date date = new Date();
		schedule.setUpdateDate(date);
		schedule.setScheduleId(UUID.randomUUID().toString());
		schedule.setStartDate(LocalDate.of(2023, 6, 23));
		schedule.setEndDate(LocalDate.of(2023, 10, 20));
		schedule.setRefRouteId("7");
		schedule.setRefRouteNumber(7);
		schedule.getFrequencyDays().add(PTFrequencyType.FRIDAY);
		schedule.getFrequencyDays().add(PTFrequencyType.SATURDAY);
		schedule.getFrequencyDays().add(PTFrequencyType.SUNDAY);
		schedule.getIncludedDate().add(LocalDate.of(2023, 8, 3));
		schedule.getExcludedDate().add(LocalDate.of(2023, 9, 12));
		
		Schedule apiSchedule = (Schedule) transformator.doTransformation(schedule);
		assertThat(apiSchedule).isNotNull();
		assertThat(apiSchedule.getDataSource()).isEqualTo("OpenData");
		assertThat(apiSchedule.getUpdateDate()).isEqualTo(date);
		assertThat(apiSchedule.getScheduleId()).isEqualTo(schedule.getScheduleId());
		assertThat(apiSchedule.getStartDate()).isEqualTo(schedule.getStartDate());
		assertThat(apiSchedule.getEndDate()).isEqualTo(schedule.getEndDate());
		assertThat(apiSchedule.getRefRouteId()).isEqualTo(schedule.getRefRouteId());
		assertThat(apiSchedule.getRefRouteNumber()).isEqualTo(schedule.getRefRouteNumber());
		assertThat(apiSchedule.getFrequencyDays()).contains(ScheduleFrequencyDayType.FRIDAY, ScheduleFrequencyDayType.SATURDAY, ScheduleFrequencyDayType.SUNDAY);
		assertThat(apiSchedule.getIncludedDate()).contains(LocalDate.of(2023, 8, 3));
		assertThat(apiSchedule.getExcludedDate()).contains(LocalDate.of(2023, 9, 12));
	}
	
	@Test
	public void testScheduleEntryMMT() {
		PTTimetableEntry entry = TOSPublicTransportFactory.eINSTANCE.createPTTimetableEntry();
		entry.setDataSource("OpenData");
		Date date = new Date();
		entry.setUpdateDate(date);
		entry.setRefStopId("stopId");
		entry.setRefScheduleId("scheduleId");
		entry.setScheduledArrivalTime(LocalTime.of(6, 30));
		entry.setScheduledDepartureTime(LocalTime.of(6, 31));
		entry.setEntryIndex(2);
		entry.setDwellTime(1);
		entry.setDropOffType(PTPickUpDropOffType.COORDINATE_WITH_DRIVER);
		entry.setPickUpType(PTPickUpDropOffType.PHONE_TO_ARRANGE);
		entry.setArrivalDayAfterScheduleStart(1);
		entry.setDepartureDayAfterScheduleStart(2);
		
		ScheduleEntry apiEntry = (ScheduleEntry) transformator.doTransformation(entry);
		assertThat(apiEntry).isNotNull();
		assertThat(apiEntry.getDataSource()).isEqualTo("OpenData");
		assertThat(apiEntry.getUpdateDate()).isEqualTo(date);
		assertThat(apiEntry.getRefScheduleId()).isEqualTo(entry.getRefScheduleId());
		assertThat(apiEntry.getRefStopId()).isEqualTo(entry.getRefStopId());
		assertThat(apiEntry.getArrivalScheduled()).isEqualTo(entry.getScheduledArrivalTime());
		assertThat(apiEntry.getDepartureScheduled()).isEqualTo(entry.getScheduledDepartureTime());
		assertThat(apiEntry.getEntryIndex()).isEqualTo(entry.getEntryIndex());
		assertThat(apiEntry.getDwellTime()).isEqualTo(entry.getDwellTime());
		assertThat(apiEntry.getDropOffType()).isEqualTo(PickUpDropOffType.COORDINATE_WITH_DRIVER);
		assertThat(apiEntry.getPickUpType()).isEqualTo(PickUpDropOffType.PHONE_TO_ARRANGE);
		assertThat(apiEntry.getArrivalDayAfterScheduleStart()).isEqualTo(1);		
		assertThat(apiEntry.getDepartureDayAfterScheduleStart()).isEqualTo(2);
	}
	
	@Test
	public void testStopMMT() {
		PTStop stop = TOSPublicTransportFactory.eINSTANCE.createPTStop();
		stop.setDataSource("OpenData");
		Date date = new Date();
		stop.setUpdateDate(date);
		stop.setStopId(UUID.randomUUID().toString());
		stop.setDHID("de:test:test");
		stop.setName("Jena Ost");
		Position position = TOSCommonFactory.eINSTANCE.createPosition();
		position.setLatitude(50.1234);
		position.setLongitude(11.345);
		stop.setPosition(position);
		
		StopInformation apiStop = (StopInformation) transformator.doTransformation(stop);
		assertThat(apiStop).isNotNull();
		assertThat(apiStop.getDataSource()).isEqualTo("OpenData");
		assertThat(apiStop.getUpdateDate()).isEqualTo(date);
		assertThat(apiStop.getStopId()).isEqualTo(stop.getStopId());
		assertThat(apiStop.getDHID()).isEqualTo(stop.getDHID());
		assertThat(apiStop.getStopName()).contains(stop.getName());
		assertThat(apiStop.getPosition()).isNotNull();
		assertThat(apiStop.getPosition().getLatitude()).isEqualTo(50.1234);
		assertThat(apiStop.getPosition().getLongitude()).isEqualTo(11.345);
	}

	@Test
	public void testTripUpdateMMT() {
		
		PTUpdate update = TOSPublicTransportFactory.eINSTANCE.createPTUpdate();
		update.setDataSource("IBIS");
		update.setType(PTUpdateValueType.TRIP_DATA);
		update.setRefVehicleId("test");
		update.setTimestamp(System.currentTimeMillis());
		PTTripUpdate value = TOSPublicTransportFactory.eINSTANCE.createPTTripUpdate();
		value.setCurrentStopIndex(7);
		value.setLocationState(PTLocationStateType.BEFORE_STOP);
		value.setRunNumber(10);
		value.setPathDestinationNumber(9);
		value.setPatternNumber(6);
		value.setTimetableDelay(3);
		
		PTStopUpdate stopUpdate1 = TOSPublicTransportFactory.eINSTANCE.createPTStopUpdate();
		stopUpdate1.setDistanceFromNextStop(100);
		stopUpdate1.setExpectedArrivalTime(LocalTime.now().minusMinutes(4));
		stopUpdate1.setExpectedDepartureTime(LocalTime.now().minusMinutes(4));
		stopUpdate1.setRecordedArrivalTime(LocalTime.now().minusMinutes(3));
		stopUpdate1.setRefStopId("stop1");
		
		PTStopUpdate stopUpdate2 = TOSPublicTransportFactory.eINSTANCE.createPTStopUpdate();
		stopUpdate2.setDistanceFromNextStop(1500);
		stopUpdate2.setExpectedArrivalTime(LocalTime.now().plusMinutes(8));
		stopUpdate2.setExpectedDepartureTime(LocalTime.now().plusMinutes(9));
		stopUpdate2.setRecordedArrivalTime(null);
		stopUpdate2.setRefStopId("stop2");
		
		value.getStopUpdate().add(stopUpdate1);
		value.getStopUpdate().add(stopUpdate2);
		
		update.setValue(value);
		TripUpdate apiTripUpdate = (TripUpdate) transformator.doTransformation(update);
		assertThat(apiTripUpdate).isNotNull();
		assertThat(apiTripUpdate.getDataSource()).isEqualTo("IBIS");
		assertThat(apiTripUpdate.getTimestamp()).isNotNull();
		assertThat(apiTripUpdate.getRefVehicleId()).isEqualTo("test");
		
		assertThat(apiTripUpdate.getCurrentStopIndex()).isEqualTo(7);
		assertThat(apiTripUpdate.getLocationState()).isEqualTo(LocationStateType.BEFORE_STOP);
		assertThat(apiTripUpdate.getRunNumber()).isEqualTo(10);
		assertThat(apiTripUpdate.getPathDestinationNumber()).isEqualTo(9);
		assertThat(apiTripUpdate.getPatternNumber()).isEqualTo(6);
		assertThat(apiTripUpdate.getScheduleDelay()).isEqualTo(3);
		assertThat(apiTripUpdate.getStopUpdate()).hasSize(2);
	}
	
	@Test
	public void testPositionUpdateMMT() {
		
		PTUpdate update = TOSPublicTransportFactory.eINSTANCE.createPTUpdate();
		update.setDataSource("IBIS");
		update.setType(PTUpdateValueType.GEO_INFO);
		update.setRefVehicleId("test");
		update.setTimestamp(System.currentTimeMillis());
		PTPositionUpdate value = TOSPublicTransportFactory.eINSTANCE.createPTPositionUpdate();
		Position position = TOSCommonFactory.eINSTANCE.createPosition();
		position.setLatitude(50.1234);
		position.setLongitude(11.345);
		value.setPosition(position);
		update.setValue(value);
		
		PositionUpdate apiUpdate = (PositionUpdate) transformator.doTransformation(update);
		assertThat(apiUpdate).isNotNull();
		assertThat(apiUpdate.getDataSource()).isEqualTo("IBIS");
		assertThat(apiUpdate.getRefVehicleId()).isEqualTo("test");
		assertThat(apiUpdate.getTimestamp()).isNotNull();
		
		assertThat(apiUpdate.getPosition()).isNotNull();
		assertThat(apiUpdate.getPosition().getLatitude()).isEqualTo(50.1234);
		assertThat(apiUpdate.getPosition().getLongitude()).isEqualTo(11.345);
	}
	
	@Test
	public void testOnlineUpdateMMT() {
		
		PTUpdate update = TOSPublicTransportFactory.eINSTANCE.createPTUpdate();
		update.setType(PTUpdateValueType.ONLINE);
		update.setDataSource("IBIS");
		update.setRefVehicleId("test");
		update.setTimestamp(System.currentTimeMillis());
		PTOnlineUpdate value = TOSPublicTransportFactory.eINSTANCE.createPTOnlineUpdate();
		value.setType(PTType.NIGHT_BUS);
		value.setOnline(true);
		update.setValue(value);
		
		OnlineUpdate apiUpdate = (OnlineUpdate) transformator.doTransformation(update);
		assertThat(apiUpdate).isNotNull();
		assertThat(apiUpdate.getDataSource()).isEqualTo("IBIS");
		assertThat(apiUpdate.getRefVehicleId()).isEqualTo("test");
		assertThat(apiUpdate.getTimestamp()).isNotNull();
		assertThat(apiUpdate.getType()).isEqualTo(VehicleType.NIGHT_BUS);
		assertTrue(apiUpdate.isOnline());
	}
	
	@Test
	public void testAnnouncementUpdateMMT() {
		
		PTUpdate update = TOSPublicTransportFactory.eINSTANCE.createPTUpdate();
		update.setType(PTUpdateValueType.CURRENT_ANNOUNCEMENT);
		update.setRefVehicleId("test");
		update.setDataSource("IBIS");
		update.setTimestamp(System.currentTimeMillis());
		PTAnnouncementUpdate value = TOSPublicTransportFactory.eINSTANCE.createPTAnnouncementUpdate();
		value.setAnnoucementRef("annRef");
		value.getAnnoucementText().add("text1");
		value.getAnnoucementText().add("text2");
		value.getAnnoucementTTSText().add("tts-text1");
		value.getAnnoucementTTSText().add("tts-text2");
		update.setValue(value);
		
		AnnouncementUpdate apiUpdate = (AnnouncementUpdate) transformator.doTransformation(update);
		assertThat(apiUpdate).isNotNull();
		assertThat(apiUpdate.getDataSource()).isEqualTo("IBIS");
		assertThat(apiUpdate.getRefVehicleId()).isEqualTo("test");
		assertThat(apiUpdate.getTimestamp()).isNotNull();
		assertThat(apiUpdate.getAnnouncementRef()).isEqualTo("annRef");
		assertThat(apiUpdate.getAnnouncementText()).contains("text1", "text2");
		assertThat(apiUpdate.getAnnouncementTTSText()).contains("tts-text1", "tts-text2");
	}
	
	@Test
	public void testStopIndexUpdateMMT() {
		PTUpdate update = TOSPublicTransportFactory.eINSTANCE.createPTUpdate();
		update.setType(PTUpdateValueType.CURRENT_STOP_INDEX);
		update.setRefVehicleId("test");
		update.setTimestamp(System.currentTimeMillis());
		update.setDataSource("IBIS");

		PTStopIndexUpdate value = TOSPublicTransportFactory.eINSTANCE.createPTStopIndexUpdate();
		value.setCurrentStopIndex(7);
		update.setValue(value);
		
		StopIndexUpdate apiUpdate = (StopIndexUpdate) transformator.doTransformation(update);
		assertThat(apiUpdate).isNotNull();
		assertThat(apiUpdate.getDataSource()).isEqualTo("IBIS");
		assertThat(apiUpdate.getRefVehicleId()).isEqualTo("test");
		assertThat(apiUpdate.getTimestamp()).isNotNull();
		assertThat(apiUpdate.getCurrentStopIndex()).isEqualTo(7);
	}
	
	@Test
	public void testStopUpdateMMT() {
		
		PTUpdate update = TOSPublicTransportFactory.eINSTANCE.createPTUpdate();
		update.setType(PTUpdateValueType.CURRENT_STOP_POINT);
		update.setRefVehicleId("test");
		update.setDataSource("IBIS");
		update.setTimestamp(System.currentTimeMillis());
		PTStopUpdate value = TOSPublicTransportFactory.eINSTANCE.createPTStopUpdate();
		value.setDistanceFromNextStop(350);
		value.setExpectedArrivalTime(LocalTime.of(15, 33, 00));
		value.setExpectedDepartureTime(LocalTime.of(15, 34, 00));
		value.setRecordedArrivalTime(LocalTime.of(15, 35, 00));
		value.setRefStopId("stop");
		update.setValue(value);
		
		StopUpdate apiUpdate = (StopUpdate) transformator.doTransformation(update);
		assertThat(apiUpdate).isNotNull();
		assertThat(apiUpdate.getDataSource()).isEqualTo("IBIS");
		assertThat(apiUpdate.getRefVehicleId()).isEqualTo("test");
		assertThat(apiUpdate.getTimestamp()).isNotNull();
		assertThat(apiUpdate.getArrivalExpected()).isEqualTo(LocalTime.of(15, 33, 00));
		assertThat(apiUpdate.getDepartureExpected()).isEqualTo(LocalTime.of(15, 34, 00));
		assertThat(apiUpdate.getRecordedArrivalTime()).isEqualTo(LocalTime.of(15, 35, 00));
		assertThat(apiUpdate.getDistanceFromNextStop()).isEqualTo(350);
		assertThat(apiUpdate.getRefStopId()).isEqualTo("stop");
	}
	
	@Test
	public void testVehicleUpdateMMT() {
		
		PTUpdate update = TOSPublicTransportFactory.eINSTANCE.createPTUpdate();
		update.setType(PTUpdateValueType.VEHICLE_DATA);
		update.setRefVehicleId("test");
		update.setTimestamp(System.currentTimeMillis());
		update.setDataSource("IBIS");

		PTVehicleUpdate value = TOSPublicTransportFactory.eINSTANCE.createPTVehicleUpdate();
		value.setDoorState(PTDoorOpenStateType.SINGLE_DOOR_OPEN);
		value.setRouteDeviation(PTRouteDeviationType.OFF_ROUTE);
		value.setExitSide(PTExitSideType.RIGHT);
		value.setTripState(PTTripStateType.TRIP_BREAK);
		value.setInPanic(false);
		value.setMovingForward(true);
		value.setSpeakerActive(true);
		value.setStopInformationActive(true);
		value.setVehicleStopRequested(true);
		update.setValue(value);
		
		VehicleUpdate apiUpdate = (VehicleUpdate) transformator.doTransformation(update);
		assertThat(apiUpdate).isNotNull();
		assertThat(apiUpdate.getDataSource()).isEqualTo("IBIS");
		assertThat(apiUpdate.getRefVehicleId()).isEqualTo("test");
		assertThat(apiUpdate.getTimestamp()).isNotNull();
		assertFalse(apiUpdate.isInPanic());
		assertTrue(apiUpdate.isMovingForward());
		assertTrue(apiUpdate.isSpeakerActive());
		assertTrue(apiUpdate.isStopInformationActive());
		assertTrue(apiUpdate.isStopRequested());
		assertThat(apiUpdate.getDoorState()).isEqualTo(DoorOpenStateType.SINGLE_DOOR_OPEN);
		assertThat(apiUpdate.getExitSide()).isEqualTo(ExitSideType.RIGHT);
		assertThat(apiUpdate.getRouteDeviation()).isEqualTo(RouteDeviationType.OFF_ROUTE);
		assertThat(apiUpdate.getTripState()).isEqualTo(TripStateType.TRIP_BREAK);
	}
}
