/*
 */
package de.dim.trafficos.intersection.model.intersection.impl;

import de.dim.trafficos.intersection.model.intersection.ConflictingLane;
import de.dim.trafficos.intersection.model.intersection.Phase;
import de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage;
import de.dim.trafficos.intersection.model.intersection.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.PhaseImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.PhaseImpl#getLane <em>Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.PhaseImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.PhaseImpl#getWeightMin <em>Weight Min</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.PhaseImpl#getWeightMax <em>Weight Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhaseImpl extends MinimalEObjectImpl.Container implements Phase {
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
	 * The cached value of the '{@link #getLane() <em>Lane</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLane()
	 * @generated
	 * @ordered
	 */
	protected EList<ConflictingLane> lane;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The default value of the '{@link #getWeightMin() <em>Weight Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightMin()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeightMin() <em>Weight Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightMin()
	 * @generated
	 * @ordered
	 */
	protected int weightMin = WEIGHT_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeightMax() <em>Weight Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightMax()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeightMax() <em>Weight Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightMax()
	 * @generated
	 * @ordered
	 */
	protected int weightMax = WEIGHT_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSIntersectionPackage.eINSTANCE.getPhase();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.PHASE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConflictingLane> getLane() {
		if (lane == null) {
			lane = new EObjectResolvingEList<ConflictingLane>(ConflictingLane.class, this, TOSIntersectionPackage.PHASE__LANE);
		}
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this, TOSIntersectionPackage.PHASE__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWeightMin() {
		return weightMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightMin(int newWeightMin) {
		int oldWeightMin = weightMin;
		weightMin = newWeightMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.PHASE__WEIGHT_MIN, oldWeightMin, weightMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWeightMax() {
		return weightMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightMax(int newWeightMax) {
		int oldWeightMax = weightMax;
		weightMax = newWeightMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.PHASE__WEIGHT_MAX, oldWeightMax, weightMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSIntersectionPackage.PHASE__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
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
			case TOSIntersectionPackage.PHASE__ID:
				return getId();
			case TOSIntersectionPackage.PHASE__LANE:
				return getLane();
			case TOSIntersectionPackage.PHASE__TRANSITION:
				return getTransition();
			case TOSIntersectionPackage.PHASE__WEIGHT_MIN:
				return getWeightMin();
			case TOSIntersectionPackage.PHASE__WEIGHT_MAX:
				return getWeightMax();
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
			case TOSIntersectionPackage.PHASE__ID:
				setId((String)newValue);
				return;
			case TOSIntersectionPackage.PHASE__LANE:
				getLane().clear();
				getLane().addAll((Collection<? extends ConflictingLane>)newValue);
				return;
			case TOSIntersectionPackage.PHASE__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case TOSIntersectionPackage.PHASE__WEIGHT_MIN:
				setWeightMin((Integer)newValue);
				return;
			case TOSIntersectionPackage.PHASE__WEIGHT_MAX:
				setWeightMax((Integer)newValue);
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
			case TOSIntersectionPackage.PHASE__ID:
				setId(ID_EDEFAULT);
				return;
			case TOSIntersectionPackage.PHASE__LANE:
				getLane().clear();
				return;
			case TOSIntersectionPackage.PHASE__TRANSITION:
				getTransition().clear();
				return;
			case TOSIntersectionPackage.PHASE__WEIGHT_MIN:
				setWeightMin(WEIGHT_MIN_EDEFAULT);
				return;
			case TOSIntersectionPackage.PHASE__WEIGHT_MAX:
				setWeightMax(WEIGHT_MAX_EDEFAULT);
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
			case TOSIntersectionPackage.PHASE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TOSIntersectionPackage.PHASE__LANE:
				return lane != null && !lane.isEmpty();
			case TOSIntersectionPackage.PHASE__TRANSITION:
				return transition != null && !transition.isEmpty();
			case TOSIntersectionPackage.PHASE__WEIGHT_MIN:
				return weightMin != WEIGHT_MIN_EDEFAULT;
			case TOSIntersectionPackage.PHASE__WEIGHT_MAX:
				return weightMax != WEIGHT_MAX_EDEFAULT;
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
		result.append(", weightMin: ");
		result.append(weightMin);
		result.append(", weightMax: ");
		result.append(weightMax);
		result.append(')');
		return result.toString();
	}

} //PhaseImpl
