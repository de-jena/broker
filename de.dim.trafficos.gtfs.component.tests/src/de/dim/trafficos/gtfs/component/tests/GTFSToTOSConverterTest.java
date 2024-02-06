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
package de.dim.trafficos.gtfs.component.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.gecko.emf.repository.EMFRepository;
import org.gecko.mongo.osgi.MongoDatabaseProvider;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import com.mongodb.client.MongoDatabase;

import de.dim.trafficos.publictransport.apis.gtfs.GTFSToTOSPublicTransportConverter;
import de.jena.udp.model.trafficos.publictransport.PTRoute;
import de.jena.udp.model.trafficos.publictransport.PTSchedule;
import de.jena.udp.model.trafficos.publictransport.PTStop;
import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;


/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class GTFSToTOSConverterTest {
	
	private static final SimpleDateFormat SIMPLE_STOP_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	private static final SimpleDateFormat SIMPLE_SCHEDULE_DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");

	
	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx) {
		
	}
	
	@Test
	@Order(-1)
	public void testServices(@InjectService ServiceAware<GTFSToTOSPublicTransportConverter> converterAware) {
		assertThat(converterAware).isNotNull();
		GTFSToTOSPublicTransportConverter converter = converterAware.getService();
		assertThat(converter).isNotNull();
	}
	
	@Test
	public void testConvertStops(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService ServiceAware<GTFSToTOSPublicTransportConverter> converterAware) throws InterruptedException {
		
		assertThat(repoAware).isNotNull();
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		assertThat(converterAware).isNotNull();
		GTFSToTOSPublicTransportConverter converter = converterAware.getService();
		assertThat(converter).isNotNull();
		
		converter.importGTFSStopData();
		
		Thread.sleep(5000l);
		
		List<PTStop> stops = repo.getAllEObjects(tosPackage.getPTStop());
		assertThat(stops).isNotEmpty();
		stops.forEach(s -> {
			assertThat(s.getDataSource()).isEqualTo("OpenData");
			try {
				assertThat(s.getUpdateDate()).isEqualTo(SIMPLE_STOP_DATE_FORMAT.parse("2023-07-18"));
			} catch (ParseException e) {
				fail(e);
			}
		});
	
	}
	
	@Test
	public void testConvertSchedules(@InjectService(filter="(repo_id=trafficos.trafficos)") ServiceAware<EMFRepository> repoAware,
			@InjectService ServiceAware<TOSPublicTransportPackage> packageAware,
			@InjectService ServiceAware<GTFSToTOSPublicTransportConverter> converterAware) throws InterruptedException {
		
		assertThat(repoAware).isNotNull();
		EMFRepository repo = repoAware.getService();
		assertThat(repo).isNotNull();
		
		assertThat(packageAware).isNotNull();
		TOSPublicTransportPackage tosPackage = packageAware.getService();
		assertThat(tosPackage).isNotNull();
		
		assertThat(converterAware).isNotNull();
		GTFSToTOSPublicTransportConverter converter = converterAware.getService();
		assertThat(converter).isNotNull();
		
		converter.importGTFSScheduleData();
		
		Thread.sleep(5000l);
		
		List<PTRoute> routes =  repo.getAllEObjects(tosPackage.getPTRoute());
		assertThat(routes).isNotEmpty();
		routes.forEach(s -> {
			assertThat(s.getDataSource()).isEqualTo("OpenData");
			try {
				assertThat(s.getUpdateDate()).isEqualTo(SIMPLE_SCHEDULE_DATE_FORMAT.parse("20230717"));
			} catch (ParseException e) {
				fail(e);
			}
		});
		
		List<PTTimetableEntry> entries =  repo.getAllEObjects(tosPackage.getPTTimetableEntry());
		assertThat(entries).isNotEmpty();
		entries.forEach(s -> {
			assertThat(s.getDataSource()).isEqualTo("OpenData");
			try {
				assertThat(s.getUpdateDate()).isEqualTo(SIMPLE_SCHEDULE_DATE_FORMAT.parse("20230717"));
			} catch (ParseException e) {
				fail(e);
			}
		});
		
		List<PTSchedule> schedules =  repo.getAllEObjects(tosPackage.getPTSchedule());
		assertThat(schedules).isNotEmpty();
		schedules.forEach(s -> {
			assertThat(s.getDataSource()).isEqualTo("OpenData");
			try {
				assertThat(s.getUpdateDate()).isEqualTo(SIMPLE_SCHEDULE_DATE_FORMAT.parse("20230717"));
			} catch (ParseException e) {
				fail(e);
			}
		});
		
	}
	
	@BeforeAll
	@AfterAll
	public static void clean(@InjectService(cardinality = 1, timeout = 5000, filter = "(database=trafficos)") ServiceAware<MongoDatabaseProvider> dbProviderAware) {
		
		assertThat(dbProviderAware.getServices()).hasSize(1);	
		MongoDatabaseProvider dbProvider = dbProviderAware.getService();
		assertThat(dbProvider).isNotNull();	
		
		MongoDatabase database = dbProvider.getDatabase();
		database.drop();
	}

}
