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

import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.rest.annotations.RequireEMFMessageBodyReaderWriter;
import org.gecko.emf.rest.annotations.json.EMFJSONConfig;
import org.gecko.emf.rest.annotations.json.EMFJSONConfig.USE;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsApplicationSelect;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import de.jena.sensinact.rest.tlc.control.model.control.Control;
import de.jena.sensinact.rest.tlc.control.model.control.IdsListReponse;
import de.jena.sensinact.rest.tlc.control.model.control.Phase;
import de.jena.sensinact.rest.tlc.control.model.control.PhasesListReponse;
import de.jena.sensinact.rest.tlc.control.model.control.Tlc;
import de.jena.sensinact.rest.tlc.control.model.control.TlcControlFactory;
import de.jena.sensinact.tlc.control.service.api.TlcControl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

/**
 * <p>
 * A control endpoint for TLCs
 * </p>
 * 
 * @since 1.0
 * @author Juergen Albert
 * @since 15 Sep 2022
 */
@JakartarsResource
@JakartarsName("tlc")
@Component(service = TLCControlResource.class, enabled = true, scope = ServiceScope.PROTOTYPE)
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@RequireEMFMessageBodyReaderWriter
@RequireEMFJson
@Server(url = "http://localhost:8080/sensinact/rest/")
@JakartarsApplicationSelect("(applicationId=tlc)")
public class TLCControlResource {

	@Reference
	private TlcControl tlcControl;
	
	@Reference
	private TlcControlFactory factory;
	
	@GET
	@Path("/")
	@Operation(description = "Returns a Response containing the Ids of known TLCs", 
		
		responses = {
				@ApiResponse(responseCode = "204", description = "No TLCs available", content = {@Content(schema = @Schema(oneOf = IdsListReponse.class))}),
				@ApiResponse(responseCode = "200", description = "A IdsList Response")
		})
	@EMFJSONConfig(serializeDefaultValues = true)
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
			@ApiResponse(responseCode = "204", description = "No TLC with this ID found", content = {@Content(schema = @Schema(oneOf = Tlc.class))}),
			@ApiResponse(responseCode = "200", description = "The desired TLC")
	})
	@EMFJSONConfig(serializeDefaultValues = true)
	public Response getTlcById(@PathParam("tlcId") String tlcId) {
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
	@EMFJSONConfig(serializeDefaultValues = true)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response setTlcAliveById(@PathParam("tlcId") String tlcId) {
		return Response.ok().build();
	}

	@GET
	@Path("/{tlcId}/control/phase")
	@Operation(description = "Returns a Response containing the Phases", 
	responses = {
			@ApiResponse(responseCode = "404", description = "No TLC with the given ID exists"),
			@ApiResponse(responseCode = "204", description = "No Phases for this TLC available"),
			@ApiResponse(responseCode = "200", description = "A Response with the availalble Phases", content = {@Content(schema = @Schema(oneOf = PhasesListReponse.class))})
	})
	@EMFJSONConfig(serializeDefaultValues = true)
	public Response getAllTlcPhases(@PathParam("tlcId") String tlcId) {
		if(tlcControl.tlcExists(tlcId)) {
			List<Phase> phases = tlcControl.getPhases(tlcId);
			if(phases.isEmpty()) {
				return Response.noContent().build();
			}
			PhasesListReponse phasesListReponse = factory.createPhasesListReponse();
			phasesListReponse.getPhases().addAll(phases);
			return Response.ok(phasesListReponse).build();
		}
		throw new WebApplicationException("TLC does not exist", Status.NOT_FOUND);
	}

	@GET
	@Path("/{tlcId}/control/phase/{phaseId}")
	@Operation(description = "Returns the Phase with the specified ID", 
	responses = {
			@ApiResponse(responseCode = "404", description = "No TLC with the given ID exists"),
			@ApiResponse(responseCode = "204", description = "No Phase with the fiven ID for this TLC available"),
			@ApiResponse(responseCode = "200", description = "The requested Phase", content = {@Content(schema = @Schema(oneOf = Phase.class))})
	})
	@EMFJSONConfig(serializeDefaultValues = true)
	public Response getTlcPhase(@PathParam("tlcId") String tlcId, @PathParam("phaseId") String phaseId) {
		if(tlcControl.tlcExists(tlcId)) {
			Optional<Phase> phase = tlcControl.getPhase(tlcId, phaseId);
			return Response.ok(phase).build();
		}
		throw new WebApplicationException("TLC does not exist", Status.NOT_FOUND);
	}

	@PUT
	@POST
	@Path("/{tlcId}/control/phase")
	@Operation(description = "Adds or replaces the Phase for a TLC", 
	responses = {
			@ApiResponse(responseCode = "404", description = "No TLC with the given ID exists"),
			@ApiResponse(responseCode = "200", description = "Phase saved sucessfully")
	})
	@EMFJSONConfig(serializeDefaultValues = true)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addTlcPhase(@PathParam("tlcId") String tlcId,@EMFJSONConfig(typeUSE = USE.CLASS) Phase phase) {
		if(tlcControl.tlcExists(tlcId)) {
			tlcControl.savePhase(tlcId, phase);
			return Response.ok().build();
		}
		throw new WebApplicationException("TLC does not exist", Status.NOT_FOUND);
	}

	@DELETE
	@Path("/{tlcId}/control/phase/{phaseId}")
	@Operation(description = "Deltes a Phase for a TLC", 
	responses = {
			@ApiResponse(responseCode = "404", description = "No TLC with the given ID exists"),
			@ApiResponse(responseCode = "204", description = "Phase with the given ID does not exist"),
			@ApiResponse(responseCode = "200", description = "Phase deleted sucessfully")
	})
	@EMFJSONConfig(serializeDefaultValues = true)
	public Response removeTlcPhase(@PathParam("tlcId") String tlcId, @PathParam("phaseId") String phaseId) {
		if(tlcControl.tlcExists(tlcId)) {
			if(tlcControl.removePhase(tlcId, phaseId)) {
				return Response.ok().build();
			} else {
				return Response.noContent().build();
			}
		}
		throw new WebApplicationException("TLC does not exist", Status.NOT_FOUND);
	}

	/**
	 * @param tlcId
	 * @return the currently set phase. If no control is set yet, a 204 will be returned.
	 */
	@GET
	@Path("/{tlcId}/control")
	@Operation(description = "Gets the current control phase", 
	responses = {
			@ApiResponse(responseCode = "404", description = "No TLC with the given ID exists"),
			@ApiResponse(responseCode = "200", description = "The current control phase", content = {@Content(schema = @Schema(oneOf = Control.class))})
	})
	@EMFJSONConfig(serializeDefaultValues = true)
	public Optional<Control> getTlcPhase(@PathParam("tlcId") String tlcId) {
		if(tlcControl.tlcExists(tlcId)) {
			return tlcControl.getControlPhase(tlcId);
		}
		throw new WebApplicationException("TLC does not exist", Status.NOT_FOUND);
	}

	@POST
	@Path("/{tlcId}/control")
	@Operation(description = "Sets the current control phase", 
	responses = {
			@ApiResponse(responseCode = "404", description = "No TLC with the given ID exists"),
			@ApiResponse(responseCode = "200", description = "Control phase set sucesfully")
	})
	@EMFJSONConfig(serializeDefaultValues = true)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response setTlcPhase(@PathParam("tlcId") String tlcId, Control control) {
		if(tlcControl.tlcExists(tlcId)) {
			tlcControl.setControlPhase(tlcId, control);
			return Response.ok().build();
		}
		throw new WebApplicationException("TLC does not exist", Status.NOT_FOUND);
	}
}
