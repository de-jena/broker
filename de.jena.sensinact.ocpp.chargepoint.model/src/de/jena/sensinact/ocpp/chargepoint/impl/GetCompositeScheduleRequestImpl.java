/**
 */
package de.jena.sensinact.ocpp.chargepoint.impl;

import de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType;
import de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Composite Schedule Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.GetCompositeScheduleRequestImpl#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.GetCompositeScheduleRequestImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.GetCompositeScheduleRequestImpl#getChargingRateUnit <em>Charging Rate Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetCompositeScheduleRequestImpl extends MinimalEObjectImpl.Container implements GetCompositeScheduleRequest {
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
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * This is true if the Duration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean durationESet;

	/**
	 * The default value of the '{@link #getChargingRateUnit() <em>Charging Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingRateUnit()
	 * @generated
	 * @ordered
	 */
	protected static final ChargingRateUnitType CHARGING_RATE_UNIT_EDEFAULT = ChargingRateUnitType.W;

	/**
	 * The cached value of the '{@link #getChargingRateUnit() <em>Charging Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingRateUnit()
	 * @generated
	 * @ordered
	 */
	protected ChargingRateUnitType chargingRateUnit = CHARGING_RATE_UNIT_EDEFAULT;

	/**
	 * This is true if the Charging Rate Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean chargingRateUnitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetCompositeScheduleRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.GET_COMPOSITE_SCHEDULE_REQUEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__CONNECTOR_ID, oldConnectorId, connectorId, !oldConnectorIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__CONNECTOR_ID, oldConnectorId, CONNECTOR_ID_EDEFAULT, oldConnectorIdESet));
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
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		boolean oldDurationESet = durationESet;
		durationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__DURATION, oldDuration, duration, !oldDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDuration() {
		int oldDuration = duration;
		boolean oldDurationESet = durationESet;
		duration = DURATION_EDEFAULT;
		durationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__DURATION, oldDuration, DURATION_EDEFAULT, oldDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDuration() {
		return durationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargingRateUnitType getChargingRateUnit() {
		return chargingRateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChargingRateUnit(ChargingRateUnitType newChargingRateUnit) {
		ChargingRateUnitType oldChargingRateUnit = chargingRateUnit;
		chargingRateUnit = newChargingRateUnit == null ? CHARGING_RATE_UNIT_EDEFAULT : newChargingRateUnit;
		boolean oldChargingRateUnitESet = chargingRateUnitESet;
		chargingRateUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__CHARGING_RATE_UNIT, oldChargingRateUnit, chargingRateUnit, !oldChargingRateUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetChargingRateUnit() {
		ChargingRateUnitType oldChargingRateUnit = chargingRateUnit;
		boolean oldChargingRateUnitESet = chargingRateUnitESet;
		chargingRateUnit = CHARGING_RATE_UNIT_EDEFAULT;
		chargingRateUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__CHARGING_RATE_UNIT, oldChargingRateUnit, CHARGING_RATE_UNIT_EDEFAULT, oldChargingRateUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetChargingRateUnit() {
		return chargingRateUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__CONNECTOR_ID:
				return getConnectorId();
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__DURATION:
				return getDuration();
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__CHARGING_RATE_UNIT:
				return getChargingRateUnit();
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
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__CONNECTOR_ID:
				setConnectorId((Integer)newValue);
				return;
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__DURATION:
				setDuration((Integer)newValue);
				return;
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__CHARGING_RATE_UNIT:
				setChargingRateUnit((ChargingRateUnitType)newValue);
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
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__CONNECTOR_ID:
				unsetConnectorId();
				return;
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__DURATION:
				unsetDuration();
				return;
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__CHARGING_RATE_UNIT:
				unsetChargingRateUnit();
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
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__CONNECTOR_ID:
				return isSetConnectorId();
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__DURATION:
				return isSetDuration();
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST__CHARGING_RATE_UNIT:
				return isSetChargingRateUnit();
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
		result.append(" (connectorId: ");
		if (connectorIdESet) result.append(connectorId); else result.append("<unset>");
		result.append(", duration: ");
		if (durationESet) result.append(duration); else result.append("<unset>");
		result.append(", chargingRateUnit: ");
		if (chargingRateUnitESet) result.append(chargingRateUnit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GetCompositeScheduleRequestImpl
