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

import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.rest.annotations.RequireEMFMessageBodyReaderWriter;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.annotations.RequireJakartarsWhiteboard;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsApplicationSelect;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;
import org.osgi.service.servlet.whiteboard.annotations.RequireHttpWhiteboard;
import org.osgi.util.promise.PromiseFactory;

import de.dim.trafficos.publictransport.apis.gtfs.GTFSDownloadService;
import de.dim.trafficos.publictransport.apis.gtfs.GTFSToTOSPublicTransportConverter;
import de.jena.udp.model.trafficos.publictransport_api.TOSPublicTransportApiFactory;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

/**
 * This resource is responsible for trigger a download of the GTFS data from the open-data platform https://www.opendata-oepnv.de
 * where we can find information about PT stops and schedules periodically. Downloaded data are then converted and stored in the db.
 * 
 * @author ilenia
 * @since Jul 17, 2023
 */
@RequireJakartarsWhiteboard
@RequireHttpWhiteboard
@JakartarsResource
@Produces(MediaType.APPLICATION_JSON)
@RequireEMFMessageBodyReaderWriter
@RequireEMFJson
@Component(name = "GTFSDownloadResource", service = GTFSDownloadResource.class, scope = ServiceScope.PROTOTYPE)
@Path("/gtfs")
@JakartarsApplicationSelect("(applicationId=pts)")
public class GTFSDownloadResource {

	@Reference
	GTFSDownloadService downloadService;

	@Reference
	GTFSToTOSPublicTransportConverter converterService;

	private PromiseFactory factory = new PromiseFactory(Executors.newFixedThreadPool(4));
	private static final Logger LOGGER = Logger.getLogger(GTFSDownloadResource.class.getName());


	@GET
	@Path("/hello")
	public Response hello() {
		de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
		response.setMessage("OK");
		return Response.ok(response).build();
	}

	@GET
	@Path("/download/all")
	public Response downloadGTFSData() {
		try {
			factory.submit(() -> {
				downloadService.downloadGermanStopsData();
				downloadService.downloadGermanScheduleData();
				converterService.importGTFSAllData();
				return true;
			})
			.onFailure(t -> LOGGER.log(Level.SEVERE, "Error while downloading and importing GFTS Data", t))
			.onSuccess(s -> LOGGER.fine("GTFS Data downloaded and imported successfully!"));	
			de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
			response.setMessage("Download and conversion process have been triggered successfully!");
			return Response.status(Status.OK).entity(response).build();
		} catch(Exception e) {
			de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
			response.setMessage(e.getMessage());
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(response).build();
		}
	}
	
	@GET
	@Path("/download/stops")
	public Response downloadGTFSStopData() {
		try {
			factory.submit(() -> {
				downloadService.downloadGermanStopsData();
				converterService.importGTFSStopData();
				return true;
			})
			.onFailure(t -> LOGGER.log(Level.SEVERE, "Error while downloading and importing GTFS Stop Data", t))
			.onSuccess(s -> LOGGER.fine("GTFS Stop Data downloaded and imported successfully!"));	
			de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
			response.setMessage("Download and conversion process have been triggered successfully!");
			return Response.status(Status.OK).entity(response).build();
		} catch(Exception e) {
			de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
			response.setMessage(e.getMessage());
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(response).build();
		}
	}

	@GET
	@Path("/download/schedules")
	public Response downloadGTFSScheduleData() {
		try {
			factory.submit(() -> {
				downloadService.downloadGermanScheduleData();
				converterService.importGTFSScheduleData();
				return true;
			})
			.onFailure(t -> LOGGER.log(Level.SEVERE, "Error while downloading and importing GTFS Schedules", t))
			.onSuccess(s -> LOGGER.fine("GTFS Schedule Data downloaded and imported successfully!"));	
			de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
			response.setMessage("Download and conversion process have been triggered successfully!");
			return Response.status(Status.OK).entity(response).build();
		} catch(Exception e) {
			de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
			response.setMessage(e.getMessage());
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(response).build();
		}
	}
}
