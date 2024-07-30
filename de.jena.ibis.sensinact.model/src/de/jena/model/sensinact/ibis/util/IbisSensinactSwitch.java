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
package de.jena.model.sensinact.ibis.util;

import de.jena.model.sensinact.ibis.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.sensinact.model.core.provider.Admin;
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
 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage
 * @generated
 */
public class IbisSensinactSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IbisSensinactPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisSensinactSwitch() {
		if (modelPackage == null) {
			modelPackage = IbisSensinactPackage.eINSTANCE;
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
			case IbisSensinactPackage.IBIS_DEVICE: {
				IbisDevice ibisDevice = (IbisDevice)theEObject;
				T result = caseIbisDevice(ibisDevice);
				if (result == null) result = caseProvider(ibisDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA: {
				CustomerInfoAllData customerInfoAllData = (CustomerInfoAllData)theEObject;
				T result = caseCustomerInfoAllData(customerInfoAllData);
				if (result == null) result = caseService(customerInfoAllData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA: {
				CustomerInfoCurrentStopIndexData customerInfoCurrentStopIndexData = (CustomerInfoCurrentStopIndexData)theEObject;
				T result = caseCustomerInfoCurrentStopIndexData(customerInfoCurrentStopIndexData);
				if (result == null) result = caseService(customerInfoCurrentStopIndexData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA: {
				CustomerInfoCurrentStopPointData customerInfoCurrentStopPointData = (CustomerInfoCurrentStopPointData)theEObject;
				T result = caseCustomerInfoCurrentStopPointData(customerInfoCurrentStopPointData);
				if (result == null) result = caseService(customerInfoCurrentStopPointData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA: {
				CustomerInfoTripData customerInfoTripData = (CustomerInfoTripData)theEObject;
				T result = caseCustomerInfoTripData(customerInfoTripData);
				if (result == null) result = caseService(customerInfoTripData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.CUSTOMER_INFO_VEHICLE_DATA: {
				CustomerInfoVehicleData customerInfoVehicleData = (CustomerInfoVehicleData)theEObject;
				T result = caseCustomerInfoVehicleData(customerInfoVehicleData);
				if (result == null) result = caseService(customerInfoVehicleData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA: {
				CustomerInfoCurrentAnnouncementData customerInfoCurrentAnnouncementData = (CustomerInfoCurrentAnnouncementData)theEObject;
				T result = caseCustomerInfoCurrentAnnouncementData(customerInfoCurrentAnnouncementData);
				if (result == null) result = caseService(customerInfoCurrentAnnouncementData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_CONNECTION_DATA: {
				CustomerInfoCurrentConnectionData customerInfoCurrentConnectionData = (CustomerInfoCurrentConnectionData)theEObject;
				T result = caseCustomerInfoCurrentConnectionData(customerInfoCurrentConnectionData);
				if (result == null) result = caseService(customerInfoCurrentConnectionData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA: {
				CustomerInfoCurrentDisplayContentData customerInfoCurrentDisplayContentData = (CustomerInfoCurrentDisplayContentData)theEObject;
				T result = caseCustomerInfoCurrentDisplayContentData(customerInfoCurrentDisplayContentData);
				if (result == null) result = caseService(customerInfoCurrentDisplayContentData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.IBIS_ADMIN: {
				IbisAdmin ibisAdmin = (IbisAdmin)theEObject;
				T result = caseIbisAdmin(ibisAdmin);
				if (result == null) result = caseAdmin(ibisAdmin);
				if (result == null) result = caseService(ibisAdmin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE: {
				PassengerCountingDoorCountingState passengerCountingDoorCountingState = (PassengerCountingDoorCountingState)theEObject;
				T result = casePassengerCountingDoorCountingState(passengerCountingDoorCountingState);
				if (result == null) result = caseService(passengerCountingDoorCountingState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.DOOR_STATE: {
				DoorState doorState = (DoorState)theEObject;
				T result = caseDoorState(doorState);
				if (result == null) result = caseService(doorState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.STOP_REQUESTED: {
				StopRequested stopRequested = (StopRequested)theEObject;
				T result = caseStopRequested(stopRequested);
				if (result == null) result = caseService(stopRequested);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.GNSS_LOCATION_DATA: {
				GNSSLocationData gnssLocationData = (GNSSLocationData)theEObject;
				T result = caseGNSSLocationData(gnssLocationData);
				if (result == null) result = caseService(gnssLocationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA: {
				TicketValidationCurrentTariffStopData ticketValidationCurrentTariffStopData = (TicketValidationCurrentTariffStopData)theEObject;
				T result = caseTicketValidationCurrentTariffStopData(ticketValidationCurrentTariffStopData);
				if (result == null) result = caseService(ticketValidationCurrentTariffStopData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.TICKET_VALIDATION_RAZZIA_DATA: {
				TicketValidationRazziaData ticketValidationRazziaData = (TicketValidationRazziaData)theEObject;
				T result = caseTicketValidationRazziaData(ticketValidationRazziaData);
				if (result == null) result = caseService(ticketValidationRazziaData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA: {
				TicketValidationCurrentLineData ticketValidationCurrentLineData = (TicketValidationCurrentLineData)theEObject;
				T result = caseTicketValidationCurrentLineData(ticketValidationCurrentLineData);
				if (result == null) result = caseService(ticketValidationCurrentLineData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA: {
				TicketValidationVehicleData ticketValidationVehicleData = (TicketValidationVehicleData)theEObject;
				T result = caseTicketValidationVehicleData(ticketValidationVehicleData);
				if (result == null) result = caseService(ticketValidationVehicleData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IbisSensinactPackage.TRIP_INFO: {
				TripInfo tripInfo = (TripInfo)theEObject;
				T result = caseTripInfo(tripInfo);
				if (result == null) result = caseService(tripInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ibis Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ibis Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIbisDevice(IbisDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Info All Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Info All Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInfoAllData(CustomerInfoAllData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Info Current Stop Index Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Info Current Stop Index Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInfoCurrentStopIndexData(CustomerInfoCurrentStopIndexData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Info Current Stop Point Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Info Current Stop Point Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInfoCurrentStopPointData(CustomerInfoCurrentStopPointData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Info Trip Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Info Trip Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInfoTripData(CustomerInfoTripData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Info Vehicle Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Info Vehicle Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInfoVehicleData(CustomerInfoVehicleData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Info Current Announcement Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Info Current Announcement Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInfoCurrentAnnouncementData(CustomerInfoCurrentAnnouncementData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Info Current Connection Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Info Current Connection Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInfoCurrentConnectionData(CustomerInfoCurrentConnectionData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Info Current Display Content Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Info Current Display Content Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerInfoCurrentDisplayContentData(CustomerInfoCurrentDisplayContentData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ibis Admin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ibis Admin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIbisAdmin(IbisAdmin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passenger Counting Door Counting State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passenger Counting Door Counting State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassengerCountingDoorCountingState(PassengerCountingDoorCountingState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorState(DoorState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Requested</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Requested</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopRequested(StopRequested object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GNSS Location Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GNSS Location Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGNSSLocationData(GNSSLocationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ticket Validation Current Tariff Stop Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ticket Validation Current Tariff Stop Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTicketValidationCurrentTariffStopData(TicketValidationCurrentTariffStopData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ticket Validation Razzia Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ticket Validation Razzia Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTicketValidationRazziaData(TicketValidationRazziaData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ticket Validation Current Line Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ticket Validation Current Line Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTicketValidationCurrentLineData(TicketValidationCurrentLineData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ticket Validation Vehicle Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ticket Validation Vehicle Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTicketValidationVehicleData(TicketValidationVehicleData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trip Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trip Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTripInfo(TripInfo object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Admin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmin(Admin object) {
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

} //IbisSensinactSwitch
