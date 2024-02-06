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

import de.dim.trafficos.publictransport.apis.PTVehicleService;
import de.dim.trafficos.publictransport.component.tests.helper.PublicTransportTestHelper;
import de.jena.udp.model.trafficos.publictransport.PTType;
import de.jena.udp.model.trafficos.publictransport.PTVehicle;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;



/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class PTVehicleServiceTest {
	
	@Test
	public void testServices(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService(timeout=5000l) ServiceAware<PTVehicleService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTVehicleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
	}
	
	@Test
	public void testSaveNullPublicTransport(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService(timeout=5000l) ServiceAware<PTVehicleService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTVehicleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTVehicle[] nullArray = new PTVehicle[] {null};
		Assertions.assertThrows(Exception.class, () -> {
			service.savePTVehicle(nullArray);
		});
	}

	
	@Test
	public void testSaveValidPublicTransport(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTVehicleService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTVehicleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		service.savePTVehicle( PublicTransportTestHelper.getTestPTVehicle());
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTVehicle> vehicles = repo.getAllEObjects(tosPackage.getPTVehicle());
		assertThat(vehicles).hasSize(1);
		
		PTVehicle publicTransport = vehicles.get(0);
		assertThat(publicTransport.getId()).isNotNull();
	}
	
	@Test
	public void testUpdatePublicTransport(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTVehicleService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTVehicleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		service.savePTVehicle( PublicTransportTestHelper.getTestPTVehicle());
		
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTVehicle> vehicles = repo.getAllEObjects(tosPackage.getPTVehicle());
		assertThat(vehicles).hasSize(1);
		
		PTVehicle publicTransport = vehicles.get(0);
		
		String id = publicTransport.getId();
		assertThat(id).isNotNull();
		assertThat(publicTransport.getType()).isEqualTo(PTType.EBUS);
		
		publicTransport.setType(PTType.TRAM);
		service.savePTVehicle(publicTransport);
		
		vehicles = repo.getAllEObjects(tosPackage.getPTVehicle());
		assertThat(vehicles).hasSize(1);
		
		publicTransport = vehicles.get(0);
		assertThat(publicTransport.getId()).isEqualTo(id);
		assertThat(publicTransport.getType()).isEqualTo(PTType.TRAM);	
	}
	
	@Test
	public void testGetPublicTransport(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTVehicleService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTVehicleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		service.savePTVehicle( PublicTransportTestHelper.getTestPTVehicle());
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTVehicle> vehicles = repo.getAllEObjects(tosPackage.getPTVehicle());
		assertThat(vehicles).hasSize(1);
		
		PTVehicle publicTransport = vehicles.get(0);
		String id = publicTransport.getId();
		assertThat(id).isNotNull();
		
		publicTransport = service.getPTVehicle(id);
		assertThat(publicTransport).isNotNull();
		assertThat(publicTransport.getId()).isEqualTo(id);
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
