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
package de.jena.model.sensinact.ibis.impl;

import de.jena.model.sensinact.ibis.CustomerInfoAllData;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentAnnouncementData;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentConnectionData;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentDisplayContentData;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentStopIndexData;
import de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData;
import de.jena.model.sensinact.ibis.CustomerInfoTripData;
import de.jena.model.sensinact.ibis.CustomerInfoVehicleData;
import de.jena.model.sensinact.ibis.DoorState;
import de.jena.model.sensinact.ibis.GNSSLocationData;
import de.jena.model.sensinact.ibis.IbisAdmin;
import de.jena.model.sensinact.ibis.IbisDevice;
import de.jena.model.sensinact.ibis.IbisSensinactFactory;
import de.jena.model.sensinact.ibis.IbisSensinactPackage;
import de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState;
import de.jena.model.sensinact.ibis.StopRequested;
import de.jena.model.sensinact.ibis.TicketValidationCurrentLineData;
import de.jena.model.sensinact.ibis.TicketValidationCurrentTariffStopData;
import de.jena.model.sensinact.ibis.TicketValidationRazziaData;
import de.jena.model.sensinact.ibis.TicketValidationVehicleData;
import de.jena.model.sensinact.ibis.TripInfo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sensinact.model.core.provider.ProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IbisSensinactPackageImpl extends EPackageImpl implements IbisSensinactPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInfoAllDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInfoCurrentStopIndexDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInfoCurrentStopPointDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInfoTripDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInfoVehicleDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInfoCurrentAnnouncementDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInfoCurrentConnectionDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerInfoCurrentDisplayContentDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ibisAdminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerCountingDoorCountingStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopRequestedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gnssLocationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ticketValidationCurrentTariffStopDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ticketValidationRazziaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ticketValidationCurrentLineDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ticketValidationVehicleDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripInfoEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IbisSensinactPackageImpl() {
		super(eNS_URI, IbisSensinactFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link IbisSensinactPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IbisSensinactPackage init() {
		if (isInited) return (IbisSensinactPackage)EPackage.Registry.INSTANCE.getEPackage(IbisSensinactPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIbisSensinactPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IbisSensinactPackageImpl theIbisSensinactPackage = registeredIbisSensinactPackage instanceof IbisSensinactPackageImpl ? (IbisSensinactPackageImpl)registeredIbisSensinactPackage : new IbisSensinactPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ProviderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIbisSensinactPackage.createPackageContents();

		// Initialize created meta-data
		theIbisSensinactPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIbisSensinactPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IbisSensinactPackage.eNS_URI, theIbisSensinactPackage);
		return theIbisSensinactPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIbisDevice() {
		return ibisDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_IbisAdmin() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_CustomerInfoAllData() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_CustomerInfoCurrentStopIndexData() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_CustomerInfoCurrentStopPointData() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_CustomerInfoTripData() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_CustomerInfoVehicleData() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_CustomerInfoCurrentAnnouncementData() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_CustomerInfoCurrentConnectionData() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_CustomerInfoCurrentDisplayContentData() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_Door1CountingState() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_Door2CountingState() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_Door3CountingState() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_Door4CountingState() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_Door1State() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_Door2State() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_Door3State() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_Door4State() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_StopRequested() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_GnssLocationData() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_CurrentTariffStopData() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_RazziaData() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_CurrentLineData() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_VehicleData() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIbisDevice_TripInfo() {
		return (EReference)ibisDeviceEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInfoAllData() {
		return customerInfoAllDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoAllData_ServiceName() {
		return (EAttribute)customerInfoAllDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoAllData_ServiceOperation() {
		return (EAttribute)customerInfoAllDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoAllData_Timestamp() {
		return (EAttribute)customerInfoAllDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoAllData_VehicleRef() {
		return (EAttribute)customerInfoAllDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoAllData_DefaultLanguage() {
		return (EAttribute)customerInfoAllDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoAllData_CurrentStopIndex() {
		return (EAttribute)customerInfoAllDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoAllData_RouteDeviation() {
		return (EAttribute)customerInfoAllDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoAllData_DoorState() {
		return (EAttribute)customerInfoAllDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoAllData_InPanic() {
		return (EAttribute)customerInfoAllDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoAllData_VehicleStopRequested() {
		return (EAttribute)customerInfoAllDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoAllData_ExitSide() {
		return (EAttribute)customerInfoAllDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoAllData_MovingDirectionForward() {
		return (EAttribute)customerInfoAllDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoAllData_VehicleMode() {
		return (EAttribute)customerInfoAllDataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoAllData_SpeakerActive() {
		return (EAttribute)customerInfoAllDataEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoAllData_StopInformationActive() {
		return (EAttribute)customerInfoAllDataEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoAllData_TripState() {
		return (EAttribute)customerInfoAllDataEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInfoCurrentStopIndexData() {
		return customerInfoCurrentStopIndexDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopIndexData_ServiceName() {
		return (EAttribute)customerInfoCurrentStopIndexDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopIndexData_ServiceOperation() {
		return (EAttribute)customerInfoCurrentStopIndexDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopIndexData_Timestamp() {
		return (EAttribute)customerInfoCurrentStopIndexDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopIndexData_CurrentStopIndex() {
		return (EAttribute)customerInfoCurrentStopIndexDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInfoCurrentStopPointData() {
		return customerInfoCurrentStopPointDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopPointData_ServiceName() {
		return (EAttribute)customerInfoCurrentStopPointDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopPointData_ServiceOperation() {
		return (EAttribute)customerInfoCurrentStopPointDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopPointData_Timestamp() {
		return (EAttribute)customerInfoCurrentStopPointDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopPointData_StopIndex() {
		return (EAttribute)customerInfoCurrentStopPointDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopPointData_StopRef() {
		return (EAttribute)customerInfoCurrentStopPointDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopPointData_StopName() {
		return (EAttribute)customerInfoCurrentStopPointDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopPointData_StopAlternativeName() {
		return (EAttribute)customerInfoCurrentStopPointDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopPointData_Platform() {
		return (EAttribute)customerInfoCurrentStopPointDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopPointData_ArrivalScheduled() {
		return (EAttribute)customerInfoCurrentStopPointDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopPointData_ArrivalExpected() {
		return (EAttribute)customerInfoCurrentStopPointDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopPointData_DepartureScheduled() {
		return (EAttribute)customerInfoCurrentStopPointDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopPointData_DepartureExpected() {
		return (EAttribute)customerInfoCurrentStopPointDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopPointData_RecordedArrivalTime() {
		return (EAttribute)customerInfoCurrentStopPointDataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopPointData_DistanceToNextStop() {
		return (EAttribute)customerInfoCurrentStopPointDataEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentStopPointData_FareZone() {
		return (EAttribute)customerInfoCurrentStopPointDataEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInfoTripData() {
		return customerInfoTripDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_ServiceName() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_ServiceOperation() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_Timestamp() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_VehicleRef() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_DefaultLanguage() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_CurrentStopIndex() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_TripRef() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_LocationState() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_TimetableDelay() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_RouteDirection() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_RunNumber() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_PatternNumber() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_PathDestinationNumber() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_AdditionalTextMsg() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_AdditionalTextMsg1() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_AdditionalTextMsg2() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_AdditionalTextMsg3() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_AdditionalTextMsg4() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_AdditionalTextMsg5() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_AdditionalTextMsg6() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_AdditionalTextMsg7() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_AdditionalTextMsg8() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoTripData_AdditionalTextMsg9() {
		return (EAttribute)customerInfoTripDataEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInfoVehicleData() {
		return customerInfoVehicleDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoVehicleData_ServiceName() {
		return (EAttribute)customerInfoVehicleDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoVehicleData_ServiceOperation() {
		return (EAttribute)customerInfoVehicleDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoVehicleData_Timestamp() {
		return (EAttribute)customerInfoVehicleDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoVehicleData_VehicleRef() {
		return (EAttribute)customerInfoVehicleDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoVehicleData_RouteDeviation() {
		return (EAttribute)customerInfoVehicleDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoVehicleData_DoorState() {
		return (EAttribute)customerInfoVehicleDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoVehicleData_InPanic() {
		return (EAttribute)customerInfoVehicleDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoVehicleData_VehicleStopRequested() {
		return (EAttribute)customerInfoVehicleDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoVehicleData_ExitSide() {
		return (EAttribute)customerInfoVehicleDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoVehicleData_MovingDirectionForward() {
		return (EAttribute)customerInfoVehicleDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoVehicleData_VehicleMode() {
		return (EAttribute)customerInfoVehicleDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoVehicleData_SpeakerActive() {
		return (EAttribute)customerInfoVehicleDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoVehicleData_StopInformationActive() {
		return (EAttribute)customerInfoVehicleDataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoVehicleData_TripState() {
		return (EAttribute)customerInfoVehicleDataEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInfoCurrentAnnouncementData() {
		return customerInfoCurrentAnnouncementDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentAnnouncementData_ServiceName() {
		return (EAttribute)customerInfoCurrentAnnouncementDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentAnnouncementData_ServiceOperation() {
		return (EAttribute)customerInfoCurrentAnnouncementDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentAnnouncementData_Timestamp() {
		return (EAttribute)customerInfoCurrentAnnouncementDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentAnnouncementData_AnnouncementRef() {
		return (EAttribute)customerInfoCurrentAnnouncementDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentAnnouncementData_AnnouncementText() {
		return (EAttribute)customerInfoCurrentAnnouncementDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentAnnouncementData_AnnouncementTTSText() {
		return (EAttribute)customerInfoCurrentAnnouncementDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInfoCurrentConnectionData() {
		return customerInfoCurrentConnectionDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentConnectionData_ServiceName() {
		return (EAttribute)customerInfoCurrentConnectionDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentConnectionData_ServiceOperation() {
		return (EAttribute)customerInfoCurrentConnectionDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentConnectionData_Timestamp() {
		return (EAttribute)customerInfoCurrentConnectionDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerInfoCurrentDisplayContentData() {
		return customerInfoCurrentDisplayContentDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentDisplayContentData_ServiceName() {
		return (EAttribute)customerInfoCurrentDisplayContentDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentDisplayContentData_ServiceOperation() {
		return (EAttribute)customerInfoCurrentDisplayContentDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerInfoCurrentDisplayContentData_Timestamp() {
		return (EAttribute)customerInfoCurrentDisplayContentDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIbisAdmin() {
		return ibisAdminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIbisAdmin_DeviceType() {
		return (EAttribute)ibisAdminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPassengerCountingDoorCountingState() {
		return passengerCountingDoorCountingStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPassengerCountingDoorCountingState_ServiceName() {
		return (EAttribute)passengerCountingDoorCountingStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPassengerCountingDoorCountingState_ServiceOperation() {
		return (EAttribute)passengerCountingDoorCountingStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPassengerCountingDoorCountingState_Timestamp() {
		return (EAttribute)passengerCountingDoorCountingStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPassengerCountingDoorCountingState_DoorId() {
		return (EAttribute)passengerCountingDoorCountingStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPassengerCountingDoorCountingState_ExitSide() {
		return (EAttribute)passengerCountingDoorCountingStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPassengerCountingDoorCountingState_DoorCountingType() {
		return (EAttribute)passengerCountingDoorCountingStateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPassengerCountingDoorCountingState_In() {
		return (EAttribute)passengerCountingDoorCountingStateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPassengerCountingDoorCountingState_Out() {
		return (EAttribute)passengerCountingDoorCountingStateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoorState() {
		return doorStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorState_ServiceName() {
		return (EAttribute)doorStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorState_ServiceOperation() {
		return (EAttribute)doorStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorState_Timestamp() {
		return (EAttribute)doorStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorState_DoorId() {
		return (EAttribute)doorStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorState_ExitSide() {
		return (EAttribute)doorStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoorState_DoorState() {
		return (EAttribute)doorStateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopRequested() {
		return stopRequestedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStopRequested_ServiceName() {
		return (EAttribute)stopRequestedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStopRequested_ServiceOperation() {
		return (EAttribute)stopRequestedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStopRequested_Timestamp() {
		return (EAttribute)stopRequestedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStopRequested_StopRequested() {
		return (EAttribute)stopRequestedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGNSSLocationData() {
		return gnssLocationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_ServiceName() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_ServiceOperation() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_Timestamp() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_Date() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_Time() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_LatitudeDegree() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_LongitudeDegree() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_LatitudeDirection() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_LongitudeDirection() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_Altitude() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_SpeedOverGround() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_SignalQuality() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_NumberOfSatellites() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_HorizontalDilutionOfPrecision() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_VerticalDilutionOfPrecision() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_TrackDegreeTrue() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_TrackDegreeMagnetic() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_GNSSType() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGNSSLocationData_GNSSCoordinateSystem() {
		return (EAttribute)gnssLocationDataEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTicketValidationCurrentTariffStopData() {
		return ticketValidationCurrentTariffStopDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentTariffStopData_ServiceName() {
		return (EAttribute)ticketValidationCurrentTariffStopDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentTariffStopData_ServiceOperation() {
		return (EAttribute)ticketValidationCurrentTariffStopDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentTariffStopData_Timestamp() {
		return (EAttribute)ticketValidationCurrentTariffStopDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentTariffStopData_StopIndex() {
		return (EAttribute)ticketValidationCurrentTariffStopDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentTariffStopData_StopRef() {
		return (EAttribute)ticketValidationCurrentTariffStopDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentTariffStopData_StopName() {
		return (EAttribute)ticketValidationCurrentTariffStopDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentTariffStopData_StopAlternativeName() {
		return (EAttribute)ticketValidationCurrentTariffStopDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentTariffStopData_Platform() {
		return (EAttribute)ticketValidationCurrentTariffStopDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentTariffStopData_ArrivalScheduled() {
		return (EAttribute)ticketValidationCurrentTariffStopDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentTariffStopData_ArrivalExpected() {
		return (EAttribute)ticketValidationCurrentTariffStopDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentTariffStopData_DepartureScheduled() {
		return (EAttribute)ticketValidationCurrentTariffStopDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentTariffStopData_DepartureExpected() {
		return (EAttribute)ticketValidationCurrentTariffStopDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentTariffStopData_RecordedArrivalTime() {
		return (EAttribute)ticketValidationCurrentTariffStopDataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentTariffStopData_DistanceToNextStop() {
		return (EAttribute)ticketValidationCurrentTariffStopDataEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentTariffStopData_FareZone() {
		return (EAttribute)ticketValidationCurrentTariffStopDataEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentTariffStopData_CurrentTripRef() {
		return (EAttribute)ticketValidationCurrentTariffStopDataEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTicketValidationRazziaData() {
		return ticketValidationRazziaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationRazziaData_ServiceName() {
		return (EAttribute)ticketValidationRazziaDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationRazziaData_ServiceOperation() {
		return (EAttribute)ticketValidationRazziaDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationRazziaData_Timestamp() {
		return (EAttribute)ticketValidationRazziaDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationRazziaData_RazziaState() {
		return (EAttribute)ticketValidationRazziaDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTicketValidationCurrentLineData() {
		return ticketValidationCurrentLineDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentLineData_ServiceName() {
		return (EAttribute)ticketValidationCurrentLineDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentLineData_ServiceOperation() {
		return (EAttribute)ticketValidationCurrentLineDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentLineData_Timestamp() {
		return (EAttribute)ticketValidationCurrentLineDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentLineData_LineRef() {
		return (EAttribute)ticketValidationCurrentLineDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentLineData_LineName() {
		return (EAttribute)ticketValidationCurrentLineDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentLineData_LineShortName() {
		return (EAttribute)ticketValidationCurrentLineDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentLineData_LineNumber() {
		return (EAttribute)ticketValidationCurrentLineDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationCurrentLineData_LineCode() {
		return (EAttribute)ticketValidationCurrentLineDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTicketValidationVehicleData() {
		return ticketValidationVehicleDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationVehicleData_ServiceName() {
		return (EAttribute)ticketValidationVehicleDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationVehicleData_ServiceOperation() {
		return (EAttribute)ticketValidationVehicleDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationVehicleData_Timestamp() {
		return (EAttribute)ticketValidationVehicleDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationVehicleData_VehicleRef() {
		return (EAttribute)ticketValidationVehicleDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationVehicleData_RouteDeviation() {
		return (EAttribute)ticketValidationVehicleDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationVehicleData_DoorState() {
		return (EAttribute)ticketValidationVehicleDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationVehicleData_MovingDirectionForward() {
		return (EAttribute)ticketValidationVehicleDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationVehicleData_VehicleMode() {
		return (EAttribute)ticketValidationVehicleDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTicketValidationVehicleData_DriverNumber() {
		return (EAttribute)ticketValidationVehicleDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTripInfo() {
		return tripInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTripInfo_DeviceType() {
		return (EAttribute)tripInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTripInfo_LineName() {
		return (EAttribute)tripInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTripInfo_LineNumber() {
		return (EAttribute)tripInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTripInfo_TripNumber() {
		return (EAttribute)tripInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTripInfo_DeviceNumber() {
		return (EAttribute)tripInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTripInfo_AtStop() {
		return (EAttribute)tripInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTripInfo_StopName() {
		return (EAttribute)tripInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisSensinactFactory getIbisSensinactFactory() {
		return (IbisSensinactFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ibisDeviceEClass = createEClass(IBIS_DEVICE);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__IBIS_ADMIN);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__CUSTOMER_INFO_ALL_DATA);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT_DATA);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__CUSTOMER_INFO_TRIP_DATA);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__CUSTOMER_INFO_VEHICLE_DATA);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION_DATA);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__DOOR1_COUNTING_STATE);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__DOOR2_COUNTING_STATE);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__DOOR3_COUNTING_STATE);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__DOOR4_COUNTING_STATE);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__DOOR1_STATE);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__DOOR2_STATE);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__DOOR3_STATE);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__DOOR4_STATE);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__STOP_REQUESTED);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__GNSS_LOCATION_DATA);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__CURRENT_TARIFF_STOP_DATA);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__RAZZIA_DATA);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__CURRENT_LINE_DATA);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__VEHICLE_DATA);
		createEReference(ibisDeviceEClass, IBIS_DEVICE__TRIP_INFO);

		customerInfoAllDataEClass = createEClass(CUSTOMER_INFO_ALL_DATA);
		createEAttribute(customerInfoAllDataEClass, CUSTOMER_INFO_ALL_DATA__SERVICE_NAME);
		createEAttribute(customerInfoAllDataEClass, CUSTOMER_INFO_ALL_DATA__SERVICE_OPERATION);
		createEAttribute(customerInfoAllDataEClass, CUSTOMER_INFO_ALL_DATA__TIMESTAMP);
		createEAttribute(customerInfoAllDataEClass, CUSTOMER_INFO_ALL_DATA__VEHICLE_REF);
		createEAttribute(customerInfoAllDataEClass, CUSTOMER_INFO_ALL_DATA__DEFAULT_LANGUAGE);
		createEAttribute(customerInfoAllDataEClass, CUSTOMER_INFO_ALL_DATA__CURRENT_STOP_INDEX);
		createEAttribute(customerInfoAllDataEClass, CUSTOMER_INFO_ALL_DATA__ROUTE_DEVIATION);
		createEAttribute(customerInfoAllDataEClass, CUSTOMER_INFO_ALL_DATA__DOOR_STATE);
		createEAttribute(customerInfoAllDataEClass, CUSTOMER_INFO_ALL_DATA__IN_PANIC);
		createEAttribute(customerInfoAllDataEClass, CUSTOMER_INFO_ALL_DATA__VEHICLE_STOP_REQUESTED);
		createEAttribute(customerInfoAllDataEClass, CUSTOMER_INFO_ALL_DATA__EXIT_SIDE);
		createEAttribute(customerInfoAllDataEClass, CUSTOMER_INFO_ALL_DATA__MOVING_DIRECTION_FORWARD);
		createEAttribute(customerInfoAllDataEClass, CUSTOMER_INFO_ALL_DATA__VEHICLE_MODE);
		createEAttribute(customerInfoAllDataEClass, CUSTOMER_INFO_ALL_DATA__SPEAKER_ACTIVE);
		createEAttribute(customerInfoAllDataEClass, CUSTOMER_INFO_ALL_DATA__STOP_INFORMATION_ACTIVE);
		createEAttribute(customerInfoAllDataEClass, CUSTOMER_INFO_ALL_DATA__TRIP_STATE);

		customerInfoCurrentStopIndexDataEClass = createEClass(CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA);
		createEAttribute(customerInfoCurrentStopIndexDataEClass, CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__SERVICE_NAME);
		createEAttribute(customerInfoCurrentStopIndexDataEClass, CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__SERVICE_OPERATION);
		createEAttribute(customerInfoCurrentStopIndexDataEClass, CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__TIMESTAMP);
		createEAttribute(customerInfoCurrentStopIndexDataEClass, CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX);

		customerInfoCurrentStopPointDataEClass = createEClass(CUSTOMER_INFO_CURRENT_STOP_POINT_DATA);
		createEAttribute(customerInfoCurrentStopPointDataEClass, CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__SERVICE_NAME);
		createEAttribute(customerInfoCurrentStopPointDataEClass, CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__SERVICE_OPERATION);
		createEAttribute(customerInfoCurrentStopPointDataEClass, CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__TIMESTAMP);
		createEAttribute(customerInfoCurrentStopPointDataEClass, CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_INDEX);
		createEAttribute(customerInfoCurrentStopPointDataEClass, CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_REF);
		createEAttribute(customerInfoCurrentStopPointDataEClass, CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_NAME);
		createEAttribute(customerInfoCurrentStopPointDataEClass, CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_ALTERNATIVE_NAME);
		createEAttribute(customerInfoCurrentStopPointDataEClass, CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__PLATFORM);
		createEAttribute(customerInfoCurrentStopPointDataEClass, CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__ARRIVAL_SCHEDULED);
		createEAttribute(customerInfoCurrentStopPointDataEClass, CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__ARRIVAL_EXPECTED);
		createEAttribute(customerInfoCurrentStopPointDataEClass, CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DEPARTURE_SCHEDULED);
		createEAttribute(customerInfoCurrentStopPointDataEClass, CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DEPARTURE_EXPECTED);
		createEAttribute(customerInfoCurrentStopPointDataEClass, CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__RECORDED_ARRIVAL_TIME);
		createEAttribute(customerInfoCurrentStopPointDataEClass, CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DISTANCE_TO_NEXT_STOP);
		createEAttribute(customerInfoCurrentStopPointDataEClass, CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__FARE_ZONE);

		customerInfoTripDataEClass = createEClass(CUSTOMER_INFO_TRIP_DATA);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__SERVICE_NAME);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__SERVICE_OPERATION);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__TIMESTAMP);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__VEHICLE_REF);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__DEFAULT_LANGUAGE);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__CURRENT_STOP_INDEX);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__TRIP_REF);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__LOCATION_STATE);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__TIMETABLE_DELAY);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__ROUTE_DIRECTION);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__RUN_NUMBER);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__PATTERN_NUMBER);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__PATH_DESTINATION_NUMBER);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG1);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG2);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG3);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG4);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG5);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG6);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG7);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG8);
		createEAttribute(customerInfoTripDataEClass, CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG9);

		customerInfoVehicleDataEClass = createEClass(CUSTOMER_INFO_VEHICLE_DATA);
		createEAttribute(customerInfoVehicleDataEClass, CUSTOMER_INFO_VEHICLE_DATA__SERVICE_NAME);
		createEAttribute(customerInfoVehicleDataEClass, CUSTOMER_INFO_VEHICLE_DATA__SERVICE_OPERATION);
		createEAttribute(customerInfoVehicleDataEClass, CUSTOMER_INFO_VEHICLE_DATA__TIMESTAMP);
		createEAttribute(customerInfoVehicleDataEClass, CUSTOMER_INFO_VEHICLE_DATA__VEHICLE_REF);
		createEAttribute(customerInfoVehicleDataEClass, CUSTOMER_INFO_VEHICLE_DATA__ROUTE_DEVIATION);
		createEAttribute(customerInfoVehicleDataEClass, CUSTOMER_INFO_VEHICLE_DATA__DOOR_STATE);
		createEAttribute(customerInfoVehicleDataEClass, CUSTOMER_INFO_VEHICLE_DATA__IN_PANIC);
		createEAttribute(customerInfoVehicleDataEClass, CUSTOMER_INFO_VEHICLE_DATA__VEHICLE_STOP_REQUESTED);
		createEAttribute(customerInfoVehicleDataEClass, CUSTOMER_INFO_VEHICLE_DATA__EXIT_SIDE);
		createEAttribute(customerInfoVehicleDataEClass, CUSTOMER_INFO_VEHICLE_DATA__MOVING_DIRECTION_FORWARD);
		createEAttribute(customerInfoVehicleDataEClass, CUSTOMER_INFO_VEHICLE_DATA__VEHICLE_MODE);
		createEAttribute(customerInfoVehicleDataEClass, CUSTOMER_INFO_VEHICLE_DATA__SPEAKER_ACTIVE);
		createEAttribute(customerInfoVehicleDataEClass, CUSTOMER_INFO_VEHICLE_DATA__STOP_INFORMATION_ACTIVE);
		createEAttribute(customerInfoVehicleDataEClass, CUSTOMER_INFO_VEHICLE_DATA__TRIP_STATE);

		customerInfoCurrentAnnouncementDataEClass = createEClass(CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA);
		createEAttribute(customerInfoCurrentAnnouncementDataEClass, CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__SERVICE_NAME);
		createEAttribute(customerInfoCurrentAnnouncementDataEClass, CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__SERVICE_OPERATION);
		createEAttribute(customerInfoCurrentAnnouncementDataEClass, CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__TIMESTAMP);
		createEAttribute(customerInfoCurrentAnnouncementDataEClass, CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_REF);
		createEAttribute(customerInfoCurrentAnnouncementDataEClass, CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_TEXT);
		createEAttribute(customerInfoCurrentAnnouncementDataEClass, CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_TTS_TEXT);

		customerInfoCurrentConnectionDataEClass = createEClass(CUSTOMER_INFO_CURRENT_CONNECTION_DATA);
		createEAttribute(customerInfoCurrentConnectionDataEClass, CUSTOMER_INFO_CURRENT_CONNECTION_DATA__SERVICE_NAME);
		createEAttribute(customerInfoCurrentConnectionDataEClass, CUSTOMER_INFO_CURRENT_CONNECTION_DATA__SERVICE_OPERATION);
		createEAttribute(customerInfoCurrentConnectionDataEClass, CUSTOMER_INFO_CURRENT_CONNECTION_DATA__TIMESTAMP);

		customerInfoCurrentDisplayContentDataEClass = createEClass(CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA);
		createEAttribute(customerInfoCurrentDisplayContentDataEClass, CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__SERVICE_NAME);
		createEAttribute(customerInfoCurrentDisplayContentDataEClass, CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__SERVICE_OPERATION);
		createEAttribute(customerInfoCurrentDisplayContentDataEClass, CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA__TIMESTAMP);

		ibisAdminEClass = createEClass(IBIS_ADMIN);
		createEAttribute(ibisAdminEClass, IBIS_ADMIN__DEVICE_TYPE);

		passengerCountingDoorCountingStateEClass = createEClass(PASSENGER_COUNTING_DOOR_COUNTING_STATE);
		createEAttribute(passengerCountingDoorCountingStateEClass, PASSENGER_COUNTING_DOOR_COUNTING_STATE__SERVICE_NAME);
		createEAttribute(passengerCountingDoorCountingStateEClass, PASSENGER_COUNTING_DOOR_COUNTING_STATE__SERVICE_OPERATION);
		createEAttribute(passengerCountingDoorCountingStateEClass, PASSENGER_COUNTING_DOOR_COUNTING_STATE__TIMESTAMP);
		createEAttribute(passengerCountingDoorCountingStateEClass, PASSENGER_COUNTING_DOOR_COUNTING_STATE__DOOR_ID);
		createEAttribute(passengerCountingDoorCountingStateEClass, PASSENGER_COUNTING_DOOR_COUNTING_STATE__EXIT_SIDE);
		createEAttribute(passengerCountingDoorCountingStateEClass, PASSENGER_COUNTING_DOOR_COUNTING_STATE__DOOR_COUNTING_TYPE);
		createEAttribute(passengerCountingDoorCountingStateEClass, PASSENGER_COUNTING_DOOR_COUNTING_STATE__IN);
		createEAttribute(passengerCountingDoorCountingStateEClass, PASSENGER_COUNTING_DOOR_COUNTING_STATE__OUT);

		doorStateEClass = createEClass(DOOR_STATE);
		createEAttribute(doorStateEClass, DOOR_STATE__SERVICE_NAME);
		createEAttribute(doorStateEClass, DOOR_STATE__SERVICE_OPERATION);
		createEAttribute(doorStateEClass, DOOR_STATE__TIMESTAMP);
		createEAttribute(doorStateEClass, DOOR_STATE__DOOR_ID);
		createEAttribute(doorStateEClass, DOOR_STATE__EXIT_SIDE);
		createEAttribute(doorStateEClass, DOOR_STATE__DOOR_STATE);

		stopRequestedEClass = createEClass(STOP_REQUESTED);
		createEAttribute(stopRequestedEClass, STOP_REQUESTED__SERVICE_NAME);
		createEAttribute(stopRequestedEClass, STOP_REQUESTED__SERVICE_OPERATION);
		createEAttribute(stopRequestedEClass, STOP_REQUESTED__TIMESTAMP);
		createEAttribute(stopRequestedEClass, STOP_REQUESTED__STOP_REQUESTED);

		gnssLocationDataEClass = createEClass(GNSS_LOCATION_DATA);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__SERVICE_NAME);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__SERVICE_OPERATION);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__TIMESTAMP);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__DATE);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__TIME);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__LATITUDE_DEGREE);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__LONGITUDE_DEGREE);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__LATITUDE_DIRECTION);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__LONGITUDE_DIRECTION);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__ALTITUDE);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__SPEED_OVER_GROUND);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__SIGNAL_QUALITY);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__NUMBER_OF_SATELLITES);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__HORIZONTAL_DILUTION_OF_PRECISION);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__VERTICAL_DILUTION_OF_PRECISION);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__TRACK_DEGREE_TRUE);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__TRACK_DEGREE_MAGNETIC);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__GNSS_TYPE);
		createEAttribute(gnssLocationDataEClass, GNSS_LOCATION_DATA__GNSS_COORDINATE_SYSTEM);

		ticketValidationCurrentTariffStopDataEClass = createEClass(TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA);
		createEAttribute(ticketValidationCurrentTariffStopDataEClass, TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA__SERVICE_NAME);
		createEAttribute(ticketValidationCurrentTariffStopDataEClass, TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA__SERVICE_OPERATION);
		createEAttribute(ticketValidationCurrentTariffStopDataEClass, TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA__TIMESTAMP);
		createEAttribute(ticketValidationCurrentTariffStopDataEClass, TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA__STOP_INDEX);
		createEAttribute(ticketValidationCurrentTariffStopDataEClass, TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA__STOP_REF);
		createEAttribute(ticketValidationCurrentTariffStopDataEClass, TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA__STOP_NAME);
		createEAttribute(ticketValidationCurrentTariffStopDataEClass, TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA__STOP_ALTERNATIVE_NAME);
		createEAttribute(ticketValidationCurrentTariffStopDataEClass, TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA__PLATFORM);
		createEAttribute(ticketValidationCurrentTariffStopDataEClass, TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA__ARRIVAL_SCHEDULED);
		createEAttribute(ticketValidationCurrentTariffStopDataEClass, TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA__ARRIVAL_EXPECTED);
		createEAttribute(ticketValidationCurrentTariffStopDataEClass, TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA__DEPARTURE_SCHEDULED);
		createEAttribute(ticketValidationCurrentTariffStopDataEClass, TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA__DEPARTURE_EXPECTED);
		createEAttribute(ticketValidationCurrentTariffStopDataEClass, TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA__RECORDED_ARRIVAL_TIME);
		createEAttribute(ticketValidationCurrentTariffStopDataEClass, TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA__DISTANCE_TO_NEXT_STOP);
		createEAttribute(ticketValidationCurrentTariffStopDataEClass, TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA__FARE_ZONE);
		createEAttribute(ticketValidationCurrentTariffStopDataEClass, TICKET_VALIDATION_CURRENT_TARIFF_STOP_DATA__CURRENT_TRIP_REF);

		ticketValidationRazziaDataEClass = createEClass(TICKET_VALIDATION_RAZZIA_DATA);
		createEAttribute(ticketValidationRazziaDataEClass, TICKET_VALIDATION_RAZZIA_DATA__SERVICE_NAME);
		createEAttribute(ticketValidationRazziaDataEClass, TICKET_VALIDATION_RAZZIA_DATA__SERVICE_OPERATION);
		createEAttribute(ticketValidationRazziaDataEClass, TICKET_VALIDATION_RAZZIA_DATA__TIMESTAMP);
		createEAttribute(ticketValidationRazziaDataEClass, TICKET_VALIDATION_RAZZIA_DATA__RAZZIA_STATE);

		ticketValidationCurrentLineDataEClass = createEClass(TICKET_VALIDATION_CURRENT_LINE_DATA);
		createEAttribute(ticketValidationCurrentLineDataEClass, TICKET_VALIDATION_CURRENT_LINE_DATA__SERVICE_NAME);
		createEAttribute(ticketValidationCurrentLineDataEClass, TICKET_VALIDATION_CURRENT_LINE_DATA__SERVICE_OPERATION);
		createEAttribute(ticketValidationCurrentLineDataEClass, TICKET_VALIDATION_CURRENT_LINE_DATA__TIMESTAMP);
		createEAttribute(ticketValidationCurrentLineDataEClass, TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_REF);
		createEAttribute(ticketValidationCurrentLineDataEClass, TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_NAME);
		createEAttribute(ticketValidationCurrentLineDataEClass, TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_SHORT_NAME);
		createEAttribute(ticketValidationCurrentLineDataEClass, TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_NUMBER);
		createEAttribute(ticketValidationCurrentLineDataEClass, TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_CODE);

		ticketValidationVehicleDataEClass = createEClass(TICKET_VALIDATION_VEHICLE_DATA);
		createEAttribute(ticketValidationVehicleDataEClass, TICKET_VALIDATION_VEHICLE_DATA__SERVICE_NAME);
		createEAttribute(ticketValidationVehicleDataEClass, TICKET_VALIDATION_VEHICLE_DATA__SERVICE_OPERATION);
		createEAttribute(ticketValidationVehicleDataEClass, TICKET_VALIDATION_VEHICLE_DATA__TIMESTAMP);
		createEAttribute(ticketValidationVehicleDataEClass, TICKET_VALIDATION_VEHICLE_DATA__VEHICLE_REF);
		createEAttribute(ticketValidationVehicleDataEClass, TICKET_VALIDATION_VEHICLE_DATA__ROUTE_DEVIATION);
		createEAttribute(ticketValidationVehicleDataEClass, TICKET_VALIDATION_VEHICLE_DATA__DOOR_STATE);
		createEAttribute(ticketValidationVehicleDataEClass, TICKET_VALIDATION_VEHICLE_DATA__MOVING_DIRECTION_FORWARD);
		createEAttribute(ticketValidationVehicleDataEClass, TICKET_VALIDATION_VEHICLE_DATA__VEHICLE_MODE);
		createEAttribute(ticketValidationVehicleDataEClass, TICKET_VALIDATION_VEHICLE_DATA__DRIVER_NUMBER);

		tripInfoEClass = createEClass(TRIP_INFO);
		createEAttribute(tripInfoEClass, TRIP_INFO__DEVICE_TYPE);
		createEAttribute(tripInfoEClass, TRIP_INFO__LINE_NAME);
		createEAttribute(tripInfoEClass, TRIP_INFO__LINE_NUMBER);
		createEAttribute(tripInfoEClass, TRIP_INFO__TRIP_NUMBER);
		createEAttribute(tripInfoEClass, TRIP_INFO__DEVICE_NUMBER);
		createEAttribute(tripInfoEClass, TRIP_INFO__AT_STOP);
		createEAttribute(tripInfoEClass, TRIP_INFO__STOP_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ProviderPackage theProviderPackage = (ProviderPackage)EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ibisDeviceEClass.getESuperTypes().add(theProviderPackage.getProvider());
		customerInfoAllDataEClass.getESuperTypes().add(theProviderPackage.getService());
		customerInfoCurrentStopIndexDataEClass.getESuperTypes().add(theProviderPackage.getService());
		customerInfoCurrentStopPointDataEClass.getESuperTypes().add(theProviderPackage.getService());
		customerInfoTripDataEClass.getESuperTypes().add(theProviderPackage.getService());
		customerInfoVehicleDataEClass.getESuperTypes().add(theProviderPackage.getService());
		customerInfoCurrentAnnouncementDataEClass.getESuperTypes().add(theProviderPackage.getService());
		customerInfoCurrentConnectionDataEClass.getESuperTypes().add(theProviderPackage.getService());
		customerInfoCurrentDisplayContentDataEClass.getESuperTypes().add(theProviderPackage.getService());
		ibisAdminEClass.getESuperTypes().add(theProviderPackage.getAdmin());
		passengerCountingDoorCountingStateEClass.getESuperTypes().add(theProviderPackage.getService());
		doorStateEClass.getESuperTypes().add(theProviderPackage.getService());
		stopRequestedEClass.getESuperTypes().add(theProviderPackage.getService());
		gnssLocationDataEClass.getESuperTypes().add(theProviderPackage.getService());
		ticketValidationCurrentTariffStopDataEClass.getESuperTypes().add(theProviderPackage.getService());
		ticketValidationRazziaDataEClass.getESuperTypes().add(theProviderPackage.getService());
		ticketValidationCurrentLineDataEClass.getESuperTypes().add(theProviderPackage.getService());
		ticketValidationVehicleDataEClass.getESuperTypes().add(theProviderPackage.getService());
		tripInfoEClass.getESuperTypes().add(theProviderPackage.getService());

		// Initialize classes, features, and operations; add parameters
		initEClass(ibisDeviceEClass, IbisDevice.class, "IbisDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIbisDevice_IbisAdmin(), this.getIbisAdmin(), null, "ibisAdmin", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_CustomerInfoAllData(), this.getCustomerInfoAllData(), null, "customerInfoAllData", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_CustomerInfoCurrentStopIndexData(), this.getCustomerInfoCurrentStopIndexData(), null, "customerInfoCurrentStopIndexData", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_CustomerInfoCurrentStopPointData(), this.getCustomerInfoCurrentStopPointData(), null, "customerInfoCurrentStopPointData", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_CustomerInfoTripData(), this.getCustomerInfoTripData(), null, "customerInfoTripData", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_CustomerInfoVehicleData(), this.getCustomerInfoVehicleData(), null, "customerInfoVehicleData", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_CustomerInfoCurrentAnnouncementData(), this.getCustomerInfoCurrentAnnouncementData(), null, "customerInfoCurrentAnnouncementData", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_CustomerInfoCurrentConnectionData(), this.getCustomerInfoCurrentConnectionData(), null, "customerInfoCurrentConnectionData", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_CustomerInfoCurrentDisplayContentData(), this.getCustomerInfoCurrentDisplayContentData(), null, "customerInfoCurrentDisplayContentData", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_Door1CountingState(), this.getPassengerCountingDoorCountingState(), null, "door1CountingState", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_Door2CountingState(), this.getPassengerCountingDoorCountingState(), null, "door2CountingState", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_Door3CountingState(), this.getPassengerCountingDoorCountingState(), null, "door3CountingState", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_Door4CountingState(), this.getPassengerCountingDoorCountingState(), null, "door4CountingState", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_Door1State(), this.getDoorState(), null, "door1State", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_Door2State(), this.getDoorState(), null, "door2State", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_Door3State(), this.getDoorState(), null, "door3State", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_Door4State(), this.getDoorState(), null, "door4State", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_StopRequested(), this.getStopRequested(), null, "stopRequested", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_GnssLocationData(), this.getGNSSLocationData(), null, "gnssLocationData", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_CurrentTariffStopData(), this.getTicketValidationCurrentTariffStopData(), null, "currentTariffStopData", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_RazziaData(), this.getTicketValidationRazziaData(), null, "razziaData", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_CurrentLineData(), this.getTicketValidationCurrentLineData(), null, "currentLineData", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_VehicleData(), this.getTicketValidationVehicleData(), null, "vehicleData", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIbisDevice_TripInfo(), this.getTripInfo(), null, "tripInfo", null, 0, 1, IbisDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInfoAllDataEClass, CustomerInfoAllData.class, "CustomerInfoAllData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomerInfoAllData_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, CustomerInfoAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoAllData_ServiceOperation(), ecorePackage.getEString(), "serviceOperation", null, 1, 1, CustomerInfoAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoAllData_Timestamp(), theProviderPackage.getEInstant(), "timestamp", null, 1, 1, CustomerInfoAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoAllData_VehicleRef(), ecorePackage.getEString(), "vehicleRef", null, 1, 1, CustomerInfoAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoAllData_DefaultLanguage(), ecorePackage.getEString(), "defaultLanguage", null, 1, 1, CustomerInfoAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoAllData_CurrentStopIndex(), ecorePackage.getEInt(), "currentStopIndex", "-1", 1, 1, CustomerInfoAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoAllData_RouteDeviation(), ecorePackage.getEString(), "routeDeviation", null, 1, 1, CustomerInfoAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoAllData_DoorState(), ecorePackage.getEString(), "doorState", null, 0, 1, CustomerInfoAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoAllData_InPanic(), ecorePackage.getEBoolean(), "inPanic", null, 0, 1, CustomerInfoAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoAllData_VehicleStopRequested(), ecorePackage.getEBoolean(), "vehicleStopRequested", null, 0, 1, CustomerInfoAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoAllData_ExitSide(), ecorePackage.getEString(), "exitSide", null, 0, 1, CustomerInfoAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoAllData_MovingDirectionForward(), ecorePackage.getEBoolean(), "movingDirectionForward", null, 0, 1, CustomerInfoAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoAllData_VehicleMode(), ecorePackage.getEString(), "vehicleMode", null, 0, 1, CustomerInfoAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoAllData_SpeakerActive(), ecorePackage.getEBoolean(), "speakerActive", null, 0, 1, CustomerInfoAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoAllData_StopInformationActive(), ecorePackage.getEBoolean(), "stopInformationActive", null, 0, 1, CustomerInfoAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoAllData_TripState(), ecorePackage.getEString(), "tripState", null, 0, 1, CustomerInfoAllData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInfoCurrentStopIndexDataEClass, CustomerInfoCurrentStopIndexData.class, "CustomerInfoCurrentStopIndexData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomerInfoCurrentStopIndexData_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, CustomerInfoCurrentStopIndexData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopIndexData_ServiceOperation(), ecorePackage.getEString(), "serviceOperation", null, 1, 1, CustomerInfoCurrentStopIndexData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopIndexData_Timestamp(), theProviderPackage.getEInstant(), "timestamp", null, 1, 1, CustomerInfoCurrentStopIndexData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopIndexData_CurrentStopIndex(), ecorePackage.getEInt(), "currentStopIndex", "-1", 1, 1, CustomerInfoCurrentStopIndexData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInfoCurrentStopPointDataEClass, CustomerInfoCurrentStopPointData.class, "CustomerInfoCurrentStopPointData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomerInfoCurrentStopPointData_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, CustomerInfoCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopPointData_ServiceOperation(), ecorePackage.getEString(), "serviceOperation", null, 1, 1, CustomerInfoCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopPointData_Timestamp(), theProviderPackage.getEInstant(), "timestamp", null, 1, 1, CustomerInfoCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopPointData_StopIndex(), ecorePackage.getEInt(), "stopIndex", "-1", 1, 1, CustomerInfoCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopPointData_StopRef(), ecorePackage.getEString(), "stopRef", null, 1, 1, CustomerInfoCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopPointData_StopName(), ecorePackage.getEString(), "stopName", null, 1, -1, CustomerInfoCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopPointData_StopAlternativeName(), ecorePackage.getEString(), "stopAlternativeName", null, 0, -1, CustomerInfoCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopPointData_Platform(), ecorePackage.getEString(), "platform", null, 0, 1, CustomerInfoCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopPointData_ArrivalScheduled(), theProviderPackage.getEInstant(), "arrivalScheduled", null, 0, 1, CustomerInfoCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopPointData_ArrivalExpected(), theProviderPackage.getEInstant(), "arrivalExpected", null, 0, 1, CustomerInfoCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopPointData_DepartureScheduled(), theProviderPackage.getEInstant(), "departureScheduled", null, 0, 1, CustomerInfoCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopPointData_DepartureExpected(), theProviderPackage.getEInstant(), "departureExpected", null, 0, 1, CustomerInfoCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopPointData_RecordedArrivalTime(), theProviderPackage.getEInstant(), "recordedArrivalTime", null, 0, 1, CustomerInfoCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopPointData_DistanceToNextStop(), ecorePackage.getEInt(), "distanceToNextStop", "-1", 0, 1, CustomerInfoCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentStopPointData_FareZone(), ecorePackage.getEString(), "fareZone", null, 0, -1, CustomerInfoCurrentStopPointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInfoTripDataEClass, CustomerInfoTripData.class, "CustomerInfoTripData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomerInfoTripData_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_ServiceOperation(), ecorePackage.getEString(), "serviceOperation", null, 1, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_Timestamp(), theProviderPackage.getEInstant(), "timestamp", null, 1, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_VehicleRef(), ecorePackage.getEString(), "vehicleRef", null, 1, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_DefaultLanguage(), ecorePackage.getEString(), "defaultLanguage", null, 1, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_CurrentStopIndex(), ecorePackage.getEInt(), "currentStopIndex", "-1", 1, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_TripRef(), ecorePackage.getEString(), "tripRef", null, 1, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_LocationState(), ecorePackage.getEString(), "locationState", null, 0, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_TimetableDelay(), ecorePackage.getEInt(), "timetableDelay", null, 0, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_RouteDirection(), ecorePackage.getEString(), "routeDirection", null, 0, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_RunNumber(), ecorePackage.getEInt(), "runNumber", "-1", 0, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_PatternNumber(), ecorePackage.getEInt(), "patternNumber", "-1", 0, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_PathDestinationNumber(), ecorePackage.getEInt(), "pathDestinationNumber", "-1", 0, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_AdditionalTextMsg(), ecorePackage.getEString(), "additionalTextMsg", "", 0, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_AdditionalTextMsg1(), ecorePackage.getEString(), "additionalTextMsg1", null, 0, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_AdditionalTextMsg2(), ecorePackage.getEString(), "additionalTextMsg2", null, 0, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_AdditionalTextMsg3(), ecorePackage.getEString(), "additionalTextMsg3", null, 0, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_AdditionalTextMsg4(), ecorePackage.getEString(), "additionalTextMsg4", null, 0, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_AdditionalTextMsg5(), ecorePackage.getEString(), "additionalTextMsg5", null, 0, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_AdditionalTextMsg6(), ecorePackage.getEString(), "additionalTextMsg6", null, 0, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_AdditionalTextMsg7(), ecorePackage.getEString(), "additionalTextMsg7", null, 0, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_AdditionalTextMsg8(), ecorePackage.getEString(), "additionalTextMsg8", null, 0, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoTripData_AdditionalTextMsg9(), ecorePackage.getEString(), "additionalTextMsg9", null, 0, 1, CustomerInfoTripData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInfoVehicleDataEClass, CustomerInfoVehicleData.class, "CustomerInfoVehicleData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomerInfoVehicleData_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, CustomerInfoVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoVehicleData_ServiceOperation(), ecorePackage.getEString(), "serviceOperation", null, 1, 1, CustomerInfoVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoVehicleData_Timestamp(), theProviderPackage.getEInstant(), "timestamp", null, 1, 1, CustomerInfoVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoVehicleData_VehicleRef(), ecorePackage.getEString(), "vehicleRef", null, 1, 1, CustomerInfoVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoVehicleData_RouteDeviation(), ecorePackage.getEString(), "routeDeviation", null, 1, 1, CustomerInfoVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoVehicleData_DoorState(), ecorePackage.getEString(), "doorState", null, 0, 1, CustomerInfoVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoVehicleData_InPanic(), ecorePackage.getEBoolean(), "inPanic", null, 0, 1, CustomerInfoVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoVehicleData_VehicleStopRequested(), ecorePackage.getEBoolean(), "vehicleStopRequested", null, 0, 1, CustomerInfoVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoVehicleData_ExitSide(), ecorePackage.getEString(), "exitSide", null, 0, 1, CustomerInfoVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoVehicleData_MovingDirectionForward(), ecorePackage.getEBoolean(), "movingDirectionForward", null, 0, 1, CustomerInfoVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoVehicleData_VehicleMode(), ecorePackage.getEString(), "vehicleMode", null, 0, 1, CustomerInfoVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoVehicleData_SpeakerActive(), ecorePackage.getEBoolean(), "speakerActive", null, 0, 1, CustomerInfoVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoVehicleData_StopInformationActive(), ecorePackage.getEBoolean(), "stopInformationActive", null, 0, 1, CustomerInfoVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoVehicleData_TripState(), ecorePackage.getEString(), "tripState", null, 0, 1, CustomerInfoVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInfoCurrentAnnouncementDataEClass, CustomerInfoCurrentAnnouncementData.class, "CustomerInfoCurrentAnnouncementData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomerInfoCurrentAnnouncementData_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, CustomerInfoCurrentAnnouncementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentAnnouncementData_ServiceOperation(), ecorePackage.getEString(), "serviceOperation", null, 1, 1, CustomerInfoCurrentAnnouncementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentAnnouncementData_Timestamp(), theProviderPackage.getEInstant(), "timestamp", null, 1, 1, CustomerInfoCurrentAnnouncementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentAnnouncementData_AnnouncementRef(), ecorePackage.getEString(), "announcementRef", null, 1, 1, CustomerInfoCurrentAnnouncementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentAnnouncementData_AnnouncementText(), ecorePackage.getEString(), "announcementText", null, 0, -1, CustomerInfoCurrentAnnouncementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentAnnouncementData_AnnouncementTTSText(), ecorePackage.getEString(), "announcementTTSText", null, 0, -1, CustomerInfoCurrentAnnouncementData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInfoCurrentConnectionDataEClass, CustomerInfoCurrentConnectionData.class, "CustomerInfoCurrentConnectionData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomerInfoCurrentConnectionData_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, CustomerInfoCurrentConnectionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentConnectionData_ServiceOperation(), ecorePackage.getEString(), "serviceOperation", null, 1, 1, CustomerInfoCurrentConnectionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentConnectionData_Timestamp(), theProviderPackage.getEInstant(), "timestamp", null, 1, 1, CustomerInfoCurrentConnectionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerInfoCurrentDisplayContentDataEClass, CustomerInfoCurrentDisplayContentData.class, "CustomerInfoCurrentDisplayContentData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomerInfoCurrentDisplayContentData_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, CustomerInfoCurrentDisplayContentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentDisplayContentData_ServiceOperation(), ecorePackage.getEString(), "serviceOperation", null, 1, 1, CustomerInfoCurrentDisplayContentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerInfoCurrentDisplayContentData_Timestamp(), theProviderPackage.getEInstant(), "timestamp", null, 1, 1, CustomerInfoCurrentDisplayContentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ibisAdminEClass, IbisAdmin.class, "IbisAdmin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIbisAdmin_DeviceType(), ecorePackage.getEString(), "deviceType", null, 1, 1, IbisAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passengerCountingDoorCountingStateEClass, PassengerCountingDoorCountingState.class, "PassengerCountingDoorCountingState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassengerCountingDoorCountingState_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, PassengerCountingDoorCountingState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerCountingDoorCountingState_ServiceOperation(), ecorePackage.getEString(), "serviceOperation", null, 1, 1, PassengerCountingDoorCountingState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerCountingDoorCountingState_Timestamp(), theProviderPackage.getEInstant(), "timestamp", null, 1, 1, PassengerCountingDoorCountingState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerCountingDoorCountingState_DoorId(), ecorePackage.getEString(), "doorId", null, 1, 1, PassengerCountingDoorCountingState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerCountingDoorCountingState_ExitSide(), ecorePackage.getEString(), "exitSide", null, 0, 1, PassengerCountingDoorCountingState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerCountingDoorCountingState_DoorCountingType(), ecorePackage.getEString(), "doorCountingType", null, 0, 1, PassengerCountingDoorCountingState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerCountingDoorCountingState_In(), ecorePackage.getEInt(), "in", null, 0, 1, PassengerCountingDoorCountingState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerCountingDoorCountingState_Out(), ecorePackage.getEInt(), "out", null, 0, 1, PassengerCountingDoorCountingState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorStateEClass, DoorState.class, "DoorState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoorState_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, DoorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoorState_ServiceOperation(), ecorePackage.getEString(), "serviceOperation", null, 1, 1, DoorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoorState_Timestamp(), theProviderPackage.getEInstant(), "timestamp", null, 1, 1, DoorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoorState_DoorId(), ecorePackage.getEString(), "doorId", null, 1, 1, DoorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoorState_ExitSide(), ecorePackage.getEString(), "exitSide", null, 0, 1, DoorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoorState_DoorState(), ecorePackage.getEString(), "doorState", null, 0, 1, DoorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopRequestedEClass, StopRequested.class, "StopRequested", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStopRequested_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, StopRequested.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopRequested_ServiceOperation(), ecorePackage.getEString(), "serviceOperation", null, 1, 1, StopRequested.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopRequested_Timestamp(), theProviderPackage.getEInstant(), "timestamp", null, 1, 1, StopRequested.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopRequested_StopRequested(), ecorePackage.getEBoolean(), "stopRequested", null, 0, 1, StopRequested.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gnssLocationDataEClass, GNSSLocationData.class, "GNSSLocationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGNSSLocationData_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_ServiceOperation(), ecorePackage.getEString(), "serviceOperation", null, 1, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_Timestamp(), theProviderPackage.getEInstant(), "timestamp", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_Date(), theProviderPackage.getEInstant(), "date", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_Time(), theProviderPackage.getEInstant(), "time", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_LatitudeDegree(), ecorePackage.getEDouble(), "latitudeDegree", null, 1, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_LongitudeDegree(), ecorePackage.getEDouble(), "longitudeDegree", null, 1, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_LatitudeDirection(), ecorePackage.getEString(), "latitudeDirection", null, 1, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_LongitudeDirection(), ecorePackage.getEString(), "longitudeDirection", null, 1, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_Altitude(), ecorePackage.getEDouble(), "altitude", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_SpeedOverGround(), ecorePackage.getEDouble(), "speedOverGround", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_SignalQuality(), ecorePackage.getEString(), "signalQuality", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_NumberOfSatellites(), ecorePackage.getEInt(), "numberOfSatellites", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_HorizontalDilutionOfPrecision(), ecorePackage.getEDouble(), "horizontalDilutionOfPrecision", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_VerticalDilutionOfPrecision(), ecorePackage.getEDouble(), "verticalDilutionOfPrecision", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_TrackDegreeTrue(), ecorePackage.getEDouble(), "trackDegreeTrue", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_TrackDegreeMagnetic(), ecorePackage.getEDouble(), "trackDegreeMagnetic", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_GNSSType(), ecorePackage.getEString(), "gNSSType", null, 1, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSSLocationData_GNSSCoordinateSystem(), ecorePackage.getEString(), "gNSSCoordinateSystem", null, 0, 1, GNSSLocationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ticketValidationCurrentTariffStopDataEClass, TicketValidationCurrentTariffStopData.class, "TicketValidationCurrentTariffStopData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTicketValidationCurrentTariffStopData_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, TicketValidationCurrentTariffStopData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentTariffStopData_ServiceOperation(), ecorePackage.getEString(), "serviceOperation", null, 1, 1, TicketValidationCurrentTariffStopData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentTariffStopData_Timestamp(), theProviderPackage.getEInstant(), "timestamp", null, 0, 1, TicketValidationCurrentTariffStopData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentTariffStopData_StopIndex(), ecorePackage.getEInt(), "stopIndex", "-1", 1, 1, TicketValidationCurrentTariffStopData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentTariffStopData_StopRef(), ecorePackage.getEString(), "stopRef", null, 1, 1, TicketValidationCurrentTariffStopData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentTariffStopData_StopName(), ecorePackage.getEString(), "stopName", null, 1, -1, TicketValidationCurrentTariffStopData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentTariffStopData_StopAlternativeName(), ecorePackage.getEString(), "stopAlternativeName", null, 0, -1, TicketValidationCurrentTariffStopData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentTariffStopData_Platform(), ecorePackage.getEString(), "platform", null, 0, 1, TicketValidationCurrentTariffStopData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentTariffStopData_ArrivalScheduled(), theProviderPackage.getEInstant(), "arrivalScheduled", null, 0, 1, TicketValidationCurrentTariffStopData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentTariffStopData_ArrivalExpected(), theProviderPackage.getEInstant(), "arrivalExpected", null, 0, 1, TicketValidationCurrentTariffStopData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentTariffStopData_DepartureScheduled(), theProviderPackage.getEInstant(), "departureScheduled", null, 0, 1, TicketValidationCurrentTariffStopData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentTariffStopData_DepartureExpected(), theProviderPackage.getEInstant(), "departureExpected", null, 0, 1, TicketValidationCurrentTariffStopData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentTariffStopData_RecordedArrivalTime(), theProviderPackage.getEInstant(), "recordedArrivalTime", null, 0, 1, TicketValidationCurrentTariffStopData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentTariffStopData_DistanceToNextStop(), ecorePackage.getEInt(), "distanceToNextStop", "-1", 0, 1, TicketValidationCurrentTariffStopData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentTariffStopData_FareZone(), ecorePackage.getEString(), "fareZone", null, 0, -1, TicketValidationCurrentTariffStopData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentTariffStopData_CurrentTripRef(), ecorePackage.getEString(), "currentTripRef", null, 0, 1, TicketValidationCurrentTariffStopData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ticketValidationRazziaDataEClass, TicketValidationRazziaData.class, "TicketValidationRazziaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTicketValidationRazziaData_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, TicketValidationRazziaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationRazziaData_ServiceOperation(), ecorePackage.getEString(), "serviceOperation", null, 1, 1, TicketValidationRazziaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationRazziaData_Timestamp(), theProviderPackage.getEInstant(), "timestamp", null, 0, 1, TicketValidationRazziaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationRazziaData_RazziaState(), ecorePackage.getEString(), "razziaState", null, 1, 1, TicketValidationRazziaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ticketValidationCurrentLineDataEClass, TicketValidationCurrentLineData.class, "TicketValidationCurrentLineData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTicketValidationCurrentLineData_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, TicketValidationCurrentLineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentLineData_ServiceOperation(), ecorePackage.getEString(), "serviceOperation", null, 1, 1, TicketValidationCurrentLineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentLineData_Timestamp(), theProviderPackage.getEInstant(), "timestamp", null, 0, 1, TicketValidationCurrentLineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentLineData_LineRef(), ecorePackage.getEString(), "lineRef", null, 1, 1, TicketValidationCurrentLineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentLineData_LineName(), ecorePackage.getEString(), "lineName", null, 0, -1, TicketValidationCurrentLineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentLineData_LineShortName(), ecorePackage.getEString(), "lineShortName", null, 0, -1, TicketValidationCurrentLineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentLineData_LineNumber(), ecorePackage.getEInt(), "lineNumber", "-1", 0, 1, TicketValidationCurrentLineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationCurrentLineData_LineCode(), ecorePackage.getEInt(), "lineCode", "-1", 0, 1, TicketValidationCurrentLineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ticketValidationVehicleDataEClass, TicketValidationVehicleData.class, "TicketValidationVehicleData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTicketValidationVehicleData_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, TicketValidationVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationVehicleData_ServiceOperation(), ecorePackage.getEString(), "serviceOperation", null, 1, 1, TicketValidationVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationVehicleData_Timestamp(), theProviderPackage.getEInstant(), "timestamp", null, 1, 1, TicketValidationVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationVehicleData_VehicleRef(), ecorePackage.getEString(), "vehicleRef", null, 1, 1, TicketValidationVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationVehicleData_RouteDeviation(), ecorePackage.getEString(), "routeDeviation", null, 0, 1, TicketValidationVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationVehicleData_DoorState(), ecorePackage.getEString(), "doorState", null, 0, 1, TicketValidationVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationVehicleData_MovingDirectionForward(), ecorePackage.getEBoolean(), "movingDirectionForward", null, 0, 1, TicketValidationVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationVehicleData_VehicleMode(), ecorePackage.getEString(), "vehicleMode", null, 0, 1, TicketValidationVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTicketValidationVehicleData_DriverNumber(), ecorePackage.getEString(), "driverNumber", null, 0, 1, TicketValidationVehicleData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tripInfoEClass, TripInfo.class, "TripInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTripInfo_DeviceType(), ecorePackage.getEString(), "deviceType", null, 1, 1, TripInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTripInfo_LineName(), ecorePackage.getEString(), "lineName", null, 0, 1, TripInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTripInfo_LineNumber(), ecorePackage.getEInt(), "lineNumber", null, 0, 1, TripInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTripInfo_TripNumber(), ecorePackage.getEInt(), "tripNumber", null, 0, 1, TripInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTripInfo_DeviceNumber(), ecorePackage.getEInt(), "deviceNumber", null, 0, 1, TripInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTripInfo_AtStop(), ecorePackage.getEBoolean(), "atStop", null, 0, 1, TripInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTripInfo_StopName(), ecorePackage.getEString(), "stopName", null, 0, 1, TripInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (ibisDeviceEClass,
		   source,
		   new String[] {
			   "documentation", "This represents the public transport device, meaning the bus, tram, or whatever."
		   });
		addAnnotation
		  (getCustomerInfoTripData_TimetableDelay(),
		   source,
		   new String[] {
			   "documentation", "Delay in seconds. Earlier times wrt schedule are represented by negative numbers."
		   });
	}

} //IbisSensinactPackageImpl
