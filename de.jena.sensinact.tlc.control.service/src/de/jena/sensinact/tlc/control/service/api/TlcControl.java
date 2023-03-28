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

import de.jena.sensinact.rest.tlc.control.model.control.Control;
import de.jena.sensinact.rest.tlc.control.model.control.Phase;
import de.jena.sensinact.rest.tlc.control.model.control.Tlc;


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
	List<Phase> getPhases(String tlcId);

	/**
	 * @param tlcId
	 * @return
	 */
	boolean tlcExists(String tlcId);

	/**
	 * @param tlcId
	 * @param Phase
	 */
	void savePhase(String tlcId, Phase Phase);

	/**
	 * @param tlcId
	 * @param PhaseId
	 * return <code>false</code> if no Phase existed with the given id. <code>true</code> if delete was successful. 
	 */
	boolean removePhase(String tlcId, String PhaseId);

	/**
	 * @param tlcId
	 */
	Optional<Control> getControlPhase(String tlcId);

	/**
	 * @param tlcId
	 * @param PhaseId
	 * @return
	 */
	Optional<Phase> getPhase(String tlcId, String PhaseId);

	/**
	 * @param tlcId
	 * @param control
	 * @return
	 */
	void setControlPhase(String tlcId, Control control);

	// TODO: class provided by template

}
