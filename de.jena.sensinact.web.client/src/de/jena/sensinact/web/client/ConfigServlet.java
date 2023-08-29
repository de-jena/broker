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
package de.jena.sensinact.web.client;

import java.io.IOException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 
 * @author Juergen Albert
 * @since 12 May 2023
 */
@Component(service = Servlet.class)
@HttpWhiteboardServletPattern("/client/config/config.json")
public class ConfigServlet extends HttpServlet {

	/** serialVersionUID */
	private static final long serialVersionUID = -9118138610544622889L;

	private static final String CONFIG_JSON = """
			{
			  "INFO_CHECK_URI":%s,
			  "INFO_BASE_URI":%s
			}
			""";
	
	/* 
	 * (non-Javadoc)
	 * @see jakarta.servlet.http.HttpServlet#doGet(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json");
		resp.setStatus(200);
		String config = CONFIG_JSON.formatted(getEnv("INFO_CHECK_URI"),getEnv("INFO_BASE_URI"));
		resp.getOutputStream().print(config);
	}

	/**
	 * @param string
	 * @return
	 */
	private Object getEnv(String key) {
		String env = System.getenv(key);
		if(env == null) {
			env = System.getProperty(key);
		}
		if(env == null) {
			return "null";
		}
		return "\"" + env + "\"";
	}
	
}
