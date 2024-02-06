/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.publictransport.rest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.rest.annotations.RequireEMFMessageBodyReaderWriter;
import org.gecko.emf.rest.annotations.json.EMFJSONConfig;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.annotations.RequireJakartarsWhiteboard;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsApplicationSelect;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;
import org.osgi.service.servlet.whiteboard.annotations.RequireHttpWhiteboard;

import de.dim.trafficos.publictransport.apis.PTApiUpdateService;
import de.jena.udp.model.trafficos.publictransport.PTUpdateValueType;
import de.jena.udp.model.trafficos.publictransport_api.AnnouncementUpdate;
import de.jena.udp.model.trafficos.publictransport_api.DoorOpenStateType;
import de.jena.udp.model.trafficos.publictransport_api.ExitSideType;
import de.jena.udp.model.trafficos.publictransport_api.LocationStateType;
import de.jena.udp.model.trafficos.publictransport_api.OnlineUpdate;
import de.jena.udp.model.trafficos.publictransport_api.OnlineVehicle;
import de.jena.udp.model.trafficos.publictransport_api.PickUpDropOffType;
import de.jena.udp.model.trafficos.publictransport_api.Position;
import de.jena.udp.model.trafficos.publictransport_api.PositionUpdate;
import de.jena.udp.model.trafficos.publictransport_api.RouteDeviationType;
import de.jena.udp.model.trafficos.publictransport_api.RouteDirectionType;
import de.jena.udp.model.trafficos.publictransport_api.Schedule;
import de.jena.udp.model.trafficos.publictransport_api.ScheduleEntry;
import de.jena.udp.model.trafficos.publictransport_api.ScheduleFrequencyDayType;
import de.jena.udp.model.trafficos.publictransport_api.StopIndexUpdate;
import de.jena.udp.model.trafficos.publictransport_api.StopInformation;
import de.jena.udp.model.trafficos.publictransport_api.StopUpdate;
import de.jena.udp.model.trafficos.publictransport_api.TOSPublicTransportApiFactory;
import de.jena.udp.model.trafficos.publictransport_api.TripUpdate;
import de.jena.udp.model.trafficos.publictransport_api.Update;
import de.jena.udp.model.trafficos.publictransport_api.VehicleType;
import de.jena.udp.model.trafficos.publictransport_api.VehicleUpdate;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * This resource is responsible for querying the updates sent from the running public transports
 * 
 * @author ilenia
 * @since Jul 12, 2023
 */
@RequireJakartarsWhiteboard
@RequireHttpWhiteboard
@JakartarsResource
@RequireEMFMessageBodyReaderWriter
@Produces({MediaType.APPLICATION_JSON})
@RequireEMFJson
@Component(name = "PTUpdateResource", service = PTUpdateResource.class, scope = ServiceScope.PROTOTYPE)
@Path("/ptu")
@JakartarsApplicationSelect("(applicationId=pts)")
public class PTUpdateResource {

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private PTApiUpdateService apiUpdateService;
	
	@GET
	@Path("/hello")
	public Response hello() {
		de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
		response.setMessage("OK");
		return Response.ok(response).build();
	}
	
	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/updates/online")
	public Response getOnlineVehicles() {		
		return doGetOnlineVehicles();
	}
	
	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/updates/fake/online")
	public Response getFakeOnlineVehicles() {
		return doGetFakeOnlineVehicles();
	}

	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/updates/trip/{vehicleId}")
	public Response getTripUpdate(@PathParam("vehicleId") String vehicleId) {
		return getUpdate(vehicleId, PTUpdateValueType.TRIP_DATA);
	}
	
	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/updates/fake/trip/{vehicleId}")
	public Response getFakeTripUpdate(@PathParam("vehicleId") String vehicleId) {
		return getFakeUpdate(vehicleId, PTUpdateValueType.TRIP_DATA);
	}

	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/updates/position/{vehicleId}")
	public Response getPositionUpdate(@PathParam("vehicleId") String vehicleId) {
		return getUpdate(vehicleId, PTUpdateValueType.GEO_INFO);
	}
	
	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/updates/fake/position/{vehicleId}")
	public Response getFakePositionUpdate(@PathParam("vehicleId") String vehicleId) {
		return getFakeUpdate(vehicleId, PTUpdateValueType.GEO_INFO);
	}
	
	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/updates/announcement/{vehicleId}")
	public Response getAnnouncementUpdate(@PathParam("vehicleId") String vehicleId) {
		return getUpdate(vehicleId, PTUpdateValueType.CURRENT_ANNOUNCEMENT);
	}
	
	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/updates/fake/announcement/{vehicleId}")
	public Response getFakeAnnouncementUpdate(@PathParam("vehicleId") String vehicleId) {
		return getFakeUpdate(vehicleId, PTUpdateValueType.CURRENT_ANNOUNCEMENT);
	}

	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/updates/vehicle/{vehicleId}")
	public Response getVehicleUpdate(@PathParam("vehicleId") String vehicleId) {
		return getUpdate(vehicleId, PTUpdateValueType.VEHICLE_DATA);
	}
	
	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/updates/fake/vehicle/{vehicleId}")
	public Response getFakeVehicleUpdate(@PathParam("vehicleId") String vehicleId) {
		return getFakeUpdate(vehicleId, PTUpdateValueType.VEHICLE_DATA);
	}
	
	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/updates/stop/{vehicleId}")
	public Response getStopUpdate(@PathParam("vehicleId") String vehicleId) {
		return getUpdate(vehicleId, PTUpdateValueType.CURRENT_STOP_POINT);
	}
	
	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/updates/fake/stop/{vehicleId}")
	public Response getFakeStopUpdate(@PathParam("vehicleId") String vehicleId) {
		return getFakeUpdate(vehicleId, PTUpdateValueType.CURRENT_STOP_POINT);
	}
	
	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/updates/stop-index/{vehicleId}")
	public Response getStopIndexUpdate(@PathParam("vehicleId") String vehicleId) {
		return getUpdate(vehicleId, PTUpdateValueType.CURRENT_STOP_INDEX);
	}
	
	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/updates/fake/stop-index/{vehicleId}")
	public Response getFakeStopIndexUpdate(@PathParam("vehicleId") String vehicleId) {
		return getFakeUpdate(vehicleId, PTUpdateValueType.CURRENT_STOP_INDEX);
	}
	
	private Response doGetOnlineVehicles() {
		List<Update> updates = apiUpdateService.getLatestUpdatesByType(PTUpdateValueType.ONLINE);
		if(updates.isEmpty()) {
			return buildNoContentResponse();
		}
		List<OnlineVehicle> onlineVehicles = new ArrayList<>();
		updates.forEach(update -> {
			if(update instanceof OnlineUpdate onlineUpdate) {
				if(onlineUpdate.isOnline()) {
					OnlineVehicle vehicle = TOSPublicTransportApiFactory.eINSTANCE.createOnlineVehicle();
					vehicle.setId(onlineUpdate.getRefVehicleId());
					vehicle.setType(onlineUpdate.getType());
					onlineVehicles.add(vehicle);
				}
			}
		});
		de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
		response.getData().addAll(onlineVehicles);
		return Response.ok(response).build();
	}

	private Response getUpdate(String vehicleId, PTUpdateValueType updateType) {
		Update update = apiUpdateService.getLatestUpdateByTypeAndVehicle(vehicleId, updateType);
		if(update == null) return buildNoContentResponse();
		de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
		response.getData().add(update);
		return Response.ok(response).build();
	}
	
	private Response buildNoContentResponse() {
		de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
		response.setMessage("NO CONTENT");
		return Response.ok(response).build();
	}
	
	private Response doGetFakeOnlineVehicles() {
		OnlineVehicle vehicle1 = TOSPublicTransportApiFactory.eINSTANCE.createOnlineVehicle();
		vehicle1.setId("1");
		vehicle1.setType(VehicleType.CITY_BUS);
		
		OnlineVehicle vehicle2 = TOSPublicTransportApiFactory.eINSTANCE.createOnlineVehicle();
		vehicle2.setId("2");
		vehicle2.setType(VehicleType.TRAM);
		
		OnlineVehicle vehicle3 = TOSPublicTransportApiFactory.eINSTANCE.createOnlineVehicle();
		vehicle3.setId("3");
		vehicle3.setType(VehicleType.EBUS);
		
		de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
		response.getData().add(vehicle1);
		response.getData().add(vehicle2);
		response.getData().add(vehicle3);
		return Response.ok(response).build();
	}

	private Response getFakeUpdate(String vehicleId, PTUpdateValueType updateType) {
		Update update = null;
		switch(updateType) {
		case DOOR_CHANGE, DOOR_COUNT, LOCATION_MESSAGE,STOP_REQUESTED,TELEGRAM,TIMETABLE,ONLINE,UNKNOWN:
			break;		
		case GEO_INFO:
			update = TOSPublicTransportApiFactory.eINSTANCE.createPositionUpdate();
			Position position = TOSPublicTransportApiFactory.eINSTANCE.createPosition();
			position.setLatitude(50.924969320696896);
			position.setLongitude(11.587329016457586);
			((PositionUpdate)update).setPosition(position);
			break;
		case TRIP_DATA:
			update = TOSPublicTransportApiFactory.eINSTANCE.createTripUpdate();
			setTripUpdateFakeProperties((TripUpdate)update);
			break;
		case CURRENT_ANNOUNCEMENT:
			update = TOSPublicTransportApiFactory.eINSTANCE.createAnnouncementUpdate();
			((AnnouncementUpdate)update).setAnnouncementRef("annRef");
			((AnnouncementUpdate)update).getAnnouncementText().add("This is an announcement!");
			break;
		case CURRENT_STOP_INDEX:
			update = TOSPublicTransportApiFactory.eINSTANCE.createStopIndexUpdate();
			((StopIndexUpdate)update).setCurrentStopIndex(7);
			break;
		case CURRENT_STOP_POINT:
			update = TOSPublicTransportApiFactory.eINSTANCE.createStopUpdate();
			((StopUpdate)update).setArrivalExpected(LocalTime.of(9, 30));
			((StopUpdate)update).setDepartureExpected(LocalTime.of(9, 31));
			((StopUpdate)update).setRefScheduleEntryIndex(3);
			((StopUpdate)update).setDistanceFromNextStop(350);
			((StopUpdate)update).setRecordedArrivalTime(LocalTime.of(9, 32));
			((StopUpdate)update).setRefStopId("de:16053:1234567");
			break;
		case VEHICLE_DATA:
			update = TOSPublicTransportApiFactory.eINSTANCE.createVehicleUpdate();			
			((VehicleUpdate)update).setDoorState(DoorOpenStateType.DOORS_OPEN);
			((VehicleUpdate)update).setExitSide(ExitSideType.LEFT);
			((VehicleUpdate)update).setInPanic(false);
			((VehicleUpdate)update).setMovingForward(true);
			((VehicleUpdate)update).setRouteDeviation(RouteDeviationType.ON_ROUTE);
			((VehicleUpdate)update).setSpeakerActive(true);
			((VehicleUpdate)update).setStopInformationActive(true);
			((VehicleUpdate)update).setStopRequested(false);
			break;
		}
		if(update == null) return Response.noContent().build();
		update.setRefVehicleId(vehicleId);
		update.setTimestamp(System.currentTimeMillis());
		update.setDataSource("FAKE");
		de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
		response.getData().add(update);
		return Response.ok(response).build();
	}
	
	private void setTripUpdateFakeProperties(TripUpdate update) {
		update.setLocationState(LocationStateType.AT_STOP);
		update.setScheduleDelay(3);
		update.setCurrentStopIndex(2);
		update.setRunNumber(2);
		update.setPathDestinationNumber(7);
		update.setPatternNumber(4);
		update.getStopUpdate().addAll(getFakeStopUpdate());
		update.setCurrentSchedule(getFakeSchedule());
		
	}
	
	private List<StopUpdate> getFakeStopUpdate() {
		List<StopUpdate> stops = new ArrayList<>();
		StopUpdate stop1 = TOSPublicTransportApiFactory.eINSTANCE.createStopUpdate();
		stop1.setRefStopId("de:16053:1");
		stop1.setArrivalExpected(LocalTime.now().minusMinutes(7));
		stop1.setDepartureExpected(LocalTime.now().minusMinutes(7));
		stop1.setDistanceFromNextStop(1500);
		stop1.setRecordedArrivalTime(LocalTime.now().minusMinutes(6));
		stop1.setRefScheduleEntryIndex(1);
		
		StopUpdate stop2 = TOSPublicTransportApiFactory.eINSTANCE.createStopUpdate();
		stop2.setRefStopId("de:16053:2");
		stop2.setArrivalExpected(LocalTime.now());
		stop2.setDepartureExpected(LocalTime.now());
		stop2.setDistanceFromNextStop(1700);
		stop2.setRecordedArrivalTime(LocalTime.now());
		stop2.setRefScheduleEntryIndex(2);
		
		StopUpdate stop3 = TOSPublicTransportApiFactory.eINSTANCE.createStopUpdate();
		stop3.setRefStopId("de:16053:3");
		stop3.setArrivalExpected(LocalTime.now().plusMinutes(8));
		stop3.setDepartureExpected(LocalTime.now().plusMinutes(8));
		stop3.setRefScheduleEntryIndex(3);
		
		stops.add(stop1);
		stops.add(stop2);
		stops.add(stop3);
		return stops;
	}
	
	private Schedule getFakeSchedule() {
		Schedule schedule = TOSPublicTransportApiFactory.eINSTANCE.createSchedule();
		schedule.setDataSource("FAKE");
		schedule.setUpdateDate(new Date());
		schedule.setStartDate(LocalDate.now().minusDays(2));
		schedule.setEndDate(LocalDate.now().plusDays(3));
		schedule.getFrequencyDays().addAll(ScheduleFrequencyDayType.VALUES);
		schedule.setRefRouteId("2");
		schedule.setRefRouteNumber(2);
		schedule.setScheduleId(UUID.randomUUID().toString());
		schedule.setRouteDirection(RouteDirectionType.FORWARD);
		schedule.getScheduleEntry().addAll(getFakeScheduleEntries(schedule.getScheduleId()));
		return schedule;
	}
	
	private List<ScheduleEntry> getFakeScheduleEntries(String scheduleId) {
		List<ScheduleEntry> entries = new ArrayList<>();
		ScheduleEntry entry1 = TOSPublicTransportApiFactory.eINSTANCE.createScheduleEntry();
		entry1.setRefScheduleId(scheduleId);
		entry1.setRefStopId("de:16053:1");
		entry1.setEntryIndex(1);
		entry1.setArrivalScheduled(LocalTime.now().minusMinutes(7));
		entry1.setDepartureScheduled(LocalTime.now().minusMinutes(7));
		entry1.setArrivalDayAfterScheduleStart(0);
		entry1.setDepartureDayAfterScheduleStart(0);
		entry1.setDwellTime(0);
		entry1.setPickUpType(PickUpDropOffType.REGULARLY_SCHEDULED);
		entry1.setDropOffType(PickUpDropOffType.REGULARLY_SCHEDULED);
		StopInformation stopInfo1 = TOSPublicTransportApiFactory.eINSTANCE.createStopInformation();
		stopInfo1.setDHID("de:16053:1");
		stopInfo1.setDistanceToNextStop(1500);
		stopInfo1.setStopId("de:16053:1");
		stopInfo1.getStopName().add("Jena, Paradiesbahnhof");
		entry1.setRefStop(stopInfo1);
		
		
		ScheduleEntry entry2 = TOSPublicTransportApiFactory.eINSTANCE.createScheduleEntry();
		entry2.setRefScheduleId(scheduleId);
		entry2.setRefStopId("de:16053:2");
		entry2.setEntryIndex(2);
		entry2.setArrivalScheduled(LocalTime.now());
		entry2.setDepartureScheduled(LocalTime.now());
		entry2.setArrivalDayAfterScheduleStart(0);
		entry2.setDepartureDayAfterScheduleStart(0);
		entry2.setDwellTime(0);
		entry2.setPickUpType(PickUpDropOffType.REGULARLY_SCHEDULED);
		entry2.setDropOffType(PickUpDropOffType.REGULARLY_SCHEDULED);
		StopInformation stopInfo2 = TOSPublicTransportApiFactory.eINSTANCE.createStopInformation();
		stopInfo2.setDHID("de:16053:2");
		stopInfo2.setDistanceToNextStop(1700);
		stopInfo2.setStopId("de:16053:2");
		stopInfo2.getStopName().add("Jena, Stadtzentrum Löbdergraben");
		entry2.setRefStop(stopInfo2);
		
		ScheduleEntry entry3 = TOSPublicTransportApiFactory.eINSTANCE.createScheduleEntry();
		entry3.setRefScheduleId(scheduleId);
		entry3.setRefStopId("de:16053:3");
		entry3.setEntryIndex(3);
		entry3.setArrivalScheduled(LocalTime.now().plusMinutes(8));
		entry3.setDepartureScheduled(LocalTime.now().plusMinutes(8));
		entry3.setArrivalDayAfterScheduleStart(0);
		entry3.setDepartureDayAfterScheduleStart(0);
		entry3.setDwellTime(0);
		entry3.setPickUpType(PickUpDropOffType.COORDINATE_WITH_DRIVER);
		entry3.setDropOffType(PickUpDropOffType.COORDINATE_WITH_DRIVER);
		StopInformation stopInfo3 = TOSPublicTransportApiFactory.eINSTANCE.createStopInformation();
		stopInfo3.setDHID("de:16053:3");
		stopInfo3.setStopId("de:16053:3");
		stopInfo3.getStopName().add("Jena, Steinweg");
		entry3.setRefStop(stopInfo3);
		
		entries.add(entry1);
		entries.add(entry2);
		entries.add(entry3);
		return entries;

	}
}
