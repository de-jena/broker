/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.trafficos.publictransport.value.converter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.eclipse.emf.ecore.EDataType;
import org.gecko.emf.mongo.ValueConverter;
import org.osgi.service.component.annotations.Component;

/**
 * 
 * @author ilenia
 * @since Jul 5, 2023
 */
@Component(name = "LocalTimeConverter", property = "id=LocalTimeConverter")
public class LocalTimeConverter implements ValueConverter {
	
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.mongo.ValueConverter#convertMongoDBValueToEMFValue(org.eclipse.emf.ecore.EDataType, java.lang.Object)
	 */
	public Object convertMongoDBValueToEMFValue(EDataType eDataType, Object databaseValue) {
		if (eDataType.getInstanceClass().equals(LocalTime.class)) {
			return LocalTime.parse((String) databaseValue, DATE_TIME_FORMATTER);
		}
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.mongo.ValueConverter#convertEMFValueToMongoDBValue(org.eclipse.emf.ecore.EDataType, java.lang.Object)
	 */
	public Object convertEMFValueToMongoDBValue(EDataType eDataType, Object emfValue) {
		if (eDataType.getInstanceClass().equals(LocalTime.class)) {
			return ((LocalTime) emfValue).format(DATE_TIME_FORMATTER);
		}
		return null;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.mongo.ValueConverter#isConverterForType(org.eclipse.emf.ecore.EDataType)
	 */
	public boolean isConverterForType(EDataType eDataType) {
		if (eDataType.getInstanceClass().equals(LocalTime.class)) {
			return true;
		}
		return false;
	}

}
