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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sensinact.model.core.provider.Admin;
import org.eclipse.sensinact.model.core.provider.Provider;
import org.eclipse.sensinact.model.core.provider.Service;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage
 * @generated
 */
public class IbisSensinactAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IbisSensinactPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IbisSensinactAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IbisSensinactPackage.eINSTANCE;
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
	protected IbisSensinactSwitch<Adapter> modelSwitch =
		new IbisSensinactSwitch<Adapter>() {
			@Override
			public Adapter caseIbisDevice(IbisDevice object) {
				return createIbisDeviceAdapter();
			}
			@Override
			public Adapter caseCustomerInfoAllData(CustomerInfoAllData object) {
				return createCustomerInfoAllDataAdapter();
			}
			@Override
			public Adapter caseCustomerInfoCurrentStopIndexData(CustomerInfoCurrentStopIndexData object) {
				return createCustomerInfoCurrentStopIndexDataAdapter();
			}
			@Override
			public Adapter caseCustomerInfoCurrentStopPointData(CustomerInfoCurrentStopPointData object) {
				return createCustomerInfoCurrentStopPointDataAdapter();
			}
			@Override
			public Adapter caseCustomerInfoTripData(CustomerInfoTripData object) {
				return createCustomerInfoTripDataAdapter();
			}
			@Override
			public Adapter caseCustomerInfoVehicleData(CustomerInfoVehicleData object) {
				return createCustomerInfoVehicleDataAdapter();
			}
			@Override
			public Adapter caseCustomerInfoCurrentAnnouncementData(CustomerInfoCurrentAnnouncementData object) {
				return createCustomerInfoCurrentAnnouncementDataAdapter();
			}
			@Override
			public Adapter caseCustomerInfoCurrentConnectionData(CustomerInfoCurrentConnectionData object) {
				return createCustomerInfoCurrentConnectionDataAdapter();
			}
			@Override
			public Adapter caseCustomerInfoCurrentDisplayContentData(CustomerInfoCurrentDisplayContentData object) {
				return createCustomerInfoCurrentDisplayContentDataAdapter();
			}
			@Override
			public Adapter caseIbisAdmin(IbisAdmin object) {
				return createIbisAdminAdapter();
			}
			@Override
			public Adapter casePassengerCountingDoorCountingState(PassengerCountingDoorCountingState object) {
				return createPassengerCountingDoorCountingStateAdapter();
			}
			@Override
			public Adapter caseDoorState(DoorState object) {
				return createDoorStateAdapter();
			}
			@Override
			public Adapter caseStopRequested(StopRequested object) {
				return createStopRequestedAdapter();
			}
			@Override
			public Adapter caseGNSSLocationData(GNSSLocationData object) {
				return createGNSSLocationDataAdapter();
			}
			@Override
			public Adapter caseTicketValidationCurrentTariffStopData(TicketValidationCurrentTariffStopData object) {
				return createTicketValidationCurrentTariffStopDataAdapter();
			}
			@Override
			public Adapter caseTicketValidationRazziaData(TicketValidationRazziaData object) {
				return createTicketValidationRazziaDataAdapter();
			}
			@Override
			public Adapter caseTicketValidationCurrentLineData(TicketValidationCurrentLineData object) {
				return createTicketValidationCurrentLineDataAdapter();
			}
			@Override
			public Adapter caseTicketValidationVehicleData(TicketValidationVehicleData object) {
				return createTicketValidationVehicleDataAdapter();
			}
			@Override
			public Adapter caseTripInfo(TripInfo object) {
				return createTripInfoAdapter();
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
			public Adapter caseAdmin(Admin object) {
				return createAdminAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.IbisDevice <em>Ibis Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.IbisDevice
	 * @generated
	 */
	public Adapter createIbisDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData <em>Customer Info All Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.CustomerInfoAllData
	 * @generated
	 */
	public Adapter createCustomerInfoAllDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopIndexData <em>Customer Info Current Stop Index Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.CustomerInfoCurrentStopIndexData
	 * @generated
	 */
	public Adapter createCustomerInfoCurrentStopIndexDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData <em>Customer Info Current Stop Point Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData
	 * @generated
	 */
	public Adapter createCustomerInfoCurrentStopPointDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData <em>Customer Info Trip Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.CustomerInfoTripData
	 * @generated
	 */
	public Adapter createCustomerInfoTripDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.CustomerInfoVehicleData <em>Customer Info Vehicle Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.CustomerInfoVehicleData
	 * @generated
	 */
	public Adapter createCustomerInfoVehicleDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentAnnouncementData <em>Customer Info Current Announcement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.CustomerInfoCurrentAnnouncementData
	 * @generated
	 */
	public Adapter createCustomerInfoCurrentAnnouncementDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentConnectionData <em>Customer Info Current Connection Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.CustomerInfoCurrentConnectionData
	 * @generated
	 */
	public Adapter createCustomerInfoCurrentConnectionDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentDisplayContentData <em>Customer Info Current Display Content Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.CustomerInfoCurrentDisplayContentData
	 * @generated
	 */
	public Adapter createCustomerInfoCurrentDisplayContentDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.IbisAdmin <em>Ibis Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.IbisAdmin
	 * @generated
	 */
	public Adapter createIbisAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState <em>Passenger Counting Door Counting State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState
	 * @generated
	 */
	public Adapter createPassengerCountingDoorCountingStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.DoorState <em>Door State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.DoorState
	 * @generated
	 */
	public Adapter createDoorStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.StopRequested <em>Stop Requested</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.StopRequested
	 * @generated
	 */
	public Adapter createStopRequestedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.GNSSLocationData <em>GNSS Location Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.GNSSLocationData
	 * @generated
	 */
	public Adapter createGNSSLocationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.TicketValidationCurrentTariffStopData <em>Ticket Validation Current Tariff Stop Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.TicketValidationCurrentTariffStopData
	 * @generated
	 */
	public Adapter createTicketValidationCurrentTariffStopDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.TicketValidationRazziaData <em>Ticket Validation Razzia Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.TicketValidationRazziaData
	 * @generated
	 */
	public Adapter createTicketValidationRazziaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.TicketValidationCurrentLineData <em>Ticket Validation Current Line Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.TicketValidationCurrentLineData
	 * @generated
	 */
	public Adapter createTicketValidationCurrentLineDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData <em>Ticket Validation Vehicle Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.TicketValidationVehicleData
	 * @generated
	 */
	public Adapter createTicketValidationVehicleDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.sensinact.ibis.TripInfo <em>Trip Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.sensinact.ibis.TripInfo
	 * @generated
	 */
	public Adapter createTripInfoAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.model.core.provider.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sensinact.model.core.provider.Admin
	 * @generated
	 */
	public Adapter createAdminAdapter() {
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

} //IbisSensinactAdapterFactory
