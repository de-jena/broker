/*
 */
package de.dim.trafficos.intersection.model.intersection.impl;

import de.dim.trafficos.intersection.model.intersection.Phase;
import de.dim.trafficos.intersection.model.intersection.PhaseGroup;
import de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.PhaseGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.PhaseGroupImpl#getPenalty <em>Penalty</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.PhaseGroupImpl#getPhase <em>Phase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhaseGroupImpl extends MinimalEObjectImpl.Container implements PhaseGroup {
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
	 * The default value of the '{@link #getPenalty() <em>Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalty()
	 * @generated
	 * @ordered
	 */
	protected static final int PENALTY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPenalty() <em>Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalty()
	 * @generated
	 * @ordered
	 */
	protected int penalty = PENALTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected EList<Phase> phase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaseGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSIntersectionPackage.eINSTANCE.getPhaseGroup();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.PHASE_GROUP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPenalty() {
		return penalty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPenalty(int newPenalty) {
		int oldPenalty = penalty;
		penalty = newPenalty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.PHASE_GROUP__PENALTY, oldPenalty, penalty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Phase> getPhase() {
		if (phase == null) {
			phase = new EObjectResolvingEList<Phase>(Phase.class, this, TOSIntersectionPackage.PHASE_GROUP__PHASE);
		}
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSIntersectionPackage.PHASE_GROUP__ID:
				return getId();
			case TOSIntersectionPackage.PHASE_GROUP__PENALTY:
				return getPenalty();
			case TOSIntersectionPackage.PHASE_GROUP__PHASE:
				return getPhase();
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
			case TOSIntersectionPackage.PHASE_GROUP__ID:
				setId((String)newValue);
				return;
			case TOSIntersectionPackage.PHASE_GROUP__PENALTY:
				setPenalty((Integer)newValue);
				return;
			case TOSIntersectionPackage.PHASE_GROUP__PHASE:
				getPhase().clear();
				getPhase().addAll((Collection<? extends Phase>)newValue);
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
			case TOSIntersectionPackage.PHASE_GROUP__ID:
				setId(ID_EDEFAULT);
				return;
			case TOSIntersectionPackage.PHASE_GROUP__PENALTY:
				setPenalty(PENALTY_EDEFAULT);
				return;
			case TOSIntersectionPackage.PHASE_GROUP__PHASE:
				getPhase().clear();
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
			case TOSIntersectionPackage.PHASE_GROUP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TOSIntersectionPackage.PHASE_GROUP__PENALTY:
				return penalty != PENALTY_EDEFAULT;
			case TOSIntersectionPackage.PHASE_GROUP__PHASE:
				return phase != null && !phase.isEmpty();
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
		result.append(", penalty: ");
		result.append(penalty);
		result.append(')');
		return result.toString();
	}

} //PhaseGroupImpl
