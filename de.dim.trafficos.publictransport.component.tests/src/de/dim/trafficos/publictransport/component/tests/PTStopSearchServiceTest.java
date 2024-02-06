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
package de.dim.trafficos.publictransport.component.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.UUID;

import org.gecko.emf.repository.EMFRepository;
import org.gecko.mongo.osgi.MongoDatabaseProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import com.mongodb.client.MongoDatabase;

import de.dim.trafficos.publictransport.apis.PTStopService;
import de.dim.trafficos.publictransport.apis.index.PTStopIndexService;
import de.dim.trafficos.publictransport.apis.search.PTStopSearchService;
import de.dim.trafficos.publictransport.component.tests.helper.PublicTransportTestHelper;
import de.jena.udp.model.trafficos.publictransport.PTStop;



/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class PTStopSearchServiceTest {
	
	@Test
	public void testServices(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService(timeout=5000l) ServiceAware<PTStopService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTStopSearchService> searchAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTStopService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTStopSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
	}
	
	@Test
	public void testSearchStopByExistingId(@InjectService(timeout=5000l) ServiceAware<PTStopSearchService> searchAware,
			@InjectService(timeout=5000l) ServiceAware<PTStopService> persistenceAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTStopService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTStopSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		PTStop stop = PublicTransportTestHelper.getTestPTStop("Test", "de:test:test", PublicTransportTestHelper.getTestPosition(50.1234, 11.1234));
		String stopId = stop.getStopId();
		service.savePTStop(stop);
				
		List<PTStop> stops = searchService.searchStopByStopId(stopId);
		assertThat(stops).hasSize(1);
	}
	
	@Test
	public void testSearchStopByNonExistingId(@InjectService(timeout=5000l) ServiceAware<PTStopSearchService> searchAware,
			@InjectService(timeout=5000l) ServiceAware<PTStopService> persistenceAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTStopService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTStopSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		service.savePTStop(PublicTransportTestHelper.getTestPTStop("Test", "de:test:test", PublicTransportTestHelper.getTestPosition(50.1234, 11.1234)));
				
		List<PTStop> stops = searchService.searchStopByStopId(UUID.randomUUID().toString());
		assertThat(stops).hasSize(0);
	}
	
	@Test
	public void testSearchStopByExistingDHID(@InjectService(timeout=5000l) ServiceAware<PTStopSearchService> searchAware,
			@InjectService(timeout=5000l) ServiceAware<PTStopService> persistenceAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTStopService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTStopSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		service.savePTStop(PublicTransportTestHelper.getTestPTStop("Test", "de:test:test", PublicTransportTestHelper.getTestPosition(50.1234, 11.1234)));
				
		List<PTStop> stops = searchService.searchStopByDHID("de:test:test");
		assertThat(stops).hasSize(1);
	}
	
	@Test
	public void testSearchStopByNonExistingDHID(@InjectService(timeout=5000l) ServiceAware<PTStopSearchService> searchAware,
			@InjectService(timeout=5000l) ServiceAware<PTStopService> persistenceAware) {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTStopService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTStopSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		service.savePTStop(PublicTransportTestHelper.getTestPTStop("Test", "de:test:test", PublicTransportTestHelper.getTestPosition(50.1234, 11.1234)));
		
		List<PTStop> stops = searchService.searchStopByDHID("not a valid dhid");
		assertThat(stops).hasSize(0);
	}
	
	@Test
	public void testSearchStopByExistingName(@InjectService(timeout=5000l) ServiceAware<PTStopSearchService> searchAware,
			@InjectService(timeout=5000l) ServiceAware<PTStopService> persistenceAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTStopService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTStopSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		service.savePTStop(PublicTransportTestHelper.getTestPTStop("Test", "de:test:test", PublicTransportTestHelper.getTestPosition(50.1234, 11.1234)));
				
		List<PTStop> stops = searchService.searchStopByName("Test");
		assertThat(stops).hasSize(1);
	}
	
	@Test
	public void testSearchStopByWildcardName(@InjectService(timeout=5000l) ServiceAware<PTStopSearchService> searchAware,
			@InjectService(timeout=5000l) ServiceAware<PTStopService> persistenceAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTStopService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTStopSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		service.savePTStop(PublicTransportTestHelper.getTestPTStop("Jena Ost", "de:test:test1", PublicTransportTestHelper.getTestPosition(50.1234, 11.1234)));
		service.savePTStop(PublicTransportTestHelper.getTestPTStop("Jena Winzerla", "de:test:test2", PublicTransportTestHelper.getTestPosition(50.1234, 11.1234)));
				
		List<PTStop> stops = searchService.searchStopByName("Jena");
		assertThat(stops).hasSize(2);
	}
	
	@Test
	public void testSearchStopByNonExistingName(@InjectService(timeout=5000l) ServiceAware<PTStopSearchService> searchAware,
			@InjectService(timeout=5000l) ServiceAware<PTStopService> persistenceAware) {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTStopService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTStopSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		service.savePTStop(PublicTransportTestHelper.getTestPTStop("Test", "de:test:test", PublicTransportTestHelper.getTestPosition(50.1234, 11.1234)));
		
		List<PTStop> stops = searchService.searchStopByName("not a valid name");
		assertThat(stops).hasSize(0);
	}
	
	

	@BeforeEach
	@AfterEach
	public void clean(@InjectService(cardinality = 1, timeout = 5000, filter = "(database=trafficos)") ServiceAware<MongoDatabaseProvider> dbProviderAware,
			@InjectService ServiceAware<PTStopIndexService> indexAware) {
		
		assertThat(dbProviderAware.getServices()).hasSize(1);	
		MongoDatabaseProvider dbProvider = dbProviderAware.getService();
		assertThat(dbProvider).isNotNull();	
		
		MongoDatabase database = dbProvider.getDatabase();
		database.drop();
		
		assertThat(indexAware).isNotNull();
		PTStopIndexService indexService = indexAware.getService();
		indexService.resetIndex();
	}
}
