/**
 */
package de.jena.sensinact.mqtt.generic.message.util;

import de.jena.sensinact.mqtt.generic.message.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage
 * @generated
 */
public class MessageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MessagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MessagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageSwitch<Adapter> modelSwitch =
		new MessageSwitch<Adapter>() {
			@Override
			public Adapter caseUpdateMessage(UpdateMessage object) {
				return createUpdateMessageAdapter();
			}
			@Override
			public Adapter caseEObjectValueUpdate(EObjectValueUpdate object) {
				return createEObjectValueUpdateAdapter();
			}
			@Override
			public Adapter caseStringValueUpdate(StringValueUpdate object) {
				return createStringValueUpdateAdapter();
			}
			@Override
			public Adapter caseDoubleValueUpdate(DoubleValueUpdate object) {
				return createDoubleValueUpdateAdapter();
			}
			@Override
			public Adapter caseIntegerValueUpdate(IntegerValueUpdate object) {
				return createIntegerValueUpdateAdapter();
			}
			@Override
			public Adapter caseLongValueUpdate(LongValueUpdate object) {
				return createLongValueUpdateAdapter();
			}
			@Override
			public Adapter caseBooleanValueUpdate(BooleanValueUpdate object) {
				return createBooleanValueUpdateAdapter();
			}
			@Override
			public Adapter caseObjectValueUpdate(ObjectValueUpdate object) {
				return createObjectValueUpdateAdapter();
			}
			@Override
			public Adapter caseInsantValueUpdate(InsantValueUpdate object) {
				return createInsantValueUpdateAdapter();
			}
			@Override
			public Adapter caseDateValueUpdate(DateValueUpdate object) {
				return createDateValueUpdateAdapter();
			}
			@Override
			public Adapter caseBigDecimalValueUpdate(BigDecimalValueUpdate object) {
				return createBigDecimalValueUpdateAdapter();
			}
			@Override
			public Adapter caseGeoJsonObjectValueUpdate(GeoJsonObjectValueUpdate object) {
				return createGeoJsonObjectValueUpdateAdapter();
			}
			@Override
			public Adapter casePointValueUpdate(PointValueUpdate object) {
				return createPointValueUpdateAdapter();
			}
			@Override
			public Adapter caseFeatureCollectionValueUpdate(FeatureCollectionValueUpdate object) {
				return createFeatureCollectionValueUpdateAdapter();
			}
			@Override
			public Adapter casePolygonValueUpdate(PolygonValueUpdate object) {
				return createPolygonValueUpdateAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.mqtt.generic.message.UpdateMessage <em>Update Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.mqtt.generic.message.UpdateMessage
	 * @generated
	 */
	public Adapter createUpdateMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.mqtt.generic.message.EObjectValueUpdate <em>EObject Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.mqtt.generic.message.EObjectValueUpdate
	 * @generated
	 */
	public Adapter createEObjectValueUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.mqtt.generic.message.StringValueUpdate <em>String Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.mqtt.generic.message.StringValueUpdate
	 * @generated
	 */
	public Adapter createStringValueUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.mqtt.generic.message.DoubleValueUpdate <em>Double Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.mqtt.generic.message.DoubleValueUpdate
	 * @generated
	 */
	public Adapter createDoubleValueUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.mqtt.generic.message.IntegerValueUpdate <em>Integer Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.mqtt.generic.message.IntegerValueUpdate
	 * @generated
	 */
	public Adapter createIntegerValueUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.mqtt.generic.message.LongValueUpdate <em>Long Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.mqtt.generic.message.LongValueUpdate
	 * @generated
	 */
	public Adapter createLongValueUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.mqtt.generic.message.BooleanValueUpdate <em>Boolean Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.mqtt.generic.message.BooleanValueUpdate
	 * @generated
	 */
	public Adapter createBooleanValueUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.mqtt.generic.message.ObjectValueUpdate <em>Object Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.mqtt.generic.message.ObjectValueUpdate
	 * @generated
	 */
	public Adapter createObjectValueUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.mqtt.generic.message.InsantValueUpdate <em>Insant Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.mqtt.generic.message.InsantValueUpdate
	 * @generated
	 */
	public Adapter createInsantValueUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.mqtt.generic.message.DateValueUpdate <em>Date Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.mqtt.generic.message.DateValueUpdate
	 * @generated
	 */
	public Adapter createDateValueUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.mqtt.generic.message.BigDecimalValueUpdate <em>Big Decimal Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.mqtt.generic.message.BigDecimalValueUpdate
	 * @generated
	 */
	public Adapter createBigDecimalValueUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.mqtt.generic.message.GeoJsonObjectValueUpdate <em>Geo Json Object Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.mqtt.generic.message.GeoJsonObjectValueUpdate
	 * @generated
	 */
	public Adapter createGeoJsonObjectValueUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.mqtt.generic.message.PointValueUpdate <em>Point Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.mqtt.generic.message.PointValueUpdate
	 * @generated
	 */
	public Adapter createPointValueUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.mqtt.generic.message.FeatureCollectionValueUpdate <em>Feature Collection Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.mqtt.generic.message.FeatureCollectionValueUpdate
	 * @generated
	 */
	public Adapter createFeatureCollectionValueUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.mqtt.generic.message.PolygonValueUpdate <em>Polygon Value Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.mqtt.generic.message.PolygonValueUpdate
	 * @generated
	 */
	public Adapter createPolygonValueUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MessageAdapterFactory
