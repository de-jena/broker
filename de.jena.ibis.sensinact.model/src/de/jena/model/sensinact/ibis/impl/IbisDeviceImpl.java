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
import de.jena.model.sensinact.ibis.IbisSensinactPackage;
import de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState;
import de.jena.model.sensinact.ibis.StopRequested;
import de.jena.model.sensinact.ibis.TicketValidationCurrentLineData;
import de.jena.model.sensinact.ibis.TicketValidationCurrentTariffStopData;
import de.jena.model.sensinact.ibis.TicketValidationRazziaData;
import de.jena.model.sensinact.ibis.TicketValidationVehicleData;
import de.jena.model.sensinact.ibis.TripInfo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ibis Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getIbisAdmin <em>Ibis Admin</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCustomerInfoAllData <em>Customer Info All Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCustomerInfoCurrentStopIndexData <em>Customer Info Current Stop Index Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCustomerInfoCurrentStopPointData <em>Customer Info Current Stop Point Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCustomerInfoTripData <em>Customer Info Trip Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCustomerInfoVehicleData <em>Customer Info Vehicle Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCustomerInfoCurrentAnnouncementData <em>Customer Info Current Announcement Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCustomerInfoCurrentConnectionData <em>Customer Info Current Connection Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCustomerInfoCurrentDisplayContentData <em>Customer Info Current Display Content Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getDoor1CountingState <em>Door1 Counting State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getDoor2CountingState <em>Door2 Counting State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getDoor3CountingState <em>Door3 Counting State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getDoor4CountingState <em>Door4 Counting State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getDoor1State <em>Door1 State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getDoor2State <em>Door2 State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getDoor3State <em>Door3 State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getDoor4State <em>Door4 State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getStopRequested <em>Stop Requested</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getGnssLocationData <em>Gnss Location Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCurrentTariffStopData <em>Current Tariff Stop Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getRazziaData <em>Razzia Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getCurrentLineData <em>Current Line Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getVehicleData <em>Vehicle Data</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.IbisDeviceImpl#getTripInfo <em>Trip Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IbisDeviceImpl extends ProviderImpl implements IbisDevice {
	/**
	 * The cached value of the '{@link #getIbisAdmin() <em>Ibis Admin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIbisAdmin()
	 * @generated
	 * @ordered
	 */
	protected IbisAdmin ibisAdmin;

	/**
	 * The cached value of the '{@link #getCustomerInfoAllData() <em>Customer Info All Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerInfoAllData()
	 * @generated
	 * @ordered
	 */
	protected CustomerInfoAllData customerInfoAllData;

	/**
	 * The cached value of the '{@link #getCustomerInfoCurrentStopIndexData() <em>Customer Info Current Stop Index Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerInfoCurrentStopIndexData()
	 * @generated
	 * @ordered
	 */
	protected CustomerInfoCurrentStopIndexData customerInfoCurrentStopIndexData;

	/**
	 * The cached value of the '{@link #getCustomerInfoCurrentStopPointData() <em>Customer Info Current Stop Point Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerInfoCurrentStopPointData()
	 * @generated
	 * @ordered
	 */
	protected CustomerInfoCurrentStopPointData customerInfoCurrentStopPointData;

	/**
	 * The cached value of the '{@link #getCustomerInfoTripData() <em>Customer Info Trip Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerInfoTripData()
	 * @generated
	 * @ordered
	 */
	protected CustomerInfoTripData customerInfoTripData;

	/**
	 * The cached value of the '{@link #getCustomerInfoVehicleData() <em>Customer Info Vehicle Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerInfoVehicleData()
	 * @generated
	 * @ordered
	 */
	protected CustomerInfoVehicleData customerInfoVehicleData;

	/**
	 * The cached value of the '{@link #getCustomerInfoCurrentAnnouncementData() <em>Customer Info Current Announcement Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerInfoCurrentAnnouncementData()
	 * @generated
	 * @ordered
	 */
	protected CustomerInfoCurrentAnnouncementData customerInfoCurrentAnnouncementData;

	/**
	 * The cached value of the '{@link #getCustomerInfoCurrentConnectionData() <em>Customer Info Current Connection Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerInfoCurrentConnectionData()
	 * @generated
	 * @ordered
	 */
	protected CustomerInfoCurrentConnectionData customerInfoCurrentConnectionData;

	/**
	 * The cached value of the '{@link #getCustomerInfoCurrentDisplayContentData() <em>Customer Info Current Display Content Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerInfoCurrentDisplayContentData()
	 * @generated
	 * @ordered
	 */
	protected CustomerInfoCurrentDisplayContentData customerInfoCurrentDisplayContentData;

	/**
	 * The cached value of the '{@link #getDoor1CountingState() <em>Door1 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor1CountingState()
	 * @generated
	 * @ordered
	 */
	protected PassengerCountingDoorCountingState door1CountingState;

	/**
	 * This is true if the Door1 Counting State containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean door1CountingStateESet;

	/**
	 * The cached value of the '{@link #getDoor2CountingState() <em>Door2 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor2CountingState()
	 * @generated
	 * @ordered
	 */
	protected PassengerCountingDoorCountingState door2CountingState;

	/**
	 * This is true if the Door2 Counting State containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean door2CountingStateESet;

	/**
	 * The cached value of the '{@link #getDoor3CountingState() <em>Door3 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor3CountingState()
	 * @generated
	 * @ordered
	 */
	protected PassengerCountingDoorCountingState door3CountingState;

	/**
	 * This is true if the Door3 Counting State containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean door3CountingStateESet;

	/**
	 * The cached value of the '{@link #getDoor4CountingState() <em>Door4 Counting State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor4CountingState()
	 * @generated
	 * @ordered
	 */
	protected PassengerCountingDoorCountingState door4CountingState;

	/**
	 * This is true if the Door4 Counting State containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean door4CountingStateESet;

	/**
	 * The cached value of the '{@link #getDoor1State() <em>Door1 State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor1State()
	 * @generated
	 * @ordered
	 */
	protected DoorState door1State;

	/**
	 * The cached value of the '{@link #getDoor2State() <em>Door2 State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor2State()
	 * @generated
	 * @ordered
	 */
	protected DoorState door2State;

	/**
	 * The cached value of the '{@link #getDoor3State() <em>Door3 State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor3State()
	 * @generated
	 * @ordered
	 */
	protected DoorState door3State;

	/**
	 * The cached value of the '{@link #getDoor4State() <em>Door4 State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor4State()
	 * @generated
	 * @ordered
	 */
	protected DoorState door4State;

	/**
	 * The cached value of the '{@link #getStopRequested() <em>Stop Requested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopRequested()
	 * @generated
	 * @ordered
	 */
	protected StopRequested stopRequested;

	/**
	 * The cached value of the '{@link #getGnssLocationData() <em>Gnss Location Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGnssLocationData()
	 * @generated
	 * @ordered
	 */
	protected GNSSLocationData gnssLocationData;

	/**
	 * The cached value of the '{@link #getCurrentTariffStopData() <em>Current Tariff Stop Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTariffStopData()
	 * @generated
	 * @ordered
	 */
	protected TicketValidationCurrentTariffStopData currentTariffStopData;

	/**
	 * The cached value of the '{@link #getRazziaData() <em>Razzia Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRazziaData()
	 * @generated
	 * @ordered
	 */
	protected TicketValidationRazziaData razziaData;

	/**
	 * The cached value of the '{@link #getCurrentLineData() <em>Current Line Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLineData()
	 * @generated
	 * @ordered
	 */
	protected TicketValidationCurrentLineData currentLineData;

	/**
	 * The cached value of the '{@link #getVehicleData() <em>Vehicle Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleData()
	 * @generated
	 * @ordered
	 */
	protected TicketValidationVehicleData vehicleData;

	/**
	 * The cached value of the '{@link #getTripInfo() <em>Trip Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripInfo()
	 * @generated
	 * @ordered
	 */
	protected TripInfo tripInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IbisDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisSensinactPackage.Literals.IBIS_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IbisAdmin getIbisAdmin() {
		return ibisAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIbisAdmin(IbisAdmin newIbisAdmin, NotificationChain msgs) {
		IbisAdmin oldIbisAdmin = ibisAdmin;
		ibisAdmin = newIbisAdmin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN, oldIbisAdmin, newIbisAdmin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIbisAdmin(IbisAdmin newIbisAdmin) {
		if (newIbisAdmin != ibisAdmin) {
			NotificationChain msgs = null;
			if (ibisAdmin != null)
				msgs = ((InternalEObject)ibisAdmin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN, null, msgs);
			if (newIbisAdmin != null)
				msgs = ((InternalEObject)newIbisAdmin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN, null, msgs);
			msgs = basicSetIbisAdmin(newIbisAdmin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN, newIbisAdmin, newIbisAdmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoAllData getCustomerInfoAllData() {
		return customerInfoAllData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerInfoAllData(CustomerInfoAllData newCustomerInfoAllData, NotificationChain msgs) {
		CustomerInfoAllData oldCustomerInfoAllData = customerInfoAllData;
		customerInfoAllData = newCustomerInfoAllData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL_DATA, oldCustomerInfoAllData, newCustomerInfoAllData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerInfoAllData(CustomerInfoAllData newCustomerInfoAllData) {
		if (newCustomerInfoAllData != customerInfoAllData) {
			NotificationChain msgs = null;
			if (customerInfoAllData != null)
				msgs = ((InternalEObject)customerInfoAllData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL_DATA, null, msgs);
			if (newCustomerInfoAllData != null)
				msgs = ((InternalEObject)newCustomerInfoAllData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL_DATA, null, msgs);
			msgs = basicSetCustomerInfoAllData(newCustomerInfoAllData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL_DATA, newCustomerInfoAllData, newCustomerInfoAllData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentStopIndexData getCustomerInfoCurrentStopIndexData() {
		return customerInfoCurrentStopIndexData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerInfoCurrentStopIndexData(CustomerInfoCurrentStopIndexData newCustomerInfoCurrentStopIndexData, NotificationChain msgs) {
		CustomerInfoCurrentStopIndexData oldCustomerInfoCurrentStopIndexData = customerInfoCurrentStopIndexData;
		customerInfoCurrentStopIndexData = newCustomerInfoCurrentStopIndexData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA, oldCustomerInfoCurrentStopIndexData, newCustomerInfoCurrentStopIndexData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerInfoCurrentStopIndexData(CustomerInfoCurrentStopIndexData newCustomerInfoCurrentStopIndexData) {
		if (newCustomerInfoCurrentStopIndexData != customerInfoCurrentStopIndexData) {
			NotificationChain msgs = null;
			if (customerInfoCurrentStopIndexData != null)
				msgs = ((InternalEObject)customerInfoCurrentStopIndexData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA, null, msgs);
			if (newCustomerInfoCurrentStopIndexData != null)
				msgs = ((InternalEObject)newCustomerInfoCurrentStopIndexData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA, null, msgs);
			msgs = basicSetCustomerInfoCurrentStopIndexData(newCustomerInfoCurrentStopIndexData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA, newCustomerInfoCurrentStopIndexData, newCustomerInfoCurrentStopIndexData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentStopPointData getCustomerInfoCurrentStopPointData() {
		return customerInfoCurrentStopPointData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerInfoCurrentStopPointData(CustomerInfoCurrentStopPointData newCustomerInfoCurrentStopPointData, NotificationChain msgs) {
		CustomerInfoCurrentStopPointData oldCustomerInfoCurrentStopPointData = customerInfoCurrentStopPointData;
		customerInfoCurrentStopPointData = newCustomerInfoCurrentStopPointData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT_DATA, oldCustomerInfoCurrentStopPointData, newCustomerInfoCurrentStopPointData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerInfoCurrentStopPointData(CustomerInfoCurrentStopPointData newCustomerInfoCurrentStopPointData) {
		if (newCustomerInfoCurrentStopPointData != customerInfoCurrentStopPointData) {
			NotificationChain msgs = null;
			if (customerInfoCurrentStopPointData != null)
				msgs = ((InternalEObject)customerInfoCurrentStopPointData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT_DATA, null, msgs);
			if (newCustomerInfoCurrentStopPointData != null)
				msgs = ((InternalEObject)newCustomerInfoCurrentStopPointData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT_DATA, null, msgs);
			msgs = basicSetCustomerInfoCurrentStopPointData(newCustomerInfoCurrentStopPointData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT_DATA, newCustomerInfoCurrentStopPointData, newCustomerInfoCurrentStopPointData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoTripData getCustomerInfoTripData() {
		return customerInfoTripData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerInfoTripData(CustomerInfoTripData newCustomerInfoTripData, NotificationChain msgs) {
		CustomerInfoTripData oldCustomerInfoTripData = customerInfoTripData;
		customerInfoTripData = newCustomerInfoTripData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP_DATA, oldCustomerInfoTripData, newCustomerInfoTripData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerInfoTripData(CustomerInfoTripData newCustomerInfoTripData) {
		if (newCustomerInfoTripData != customerInfoTripData) {
			NotificationChain msgs = null;
			if (customerInfoTripData != null)
				msgs = ((InternalEObject)customerInfoTripData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP_DATA, null, msgs);
			if (newCustomerInfoTripData != null)
				msgs = ((InternalEObject)newCustomerInfoTripData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP_DATA, null, msgs);
			msgs = basicSetCustomerInfoTripData(newCustomerInfoTripData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP_DATA, newCustomerInfoTripData, newCustomerInfoTripData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoVehicleData getCustomerInfoVehicleData() {
		return customerInfoVehicleData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerInfoVehicleData(CustomerInfoVehicleData newCustomerInfoVehicleData, NotificationChain msgs) {
		CustomerInfoVehicleData oldCustomerInfoVehicleData = customerInfoVehicleData;
		customerInfoVehicleData = newCustomerInfoVehicleData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE_DATA, oldCustomerInfoVehicleData, newCustomerInfoVehicleData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerInfoVehicleData(CustomerInfoVehicleData newCustomerInfoVehicleData) {
		if (newCustomerInfoVehicleData != customerInfoVehicleData) {
			NotificationChain msgs = null;
			if (customerInfoVehicleData != null)
				msgs = ((InternalEObject)customerInfoVehicleData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE_DATA, null, msgs);
			if (newCustomerInfoVehicleData != null)
				msgs = ((InternalEObject)newCustomerInfoVehicleData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE_DATA, null, msgs);
			msgs = basicSetCustomerInfoVehicleData(newCustomerInfoVehicleData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE_DATA, newCustomerInfoVehicleData, newCustomerInfoVehicleData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentAnnouncementData getCustomerInfoCurrentAnnouncementData() {
		return customerInfoCurrentAnnouncementData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerInfoCurrentAnnouncementData(CustomerInfoCurrentAnnouncementData newCustomerInfoCurrentAnnouncementData, NotificationChain msgs) {
		CustomerInfoCurrentAnnouncementData oldCustomerInfoCurrentAnnouncementData = customerInfoCurrentAnnouncementData;
		customerInfoCurrentAnnouncementData = newCustomerInfoCurrentAnnouncementData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA, oldCustomerInfoCurrentAnnouncementData, newCustomerInfoCurrentAnnouncementData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerInfoCurrentAnnouncementData(CustomerInfoCurrentAnnouncementData newCustomerInfoCurrentAnnouncementData) {
		if (newCustomerInfoCurrentAnnouncementData != customerInfoCurrentAnnouncementData) {
			NotificationChain msgs = null;
			if (customerInfoCurrentAnnouncementData != null)
				msgs = ((InternalEObject)customerInfoCurrentAnnouncementData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA, null, msgs);
			if (newCustomerInfoCurrentAnnouncementData != null)
				msgs = ((InternalEObject)newCustomerInfoCurrentAnnouncementData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA, null, msgs);
			msgs = basicSetCustomerInfoCurrentAnnouncementData(newCustomerInfoCurrentAnnouncementData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA, newCustomerInfoCurrentAnnouncementData, newCustomerInfoCurrentAnnouncementData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentConnectionData getCustomerInfoCurrentConnectionData() {
		return customerInfoCurrentConnectionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerInfoCurrentConnectionData(CustomerInfoCurrentConnectionData newCustomerInfoCurrentConnectionData, NotificationChain msgs) {
		CustomerInfoCurrentConnectionData oldCustomerInfoCurrentConnectionData = customerInfoCurrentConnectionData;
		customerInfoCurrentConnectionData = newCustomerInfoCurrentConnectionData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION_DATA, oldCustomerInfoCurrentConnectionData, newCustomerInfoCurrentConnectionData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerInfoCurrentConnectionData(CustomerInfoCurrentConnectionData newCustomerInfoCurrentConnectionData) {
		if (newCustomerInfoCurrentConnectionData != customerInfoCurrentConnectionData) {
			NotificationChain msgs = null;
			if (customerInfoCurrentConnectionData != null)
				msgs = ((InternalEObject)customerInfoCurrentConnectionData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION_DATA, null, msgs);
			if (newCustomerInfoCurrentConnectionData != null)
				msgs = ((InternalEObject)newCustomerInfoCurrentConnectionData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION_DATA, null, msgs);
			msgs = basicSetCustomerInfoCurrentConnectionData(newCustomerInfoCurrentConnectionData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION_DATA, newCustomerInfoCurrentConnectionData, newCustomerInfoCurrentConnectionData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerInfoCurrentDisplayContentData getCustomerInfoCurrentDisplayContentData() {
		return customerInfoCurrentDisplayContentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerInfoCurrentDisplayContentData(CustomerInfoCurrentDisplayContentData newCustomerInfoCurrentDisplayContentData, NotificationChain msgs) {
		CustomerInfoCurrentDisplayContentData oldCustomerInfoCurrentDisplayContentData = customerInfoCurrentDisplayContentData;
		customerInfoCurrentDisplayContentData = newCustomerInfoCurrentDisplayContentData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA, oldCustomerInfoCurrentDisplayContentData, newCustomerInfoCurrentDisplayContentData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerInfoCurrentDisplayContentData(CustomerInfoCurrentDisplayContentData newCustomerInfoCurrentDisplayContentData) {
		if (newCustomerInfoCurrentDisplayContentData != customerInfoCurrentDisplayContentData) {
			NotificationChain msgs = null;
			if (customerInfoCurrentDisplayContentData != null)
				msgs = ((InternalEObject)customerInfoCurrentDisplayContentData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA, null, msgs);
			if (newCustomerInfoCurrentDisplayContentData != null)
				msgs = ((InternalEObject)newCustomerInfoCurrentDisplayContentData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA, null, msgs);
			msgs = basicSetCustomerInfoCurrentDisplayContentData(newCustomerInfoCurrentDisplayContentData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA, newCustomerInfoCurrentDisplayContentData, newCustomerInfoCurrentDisplayContentData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassengerCountingDoorCountingState getDoor1CountingState() {
		return door1CountingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor1CountingState(PassengerCountingDoorCountingState newDoor1CountingState, NotificationChain msgs) {
		PassengerCountingDoorCountingState oldDoor1CountingState = door1CountingState;
		door1CountingState = newDoor1CountingState;
		boolean oldDoor1CountingStateESet = door1CountingStateESet;
		door1CountingStateESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE, oldDoor1CountingState, newDoor1CountingState, !oldDoor1CountingStateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor1CountingState(PassengerCountingDoorCountingState newDoor1CountingState) {
		if (newDoor1CountingState != door1CountingState) {
			NotificationChain msgs = null;
			if (door1CountingState != null)
				msgs = ((InternalEObject)door1CountingState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE, null, msgs);
			if (newDoor1CountingState != null)
				msgs = ((InternalEObject)newDoor1CountingState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE, null, msgs);
			msgs = basicSetDoor1CountingState(newDoor1CountingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDoor1CountingStateESet = door1CountingStateESet;
			door1CountingStateESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE, newDoor1CountingState, newDoor1CountingState, !oldDoor1CountingStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDoor1CountingState(NotificationChain msgs) {
		PassengerCountingDoorCountingState oldDoor1CountingState = door1CountingState;
		door1CountingState = null;
		boolean oldDoor1CountingStateESet = door1CountingStateESet;
		door1CountingStateESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE, oldDoor1CountingState, null, oldDoor1CountingStateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDoor1CountingState() {
		if (door1CountingState != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)door1CountingState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE, null, msgs);
			msgs = basicUnsetDoor1CountingState(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDoor1CountingStateESet = door1CountingStateESet;
			door1CountingStateESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE, null, null, oldDoor1CountingStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDoor1CountingState() {
		return door1CountingStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassengerCountingDoorCountingState getDoor2CountingState() {
		return door2CountingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor2CountingState(PassengerCountingDoorCountingState newDoor2CountingState, NotificationChain msgs) {
		PassengerCountingDoorCountingState oldDoor2CountingState = door2CountingState;
		door2CountingState = newDoor2CountingState;
		boolean oldDoor2CountingStateESet = door2CountingStateESet;
		door2CountingStateESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE, oldDoor2CountingState, newDoor2CountingState, !oldDoor2CountingStateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor2CountingState(PassengerCountingDoorCountingState newDoor2CountingState) {
		if (newDoor2CountingState != door2CountingState) {
			NotificationChain msgs = null;
			if (door2CountingState != null)
				msgs = ((InternalEObject)door2CountingState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE, null, msgs);
			if (newDoor2CountingState != null)
				msgs = ((InternalEObject)newDoor2CountingState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE, null, msgs);
			msgs = basicSetDoor2CountingState(newDoor2CountingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDoor2CountingStateESet = door2CountingStateESet;
			door2CountingStateESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE, newDoor2CountingState, newDoor2CountingState, !oldDoor2CountingStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDoor2CountingState(NotificationChain msgs) {
		PassengerCountingDoorCountingState oldDoor2CountingState = door2CountingState;
		door2CountingState = null;
		boolean oldDoor2CountingStateESet = door2CountingStateESet;
		door2CountingStateESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE, oldDoor2CountingState, null, oldDoor2CountingStateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDoor2CountingState() {
		if (door2CountingState != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)door2CountingState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE, null, msgs);
			msgs = basicUnsetDoor2CountingState(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDoor2CountingStateESet = door2CountingStateESet;
			door2CountingStateESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE, null, null, oldDoor2CountingStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDoor2CountingState() {
		return door2CountingStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassengerCountingDoorCountingState getDoor3CountingState() {
		return door3CountingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor3CountingState(PassengerCountingDoorCountingState newDoor3CountingState, NotificationChain msgs) {
		PassengerCountingDoorCountingState oldDoor3CountingState = door3CountingState;
		door3CountingState = newDoor3CountingState;
		boolean oldDoor3CountingStateESet = door3CountingStateESet;
		door3CountingStateESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE, oldDoor3CountingState, newDoor3CountingState, !oldDoor3CountingStateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor3CountingState(PassengerCountingDoorCountingState newDoor3CountingState) {
		if (newDoor3CountingState != door3CountingState) {
			NotificationChain msgs = null;
			if (door3CountingState != null)
				msgs = ((InternalEObject)door3CountingState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE, null, msgs);
			if (newDoor3CountingState != null)
				msgs = ((InternalEObject)newDoor3CountingState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE, null, msgs);
			msgs = basicSetDoor3CountingState(newDoor3CountingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDoor3CountingStateESet = door3CountingStateESet;
			door3CountingStateESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE, newDoor3CountingState, newDoor3CountingState, !oldDoor3CountingStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDoor3CountingState(NotificationChain msgs) {
		PassengerCountingDoorCountingState oldDoor3CountingState = door3CountingState;
		door3CountingState = null;
		boolean oldDoor3CountingStateESet = door3CountingStateESet;
		door3CountingStateESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE, oldDoor3CountingState, null, oldDoor3CountingStateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDoor3CountingState() {
		if (door3CountingState != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)door3CountingState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE, null, msgs);
			msgs = basicUnsetDoor3CountingState(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDoor3CountingStateESet = door3CountingStateESet;
			door3CountingStateESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE, null, null, oldDoor3CountingStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDoor3CountingState() {
		return door3CountingStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassengerCountingDoorCountingState getDoor4CountingState() {
		return door4CountingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor4CountingState(PassengerCountingDoorCountingState newDoor4CountingState, NotificationChain msgs) {
		PassengerCountingDoorCountingState oldDoor4CountingState = door4CountingState;
		door4CountingState = newDoor4CountingState;
		boolean oldDoor4CountingStateESet = door4CountingStateESet;
		door4CountingStateESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE, oldDoor4CountingState, newDoor4CountingState, !oldDoor4CountingStateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor4CountingState(PassengerCountingDoorCountingState newDoor4CountingState) {
		if (newDoor4CountingState != door4CountingState) {
			NotificationChain msgs = null;
			if (door4CountingState != null)
				msgs = ((InternalEObject)door4CountingState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE, null, msgs);
			if (newDoor4CountingState != null)
				msgs = ((InternalEObject)newDoor4CountingState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE, null, msgs);
			msgs = basicSetDoor4CountingState(newDoor4CountingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDoor4CountingStateESet = door4CountingStateESet;
			door4CountingStateESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE, newDoor4CountingState, newDoor4CountingState, !oldDoor4CountingStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDoor4CountingState(NotificationChain msgs) {
		PassengerCountingDoorCountingState oldDoor4CountingState = door4CountingState;
		door4CountingState = null;
		boolean oldDoor4CountingStateESet = door4CountingStateESet;
		door4CountingStateESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE, oldDoor4CountingState, null, oldDoor4CountingStateESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDoor4CountingState() {
		if (door4CountingState != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)door4CountingState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE, null, msgs);
			msgs = basicUnsetDoor4CountingState(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDoor4CountingStateESet = door4CountingStateESet;
			door4CountingStateESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE, null, null, oldDoor4CountingStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDoor4CountingState() {
		return door4CountingStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorState getDoor1State() {
		return door1State;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor1State(DoorState newDoor1State, NotificationChain msgs) {
		DoorState oldDoor1State = door1State;
		door1State = newDoor1State;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE, oldDoor1State, newDoor1State);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor1State(DoorState newDoor1State) {
		if (newDoor1State != door1State) {
			NotificationChain msgs = null;
			if (door1State != null)
				msgs = ((InternalEObject)door1State).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE, null, msgs);
			if (newDoor1State != null)
				msgs = ((InternalEObject)newDoor1State).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE, null, msgs);
			msgs = basicSetDoor1State(newDoor1State, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE, newDoor1State, newDoor1State));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorState getDoor2State() {
		return door2State;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor2State(DoorState newDoor2State, NotificationChain msgs) {
		DoorState oldDoor2State = door2State;
		door2State = newDoor2State;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE, oldDoor2State, newDoor2State);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor2State(DoorState newDoor2State) {
		if (newDoor2State != door2State) {
			NotificationChain msgs = null;
			if (door2State != null)
				msgs = ((InternalEObject)door2State).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE, null, msgs);
			if (newDoor2State != null)
				msgs = ((InternalEObject)newDoor2State).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE, null, msgs);
			msgs = basicSetDoor2State(newDoor2State, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE, newDoor2State, newDoor2State));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorState getDoor3State() {
		return door3State;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor3State(DoorState newDoor3State, NotificationChain msgs) {
		DoorState oldDoor3State = door3State;
		door3State = newDoor3State;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE, oldDoor3State, newDoor3State);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor3State(DoorState newDoor3State) {
		if (newDoor3State != door3State) {
			NotificationChain msgs = null;
			if (door3State != null)
				msgs = ((InternalEObject)door3State).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE, null, msgs);
			if (newDoor3State != null)
				msgs = ((InternalEObject)newDoor3State).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE, null, msgs);
			msgs = basicSetDoor3State(newDoor3State, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE, newDoor3State, newDoor3State));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorState getDoor4State() {
		return door4State;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor4State(DoorState newDoor4State, NotificationChain msgs) {
		DoorState oldDoor4State = door4State;
		door4State = newDoor4State;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE, oldDoor4State, newDoor4State);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor4State(DoorState newDoor4State) {
		if (newDoor4State != door4State) {
			NotificationChain msgs = null;
			if (door4State != null)
				msgs = ((InternalEObject)door4State).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE, null, msgs);
			if (newDoor4State != null)
				msgs = ((InternalEObject)newDoor4State).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE, null, msgs);
			msgs = basicSetDoor4State(newDoor4State, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE, newDoor4State, newDoor4State));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopRequested getStopRequested() {
		return stopRequested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopRequested(StopRequested newStopRequested, NotificationChain msgs) {
		StopRequested oldStopRequested = stopRequested;
		stopRequested = newStopRequested;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED, oldStopRequested, newStopRequested);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopRequested(StopRequested newStopRequested) {
		if (newStopRequested != stopRequested) {
			NotificationChain msgs = null;
			if (stopRequested != null)
				msgs = ((InternalEObject)stopRequested).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED, null, msgs);
			if (newStopRequested != null)
				msgs = ((InternalEObject)newStopRequested).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED, null, msgs);
			msgs = basicSetStopRequested(newStopRequested, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED, newStopRequested, newStopRequested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSLocationData getGnssLocationData() {
		return gnssLocationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGnssLocationData(GNSSLocationData newGnssLocationData, NotificationChain msgs) {
		GNSSLocationData oldGnssLocationData = gnssLocationData;
		gnssLocationData = newGnssLocationData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION_DATA, oldGnssLocationData, newGnssLocationData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGnssLocationData(GNSSLocationData newGnssLocationData) {
		if (newGnssLocationData != gnssLocationData) {
			NotificationChain msgs = null;
			if (gnssLocationData != null)
				msgs = ((InternalEObject)gnssLocationData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION_DATA, null, msgs);
			if (newGnssLocationData != null)
				msgs = ((InternalEObject)newGnssLocationData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION_DATA, null, msgs);
			msgs = basicSetGnssLocationData(newGnssLocationData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION_DATA, newGnssLocationData, newGnssLocationData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketValidationCurrentTariffStopData getCurrentTariffStopData() {
		return currentTariffStopData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentTariffStopData(TicketValidationCurrentTariffStopData newCurrentTariffStopData, NotificationChain msgs) {
		TicketValidationCurrentTariffStopData oldCurrentTariffStopData = currentTariffStopData;
		currentTariffStopData = newCurrentTariffStopData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP_DATA, oldCurrentTariffStopData, newCurrentTariffStopData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentTariffStopData(TicketValidationCurrentTariffStopData newCurrentTariffStopData) {
		if (newCurrentTariffStopData != currentTariffStopData) {
			NotificationChain msgs = null;
			if (currentTariffStopData != null)
				msgs = ((InternalEObject)currentTariffStopData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP_DATA, null, msgs);
			if (newCurrentTariffStopData != null)
				msgs = ((InternalEObject)newCurrentTariffStopData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP_DATA, null, msgs);
			msgs = basicSetCurrentTariffStopData(newCurrentTariffStopData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP_DATA, newCurrentTariffStopData, newCurrentTariffStopData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketValidationRazziaData getRazziaData() {
		return razziaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRazziaData(TicketValidationRazziaData newRazziaData, NotificationChain msgs) {
		TicketValidationRazziaData oldRazziaData = razziaData;
		razziaData = newRazziaData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__RAZZIA_DATA, oldRazziaData, newRazziaData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRazziaData(TicketValidationRazziaData newRazziaData) {
		if (newRazziaData != razziaData) {
			NotificationChain msgs = null;
			if (razziaData != null)
				msgs = ((InternalEObject)razziaData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__RAZZIA_DATA, null, msgs);
			if (newRazziaData != null)
				msgs = ((InternalEObject)newRazziaData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__RAZZIA_DATA, null, msgs);
			msgs = basicSetRazziaData(newRazziaData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__RAZZIA_DATA, newRazziaData, newRazziaData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketValidationCurrentLineData getCurrentLineData() {
		return currentLineData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentLineData(TicketValidationCurrentLineData newCurrentLineData, NotificationChain msgs) {
		TicketValidationCurrentLineData oldCurrentLineData = currentLineData;
		currentLineData = newCurrentLineData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE_DATA, oldCurrentLineData, newCurrentLineData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentLineData(TicketValidationCurrentLineData newCurrentLineData) {
		if (newCurrentLineData != currentLineData) {
			NotificationChain msgs = null;
			if (currentLineData != null)
				msgs = ((InternalEObject)currentLineData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE_DATA, null, msgs);
			if (newCurrentLineData != null)
				msgs = ((InternalEObject)newCurrentLineData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE_DATA, null, msgs);
			msgs = basicSetCurrentLineData(newCurrentLineData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE_DATA, newCurrentLineData, newCurrentLineData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketValidationVehicleData getVehicleData() {
		return vehicleData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicleData(TicketValidationVehicleData newVehicleData, NotificationChain msgs) {
		TicketValidationVehicleData oldVehicleData = vehicleData;
		vehicleData = newVehicleData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__VEHICLE_DATA, oldVehicleData, newVehicleData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVehicleData(TicketValidationVehicleData newVehicleData) {
		if (newVehicleData != vehicleData) {
			NotificationChain msgs = null;
			if (vehicleData != null)
				msgs = ((InternalEObject)vehicleData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__VEHICLE_DATA, null, msgs);
			if (newVehicleData != null)
				msgs = ((InternalEObject)newVehicleData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__VEHICLE_DATA, null, msgs);
			msgs = basicSetVehicleData(newVehicleData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__VEHICLE_DATA, newVehicleData, newVehicleData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TripInfo getTripInfo() {
		return tripInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTripInfo(TripInfo newTripInfo, NotificationChain msgs) {
		TripInfo oldTripInfo = tripInfo;
		tripInfo = newTripInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO, oldTripInfo, newTripInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTripInfo(TripInfo newTripInfo) {
		if (newTripInfo != tripInfo) {
			NotificationChain msgs = null;
			if (tripInfo != null)
				msgs = ((InternalEObject)tripInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO, null, msgs);
			if (newTripInfo != null)
				msgs = ((InternalEObject)newTripInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO, null, msgs);
			msgs = basicSetTripInfo(newTripInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO, newTripInfo, newTripInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN:
				return basicSetIbisAdmin(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL_DATA:
				return basicSetCustomerInfoAllData(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA:
				return basicSetCustomerInfoCurrentStopIndexData(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT_DATA:
				return basicSetCustomerInfoCurrentStopPointData(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP_DATA:
				return basicSetCustomerInfoTripData(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE_DATA:
				return basicSetCustomerInfoVehicleData(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA:
				return basicSetCustomerInfoCurrentAnnouncementData(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION_DATA:
				return basicSetCustomerInfoCurrentConnectionData(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA:
				return basicSetCustomerInfoCurrentDisplayContentData(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE:
				return basicUnsetDoor1CountingState(msgs);
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE:
				return basicUnsetDoor2CountingState(msgs);
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE:
				return basicUnsetDoor3CountingState(msgs);
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE:
				return basicUnsetDoor4CountingState(msgs);
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE:
				return basicSetDoor1State(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE:
				return basicSetDoor2State(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE:
				return basicSetDoor3State(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE:
				return basicSetDoor4State(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED:
				return basicSetStopRequested(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION_DATA:
				return basicSetGnssLocationData(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP_DATA:
				return basicSetCurrentTariffStopData(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__RAZZIA_DATA:
				return basicSetRazziaData(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE_DATA:
				return basicSetCurrentLineData(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__VEHICLE_DATA:
				return basicSetVehicleData(null, msgs);
			case IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO:
				return basicSetTripInfo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN:
				return getIbisAdmin();
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL_DATA:
				return getCustomerInfoAllData();
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA:
				return getCustomerInfoCurrentStopIndexData();
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT_DATA:
				return getCustomerInfoCurrentStopPointData();
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP_DATA:
				return getCustomerInfoTripData();
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE_DATA:
				return getCustomerInfoVehicleData();
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA:
				return getCustomerInfoCurrentAnnouncementData();
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION_DATA:
				return getCustomerInfoCurrentConnectionData();
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA:
				return getCustomerInfoCurrentDisplayContentData();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE:
				return getDoor1CountingState();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE:
				return getDoor2CountingState();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE:
				return getDoor3CountingState();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE:
				return getDoor4CountingState();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE:
				return getDoor1State();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE:
				return getDoor2State();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE:
				return getDoor3State();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE:
				return getDoor4State();
			case IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED:
				return getStopRequested();
			case IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION_DATA:
				return getGnssLocationData();
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP_DATA:
				return getCurrentTariffStopData();
			case IbisSensinactPackage.IBIS_DEVICE__RAZZIA_DATA:
				return getRazziaData();
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE_DATA:
				return getCurrentLineData();
			case IbisSensinactPackage.IBIS_DEVICE__VEHICLE_DATA:
				return getVehicleData();
			case IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO:
				return getTripInfo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN:
				setIbisAdmin((IbisAdmin)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL_DATA:
				setCustomerInfoAllData((CustomerInfoAllData)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA:
				setCustomerInfoCurrentStopIndexData((CustomerInfoCurrentStopIndexData)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT_DATA:
				setCustomerInfoCurrentStopPointData((CustomerInfoCurrentStopPointData)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP_DATA:
				setCustomerInfoTripData((CustomerInfoTripData)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE_DATA:
				setCustomerInfoVehicleData((CustomerInfoVehicleData)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA:
				setCustomerInfoCurrentAnnouncementData((CustomerInfoCurrentAnnouncementData)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION_DATA:
				setCustomerInfoCurrentConnectionData((CustomerInfoCurrentConnectionData)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA:
				setCustomerInfoCurrentDisplayContentData((CustomerInfoCurrentDisplayContentData)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE:
				setDoor1CountingState((PassengerCountingDoorCountingState)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE:
				setDoor2CountingState((PassengerCountingDoorCountingState)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE:
				setDoor3CountingState((PassengerCountingDoorCountingState)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE:
				setDoor4CountingState((PassengerCountingDoorCountingState)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE:
				setDoor1State((DoorState)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE:
				setDoor2State((DoorState)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE:
				setDoor3State((DoorState)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE:
				setDoor4State((DoorState)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED:
				setStopRequested((StopRequested)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION_DATA:
				setGnssLocationData((GNSSLocationData)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP_DATA:
				setCurrentTariffStopData((TicketValidationCurrentTariffStopData)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__RAZZIA_DATA:
				setRazziaData((TicketValidationRazziaData)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE_DATA:
				setCurrentLineData((TicketValidationCurrentLineData)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__VEHICLE_DATA:
				setVehicleData((TicketValidationVehicleData)newValue);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO:
				setTripInfo((TripInfo)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN:
				setIbisAdmin((IbisAdmin)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL_DATA:
				setCustomerInfoAllData((CustomerInfoAllData)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA:
				setCustomerInfoCurrentStopIndexData((CustomerInfoCurrentStopIndexData)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT_DATA:
				setCustomerInfoCurrentStopPointData((CustomerInfoCurrentStopPointData)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP_DATA:
				setCustomerInfoTripData((CustomerInfoTripData)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE_DATA:
				setCustomerInfoVehicleData((CustomerInfoVehicleData)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA:
				setCustomerInfoCurrentAnnouncementData((CustomerInfoCurrentAnnouncementData)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION_DATA:
				setCustomerInfoCurrentConnectionData((CustomerInfoCurrentConnectionData)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA:
				setCustomerInfoCurrentDisplayContentData((CustomerInfoCurrentDisplayContentData)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE:
				unsetDoor1CountingState();
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE:
				unsetDoor2CountingState();
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE:
				unsetDoor3CountingState();
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE:
				unsetDoor4CountingState();
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE:
				setDoor1State((DoorState)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE:
				setDoor2State((DoorState)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE:
				setDoor3State((DoorState)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE:
				setDoor4State((DoorState)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED:
				setStopRequested((StopRequested)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION_DATA:
				setGnssLocationData((GNSSLocationData)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP_DATA:
				setCurrentTariffStopData((TicketValidationCurrentTariffStopData)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__RAZZIA_DATA:
				setRazziaData((TicketValidationRazziaData)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE_DATA:
				setCurrentLineData((TicketValidationCurrentLineData)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__VEHICLE_DATA:
				setVehicleData((TicketValidationVehicleData)null);
				return;
			case IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO:
				setTripInfo((TripInfo)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IbisSensinactPackage.IBIS_DEVICE__IBIS_ADMIN:
				return ibisAdmin != null;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_ALL_DATA:
				return customerInfoAllData != null;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA:
				return customerInfoCurrentStopIndexData != null;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_STOP_POINT_DATA:
				return customerInfoCurrentStopPointData != null;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_TRIP_DATA:
				return customerInfoTripData != null;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_VEHICLE_DATA:
				return customerInfoVehicleData != null;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA:
				return customerInfoCurrentAnnouncementData != null;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_CONNECTION_DATA:
				return customerInfoCurrentConnectionData != null;
			case IbisSensinactPackage.IBIS_DEVICE__CUSTOMER_INFO_CURRENT_DISPLAY_CONTENT_DATA:
				return customerInfoCurrentDisplayContentData != null;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_COUNTING_STATE:
				return isSetDoor1CountingState();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_COUNTING_STATE:
				return isSetDoor2CountingState();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_COUNTING_STATE:
				return isSetDoor3CountingState();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_COUNTING_STATE:
				return isSetDoor4CountingState();
			case IbisSensinactPackage.IBIS_DEVICE__DOOR1_STATE:
				return door1State != null;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR2_STATE:
				return door2State != null;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR3_STATE:
				return door3State != null;
			case IbisSensinactPackage.IBIS_DEVICE__DOOR4_STATE:
				return door4State != null;
			case IbisSensinactPackage.IBIS_DEVICE__STOP_REQUESTED:
				return stopRequested != null;
			case IbisSensinactPackage.IBIS_DEVICE__GNSS_LOCATION_DATA:
				return gnssLocationData != null;
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_TARIFF_STOP_DATA:
				return currentTariffStopData != null;
			case IbisSensinactPackage.IBIS_DEVICE__RAZZIA_DATA:
				return razziaData != null;
			case IbisSensinactPackage.IBIS_DEVICE__CURRENT_LINE_DATA:
				return currentLineData != null;
			case IbisSensinactPackage.IBIS_DEVICE__VEHICLE_DATA:
				return vehicleData != null;
			case IbisSensinactPackage.IBIS_DEVICE__TRIP_INFO:
				return tripInfo != null;
		}
		return super.eIsSet(featureID);
	}

} //IbisDeviceImpl
