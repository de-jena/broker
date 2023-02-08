/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
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
package de.dim.smart.city.csv.api;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface CSVImportService {

	public void importCSV(InputStream is) throws IOException, ParseException;

}
