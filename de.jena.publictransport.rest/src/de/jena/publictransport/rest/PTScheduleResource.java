/**
 * Copyright (c) 2012 - 2018 Data In Motion and others.
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
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;

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

import de.dim.trafficos.publictransport.apis.PTApiScheduleService;
import de.jena.udp.model.trafficos.publictransport_api.Schedule;
import de.jena.udp.model.trafficos.publictransport_api.TOSPublicTransportApiFactory;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * This resource is responsible for querying static information about public transport schedules
 * 
 * @author ilenia
 * @since Jul 25, 2023
 */
@RequireJakartarsWhiteboard
@RequireHttpWhiteboard
@JakartarsResource
@RequireEMFMessageBodyReaderWriter
@Produces(MediaType.APPLICATION_JSON)
@RequireEMFJson
@Component(name = "PTScheduleResource", service = PTScheduleResource.class, scope = ServiceScope.PROTOTYPE)
@Path("/pts")
@JakartarsApplicationSelect("(applicationId=pts)")
public class PTScheduleResource {

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private PTApiScheduleService apiScheduleService;
	
	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
	private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");
	
	@GET
	@Path("/hello")
	public Response hello() {
		de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
		response.setMessage("OK");
		return Response.ok(response).build();
	}
	
	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/schedules/{day}")
	public Response getSchedulesByDay(@PathParam("day") String day) {
		LocalDate date = LocalDate.parse(day, DATE_FORMATTER);
		List<Schedule> schedules = apiScheduleService.getScheduleByDay(date);
		de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
		response.getData().addAll(schedules);
		if(schedules.isEmpty()) response.setMessage("NO CONTENT");
		return Response.ok(response).build();
	}
	
	/**
	 * TODO: when we figure out the meaning of the various line numbers, line ref ect we decide what to return here
	 * @param day
	 * @param lines
	 * @return
	 */
	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/schedules/line/{day}")
	public Response getSchedulesByDayAndLine(@PathParam("day") String day, @QueryParam("lines") int[] lines) {
		
//		de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
//		response.setMessage("NO CONTENT");
//		return Response.ok(response).build();
		LocalDate date = LocalDate.parse(day, DATE_FORMATTER);
		List<Schedule> schedules = apiScheduleService.getScheduleByDayAndLine(date, lines);
		de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
		response.getData().addAll(schedules);
		if(schedules.isEmpty()) response.setMessage("NO CONTENT");
		return Response.ok(response).build();
	}
	
	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/schedules/time/{day}")
	public Response getSchedulesByDayAndTime(@PathParam("day") String day, @QueryParam("start") String startTime, @QueryParam("end") String endTime) {
		LocalDate date = LocalDate.parse(day, DATE_FORMATTER);
		LocalTime t1 = LocalTime.parse(startTime, TIME_FORMATTER);
		LocalTime t2 = LocalTime.parse(endTime, TIME_FORMATTER);
		t1 = adjustTimeToGermanZone(date, t1);
		t2 = adjustTimeToGermanZone(date, t2);
		List<Schedule> schedules = apiScheduleService.getScheduleByDayAndTime(date, t1, t2);
		de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
		response.getData().addAll(schedules);
		if(schedules.isEmpty()) response.setMessage("NO CONTENT");
		return Response.ok(response).build();
	}
	
	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/schedules/dhid/{day}")
	public Response getSchedulesByDayAndStopDHIDs(@PathParam("day") String day, @QueryParam("DHID") String[] stopDHIDs) {
		LocalDate date = LocalDate.parse(day, DATE_FORMATTER);
		List<Schedule> schedules = apiScheduleService.getScheduleByDayAndStopDHID(date, stopDHIDs);
		de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
		response.getData().addAll(schedules);
		if(schedules.isEmpty()) response.setMessage("NO CONTENT");
		return Response.ok(response).build();
	}
	
	@GET
	@EMFJSONConfig(serializeDefaultValues = true)
	@Path("/schedules/stop-name/{day}")
	public Response getSchedulesByDayAndStopNames(@PathParam("day") String day, @QueryParam("stopName") String[] stopNames) {
		LocalDate date = LocalDate.parse(day, DATE_FORMATTER);
		List<Schedule> schedules = apiScheduleService.getScheduleByDayAndStopName(date, stopNames);
		de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
		response.getData().addAll(schedules);
		if(schedules.isEmpty()) response.setMessage("NO CONTENT");
		return Response.ok(response).build();
	}
	
	private LocalTime adjustTimeToGermanZone(LocalDate day, LocalTime time) {
		if(time == null) return null;
		LocalDateTime localDateTime = LocalDateTime.of(day, time);
		ZoneId utcZone = ZoneId.of("UTC"); // request time zone
		ZoneOffset currentOffsetForUTCZone = utcZone.getRules().getOffset(localDateTime);
		LocalTime germanTime = LocalTime.ofInstant(localDateTime.toInstant(currentOffsetForUTCZone), ZoneId.of("Europe/Berlin"));
		return germanTime;
	}

}
