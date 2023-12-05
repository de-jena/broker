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
package de.jena.sensinact.ocpp.chargepoint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType;
import de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clear Charging Profile Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ClearChargingProfileRequestImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ClearChargingProfileRequestImpl#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ClearChargingProfileRequestImpl#getChargingProfilePurpose <em>Charging Profile Purpose</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ClearChargingProfileRequestImpl#getStackLevel <em>Stack Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClearChargingProfileRequestImpl extends MinimalEObjectImpl.Container implements ClearChargingProfileRequest {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The default value of the '{@link #getConnectorId() <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorId()
	 * @generated
	 * @ordered
	 */
	protected static final int CONNECTOR_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConnectorId() <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorId()
	 * @generated
	 * @ordered
	 */
	protected int connectorId = CONNECTOR_ID_EDEFAULT;

	/**
	 * This is true if the Connector Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectorIdESet;

	/**
	 * The default value of the '{@link #getChargingProfilePurpose() <em>Charging Profile Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingProfilePurpose()
	 * @generated
	 * @ordered
	 */
	protected static final ChargingProfilePurposeType CHARGING_PROFILE_PURPOSE_EDEFAULT = ChargingProfilePurposeType.CHARGE_POINT_MAX_PROFILE;

	/**
	 * The cached value of the '{@link #getChargingProfilePurpose() <em>Charging Profile Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingProfilePurpose()
	 * @generated
	 * @ordered
	 */
	protected ChargingProfilePurposeType chargingProfilePurpose = CHARGING_PROFILE_PURPOSE_EDEFAULT;

	/**
	 * This is true if the Charging Profile Purpose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean chargingProfilePurposeESet;

	/**
	 * The default value of the '{@link #getStackLevel() <em>Stack Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int STACK_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStackLevel() <em>Stack Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackLevel()
	 * @generated
	 * @ordered
	 */
	protected int stackLevel = STACK_LEVEL_EDEFAULT;

	/**
	 * This is true if the Stack Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stackLevelESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClearChargingProfileRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.CLEAR_CHARGING_PROFILE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetId() {
		int oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getConnectorId() {
		return connectorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectorId(int newConnectorId) {
		int oldConnectorId = connectorId;
		connectorId = newConnectorId;
		boolean oldConnectorIdESet = connectorIdESet;
		connectorIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__CONNECTOR_ID, oldConnectorId, connectorId, !oldConnectorIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetConnectorId() {
		int oldConnectorId = connectorId;
		boolean oldConnectorIdESet = connectorIdESet;
		connectorId = CONNECTOR_ID_EDEFAULT;
		connectorIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__CONNECTOR_ID, oldConnectorId, CONNECTOR_ID_EDEFAULT, oldConnectorIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetConnectorId() {
		return connectorIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargingProfilePurposeType getChargingProfilePurpose() {
		return chargingProfilePurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChargingProfilePurpose(ChargingProfilePurposeType newChargingProfilePurpose) {
		ChargingProfilePurposeType oldChargingProfilePurpose = chargingProfilePurpose;
		chargingProfilePurpose = newChargingProfilePurpose == null ? CHARGING_PROFILE_PURPOSE_EDEFAULT : newChargingProfilePurpose;
		boolean oldChargingProfilePurposeESet = chargingProfilePurposeESet;
		chargingProfilePurposeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__CHARGING_PROFILE_PURPOSE, oldChargingProfilePurpose, chargingProfilePurpose, !oldChargingProfilePurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetChargingProfilePurpose() {
		ChargingProfilePurposeType oldChargingProfilePurpose = chargingProfilePurpose;
		boolean oldChargingProfilePurposeESet = chargingProfilePurposeESet;
		chargingProfilePurpose = CHARGING_PROFILE_PURPOSE_EDEFAULT;
		chargingProfilePurposeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__CHARGING_PROFILE_PURPOSE, oldChargingProfilePurpose, CHARGING_PROFILE_PURPOSE_EDEFAULT, oldChargingProfilePurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetChargingProfilePurpose() {
		return chargingProfilePurposeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStackLevel() {
		return stackLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStackLevel(int newStackLevel) {
		int oldStackLevel = stackLevel;
		stackLevel = newStackLevel;
		boolean oldStackLevelESet = stackLevelESet;
		stackLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__STACK_LEVEL, oldStackLevel, stackLevel, !oldStackLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStackLevel() {
		int oldStackLevel = stackLevel;
		boolean oldStackLevelESet = stackLevelESet;
		stackLevel = STACK_LEVEL_EDEFAULT;
		stackLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__STACK_LEVEL, oldStackLevel, STACK_LEVEL_EDEFAULT, oldStackLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStackLevel() {
		return stackLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__ID:
				return getId();
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__CONNECTOR_ID:
				return getConnectorId();
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__CHARGING_PROFILE_PURPOSE:
				return getChargingProfilePurpose();
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__STACK_LEVEL:
				return getStackLevel();
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
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__ID:
				setId((Integer)newValue);
				return;
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__CONNECTOR_ID:
				setConnectorId((Integer)newValue);
				return;
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__CHARGING_PROFILE_PURPOSE:
				setChargingProfilePurpose((ChargingProfilePurposeType)newValue);
				return;
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__STACK_LEVEL:
				setStackLevel((Integer)newValue);
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
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__ID:
				unsetId();
				return;
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__CONNECTOR_ID:
				unsetConnectorId();
				return;
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__CHARGING_PROFILE_PURPOSE:
				unsetChargingProfilePurpose();
				return;
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__STACK_LEVEL:
				unsetStackLevel();
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
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__ID:
				return isSetId();
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__CONNECTOR_ID:
				return isSetConnectorId();
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__CHARGING_PROFILE_PURPOSE:
				return isSetChargingProfilePurpose();
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST__STACK_LEVEL:
				return isSetStackLevel();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", connectorId: ");
		if (connectorIdESet) result.append(connectorId); else result.append("<unset>");
		result.append(", chargingProfilePurpose: ");
		if (chargingProfilePurposeESet) result.append(chargingProfilePurpose); else result.append("<unset>");
		result.append(", stackLevel: ");
		if (stackLevelESet) result.append(stackLevel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ClearChargingProfileRequestImpl
