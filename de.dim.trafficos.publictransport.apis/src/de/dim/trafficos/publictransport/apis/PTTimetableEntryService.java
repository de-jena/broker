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
package de.dim.trafficos.publictransport.apis;

import org.osgi.annotation.versioning.ProviderType;

import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;

/**
 * 
 * @author ilenia
 * @since Jul 4, 2023
 */
@ProviderType
public interface PTTimetableEntryService {
	
	void savePTTimetableEntry(PTTimetableEntry... ptTimetableEntry);
	
	PTTimetableEntry getPTTimetableEntry(String ptTimetableEntryId);
}
