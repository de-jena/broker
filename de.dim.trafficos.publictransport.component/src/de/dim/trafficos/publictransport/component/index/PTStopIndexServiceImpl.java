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
package de.dim.trafficos.publictransport.component.index;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.gecko.emf.mongo.ValueConverter;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.search.document.EObjectDocumentIndexObjectContext;
import org.gecko.search.IndexActionType;
import org.gecko.search.document.LuceneIndexService;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.PromiseFactory;
import org.osgi.util.pushstream.PushStream;

import de.dim.trafficos.publictransport.apis.index.PTStopIndexService;
import de.dim.trafficos.publictransport.component.helper.PTHelper;
import de.dim.trafficos.publictransport.component.index.helper.PTStopIndexHelper;
import de.jena.udp.model.trafficos.publictransport.PTStop;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;

/**
 * 
 * @author ilenia
 * @since Jul 4, 2023
 */
@Component(immediate = true, name = "PTStopIndexService", service = PTStopIndexService.class, scope = ServiceScope.SINGLETON, reference = {
		@Reference(name="LocalTimeConverter", target = "(id=LocalTimeConverter)", service = ValueConverter.class),
		@Reference(name="LocalDateConverter", target = "(id=LocalDateConverter)", service = ValueConverter.class)
})
public class PTStopIndexServiceImpl implements PTStopIndexService {
	
	@Reference(target = "(id=ptstop)")
	private LuceneIndexService<EObjectDocumentIndexObjectContext> publicTransportIndex;
	
	@Reference(target = "(|(repo_id=trafficos.trafficos)(repo_id=sensinact.sensinact))", cardinality = ReferenceCardinality.MANDATORY)
	private ComponentServiceObjects<EMFRepository> repositoryServiceObjects;
	
	@Reference
	private TOSPublicTransportPackage publicTransportPackage;
	
	private PromiseFactory factory = new PromiseFactory(Executors.newFixedThreadPool(4));
	
	private final static Logger LOGGER = Logger.getLogger(PTStopIndexServiceImpl.class.getName());
	
	@Activate
	public void activate() {
		factory.submit(() -> {
			CountDownLatch latch = new CountDownLatch(1);
			latch.await(5, TimeUnit.SECONDS);
			initializeIndex();
			return true;
		}).onSuccess(t -> LOGGER.info("Finished indexing PTStop objects!"))
		.onFailure(t -> t.printStackTrace());	
	}
	
	private Promise<Void> initializeIndex() {
		LOGGER.info("Starting indexing PTStop objects...");		
		resetIndex();

		EMFRepository repository = repositoryServiceObjects.getService();
		
		PushStream<EObject> pushStream = PTHelper.createPushStream(publicTransportPackage.getPTStop(), repository);
		if(pushStream == null) return null;
		Promise<Void> resultPromise = pushStream
				.map(eo -> (PTStop) eo)
				.forEach(p -> indexPTStop(p, true));
		
		return resultPromise.onFailure(t -> repositoryServiceObjects.ungetService(repository))
				.thenAccept(result -> LOGGER.info("Finished indexing PTStop object(s)!"))
				.thenAccept(result -> repositoryServiceObjects.ungetService(repository));
	}
	
	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.index.PTStopIndexService#resetIndex()
	 */
	@Override
	public void resetIndex() {
		try {
			if(publicTransportIndex.getIndexWriter().isOpen()) {
				publicTransportIndex.getIndexWriter().deleteAll();
				publicTransportIndex.commit();
			}
		} catch (IOException e) {
			LOGGER.severe("Could not delete PTStop index " + e);
		}	
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.index.PTStopIndexService#indexPTStop(de.jena.udp.model.trafficos.publictransport.PTStop, boolean)
	 */
	@Override
	public void indexPTStop(PTStop ptStop, boolean isFirstSave) {
		EObjectDocumentIndexObjectContext context = PTStopIndexHelper.mapPTStop(ptStop, isFirstSave ? IndexActionType.ADD : IndexActionType.MODIFY);			
		publicTransportIndex.handleContextSync(context);

	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.index.PTStopIndexService#deletePTStop(de.jena.udp.model.trafficos.publictransport.PTStop)
	 */
	@Override
	public void deletePTStop(PTStop ptStop) {
		EObjectDocumentIndexObjectContext context = PTStopIndexHelper.mapPTStop(ptStop, IndexActionType.REMOVE);			
		publicTransportIndex.handleContextSync(context);
	}

	
}
