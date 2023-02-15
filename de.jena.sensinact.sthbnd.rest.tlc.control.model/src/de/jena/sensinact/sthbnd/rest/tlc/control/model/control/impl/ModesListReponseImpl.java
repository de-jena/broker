/*
 */
package de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl;

import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.ModesListReponse;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modes List Reponse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.ModesListReponseImpl#getModes <em>Modes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModesListReponseImpl extends MinimalEObjectImpl.Container implements ModesListReponse {
	/**
	 * The cached value of the '{@link #getModes() <em>Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> modes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModesListReponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TlcControlPackage.eINSTANCE.getModesListReponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mode> getModes() {
		if (modes == null) {
			modes = new EObjectContainmentEList<Mode>(Mode.class, this, TlcControlPackage.MODES_LIST_REPONSE__MODES);
		}
		return modes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TlcControlPackage.MODES_LIST_REPONSE__MODES:
				return ((InternalEList<?>)getModes()).basicRemove(otherEnd, msgs);
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
			case TlcControlPackage.MODES_LIST_REPONSE__MODES:
				return getModes();
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
			case TlcControlPackage.MODES_LIST_REPONSE__MODES:
				getModes().clear();
				getModes().addAll((Collection<? extends Mode>)newValue);
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
			case TlcControlPackage.MODES_LIST_REPONSE__MODES:
				getModes().clear();
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
			case TlcControlPackage.MODES_LIST_REPONSE__MODES:
				return modes != null && !modes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModesListReponseImpl
