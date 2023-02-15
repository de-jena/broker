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
package de.dim.trafficos.trafficlight.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.gecko.emf.mongo.Options;
import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;

import de.dim.trafficos.apis.TLService;
import de.dim.trafficos.trafficlight.model.trafficlight.TLModule;
import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage;

@Component(name = "TLService", scope = ServiceScope.PROTOTYPE)
public class TLServiceImpl implements TLService{
	
	@Reference(target = "(repo_id=test.test)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	QueryRepository repo;
	
	@Reference
	TOSTrafficLightPackage tlPackage;

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.TLService#saveTLModule(de.dim.trafficos.trafficlight.model.trafficlight.TLModule)
	 */
	@Override
	public TLModule saveTLModule(TLModule module) {
		Objects.requireNonNull(module, "Canno save null TLModule!");
		repo.save(module, Collections.singletonMap(Options.OPTION_SERIALIZE_DEFAULT_ATTRIBUTE_VALUES, true));
		repo.detach(module);
		return module;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.TLService#saveTLModules(de.dim.trafficos.trafficlight.model.trafficlight.TLModule[])
	 */
	@Override
	public List<TLModule> saveTLModules(TLModule... modules) {
		List<TLModule> savedModules = new ArrayList<>();
		for(TLModule module : modules) {
			savedModules.add(saveTLModule(module));
		}
		return savedModules;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.TLService#getTLModulesById(java.lang.String[])
	 */
	@Override
	public List<TLModule> getTLModulesById(String... ids) {
		for(String id : ids) Objects.requireNonNull(id, "Cannot retrieve TLModule by null id!");
		IQuery query = repo.createQueryBuilder().column(tlPackage.getTLModule_Id()).in((Object[]) ids).build();
		return repo.getEObjectsByQuery(tlPackage.getTLModule(), query);
	}

}
