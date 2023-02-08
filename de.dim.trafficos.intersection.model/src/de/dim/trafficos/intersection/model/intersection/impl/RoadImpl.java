/*
 */
package de.dim.trafficos.intersection.model.intersection.impl;

import de.dim.trafficos.intersection.model.intersection.CycleLane;
import de.dim.trafficos.intersection.model.intersection.IncomingLane;
import de.dim.trafficos.intersection.model.intersection.OutgoingLane;
import de.dim.trafficos.intersection.model.intersection.PedestrianLane;
import de.dim.trafficos.intersection.model.intersection.PublicTransportLane;
import de.dim.trafficos.intersection.model.intersection.Road;
import de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage;

import de.dim.trafficos.trafficlight.model.trafficlight.TLModule;

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
 * An implementation of the model object '<em><b>Road</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.RoadImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.RoadImpl#isMainRoad <em>Main Road</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.RoadImpl#getIncomingLane <em>Incoming Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.RoadImpl#getOutgoingLane <em>Outgoing Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.RoadImpl#getPedestrianLane <em>Pedestrian Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.RoadImpl#getCycleLane <em>Cycle Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.RoadImpl#getPublicTransportLane <em>Public Transport Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.RoadImpl#getTrafficLightModule <em>Traffic Light Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoadImpl extends MinimalEObjectImpl.Container implements Road {
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
	 * The default value of the '{@link #isMainRoad() <em>Main Road</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMainRoad()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAIN_ROAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMainRoad() <em>Main Road</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMainRoad()
	 * @generated
	 * @ordered
	 */
	protected boolean mainRoad = MAIN_ROAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomingLane() <em>Incoming Lane</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingLane()
	 * @generated
	 * @ordered
	 */
	protected EList<IncomingLane> incomingLane;

	/**
	 * The cached value of the '{@link #getOutgoingLane() <em>Outgoing Lane</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingLane()
	 * @generated
	 * @ordered
	 */
	protected EList<OutgoingLane> outgoingLane;

	/**
	 * The cached value of the '{@link #getPedestrianLane() <em>Pedestrian Lane</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPedestrianLane()
	 * @generated
	 * @ordered
	 */
	protected EList<PedestrianLane> pedestrianLane;

	/**
	 * The cached value of the '{@link #getCycleLane() <em>Cycle Lane</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleLane()
	 * @generated
	 * @ordered
	 */
	protected EList<CycleLane> cycleLane;

	/**
	 * The cached value of the '{@link #getPublicTransportLane() <em>Public Transport Lane</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicTransportLane()
	 * @generated
	 * @ordered
	 */
	protected EList<PublicTransportLane> publicTransportLane;

	/**
	 * The cached value of the '{@link #getTrafficLightModule() <em>Traffic Light Module</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficLightModule()
	 * @generated
	 * @ordered
	 */
	protected EList<TLModule> trafficLightModule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSIntersectionPackage.eINSTANCE.getRoad();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.ROAD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMainRoad() {
		return mainRoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMainRoad(boolean newMainRoad) {
		boolean oldMainRoad = mainRoad;
		mainRoad = newMainRoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.ROAD__MAIN_ROAD, oldMainRoad, mainRoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IncomingLane> getIncomingLane() {
		if (incomingLane == null) {
			incomingLane = new EObjectContainmentEList<IncomingLane>(IncomingLane.class, this, TOSIntersectionPackage.ROAD__INCOMING_LANE);
		}
		return incomingLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutgoingLane> getOutgoingLane() {
		if (outgoingLane == null) {
			outgoingLane = new EObjectContainmentEList<OutgoingLane>(OutgoingLane.class, this, TOSIntersectionPackage.ROAD__OUTGOING_LANE);
		}
		return outgoingLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PedestrianLane> getPedestrianLane() {
		if (pedestrianLane == null) {
			pedestrianLane = new EObjectContainmentEList<PedestrianLane>(PedestrianLane.class, this, TOSIntersectionPackage.ROAD__PEDESTRIAN_LANE);
		}
		return pedestrianLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CycleLane> getCycleLane() {
		if (cycleLane == null) {
			cycleLane = new EObjectContainmentEList<CycleLane>(CycleLane.class, this, TOSIntersectionPackage.ROAD__CYCLE_LANE);
		}
		return cycleLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublicTransportLane> getPublicTransportLane() {
		if (publicTransportLane == null) {
			publicTransportLane = new EObjectContainmentEList<PublicTransportLane>(PublicTransportLane.class, this, TOSIntersectionPackage.ROAD__PUBLIC_TRANSPORT_LANE);
		}
		return publicTransportLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLModule> getTrafficLightModule() {
		if (trafficLightModule == null) {
			trafficLightModule = new EObjectResolvingEList<TLModule>(TLModule.class, this, TOSIntersectionPackage.ROAD__TRAFFIC_LIGHT_MODULE);
		}
		return trafficLightModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSIntersectionPackage.ROAD__INCOMING_LANE:
				return ((InternalEList<?>)getIncomingLane()).basicRemove(otherEnd, msgs);
			case TOSIntersectionPackage.ROAD__OUTGOING_LANE:
				return ((InternalEList<?>)getOutgoingLane()).basicRemove(otherEnd, msgs);
			case TOSIntersectionPackage.ROAD__PEDESTRIAN_LANE:
				return ((InternalEList<?>)getPedestrianLane()).basicRemove(otherEnd, msgs);
			case TOSIntersectionPackage.ROAD__CYCLE_LANE:
				return ((InternalEList<?>)getCycleLane()).basicRemove(otherEnd, msgs);
			case TOSIntersectionPackage.ROAD__PUBLIC_TRANSPORT_LANE:
				return ((InternalEList<?>)getPublicTransportLane()).basicRemove(otherEnd, msgs);
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
			case TOSIntersectionPackage.ROAD__ID:
				return getId();
			case TOSIntersectionPackage.ROAD__MAIN_ROAD:
				return isMainRoad();
			case TOSIntersectionPackage.ROAD__INCOMING_LANE:
				return getIncomingLane();
			case TOSIntersectionPackage.ROAD__OUTGOING_LANE:
				return getOutgoingLane();
			case TOSIntersectionPackage.ROAD__PEDESTRIAN_LANE:
				return getPedestrianLane();
			case TOSIntersectionPackage.ROAD__CYCLE_LANE:
				return getCycleLane();
			case TOSIntersectionPackage.ROAD__PUBLIC_TRANSPORT_LANE:
				return getPublicTransportLane();
			case TOSIntersectionPackage.ROAD__TRAFFIC_LIGHT_MODULE:
				return getTrafficLightModule();
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
			case TOSIntersectionPackage.ROAD__ID:
				setId((String)newValue);
				return;
			case TOSIntersectionPackage.ROAD__MAIN_ROAD:
				setMainRoad((Boolean)newValue);
				return;
			case TOSIntersectionPackage.ROAD__INCOMING_LANE:
				getIncomingLane().clear();
				getIncomingLane().addAll((Collection<? extends IncomingLane>)newValue);
				return;
			case TOSIntersectionPackage.ROAD__OUTGOING_LANE:
				getOutgoingLane().clear();
				getOutgoingLane().addAll((Collection<? extends OutgoingLane>)newValue);
				return;
			case TOSIntersectionPackage.ROAD__PEDESTRIAN_LANE:
				getPedestrianLane().clear();
				getPedestrianLane().addAll((Collection<? extends PedestrianLane>)newValue);
				return;
			case TOSIntersectionPackage.ROAD__CYCLE_LANE:
				getCycleLane().clear();
				getCycleLane().addAll((Collection<? extends CycleLane>)newValue);
				return;
			case TOSIntersectionPackage.ROAD__PUBLIC_TRANSPORT_LANE:
				getPublicTransportLane().clear();
				getPublicTransportLane().addAll((Collection<? extends PublicTransportLane>)newValue);
				return;
			case TOSIntersectionPackage.ROAD__TRAFFIC_LIGHT_MODULE:
				getTrafficLightModule().clear();
				getTrafficLightModule().addAll((Collection<? extends TLModule>)newValue);
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
			case TOSIntersectionPackage.ROAD__ID:
				setId(ID_EDEFAULT);
				return;
			case TOSIntersectionPackage.ROAD__MAIN_ROAD:
				setMainRoad(MAIN_ROAD_EDEFAULT);
				return;
			case TOSIntersectionPackage.ROAD__INCOMING_LANE:
				getIncomingLane().clear();
				return;
			case TOSIntersectionPackage.ROAD__OUTGOING_LANE:
				getOutgoingLane().clear();
				return;
			case TOSIntersectionPackage.ROAD__PEDESTRIAN_LANE:
				getPedestrianLane().clear();
				return;
			case TOSIntersectionPackage.ROAD__CYCLE_LANE:
				getCycleLane().clear();
				return;
			case TOSIntersectionPackage.ROAD__PUBLIC_TRANSPORT_LANE:
				getPublicTransportLane().clear();
				return;
			case TOSIntersectionPackage.ROAD__TRAFFIC_LIGHT_MODULE:
				getTrafficLightModule().clear();
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
			case TOSIntersectionPackage.ROAD__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TOSIntersectionPackage.ROAD__MAIN_ROAD:
				return mainRoad != MAIN_ROAD_EDEFAULT;
			case TOSIntersectionPackage.ROAD__INCOMING_LANE:
				return incomingLane != null && !incomingLane.isEmpty();
			case TOSIntersectionPackage.ROAD__OUTGOING_LANE:
				return outgoingLane != null && !outgoingLane.isEmpty();
			case TOSIntersectionPackage.ROAD__PEDESTRIAN_LANE:
				return pedestrianLane != null && !pedestrianLane.isEmpty();
			case TOSIntersectionPackage.ROAD__CYCLE_LANE:
				return cycleLane != null && !cycleLane.isEmpty();
			case TOSIntersectionPackage.ROAD__PUBLIC_TRANSPORT_LANE:
				return publicTransportLane != null && !publicTransportLane.isEmpty();
			case TOSIntersectionPackage.ROAD__TRAFFIC_LIGHT_MODULE:
				return trafficLightModule != null && !trafficLightModule.isEmpty();
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
		result.append(", mainRoad: ");
		result.append(mainRoad);
		result.append(')');
		return result.toString();
	}

} //RoadImpl
