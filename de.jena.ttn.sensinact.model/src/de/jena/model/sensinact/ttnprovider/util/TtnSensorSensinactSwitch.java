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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.sensinact.model.core.provider.Provider;
import org.eclipse.sensinact.model.core.provider.Service;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage
 * @generated
 */
public class TtnSensorSensinactSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TtnSensorSensinactPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TtnSensorSensinactSwitch() {
		if (modelPackage == null) {
			modelPackage = TtnSensorSensinactPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TtnSensorSensinactPackage.ABSTRACT_TTN_PROVIDER: {
				AbstractTtnProvider abstractTtnProvider = (AbstractTtnProvider)theEObject;
				T result = caseAbstractTtnProvider(abstractTtnProvider);
				if (result == null) result = caseProvider(abstractTtnProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TtnSensorSensinactPackage.TTN_SENSOR: {
				TtnSensor ttnSensor = (TtnSensor)theEObject;
				T result = caseTtnSensor(ttnSensor);
				if (result == null) result = caseProvider(ttnSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TtnSensorSensinactPackage.SENSOR_DATA: {
				SensorData sensorData = (SensorData)theEObject;
				T result = caseSensorData(sensorData);
				if (result == null) result = caseService(sensorData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TtnSensorSensinactPackage.TTN_SERVICE: {
				TtnService ttnService = (TtnService)theEObject;
				T result = caseTtnService(ttnService);
				if (result == null) result = caseService(ttnService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TtnSensorSensinactPackage.GATEWAY_DATA: {
				GatewayData gatewayData = (GatewayData)theEObject;
				T result = caseGatewayData(gatewayData);
				if (result == null) result = caseService(gatewayData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TtnSensorSensinactPackage.STRING_TO_OBJECT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Object> stringToObjectMap = (Map.Entry<String, Object>)theEObject;
				T result = caseStringToObjectMap(stringToObjectMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TtnSensorSensinactPackage.TTN_NOISE_SENSOR: {
				TtnNoiseSensor ttnNoiseSensor = (TtnNoiseSensor)theEObject;
				T result = caseTtnNoiseSensor(ttnNoiseSensor);
				if (result == null) result = caseAbstractTtnProvider(ttnNoiseSensor);
				if (result == null) result = caseProvider(ttnNoiseSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TtnSensorSensinactPackage.NOISE_DATA: {
				NoiseData noiseData = (NoiseData)theEObject;
				T result = caseNoiseData(noiseData);
				if (result == null) result = caseTtnService(noiseData);
				if (result == null) result = caseService(noiseData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TtnSensorSensinactPackage.TTN_TEMPERATURE_SENSOR: {
				TtnTemperatureSensor ttnTemperatureSensor = (TtnTemperatureSensor)theEObject;
				T result = caseTtnTemperatureSensor(ttnTemperatureSensor);
				if (result == null) result = caseAbstractTtnProvider(ttnTemperatureSensor);
				if (result == null) result = caseProvider(ttnTemperatureSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TtnSensorSensinactPackage.TEMPERATUR_DATA: {
				TemperaturData temperaturData = (TemperaturData)theEObject;
				T result = caseTemperaturData(temperaturData);
				if (result == null) result = caseTtnService(temperaturData);
				if (result == null) result = caseService(temperaturData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TtnSensorSensinactPackage.TTN_SOIL_MOISTURE_SENSOR: {
				TtnSoilMoistureSensor ttnSoilMoistureSensor = (TtnSoilMoistureSensor)theEObject;
				T result = caseTtnSoilMoistureSensor(ttnSoilMoistureSensor);
				if (result == null) result = caseAbstractTtnProvider(ttnSoilMoistureSensor);
				if (result == null) result = caseProvider(ttnSoilMoistureSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA: {
				SoilMoistureData soilMoistureData = (SoilMoistureData)theEObject;
				T result = caseSoilMoistureData(soilMoistureData);
				if (result == null) result = caseTtnService(soilMoistureData);
				if (result == null) result = caseService(soilMoistureData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Ttn Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Ttn Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTtnProvider(AbstractTtnProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ttn Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ttn Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTtnSensor(TtnSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorData(SensorData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ttn Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ttn Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTtnService(TtnService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGatewayData(GatewayData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Object Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Object Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToObjectMap(Map.Entry<String, Object> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ttn Noise Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ttn Noise Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTtnNoiseSensor(TtnNoiseSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Noise Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Noise Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoiseData(NoiseData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ttn Temperature Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ttn Temperature Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTtnTemperatureSensor(TtnTemperatureSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temperatur Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temperatur Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemperaturData(TemperaturData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ttn Soil Moisture Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ttn Soil Moisture Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTtnSoilMoistureSensor(TtnSoilMoistureSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soil Moisture Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soil Moisture Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoilMoistureData(SoilMoistureData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvider(Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TtnSensorSensinactSwitch
