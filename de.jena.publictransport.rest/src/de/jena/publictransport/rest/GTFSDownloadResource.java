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

import org.gecko.emf.jakartars.annotations.RequireEMFMessageBodyReaderWriter;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.annotations.RequireJakartarsWhiteboard;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;
import org.osgi.service.servlet.whiteboard.annotations.RequireHttpWhiteboard;

import de.dim.trafficos.publictransport.apis.gtfs.GTFSDownloadService;
import de.dim.trafficos.publictransport.apis.gtfs.GTFSToTOSPublicTransportConverter;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

/**
 * This resource is responsible for trigger a download of the GTFS data from the open-data platform https://www.opendata-oepnv.de
 * where we can find information about PT stops and schedules periodically.
 * 
 * @author ilenia
 * @since Jul 17, 2023
 */
@RequireJakartarsWhiteboard
@RequireHttpWhiteboard
@JakartarsResource
@RequireEMFMessageBodyReaderWriter
@Component(name = "GTFSDownloadResource", service = GTFSDownloadResource.class, scope = ServiceScope.PROTOTYPE)
@Path("")
public class GTFSDownloadResource {

	@Reference
	GTFSDownloadService downloadService;
	
	@Reference
	GTFSToTOSPublicTransportConverter converterService;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, "application/xmi"})
	@Path("/gtfs-dowload")
	public Response downloadGTFSData() {
		try {
			downloadService.downloadGermanStopsData();
			downloadService.downloadGermanScheduleData();
			converterService.importGTFSData();
			return Response.status(Status.OK).entity("Download and conversion process have been triggered successfully!").build();
		} catch(Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
		
	}
	
}
