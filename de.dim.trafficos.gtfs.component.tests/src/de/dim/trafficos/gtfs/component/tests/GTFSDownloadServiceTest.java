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

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.dim.trafficos.publictransport.apis.gtfs.GTFSDownloadService;


/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class GTFSDownloadServiceTest {
	
	@InjectService
	ConfigurationAdmin configAdmin;
	
	@Test
	@Order(-1)
	public void testServices(@InjectService ServiceAware<GTFSDownloadService> serviceAware) {
		assertThat(serviceAware).isNotNull();
		GTFSDownloadService service = serviceAware.getService();
		assertThat(service).isNotNull();
	}
	
//	@Disabled("This test uses the actual permanent link we would need for the download. However, since the downloads are limited to 5 per weeks we should not trigger the test always to avoid unuseless downloads.")
	@Test
	public void testDownloadGermanStopsData(@InjectService ServiceAware<GTFSDownloadService> serviceAware) {
		assertThat(serviceAware).isNotNull();
		GTFSDownloadService service = serviceAware.getService();
		assertThat(service).isNotNull();
		
		service.downloadGermanStopsData();
		
		File folder = new File(System.getProperty("base.path") + "/data/");
		Path file = null;
		try {
			file = Files.list(folder.toPath()).filter(p -> p.getFileName().toString().startsWith("deutschlandweite-haltestellendaten-xml") && p.getFileName().toString().endsWith(".zip")).findFirst().orElse(null);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertThat(file).isNotNull();

	}
	
	@Disabled("This test uses the actual permanent link we would need for the download. However, since the downloads are limited to 5 per weeks we should not trigger the test always to avoid unuseless downloads.")
	@Test
	public void testDownloadGermanScheduleData(@InjectService ServiceAware<GTFSDownloadService> serviceAware) {
		assertThat(serviceAware).isNotNull();
		GTFSDownloadService service = serviceAware.getService();
		assertThat(service).isNotNull();
		
		service.downloadGermanScheduleData();
		
		File folder = new File(System.getProperty("base.path") + "/data/");
		Path file = null;
		try {
			file = Files.list(folder.toPath()).filter(p -> p.getFileName().toString().startsWith("deutschlandweite-sollfahrplandaten-gtfs") && p.getFileName().toString().endsWith(".zip")).findFirst().orElse(null);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertThat(file).isNotNull();
	}
	
	@AfterEach
	public void afterEach() {
		
		File folder = new File(System.getProperty("base.path") + "/data/");
		Path file = null;
		try {
			file = Files.list(folder.toPath()).filter(p -> p.getFileName().toString().startsWith("deutschlandweite-haltestellendaten-xml") && p.getFileName().toString().endsWith(".zip")).findFirst().orElse(null);
			if(file != null) Files.delete(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
		file = null;
		try {
			file = Files.list(folder.toPath()).filter(p -> p.getFileName().toString().startsWith("deutschlandweite-sollfahrplandaten-gtfs") && p.getFileName().toString().endsWith(".zip")).findFirst().orElse(null);
			if(file != null) Files.delete(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		folder = new File(System.getProperty("base.path") + "/data/deutschlandweite-haltestellendaten-xml");
		if(folder.exists()) folder.delete();
		
		folder = new File(System.getProperty("base.path") + "/data/deutschlandweite-sollfahrplandaten-gtfs");
		if(folder.exists()) folder.delete();
	}

}
