/*
 */
package de.dim.trafficos.intersection.model.intersection.impl;

import de.dim.trafficos.common.model.common.Output;

import de.dim.trafficos.intersection.model.intersection.ConflictingLane;
import de.dim.trafficos.intersection.model.intersection.Link;
import de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conflicting Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.ConflictingLaneImpl#getConflictingLane <em>Conflicting Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.ConflictingLaneImpl#getConflictingLink <em>Conflicting Link</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.ConflictingLaneImpl#getSignalGroup <em>Signal Group</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.ConflictingLaneImpl#getSignalGroups <em>Signal Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConflictingLaneImpl extends LaneImpl implements ConflictingLane {
	/**
	 * The cached value of the '{@link #getConflictingLane() <em>Conflicting Lane</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflictingLane()
	 * @generated
	 * @ordered
	 */
	protected EList<ConflictingLane> conflictingLane;

	/**
	 * The cached value of the '{@link #getConflictingLink() <em>Conflicting Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflictingLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> conflictingLink;

	/**
	 * The cached value of the '{@link #getSignalGroup() <em>Signal Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroup()
	 * @generated
	 * @ordered
	 */
	protected Output signalGroup;

	/**
	 * The cached value of the '{@link #getSignalGroups() <em>Signal Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> signalGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConflictingLaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSIntersectionPackage.eINSTANCE.getConflictingLane();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConflictingLane> getConflictingLane() {
		if (conflictingLane == null) {
			conflictingLane = new EObjectResolvingEList<ConflictingLane>(ConflictingLane.class, this, TOSIntersectionPackage.CONFLICTING_LANE__CONFLICTING_LANE);
		}
		return conflictingLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getConflictingLink() {
		if (conflictingLink == null) {
			conflictingLink = new EObjectResolvingEList<Link>(Link.class, this, TOSIntersectionPackage.CONFLICTING_LANE__CONFLICTING_LINK);
		}
		return conflictingLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output getSignalGroup() {
		if (signalGroup != null && signalGroup.eIsProxy()) {
			InternalEObject oldSignalGroup = (InternalEObject)signalGroup;
			signalGroup = (Output)eResolveProxy(oldSignalGroup);
			if (signalGroup != oldSignalGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TOSIntersectionPackage.CONFLICTING_LANE__SIGNAL_GROUP, oldSignalGroup, signalGroup));
			}
		}
		return signalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetSignalGroup() {
		return signalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignalGroup(Output newSignalGroup) {
		Output oldSignalGroup = signalGroup;
		signalGroup = newSignalGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.CONFLICTING_LANE__SIGNAL_GROUP, oldSignalGroup, signalGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getSignalGroups() {
		if (signalGroups == null) {
			signalGroups = new EObjectResolvingEList<Output>(Output.class, this, TOSIntersectionPackage.CONFLICTING_LANE__SIGNAL_GROUPS);
		}
		return signalGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSIntersectionPackage.CONFLICTING_LANE__CONFLICTING_LANE:
				return getConflictingLane();
			case TOSIntersectionPackage.CONFLICTING_LANE__CONFLICTING_LINK:
				return getConflictingLink();
			case TOSIntersectionPackage.CONFLICTING_LANE__SIGNAL_GROUP:
				if (resolve) return getSignalGroup();
				return basicGetSignalGroup();
			case TOSIntersectionPackage.CONFLICTING_LANE__SIGNAL_GROUPS:
				return getSignalGroups();
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
			case TOSIntersectionPackage.CONFLICTING_LANE__CONFLICTING_LANE:
				getConflictingLane().clear();
				getConflictingLane().addAll((Collection<? extends ConflictingLane>)newValue);
				return;
			case TOSIntersectionPackage.CONFLICTING_LANE__CONFLICTING_LINK:
				getConflictingLink().clear();
				getConflictingLink().addAll((Collection<? extends Link>)newValue);
				return;
			case TOSIntersectionPackage.CONFLICTING_LANE__SIGNAL_GROUP:
				setSignalGroup((Output)newValue);
				return;
			case TOSIntersectionPackage.CONFLICTING_LANE__SIGNAL_GROUPS:
				getSignalGroups().clear();
				getSignalGroups().addAll((Collection<? extends Output>)newValue);
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
			case TOSIntersectionPackage.CONFLICTING_LANE__CONFLICTING_LANE:
				getConflictingLane().clear();
				return;
			case TOSIntersectionPackage.CONFLICTING_LANE__CONFLICTING_LINK:
				getConflictingLink().clear();
				return;
			case TOSIntersectionPackage.CONFLICTING_LANE__SIGNAL_GROUP:
				setSignalGroup((Output)null);
				return;
			case TOSIntersectionPackage.CONFLICTING_LANE__SIGNAL_GROUPS:
				getSignalGroups().clear();
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
			case TOSIntersectionPackage.CONFLICTING_LANE__CONFLICTING_LANE:
				return conflictingLane != null && !conflictingLane.isEmpty();
			case TOSIntersectionPackage.CONFLICTING_LANE__CONFLICTING_LINK:
				return conflictingLink != null && !conflictingLink.isEmpty();
			case TOSIntersectionPackage.CONFLICTING_LANE__SIGNAL_GROUP:
				return signalGroup != null;
			case TOSIntersectionPackage.CONFLICTING_LANE__SIGNAL_GROUPS:
				return signalGroups != null && !signalGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConflictingLaneImpl
