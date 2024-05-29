/*
 */
package de.jena.sensinact.mqtt.generic.message.impl;

import de.jena.sensinact.mqtt.generic.message.MessagePackage;
import de.jena.sensinact.mqtt.generic.message.PolygonValueUpdate;

import java.time.Instant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sensinact.gateway.geojson.Polygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon Value Update</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.impl.PolygonValueUpdateImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.impl.PolygonValueUpdateImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.impl.PolygonValueUpdateImpl#getOldValue <em>Old Value</em>}</li>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.impl.PolygonValueUpdateImpl#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolygonValueUpdateImpl extends MinimalEObjectImpl.Container implements PolygonValueUpdate {
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Instant TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Instant timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected String resource = RESOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldValue() <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldValue()
	 * @generated
	 * @ordered
	 */
	protected static final Polygon OLD_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldValue() <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldValue()
	 * @generated
	 * @ordered
	 */
	protected Polygon oldValue = OLD_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewValue() <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected static final Polygon NEW_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewValue() <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected Polygon newValue = NEW_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolygonValueUpdateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MessagePackage.Literals.POLYGON_VALUE_UPDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(Instant newTimestamp) {
		Instant oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.POLYGON_VALUE_UPDATE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(String newResource) {
		String oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.POLYGON_VALUE_UPDATE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygon getOldValue() {
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldValue(Polygon newOldValue) {
		Polygon oldOldValue = oldValue;
		oldValue = newOldValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.POLYGON_VALUE_UPDATE__OLD_VALUE, oldOldValue, oldValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygon getNewValue() {
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewValue(Polygon newNewValue) {
		Polygon oldNewValue = newValue;
		newValue = newNewValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.POLYGON_VALUE_UPDATE__NEW_VALUE, oldNewValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MessagePackage.POLYGON_VALUE_UPDATE__TIMESTAMP:
				return getTimestamp();
			case MessagePackage.POLYGON_VALUE_UPDATE__RESOURCE:
				return getResource();
			case MessagePackage.POLYGON_VALUE_UPDATE__OLD_VALUE:
				return getOldValue();
			case MessagePackage.POLYGON_VALUE_UPDATE__NEW_VALUE:
				return getNewValue();
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
			case MessagePackage.POLYGON_VALUE_UPDATE__TIMESTAMP:
				setTimestamp((Instant)newValue);
				return;
			case MessagePackage.POLYGON_VALUE_UPDATE__RESOURCE:
				setResource((String)newValue);
				return;
			case MessagePackage.POLYGON_VALUE_UPDATE__OLD_VALUE:
				setOldValue((Polygon)newValue);
				return;
			case MessagePackage.POLYGON_VALUE_UPDATE__NEW_VALUE:
				setNewValue((Polygon)newValue);
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
			case MessagePackage.POLYGON_VALUE_UPDATE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case MessagePackage.POLYGON_VALUE_UPDATE__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
			case MessagePackage.POLYGON_VALUE_UPDATE__OLD_VALUE:
				setOldValue(OLD_VALUE_EDEFAULT);
				return;
			case MessagePackage.POLYGON_VALUE_UPDATE__NEW_VALUE:
				setNewValue(NEW_VALUE_EDEFAULT);
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
			case MessagePackage.POLYGON_VALUE_UPDATE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case MessagePackage.POLYGON_VALUE_UPDATE__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
			case MessagePackage.POLYGON_VALUE_UPDATE__OLD_VALUE:
				return OLD_VALUE_EDEFAULT == null ? oldValue != null : !OLD_VALUE_EDEFAULT.equals(oldValue);
			case MessagePackage.POLYGON_VALUE_UPDATE__NEW_VALUE:
				return NEW_VALUE_EDEFAULT == null ? newValue != null : !NEW_VALUE_EDEFAULT.equals(newValue);
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(", resource: ");
		result.append(resource);
		result.append(", oldValue: ");
		result.append(oldValue);
		result.append(", newValue: ");
		result.append(newValue);
		result.append(')');
		return result.toString();
	}

} //PolygonValueUpdateImpl
