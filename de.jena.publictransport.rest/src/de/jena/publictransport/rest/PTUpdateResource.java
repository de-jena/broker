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
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.annotations.RequireJakartarsWhiteboard;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;
import org.osgi.service.servlet.whiteboard.annotations.RequireHttpWhiteboard;

import de.dim.trafficos.publictransport.apis.PTApiUpdateService;
import de.jena.udp.model.trafficos.publictransport.PTUpdateValueType;
import de.jena.udp.model.trafficos.publictransport_api.TOSPublicTransportApiFactory;
import de.jena.udp.model.trafficos.publictransport_api.Update;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * 
 * @author ilenia
 * @since Jul 12, 2023
 */
@RequireJakartarsWhiteboard
@RequireHttpWhiteboard
@JakartarsResource
@RequireEMFMessageBodyReaderWriter
@Component(name = "PTUpdateResource", service = PTUpdateResource.class, scope = ServiceScope.PROTOTYPE)
@Path("")
public class PTUpdateResource {
	
	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	PTApiUpdateService apiUpdateService;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, "application/xmi"})
	@Path("/updates/trip/{vehicleId}")
	public Response getTripUpdate(@PathParam("vehicleId") String vehicleId) {
		return getUpdate(vehicleId, PTUpdateValueType.TRIP_DATA);
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, "application/xmi"})
	@Path("/updates/position/{vehicleId}")
	public Response getPositionUpdate(@PathParam("vehicleId") String vehicleId) {
		return getUpdate(vehicleId, PTUpdateValueType.GEO_INFO);
	}

	private Response getUpdate(String vehicleId, PTUpdateValueType updateType) {
		Update update = apiUpdateService.getLatestUpdateByType(vehicleId, updateType);
		if(update == null) return Response.noContent().build();
		de.jena.udp.model.trafficos.publictransport_api.Response response = TOSPublicTransportApiFactory.eINSTANCE.createResponse();
		response.getData().add(update);
		return Response.ok(response).build();
	}
}
