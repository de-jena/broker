/*
 */
package de.dim.trafficos.trafficlight.model.trafficlight.impl;

import de.dim.trafficos.trafficlight.model.trafficlight.ChangedState;
import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Changed State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.impl.ChangedStateImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.impl.ChangedStateImpl#getColor <em>Color</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.impl.ChangedStateImpl#isOn <em>On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangedStateImpl extends MinimalEObjectImpl.Container implements ChangedState {
	/**
	 * The default value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected String channel = CHANNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

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
	protected ChangedStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSTrafficLightPackage.eINSTANCE.getChangedState();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannel(String newChannel) {
		String oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSTrafficLightPackage.CHANGED_STATE__CHANNEL, oldChannel, channel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSTrafficLightPackage.CHANGED_STATE__COLOR, oldColor, color));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TOSTrafficLightPackage.CHANGED_STATE__ON, oldOn, on));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSTrafficLightPackage.CHANGED_STATE__CHANNEL:
				return getChannel();
			case TOSTrafficLightPackage.CHANGED_STATE__COLOR:
				return getColor();
			case TOSTrafficLightPackage.CHANGED_STATE__ON:
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
			case TOSTrafficLightPackage.CHANGED_STATE__CHANNEL:
				setChannel((String)newValue);
				return;
			case TOSTrafficLightPackage.CHANGED_STATE__COLOR:
				setColor((String)newValue);
				return;
			case TOSTrafficLightPackage.CHANGED_STATE__ON:
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
			case TOSTrafficLightPackage.CHANGED_STATE__CHANNEL:
				setChannel(CHANNEL_EDEFAULT);
				return;
			case TOSTrafficLightPackage.CHANGED_STATE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case TOSTrafficLightPackage.CHANGED_STATE__ON:
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
			case TOSTrafficLightPackage.CHANGED_STATE__CHANNEL:
				return CHANNEL_EDEFAULT == null ? channel != null : !CHANNEL_EDEFAULT.equals(channel);
			case TOSTrafficLightPackage.CHANGED_STATE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case TOSTrafficLightPackage.CHANGED_STATE__ON:
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
		result.append(" (channel: ");
		result.append(channel);
		result.append(", color: ");
		result.append(color);
		result.append(", on: ");
		result.append(on);
		result.append(')');
		return result.toString();
	}

} //ChangedStateImpl
