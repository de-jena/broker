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

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.List;

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

import de.dim.trafficos.publictransport.apis.PTUpdateService;
import de.dim.trafficos.publictransport.apis.index.PTUpdateIndexService;
import de.dim.trafficos.publictransport.apis.search.PTUpdateSearchService;
import de.dim.trafficos.publictransport.component.tests.helper.PublicTransportTestHelper;
import de.jena.udp.model.trafficos.publictransport.PTUpdate;
import de.jena.udp.model.trafficos.publictransport.PTUpdateValueType;



/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class PTUpdateSearchServiceTest {
	
	public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
	
	@Test
	public void testServices(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService(timeout=5000l) ServiceAware<PTUpdateService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTUpdateSearchService> searchAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTUpdateService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTUpdateSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
	}
	
	@Test
	public void testSearchUpdateByTypeAndVehicle(@InjectService(timeout=5000l) ServiceAware<PTUpdateService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTUpdateSearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTUpdateService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTUpdateSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		PTUpdate update = PublicTransportTestHelper.getTestPTUpdate("vehicleRef", PTUpdateValueType.GEO_INFO, Instant.now().toEpochMilli());
		service.savePTUpdate(update);
		
		update = searchService.getLatestUpdateByTypeAndVehicle("vehicleRef", PTUpdateValueType.GEO_INFO);
		assertThat(update).isNotNull();
	
		update = searchService.getLatestUpdateByTypeAndVehicle("vehicleRef", PTUpdateValueType.DOOR_CHANGE);
		assertThat(update).isNull();
		
		update = searchService.getLatestUpdateByTypeAndVehicle("another id", PTUpdateValueType.GEO_INFO);
		assertThat(update).isNull();
	}
	
	@Test
	public void testSearchLatestUpdateByTypeAndVehicle(@InjectService(timeout=5000l) ServiceAware<PTUpdateService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTUpdateSearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTUpdateService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTUpdateSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		long t1 = Instant.now().minusSeconds(3).toEpochMilli();
		PTUpdate update1 = PublicTransportTestHelper.getTestPTUpdate("vehicleRef", PTUpdateValueType.GEO_INFO, t1);
		service.savePTUpdate(update1);
		
		long t2 = Instant.now().toEpochMilli();
		PTUpdate update2 = PublicTransportTestHelper.getTestPTUpdate("vehicleRef", PTUpdateValueType.GEO_INFO, t2);
		service.savePTUpdate(update2);
		
		PTUpdate update = searchService.getLatestUpdateByTypeAndVehicle("vehicleRef", PTUpdateValueType.GEO_INFO);
		assertThat(update).isNotNull();
		assertThat(update.getTimestamp()).isEqualTo(t2);
	}
	
	@Test
	public void testSearchLatestUpdatesByType(@InjectService(timeout=5000l) ServiceAware<PTUpdateService> persistenceAware,
			@InjectService(timeout=5000l) ServiceAware<PTUpdateSearchService> searchAware) throws InterruptedException {
		
		assertThat(persistenceAware).isNotNull();
		assertThat(searchAware).isNotNull();
		
		PTUpdateService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTUpdateSearchService searchService = searchAware.getService();
		assertThat(searchService).isNotNull();
		
		long t1 = Instant.now().minusSeconds(3).toEpochMilli();
		PTUpdate update1 = PublicTransportTestHelper.getTestPTUpdate("vehicle1", PTUpdateValueType.ONLINE, t1);
		service.savePTUpdate(update1);
		
		long t2 = Instant.now().toEpochMilli();
		PTUpdate update2 = PublicTransportTestHelper.getTestPTUpdate("vehicle2", PTUpdateValueType.ONLINE, t2);
		service.savePTUpdate(update2);
		
		long t3 = Instant.now().toEpochMilli();
		PTUpdate update3 = PublicTransportTestHelper.getTestPTUpdate("vehicle1", PTUpdateValueType.ONLINE, t3);
		service.savePTUpdate(update3);
		
		List<PTUpdate> updates = searchService.getLatestUpdatesByType(PTUpdateValueType.ONLINE);
		assertThat(updates).hasSize(2);
		
		PTUpdate u1 = null, u2 = null;
		for(PTUpdate u : updates) {
			if(t2 == u.getTimestamp()) u1 = u;
			else if(t3 == u.getTimestamp()) u2 = u;
		}
		assertThat(u1).isNotNull();
		assertThat(u2).isNotNull();
	}
	
	@BeforeEach
	@AfterEach
	public void clean(@InjectService(cardinality = 1, timeout = 5000, filter = "(database=trafficos)") ServiceAware<MongoDatabaseProvider> dbProviderAware,
			@InjectService ServiceAware<PTUpdateIndexService> indexAware) {
		
		assertThat(dbProviderAware.getServices()).hasSize(1);	
		MongoDatabaseProvider dbProvider = dbProviderAware.getService();
		assertThat(dbProvider).isNotNull();	
		
		MongoDatabase database = dbProvider.getDatabase();
		database.drop();
		
		assertThat(indexAware).isNotNull();
		PTUpdateIndexService scheduleIndexService = indexAware.getService();
		scheduleIndexService.resetIndex();
	}
}
