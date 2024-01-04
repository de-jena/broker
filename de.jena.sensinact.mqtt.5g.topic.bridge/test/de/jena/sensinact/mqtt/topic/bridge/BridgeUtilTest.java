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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author Juergen Albert
 * @since 4 Jan 2024
 */
class BridgeUtilTest {

	@Test
	void test() {
		assertTrue(BridgeUtil.isRetained("5g/test/bla/retained"));
		assertTrue(BridgeUtil.isRetained("5g/test/retained/bla"));
		assertFalse(BridgeUtil.isRetained("5g/test/retain/bla"));
	}

}
