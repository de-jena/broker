/*
 * Copyright (c) 2022 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion - initial API and implementation 
 */
package traficam.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.gecko.emf.osgi.constants.EMFNamespaces;

import traficam.TrafiCamPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see traficam.util.TrafiCamResourceImpl
 * @generated
 */
public class TrafiCamResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafiCamResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new TrafiCamResourceImpl(uri);
		return result;
	}

	/**
	 * A method providing the Properties the services around this ResourceFactory should be registered with.
	 * @generated
	 */
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_CONFIGURATOR_NAME, TrafiCamPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "traficam");
		properties.put(EMFNamespaces.EMF_MODEL_VERSION, "1.0");
		return properties;
	}

} //TrafiCamResourceFactoryImpl
