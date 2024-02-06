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

import org.gecko.emf.repository.EMFRepository;
import org.gecko.mongo.osgi.MongoDatabaseProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import com.mongodb.client.MongoDatabase;

import de.dim.trafficos.publictransport.apis.PTStopService;
import de.dim.trafficos.publictransport.component.tests.helper.PublicTransportTestHelper;
import de.jena.udp.model.trafficos.publictransport.PTStop;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;



/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class PTStopServiceTest {
	
	@Test
	public void testServices(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService(timeout=5000l) ServiceAware<PTStopService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTStopService service = persistenceAware.getService();
		assertThat(service).isNotNull();
	}
	
	@Test
	public void testSaveNullStop(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService(timeout=5000l) ServiceAware<PTStopService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTStopService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTStop[] nullArray = new PTStop[] {null};
		Assertions.assertThrows(Exception.class, () -> {
			service.savePTStop(nullArray);
		});
	}

	
	@Test
	public void testSaveValidStop(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTStopService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTStopService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		service.savePTStop(PublicTransportTestHelper.getTestPTStop("Test", "de:test:test", PublicTransportTestHelper.getTestPosition(50.1234, 11.1234)));
		
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTStop> stops = repo.getAllEObjects(tosPackage.getPTStop());
		assertThat(stops).hasSize(1);
		
		PTStop ptStop = stops.get(0);
		assertThat(ptStop.getId()).isNotNull();
	}
	
	@Test
	public void testUpdateStop(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTStopService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTStopService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		service.savePTStop( PublicTransportTestHelper.getTestPTStop("Test", "de:test:test", PublicTransportTestHelper.getTestPosition(50.1234, 11.1234)));
		
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTStop> stops = repo.getAllEObjects(tosPackage.getPTStop());
		assertThat(stops).hasSize(1);
		
		PTStop ptStop = stops.get(0);
		
		String id = ptStop.getId();
		assertThat(id).isNotNull();
		assertThat(ptStop.getName()).isEqualTo("Test");
		
		PTStop updatedStop = PublicTransportTestHelper.getTestPTStop("Test", "de:test:test", PublicTransportTestHelper.getTestPosition(50.1234, 11.1234));
		updatedStop.setStopId(ptStop.getStopId());
		updatedStop.setName("Another name");
		
		service.savePTStop(updatedStop);
		
		stops = repo.getAllEObjects(tosPackage.getPTStop());
		assertThat(stops).hasSize(1);
		
		updatedStop = stops.get(0);
		assertThat(updatedStop.getId()).isEqualTo(id);
		assertThat(updatedStop.getName()).isEqualTo("Another name");	
	}
	
	@Test
	public void testGetStop(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTStopService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTStopService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		service.savePTStop(PublicTransportTestHelper.getTestPTStop("Test", "de:test:test", PublicTransportTestHelper.getTestPosition(50.1234, 11.1234)));
		
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTStop> stops = repo.getAllEObjects(tosPackage.getPTStop());
		assertThat(stops).hasSize(1);
		
		PTStop ptStop = stops.get(0);
		
		String id = ptStop.getId();
		assertThat(id).isNotNull();
		
		ptStop = service.getPTStop(id);
		assertThat(ptStop).isNotNull();
		assertThat(ptStop.getId()).isEqualTo(id);
	}
	

	@BeforeEach
	@AfterEach
	public void clean(@InjectService(cardinality = 1, timeout = 5000, filter = "(database=trafficos)") ServiceAware<MongoDatabaseProvider> dbProviderAware) {
		
		assertThat(dbProviderAware.getServices()).hasSize(1);	
		MongoDatabaseProvider dbProvider = dbProviderAware.getService();
		assertThat(dbProvider).isNotNull();	
		
		MongoDatabase database = dbProvider.getDatabase();
		database.drop();
	}
}
