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
package de.dim.trafficos.model.device.impl;

import de.dim.trafficos.model.device.OutPinConfiguration;
import de.dim.trafficos.model.device.OutputElementType;
import de.dim.trafficos.model.device.TOSDevicePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Pin Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.OutPinConfigurationImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.OutPinConfigurationImpl#getGpio <em>Gpio</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.OutPinConfigurationImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.OutPinConfigurationImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutPinConfigurationImpl extends MinimalEObjectImpl.Container implements OutPinConfiguration {
	/**
	 * The default value of the '{@link #getPin() <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected static final int PIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPin() <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected int pin = PIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getGpio() <em>Gpio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpio()
	 * @generated
	 * @ordered
	 */
	protected static final int GPIO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGpio() <em>Gpio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpio()
	 * @generated
	 * @ordered
	 */
	protected int gpio = GPIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final OutputElementType TYPE_EDEFAULT = OutputElementType.OTHER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OutputElementType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutPinConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.OUT_PIN_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPin() {
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPin(int newPin) {
		int oldPin = pin;
		pin = newPin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.OUT_PIN_CONFIGURATION__PIN, oldPin, pin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGpio() {
		return gpio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGpio(int newGpio) {
		int oldGpio = gpio;
		gpio = newGpio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.OUT_PIN_CONFIGURATION__GPIO, oldGpio, gpio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputElementType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(OutputElementType newType) {
		OutputElementType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.OUT_PIN_CONFIGURATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.OUT_PIN_CONFIGURATION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSDevicePackage.OUT_PIN_CONFIGURATION__PIN:
				return getPin();
			case TOSDevicePackage.OUT_PIN_CONFIGURATION__GPIO:
				return getGpio();
			case TOSDevicePackage.OUT_PIN_CONFIGURATION__TYPE:
				return getType();
			case TOSDevicePackage.OUT_PIN_CONFIGURATION__COMMENT:
				return getComment();
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
			case TOSDevicePackage.OUT_PIN_CONFIGURATION__PIN:
				setPin((Integer)newValue);
				return;
			case TOSDevicePackage.OUT_PIN_CONFIGURATION__GPIO:
				setGpio((Integer)newValue);
				return;
			case TOSDevicePackage.OUT_PIN_CONFIGURATION__TYPE:
				setType((OutputElementType)newValue);
				return;
			case TOSDevicePackage.OUT_PIN_CONFIGURATION__COMMENT:
				setComment((String)newValue);
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
			case TOSDevicePackage.OUT_PIN_CONFIGURATION__PIN:
				setPin(PIN_EDEFAULT);
				return;
			case TOSDevicePackage.OUT_PIN_CONFIGURATION__GPIO:
				setGpio(GPIO_EDEFAULT);
				return;
			case TOSDevicePackage.OUT_PIN_CONFIGURATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TOSDevicePackage.OUT_PIN_CONFIGURATION__COMMENT:
				setComment(COMMENT_EDEFAULT);
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
			case TOSDevicePackage.OUT_PIN_CONFIGURATION__PIN:
				return pin != PIN_EDEFAULT;
			case TOSDevicePackage.OUT_PIN_CONFIGURATION__GPIO:
				return gpio != GPIO_EDEFAULT;
			case TOSDevicePackage.OUT_PIN_CONFIGURATION__TYPE:
				return type != TYPE_EDEFAULT;
			case TOSDevicePackage.OUT_PIN_CONFIGURATION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
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
		result.append(" (pin: ");
		result.append(pin);
		result.append(", gpio: ");
		result.append(gpio);
		result.append(", type: ");
		result.append(type);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //OutPinConfigurationImpl
