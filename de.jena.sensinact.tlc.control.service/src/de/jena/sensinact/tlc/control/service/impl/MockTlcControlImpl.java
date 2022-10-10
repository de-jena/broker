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
package de.jena.sensinact.tlc.control.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;

import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Control;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Tlc;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcHolder;
import de.jena.sensinact.tlc.control.service.api.TlcControl;

@Component(scope = ServiceScope.PROTOTYPE)
public class MockTlcControlImpl implements TlcControl{

	@Reference (scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private QueryRepository repo;
	
	@Reference
	TlcControlPackage tlcPackage;
	
	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#getTlcIds()
	 */
	@Override
	public List<String> getTlcIds() {
		IQuery query = repo.createQueryBuilder().allQuery().projectionPath(tlcPackage.getTlcHolder_Id()).build();
		List<String> result = repo.getEObjectsByQuery(tlcPackage.getTlcHolder(), query)
				.stream()
				.map(TlcHolder.class::cast)
				.map(TlcHolder::getId)
				.collect(Collectors.toList());
		return result;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#getTlc(java.lang.String)
	 */
	@Override
	public Optional<Tlc> getTlc(String tlcId) {
		TlcHolder holder = repo.getEObject(tlcPackage.getTlcHolder(), tlcId);
		if(holder == null) {
			return Optional.empty();
		}
		return Optional.of(EcoreUtil.copy(holder.getTlc()));
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#getModes(java.lang.String)
	 */
	@Override
	public List<Mode> getModes(String tlcId) {
		TlcHolder tlcholder = repo.getEObject(tlcPackage.getTlcHolder(), tlcId);
		return tlcholder.getModes().stream().map(EcoreUtil::copy).collect(Collectors.toList());
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#tlcExists(java.lang.String)
	 */
	@Override
	public boolean tlcExists(String tlcId) {
		return repo.getEObject(tlcPackage.getTlcHolder(), tlcId) != null;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#saveMode(java.lang.String, de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode)
	 */
	@Override
	public void saveMode(String tlcId, Mode mode) {
		TlcHolder holder = loadHolder(tlcId);
		boolean add = true;
		for (int i = 0; i < holder.getModes().size(); i++) {
			Mode curMode = holder.getModes().get(i);
			if(curMode.getId().equals(mode.getId())) {
				holder.getModes().set(i, mode);
				add = false;
			}
		}
		if(add) {
			holder.getModes().add(mode);
		}
		repo.save(holder);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#removeMode(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean removeMode(String tlcId, String modeId) {
		TlcHolder holder = loadHolder(tlcId);
		for (int i = 0; i < holder.getModes().size(); i++) {
			Mode curMode = holder.getModes().get(i);
			if(curMode.getId().equals(modeId)) {
				holder.getModes().remove(i);
				repo.save(holder);
				return true;
			}
		}
		return false;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#getControlMode(java.lang.String)
	 */
	@Override
	public Optional<Control> getControlMode(String tlcId) {
		TlcHolder holder = loadHolder(tlcId);
		return Optional.ofNullable(EcoreUtil.copy(holder.getCurrentControl()));
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#getMode(java.lang.String, java.lang.String)
	 */
	@Override
	public Optional<Mode> getMode(String tlcId, String modeId) {
		Objects.requireNonNull(tlcId, "tlcId is required");
		Objects.requireNonNull(modeId, "modeId must be set");
		
		TlcHolder holder = loadHolder(tlcId);
		for (int i = 0; i < holder.getModes().size(); i++) {
			Mode curMode = holder.getModes().get(i);
			if(curMode.getId().equals(modeId)) {
				return Optional.of(EcoreUtil.copy(curMode));
			}
		}
		return Optional.empty();
	}

	/**
	 * @param tlcId
	 * @return
	 */
	private TlcHolder loadHolder(String tlcId) {
		TlcHolder holder = repo.getEObject(tlcPackage.getTlcHolder(), tlcId);
		if(holder == null) {
			throw new RuntimeException("TLC with id " + tlcId + " does not exist");
		}
		return holder;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#setControlMode(java.lang.String, de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Control)
	 */
	@Override
	public void setControlMode(String tlcId, Control control) {
		Objects.requireNonNull(tlcId, "tlcId is required");
		Objects.requireNonNull(control, "Control must be set");
		TlcHolder holder = loadHolder(tlcId);
		holder.setCurrentControl(EcoreUtil.copy(control));
		repo.save(holder);
	}
}
