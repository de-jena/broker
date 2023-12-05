/*
 */
package de.jena.nahverkehr.station.rectifier.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.jena.nahverkehr.station.rectifier.Breaker;
import de.jena.nahverkehr.station.rectifier.Cabel;
import de.jena.nahverkehr.station.rectifier.MeasurementValue;
import de.jena.nahverkehr.station.rectifier.OutgoingLine;
import de.jena.nahverkehr.station.rectifier.RectifierPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outgoing Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.OutgoingLineImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.OutgoingLineImpl#getPower <em>Power</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.OutgoingLineImpl#isFailure <em>Failure</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.OutgoingLineImpl#getBreaker <em>Breaker</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.OutgoingLineImpl#getThermalLoad <em>Thermal Load</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.OutgoingLineImpl#getCables <em>Cables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutgoingLineImpl extends MinimalEObjectImpl.Container implements OutgoingLine {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected MeasurementValue power;

	/**
	 * The default value of the '{@link #isFailure() <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAILURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFailure() <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailure()
	 * @generated
	 * @ordered
	 */
	protected boolean failure = FAILURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBreaker() <em>Breaker</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreaker()
	 * @generated
	 * @ordered
	 */
	protected EList<Breaker> breaker;

	/**
	 * The cached value of the '{@link #getThermalLoad() <em>Thermal Load</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalLoad()
	 * @generated
	 * @ordered
	 */
	protected MeasurementValue thermalLoad;

	/**
	 * The cached value of the '{@link #getCables() <em>Cables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCables()
	 * @generated
	 * @ordered
	 */
	protected EList<Cabel> cables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutgoingLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RectifierPackage.Literals.OUTGOING_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.OUTGOING_LINE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValue getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPower(MeasurementValue newPower, NotificationChain msgs) {
		MeasurementValue oldPower = power;
		power = newPower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RectifierPackage.OUTGOING_LINE__POWER, oldPower, newPower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(MeasurementValue newPower) {
		if (newPower != power) {
			NotificationChain msgs = null;
			if (power != null)
				msgs = ((InternalEObject)power).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.OUTGOING_LINE__POWER, null, msgs);
			if (newPower != null)
				msgs = ((InternalEObject)newPower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.OUTGOING_LINE__POWER, null, msgs);
			msgs = basicSetPower(newPower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.OUTGOING_LINE__POWER, newPower, newPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFailure() {
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailure(boolean newFailure) {
		boolean oldFailure = failure;
		failure = newFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.OUTGOING_LINE__FAILURE, oldFailure, failure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Breaker> getBreaker() {
		if (breaker == null) {
			breaker = new EObjectContainmentEList<Breaker>(Breaker.class, this, RectifierPackage.OUTGOING_LINE__BREAKER);
		}
		return breaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValue getThermalLoad() {
		return thermalLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalLoad(MeasurementValue newThermalLoad, NotificationChain msgs) {
		MeasurementValue oldThermalLoad = thermalLoad;
		thermalLoad = newThermalLoad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RectifierPackage.OUTGOING_LINE__THERMAL_LOAD, oldThermalLoad, newThermalLoad);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalLoad(MeasurementValue newThermalLoad) {
		if (newThermalLoad != thermalLoad) {
			NotificationChain msgs = null;
			if (thermalLoad != null)
				msgs = ((InternalEObject)thermalLoad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.OUTGOING_LINE__THERMAL_LOAD, null, msgs);
			if (newThermalLoad != null)
				msgs = ((InternalEObject)newThermalLoad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.OUTGOING_LINE__THERMAL_LOAD, null, msgs);
			msgs = basicSetThermalLoad(newThermalLoad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.OUTGOING_LINE__THERMAL_LOAD, newThermalLoad, newThermalLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cabel> getCables() {
		if (cables == null) {
			cables = new EObjectContainmentEList<Cabel>(Cabel.class, this, RectifierPackage.OUTGOING_LINE__CABLES);
		}
		return cables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RectifierPackage.OUTGOING_LINE__POWER:
				return basicSetPower(null, msgs);
			case RectifierPackage.OUTGOING_LINE__BREAKER:
				return ((InternalEList<?>)getBreaker()).basicRemove(otherEnd, msgs);
			case RectifierPackage.OUTGOING_LINE__THERMAL_LOAD:
				return basicSetThermalLoad(null, msgs);
			case RectifierPackage.OUTGOING_LINE__CABLES:
				return ((InternalEList<?>)getCables()).basicRemove(otherEnd, msgs);
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
			case RectifierPackage.OUTGOING_LINE__ID:
				return getId();
			case RectifierPackage.OUTGOING_LINE__POWER:
				return getPower();
			case RectifierPackage.OUTGOING_LINE__FAILURE:
				return isFailure();
			case RectifierPackage.OUTGOING_LINE__BREAKER:
				return getBreaker();
			case RectifierPackage.OUTGOING_LINE__THERMAL_LOAD:
				return getThermalLoad();
			case RectifierPackage.OUTGOING_LINE__CABLES:
				return getCables();
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
			case RectifierPackage.OUTGOING_LINE__ID:
				setId((String)newValue);
				return;
			case RectifierPackage.OUTGOING_LINE__POWER:
				setPower((MeasurementValue)newValue);
				return;
			case RectifierPackage.OUTGOING_LINE__FAILURE:
				setFailure((Boolean)newValue);
				return;
			case RectifierPackage.OUTGOING_LINE__BREAKER:
				getBreaker().clear();
				getBreaker().addAll((Collection<? extends Breaker>)newValue);
				return;
			case RectifierPackage.OUTGOING_LINE__THERMAL_LOAD:
				setThermalLoad((MeasurementValue)newValue);
				return;
			case RectifierPackage.OUTGOING_LINE__CABLES:
				getCables().clear();
				getCables().addAll((Collection<? extends Cabel>)newValue);
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
			case RectifierPackage.OUTGOING_LINE__ID:
				setId(ID_EDEFAULT);
				return;
			case RectifierPackage.OUTGOING_LINE__POWER:
				setPower((MeasurementValue)null);
				return;
			case RectifierPackage.OUTGOING_LINE__FAILURE:
				setFailure(FAILURE_EDEFAULT);
				return;
			case RectifierPackage.OUTGOING_LINE__BREAKER:
				getBreaker().clear();
				return;
			case RectifierPackage.OUTGOING_LINE__THERMAL_LOAD:
				setThermalLoad((MeasurementValue)null);
				return;
			case RectifierPackage.OUTGOING_LINE__CABLES:
				getCables().clear();
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
			case RectifierPackage.OUTGOING_LINE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RectifierPackage.OUTGOING_LINE__POWER:
				return power != null;
			case RectifierPackage.OUTGOING_LINE__FAILURE:
				return failure != FAILURE_EDEFAULT;
			case RectifierPackage.OUTGOING_LINE__BREAKER:
				return breaker != null && !breaker.isEmpty();
			case RectifierPackage.OUTGOING_LINE__THERMAL_LOAD:
				return thermalLoad != null;
			case RectifierPackage.OUTGOING_LINE__CABLES:
				return cables != null && !cables.isEmpty();
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
		result.append(id);
		result.append(", failure: ");
		result.append(failure);
		result.append(')');
		return result.toString();
	}

} //OutgoingLineImpl
