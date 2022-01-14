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
package de.dim.smart.city.mqtt.tests;

import static org.junit.Assert.assertNotNull;

import org.gecko.core.tests.AbstractOSGiTest;
import org.gecko.core.tests.ServiceChecker;
import org.gecko.emf.repository.EMFRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;

import de.dim.smart.city.mqtt.api.SenderTestService;
import de.dim.smart.city.mqtt.api.SimulatorTestService;
import de.dim.trafficos.model.device.Intersection;
import de.dim.trafficos.model.device.TOSDevicePackage;


/**
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
	
	/**
	 * Here you can put your test
	 * @throws InvalidSyntaxException 
	 * @throws InterruptedException 
	 */
	@Test
	public void test() throws InvalidSyntaxException, InterruptedException {
		ServiceChecker<EMFRepository> repoChecker = createTrackedChecker("(repo_id=test.test)", true);
		repoChecker.assertCreations(1, true);
		
		EMFRepository repo = getService(EMFRepository.class);
		
		Thread.sleep(1000);
		
		Intersection intersection = repo.getEObject(TOSDevicePackage.Literals.INTERSECTION, "6d664958-3c84-4c81-8b63-ee85a2a974ab");
		assertNotNull(intersection);
		
		ServiceChecker<SenderTestService> mqttChecker = createStaticTrackedChecker(SenderTestService.class);
		mqttChecker.assertCreations(1, true);
		SenderTestService mqttService = mqttChecker.getTrackedService();
		assertNotNull(mqttService);
		
		intersection.getRoad().clear();
		mqttService.sendEObject(intersection, "intersection/output");

		ServiceChecker<SimulatorTestService> simulChecker = createStaticTrackedChecker(SimulatorTestService.class);
		simulChecker.assertCreations(1, true);
		SimulatorTestService simulService = simulChecker.getTrackedService();
		assertNotNull(simulService);
		
		simulService.startSimulation();
		Thread.sleep(510000);	
	}
	
}
