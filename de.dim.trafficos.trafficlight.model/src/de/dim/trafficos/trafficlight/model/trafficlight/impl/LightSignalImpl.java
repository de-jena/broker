/*
 */
package de.dim.trafficos.trafficlight.model.trafficlight.impl;

import de.dim.trafficos.trafficlight.model.trafficlight.LightSignal;
import de.dim.trafficos.trafficlight.model.trafficlight.SignalValueType;
import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Light Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.impl.LightSignalImpl#isBlinking <em>Blinking</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.impl.LightSignalImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.impl.LightSignalImpl#isOn <em>On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LightSignalImpl extends MinimalEObjectImpl.Container implements LightSignal {
	/**
	 * The default value of the '{@link #isBlinking() <em>Blinking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlinking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLINKING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBlinking() <em>Blinking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlinking()
	 * @generated
	 * @ordered
	 */
	protected boolean blinking = BLINKING_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final SignalValueType VALUE_EDEFAULT = SignalValueType.RED;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected SignalValueType value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOn() <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOn() <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOn()
	 * @generated
	 * @ordered
	 */
	protected boolean on = ON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightSignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSTrafficLightPackage.eINSTANCE.getLightSignal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBlinking() {
		return blinking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlinking(boolean newBlinking) {
		boolean oldBlinking = blinking;
		blinking = newBlinking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSTrafficLightPackage.LIGHT_SIGNAL__BLINKING, oldBlinking, blinking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalValueType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(SignalValueType newValue) {
		SignalValueType oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSTrafficLightPackage.LIGHT_SIGNAL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOn() {
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOn(boolean newOn) {
		boolean oldOn = on;
		on = newOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSTrafficLightPackage.LIGHT_SIGNAL__ON, oldOn, on));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSTrafficLightPackage.LIGHT_SIGNAL__BLINKING:
				return isBlinking();
			case TOSTrafficLightPackage.LIGHT_SIGNAL__VALUE:
				return getValue();
			case TOSTrafficLightPackage.LIGHT_SIGNAL__ON:
				return isOn();
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
			case TOSTrafficLightPackage.LIGHT_SIGNAL__BLINKING:
				setBlinking((Boolean)newValue);
				return;
			case TOSTrafficLightPackage.LIGHT_SIGNAL__VALUE:
				setValue((SignalValueType)newValue);
				return;
			case TOSTrafficLightPackage.LIGHT_SIGNAL__ON:
				setOn((Boolean)newValue);
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
			case TOSTrafficLightPackage.LIGHT_SIGNAL__BLINKING:
				setBlinking(BLINKING_EDEFAULT);
				return;
			case TOSTrafficLightPackage.LIGHT_SIGNAL__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case TOSTrafficLightPackage.LIGHT_SIGNAL__ON:
				setOn(ON_EDEFAULT);
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
			case TOSTrafficLightPackage.LIGHT_SIGNAL__BLINKING:
				return blinking != BLINKING_EDEFAULT;
			case TOSTrafficLightPackage.LIGHT_SIGNAL__VALUE:
				return value != VALUE_EDEFAULT;
			case TOSTrafficLightPackage.LIGHT_SIGNAL__ON:
				return on != ON_EDEFAULT;
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
		result.append(" (blinking: ");
		result.append(blinking);
		result.append(", value: ");
		result.append(value);
		result.append(", on: ");
		result.append(on);
		result.append(')');
		return result.toString();
	}

} //LightSignalImpl
