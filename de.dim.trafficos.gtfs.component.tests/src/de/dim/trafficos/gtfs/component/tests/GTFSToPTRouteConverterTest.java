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

import java.io.IOException;
import java.util.Dictionary;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.dim.trafficos.publictransport.apis.gtfs.GTFSToPTRouteConverter;
import de.jena.udp.model.trafficos.publictransport.PTRoute;
import de.jena.udp.model.trafficos.publictransport.PTRouteType;


/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class GTFSToPTRouteConverterTest {
	
	@InjectService
	ConfigurationAdmin configAdmin;
	
	@Test
	@Order(-1)
	public void testServices(@InjectService ServiceAware<GTFSToPTRouteConverter> converterAware) {
		assertThat(converterAware).isNotNull();
		GTFSToPTRouteConverter converter = converterAware.getService();
		assertThat(converter).isNotNull();
	}
	
	@Test
	public void testConvertRoute(@InjectService ServiceAware<GTFSToPTRouteConverter> converterAware) {
		assertThat(converterAware).isNotNull();
		GTFSToPTRouteConverter converter = converterAware.getService();
		assertThat(converter).isNotNull();
		
		assertThat(configAdmin).isNotNull();
		try {
			Configuration config = configAdmin.getFactoryConfiguration("GTFSToTOSPublicTransportConverter", "pt", "?");
			Dictionary<String, Object> properties = config.getProperties();
			List<PTRoute> routes = converter.convertGTFSToPTRouteFromFile(System.getProperty("base.path") + "/data/"+ properties.get("pathToGTFSScheduleFolder")+ "routes.txt");
			assertThat(routes).isNotNull();
			assertThat(routes).isNotEmpty();
			PTRoute route = routes.get(0);
			assertThat(route.getRouteId()).isEqualTo("7202_3");
			assertThat(route.getShortName()).isEqualTo("252");
			assertThat(route.getLongName()).isNull();
			assertThat(route.getType()).isEqualTo(PTRouteType.BUS);
			assertThat(route.getColor()).isNull();
			assertThat(route.getDescription()).isNull();
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
