/*
 */
package de.jena.sensinact.ocpp.chargepoint.impl;

import de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charging Schedule Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingSchedulePeriodImpl#getStartPeriod <em>Start Period</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingSchedulePeriodImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingSchedulePeriodImpl#getNumberPhases <em>Number Phases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargingSchedulePeriodImpl extends MinimalEObjectImpl.Container implements ChargingSchedulePeriod {
	/**
	 * The default value of the '{@link #getStartPeriod() <em>Start Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int START_PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartPeriod() <em>Start Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPeriod()
	 * @generated
	 * @ordered
	 */
	protected int startPeriod = START_PERIOD_EDEFAULT;

	/**
	 * This is true if the Start Period attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startPeriodESet;

	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal limit = LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberPhases() <em>Number Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberPhases()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_PHASES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberPhases() <em>Number Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberPhases()
	 * @generated
	 * @ordered
	 */
	protected int numberPhases = NUMBER_PHASES_EDEFAULT;

	/**
	 * This is true if the Number Phases attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberPhasesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChargingSchedulePeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.CHARGING_SCHEDULE_PERIOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartPeriod() {
		return startPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartPeriod(int newStartPeriod) {
		int oldStartPeriod = startPeriod;
		startPeriod = newStartPeriod;
		boolean oldStartPeriodESet = startPeriodESet;
		startPeriodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__START_PERIOD, oldStartPeriod, startPeriod, !oldStartPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStartPeriod() {
		int oldStartPeriod = startPeriod;
		boolean oldStartPeriodESet = startPeriodESet;
		startPeriod = START_PERIOD_EDEFAULT;
		startPeriodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__START_PERIOD, oldStartPeriod, START_PERIOD_EDEFAULT, oldStartPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStartPeriod() {
		return startPeriodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLimit(BigDecimal newLimit) {
		BigDecimal oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberPhases() {
		return numberPhases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberPhases(int newNumberPhases) {
		int oldNumberPhases = numberPhases;
		numberPhases = newNumberPhases;
		boolean oldNumberPhasesESet = numberPhasesESet;
		numberPhasesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__NUMBER_PHASES, oldNumberPhases, numberPhases, !oldNumberPhasesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNumberPhases() {
		int oldNumberPhases = numberPhases;
		boolean oldNumberPhasesESet = numberPhasesESet;
		numberPhases = NUMBER_PHASES_EDEFAULT;
		numberPhasesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__NUMBER_PHASES, oldNumberPhases, NUMBER_PHASES_EDEFAULT, oldNumberPhasesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNumberPhases() {
		return numberPhasesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__START_PERIOD:
				return getStartPeriod();
			case OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__LIMIT:
				return getLimit();
			case OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__NUMBER_PHASES:
				return getNumberPhases();
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
			case OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__START_PERIOD:
				setStartPeriod((Integer)newValue);
				return;
			case OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__LIMIT:
				setLimit((BigDecimal)newValue);
				return;
			case OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__NUMBER_PHASES:
				setNumberPhases((Integer)newValue);
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
			case OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__START_PERIOD:
				unsetStartPeriod();
				return;
			case OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__LIMIT:
				setLimit(LIMIT_EDEFAULT);
				return;
			case OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__NUMBER_PHASES:
				unsetNumberPhases();
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
			case OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__START_PERIOD:
				return isSetStartPeriod();
			case OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__LIMIT:
				return LIMIT_EDEFAULT == null ? limit != null : !LIMIT_EDEFAULT.equals(limit);
			case OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD__NUMBER_PHASES:
				return isSetNumberPhases();
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
		result.append(" (startPeriod: ");
		if (startPeriodESet) result.append(startPeriod); else result.append("<unset>");
		result.append(", limit: ");
		result.append(limit);
		result.append(", numberPhases: ");
		if (numberPhasesESet) result.append(numberPhases); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ChargingSchedulePeriodImpl
