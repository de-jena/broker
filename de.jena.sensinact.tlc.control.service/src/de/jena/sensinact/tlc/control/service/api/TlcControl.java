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
package de.jena.sensinact.tlc.control.service.api;

import java.util.List;
import java.util.Optional;

import org.osgi.annotation.versioning.ProviderType;

import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Control;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Tlc;

@ProviderType
public interface TlcControl{

	/**
	 * @return A {@link List} containing all known TLC Ids
	 */
	List<String> getTlcIds();

	/**
	 * A specific TLC
	 * @param tlcId 
	 * @return
	 */
	Optional<Tlc> getTlc(String tlcId);

	/**
	 * @param tlcId
	 * @return
	 */
	List<Mode> getModes(String tlcId);

	/**
	 * @param tlcId
	 * @return
	 */
	boolean tlcExists(String tlcId);

	/**
	 * @param tlcId
	 * @param mode
	 */
	void saveMode(String tlcId, Mode mode);

	/**
	 * @param tlcId
	 * @param modeId
	 * return <code>false</code> if no mode existed with the given id. <code>true</code> if delete was successful. 
	 */
	boolean removeMode(String tlcId, String modeId);

	/**
	 * @param tlcId
	 */
	Optional<Control> getControlMode(String tlcId);

	/**
	 * @param tlcId
	 * @param modeId
	 * @return
	 */
	Optional<Mode> getMode(String tlcId, String modeId);

	/**
	 * @param tlcId
	 * @param control
	 * @return
	 */
	void setControlMode(String tlcId, Control control);

	// TODO: class provided by template

}
