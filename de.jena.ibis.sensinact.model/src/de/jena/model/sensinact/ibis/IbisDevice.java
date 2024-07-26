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
package de.jena.model.sensinact.ibis;

import org.eclipse.sensinact.model.core.provider.Provider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ibis Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This represents the public transport device, meaning the bus, tram, or whatever.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getIbisAdmin <em>Ibis Admin</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoAllData <em>Customer Info All Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentStopIndexData <em>Customer Info Current Stop Index Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentStopPointData <em>Customer Info Current Stop Point Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoTripData <em>Customer Info Trip Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoVehicleData <em>Customer Info Vehicle Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentAnnouncementData <em>Customer Info Current Announcement Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentConnectionData <em>Customer Info Current Connection Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentDisplayContentData <em>Customer Info Current Display Content Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor1CountingState <em>Door1 Counting State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor2CountingState <em>Door2 Counting State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor3CountingState <em>Door3 Counting State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor4CountingState <em>Door4 Counting State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor1State <em>Door1 State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor2State <em>Door2 State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor3State <em>Door3 State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor4State <em>Door4 State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getStopRequested <em>Stop Requested</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getGnssLocationData <em>Gnss Location Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCurrentTariffStopData <em>Current Tariff Stop Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getRazziaData <em>Razzia Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getCurrentLineData <em>Current Line Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getVehicleData <em>Vehicle Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.IbisDevice#getTripInfo <em>Trip Info</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice()
 * @model
 * @generated
 */
@ProviderType
public interface IbisDevice extends Provider {
	/**
	 * Returns the value of the '<em><b>Ibis Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ibis Admin</em>' containment reference.
	 * @see #setIbisAdmin(IbisAdmin)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_IbisAdmin()
	 * @model containment="true"
	 * @generated
	 */
	IbisAdmin getIbisAdmin();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getIbisAdmin <em>Ibis Admin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ibis Admin</em>' containment reference.
	 * @see #getIbisAdmin()
	 * @generated
	 */
	void setIbisAdmin(IbisAdmin value);

	/**
	 * Returns the value of the '<em><b>Customer Info All Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Info All Data</em>' containment reference.
	 * @see #setCustomerInfoAllData(CustomerInfoAllData)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CustomerInfoAllData()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoAllData getCustomerInfoAllData();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoAllData <em>Customer Info All Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Info All Data</em>' containment reference.
	 * @see #getCustomerInfoAllData()
	 * @generated
	 */
	void setCustomerInfoAllData(CustomerInfoAllData value);

	/**
	 * Returns the value of the '<em><b>Customer Info Current Stop Index Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Info Current Stop Index Data</em>' containment reference.
	 * @see #setCustomerInfoCurrentStopIndexData(CustomerInfoCurrentStopIndexData)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CustomerInfoCurrentStopIndexData()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoCurrentStopIndexData getCustomerInfoCurrentStopIndexData();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentStopIndexData <em>Customer Info Current Stop Index Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Info Current Stop Index Data</em>' containment reference.
	 * @see #getCustomerInfoCurrentStopIndexData()
	 * @generated
	 */
	void setCustomerInfoCurrentStopIndexData(CustomerInfoCurrentStopIndexData value);

	/**
	 * Returns the value of the '<em><b>Customer Info Current Stop Point Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Info Current Stop Point Data</em>' containment reference.
	 * @see #setCustomerInfoCurrentStopPointData(CustomerInfoCurrentStopPointData)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CustomerInfoCurrentStopPointData()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoCurrentStopPointData getCustomerInfoCurrentStopPointData();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentStopPointData <em>Customer Info Current Stop Point Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Info Current Stop Point Data</em>' containment reference.
	 * @see #getCustomerInfoCurrentStopPointData()
	 * @generated
	 */
	void setCustomerInfoCurrentStopPointData(CustomerInfoCurrentStopPointData value);

	/**
	 * Returns the value of the '<em><b>Customer Info Trip Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Info Trip Data</em>' containment reference.
	 * @see #setCustomerInfoTripData(CustomerInfoTripData)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CustomerInfoTripData()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoTripData getCustomerInfoTripData();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoTripData <em>Customer Info Trip Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Info Trip Data</em>' containment reference.
	 * @see #getCustomerInfoTripData()
	 * @generated
	 */
	void setCustomerInfoTripData(CustomerInfoTripData value);

	/**
	 * Returns the value of the '<em><b>Customer Info Vehicle Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Info Vehicle Data</em>' containment reference.
	 * @see #setCustomerInfoVehicleData(CustomerInfoVehicleData)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CustomerInfoVehicleData()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoVehicleData getCustomerInfoVehicleData();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoVehicleData <em>Customer Info Vehicle Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Info Vehicle Data</em>' containment reference.
	 * @see #getCustomerInfoVehicleData()
	 * @generated
	 */
	void setCustomerInfoVehicleData(CustomerInfoVehicleData value);

	/**
	 * Returns the value of the '<em><b>Customer Info Current Announcement Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Info Current Announcement Data</em>' containment reference.
	 * @see #setCustomerInfoCurrentAnnouncementData(CustomerInfoCurrentAnnouncementData)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CustomerInfoCurrentAnnouncementData()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoCurrentAnnouncementData getCustomerInfoCurrentAnnouncementData();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentAnnouncementData <em>Customer Info Current Announcement Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Info Current Announcement Data</em>' containment reference.
	 * @see #getCustomerInfoCurrentAnnouncementData()
	 * @generated
	 */
	void setCustomerInfoCurrentAnnouncementData(CustomerInfoCurrentAnnouncementData value);

	/**
	 * Returns the value of the '<em><b>Customer Info Current Connection Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Info Current Connection Data</em>' containment reference.
	 * @see #setCustomerInfoCurrentConnectionData(CustomerInfoCurrentConnectionData)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CustomerInfoCurrentConnectionData()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoCurrentConnectionData getCustomerInfoCurrentConnectionData();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentConnectionData <em>Customer Info Current Connection Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Info Current Connection Data</em>' containment reference.
	 * @see #getCustomerInfoCurrentConnectionData()
	 * @generated
	 */
	void setCustomerInfoCurrentConnectionData(CustomerInfoCurrentConnectionData value);

	/**
	 * Returns the value of the '<em><b>Customer Info Current Display Content Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Info Current Display Content Data</em>' containment reference.
	 * @see #setCustomerInfoCurrentDisplayContentData(CustomerInfoCurrentDisplayContentData)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CustomerInfoCurrentDisplayContentData()
	 * @model containment="true"
	 * @generated
	 */
	CustomerInfoCurrentDisplayContentData getCustomerInfoCurrentDisplayContentData();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCustomerInfoCurrentDisplayContentData <em>Customer Info Current Display Content Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Info Current Display Content Data</em>' containment reference.
	 * @see #getCustomerInfoCurrentDisplayContentData()
	 * @generated
	 */
	void setCustomerInfoCurrentDisplayContentData(CustomerInfoCurrentDisplayContentData value);

	/**
	 * Returns the value of the '<em><b>Door1 Counting State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door1 Counting State</em>' containment reference.
	 * @see #isSetDoor1CountingState()
	 * @see #unsetDoor1CountingState()
	 * @see #setDoor1CountingState(PassengerCountingDoorCountingState)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Door1CountingState()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	PassengerCountingDoorCountingState getDoor1CountingState();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor1CountingState <em>Door1 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door1 Counting State</em>' containment reference.
	 * @see #isSetDoor1CountingState()
	 * @see #unsetDoor1CountingState()
	 * @see #getDoor1CountingState()
	 * @generated
	 */
	void setDoor1CountingState(PassengerCountingDoorCountingState value);

	/**
	 * Unsets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor1CountingState <em>Door1 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDoor1CountingState()
	 * @see #getDoor1CountingState()
	 * @see #setDoor1CountingState(PassengerCountingDoorCountingState)
	 * @generated
	 */
	void unsetDoor1CountingState();

	/**
	 * Returns whether the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor1CountingState <em>Door1 Counting State</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Door1 Counting State</em>' containment reference is set.
	 * @see #unsetDoor1CountingState()
	 * @see #getDoor1CountingState()
	 * @see #setDoor1CountingState(PassengerCountingDoorCountingState)
	 * @generated
	 */
	boolean isSetDoor1CountingState();

	/**
	 * Returns the value of the '<em><b>Door2 Counting State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door2 Counting State</em>' containment reference.
	 * @see #isSetDoor2CountingState()
	 * @see #unsetDoor2CountingState()
	 * @see #setDoor2CountingState(PassengerCountingDoorCountingState)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Door2CountingState()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	PassengerCountingDoorCountingState getDoor2CountingState();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor2CountingState <em>Door2 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door2 Counting State</em>' containment reference.
	 * @see #isSetDoor2CountingState()
	 * @see #unsetDoor2CountingState()
	 * @see #getDoor2CountingState()
	 * @generated
	 */
	void setDoor2CountingState(PassengerCountingDoorCountingState value);

	/**
	 * Unsets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor2CountingState <em>Door2 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDoor2CountingState()
	 * @see #getDoor2CountingState()
	 * @see #setDoor2CountingState(PassengerCountingDoorCountingState)
	 * @generated
	 */
	void unsetDoor2CountingState();

	/**
	 * Returns whether the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor2CountingState <em>Door2 Counting State</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Door2 Counting State</em>' containment reference is set.
	 * @see #unsetDoor2CountingState()
	 * @see #getDoor2CountingState()
	 * @see #setDoor2CountingState(PassengerCountingDoorCountingState)
	 * @generated
	 */
	boolean isSetDoor2CountingState();

	/**
	 * Returns the value of the '<em><b>Door3 Counting State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door3 Counting State</em>' containment reference.
	 * @see #isSetDoor3CountingState()
	 * @see #unsetDoor3CountingState()
	 * @see #setDoor3CountingState(PassengerCountingDoorCountingState)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Door3CountingState()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	PassengerCountingDoorCountingState getDoor3CountingState();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor3CountingState <em>Door3 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door3 Counting State</em>' containment reference.
	 * @see #isSetDoor3CountingState()
	 * @see #unsetDoor3CountingState()
	 * @see #getDoor3CountingState()
	 * @generated
	 */
	void setDoor3CountingState(PassengerCountingDoorCountingState value);

	/**
	 * Unsets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor3CountingState <em>Door3 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDoor3CountingState()
	 * @see #getDoor3CountingState()
	 * @see #setDoor3CountingState(PassengerCountingDoorCountingState)
	 * @generated
	 */
	void unsetDoor3CountingState();

	/**
	 * Returns whether the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor3CountingState <em>Door3 Counting State</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Door3 Counting State</em>' containment reference is set.
	 * @see #unsetDoor3CountingState()
	 * @see #getDoor3CountingState()
	 * @see #setDoor3CountingState(PassengerCountingDoorCountingState)
	 * @generated
	 */
	boolean isSetDoor3CountingState();

	/**
	 * Returns the value of the '<em><b>Door4 Counting State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door4 Counting State</em>' containment reference.
	 * @see #isSetDoor4CountingState()
	 * @see #unsetDoor4CountingState()
	 * @see #setDoor4CountingState(PassengerCountingDoorCountingState)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Door4CountingState()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	PassengerCountingDoorCountingState getDoor4CountingState();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor4CountingState <em>Door4 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door4 Counting State</em>' containment reference.
	 * @see #isSetDoor4CountingState()
	 * @see #unsetDoor4CountingState()
	 * @see #getDoor4CountingState()
	 * @generated
	 */
	void setDoor4CountingState(PassengerCountingDoorCountingState value);

	/**
	 * Unsets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor4CountingState <em>Door4 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDoor4CountingState()
	 * @see #getDoor4CountingState()
	 * @see #setDoor4CountingState(PassengerCountingDoorCountingState)
	 * @generated
	 */
	void unsetDoor4CountingState();

	/**
	 * Returns whether the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor4CountingState <em>Door4 Counting State</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Door4 Counting State</em>' containment reference is set.
	 * @see #unsetDoor4CountingState()
	 * @see #getDoor4CountingState()
	 * @see #setDoor4CountingState(PassengerCountingDoorCountingState)
	 * @generated
	 */
	boolean isSetDoor4CountingState();

	/**
	 * Returns the value of the '<em><b>Door1 State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door1 State</em>' containment reference.
	 * @see #setDoor1State(DoorState)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Door1State()
	 * @model containment="true"
	 * @generated
	 */
	DoorState getDoor1State();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor1State <em>Door1 State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door1 State</em>' containment reference.
	 * @see #getDoor1State()
	 * @generated
	 */
	void setDoor1State(DoorState value);

	/**
	 * Returns the value of the '<em><b>Door2 State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door2 State</em>' containment reference.
	 * @see #setDoor2State(DoorState)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Door2State()
	 * @model containment="true"
	 * @generated
	 */
	DoorState getDoor2State();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor2State <em>Door2 State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door2 State</em>' containment reference.
	 * @see #getDoor2State()
	 * @generated
	 */
	void setDoor2State(DoorState value);

	/**
	 * Returns the value of the '<em><b>Door3 State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door3 State</em>' containment reference.
	 * @see #setDoor3State(DoorState)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Door3State()
	 * @model containment="true"
	 * @generated
	 */
	DoorState getDoor3State();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor3State <em>Door3 State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door3 State</em>' containment reference.
	 * @see #getDoor3State()
	 * @generated
	 */
	void setDoor3State(DoorState value);

	/**
	 * Returns the value of the '<em><b>Door4 State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door4 State</em>' containment reference.
	 * @see #setDoor4State(DoorState)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_Door4State()
	 * @model containment="true"
	 * @generated
	 */
	DoorState getDoor4State();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getDoor4State <em>Door4 State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door4 State</em>' containment reference.
	 * @see #getDoor4State()
	 * @generated
	 */
	void setDoor4State(DoorState value);

	/**
	 * Returns the value of the '<em><b>Stop Requested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Requested</em>' containment reference.
	 * @see #setStopRequested(StopRequested)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_StopRequested()
	 * @model containment="true"
	 * @generated
	 */
	StopRequested getStopRequested();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getStopRequested <em>Stop Requested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Requested</em>' containment reference.
	 * @see #getStopRequested()
	 * @generated
	 */
	void setStopRequested(StopRequested value);

	/**
	 * Returns the value of the '<em><b>Gnss Location Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gnss Location Data</em>' containment reference.
	 * @see #setGnssLocationData(GNSSLocationData)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_GnssLocationData()
	 * @model containment="true"
	 * @generated
	 */
	GNSSLocationData getGnssLocationData();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getGnssLocationData <em>Gnss Location Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gnss Location Data</em>' containment reference.
	 * @see #getGnssLocationData()
	 * @generated
	 */
	void setGnssLocationData(GNSSLocationData value);

	/**
	 * Returns the value of the '<em><b>Current Tariff Stop Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Tariff Stop Data</em>' containment reference.
	 * @see #setCurrentTariffStopData(TicketValidationCurrentTariffStopData)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CurrentTariffStopData()
	 * @model containment="true"
	 * @generated
	 */
	TicketValidationCurrentTariffStopData getCurrentTariffStopData();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCurrentTariffStopData <em>Current Tariff Stop Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Tariff Stop Data</em>' containment reference.
	 * @see #getCurrentTariffStopData()
	 * @generated
	 */
	void setCurrentTariffStopData(TicketValidationCurrentTariffStopData value);

	/**
	 * Returns the value of the '<em><b>Razzia Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Razzia Data</em>' containment reference.
	 * @see #setRazziaData(TicketValidationRazziaData)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_RazziaData()
	 * @model containment="true"
	 * @generated
	 */
	TicketValidationRazziaData getRazziaData();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getRazziaData <em>Razzia Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Razzia Data</em>' containment reference.
	 * @see #getRazziaData()
	 * @generated
	 */
	void setRazziaData(TicketValidationRazziaData value);

	/**
	 * Returns the value of the '<em><b>Current Line Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Line Data</em>' containment reference.
	 * @see #setCurrentLineData(TicketValidationCurrentLineData)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_CurrentLineData()
	 * @model containment="true"
	 * @generated
	 */
	TicketValidationCurrentLineData getCurrentLineData();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getCurrentLineData <em>Current Line Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Line Data</em>' containment reference.
	 * @see #getCurrentLineData()
	 * @generated
	 */
	void setCurrentLineData(TicketValidationCurrentLineData value);

	/**
	 * Returns the value of the '<em><b>Vehicle Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Data</em>' containment reference.
	 * @see #setVehicleData(TicketValidationVehicleData)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_VehicleData()
	 * @model containment="true"
	 * @generated
	 */
	TicketValidationVehicleData getVehicleData();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getVehicleData <em>Vehicle Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Data</em>' containment reference.
	 * @see #getVehicleData()
	 * @generated
	 */
	void setVehicleData(TicketValidationVehicleData value);

	/**
	 * Returns the value of the '<em><b>Trip Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip Info</em>' containment reference.
	 * @see #setTripInfo(TripInfo)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getIbisDevice_TripInfo()
	 * @model containment="true"
	 * @generated
	 */
	TripInfo getTripInfo();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.IbisDevice#getTripInfo <em>Trip Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Info</em>' containment reference.
	 * @see #getTripInfo()
	 * @generated
	 */
	void setTripInfo(TripInfo value);

} // IbisDevice
