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
package de.jena.traficam.sensinact;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.sensinact.core.annotation.dto.Data;
import org.eclipse.sensinact.core.annotation.dto.Model;
import org.eclipse.sensinact.core.annotation.dto.ModelPackageUri;
import org.eclipse.sensinact.core.annotation.dto.Provider;
import org.eclipse.sensinact.core.annotation.dto.Service;
import org.eclipse.sensinact.core.annotation.dto.Timestamp;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

import de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage;

@ModelPackageUri(TraficamproviderPackage.eNS_URI)
@Model("TrafiCam")
public class TrafiCamDto {

	public TrafiCamDto(String camId, String classId, String classificationName, GeoJsonObject objects) {
		this.camId = camId;
		this.classification = classId;
		this.classificationName = classificationName;
		this.objects = objects;
	}

	@Model
	public EClass providerEClass = TraficamproviderPackage.Literals.TRAFICAM_PROVIDER;

	@Provider
	public String camId;

	@Service
	public EClass serviceEClass = TraficamproviderPackage.Literals.OBSERVED_OBJECTS;

	@Service
	public String classification;

	@Data
	public String classificationName;

	@Data
	public GeoJsonObject objects;

	@Timestamp
	public long timestamp;

}