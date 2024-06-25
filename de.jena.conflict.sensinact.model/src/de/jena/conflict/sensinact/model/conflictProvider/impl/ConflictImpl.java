/*
 */
package de.jena.conflict.sensinact.model.conflictProvider.impl;

import de.jena.conflict.sensinact.model.conflictProvider.Conflict;
import de.jena.conflict.sensinact.model.conflictProvider.ConflictPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conflict</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.conflict.sensinact.model.conflictProvider.impl.ConflictImpl#isConflict <em>Conflict</em>}</li>
 *   <li>{@link de.jena.conflict.sensinact.model.conflictProvider.impl.ConflictImpl#getBikeId <em>Bike Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConflictImpl extends ServiceImpl implements Conflict {
	/**
	 * The default value of the '{@link #isConflict() <em>Conflict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConflict()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFLICT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConflict() <em>Conflict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConflict()
	 * @generated
	 * @ordered
	 */
	protected boolean conflict = CONFLICT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBikeId() <em>Bike Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBikeId()
	 * @generated
	 * @ordered
	 */
	protected static final Long BIKE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBikeId() <em>Bike Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBikeId()
	 * @generated
	 * @ordered
	 */
	protected Long bikeId = BIKE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConflictPackage.Literals.CONFLICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConflict() {
		return conflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConflict(boolean newConflict) {
		boolean oldConflict = conflict;
		conflict = newConflict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConflictPackage.CONFLICT__CONFLICT, oldConflict, conflict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBikeId() {
		return bikeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBikeId(Long newBikeId) {
		Long oldBikeId = bikeId;
		bikeId = newBikeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConflictPackage.CONFLICT__BIKE_ID, oldBikeId, bikeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConflictPackage.CONFLICT__CONFLICT:
				return isConflict();
			case ConflictPackage.CONFLICT__BIKE_ID:
				return getBikeId();
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
			case ConflictPackage.CONFLICT__CONFLICT:
				setConflict((Boolean)newValue);
				return;
			case ConflictPackage.CONFLICT__BIKE_ID:
				setBikeId((Long)newValue);
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
			case ConflictPackage.CONFLICT__CONFLICT:
				setConflict(CONFLICT_EDEFAULT);
				return;
			case ConflictPackage.CONFLICT__BIKE_ID:
				setBikeId(BIKE_ID_EDEFAULT);
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
			case ConflictPackage.CONFLICT__CONFLICT:
				return conflict != CONFLICT_EDEFAULT;
			case ConflictPackage.CONFLICT__BIKE_ID:
				return BIKE_ID_EDEFAULT == null ? bikeId != null : !BIKE_ID_EDEFAULT.equals(bikeId);
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
		result.append(" (conflict: ");
		result.append(conflict);
		result.append(", bikeId: ");
		result.append(bikeId);
		result.append(')');
		return result.toString();
	}

} //ConflictImpl
