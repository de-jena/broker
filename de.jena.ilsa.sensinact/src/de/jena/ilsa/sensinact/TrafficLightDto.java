/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.ilsa.sensinact;

import java.time.temporal.ChronoUnit;

import org.eclipse.sensinact.core.annotation.dto.Data;
import org.eclipse.sensinact.core.annotation.dto.Model;
import org.eclipse.sensinact.core.annotation.dto.ModelPackageUri;
import org.eclipse.sensinact.core.annotation.dto.Provider;
import org.eclipse.sensinact.core.annotation.dto.Resource;
import org.eclipse.sensinact.core.annotation.dto.Service;
import org.eclipse.sensinact.core.annotation.dto.Timestamp;

import de.jena.ilsa.sensinact.model.ilsa.IlsaPackage;

@ModelPackageUri(IlsaPackage.eNS_URI)
@Service("data")
@Model("Ilsa")
public class TrafficLightDto {

//	@Model
//	public String model = "Ilsa";

	@Provider
	public String intersection;

	@Service
	public String signal;

	@Resource
	public String resource;

	@Data
	public String data;

	@Timestamp(ChronoUnit.MILLIS)
	public long timestamp;

}