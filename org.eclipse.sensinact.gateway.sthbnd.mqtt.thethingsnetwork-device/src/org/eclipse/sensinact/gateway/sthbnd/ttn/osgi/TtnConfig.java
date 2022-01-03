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
package org.eclipse.sensinact.gateway.sthbnd.ttn.osgi;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

/**
 * 
 * @author ungei
 * @since 3 Nov 2021
 */
@ObjectClassDefinition(pid = "TtnConfig")
public @interface TtnConfig {

	public static final String _PREFIX = "the.things.network";
	
	@AttributeDefinition(required = true)
	public String applicationId();

	@AttributeDefinition(required = true)
	public String applicationKey();

	@AttributeDefinition(required = true)
    public String brokerHost();

    public int brokerPort() default 8883;

    public String brokerProtocol() default "SSL";
	
}
