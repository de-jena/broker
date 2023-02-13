/*
 * Copyright (c) 2022 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion - initial API and implementation 
 */
package de.jena.sensinact.ocpp.structures;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.jena.sensinact.ocpp.structures.OcppStructuresFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
public interface OcppStructuresPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structures";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn://Ocpp/Cp/2015/10";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "structures";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OcppStructuresPackage eINSTANCE = de.jena.sensinact.ocpp.structures.impl.OcppStructuresPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.structures.impl.NotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.structures.impl.NotificationImpl
	 * @see de.jena.sensinact.ocpp.structures.impl.OcppStructuresPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Source id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__SOURCE_ID = 1;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.structures.impl.MeasurementNotificationImpl <em>Measurement Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.structures.impl.MeasurementNotificationImpl
	 * @see de.jena.sensinact.ocpp.structures.impl.OcppStructuresPackageImpl#getMeasurementNotification()
	 * @generated
	 */
	int MEASUREMENT_NOTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTIFICATION__TIMESTAMP = NOTIFICATION__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Source id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTIFICATION__SOURCE_ID = NOTIFICATION__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTIFICATION__VALUE = NOTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTIFICATION__UNIT = NOTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Measurement Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTIFICATION_FEATURE_COUNT = NOTIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Measurement Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_NOTIFICATION_OPERATION_COUNT = NOTIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.structures.impl.StateNotificationImpl <em>State Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.structures.impl.StateNotificationImpl
	 * @see de.jena.sensinact.ocpp.structures.impl.OcppStructuresPackageImpl#getStateNotification()
	 * @generated
	 */
	int STATE_NOTIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_NOTIFICATION__TIMESTAMP = NOTIFICATION__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Source id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_NOTIFICATION__SOURCE_ID = NOTIFICATION__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_NOTIFICATION__STATE = NOTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_NOTIFICATION_FEATURE_COUNT = NOTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_NOTIFICATION_OPERATION_COUNT = NOTIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.structures.State <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.structures.State
	 * @see de.jena.sensinact.ocpp.structures.impl.OcppStructuresPackageImpl#getState()
	 * @generated
	 */
	int STATE = 3;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.structures.Unit <em>Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.structures.Unit
	 * @see de.jena.sensinact.ocpp.structures.impl.OcppStructuresPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 4;


	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.structures.MeasurementNotification <em>Measurement Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Notification</em>'.
	 * @see de.jena.sensinact.ocpp.structures.MeasurementNotification
	 * @generated
	 */
	EClass getMeasurementNotification();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.structures.MeasurementNotification#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.sensinact.ocpp.structures.MeasurementNotification#getValue()
	 * @see #getMeasurementNotification()
	 * @generated
	 */
	EAttribute getMeasurementNotification_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.structures.MeasurementNotification#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.jena.sensinact.ocpp.structures.MeasurementNotification#getUnit()
	 * @see #getMeasurementNotification()
	 * @generated
	 */
	EAttribute getMeasurementNotification_Unit();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.structures.StateNotification <em>State Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Notification</em>'.
	 * @see de.jena.sensinact.ocpp.structures.StateNotification
	 * @generated
	 */
	EClass getStateNotification();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.structures.StateNotification#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.jena.sensinact.ocpp.structures.StateNotification#getState()
	 * @see #getStateNotification()
	 * @generated
	 */
	EAttribute getStateNotification_State();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.structures.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see de.jena.sensinact.ocpp.structures.Notification
	 * @generated
	 */
	EClass getNotification();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.structures.Notification#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.sensinact.ocpp.structures.Notification#getTimestamp()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.structures.Notification#getSource_id <em>Source id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source id</em>'.
	 * @see de.jena.sensinact.ocpp.structures.Notification#getSource_id()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Source_id();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.structures.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see de.jena.sensinact.ocpp.structures.State
	 * @generated
	 */
	EEnum getState();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.structures.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit</em>'.
	 * @see de.jena.sensinact.ocpp.structures.Unit
	 * @generated
	 */
	EEnum getUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OcppStructuresFactory getOcppStructuresFactory();

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
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.structures.impl.MeasurementNotificationImpl <em>Measurement Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.structures.impl.MeasurementNotificationImpl
		 * @see de.jena.sensinact.ocpp.structures.impl.OcppStructuresPackageImpl#getMeasurementNotification()
		 * @generated
		 */
		EClass MEASUREMENT_NOTIFICATION = eINSTANCE.getMeasurementNotification();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_NOTIFICATION__VALUE = eINSTANCE.getMeasurementNotification_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_NOTIFICATION__UNIT = eINSTANCE.getMeasurementNotification_Unit();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.structures.impl.StateNotificationImpl <em>State Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.structures.impl.StateNotificationImpl
		 * @see de.jena.sensinact.ocpp.structures.impl.OcppStructuresPackageImpl#getStateNotification()
		 * @generated
		 */
		EClass STATE_NOTIFICATION = eINSTANCE.getStateNotification();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_NOTIFICATION__STATE = eINSTANCE.getStateNotification_State();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.structures.impl.NotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.structures.impl.NotificationImpl
		 * @see de.jena.sensinact.ocpp.structures.impl.OcppStructuresPackageImpl#getNotification()
		 * @generated
		 */
		EClass NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__TIMESTAMP = eINSTANCE.getNotification_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Source id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__SOURCE_ID = eINSTANCE.getNotification_Source_id();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.structures.State <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.structures.State
		 * @see de.jena.sensinact.ocpp.structures.impl.OcppStructuresPackageImpl#getState()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.structures.Unit <em>Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.structures.Unit
		 * @see de.jena.sensinact.ocpp.structures.impl.OcppStructuresPackageImpl#getUnit()
		 * @generated
		 */
		EEnum UNIT = eINSTANCE.getUnit();

	}

} //OcppStructuresPackage
