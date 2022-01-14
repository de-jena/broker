/**
 * Copyright (c) 2012 - 2018 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.smart.city.r09.importer.tests;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.text.ParseException;
import java.util.UUID;

import org.gecko.core.tests.AbstractOSGiTest;
import org.gecko.core.tests.ServiceChecker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.osgi.framework.FrameworkUtil;

import de.dim.smart.city.r09.importer.api.R09ImportService;
import de.dim.trafficos.model.device.PublicTransportLine;
import de.dim.trafficos.model.device.TOSDeviceFactory;


/**
 * Test the import of R09 real data
 * 
 * @since 1.0
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleIntegrationTest extends AbstractOSGiTest {
	
	/**
	 * Creates a new instance.
	 * @param bundleContext
	 */
	public ExampleIntegrationTest() {
		super(FrameworkUtil.getBundle(ExampleIntegrationTest.class).getBundleContext());
	}

	/**
	 * Here you can put everything you want to be executed before every test
	 */
	public void doBefore() {
		
	}
	
	/**
	 * Here you can put everything you want to be executed after every test
	 */
	public void doAfter() {
		
	}
	
	
	@Test
	public void testService() {
		ServiceChecker<R09ImportService> r09Checker = createTrackedChecker(R09ImportService.class);
		r09Checker.assertCreations(1, true);
		R09ImportService r09Service = r09Checker.getTrackedService();
		assertNotNull(r09Service);
	}

	
	@Test
	public void testR09Import() throws IOException, ParseException {
		
		ServiceChecker<R09ImportService> r09Checker = createTrackedChecker(R09ImportService.class);
		r09Checker.assertCreations(1, true);
		R09ImportService r09Service = r09Checker.getTrackedService();
		assertNotNull(r09Service);
		
		String[] folderSuffix = {"072425", "075105", "081526", "084503", "090854", "094109", "100332", "103321",
				"105940", "112607", "115407", "122105", "124351", "131150", "133528", "140430", "142910", "145646",
				"152632", "155131", "161530", "164349", "170859", "173336", "175939", "182634", "185149", "191750",
				"193949", "201536", "203926", "205011"};
//		String[] folderSuffix = {"072425"};
				
		PublicTransportLine line = TOSDeviceFactory.eINSTANCE.createPublicTransportLine();
		line.setId(UUID.randomUUID().toString());
		line.setName("Test Tram L5");
		line.setLineNumber("5");	
		
		for(String suffix : folderSuffix) {
			String folderName = "data/logger_200706_"+suffix+"/logger";
			System.out.println("----------------------------");
			System.out.println("Processing Folder " + folderName);
			r09Service.importR09(folderName, line);
		}		
	}
	
}
