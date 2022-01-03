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

/**
 * 
 * @author mark
 * @since 24.09.2021
 */
public @interface MqttConfig {
	
	String id();
	String host();
	String username();
	String password();
	String topic();

}
