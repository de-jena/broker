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
package de.jena.sensinact.sthbnd.rest.tlc.control;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jaxrs.whiteboard.annotations.RequireJaxrsWhiteboard;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsName;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;
import de.jena.sensinact.tlc.control.service.api.TlcControl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Control;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.IdsListReponse;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.ModesListReponse;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Tlc;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlFactory;

/**
 * <p>
 * A control endpoint for TLCs
 * </p>
 * 
 * @since 1.0
 */
/**
 * 
 * @author ungei
 * @since 15 Sep 2022
 */
@RequireJaxrsWhiteboard
@JaxrsResource
@JaxrsName("tlc")
@Component(service = TLCControlResource.class, enabled = true, scope = ServiceScope.PROTOTYPE)
@Path("/tlc")
@Produces(MediaType.APPLICATION_JSON)
public class TLCControlResource {

	@Reference
	private TlcControl tlcControl;
	
	@Reference
	private TlcControlFactory factory;
	
	@GET
	@Path("/")
	@Operation(description = "Returns a Response containing the Ids of known TLCs", 
		responses = {
				@ApiResponse(responseCode = "204", description = "No TLCs available"),
				@ApiResponse(responseCode = "200", description = "A IdsList Response")
		})
	public Response getTlcIds() {
		List<String> ids = tlcControl.getTlcIds();
		if(ids.isEmpty()) {
			return Response.noContent().build();
		}
		IdsListReponse idsListReponse = factory.createIdsListReponse();
		idsListReponse.getIds().addAll(ids);
		
		return Response.ok(idsListReponse).build();
	}

	@GET
	@Path("/{tlcId}")
	@Operation(description = "Returns a Response containing the Ids of known TLCs", 
	responses = {
			@ApiResponse(responseCode = "204", description = "No TLC with this ID found"),
			@ApiResponse(responseCode = "200", description = "The desired TLC")
	})
	public Response getTlcById(@QueryParam("tlcId") String tlcId) {
		Optional<Tlc> tlc = tlcControl.getTlc(tlcId);
		return Response.ok(tlc).build();
	}

	@POST
	@Path("/{tlcId}/control/alive")
	@Operation(description = "Post the alive ping for this TLC. Will return after the ping was forwarded.", 
	responses = {
			@ApiResponse(responseCode = "404", description = "No TLC with this ID found"),
			@ApiResponse(responseCode = "200", description = "Ping sucessfully send")
	})
	public Response setTlcAliveById(@QueryParam("tlcId") String tlcId) {
		return Response.ok().build();
	}

	@GET
	@Path("/{tlcId}/control/mode")
	@Operation(description = "Returns a Response containing the Mdoes", 
	responses = {
			@ApiResponse(responseCode = "404", description = "No TLC with the given ID exists"),
			@ApiResponse(responseCode = "204", description = "No Modes for this TLC available"),
			@ApiResponse(responseCode = "200", description = "A Response with the availalble Modes")
	})
	public Response getAllTlcModes(@QueryParam("tlcId") String tlcId) {
		if(tlcControl.tlcExists(tlcId)) {
			List<Mode> modes = tlcControl.getModes(tlcId);
			if(modes.isEmpty()) {
				return Response.noContent().build();
			}
			ModesListReponse modesListReponse = factory.createModesListReponse();
			modesListReponse.getModes().addAll(modes);
			return Response.ok(modesListReponse).build();
		}
		throw new WebApplicationException("TLC does not exist", Status.NOT_FOUND);
	}

	@GET
	@Path("/{tlcId}/control/mode/{modeId}")
	@Operation(description = "Returns the Mode with the specified ID", 
	responses = {
			@ApiResponse(responseCode = "404", description = "No TLC with the given ID exists"),
			@ApiResponse(responseCode = "204", description = "No Mode with the fiven ID for this TLC available"),
			@ApiResponse(responseCode = "200", description = "The requested Mode")
	})
	public Response getTlcMode(@QueryParam("tlcId") String tlcId, @QueryParam("modeId") String modeId) {
		if(tlcControl.tlcExists(tlcId)) {
			Optional<Mode> mode = tlcControl.getMode(tlcId, modeId);
			return Response.ok(mode).build();
		}
		throw new WebApplicationException("TLC does not exist", Status.NOT_FOUND);
	}

	@PUT
	@POST
	@Path("/{tlcId}/control/mode")
	@Operation(description = "Adds or replaces the Mode for a TLC", 
	responses = {
			@ApiResponse(responseCode = "404", description = "No TLC with the given ID exists"),
			@ApiResponse(responseCode = "200", description = "Mode saved sucessfully")
	})
	public Response addTlcMode(@QueryParam("tlcId") String tlcId, Mode mode) {
		if(tlcControl.tlcExists(tlcId)) {
			tlcControl.saveMode(tlcId, mode);
			return Response.ok().build();
		}
		throw new WebApplicationException("TLC does not exist", Status.NOT_FOUND);
	}

	@DELETE
	@Path("/{tlcId}/control/mode/{modeId}")
	@Operation(description = "Deltes a Mode for a TLC", 
	responses = {
			@ApiResponse(responseCode = "404", description = "No TLC with the given ID exists"),
			@ApiResponse(responseCode = "204", description = "Mode with the given ID does not exist"),
			@ApiResponse(responseCode = "200", description = "Mode deleted sucessfully")
	})
	public Response removeTlcMode(@QueryParam("tlcId") String tlcId, @QueryParam("modeId") String modeId) {
		if(tlcControl.tlcExists(tlcId)) {
			if(tlcControl.removeMode(tlcId, modeId)) {
				return Response.ok().build();
			} else {
				return Response.noContent().build();
			}
		}
		throw new WebApplicationException("TLC does not exist", Status.NOT_FOUND);
	}

	/**
	 * @param tlcId
	 * @return the currently set mode. If no control is set yet, a 204 will be returned.
	 */
	@GET
	@Path("/{tlcId}/control")
	@Operation(description = "Gets the current control mode", 
	responses = {
			@ApiResponse(responseCode = "404", description = "No TLC with the given ID exists"),
			@ApiResponse(responseCode = "200", description = "The current control mode")
	})
	public Optional<Control> getTlcMode(@QueryParam("tlcId") String tlcId) {
		if(tlcControl.tlcExists(tlcId)) {
			return tlcControl.getControlMode(tlcId);
		}
		throw new WebApplicationException("TLC does not exist", Status.NOT_FOUND);
	}

	@POST
	@Path("/{tlcId}/control")
	@Operation(description = "Sets the current control mode", 
	responses = {
			@ApiResponse(responseCode = "404", description = "No TLC with the given ID exists"),
			@ApiResponse(responseCode = "200", description = "Control mode set sucesfully")
	})
	public Response setTlcMode(@QueryParam("tlcId") String tlcId, Control control) {
		if(tlcControl.tlcExists(tlcId)) {
			tlcControl.setControlMode(tlcId, control);
			return Response.ok().build();
		}
		throw new WebApplicationException("TLC does not exist", Status.NOT_FOUND);
	}
}
