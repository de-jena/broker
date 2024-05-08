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
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

import de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage;

@ModelPackageUri(TraficamproviderPackage.eNS_URI)
@Model("TrafiCam")
public class TrafiCamDto {

	public TrafiCamDto(String camId, int classification, String classificationName, GeoJsonObject objects) {
		this.camId = camId;
		this.classification = classification;
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
	public String serviceName = "objects";

	@Service("admin")
	public GeoJsonObject location;

	@Data
	public int classification;

	@Data
	public GeoJsonObject viewport;

	@Data
	public String classificationName;

	@Data
	public GeoJsonObject objects;

}