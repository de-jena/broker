/**
 * Copyright (c) 2012 - 2019 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.trafficos.simulator.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;

import de.dim.trafficos.model.device.DataEntry;

/**
 * 
 * @author ilenia
 * @since Jun 25, 2019
 */
@Component(service=EventHandler.class, property = EventConstants.EVENT_TOPIC + "=device/topic/all/entries")
public class DataEntryEventHandler implements EventHandler {
	
	private final static Logger logger = Logger.getLogger(DataEntryEventHandler.class.getName());
	private Map<String, String> saveOptions = new HashMap<String, String>();
	
	@Reference(target="(repo_id=tos.trafficos)")
	private EMFRepository repository;
	
	@Activate
	public void activate() {
		logger.fine("DataEntryHandler Activated!");
	}

	/* 
	 * (non-Javadoc)
	 * @see org.osgi.service.event.EventHandler#handleEvent(org.osgi.service.event.Event)
	 */
	@Override
	public void handleEvent(Event event) {
		DataEntry entry = (DataEntry) event.getProperty("device.dataEntry");
		if (entry == null) {
			logger.severe("Received event with no data entry");
		} else {
			entry = EcoreUtil.copy(entry);
			saveOptions.put("COLLECTION_PARTITION_EXTENSION", entry.getDevice());			
			repository.save(entry, saveOptions);
		}
	}
}
