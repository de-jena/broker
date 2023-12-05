/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.sensinact.rest.log;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.StringJoiner;

import org.osgi.framework.FrameworkUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsApplicationSelect;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * 
 * @author Juergen Albert
 * @since 25 Aug 2023
 */
@JakartarsResource
@JakartarsName("logs")
@Component(service = LogResource.class, scope = ServiceScope.PROTOTYPE)
@Path("/logs")
@JakartarsApplicationSelect("(applicationId=control)")
public class LogResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN) 
	@Consumes(MediaType.WILDCARD)
	@Path("/hello")
	public String hello() {
		
		return "hello";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN) 
	@Consumes(MediaType.WILDCARD)
	@Path("/")
	public String root() {
		
		String logDir = FrameworkUtil.getBundle(getClass()).getBundleContext().getProperty("gecko.log.dir");
		
		File logsDir = new File(logDir);
		
		StringJoiner joiner = new StringJoiner("\n");
		joiner.add("Log Files available");
		
		Arrays.asList(logsDir.list()).forEach(joiner::add); 
		
		return joiner.toString();
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN) 
	@Consumes(MediaType.WILDCARD)
	@Path("/{file}")
	public Response file(@PathParam("file") String fileName) {
		
		String logDir = FrameworkUtil.getBundle(getClass()).getBundleContext().getProperty("gecko.log.dir");
		
		File logsDir = new File(logDir);
		
		File file = new File(logsDir, fileName); 
		
		if(!file.exists()) {
			return Response.noContent().build();
		}
		
		try {
//			String result = Files.readString(file.toPath());
//			return Response.ok(result, MediaType.TEXT_PLAIN).build();
			return Response.ok(new FileInputStream(file), MediaType.TEXT_PLAIN).build();
		} catch (Exception e) {
			throw new WebApplicationException("Error loading file " + fileName, e);
		} 
	}
	
}
