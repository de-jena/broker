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

import java.time.LocalDate;
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

import de.dim.trafficos.publictransport.apis.PTScheduleService;
import de.dim.trafficos.publictransport.component.tests.helper.PublicTransportTestHelper;
import de.jena.udp.model.trafficos.publictransport.PTFrequencyType;
import de.jena.udp.model.trafficos.publictransport.PTSchedule;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;



/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class PTScheduleServiceTest {
	
	@Test
	public void testServices(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService(timeout=5000l) ServiceAware<PTScheduleService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTScheduleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
	}
	
	@Test
	public void testSaveNullSchedule(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService(timeout=5000l) ServiceAware<PTScheduleService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTScheduleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		PTSchedule[] nullArray = new PTSchedule[] {null};
		Assertions.assertThrows(Exception.class, () -> {
			service.savePTSchedule(nullArray);
		});
	}

	
	@Test
	public void testSaveValidSchedule(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTScheduleService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTScheduleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		service.savePTSchedule(PublicTransportTestHelper.getTestPTSchedule("2", 2, LocalDate.now().minusDays(1), LocalDate.now().plusDays(3)));
		
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTSchedule> schedules = repo.getAllEObjects(tosPackage.getPTSchedule());
		assertThat(schedules).isNotEmpty();
		assertThat(schedules).hasSize(1);
		
		PTSchedule schedule = schedules.get(0);
		assertThat(schedule.getId()).isNotNull();
	}
	
	@Test
	public void testUpdateSchedule(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTScheduleService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTScheduleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		service.savePTSchedule(PublicTransportTestHelper.getTestPTSchedule("2", 2, LocalDate.now().minusDays(1), LocalDate.now().plusDays(3)));
		
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTSchedule> schedules = repo.getAllEObjects(tosPackage.getPTSchedule());
		assertThat(schedules).isNotEmpty();
		assertThat(schedules).hasSize(1);
		
		PTSchedule schedule = schedules.get(0);
		String id = schedule.getId();
		assertThat(id).isNotNull();
		assertThat(schedule.getFrequencyDays()).isEmpty();
		
		PTSchedule updatedSchedule = PublicTransportTestHelper.getTestPTSchedule("2", 2, LocalDate.now().minusDays(1), LocalDate.now().plusDays(3));
		updatedSchedule.setScheduleId(schedule.getScheduleId());				
		updatedSchedule.getFrequencyDays().add(PTFrequencyType.FRIDAY);
		updatedSchedule.getFrequencyDays().add(PTFrequencyType.SATURDAY);		
		updatedSchedule.getFrequencyDays().add(PTFrequencyType.SUNDAY);
		service.savePTSchedule(updatedSchedule);
		schedules = repo.getAllEObjects(tosPackage.getPTSchedule());
		assertThat(schedules).isNotEmpty();
		assertThat(schedules).hasSize(1);
		schedule = schedules.get(0);
		assertThat(schedule.getId()).isEqualTo(id);
		assertThat(schedule.getFrequencyDays()).contains(PTFrequencyType.FRIDAY, PTFrequencyType.SATURDAY, PTFrequencyType.SUNDAY);
	}
	
	@Test
	public void testGetSchedule(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService(timeout=5000l) ServiceAware<PTScheduleService> persistenceAware) {
		
		assertThat(repoAware).isNotNull();
		assertThat(persistenceAware).isNotNull();
		
		PTScheduleService service = persistenceAware.getService();
		assertThat(service).isNotNull();
		
		service.savePTSchedule(PublicTransportTestHelper.getTestPTSchedule("2", 2, LocalDate.now().minusDays(1), LocalDate.now().plusDays(3)));
		
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		List<PTSchedule> schedules = repo.getAllEObjects(tosPackage.getPTSchedule());
		assertThat(schedules).isNotEmpty();
		assertThat(schedules).hasSize(1);
		
		PTSchedule schedule = schedules.get(0);
		String id = schedule.getId();
		
		schedule = service.getPTSchedule(id);
		assertThat(schedule).isNotNull();
		assertThat(schedule.getId()).isEqualTo(id);
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
