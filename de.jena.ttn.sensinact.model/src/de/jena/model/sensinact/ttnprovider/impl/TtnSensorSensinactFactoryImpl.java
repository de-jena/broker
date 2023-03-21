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
package de.jena.model.sensinact.ttnprovider.impl;

import de.jena.model.sensinact.ttnprovider.*;

import java.util.Map;

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
public class TtnSensorSensinactFactoryImpl extends EFactoryImpl implements TtnSensorSensinactFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TtnSensorSensinactFactory init() {
		try {
			TtnSensorSensinactFactory theTtnSensorSensinactFactory = (TtnSensorSensinactFactory)EPackage.Registry.INSTANCE.getEFactory(TtnSensorSensinactPackage.eNS_URI);
			if (theTtnSensorSensinactFactory != null) {
				return theTtnSensorSensinactFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TtnSensorSensinactFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TtnSensorSensinactFactoryImpl() {
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
			case TtnSensorSensinactPackage.TTN_SENSOR: return createTtnSensor();
			case TtnSensorSensinactPackage.SENSOR_DATA: return createSensorData();
			case TtnSensorSensinactPackage.STRING_TO_OBJECT_MAP: return (EObject)createStringToObjectMap();
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
	public TtnSensor createTtnSensor() {
		TtnSensorImpl ttnSensor = new TtnSensorImpl();
		return ttnSensor;
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
	public Map.Entry<String, Object> createStringToObjectMap() {
		StringToObjectMapImpl stringToObjectMap = new StringToObjectMapImpl();
		return stringToObjectMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TtnSensorSensinactPackage getTtnSensorSensinactPackage() {
		return (TtnSensorSensinactPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TtnSensorSensinactPackage getPackage() {
		return TtnSensorSensinactPackage.eINSTANCE;
	}

} //TtnSensorSensinactFactoryImpl
