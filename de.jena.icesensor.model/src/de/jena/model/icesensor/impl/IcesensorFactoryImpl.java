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
package de.jena.model.icesensor.impl;

import de.jena.model.icesensor.*;

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
public class IcesensorFactoryImpl extends EFactoryImpl implements IcesensorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IcesensorFactory init() {
		try {
			IcesensorFactory theIcesensorFactory = (IcesensorFactory)EPackage.Registry.INSTANCE.getEFactory(IcesensorPackage.eNS_URI);
			if (theIcesensorFactory != null) {
				return theIcesensorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IcesensorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IcesensorFactoryImpl() {
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
			case IcesensorPackage.ICE_SENSOR: return createIceSENSOR();
			case IcesensorPackage.DATA: return createData();
			case IcesensorPackage.COORDS: return createCoords();
			case IcesensorPackage.SENSOR_DATA: return createSensorData();
			case IcesensorPackage.SENSOR_MESSAGE: return createSensorMessage();
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
	public IceSENSOR createIceSENSOR() {
		IceSENSORImpl iceSENSOR = new IceSENSORImpl();
		return iceSENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coords createCoords() {
		CoordsImpl coords = new CoordsImpl();
		return coords;
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
	public SensorMessage createSensorMessage() {
		SensorMessageImpl sensorMessage = new SensorMessageImpl();
		return sensorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IcesensorPackage getIcesensorPackage() {
		return (IcesensorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IcesensorPackage getPackage() {
		return IcesensorPackage.eINSTANCE;
	}

} //IcesensorFactoryImpl
