/**
 */
package de.jena.sensinact.mqtt.generic.message.util;

import de.jena.sensinact.mqtt.generic.message.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage
 * @generated
 */
public class MessageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MessagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSwitch() {
		if (modelPackage == null) {
			modelPackage = MessagePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MessagePackage.UPDATE_MESSAGE: {
				UpdateMessage updateMessage = (UpdateMessage)theEObject;
				T result = caseUpdateMessage(updateMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagePackage.EOBJECT_VALUE_UPDATE: {
				EObjectValueUpdate eObjectValueUpdate = (EObjectValueUpdate)theEObject;
				T result = caseEObjectValueUpdate(eObjectValueUpdate);
				if (result == null) result = caseUpdateMessage(eObjectValueUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagePackage.STRING_VALUE_UPDATE: {
				StringValueUpdate stringValueUpdate = (StringValueUpdate)theEObject;
				T result = caseStringValueUpdate(stringValueUpdate);
				if (result == null) result = caseUpdateMessage(stringValueUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagePackage.DOUBLE_VALUE_UPDATE: {
				DoubleValueUpdate doubleValueUpdate = (DoubleValueUpdate)theEObject;
				T result = caseDoubleValueUpdate(doubleValueUpdate);
				if (result == null) result = caseUpdateMessage(doubleValueUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagePackage.INTEGER_VALUE_UPDATE: {
				IntegerValueUpdate integerValueUpdate = (IntegerValueUpdate)theEObject;
				T result = caseIntegerValueUpdate(integerValueUpdate);
				if (result == null) result = caseUpdateMessage(integerValueUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagePackage.LONG_VALUE_UPDATE: {
				LongValueUpdate longValueUpdate = (LongValueUpdate)theEObject;
				T result = caseLongValueUpdate(longValueUpdate);
				if (result == null) result = caseUpdateMessage(longValueUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagePackage.BOOLEAN_VALUE_UPDATE: {
				BooleanValueUpdate booleanValueUpdate = (BooleanValueUpdate)theEObject;
				T result = caseBooleanValueUpdate(booleanValueUpdate);
				if (result == null) result = caseUpdateMessage(booleanValueUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagePackage.OBJECT_VALUE_UPDATE: {
				ObjectValueUpdate objectValueUpdate = (ObjectValueUpdate)theEObject;
				T result = caseObjectValueUpdate(objectValueUpdate);
				if (result == null) result = caseUpdateMessage(objectValueUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagePackage.INSANT_VALUE_UPDATE: {
				InsantValueUpdate insantValueUpdate = (InsantValueUpdate)theEObject;
				T result = caseInsantValueUpdate(insantValueUpdate);
				if (result == null) result = caseUpdateMessage(insantValueUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagePackage.DATE_VALUE_UPDATE: {
				DateValueUpdate dateValueUpdate = (DateValueUpdate)theEObject;
				T result = caseDateValueUpdate(dateValueUpdate);
				if (result == null) result = caseUpdateMessage(dateValueUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagePackage.BIG_DECIMAL_VALUE_UPDATE: {
				BigDecimalValueUpdate bigDecimalValueUpdate = (BigDecimalValueUpdate)theEObject;
				T result = caseBigDecimalValueUpdate(bigDecimalValueUpdate);
				if (result == null) result = caseUpdateMessage(bigDecimalValueUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagePackage.GEO_JSON_OBJECT_VALUE_UPDATE: {
				GeoJsonObjectValueUpdate geoJsonObjectValueUpdate = (GeoJsonObjectValueUpdate)theEObject;
				T result = caseGeoJsonObjectValueUpdate(geoJsonObjectValueUpdate);
				if (result == null) result = caseUpdateMessage(geoJsonObjectValueUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagePackage.POINT_VALUE_UPDATE: {
				PointValueUpdate pointValueUpdate = (PointValueUpdate)theEObject;
				T result = casePointValueUpdate(pointValueUpdate);
				if (result == null) result = caseUpdateMessage(pointValueUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagePackage.FEATURE_COLLECTION_VALUE_UPDATE: {
				FeatureCollectionValueUpdate featureCollectionValueUpdate = (FeatureCollectionValueUpdate)theEObject;
				T result = caseFeatureCollectionValueUpdate(featureCollectionValueUpdate);
				if (result == null) result = caseUpdateMessage(featureCollectionValueUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagePackage.POLYGON_VALUE_UPDATE: {
				PolygonValueUpdate polygonValueUpdate = (PolygonValueUpdate)theEObject;
				T result = casePolygonValueUpdate(polygonValueUpdate);
				if (result == null) result = caseUpdateMessage(polygonValueUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateMessage(UpdateMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject Value Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEObjectValueUpdate(EObjectValueUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValueUpdate(StringValueUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Value Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleValueUpdate(DoubleValueUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValueUpdate(IntegerValueUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Value Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongValueUpdate(LongValueUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValueUpdate(BooleanValueUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Value Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectValueUpdate(ObjectValueUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insant Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insant Value Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsantValueUpdate(InsantValueUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Value Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateValueUpdate(DateValueUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Decimal Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Decimal Value Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBigDecimalValueUpdate(BigDecimalValueUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Json Object Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Json Object Value Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeoJsonObjectValueUpdate(GeoJsonObjectValueUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Value Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointValueUpdate(PointValueUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Collection Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Collection Value Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCollectionValueUpdate(FeatureCollectionValueUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Value Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonValueUpdate(PolygonValueUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MessageSwitch
