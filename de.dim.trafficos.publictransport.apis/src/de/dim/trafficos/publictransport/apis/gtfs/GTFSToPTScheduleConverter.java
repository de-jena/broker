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
package de.dim.trafficos.publictransport.apis.gtfs;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

import de.jena.udp.model.trafficos.publictransport.PTSchedule;

/**
 * 
 * @author ilenia
 * @since Jul 6, 2023
 */
@ProviderType
public interface GTFSToPTScheduleConverter {
		
	List<PTSchedule> convertGTFSToPTScheduleFromFile(String pathToGTFSFile, String pathToGTFSCaledarFile, String pathToGTFSCalendarDatesFile, String... tripIds);

}
