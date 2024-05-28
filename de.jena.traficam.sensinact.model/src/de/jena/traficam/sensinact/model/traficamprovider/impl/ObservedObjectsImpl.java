/*
 */
package de.jena.traficam.sensinact.model.traficamprovider.impl;

import de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects;
import de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observed Objects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.sensinact.model.traficamprovider.impl.ObservedObjectsImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link de.jena.traficam.sensinact.model.traficamprovider.impl.ObservedObjectsImpl#getClassificationName <em>Classification Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservedObjectsImpl extends ServiceImpl implements ObservedObjects {
	/**
	 * The default value of the '{@link #getObjects() <em>Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected static final GeoJsonObject OBJECTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected GeoJsonObject objects = OBJECTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassificationName() <em>Classification Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFICATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassificationName() <em>Classification Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationName()
	 * @generated
	 * @ordered
	 */
	protected String classificationName = CLASSIFICATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservedObjectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraficamproviderPackage.Literals.OBSERVED_OBJECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoJsonObject getObjects() {
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjects(GeoJsonObject newObjects) {
		GeoJsonObject oldObjects = objects;
		objects = newObjects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraficamproviderPackage.OBSERVED_OBJECTS__OBJECTS, oldObjects, objects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassificationName() {
		return classificationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationName(String newClassificationName) {
		String oldClassificationName = classificationName;
		classificationName = newClassificationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraficamproviderPackage.OBSERVED_OBJECTS__CLASSIFICATION_NAME, oldClassificationName, classificationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraficamproviderPackage.OBSERVED_OBJECTS__OBJECTS:
				return getObjects();
			case TraficamproviderPackage.OBSERVED_OBJECTS__CLASSIFICATION_NAME:
				return getClassificationName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TraficamproviderPackage.OBSERVED_OBJECTS__OBJECTS:
				setObjects((GeoJsonObject)newValue);
				return;
			case TraficamproviderPackage.OBSERVED_OBJECTS__CLASSIFICATION_NAME:
				setClassificationName((String)newValue);
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
			case TraficamproviderPackage.OBSERVED_OBJECTS__OBJECTS:
				setObjects(OBJECTS_EDEFAULT);
				return;
			case TraficamproviderPackage.OBSERVED_OBJECTS__CLASSIFICATION_NAME:
				setClassificationName(CLASSIFICATION_NAME_EDEFAULT);
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
			case TraficamproviderPackage.OBSERVED_OBJECTS__OBJECTS:
				return OBJECTS_EDEFAULT == null ? objects != null : !OBJECTS_EDEFAULT.equals(objects);
			case TraficamproviderPackage.OBSERVED_OBJECTS__CLASSIFICATION_NAME:
				return CLASSIFICATION_NAME_EDEFAULT == null ? classificationName != null : !CLASSIFICATION_NAME_EDEFAULT.equals(classificationName);
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
		result.append(" (objects: ");
		result.append(objects);
		result.append(", classificationName: ");
		result.append(classificationName);
		result.append(')');
		return result.toString();
	}

} //ObservedObjectsImpl
