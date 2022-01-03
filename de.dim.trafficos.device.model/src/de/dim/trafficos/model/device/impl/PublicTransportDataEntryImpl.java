/**
 */
package de.dim.trafficos.model.device.impl;

import de.dim.trafficos.model.device.PublicTransportDataEntry;
import de.dim.trafficos.model.device.PublicTransportDataValue;
import de.dim.trafficos.model.device.TOSDevicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Transport Data Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportDataEntryImpl#getDataValue <em>Data Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicTransportDataEntryImpl extends AbstractDataEntryImpl implements PublicTransportDataEntry {
	/**
	 * The cached value of the '{@link #getDataValue() <em>Data Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataValue()
	 * @generated
	 * @ordered
	 */
	protected EList<PublicTransportDataValue> dataValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicTransportDataEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.PUBLIC_TRANSPORT_DATA_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublicTransportDataValue> getDataValue() {
		if (dataValue == null) {
			dataValue = new EObjectContainmentEList<PublicTransportDataValue>(PublicTransportDataValue.class, this, TOSDevicePackage.PUBLIC_TRANSPORT_DATA_ENTRY__DATA_VALUE);
		}
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_ENTRY__DATA_VALUE:
				return ((InternalEList<?>)getDataValue()).basicRemove(otherEnd, msgs);
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_ENTRY__DATA_VALUE:
				return getDataValue();
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_ENTRY__DATA_VALUE:
				getDataValue().clear();
				getDataValue().addAll((Collection<? extends PublicTransportDataValue>)newValue);
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_ENTRY__DATA_VALUE:
				getDataValue().clear();
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_ENTRY__DATA_VALUE:
				return dataValue != null && !dataValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PublicTransportDataEntryImpl
