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

import de.dim.trafficos.publictransport.apis.PTUpdateService;
import de.dim.trafficos.publictransport.component.tests.helper.PublicTransportTestHelper;
import de.jena.udp.model.trafficos.publictransport.PTUpdate;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;



/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class PTUpdateServiceTest {
	
	@Test
	public void testServices(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService(timeout=5000l) ServiceAware<PTUpdateService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTUpdateService service = persistenceAware.getService();
		assertThat(service).isNotNull();
	}
	
	@Test
	public void testSaveNullUpdate(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService(timeout=5000l) ServiceAware<PTUpdateService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTUpdateService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTUpdate[] nullArray = new PTUpdate[] {null};
		Assertions.assertThrows(Exception.class, () -> {
			service.savePTUpdate(nullArray);
		});
	}

	
	@Test
	public void testSaveValidUpdate(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTUpdateService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTUpdateService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		service.savePTUpdate(PublicTransportTestHelper.getTestPTUpdate("vehicleId"));
		
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTUpdate> updates = repo.getAllEObjects(tosPackage.getPTUpdate());
		assertThat(updates).isNotEmpty();
		assertThat(updates).hasSize(1);
		
		PTUpdate update = updates.get(0);
		assertThat(update.getId()).isNotNull();
	}
	
	@Test
	public void testUpdate(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTUpdateService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTUpdateService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTUpdate update = PublicTransportTestHelper.getTestPTUpdate("vehicleId");
		update.setDataSource("IBIS");
		service.savePTUpdate(update);
		
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTUpdate> updates = repo.getAllEObjects(tosPackage.getPTUpdate());
		assertThat(updates).isNotEmpty();
		assertThat(updates).hasSize(1);
		
		update = updates.get(0);
		String id = update.getId();
		assertThat(id).isNotNull();
		assertThat(update.getDataSource()).isEqualTo("IBIS");
		
		update.setDataSource("VDV");
		service.savePTUpdate(update);
		updates = repo.getAllEObjects(tosPackage.getPTUpdate());
		assertThat(updates).isNotEmpty();
		assertThat(updates).hasSize(1);
		update = updates.get(0);
		assertThat(update.getId()).isEqualTo(id);
		assertThat(update.getDataSource()).isEqualTo("VDV");	
	}
	
	@Test
	public void testGetUpdate(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTUpdateService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTUpdateService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTUpdate update = PublicTransportTestHelper.getTestPTUpdate("vehicleId");
		service.savePTUpdate(update);
		
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTUpdate> updates = repo.getAllEObjects(tosPackage.getPTUpdate());
		assertThat(updates).isNotEmpty();
		assertThat(updates).hasSize(1);
		
		update = updates.get(0);
		String id = update.getId();
		assertThat(id).isNotNull();
		
		update = service.getPTUpdate(id);
		assertThat(update).isNotNull();
		assertThat(update.getId()).isEqualTo(id);
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
