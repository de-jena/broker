/*
 */
package de.jena.model.ttn.impl;

import de.jena.model.ttn.DataRate;
import de.jena.model.ttn.Lora;
import de.jena.model.ttn.TTNPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.ttn.impl.DataRateImpl#getLora <em>Lora</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataRateImpl extends MinimalEObjectImpl.Container implements DataRate {
	/**
	 * The cached value of the '{@link #getLora() <em>Lora</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLora()
	 * @generated
	 * @ordered
	 */
	protected Lora lora;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTNPackage.eINSTANCE.getDataRate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lora getLora() {
		return lora;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLora(Lora newLora, NotificationChain msgs) {
		Lora oldLora = lora;
		lora = newLora;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTNPackage.DATA_RATE__LORA, oldLora, newLora);
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
	public void setLora(Lora newLora) {
		if (newLora != lora) {
			NotificationChain msgs = null;
			if (lora != null)
				msgs = ((InternalEObject)lora).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTNPackage.DATA_RATE__LORA, null, msgs);
			if (newLora != null)
				msgs = ((InternalEObject)newLora).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTNPackage.DATA_RATE__LORA, null, msgs);
			msgs = basicSetLora(newLora, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.DATA_RATE__LORA, newLora, newLora));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TTNPackage.DATA_RATE__LORA:
				return basicSetLora(null, msgs);
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
			case TTNPackage.DATA_RATE__LORA:
				return getLora();
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
			case TTNPackage.DATA_RATE__LORA:
				setLora((Lora)newValue);
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
			case TTNPackage.DATA_RATE__LORA:
				setLora((Lora)null);
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
			case TTNPackage.DATA_RATE__LORA:
				return lora != null;
		}
		return super.eIsSet(featureID);
	}

} //DataRateImpl
