/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.sensinact.mqtt.topic.bridge;

/**
 * @author Juergen Albert
 * @since 4 Jan 2024
 */
public class BridgeUtil {
	
	/** RETAINED */
	private static final String RETAINED = "retained";
	
	/**
	 * @param baseTopic the basetopic to check
	 * @return true if it contains a segment named retained
	 */
	public static boolean isRetained(String baseTopic) {
		String[] segments = baseTopic.split("/");
		for(String segment : segments) {
			if(RETAINED.equals(segment)) {
				return true;
			}
		}
		return false;
	}
}
