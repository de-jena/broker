/**
 * Copyright (c) 2012 - 2018 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.trafficos.apis;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

import de.dim.trafficos.trafficlight.model.trafficlight.TLModule;

@ProviderType
public interface TLService{

	TLModule saveTLModule(TLModule module);
	
	List<TLModule> saveTLModules(TLModule ...modules);
	
	List<TLModule> getTLModulesById(String ...ids);

}
