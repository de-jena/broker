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
package de.jena.model.sensinact.ttnprovider.impl;

import de.jena.model.sensinact.ttnprovider.AbstractTtnProvider;
import de.jena.model.sensinact.ttnprovider.GatewayData;
import de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Ttn Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.impl.AbstractTtnProviderImpl#getGateway <em>Gateway</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractTtnProviderImpl extends ProviderImpl implements AbstractTtnProvider {
	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected GatewayData gateway;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTtnProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TtnSensorSensinactPackage.eINSTANCE.getAbstractTtnProvider();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewayData getGateway() {
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGateway(GatewayData newGateway, NotificationChain msgs) {
		GatewayData oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TtnSensorSensinactPackage.ABSTRACT_TTN_PROVIDER__GATEWAY, oldGateway, newGateway);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGateway(GatewayData newGateway) {
		if (newGateway != gateway) {
			NotificationChain msgs = null;
			if (gateway != null)
				msgs = ((InternalEObject)gateway).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TtnSensorSensinactPackage.ABSTRACT_TTN_PROVIDER__GATEWAY, null, msgs);
			if (newGateway != null)
				msgs = ((InternalEObject)newGateway).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TtnSensorSensinactPackage.ABSTRACT_TTN_PROVIDER__GATEWAY, null, msgs);
			msgs = basicSetGateway(newGateway, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtnSensorSensinactPackage.ABSTRACT_TTN_PROVIDER__GATEWAY, newGateway, newGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TtnSensorSensinactPackage.ABSTRACT_TTN_PROVIDER__GATEWAY:
				return basicSetGateway(null, msgs);
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
			case TtnSensorSensinactPackage.ABSTRACT_TTN_PROVIDER__GATEWAY:
				return getGateway();
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
			case TtnSensorSensinactPackage.ABSTRACT_TTN_PROVIDER__GATEWAY:
				setGateway((GatewayData)newValue);
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
			case TtnSensorSensinactPackage.ABSTRACT_TTN_PROVIDER__GATEWAY:
				setGateway((GatewayData)null);
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
			case TtnSensorSensinactPackage.ABSTRACT_TTN_PROVIDER__GATEWAY:
				return gateway != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractTtnProviderImpl
