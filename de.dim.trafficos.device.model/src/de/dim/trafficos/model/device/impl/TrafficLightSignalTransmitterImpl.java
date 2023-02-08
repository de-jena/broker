/*
 */
package de.dim.trafficos.model.device.impl;

import de.dim.trafficos.model.device.TOSDevicePackage;
import de.dim.trafficos.model.device.TrafficLightSignalGroup;
import de.dim.trafficos.model.device.TrafficLightSignalTransmitter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traffic Light Signal Transmitter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.TrafficLightSignalTransmitterImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.TrafficLightSignalTransmitterImpl#getSignalGroup <em>Signal Group</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.TrafficLightSignalTransmitterImpl#isRed <em>Red</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.TrafficLightSignalTransmitterImpl#isYellow <em>Yellow</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.TrafficLightSignalTransmitterImpl#isGreen <em>Green</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.TrafficLightSignalTransmitterImpl#isSwitch <em>Switch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafficLightSignalTransmitterImpl extends MinimalEObjectImpl.Container implements TrafficLightSignalTransmitter {
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
	 * The cached value of the '{@link #getSignalGroup() <em>Signal Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroup()
	 * @generated
	 * @ordered
	 */
	protected TrafficLightSignalGroup signalGroup;

	/**
	 * The default value of the '{@link #isRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRed()
	 * @generated
	 * @ordered
	 */
	protected boolean red = RED_EDEFAULT;

	/**
	 * The default value of the '{@link #isYellow() <em>Yellow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isYellow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean YELLOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isYellow() <em>Yellow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isYellow()
	 * @generated
	 * @ordered
	 */
	protected boolean yellow = YELLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #isGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGreen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GREEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGreen()
	 * @generated
	 * @ordered
	 */
	protected boolean green = GREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isSwitch() <em>Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwitch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SWITCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSwitch() <em>Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwitch()
	 * @generated
	 * @ordered
	 */
	protected boolean switch_ = SWITCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafficLightSignalTransmitterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrafficLightSignalGroup getSignalGroup() {
		if (signalGroup != null && signalGroup.eIsProxy()) {
			InternalEObject oldSignalGroup = (InternalEObject)signalGroup;
			signalGroup = (TrafficLightSignalGroup)eResolveProxy(oldSignalGroup);
			if (signalGroup != oldSignalGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__SIGNAL_GROUP, oldSignalGroup, signalGroup));
			}
		}
		return signalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafficLightSignalGroup basicGetSignalGroup() {
		return signalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignalGroup(TrafficLightSignalGroup newSignalGroup) {
		TrafficLightSignalGroup oldSignalGroup = signalGroup;
		signalGroup = newSignalGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__SIGNAL_GROUP, oldSignalGroup, signalGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRed() {
		return red;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRed(boolean newRed) {
		boolean oldRed = red;
		red = newRed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__RED, oldRed, red));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isYellow() {
		return yellow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYellow(boolean newYellow) {
		boolean oldYellow = yellow;
		yellow = newYellow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__YELLOW, oldYellow, yellow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGreen() {
		return green;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGreen(boolean newGreen) {
		boolean oldGreen = green;
		green = newGreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__GREEN, oldGreen, green));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSwitch() {
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSwitch(boolean newSwitch) {
		boolean oldSwitch = switch_;
		switch_ = newSwitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__SWITCH, oldSwitch, switch_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__ID:
				return getId();
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__SIGNAL_GROUP:
				if (resolve) return getSignalGroup();
				return basicGetSignalGroup();
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__RED:
				return isRed();
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__YELLOW:
				return isYellow();
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__GREEN:
				return isGreen();
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__SWITCH:
				return isSwitch();
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
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__ID:
				setId((String)newValue);
				return;
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__SIGNAL_GROUP:
				setSignalGroup((TrafficLightSignalGroup)newValue);
				return;
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__RED:
				setRed((Boolean)newValue);
				return;
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__YELLOW:
				setYellow((Boolean)newValue);
				return;
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__GREEN:
				setGreen((Boolean)newValue);
				return;
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__SWITCH:
				setSwitch((Boolean)newValue);
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
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__ID:
				setId(ID_EDEFAULT);
				return;
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__SIGNAL_GROUP:
				setSignalGroup((TrafficLightSignalGroup)null);
				return;
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__RED:
				setRed(RED_EDEFAULT);
				return;
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__YELLOW:
				setYellow(YELLOW_EDEFAULT);
				return;
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__GREEN:
				setGreen(GREEN_EDEFAULT);
				return;
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__SWITCH:
				setSwitch(SWITCH_EDEFAULT);
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
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__SIGNAL_GROUP:
				return signalGroup != null;
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__RED:
				return red != RED_EDEFAULT;
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__YELLOW:
				return yellow != YELLOW_EDEFAULT;
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__GREEN:
				return green != GREEN_EDEFAULT;
			case TOSDevicePackage.TRAFFIC_LIGHT_SIGNAL_TRANSMITTER__SWITCH:
				return switch_ != SWITCH_EDEFAULT;
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
		result.append(", red: ");
		result.append(red);
		result.append(", yellow: ");
		result.append(yellow);
		result.append(", green: ");
		result.append(green);
		result.append(", switch: ");
		result.append(switch_);
		result.append(')');
		return result.toString();
	}

} //TrafficLightSignalTransmitterImpl
