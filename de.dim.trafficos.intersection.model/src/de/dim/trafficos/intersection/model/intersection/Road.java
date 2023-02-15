/*
 */
package de.dim.trafficos.intersection.model.intersection;

import de.dim.trafficos.trafficlight.model.trafficlight.TLModule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Road</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Road#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Road#isMainRoad <em>Main Road</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Road#getType <em>Type</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Road#getIncomingLane <em>Incoming Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Road#getOutgoingLane <em>Outgoing Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Road#getPedestrianLane <em>Pedestrian Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Road#getCycleLane <em>Cycle Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Road#getPublicTransportLane <em>Public Transport Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Road#getTrafficLightModule <em>Traffic Light Module</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getRoad()
 * @model
 * @generated
 */
@ProviderType
public interface Road extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getRoad_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.Road#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Main Road</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Road</em>' attribute.
	 * @see #setMainRoad(boolean)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getRoad_MainRoad()
	 * @model required="true"
	 * @generated
	 */
	boolean isMainRoad();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.Road#isMainRoad <em>Main Road</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Road</em>' attribute.
	 * @see #isMainRoad()
	 * @generated
	 */
	void setMainRoad(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.intersection.model.intersection.RoadType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dim.trafficos.intersection.model.intersection.RoadType
	 * @see #setType(RoadType)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getRoad_Type()
	 * @model
	 * @generated
	 */
	RoadType getType();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.Road#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dim.trafficos.intersection.model.intersection.RoadType
	 * @see #getType()
	 * @generated
	 */
	void setType(RoadType value);

	/**
	 * Returns the value of the '<em><b>Incoming Lane</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.IncomingLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Lane</em>' containment reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getRoad_IncomingLane()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<IncomingLane> getIncomingLane();

	/**
	 * Returns the value of the '<em><b>Outgoing Lane</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.OutgoingLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Lane</em>' containment reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getRoad_OutgoingLane()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<OutgoingLane> getOutgoingLane();

	/**
	 * Returns the value of the '<em><b>Pedestrian Lane</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.PedestrianLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedestrian Lane</em>' containment reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getRoad_PedestrianLane()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<PedestrianLane> getPedestrianLane();

	/**
	 * Returns the value of the '<em><b>Cycle Lane</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.CycleLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle Lane</em>' containment reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getRoad_CycleLane()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<CycleLane> getCycleLane();

	/**
	 * Returns the value of the '<em><b>Public Transport Lane</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.PublicTransportLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Transport Lane</em>' containment reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getRoad_PublicTransportLane()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<PublicTransportLane> getPublicTransportLane();

	/**
	 * Returns the value of the '<em><b>Traffic Light Module</b></em>' reference list.
	 * The list contents are of type {@link de.dim.trafficos.trafficlight.model.trafficlight.TLModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traffic Light Module</em>' reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getRoad_TrafficLightModule()
	 * @model
	 * @generated
	 */
	EList<TLModule> getTrafficLightModule();

} // Road
