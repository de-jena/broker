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
import de.jena.nahverkehr.station.rectifier.MeasurementValue;
import de.jena.nahverkehr.station.rectifier.RectifierPackage;
import de.jena.nahverkehr.station.rectifier.RegsiterMessage;
import de.jena.nahverkehr.station.rectifier.StateValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breaker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.BreakerImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.BreakerImpl#getAlarm <em>Alarm</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.BreakerImpl#getState <em>State</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.BreakerImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BreakerImpl extends MinimalEObjectImpl.Container implements Breaker {
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
	 * The cached value of the '{@link #getAlarm() <em>Alarm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarm()
	 * @generated
	 * @ordered
	 */
	protected EList<RegsiterMessage> alarm;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected StateValue state;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected MeasurementValue value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RectifierPackage.Literals.BREAKER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.BREAKER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegsiterMessage> getAlarm() {
		if (alarm == null) {
			alarm = new EObjectContainmentEList<RegsiterMessage>(RegsiterMessage.class, this, RectifierPackage.BREAKER__ALARM);
		}
		return alarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateValue getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(StateValue newState, NotificationChain msgs) {
		StateValue oldState = state;
		state = newState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RectifierPackage.BREAKER__STATE, oldState, newState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(StateValue newState) {
		if (newState != state) {
			NotificationChain msgs = null;
			if (state != null)
				msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.BREAKER__STATE, null, msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.BREAKER__STATE, null, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.BREAKER__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValue getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(MeasurementValue newValue, NotificationChain msgs) {
		MeasurementValue oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RectifierPackage.BREAKER__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(MeasurementValue newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.BREAKER__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.BREAKER__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.BREAKER__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RectifierPackage.BREAKER__ALARM:
				return ((InternalEList<?>)getAlarm()).basicRemove(otherEnd, msgs);
			case RectifierPackage.BREAKER__STATE:
				return basicSetState(null, msgs);
			case RectifierPackage.BREAKER__VALUE:
				return basicSetValue(null, msgs);
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
			case RectifierPackage.BREAKER__ID:
				return getId();
			case RectifierPackage.BREAKER__ALARM:
				return getAlarm();
			case RectifierPackage.BREAKER__STATE:
				return getState();
			case RectifierPackage.BREAKER__VALUE:
				return getValue();
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
			case RectifierPackage.BREAKER__ID:
				setId((String)newValue);
				return;
			case RectifierPackage.BREAKER__ALARM:
				getAlarm().clear();
				getAlarm().addAll((Collection<? extends RegsiterMessage>)newValue);
				return;
			case RectifierPackage.BREAKER__STATE:
				setState((StateValue)newValue);
				return;
			case RectifierPackage.BREAKER__VALUE:
				setValue((MeasurementValue)newValue);
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
			case RectifierPackage.BREAKER__ID:
				setId(ID_EDEFAULT);
				return;
			case RectifierPackage.BREAKER__ALARM:
				getAlarm().clear();
				return;
			case RectifierPackage.BREAKER__STATE:
				setState((StateValue)null);
				return;
			case RectifierPackage.BREAKER__VALUE:
				setValue((MeasurementValue)null);
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
			case RectifierPackage.BREAKER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RectifierPackage.BREAKER__ALARM:
				return alarm != null && !alarm.isEmpty();
			case RectifierPackage.BREAKER__STATE:
				return state != null;
			case RectifierPackage.BREAKER__VALUE:
				return value != null;
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

} //BreakerImpl
