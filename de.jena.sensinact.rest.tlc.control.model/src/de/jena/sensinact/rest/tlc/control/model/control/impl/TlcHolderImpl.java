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
package de.jena.sensinact.rest.tlc.control.model.control.impl;

import de.jena.sensinact.rest.tlc.control.model.control.Control;
import de.jena.sensinact.rest.tlc.control.model.control.Phase;
import de.jena.sensinact.rest.tlc.control.model.control.Tlc;
import de.jena.sensinact.rest.tlc.control.model.control.TlcControlPackage;
import de.jena.sensinact.rest.tlc.control.model.control.TlcHolder;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tlc Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.rest.tlc.control.model.control.impl.TlcHolderImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.sensinact.rest.tlc.control.model.control.impl.TlcHolderImpl#getTlc <em>Tlc</em>}</li>
 *   <li>{@link de.jena.sensinact.rest.tlc.control.model.control.impl.TlcHolderImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link de.jena.sensinact.rest.tlc.control.model.control.impl.TlcHolderImpl#getCurrentControl <em>Current Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TlcHolderImpl extends MinimalEObjectImpl.Container implements TlcHolder {
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
	 * The cached value of the '{@link #getTlc() <em>Tlc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTlc()
	 * @generated
	 * @ordered
	 */
	protected Tlc tlc;

	/**
	 * The cached value of the '{@link #getPhases() <em>Phases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected EList<Phase> phases;

	/**
	 * The cached value of the '{@link #getCurrentControl() <em>Current Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentControl()
	 * @generated
	 * @ordered
	 */
	protected Control currentControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TlcHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TlcControlPackage.eINSTANCE.getTlcHolder();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TlcControlPackage.TLC_HOLDER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tlc getTlc() {
		return tlc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTlc(Tlc newTlc, NotificationChain msgs) {
		Tlc oldTlc = tlc;
		tlc = newTlc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TlcControlPackage.TLC_HOLDER__TLC, oldTlc, newTlc);
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
	public void setTlc(Tlc newTlc) {
		if (newTlc != tlc) {
			NotificationChain msgs = null;
			if (tlc != null)
				msgs = ((InternalEObject)tlc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TlcControlPackage.TLC_HOLDER__TLC, null, msgs);
			if (newTlc != null)
				msgs = ((InternalEObject)newTlc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TlcControlPackage.TLC_HOLDER__TLC, null, msgs);
			msgs = basicSetTlc(newTlc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TlcControlPackage.TLC_HOLDER__TLC, newTlc, newTlc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Phase> getPhases() {
		if (phases == null) {
			phases = new EObjectContainmentEList<Phase>(Phase.class, this, TlcControlPackage.TLC_HOLDER__PHASES);
		}
		return phases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Control getCurrentControl() {
		return currentControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentControl(Control newCurrentControl, NotificationChain msgs) {
		Control oldCurrentControl = currentControl;
		currentControl = newCurrentControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TlcControlPackage.TLC_HOLDER__CURRENT_CONTROL, oldCurrentControl, newCurrentControl);
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
	public void setCurrentControl(Control newCurrentControl) {
		if (newCurrentControl != currentControl) {
			NotificationChain msgs = null;
			if (currentControl != null)
				msgs = ((InternalEObject)currentControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TlcControlPackage.TLC_HOLDER__CURRENT_CONTROL, null, msgs);
			if (newCurrentControl != null)
				msgs = ((InternalEObject)newCurrentControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TlcControlPackage.TLC_HOLDER__CURRENT_CONTROL, null, msgs);
			msgs = basicSetCurrentControl(newCurrentControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TlcControlPackage.TLC_HOLDER__CURRENT_CONTROL, newCurrentControl, newCurrentControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TlcControlPackage.TLC_HOLDER__TLC:
				return basicSetTlc(null, msgs);
			case TlcControlPackage.TLC_HOLDER__PHASES:
				return ((InternalEList<?>)getPhases()).basicRemove(otherEnd, msgs);
			case TlcControlPackage.TLC_HOLDER__CURRENT_CONTROL:
				return basicSetCurrentControl(null, msgs);
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
			case TlcControlPackage.TLC_HOLDER__ID:
				return getId();
			case TlcControlPackage.TLC_HOLDER__TLC:
				return getTlc();
			case TlcControlPackage.TLC_HOLDER__PHASES:
				return getPhases();
			case TlcControlPackage.TLC_HOLDER__CURRENT_CONTROL:
				return getCurrentControl();
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
			case TlcControlPackage.TLC_HOLDER__ID:
				setId((String)newValue);
				return;
			case TlcControlPackage.TLC_HOLDER__TLC:
				setTlc((Tlc)newValue);
				return;
			case TlcControlPackage.TLC_HOLDER__PHASES:
				getPhases().clear();
				getPhases().addAll((Collection<? extends Phase>)newValue);
				return;
			case TlcControlPackage.TLC_HOLDER__CURRENT_CONTROL:
				setCurrentControl((Control)newValue);
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
			case TlcControlPackage.TLC_HOLDER__ID:
				setId(ID_EDEFAULT);
				return;
			case TlcControlPackage.TLC_HOLDER__TLC:
				setTlc((Tlc)null);
				return;
			case TlcControlPackage.TLC_HOLDER__PHASES:
				getPhases().clear();
				return;
			case TlcControlPackage.TLC_HOLDER__CURRENT_CONTROL:
				setCurrentControl((Control)null);
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
			case TlcControlPackage.TLC_HOLDER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TlcControlPackage.TLC_HOLDER__TLC:
				return tlc != null;
			case TlcControlPackage.TLC_HOLDER__PHASES:
				return phases != null && !phases.isEmpty();
			case TlcControlPackage.TLC_HOLDER__CURRENT_CONTROL:
				return currentControl != null;
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

} //TlcHolderImpl
