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
package de.dim.trafficos.gtfs.component;

import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.promise.PromiseFactory;

import de.dim.trafficos.publictransport.apis.gtfs.GTFSToTOSPublicTransportConverter;

/**
 * 
 * @author ilenia
 * @since Jul 7, 2023
 */
//Enable this component when you want to execute the GTFS import and place the GTFS files in the data folder of this bundle!
//@Component(name="GTFSToTOSImporter", immediate=true)
public class GTFSToTOSImporter {

	private static final Logger LOGGER = Logger.getLogger(GTFSToTOSImporter.class.getName());
	
	@Reference
	GTFSToTOSPublicTransportConverter GTSFToTOSConverter;
	
	private PromiseFactory factory = new PromiseFactory(Executors.newFixedThreadPool(4));

	
	
	@Activate
	public void activate() {
		System.out.print("Starting import...");
		factory.submit(() -> {
			GTSFToTOSConverter.importGTFSAllData();
			return true;
		}).onSuccess(t -> LOGGER.info("Finished GTFS import"))
		.onFailure(t -> LOGGER.log(Level.SEVERE, "Error importing GTFS Data.", t));	
	}
}
