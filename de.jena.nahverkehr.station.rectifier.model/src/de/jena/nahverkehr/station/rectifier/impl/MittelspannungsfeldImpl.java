/*
 */
package de.jena.nahverkehr.station.rectifier.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.jena.nahverkehr.station.rectifier.CircuitBreaker;
import de.jena.nahverkehr.station.rectifier.MeasurementValue;
import de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld;
import de.jena.nahverkehr.station.rectifier.RectifierPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mittelspannungsfeld</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.MittelspannungsfeldImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.MittelspannungsfeldImpl#getPower <em>Power</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.MittelspannungsfeldImpl#getCircuiteBreaker <em>Circuite Breaker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MittelspannungsfeldImpl extends MinimalEObjectImpl.Container implements Mittelspannungsfeld {
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
	 * The cached value of the '{@link #getCircuiteBreaker() <em>Circuite Breaker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuiteBreaker()
	 * @generated
	 * @ordered
	 */
	protected CircuitBreaker circuiteBreaker;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MittelspannungsfeldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RectifierPackage.Literals.MITTELSPANNUNGSFELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.MITTELSPANNUNGSFELD__ID, oldId, id));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RectifierPackage.MITTELSPANNUNGSFELD__POWER, oldPower, newPower);
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
				msgs = ((InternalEObject)power).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.MITTELSPANNUNGSFELD__POWER, null, msgs);
			if (newPower != null)
				msgs = ((InternalEObject)newPower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.MITTELSPANNUNGSFELD__POWER, null, msgs);
			msgs = basicSetPower(newPower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.MITTELSPANNUNGSFELD__POWER, newPower, newPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitBreaker getCircuiteBreaker() {
		return circuiteBreaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircuiteBreaker(CircuitBreaker newCircuiteBreaker, NotificationChain msgs) {
		CircuitBreaker oldCircuiteBreaker = circuiteBreaker;
		circuiteBreaker = newCircuiteBreaker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RectifierPackage.MITTELSPANNUNGSFELD__CIRCUITE_BREAKER, oldCircuiteBreaker, newCircuiteBreaker);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuiteBreaker(CircuitBreaker newCircuiteBreaker) {
		if (newCircuiteBreaker != circuiteBreaker) {
			NotificationChain msgs = null;
			if (circuiteBreaker != null)
				msgs = ((InternalEObject)circuiteBreaker).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.MITTELSPANNUNGSFELD__CIRCUITE_BREAKER, null, msgs);
			if (newCircuiteBreaker != null)
				msgs = ((InternalEObject)newCircuiteBreaker).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.MITTELSPANNUNGSFELD__CIRCUITE_BREAKER, null, msgs);
			msgs = basicSetCircuiteBreaker(newCircuiteBreaker, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.MITTELSPANNUNGSFELD__CIRCUITE_BREAKER, newCircuiteBreaker, newCircuiteBreaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RectifierPackage.MITTELSPANNUNGSFELD__POWER:
				return basicSetPower(null, msgs);
			case RectifierPackage.MITTELSPANNUNGSFELD__CIRCUITE_BREAKER:
				return basicSetCircuiteBreaker(null, msgs);
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
			case RectifierPackage.MITTELSPANNUNGSFELD__ID:
				return getId();
			case RectifierPackage.MITTELSPANNUNGSFELD__POWER:
				return getPower();
			case RectifierPackage.MITTELSPANNUNGSFELD__CIRCUITE_BREAKER:
				return getCircuiteBreaker();
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
			case RectifierPackage.MITTELSPANNUNGSFELD__ID:
				setId((String)newValue);
				return;
			case RectifierPackage.MITTELSPANNUNGSFELD__POWER:
				setPower((MeasurementValue)newValue);
				return;
			case RectifierPackage.MITTELSPANNUNGSFELD__CIRCUITE_BREAKER:
				setCircuiteBreaker((CircuitBreaker)newValue);
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
			case RectifierPackage.MITTELSPANNUNGSFELD__ID:
				setId(ID_EDEFAULT);
				return;
			case RectifierPackage.MITTELSPANNUNGSFELD__POWER:
				setPower((MeasurementValue)null);
				return;
			case RectifierPackage.MITTELSPANNUNGSFELD__CIRCUITE_BREAKER:
				setCircuiteBreaker((CircuitBreaker)null);
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
			case RectifierPackage.MITTELSPANNUNGSFELD__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RectifierPackage.MITTELSPANNUNGSFELD__POWER:
				return power != null;
			case RectifierPackage.MITTELSPANNUNGSFELD__CIRCUITE_BREAKER:
				return circuiteBreaker != null;
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
		result.append(')');
		return result.toString();
	}

} //MittelspannungsfeldImpl
