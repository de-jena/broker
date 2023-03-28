/**
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
package de.jena.sensinact.ocpp.structures.impl;

import de.jena.sensinact.ocpp.structures.MeasurementNotification;
import de.jena.sensinact.ocpp.structures.Notification;
import de.jena.sensinact.ocpp.structures.OcppStructuresFactory;
import de.jena.sensinact.ocpp.structures.OcppStructuresPackage;
import de.jena.sensinact.ocpp.structures.State;
import de.jena.sensinact.ocpp.structures.StateNotification;
import de.jena.sensinact.ocpp.structures.Unit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OcppStructuresPackageImpl extends EPackageImpl implements OcppStructuresPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.jena.sensinact.ocpp.structures.OcppStructuresPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OcppStructuresPackageImpl() {
		super(eNS_URI, OcppStructuresFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OcppStructuresPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OcppStructuresPackage init() {
		if (isInited) return (OcppStructuresPackage)EPackage.Registry.INSTANCE.getEPackage(OcppStructuresPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOcppStructuresPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OcppStructuresPackageImpl theOcppStructuresPackage = registeredOcppStructuresPackage instanceof OcppStructuresPackageImpl ? (OcppStructuresPackageImpl)registeredOcppStructuresPackage : new OcppStructuresPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOcppStructuresPackage.createPackageContents();

		// Initialize created meta-data
		theOcppStructuresPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOcppStructuresPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OcppStructuresPackage.eNS_URI, theOcppStructuresPackage);
		return theOcppStructuresPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasurementNotification() {
		return measurementNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementNotification_Value() {
		return (EAttribute)measurementNotificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasurementNotification_Unit() {
		return (EAttribute)measurementNotificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateNotification() {
		return stateNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateNotification_State() {
		return (EAttribute)stateNotificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotification() {
		return notificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotification_Timestamp() {
		return (EAttribute)notificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotification_Source_id() {
		return (EAttribute)notificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getState() {
		return stateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnit() {
		return unitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OcppStructuresFactory getOcppStructuresFactory() {
		return (OcppStructuresFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		measurementNotificationEClass = createEClass(MEASUREMENT_NOTIFICATION);
		createEAttribute(measurementNotificationEClass, MEASUREMENT_NOTIFICATION__VALUE);
		createEAttribute(measurementNotificationEClass, MEASUREMENT_NOTIFICATION__UNIT);

		stateNotificationEClass = createEClass(STATE_NOTIFICATION);
		createEAttribute(stateNotificationEClass, STATE_NOTIFICATION__STATE);

		notificationEClass = createEClass(NOTIFICATION);
		createEAttribute(notificationEClass, NOTIFICATION__TIMESTAMP);
		createEAttribute(notificationEClass, NOTIFICATION__SOURCE_ID);

		// Create enums
		stateEEnum = createEEnum(STATE);
		unitEEnum = createEEnum(UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		measurementNotificationEClass.getESuperTypes().add(this.getNotification());
		stateNotificationEClass.getESuperTypes().add(this.getNotification());

		// Initialize classes, features, and operations; add parameters
		initEClass(measurementNotificationEClass, MeasurementNotification.class, "MeasurementNotification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasurementNotification_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, 1, MeasurementNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementNotification_Unit(), this.getUnit(), "unit", "W", 0, 1, MeasurementNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateNotificationEClass, StateNotification.class, "StateNotification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateNotification_State(), this.getState(), "state", null, 0, 1, StateNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationEClass, Notification.class, "Notification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotification_Timestamp(), ecorePackage.getELongObject(), "timestamp", null, 0, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotification_Source_id(), ecorePackage.getEString(), "source_id", null, 0, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stateEEnum, State.class, "State");
		addEEnumLiteral(stateEEnum, State.ON);
		addEEnumLiteral(stateEEnum, State.OFF);

		initEEnum(unitEEnum, Unit.class, "Unit");
		addEEnumLiteral(unitEEnum, Unit.M);
		addEEnumLiteral(unitEEnum, Unit.V);
		addEEnumLiteral(unitEEnum, Unit.A);
		addEEnumLiteral(unitEEnum, Unit.W);
		addEEnumLiteral(unitEEnum, Unit.WH);
		addEEnumLiteral(unitEEnum, Unit.VA);
		addEEnumLiteral(unitEEnum, Unit.VARIABLE);
		addEEnumLiteral(unitEEnum, Unit.CELSIUS);
		addEEnumLiteral(unitEEnum, Unit.K);
		addEEnumLiteral(unitEEnum, Unit.PERCENT);

		// Create resource
		createResource(eNS_URI);
	}

} //OcppStructuresPackageImpl
