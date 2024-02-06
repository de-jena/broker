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
package de.jena.model.sensinact.ttnprovider.util;

import de.jena.model.sensinact.ttnprovider.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sensinact.model.core.provider.Provider;
import org.eclipse.sensinact.model.core.provider.Service;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage
 * @generated
 */
public class TtnSensorSensinactAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TtnSensorSensinactPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TtnSensorSensinactAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TtnSensorSensinactPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TtnSensorSensinactSwitch<Adapter> modelSwitch =
		new TtnSensorSensinactSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractTtnProvider(AbstractTtnProvider object) {
				return createAbstractTtnProviderAdapter();
			}
			@Override
			public Adapter caseTtnSensor(TtnSensor object) {
				return createTtnSensorAdapter();
			}
			@Override
			public Adapter caseSensorData(SensorData object) {
				return createSensorDataAdapter();
			}
			@Override
			public Adapter caseTtnService(TtnService object) {
				return createTtnServiceAdapter();
			}
			@Override
			public Adapter caseGatewayData(GatewayData object) {
				return createGatewayDataAdapter();
			}
			@Override
			public Adapter caseStringToObjectMap(Map.Entry<String, Object> object) {
				return createStringToObjectMapAdapter();
			}
			@Override
			public Adapter caseTtnNoiseSensor(TtnNoiseSensor object) {
				return createTtnNoiseSensorAdapter();
			}
			@Override
			public Adapter caseNoiseData(NoiseData object) {
				return createNoiseDataAdapter();
			}
			@Override
			public Adapter caseTtnTemperatureSensor(TtnTemperatureSensor object) {
				return createTtnTemperatureSensorAdapter();
			}
			@Override
			public Adapter caseTemperaturData(TemperaturData object) {
				return createTemperaturDataAdapter();
			}
			@Override
			public Adapter caseTtnSoilMoistureSensor(TtnSoilMoistureSensor object) {
				return createTtnSoilMoistureSensorAdapter();
			}
			@Override
			public Adapter caseSoilMoistureData(SoilMoistureData object) {
				return createSoilMoistureDataAdapter();
			}
			@Override
			public Adapter caseProvider(Provider object) {
				return createProviderAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ttnprovider.AbstractTtnProvider <em>Abstract Ttn Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ttnprovider.AbstractTtnProvider
	 * @generated
	 */
	public Adapter createAbstractTtnProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ttnprovider.TtnSensor <em>Ttn Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensor
	 * @generated
	 */
	public Adapter createTtnSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ttnprovider.SensorData <em>Sensor Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ttnprovider.SensorData
	 * @generated
	 */
	public Adapter createSensorDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ttnprovider.TtnService <em>Ttn Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ttnprovider.TtnService
	 * @generated
	 */
	public Adapter createTtnServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ttnprovider.GatewayData <em>Gateway Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ttnprovider.GatewayData
	 * @generated
	 */
	public Adapter createGatewayDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToObjectMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ttnprovider.TtnNoiseSensor <em>Ttn Noise Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ttnprovider.TtnNoiseSensor
	 * @generated
	 */
	public Adapter createTtnNoiseSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ttnprovider.NoiseData <em>Noise Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ttnprovider.NoiseData
	 * @generated
	 */
	public Adapter createNoiseDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ttnprovider.TtnTemperatureSensor <em>Ttn Temperature Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ttnprovider.TtnTemperatureSensor
	 * @generated
	 */
	public Adapter createTtnTemperatureSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ttnprovider.TemperaturData <em>Temperatur Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ttnprovider.TemperaturData
	 * @generated
	 */
	public Adapter createTemperaturDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ttnprovider.TtnSoilMoistureSensor <em>Ttn Soil Moisture Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ttnprovider.TtnSoilMoistureSensor
	 * @generated
	 */
	public Adapter createTtnSoilMoistureSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData <em>Soil Moisture Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ttnprovider.SoilMoistureData
	 * @generated
	 */
	public Adapter createSoilMoistureDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.model.core.provider.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sensinact.model.core.provider.Provider
	 * @generated
	 */
	public Adapter createProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.model.core.provider.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sensinact.model.core.provider.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TtnSensorSensinactAdapterFactory
