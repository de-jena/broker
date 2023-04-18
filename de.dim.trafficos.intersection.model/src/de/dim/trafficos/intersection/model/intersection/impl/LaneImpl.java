/*
 */
package de.dim.trafficos.intersection.model.intersection.impl;

import de.dim.trafficos.common.model.common.DirectionType;
import de.dim.trafficos.common.model.common.Output;

import de.dim.trafficos.intersection.model.intersection.Lane;
import de.dim.trafficos.intersection.model.intersection.Link;
import de.dim.trafficos.intersection.model.intersection.Road;
import de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.LaneImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.LaneImpl#getRefRoadId <em>Ref Road Id</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.LaneImpl#getLink <em>Link</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.LaneImpl#getRoad <em>Road</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.LaneImpl#getSubLane <em>Sub Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.LaneImpl#getParentLane <em>Parent Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.LaneImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.LaneImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.LaneImpl#getDetector <em>Detector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LaneImpl extends MinimalEObjectImpl.Container implements Lane {
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
	 * The default value of the '{@link #getRefRoadId() <em>Ref Road Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefRoadId()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_ROAD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefRoadId() <em>Ref Road Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefRoadId()
	 * @generated
	 * @ordered
	 */
	protected String refRoadId = REF_ROAD_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The cached value of the '{@link #getRoad() <em>Road</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoad()
	 * @generated
	 * @ordered
	 */
	protected Road road;

	/**
	 * The cached value of the '{@link #getSubLane() <em>Sub Lane</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubLane()
	 * @generated
	 * @ordered
	 */
	protected EList<Lane> subLane;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionType DIRECTION_EDEFAULT = DirectionType.STRAIGHT;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected DirectionType direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetector() <em>Detector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetector()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> detector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSIntersectionPackage.eINSTANCE.getLane();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.LANE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRefRoadId() {
		return refRoadId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefRoadId(String newRefRoadId) {
		String oldRefRoadId = refRoadId;
		refRoadId = newRefRoadId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.LANE__REF_ROAD_ID, oldRefRoadId, refRoadId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectResolvingEList<Link>(Link.class, this, TOSIntersectionPackage.LANE__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Road getRoad() {
		if (road != null && road.eIsProxy()) {
			InternalEObject oldRoad = (InternalEObject)road;
			road = (Road)eResolveProxy(oldRoad);
			if (road != oldRoad) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TOSIntersectionPackage.LANE__ROAD, oldRoad, road));
			}
		}
		return road;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Road basicGetRoad() {
		return road;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoad(Road newRoad) {
		Road oldRoad = road;
		road = newRoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.LANE__ROAD, oldRoad, road));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Lane> getSubLane() {
		if (subLane == null) {
			subLane = new EObjectContainmentWithInverseEList<Lane>(Lane.class, this, TOSIntersectionPackage.LANE__SUB_LANE, TOSIntersectionPackage.LANE__PARENT_LANE);
		}
		return subLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lane getParentLane() {
		if (eContainerFeatureID() != TOSIntersectionPackage.LANE__PARENT_LANE) return null;
		return (Lane)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentLane(Lane newParentLane, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentLane, TOSIntersectionPackage.LANE__PARENT_LANE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentLane(Lane newParentLane) {
		if (newParentLane != eInternalContainer() || (eContainerFeatureID() != TOSIntersectionPackage.LANE__PARENT_LANE && newParentLane != null)) {
			if (EcoreUtil.isAncestor(this, newParentLane))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentLane != null)
				msgs = ((InternalEObject)newParentLane).eInverseAdd(this, TOSIntersectionPackage.LANE__SUB_LANE, Lane.class, msgs);
			msgs = basicSetParentLane(newParentLane, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.LANE__PARENT_LANE, newParentLane, newParentLane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.LANE__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectionType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(DirectionType newDirection) {
		DirectionType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.LANE__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getDetector() {
		if (detector == null) {
			detector = new EObjectResolvingEList<Output>(Output.class, this, TOSIntersectionPackage.LANE__DETECTOR);
		}
		return detector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSIntersectionPackage.LANE__SUB_LANE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubLane()).basicAdd(otherEnd, msgs);
			case TOSIntersectionPackage.LANE__PARENT_LANE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentLane((Lane)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSIntersectionPackage.LANE__SUB_LANE:
				return ((InternalEList<?>)getSubLane()).basicRemove(otherEnd, msgs);
			case TOSIntersectionPackage.LANE__PARENT_LANE:
				return basicSetParentLane(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TOSIntersectionPackage.LANE__PARENT_LANE:
				return eInternalContainer().eInverseRemove(this, TOSIntersectionPackage.LANE__SUB_LANE, Lane.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSIntersectionPackage.LANE__ID:
				return getId();
			case TOSIntersectionPackage.LANE__REF_ROAD_ID:
				return getRefRoadId();
			case TOSIntersectionPackage.LANE__LINK:
				return getLink();
			case TOSIntersectionPackage.LANE__ROAD:
				if (resolve) return getRoad();
				return basicGetRoad();
			case TOSIntersectionPackage.LANE__SUB_LANE:
				return getSubLane();
			case TOSIntersectionPackage.LANE__PARENT_LANE:
				return getParentLane();
			case TOSIntersectionPackage.LANE__INDEX:
				return getIndex();
			case TOSIntersectionPackage.LANE__DIRECTION:
				return getDirection();
			case TOSIntersectionPackage.LANE__DETECTOR:
				return getDetector();
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
			case TOSIntersectionPackage.LANE__ID:
				setId((String)newValue);
				return;
			case TOSIntersectionPackage.LANE__REF_ROAD_ID:
				setRefRoadId((String)newValue);
				return;
			case TOSIntersectionPackage.LANE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case TOSIntersectionPackage.LANE__ROAD:
				setRoad((Road)newValue);
				return;
			case TOSIntersectionPackage.LANE__SUB_LANE:
				getSubLane().clear();
				getSubLane().addAll((Collection<? extends Lane>)newValue);
				return;
			case TOSIntersectionPackage.LANE__PARENT_LANE:
				setParentLane((Lane)newValue);
				return;
			case TOSIntersectionPackage.LANE__INDEX:
				setIndex((Integer)newValue);
				return;
			case TOSIntersectionPackage.LANE__DIRECTION:
				setDirection((DirectionType)newValue);
				return;
			case TOSIntersectionPackage.LANE__DETECTOR:
				getDetector().clear();
				getDetector().addAll((Collection<? extends Output>)newValue);
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
			case TOSIntersectionPackage.LANE__ID:
				setId(ID_EDEFAULT);
				return;
			case TOSIntersectionPackage.LANE__REF_ROAD_ID:
				setRefRoadId(REF_ROAD_ID_EDEFAULT);
				return;
			case TOSIntersectionPackage.LANE__LINK:
				getLink().clear();
				return;
			case TOSIntersectionPackage.LANE__ROAD:
				setRoad((Road)null);
				return;
			case TOSIntersectionPackage.LANE__SUB_LANE:
				getSubLane().clear();
				return;
			case TOSIntersectionPackage.LANE__PARENT_LANE:
				setParentLane((Lane)null);
				return;
			case TOSIntersectionPackage.LANE__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case TOSIntersectionPackage.LANE__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case TOSIntersectionPackage.LANE__DETECTOR:
				getDetector().clear();
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
			case TOSIntersectionPackage.LANE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TOSIntersectionPackage.LANE__REF_ROAD_ID:
				return REF_ROAD_ID_EDEFAULT == null ? refRoadId != null : !REF_ROAD_ID_EDEFAULT.equals(refRoadId);
			case TOSIntersectionPackage.LANE__LINK:
				return link != null && !link.isEmpty();
			case TOSIntersectionPackage.LANE__ROAD:
				return road != null;
			case TOSIntersectionPackage.LANE__SUB_LANE:
				return subLane != null && !subLane.isEmpty();
			case TOSIntersectionPackage.LANE__PARENT_LANE:
				return getParentLane() != null;
			case TOSIntersectionPackage.LANE__INDEX:
				return index != INDEX_EDEFAULT;
			case TOSIntersectionPackage.LANE__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case TOSIntersectionPackage.LANE__DETECTOR:
				return detector != null && !detector.isEmpty();
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
		result.append(", refRoadId: ");
		result.append(refRoadId);
		result.append(", index: ");
		result.append(index);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //LaneImpl
