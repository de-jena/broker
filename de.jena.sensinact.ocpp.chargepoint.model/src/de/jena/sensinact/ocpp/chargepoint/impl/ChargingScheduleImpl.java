/**
 */
package de.jena.sensinact.ocpp.chargepoint.impl;

import de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType;
import de.jena.sensinact.ocpp.chargepoint.ChargingSchedule;
import de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

import java.math.BigDecimal;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charging Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingScheduleImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingScheduleImpl#getStartSchedule <em>Start Schedule</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingScheduleImpl#getChargingRateUnit <em>Charging Rate Unit</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingScheduleImpl#getChargingSchedulePeriod <em>Charging Schedule Period</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingScheduleImpl#getMinChargingRate <em>Min Charging Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargingScheduleImpl extends MinimalEObjectImpl.Container implements ChargingSchedule {
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
	 * The default value of the '{@link #getStartSchedule() <em>Start Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSchedule()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_SCHEDULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartSchedule() <em>Start Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSchedule()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startSchedule = START_SCHEDULE_EDEFAULT;

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
	 * The cached value of the '{@link #getChargingSchedulePeriod() <em>Charging Schedule Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingSchedulePeriod()
	 * @generated
	 * @ordered
	 */
	protected EList<ChargingSchedulePeriod> chargingSchedulePeriod;

	/**
	 * The default value of the '{@link #getMinChargingRate() <em>Min Charging Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinChargingRate()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MIN_CHARGING_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinChargingRate() <em>Min Charging Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinChargingRate()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal minChargingRate = MIN_CHARGING_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChargingScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.CHARGING_SCHEDULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_SCHEDULE__DURATION, oldDuration, duration, !oldDurationESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.CHARGING_SCHEDULE__DURATION, oldDuration, DURATION_EDEFAULT, oldDurationESet));
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
	public XMLGregorianCalendar getStartSchedule() {
		return startSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartSchedule(XMLGregorianCalendar newStartSchedule) {
		XMLGregorianCalendar oldStartSchedule = startSchedule;
		startSchedule = newStartSchedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_SCHEDULE__START_SCHEDULE, oldStartSchedule, startSchedule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_SCHEDULE__CHARGING_RATE_UNIT, oldChargingRateUnit, chargingRateUnit, !oldChargingRateUnitESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.CHARGING_SCHEDULE__CHARGING_RATE_UNIT, oldChargingRateUnit, CHARGING_RATE_UNIT_EDEFAULT, oldChargingRateUnitESet));
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
	public EList<ChargingSchedulePeriod> getChargingSchedulePeriod() {
		if (chargingSchedulePeriod == null) {
			chargingSchedulePeriod = new EObjectContainmentEList<ChargingSchedulePeriod>(ChargingSchedulePeriod.class, this, OcppChargePointPackage.CHARGING_SCHEDULE__CHARGING_SCHEDULE_PERIOD);
		}
		return chargingSchedulePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinChargingRate() {
		return minChargingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinChargingRate(BigDecimal newMinChargingRate) {
		BigDecimal oldMinChargingRate = minChargingRate;
		minChargingRate = newMinChargingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_SCHEDULE__MIN_CHARGING_RATE, oldMinChargingRate, minChargingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OcppChargePointPackage.CHARGING_SCHEDULE__CHARGING_SCHEDULE_PERIOD:
				return ((InternalEList<?>)getChargingSchedulePeriod()).basicRemove(otherEnd, msgs);
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
			case OcppChargePointPackage.CHARGING_SCHEDULE__DURATION:
				return getDuration();
			case OcppChargePointPackage.CHARGING_SCHEDULE__START_SCHEDULE:
				return getStartSchedule();
			case OcppChargePointPackage.CHARGING_SCHEDULE__CHARGING_RATE_UNIT:
				return getChargingRateUnit();
			case OcppChargePointPackage.CHARGING_SCHEDULE__CHARGING_SCHEDULE_PERIOD:
				return getChargingSchedulePeriod();
			case OcppChargePointPackage.CHARGING_SCHEDULE__MIN_CHARGING_RATE:
				return getMinChargingRate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OcppChargePointPackage.CHARGING_SCHEDULE__DURATION:
				setDuration((Integer)newValue);
				return;
			case OcppChargePointPackage.CHARGING_SCHEDULE__START_SCHEDULE:
				setStartSchedule((XMLGregorianCalendar)newValue);
				return;
			case OcppChargePointPackage.CHARGING_SCHEDULE__CHARGING_RATE_UNIT:
				setChargingRateUnit((ChargingRateUnitType)newValue);
				return;
			case OcppChargePointPackage.CHARGING_SCHEDULE__CHARGING_SCHEDULE_PERIOD:
				getChargingSchedulePeriod().clear();
				getChargingSchedulePeriod().addAll((Collection<? extends ChargingSchedulePeriod>)newValue);
				return;
			case OcppChargePointPackage.CHARGING_SCHEDULE__MIN_CHARGING_RATE:
				setMinChargingRate((BigDecimal)newValue);
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
			case OcppChargePointPackage.CHARGING_SCHEDULE__DURATION:
				unsetDuration();
				return;
			case OcppChargePointPackage.CHARGING_SCHEDULE__START_SCHEDULE:
				setStartSchedule(START_SCHEDULE_EDEFAULT);
				return;
			case OcppChargePointPackage.CHARGING_SCHEDULE__CHARGING_RATE_UNIT:
				unsetChargingRateUnit();
				return;
			case OcppChargePointPackage.CHARGING_SCHEDULE__CHARGING_SCHEDULE_PERIOD:
				getChargingSchedulePeriod().clear();
				return;
			case OcppChargePointPackage.CHARGING_SCHEDULE__MIN_CHARGING_RATE:
				setMinChargingRate(MIN_CHARGING_RATE_EDEFAULT);
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
			case OcppChargePointPackage.CHARGING_SCHEDULE__DURATION:
				return isSetDuration();
			case OcppChargePointPackage.CHARGING_SCHEDULE__START_SCHEDULE:
				return START_SCHEDULE_EDEFAULT == null ? startSchedule != null : !START_SCHEDULE_EDEFAULT.equals(startSchedule);
			case OcppChargePointPackage.CHARGING_SCHEDULE__CHARGING_RATE_UNIT:
				return isSetChargingRateUnit();
			case OcppChargePointPackage.CHARGING_SCHEDULE__CHARGING_SCHEDULE_PERIOD:
				return chargingSchedulePeriod != null && !chargingSchedulePeriod.isEmpty();
			case OcppChargePointPackage.CHARGING_SCHEDULE__MIN_CHARGING_RATE:
				return MIN_CHARGING_RATE_EDEFAULT == null ? minChargingRate != null : !MIN_CHARGING_RATE_EDEFAULT.equals(minChargingRate);
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
		result.append(" (duration: ");
		if (durationESet) result.append(duration); else result.append("<unset>");
		result.append(", startSchedule: ");
		result.append(startSchedule);
		result.append(", chargingRateUnit: ");
		if (chargingRateUnitESet) result.append(chargingRateUnit); else result.append("<unset>");
		result.append(", minChargingRate: ");
		result.append(minChargingRate);
		result.append(')');
		return result.toString();
	}

} //ChargingScheduleImpl
