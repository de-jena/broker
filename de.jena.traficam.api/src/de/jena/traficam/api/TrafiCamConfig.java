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
package de.jena.traficam.api;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "TrafiCam Configuration")
public @interface TrafiCamConfig {
    @AttributeDefinition(name = "Address", description = "Address including port of the camera")
	String address() default "localhost:9180";
    @AttributeDefinition(name = "ID", description = "Identifier of the camera. Is part of the topic where the data will be published.")
	String id();
}