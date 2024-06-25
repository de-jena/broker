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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.sensinact.core.annotation.dto.Data;
import org.eclipse.sensinact.core.annotation.dto.Model;
import org.eclipse.sensinact.core.annotation.dto.ModelPackageUri;
import org.eclipse.sensinact.core.annotation.dto.Provider;
import org.eclipse.sensinact.core.annotation.dto.Resource;
import org.eclipse.sensinact.core.annotation.dto.Service;
import org.eclipse.sensinact.core.annotation.dto.Timestamp;

import de.jena.ilsa.sensinact.model.ilsa.IlsaPackage;

@ModelPackageUri(IlsaPackage.eNS_URI)
@Model("Ilsa")
public class TrafficLightDto {

	/**
	 * Creates a new instance.
	 * 
	 * @param intersectionId
	 * @param id
	 * @param state
	 */
	public TrafficLightDto(String intersectionId, String id, String state) {
		intersection = intersectionId;
		signal = id;
		data = state;
	}

	@Provider
	public String intersection;

	@Service
	public String signal;

	@Service
	public EClass serviceEClass = IlsaPackage.Literals.SIGNAL;

//	@Service
//	public EReference serviceRef = IlsaPackage.Literals.ILSA__THERMAL;

//	@Resource
//	public EAttribute res = IlsaPackage.Literals.SIGNAL__COLOR;

//	@Resource
//	public String resource = "color";

	@Resource("color")
	@Data
	public String data;

	@Timestamp(ChronoUnit.MILLIS)
	public long timestamp;

}