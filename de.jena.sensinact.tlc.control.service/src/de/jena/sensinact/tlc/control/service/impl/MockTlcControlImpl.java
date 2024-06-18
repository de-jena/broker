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

import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import de.jena.sensinact.rest.tlc.control.model.control.Control;
import de.jena.sensinact.rest.tlc.control.model.control.Phase;
import de.jena.sensinact.rest.tlc.control.model.control.Tlc;
import de.jena.sensinact.rest.tlc.control.model.control.TlcControlFactory;
import de.jena.sensinact.rest.tlc.control.model.control.TlcControlPackage;
import de.jena.sensinact.rest.tlc.control.model.control.TlcHolder;
import de.jena.sensinact.tlc.control.service.api.TlcControl;

@Component(reference = {
		@Reference(name = "TlcControlPackage", service = TlcControlPackage.class, cardinality = ReferenceCardinality.AT_LEAST_ONE)
})
public class MockTlcControlImpl implements TlcControl{

	private final ResourceSet resourceSet;
	
	private final TlcControlFactory factory;
	
	Map<String, TlcHolder> tlcs = new HashMap<>(); 

	/**
	 * Creates a new instance.
	 */
	@Activate
	public MockTlcControlImpl(@Reference ResourceSet resourceSet, @Reference TlcControlFactory factory, BundleContext context) {
		this.resourceSet = resourceSet;
		this.factory = factory;
		loadTlcHodlers(context);
	}
	
	/**
	 * @param context
	 */
	private void loadTlcHodlers(BundleContext context) {
		Enumeration<String> paths = context.getBundle().getEntryPaths("/data");
	    while (paths.hasMoreElements()) {
	    	URL url = context.getBundle().getEntry(paths.nextElement()); 
			Resource resource = resourceSet.getResource(URI.createURI(url.toString()), true);
			resource.getContents().stream()
				.map(TlcHolder.class::cast)
				.map(tlc -> {
					Control control = factory.createControl();
					control.setPhaseId("1");
					tlc.setCurrentControl(control);
					return tlc;
				})
				.forEach( tlc -> tlcs.put(tlc.getId(), tlc));
		}
		
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#getTlcIds()
	 */
	@Override
	public List<String> getTlcIds() {
		List<String> result =new ArrayList<>(tlcs.keySet()); 
		return result;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#getTlc(java.lang.String)
	 */
	@Override
	public Optional<Tlc> getTlc(String tlcId) {
		TlcHolder holder = tlcs.get(tlcId);
		if(holder == null) {
			return Optional.empty();
		}
		return Optional.of(EcoreUtil.copy(holder.getTlc()));
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#getPhases(java.lang.String)
	 */
	@Override
	public List<Phase> getPhases(String tlcId) {
		TlcHolder tlcholder = tlcs.get(tlcId);
		return tlcholder.getPhases().stream().map(EcoreUtil::copy).collect(Collectors.toList());
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#tlcExists(java.lang.String)
	 */
	@Override
	public boolean tlcExists(String tlcId) {
		return tlcs.containsKey(tlcId);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#savePhase(java.lang.String, de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Phase)
	 */
	@Override
	public void savePhase(String tlcId, Phase mode) {
		TlcHolder holder = loadHolder(tlcId);
		boolean add = true;
		for (int i = 0; i < holder.getPhases().size(); i++) {
			Phase curPhase = holder.getPhases().get(i);
			if(curPhase.getId().equals(mode.getId())) {
				holder.getPhases().set(i, mode);
				add = false;
			}
		}
		if(add) {
			holder.getPhases().add(mode);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#removePhase(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean removePhase(String tlcId, String modeId) {
		TlcHolder holder = loadHolder(tlcId);
		for (int i = 0; i < holder.getPhases().size(); i++) {
			Phase curPhase = holder.getPhases().get(i);
			if(curPhase.getId().equals(modeId)) {
				holder.getPhases().remove(i);
				return true;
			}
		}
		return false;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#getControlPhase(java.lang.String)
	 */
	@Override
	public Optional<Control> getControlPhase(String tlcId) {
		TlcHolder holder = loadHolder(tlcId);
		return Optional.ofNullable(EcoreUtil.copy(holder.getCurrentControl()));
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#getPhase(java.lang.String, java.lang.String)
	 */
	@Override
	public Optional<Phase> getPhase(String tlcId, String modeId) {
		Objects.requireNonNull(tlcId, "tlcId is required");
		Objects.requireNonNull(modeId, "modeId must be set");
		
		TlcHolder holder = loadHolder(tlcId);
		for (int i = 0; i < holder.getPhases().size(); i++) {
			Phase curPhase = holder.getPhases().get(i);
			if(curPhase.getId().equals(modeId)) {
				return Optional.of(EcoreUtil.copy(curPhase));
			}
		}
		return Optional.empty();
	}

	/**
	 * @param tlcId
	 * @return
	 */
	private TlcHolder loadHolder(String tlcId) {
		TlcHolder holder = tlcs.get(tlcId);
		if(holder == null) {
			throw new RuntimeException("TLC with id " + tlcId + " does not exist");
		}
		return holder;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.sensinact.tlc.control.service.api.TlcControl#setControlPhase(java.lang.String, de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Control)
	 */
	@Override
	public void setControlPhase(String tlcId, Control control) {
		Objects.requireNonNull(tlcId, "tlcId is required");
		Objects.requireNonNull(control, "Control must be set");
		TlcHolder holder = loadHolder(tlcId);
		holder.setCurrentControl(EcoreUtil.copy(control));
	}
}
