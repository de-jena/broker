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

import org.osgi.annotation.bundle.Requirement;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardResource;

/**
 * Webresource
 * @author Juergen Albert
 * @since 20 Mar 2023
 */
@Component(service = HttpResource.class)
@HttpWhiteboardResource(prefix = "/content", pattern = "/client/*")
@Requirement(namespace = "osgi.identity", filter = "(osgi.identity=org.eclipse.sensinact.gateway.northbound.sensorthings.rest.gateway)")
public class HttpResource {

}
