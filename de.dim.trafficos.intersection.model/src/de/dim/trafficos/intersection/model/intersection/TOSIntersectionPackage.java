/*
 */
package de.dim.trafficos.intersection.model.intersection;

import de.dim.trafficos.common.model.common.TOSCommonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
public interface TOSIntersectionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "intersection";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://datainmotion.de/trafficos/intersection/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "intersection";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TOSIntersectionPackage eINSTANCE = de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.IntersectionImpl <em>Intersection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.IntersectionImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getIntersection()
	 * @generated
	 */
	int INTERSECTION = 0;

	/**
	 * The feature id for the '<em><b>Road</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__ROAD = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__LINK = 1;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__PHASE = 2;

	/**
	 * The feature id for the '<em><b>Phase Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__PHASE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Time Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__TIME_TABLE = 4;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__OUTPUT = 5;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__PROGRAM = 6;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__STATE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__NAME = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__DESCRIPTION = 10;

	/**
	 * The number of structural features of the '<em>Intersection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Intersection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.RoadImpl <em>Road</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.RoadImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getRoad()
	 * @generated
	 */
	int ROAD = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__ID = 0;

	/**
	 * The feature id for the '<em><b>Main Road</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__MAIN_ROAD = 1;

	/**
	 * The feature id for the '<em><b>Incoming Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__INCOMING_LANE = 2;

	/**
	 * The feature id for the '<em><b>Outgoing Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__OUTGOING_LANE = 3;

	/**
	 * The feature id for the '<em><b>Pedestrian Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__PEDESTRIAN_LANE = 4;

	/**
	 * The feature id for the '<em><b>Cycle Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__CYCLE_LANE = 5;

	/**
	 * The feature id for the '<em><b>Public Transport Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__PUBLIC_TRANSPORT_LANE = 6;

	/**
	 * The feature id for the '<em><b>Traffic Light Module</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__TRAFFIC_LIGHT_MODULE = 7;

	/**
	 * The number of structural features of the '<em>Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.LaneImpl <em>Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.LaneImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getLane()
	 * @generated
	 */
	int LANE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__ID = 0;

	/**
	 * The feature id for the '<em><b>Ref Road Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__REF_ROAD_ID = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__LINK = 2;

	/**
	 * The feature id for the '<em><b>Road</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__ROAD = 3;

	/**
	 * The feature id for the '<em><b>Sub Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__SUB_LANE = 4;

	/**
	 * The feature id for the '<em><b>Parent Lane</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__PARENT_LANE = 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__INDEX = 6;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__DIRECTION = 7;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__DETECTOR = 8;

	/**
	 * The number of structural features of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.ConflictingLaneImpl <em>Conflicting Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.ConflictingLaneImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getConflictingLane()
	 * @generated
	 */
	int CONFLICTING_LANE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__ID = LANE__ID;

	/**
	 * The feature id for the '<em><b>Ref Road Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__REF_ROAD_ID = LANE__REF_ROAD_ID;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__LINK = LANE__LINK;

	/**
	 * The feature id for the '<em><b>Road</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__ROAD = LANE__ROAD;

	/**
	 * The feature id for the '<em><b>Sub Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__SUB_LANE = LANE__SUB_LANE;

	/**
	 * The feature id for the '<em><b>Parent Lane</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__PARENT_LANE = LANE__PARENT_LANE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__INDEX = LANE__INDEX;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__DIRECTION = LANE__DIRECTION;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__DETECTOR = LANE__DETECTOR;

	/**
	 * The feature id for the '<em><b>Conflicting Lane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__CONFLICTING_LANE = LANE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conflicting Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__CONFLICTING_LINK = LANE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__SIGNAL_GROUP = LANE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signal Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__SIGNAL_GROUPS = LANE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Conflicting Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE_FEATURE_COUNT = LANE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Conflicting Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE_OPERATION_COUNT = LANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.IncomingLaneImpl <em>Incoming Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.IncomingLaneImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getIncomingLane()
	 * @generated
	 */
	int INCOMING_LANE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__ID = CONFLICTING_LANE__ID;

	/**
	 * The feature id for the '<em><b>Ref Road Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__REF_ROAD_ID = CONFLICTING_LANE__REF_ROAD_ID;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__LINK = CONFLICTING_LANE__LINK;

	/**
	 * The feature id for the '<em><b>Road</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__ROAD = CONFLICTING_LANE__ROAD;

	/**
	 * The feature id for the '<em><b>Sub Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__SUB_LANE = CONFLICTING_LANE__SUB_LANE;

	/**
	 * The feature id for the '<em><b>Parent Lane</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__PARENT_LANE = CONFLICTING_LANE__PARENT_LANE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__INDEX = CONFLICTING_LANE__INDEX;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__DIRECTION = CONFLICTING_LANE__DIRECTION;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__DETECTOR = CONFLICTING_LANE__DETECTOR;

	/**
	 * The feature id for the '<em><b>Conflicting Lane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__CONFLICTING_LANE = CONFLICTING_LANE__CONFLICTING_LANE;

	/**
	 * The feature id for the '<em><b>Conflicting Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__CONFLICTING_LINK = CONFLICTING_LANE__CONFLICTING_LINK;

	/**
	 * The feature id for the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__SIGNAL_GROUP = CONFLICTING_LANE__SIGNAL_GROUP;

	/**
	 * The feature id for the '<em><b>Signal Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__SIGNAL_GROUPS = CONFLICTING_LANE__SIGNAL_GROUPS;

	/**
	 * The number of structural features of the '<em>Incoming Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE_FEATURE_COUNT = CONFLICTING_LANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Incoming Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE_OPERATION_COUNT = CONFLICTING_LANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.OutgoingLaneImpl <em>Outgoing Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.OutgoingLaneImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getOutgoingLane()
	 * @generated
	 */
	int OUTGOING_LANE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__ID = LANE__ID;

	/**
	 * The feature id for the '<em><b>Ref Road Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__REF_ROAD_ID = LANE__REF_ROAD_ID;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__LINK = LANE__LINK;

	/**
	 * The feature id for the '<em><b>Road</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__ROAD = LANE__ROAD;

	/**
	 * The feature id for the '<em><b>Sub Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__SUB_LANE = LANE__SUB_LANE;

	/**
	 * The feature id for the '<em><b>Parent Lane</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__PARENT_LANE = LANE__PARENT_LANE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__INDEX = LANE__INDEX;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__DIRECTION = LANE__DIRECTION;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__DETECTOR = LANE__DETECTOR;

	/**
	 * The number of structural features of the '<em>Outgoing Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE_FEATURE_COUNT = LANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Outgoing Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE_OPERATION_COUNT = LANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.PedestrianLaneImpl <em>Pedestrian Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.PedestrianLaneImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getPedestrianLane()
	 * @generated
	 */
	int PEDESTRIAN_LANE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__ID = CONFLICTING_LANE__ID;

	/**
	 * The feature id for the '<em><b>Ref Road Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__REF_ROAD_ID = CONFLICTING_LANE__REF_ROAD_ID;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__LINK = CONFLICTING_LANE__LINK;

	/**
	 * The feature id for the '<em><b>Road</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__ROAD = CONFLICTING_LANE__ROAD;

	/**
	 * The feature id for the '<em><b>Sub Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__SUB_LANE = CONFLICTING_LANE__SUB_LANE;

	/**
	 * The feature id for the '<em><b>Parent Lane</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__PARENT_LANE = CONFLICTING_LANE__PARENT_LANE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__INDEX = CONFLICTING_LANE__INDEX;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__DIRECTION = CONFLICTING_LANE__DIRECTION;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__DETECTOR = CONFLICTING_LANE__DETECTOR;

	/**
	 * The feature id for the '<em><b>Conflicting Lane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__CONFLICTING_LANE = CONFLICTING_LANE__CONFLICTING_LANE;

	/**
	 * The feature id for the '<em><b>Conflicting Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__CONFLICTING_LINK = CONFLICTING_LANE__CONFLICTING_LINK;

	/**
	 * The feature id for the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__SIGNAL_GROUP = CONFLICTING_LANE__SIGNAL_GROUP;

	/**
	 * The feature id for the '<em><b>Signal Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__SIGNAL_GROUPS = CONFLICTING_LANE__SIGNAL_GROUPS;

	/**
	 * The number of structural features of the '<em>Pedestrian Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE_FEATURE_COUNT = CONFLICTING_LANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pedestrian Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE_OPERATION_COUNT = CONFLICTING_LANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.PublicTransportLaneImpl <em>Public Transport Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.PublicTransportLaneImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getPublicTransportLane()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_LANE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__ID = CONFLICTING_LANE__ID;

	/**
	 * The feature id for the '<em><b>Ref Road Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__REF_ROAD_ID = CONFLICTING_LANE__REF_ROAD_ID;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__LINK = CONFLICTING_LANE__LINK;

	/**
	 * The feature id for the '<em><b>Road</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__ROAD = CONFLICTING_LANE__ROAD;

	/**
	 * The feature id for the '<em><b>Sub Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__SUB_LANE = CONFLICTING_LANE__SUB_LANE;

	/**
	 * The feature id for the '<em><b>Parent Lane</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__PARENT_LANE = CONFLICTING_LANE__PARENT_LANE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__INDEX = CONFLICTING_LANE__INDEX;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__DIRECTION = CONFLICTING_LANE__DIRECTION;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__DETECTOR = CONFLICTING_LANE__DETECTOR;

	/**
	 * The feature id for the '<em><b>Conflicting Lane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__CONFLICTING_LANE = CONFLICTING_LANE__CONFLICTING_LANE;

	/**
	 * The feature id for the '<em><b>Conflicting Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__CONFLICTING_LINK = CONFLICTING_LANE__CONFLICTING_LINK;

	/**
	 * The feature id for the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__SIGNAL_GROUP = CONFLICTING_LANE__SIGNAL_GROUP;

	/**
	 * The feature id for the '<em><b>Signal Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__SIGNAL_GROUPS = CONFLICTING_LANE__SIGNAL_GROUPS;

	/**
	 * The number of structural features of the '<em>Public Transport Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE_FEATURE_COUNT = CONFLICTING_LANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Public Transport Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE_OPERATION_COUNT = CONFLICTING_LANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.CycleLaneImpl <em>Cycle Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.CycleLaneImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getCycleLane()
	 * @generated
	 */
	int CYCLE_LANE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__ID = CONFLICTING_LANE__ID;

	/**
	 * The feature id for the '<em><b>Ref Road Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__REF_ROAD_ID = CONFLICTING_LANE__REF_ROAD_ID;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__LINK = CONFLICTING_LANE__LINK;

	/**
	 * The feature id for the '<em><b>Road</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__ROAD = CONFLICTING_LANE__ROAD;

	/**
	 * The feature id for the '<em><b>Sub Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__SUB_LANE = CONFLICTING_LANE__SUB_LANE;

	/**
	 * The feature id for the '<em><b>Parent Lane</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__PARENT_LANE = CONFLICTING_LANE__PARENT_LANE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__INDEX = CONFLICTING_LANE__INDEX;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__DIRECTION = CONFLICTING_LANE__DIRECTION;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__DETECTOR = CONFLICTING_LANE__DETECTOR;

	/**
	 * The feature id for the '<em><b>Conflicting Lane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__CONFLICTING_LANE = CONFLICTING_LANE__CONFLICTING_LANE;

	/**
	 * The feature id for the '<em><b>Conflicting Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__CONFLICTING_LINK = CONFLICTING_LANE__CONFLICTING_LINK;

	/**
	 * The feature id for the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__SIGNAL_GROUP = CONFLICTING_LANE__SIGNAL_GROUP;

	/**
	 * The feature id for the '<em><b>Signal Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__SIGNAL_GROUPS = CONFLICTING_LANE__SIGNAL_GROUPS;

	/**
	 * The number of structural features of the '<em>Cycle Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE_FEATURE_COUNT = CONFLICTING_LANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cycle Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE_OPERATION_COUNT = CONFLICTING_LANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.LinkImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 9;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Ref Incoming Lane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REF_INCOMING_LANE = 1;

	/**
	 * The feature id for the '<em><b>Ref Outgoing Lane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REF_OUTGOING_LANE = 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.PhaseImpl <em>Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.PhaseImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getPhase()
	 * @generated
	 */
	int PHASE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__ID = 0;

	/**
	 * The feature id for the '<em><b>Lane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__LANE = 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Weight Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__WEIGHT_MIN = 3;

	/**
	 * The feature id for the '<em><b>Weight Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__WEIGHT_MAX = 4;

	/**
	 * The number of structural features of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.ProgramEntryImpl <em>Program Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.ProgramEntryImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getProgramEntry()
	 * @generated
	 */
	int PROGRAM_ENTRY = 11;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRY__BEGIN = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRY__END = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRY__DURATION = 2;

	/**
	 * The feature id for the '<em><b>Ref Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRY__REF_PHASE = 3;

	/**
	 * The number of structural features of the '<em>Program Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Program Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.ProgramImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ID = TOSCommonPackage.ID_NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = TOSCommonPackage.ID_NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__LENGTH = TOSCommonPackage.ID_NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__OUTPUT_ENTRY = TOSCommonPackage.ID_NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signal Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SIGNAL_TABLE = TOSCommonPackage.ID_NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = TOSCommonPackage.ID_NAME_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = TOSCommonPackage.ID_NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TransitionImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 13;

	/**
	 * The feature id for the '<em><b>Ref Next Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__REF_NEXT_PHASE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = 1;

	/**
	 * The feature id for the '<em><b>Unchanged Lane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__UNCHANGED_LANE = 2;

	/**
	 * The feature id for the '<em><b>Changed Lane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CHANGED_LANE = 3;

	/**
	 * The feature id for the '<em><b>Clear Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CLEAR_AREA = 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.ProgramTransitionImpl <em>Program Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.ProgramTransitionImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getProgramTransition()
	 * @generated
	 */
	int PROGRAM_TRANSITION = 14;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TRANSITION__BEGIN = PROGRAM_ENTRY__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TRANSITION__END = PROGRAM_ENTRY__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TRANSITION__DURATION = PROGRAM_ENTRY__DURATION;

	/**
	 * The feature id for the '<em><b>Ref Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TRANSITION__REF_PHASE = PROGRAM_ENTRY__REF_PHASE;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TRANSITION__TRANSITION = PROGRAM_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TRANSITION_FEATURE_COUNT = PROGRAM_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Program Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TRANSITION_OPERATION_COUNT = PROGRAM_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.ClearAreaImpl <em>Clear Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.ClearAreaImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getClearArea()
	 * @generated
	 */
	int CLEAR_AREA = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_AREA__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Clear Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_AREA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Clear Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_AREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.PhaseGroupImpl <em>Phase Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.PhaseGroupImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getPhaseGroup()
	 * @generated
	 */
	int PHASE_GROUP = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_GROUP__ID = 0;

	/**
	 * The feature id for the '<em><b>Penalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_GROUP__PENALTY = 1;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_GROUP__PHASE = 2;

	/**
	 * The number of structural features of the '<em>Phase Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Phase Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.TimeTableImpl <em>Time Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TimeTableImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getTimeTable()
	 * @generated
	 */
	int TIME_TABLE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE__ID = TOSCommonPackage.ID_NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE__NAME = TOSCommonPackage.ID_NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE__ENTRY = TOSCommonPackage.ID_NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE__DEFAULT_MODE = TOSCommonPackage.ID_NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_FEATURE_COUNT = TOSCommonPackage.ID_NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Time Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_OPERATION_COUNT = TOSCommonPackage.ID_NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.TimeTableEntryImpl <em>Time Table Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TimeTableEntryImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getTimeTableEntry()
	 * @generated
	 */
	int TIME_TABLE_ENTRY = 18;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_ENTRY__INDEX = TOSCommonPackage.ABSTRACT_TIME_TABLE_ENTRY__INDEX;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_ENTRY__MODE = TOSCommonPackage.ABSTRACT_TIME_TABLE_ENTRY__MODE;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_ENTRY__BEGIN = TOSCommonPackage.ABSTRACT_TIME_TABLE_ENTRY__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_ENTRY__END = TOSCommonPackage.ABSTRACT_TIME_TABLE_ENTRY__END;

	/**
	 * The feature id for the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_ENTRY__PROGRAM = TOSCommonPackage.ABSTRACT_TIME_TABLE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Table Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_ENTRY_FEATURE_COUNT = TOSCommonPackage.ABSTRACT_TIME_TABLE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Table Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_ENTRY_OPERATION_COUNT = TOSCommonPackage.ABSTRACT_TIME_TABLE_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.SignalTableImpl <em>Signal Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.SignalTableImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getSignalTable()
	 * @generated
	 */
	int SIGNAL_TABLE = 19;

	/**
	 * The feature id for the '<em><b>Cache Data Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TABLE__CACHE_DATA_ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Signal Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Signal Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.impl.CacheDataEntryImpl <em>Cache Data Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.impl.CacheDataEntryImpl
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getCacheDataEntry()
	 * @generated
	 */
	int CACHE_DATA_ENTRY = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_ENTRY__ID = TOSCommonPackage.DATA_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_ENTRY__TIMESTAMP = TOSCommonPackage.DATA_ENTRY__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_ENTRY__INDEX = TOSCommonPackage.DATA_ENTRY__INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_ENTRY__VALUE = TOSCommonPackage.DATA_ENTRY__VALUE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_ENTRY__CONFIGURATION = TOSCommonPackage.DATA_ENTRY__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_ENTRY__DEVICE = TOSCommonPackage.DATA_ENTRY__DEVICE;

	/**
	 * The number of structural features of the '<em>Cache Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_ENTRY_FEATURE_COUNT = TOSCommonPackage.DATA_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cache Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_ENTRY_OPERATION_COUNT = TOSCommonPackage.DATA_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.TimeTableModeType <em>Time Table Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.TimeTableModeType
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getTimeTableModeType()
	 * @generated
	 */
	int TIME_TABLE_MODE_TYPE = 21;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.IntersectionStateType <em>Intersection State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.IntersectionStateType
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getIntersectionStateType()
	 * @generated
	 */
	int INTERSECTION_STATE_TYPE = 22;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersection.model.intersection.ClearAreaType <em>Clear Area Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersection.model.intersection.ClearAreaType
	 * @see de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionPackageImpl#getClearAreaType()
	 * @generated
	 */
	int CLEAR_AREA_TYPE = 23;


	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.Intersection <em>Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intersection</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Intersection
	 * @generated
	 */
	EClass getIntersection();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.Intersection#getRoad <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Road</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Intersection#getRoad()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_Road();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.Intersection#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Intersection#getLink()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.Intersection#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phase</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Intersection#getPhase()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_Phase();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.Intersection#getPhaseGroup <em>Phase Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phase Group</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Intersection#getPhaseGroup()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_PhaseGroup();

	/**
	 * Returns the meta object for the containment reference '{@link de.dim.trafficos.intersection.model.intersection.Intersection#getTimeTable <em>Time Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Table</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Intersection#getTimeTable()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_TimeTable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.Intersection#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Intersection#getOutput()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.Intersection#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Program</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Intersection#getProgram()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_Program();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.Intersection#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Intersection#getParameter()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.Intersection#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Intersection#getState()
	 * @see #getIntersection()
	 * @generated
	 */
	EAttribute getIntersection_State();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.Intersection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Intersection#getName()
	 * @see #getIntersection()
	 * @generated
	 */
	EAttribute getIntersection_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.Intersection#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Intersection#getDescription()
	 * @see #getIntersection()
	 * @generated
	 */
	EAttribute getIntersection_Description();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.Road <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Road</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Road
	 * @generated
	 */
	EClass getRoad();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.Road#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Road#getId()
	 * @see #getRoad()
	 * @generated
	 */
	EAttribute getRoad_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.Road#isMainRoad <em>Main Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Road</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Road#isMainRoad()
	 * @see #getRoad()
	 * @generated
	 */
	EAttribute getRoad_MainRoad();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.Road#getIncomingLane <em>Incoming Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incoming Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Road#getIncomingLane()
	 * @see #getRoad()
	 * @generated
	 */
	EReference getRoad_IncomingLane();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.Road#getOutgoingLane <em>Outgoing Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Road#getOutgoingLane()
	 * @see #getRoad()
	 * @generated
	 */
	EReference getRoad_OutgoingLane();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.Road#getPedestrianLane <em>Pedestrian Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pedestrian Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Road#getPedestrianLane()
	 * @see #getRoad()
	 * @generated
	 */
	EReference getRoad_PedestrianLane();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.Road#getCycleLane <em>Cycle Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cycle Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Road#getCycleLane()
	 * @see #getRoad()
	 * @generated
	 */
	EReference getRoad_CycleLane();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.Road#getPublicTransportLane <em>Public Transport Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Public Transport Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Road#getPublicTransportLane()
	 * @see #getRoad()
	 * @generated
	 */
	EReference getRoad_PublicTransportLane();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.intersection.model.intersection.Road#getTrafficLightModule <em>Traffic Light Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traffic Light Module</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Road#getTrafficLightModule()
	 * @see #getRoad()
	 * @generated
	 */
	EReference getRoad_TrafficLightModule();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Lane
	 * @generated
	 */
	EClass getLane();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.Lane#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Lane#getId()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.Lane#getRefRoadId <em>Ref Road Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Road Id</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Lane#getRefRoadId()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_RefRoadId();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.intersection.model.intersection.Lane#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Link</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Lane#getLink()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_Link();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.intersection.model.intersection.Lane#getRoad <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Road</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Lane#getRoad()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_Road();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.Lane#getSubLane <em>Sub Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Lane#getSubLane()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_SubLane();

	/**
	 * Returns the meta object for the container reference '{@link de.dim.trafficos.intersection.model.intersection.Lane#getParentLane <em>Parent Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Lane#getParentLane()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_ParentLane();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.Lane#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Lane#getIndex()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_Index();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.Lane#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Lane#getDirection()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_Direction();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.intersection.model.intersection.Lane#getDetector <em>Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Detector</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Lane#getDetector()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_Detector();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.ConflictingLane <em>Conflicting Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflicting Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.ConflictingLane
	 * @generated
	 */
	EClass getConflictingLane();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.intersection.model.intersection.ConflictingLane#getConflictingLane <em>Conflicting Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conflicting Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.ConflictingLane#getConflictingLane()
	 * @see #getConflictingLane()
	 * @generated
	 */
	EReference getConflictingLane_ConflictingLane();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.intersection.model.intersection.ConflictingLane#getConflictingLink <em>Conflicting Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conflicting Link</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.ConflictingLane#getConflictingLink()
	 * @see #getConflictingLane()
	 * @generated
	 */
	EReference getConflictingLane_ConflictingLink();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.intersection.model.intersection.ConflictingLane#getSignalGroup <em>Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Group</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.ConflictingLane#getSignalGroup()
	 * @see #getConflictingLane()
	 * @generated
	 */
	EReference getConflictingLane_SignalGroup();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.intersection.model.intersection.ConflictingLane#getSignalGroups <em>Signal Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signal Groups</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.ConflictingLane#getSignalGroups()
	 * @see #getConflictingLane()
	 * @generated
	 */
	EReference getConflictingLane_SignalGroups();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.IncomingLane <em>Incoming Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incoming Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.IncomingLane
	 * @generated
	 */
	EClass getIncomingLane();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.OutgoingLane <em>Outgoing Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outgoing Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.OutgoingLane
	 * @generated
	 */
	EClass getOutgoingLane();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.PedestrianLane <em>Pedestrian Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pedestrian Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.PedestrianLane
	 * @generated
	 */
	EClass getPedestrianLane();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.PublicTransportLane <em>Public Transport Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.PublicTransportLane
	 * @generated
	 */
	EClass getPublicTransportLane();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.CycleLane <em>Cycle Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cycle Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.CycleLane
	 * @generated
	 */
	EClass getCycleLane();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.Link#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Link#getIndex()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Index();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.intersection.model.intersection.Link#getRefIncomingLane <em>Ref Incoming Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Incoming Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Link#getRefIncomingLane()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_RefIncomingLane();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.intersection.model.intersection.Link#getRefOutgoingLane <em>Ref Outgoing Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Outgoing Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Link#getRefOutgoingLane()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_RefOutgoingLane();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Phase
	 * @generated
	 */
	EClass getPhase();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.Phase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Phase#getId()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Id();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.intersection.model.intersection.Phase#getLane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Phase#getLane()
	 * @see #getPhase()
	 * @generated
	 */
	EReference getPhase_Lane();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.Phase#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Phase#getTransition()
	 * @see #getPhase()
	 * @generated
	 */
	EReference getPhase_Transition();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.Phase#getWeightMin <em>Weight Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight Min</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Phase#getWeightMin()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_WeightMin();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.Phase#getWeightMax <em>Weight Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight Max</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Phase#getWeightMax()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_WeightMax();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.ProgramEntry <em>Program Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Entry</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.ProgramEntry
	 * @generated
	 */
	EClass getProgramEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.ProgramEntry#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.ProgramEntry#getBegin()
	 * @see #getProgramEntry()
	 * @generated
	 */
	EAttribute getProgramEntry_Begin();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.ProgramEntry#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.ProgramEntry#getEnd()
	 * @see #getProgramEntry()
	 * @generated
	 */
	EAttribute getProgramEntry_End();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.ProgramEntry#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.ProgramEntry#getDuration()
	 * @see #getProgramEntry()
	 * @generated
	 */
	EAttribute getProgramEntry_Duration();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.intersection.model.intersection.ProgramEntry#getRefPhase <em>Ref Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Phase</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.ProgramEntry#getRefPhase()
	 * @see #getProgramEntry()
	 * @generated
	 */
	EReference getProgramEntry_RefPhase();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.Program#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Program#getLength()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Length();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.Program#getOutputEntry <em>Output Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Entry</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Program#getOutputEntry()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_OutputEntry();

	/**
	 * Returns the meta object for the containment reference '{@link de.dim.trafficos.intersection.model.intersection.Program#getSignalTable <em>Signal Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Table</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Program#getSignalTable()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_SignalTable();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.intersection.model.intersection.Transition#getRefNextPhase <em>Ref Next Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Next Phase</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Transition#getRefNextPhase()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_RefNextPhase();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.Transition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Transition#getId()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Id();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.intersection.model.intersection.Transition#getUnchangedLane <em>Unchanged Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unchanged Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Transition#getUnchangedLane()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_UnchangedLane();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.intersection.model.intersection.Transition#getChangedLane <em>Changed Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changed Lane</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Transition#getChangedLane()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ChangedLane();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.Transition#getClearArea <em>Clear Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clear Area</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.Transition#getClearArea()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ClearArea();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.ProgramTransition <em>Program Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Transition</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.ProgramTransition
	 * @generated
	 */
	EClass getProgramTransition();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.intersection.model.intersection.ProgramTransition#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.ProgramTransition#getTransition()
	 * @see #getProgramTransition()
	 * @generated
	 */
	EReference getProgramTransition_Transition();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.ClearArea <em>Clear Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Area</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.ClearArea
	 * @generated
	 */
	EClass getClearArea();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.ClearArea#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.ClearArea#getType()
	 * @see #getClearArea()
	 * @generated
	 */
	EAttribute getClearArea_Type();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.PhaseGroup <em>Phase Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Group</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.PhaseGroup
	 * @generated
	 */
	EClass getPhaseGroup();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.PhaseGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.PhaseGroup#getId()
	 * @see #getPhaseGroup()
	 * @generated
	 */
	EAttribute getPhaseGroup_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.PhaseGroup#getPenalty <em>Penalty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penalty</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.PhaseGroup#getPenalty()
	 * @see #getPhaseGroup()
	 * @generated
	 */
	EAttribute getPhaseGroup_Penalty();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.intersection.model.intersection.PhaseGroup#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Phase</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.PhaseGroup#getPhase()
	 * @see #getPhaseGroup()
	 * @generated
	 */
	EReference getPhaseGroup_Phase();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.TimeTable <em>Time Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Table</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.TimeTable
	 * @generated
	 */
	EClass getTimeTable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.TimeTable#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.TimeTable#getEntry()
	 * @see #getTimeTable()
	 * @generated
	 */
	EReference getTimeTable_Entry();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersection.model.intersection.TimeTable#getDefaultMode <em>Default Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Mode</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.TimeTable#getDefaultMode()
	 * @see #getTimeTable()
	 * @generated
	 */
	EAttribute getTimeTable_DefaultMode();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.TimeTableEntry <em>Time Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Table Entry</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.TimeTableEntry
	 * @generated
	 */
	EClass getTimeTableEntry();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.intersection.model.intersection.TimeTableEntry#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.TimeTableEntry#getProgram()
	 * @see #getTimeTableEntry()
	 * @generated
	 */
	EReference getTimeTableEntry_Program();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.SignalTable <em>Signal Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Table</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.SignalTable
	 * @generated
	 */
	EClass getSignalTable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.intersection.model.intersection.SignalTable#getCacheDataEntry <em>Cache Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cache Data Entry</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.SignalTable#getCacheDataEntry()
	 * @see #getSignalTable()
	 * @generated
	 */
	EReference getSignalTable_CacheDataEntry();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersection.model.intersection.CacheDataEntry <em>Cache Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache Data Entry</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.CacheDataEntry
	 * @generated
	 */
	EClass getCacheDataEntry();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.intersection.model.intersection.TimeTableModeType <em>Time Table Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Table Mode Type</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.TimeTableModeType
	 * @generated
	 */
	EEnum getTimeTableModeType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.intersection.model.intersection.IntersectionStateType <em>Intersection State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Intersection State Type</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.IntersectionStateType
	 * @generated
	 */
	EEnum getIntersectionStateType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.intersection.model.intersection.ClearAreaType <em>Clear Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clear Area Type</em>'.
	 * @see de.dim.trafficos.intersection.model.intersection.ClearAreaType
	 * @generated
	 */
	EEnum getClearAreaType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TOSIntersectionFactory getTOSIntersectionFactory();

} //TOSIntersectionPackage
