/**
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
package de.jena.model.sensinact.iceprovider.impl;

import de.jena.model.sensinact.iceprovider.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IcesensoreSensinactFactoryImpl extends EFactoryImpl implements IcesensoreSensinactFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IcesensoreSensinactFactory init() {
		try {
			IcesensoreSensinactFactory theIcesensoreSensinactFactory = (IcesensoreSensinactFactory)EPackage.Registry.INSTANCE.getEFactory(IcesensoreSensinactPackage.eNS_URI);
			if (theIcesensoreSensinactFactory != null) {
				return theIcesensoreSensinactFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IcesensoreSensinactFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IcesensoreSensinactFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IcesensoreSensinactPackage.ICE_SENSOR: return createIceSensor();
			case IcesensoreSensinactPackage.SENSOR_DATA: return createSensorData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IceSensor createIceSensor() {
		IceSensorImpl iceSensor = new IceSensorImpl();
		return iceSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData createSensorData() {
		SensorDataImpl sensorData = new SensorDataImpl();
		return sensorData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IcesensoreSensinactPackage getIcesensoreSensinactPackage() {
		return (IcesensoreSensinactPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IcesensoreSensinactPackage getPackage() {
		return IcesensoreSensinactPackage.eINSTANCE;
	}

} //IcesensoreSensinactFactoryImpl
