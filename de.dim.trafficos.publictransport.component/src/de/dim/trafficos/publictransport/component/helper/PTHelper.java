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
package de.dim.trafficos.publictransport.component.helper;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gecko.emf.mongo.Options;
import org.gecko.emf.mongo.pushstream.constants.MongoPushStreamConstants;
import org.gecko.emf.pushstream.EPushStreamProvider;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushStream;
import org.osgi.util.pushstream.QueuePolicyOption;
import org.osgi.util.pushstream.ThresholdPushbackPolicy;

import de.jena.udp.model.trafficos.common.IdElement;

/**
 * 
 * @author ilenia
 * @since Jul 4, 2023
 */
public class PTHelper {
	
	public static boolean isFirstSave(IdElement element, EClass eClass, EMFRepository repo) {
		if(element.getId() == null) return true;
		EObject eobj = repo.getEObject(eClass, element.getId());
		if(eobj == null) return true;
		return false;
	}
	
	public static boolean isFirstSave(EObject element, EClass eClass, EAttribute idAttribute, QueryRepository repo) {
		IQuery query = repo.createQueryBuilder().column(idAttribute).simpleValue(element.eGet(idAttribute)).build();
		EObject eobj = repo.getEObjectByQuery(eClass, query, null);
		if(eobj == null) return true;
		if(element instanceof IdElement idElement && eobj instanceof IdElement eobjIdElement) {
			idElement.setId(eobjIdElement.getId());
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends EList<? extends EObject>>void save(T eobjs, EMFRepository repo) {
		repo.save((EList<EObject>) eobjs);
	}
	
	public static PushStream<EObject> createPushStream(EClass eClass, EMFRepository repository) {
		QueryRepository queryRepo = (QueryRepository) repository.getAdapter(QueryRepository.class);
		IQuery query = queryRepo.createQueryBuilder().allQuery().build();

		
		EPushStreamProvider psp = queryRepo.getEObjectByQuery(eClass, query, getLoadOptions());
		if(psp == null) {
			return null;
		}
		
		return psp.createPushStreamBuilder()
				.withPushbackPolicy(ThresholdPushbackPolicy.createSimpleThresholdPushbackPolicy(50))
				.withQueuePolicy(QueuePolicyOption.BLOCK)
				.withExecutor(Executors.newSingleThreadExecutor())
				.withBuffer(new ArrayBlockingQueue<PushEvent<? extends EObject>>(100))
				.build();
	}
	
	public static Map<Object, Object> getLoadOptions(){
		Map<Object, Object> loadOptions = new HashMap<>();
		loadOptions.put(Options.OPTION_BATCH_SIZE, Integer.valueOf(600));
		loadOptions.put(MongoPushStreamConstants.OPTION_QUERY_PUSHSTREAM, Boolean.TRUE);
		return loadOptions;
	}

}
