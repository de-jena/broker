/**
 * Copyright (c) 2012 - 2017 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mqtt.message.adapter;

/**
 * Enumeration represents the quality of service
 * @author Mark Hoffmann
 * @since 10.10.2017
 */
public enum QoS {
	
	AT_MOST_ONE,
	AT_LEAST_ONE,
	EXACTLY_ONE

}
