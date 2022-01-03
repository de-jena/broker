/**
 * Copyright (c) 2012 - 2021 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.sensinact.publictransport;

import java.util.Date;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

/**
 * 
 * @author ungei
 * @since 20 Dec 2021
 */
@Component(service = Test.class)
public class Test {

	@Reference(cardinality = ReferenceCardinality.MANDATORY)
	Date test;
	
	@Activate
	public void activate() {
		System.out.println("Hello 2-1");
	}
	
	@Deactivate
	public void deactivate() {
		System.out.println("Deactivate");
	}
}
