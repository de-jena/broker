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

import de.dim.trafficos.publictransport.apis.PTRouteService;
import de.dim.trafficos.publictransport.component.tests.helper.PublicTransportTestHelper;
import de.jena.udp.model.trafficos.publictransport.PTRoute;
import de.jena.udp.model.trafficos.publictransport.PTRouteType;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;



/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class PTRouteServiceTest {
	
	@Test
	public void testServices(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService(timeout=5000l) ServiceAware<PTRouteService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTRouteService service = persistenceAware.getService();
		assertThat(service).isNotNull();
	}
	
	@Test
	public void testSaveNullRoute(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService(timeout=5000l) ServiceAware<PTRouteService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTRouteService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTRoute[] nullArray = new PTRoute[] {null};
		Assertions.assertThrows(Exception.class, () -> {
			service.savePTRoute(nullArray);
		});
	}

	
	@Test
	public void testSaveValidRoute(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTRouteService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTRouteService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		service.savePTRoute( PublicTransportTestHelper.getTestPTRoute());
		
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTRoute> routes = repo.getAllEObjects(tosPackage.getPTRoute());
		assertThat(routes).isNotEmpty();
		assertThat(routes).hasSize(1);
		
		PTRoute ptRoute = routes.get(0);
		assertThat(ptRoute.getId()).isNotNull();
	}
	
	@Test
	public void testUpdateRoute(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTRouteService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTRouteService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		service.savePTRoute(PublicTransportTestHelper.getTestPTRoute());
		
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTRoute> routes = repo.getAllEObjects(tosPackage.getPTRoute());
		assertThat(routes).isNotEmpty();
		assertThat(routes).hasSize(1);
		
		PTRoute ptRoute = routes.get(0);
		String id = ptRoute.getId();
		assertThat(id).isNotNull();
		assertThat(ptRoute.getType()).isEqualTo(PTRouteType.TRAM);
		
		PTRoute updatedRoute = PublicTransportTestHelper.getTestPTRoute();
		updatedRoute.setRouteId(ptRoute.getRouteId());
		
		updatedRoute.setType(PTRouteType.BUS);
		service.savePTRoute(updatedRoute);
		routes = repo.getAllEObjects(tosPackage.getPTRoute());
		assertThat(routes).isNotEmpty();
		assertThat(routes).hasSize(1);
		ptRoute = routes.get(0);
		assertThat(ptRoute.getId()).isEqualTo(id);
		assertThat(ptRoute.getType()).isEqualTo(PTRouteType.BUS);	
	}
	
	@Test
	public void testGetRoute(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTRouteService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTRouteService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		service.savePTRoute(PublicTransportTestHelper.getTestPTRoute());
		
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTRoute> routes = repo.getAllEObjects(tosPackage.getPTRoute());
		assertThat(routes).isNotEmpty();
		assertThat(routes).hasSize(1);
		
		PTRoute ptRoute = routes.get(0);
		String id = ptRoute.getId();
		assertThat(id).isNotNull();
		
		ptRoute = service.getPTRoute(id);
		assertThat(ptRoute).isNotNull();
		assertThat(ptRoute.getId()).isEqualTo(id);
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
