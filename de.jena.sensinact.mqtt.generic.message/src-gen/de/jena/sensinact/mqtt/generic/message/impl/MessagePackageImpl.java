/**
 */
package de.jena.sensinact.mqtt.generic.message.impl;

import de.jena.sensinact.mqtt.generic.message.BigDecimalValueUpdate;
import de.jena.sensinact.mqtt.generic.message.BooleanValueUpdate;
import de.jena.sensinact.mqtt.generic.message.DateValueUpdate;
import de.jena.sensinact.mqtt.generic.message.DoubleValueUpdate;
import de.jena.sensinact.mqtt.generic.message.GeoJsonObjectValueUpdate;
import de.jena.sensinact.mqtt.generic.message.InsantValueUpdate;
import de.jena.sensinact.mqtt.generic.message.IntegerValueUpdate;
import de.jena.sensinact.mqtt.generic.message.LongValueUpdate;
import de.jena.sensinact.mqtt.generic.message.MessageFactory;
import de.jena.sensinact.mqtt.generic.message.MessagePackage;
import de.jena.sensinact.mqtt.generic.message.ObjectValueUpdate;
import de.jena.sensinact.mqtt.generic.message.PointValueUpdate;
import de.jena.sensinact.mqtt.generic.message.StringValueUpdate;
import de.jena.sensinact.mqtt.generic.message.UpdateMessage;

import java.time.Instant;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sensinact.gateway.geojson.Point;

import org.eclipse.sensinact.model.core.SensiNactPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessagePackageImpl extends EPackageImpl implements MessagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleValueUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longValueUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectValueUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insantValueUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateValueUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigDecimalValueUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoJsonObjectValueUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointValueUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eInstantEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ePointEDataType = null;

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
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MessagePackageImpl() {
		super(eNS_URI, MessageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MessagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MessagePackage init() {
		if (isInited) return (MessagePackage)EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMessagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MessagePackageImpl theMessagePackage = registeredMessagePackage instanceof MessagePackageImpl ? (MessagePackageImpl)registeredMessagePackage : new MessagePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		SensiNactPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMessagePackage.createPackageContents();

		// Initialize created meta-data
		theMessagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMessagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MessagePackage.eNS_URI, theMessagePackage);
		return theMessagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateMessage() {
		return updateMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateMessage_Timestamp() {
		return (EAttribute)updateMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateMessage_Resource() {
		return (EAttribute)updateMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValueUpdate() {
		return stringValueUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValueUpdate_OldValue() {
		return (EAttribute)stringValueUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValueUpdate_NewValue() {
		return (EAttribute)stringValueUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleValueUpdate() {
		return doubleValueUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleValueUpdate_OldValue() {
		return (EAttribute)doubleValueUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleValueUpdate_NewValue() {
		return (EAttribute)doubleValueUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValueUpdate() {
		return integerValueUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValueUpdate_OldValue() {
		return (EAttribute)integerValueUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValueUpdate_NewValue() {
		return (EAttribute)integerValueUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongValueUpdate() {
		return longValueUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongValueUpdate_OldValue() {
		return (EAttribute)longValueUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongValueUpdate_NewValue() {
		return (EAttribute)longValueUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValueUpdate() {
		return booleanValueUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValueUpdate_OldValue() {
		return (EAttribute)booleanValueUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValueUpdate_NewValue() {
		return (EAttribute)booleanValueUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectValueUpdate() {
		return objectValueUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectValueUpdate_OldValue() {
		return (EAttribute)objectValueUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectValueUpdate_NewValue() {
		return (EAttribute)objectValueUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsantValueUpdate() {
		return insantValueUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsantValueUpdate_OldValue() {
		return (EAttribute)insantValueUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsantValueUpdate_NewValue() {
		return (EAttribute)insantValueUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateValueUpdate() {
		return dateValueUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateValueUpdate_OldValue() {
		return (EAttribute)dateValueUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateValueUpdate_NewValue() {
		return (EAttribute)dateValueUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBigDecimalValueUpdate() {
		return bigDecimalValueUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigDecimalValueUpdate_OldValue() {
		return (EAttribute)bigDecimalValueUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigDecimalValueUpdate_NewValue() {
		return (EAttribute)bigDecimalValueUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeoJsonObjectValueUpdate() {
		return geoJsonObjectValueUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoJsonObjectValueUpdate_OldValue() {
		return (EAttribute)geoJsonObjectValueUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoJsonObjectValueUpdate_NewValue() {
		return (EAttribute)geoJsonObjectValueUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointValueUpdate() {
		return pointValueUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointValueUpdate_OldValue() {
		return (EAttribute)pointValueUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointValueUpdate_NewValue() {
		return (EAttribute)pointValueUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEInstant() {
		return eInstantEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEPoint() {
		return ePointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFactory getMessageFactory() {
		return (MessageFactory)getEFactoryInstance();
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
		updateMessageEClass = createEClass(UPDATE_MESSAGE);
		createEAttribute(updateMessageEClass, UPDATE_MESSAGE__TIMESTAMP);
		createEAttribute(updateMessageEClass, UPDATE_MESSAGE__RESOURCE);

		stringValueUpdateEClass = createEClass(STRING_VALUE_UPDATE);
		createEAttribute(stringValueUpdateEClass, STRING_VALUE_UPDATE__OLD_VALUE);
		createEAttribute(stringValueUpdateEClass, STRING_VALUE_UPDATE__NEW_VALUE);

		doubleValueUpdateEClass = createEClass(DOUBLE_VALUE_UPDATE);
		createEAttribute(doubleValueUpdateEClass, DOUBLE_VALUE_UPDATE__OLD_VALUE);
		createEAttribute(doubleValueUpdateEClass, DOUBLE_VALUE_UPDATE__NEW_VALUE);

		integerValueUpdateEClass = createEClass(INTEGER_VALUE_UPDATE);
		createEAttribute(integerValueUpdateEClass, INTEGER_VALUE_UPDATE__OLD_VALUE);
		createEAttribute(integerValueUpdateEClass, INTEGER_VALUE_UPDATE__NEW_VALUE);

		longValueUpdateEClass = createEClass(LONG_VALUE_UPDATE);
		createEAttribute(longValueUpdateEClass, LONG_VALUE_UPDATE__OLD_VALUE);
		createEAttribute(longValueUpdateEClass, LONG_VALUE_UPDATE__NEW_VALUE);

		booleanValueUpdateEClass = createEClass(BOOLEAN_VALUE_UPDATE);
		createEAttribute(booleanValueUpdateEClass, BOOLEAN_VALUE_UPDATE__OLD_VALUE);
		createEAttribute(booleanValueUpdateEClass, BOOLEAN_VALUE_UPDATE__NEW_VALUE);

		objectValueUpdateEClass = createEClass(OBJECT_VALUE_UPDATE);
		createEAttribute(objectValueUpdateEClass, OBJECT_VALUE_UPDATE__OLD_VALUE);
		createEAttribute(objectValueUpdateEClass, OBJECT_VALUE_UPDATE__NEW_VALUE);

		insantValueUpdateEClass = createEClass(INSANT_VALUE_UPDATE);
		createEAttribute(insantValueUpdateEClass, INSANT_VALUE_UPDATE__OLD_VALUE);
		createEAttribute(insantValueUpdateEClass, INSANT_VALUE_UPDATE__NEW_VALUE);

		dateValueUpdateEClass = createEClass(DATE_VALUE_UPDATE);
		createEAttribute(dateValueUpdateEClass, DATE_VALUE_UPDATE__OLD_VALUE);
		createEAttribute(dateValueUpdateEClass, DATE_VALUE_UPDATE__NEW_VALUE);

		bigDecimalValueUpdateEClass = createEClass(BIG_DECIMAL_VALUE_UPDATE);
		createEAttribute(bigDecimalValueUpdateEClass, BIG_DECIMAL_VALUE_UPDATE__OLD_VALUE);
		createEAttribute(bigDecimalValueUpdateEClass, BIG_DECIMAL_VALUE_UPDATE__NEW_VALUE);

		geoJsonObjectValueUpdateEClass = createEClass(GEO_JSON_OBJECT_VALUE_UPDATE);
		createEAttribute(geoJsonObjectValueUpdateEClass, GEO_JSON_OBJECT_VALUE_UPDATE__OLD_VALUE);
		createEAttribute(geoJsonObjectValueUpdateEClass, GEO_JSON_OBJECT_VALUE_UPDATE__NEW_VALUE);

		pointValueUpdateEClass = createEClass(POINT_VALUE_UPDATE);
		createEAttribute(pointValueUpdateEClass, POINT_VALUE_UPDATE__OLD_VALUE);
		createEAttribute(pointValueUpdateEClass, POINT_VALUE_UPDATE__NEW_VALUE);

		// Create data types
		eInstantEDataType = createEDataType(EINSTANT);
		ePointEDataType = createEDataType(EPOINT);
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

		// Obtain other dependent packages
		SensiNactPackage theSensiNactPackage = (SensiNactPackage)EPackage.Registry.INSTANCE.getEPackage(SensiNactPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stringValueUpdateEClass.getESuperTypes().add(this.getUpdateMessage());
		doubleValueUpdateEClass.getESuperTypes().add(this.getUpdateMessage());
		integerValueUpdateEClass.getESuperTypes().add(this.getUpdateMessage());
		longValueUpdateEClass.getESuperTypes().add(this.getUpdateMessage());
		booleanValueUpdateEClass.getESuperTypes().add(this.getUpdateMessage());
		objectValueUpdateEClass.getESuperTypes().add(this.getUpdateMessage());
		insantValueUpdateEClass.getESuperTypes().add(this.getUpdateMessage());
		dateValueUpdateEClass.getESuperTypes().add(this.getUpdateMessage());
		bigDecimalValueUpdateEClass.getESuperTypes().add(this.getUpdateMessage());
		geoJsonObjectValueUpdateEClass.getESuperTypes().add(this.getUpdateMessage());
		pointValueUpdateEClass.getESuperTypes().add(this.getUpdateMessage());

		// Initialize classes, features, and operations; add parameters
		initEClass(updateMessageEClass, UpdateMessage.class, "UpdateMessage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateMessage_Timestamp(), this.getEInstant(), "timestamp", null, 0, 1, UpdateMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateMessage_Resource(), ecorePackage.getEString(), "resource", null, 0, 1, UpdateMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValueUpdateEClass, StringValueUpdate.class, "StringValueUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValueUpdate_OldValue(), ecorePackage.getEString(), "oldValue", null, 0, 1, StringValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringValueUpdate_NewValue(), ecorePackage.getEString(), "newValue", null, 0, 1, StringValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleValueUpdateEClass, DoubleValueUpdate.class, "DoubleValueUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleValueUpdate_OldValue(), ecorePackage.getEDoubleObject(), "oldValue", null, 0, 1, DoubleValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleValueUpdate_NewValue(), ecorePackage.getEDoubleObject(), "newValue", null, 0, 1, DoubleValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueUpdateEClass, IntegerValueUpdate.class, "IntegerValueUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValueUpdate_OldValue(), ecorePackage.getEIntegerObject(), "oldValue", null, 0, 1, IntegerValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerValueUpdate_NewValue(), ecorePackage.getEIntegerObject(), "newValue", null, 0, 1, IntegerValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longValueUpdateEClass, LongValueUpdate.class, "LongValueUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongValueUpdate_OldValue(), ecorePackage.getELongObject(), "oldValue", null, 0, 1, LongValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongValueUpdate_NewValue(), ecorePackage.getELongObject(), "newValue", null, 0, 1, LongValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueUpdateEClass, BooleanValueUpdate.class, "BooleanValueUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValueUpdate_OldValue(), ecorePackage.getEBoolean(), "oldValue", null, 0, 1, BooleanValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanValueUpdate_NewValue(), ecorePackage.getEBoolean(), "newValue", null, 0, 1, BooleanValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectValueUpdateEClass, ObjectValueUpdate.class, "ObjectValueUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectValueUpdate_OldValue(), ecorePackage.getEJavaObject(), "oldValue", null, 0, 1, ObjectValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectValueUpdate_NewValue(), ecorePackage.getEJavaObject(), "newValue", null, 0, 1, ObjectValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insantValueUpdateEClass, InsantValueUpdate.class, "InsantValueUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsantValueUpdate_OldValue(), this.getEInstant(), "oldValue", null, 0, 1, InsantValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsantValueUpdate_NewValue(), this.getEInstant(), "newValue", null, 0, 1, InsantValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateValueUpdateEClass, DateValueUpdate.class, "DateValueUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateValueUpdate_OldValue(), ecorePackage.getEDate(), "oldValue", null, 0, 1, DateValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateValueUpdate_NewValue(), ecorePackage.getEDate(), "newValue", null, 0, 1, DateValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bigDecimalValueUpdateEClass, BigDecimalValueUpdate.class, "BigDecimalValueUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBigDecimalValueUpdate_OldValue(), ecorePackage.getEBigDecimal(), "oldValue", null, 0, 1, BigDecimalValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigDecimalValueUpdate_NewValue(), ecorePackage.getEBigDecimal(), "newValue", null, 0, 1, BigDecimalValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geoJsonObjectValueUpdateEClass, GeoJsonObjectValueUpdate.class, "GeoJsonObjectValueUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeoJsonObjectValueUpdate_OldValue(), theSensiNactPackage.getEGeoJsonObject(), "oldValue", null, 0, 1, GeoJsonObjectValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoJsonObjectValueUpdate_NewValue(), theSensiNactPackage.getEGeoJsonObject(), "newValue", null, 0, 1, GeoJsonObjectValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointValueUpdateEClass, PointValueUpdate.class, "PointValueUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPointValueUpdate_OldValue(), this.getEPoint(), "oldValue", null, 0, 1, PointValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointValueUpdate_NewValue(), this.getEPoint(), "newValue", null, 0, 1, PointValueUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(eInstantEDataType, Instant.class, "EInstant", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ePointEDataType, Point.class, "EPoint", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "1.0"
		   });
	}

} //MessagePackageImpl
