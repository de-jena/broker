/*
 */
package de.dim.trafficos.intersectionsystem.model.intersectionsystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
public interface TOSIntersectionSystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "intersectionsystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://datainmotion.de/trafficos/intersectionsystem/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "intersectionsystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TOSIntersectionSystemPackage eINSTANCE = de.dim.trafficos.intersectionsystem.model.intersectionsystem.impl.TOSIntersectionSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.impl.IntersectionSystemImpl <em>Intersection System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.impl.IntersectionSystemImpl
	 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.impl.TOSIntersectionSystemPackageImpl#getIntersectionSystem()
	 * @generated
	 */
	int INTERSECTION_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_SYSTEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Intersection Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_SYSTEM__INTERSECTION_ID = 1;

	/**
	 * The feature id for the '<em><b>Intersection Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_SYSTEM__INTERSECTION_NAME = 2;

	/**
	 * The feature id for the '<em><b>Tl Module Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_SYSTEM__TL_MODULE_IDS = 3;

	/**
	 * The feature id for the '<em><b>Detector Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_SYSTEM__DETECTOR_IDS = 4;

	/**
	 * The number of structural features of the '<em>Intersection System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_SYSTEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Intersection System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_SYSTEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem <em>Intersection System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intersection System</em>'.
	 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem
	 * @generated
	 */
	EClass getIntersectionSystem();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getId()
	 * @see #getIntersectionSystem()
	 * @generated
	 */
	EAttribute getIntersectionSystem_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getIntersectionId <em>Intersection Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intersection Id</em>'.
	 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getIntersectionId()
	 * @see #getIntersectionSystem()
	 * @generated
	 */
	EAttribute getIntersectionSystem_IntersectionId();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getIntersectionName <em>Intersection Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intersection Name</em>'.
	 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getIntersectionName()
	 * @see #getIntersectionSystem()
	 * @generated
	 */
	EAttribute getIntersectionSystem_IntersectionName();

	/**
	 * Returns the meta object for the attribute list '{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getTlModuleIds <em>Tl Module Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tl Module Ids</em>'.
	 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getTlModuleIds()
	 * @see #getIntersectionSystem()
	 * @generated
	 */
	EAttribute getIntersectionSystem_TlModuleIds();

	/**
	 * Returns the meta object for the attribute list '{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getDetectorIds <em>Detector Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Detector Ids</em>'.
	 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getDetectorIds()
	 * @see #getIntersectionSystem()
	 * @generated
	 */
	EAttribute getIntersectionSystem_DetectorIds();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TOSIntersectionSystemFactory getTOSIntersectionSystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.impl.IntersectionSystemImpl <em>Intersection System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.impl.IntersectionSystemImpl
		 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.impl.TOSIntersectionSystemPackageImpl#getIntersectionSystem()
		 * @generated
		 */
		EClass INTERSECTION_SYSTEM = eINSTANCE.getIntersectionSystem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERSECTION_SYSTEM__ID = eINSTANCE.getIntersectionSystem_Id();

		/**
		 * The meta object literal for the '<em><b>Intersection Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERSECTION_SYSTEM__INTERSECTION_ID = eINSTANCE.getIntersectionSystem_IntersectionId();

		/**
		 * The meta object literal for the '<em><b>Intersection Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERSECTION_SYSTEM__INTERSECTION_NAME = eINSTANCE.getIntersectionSystem_IntersectionName();

		/**
		 * The meta object literal for the '<em><b>Tl Module Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERSECTION_SYSTEM__TL_MODULE_IDS = eINSTANCE.getIntersectionSystem_TlModuleIds();

		/**
		 * The meta object literal for the '<em><b>Detector Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERSECTION_SYSTEM__DETECTOR_IDS = eINSTANCE.getIntersectionSystem_DetectorIds();

	}

} //TOSIntersectionSystemPackage
