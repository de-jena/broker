/*
 */
package de.jena.sensinact.mqtt.generic.message.impl;

import de.jena.sensinact.mqtt.generic.message.EObjectValueUpdate;
import de.jena.sensinact.mqtt.generic.message.MessagePackage;

import java.time.Instant;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EObject Value Update</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.impl.EObjectValueUpdateImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.impl.EObjectValueUpdateImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.impl.EObjectValueUpdateImpl#getNewValue <em>New Value</em>}</li>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.impl.EObjectValueUpdateImpl#getOldValue <em>Old Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EObjectValueUpdateImpl extends MinimalEObjectImpl.Container implements EObjectValueUpdate {
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
	 * The cached value of the '{@link #getNewValue() <em>New Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected EObject newValue;

	/**
	 * The cached value of the '{@link #getOldValue() <em>Old Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldValue()
	 * @generated
	 * @ordered
	 */
	protected EObject oldValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObjectValueUpdateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MessagePackage.Literals.EOBJECT_VALUE_UPDATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.EOBJECT_VALUE_UPDATE__TIMESTAMP, oldTimestamp, timestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.EOBJECT_VALUE_UPDATE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getNewValue() {
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewValue(EObject newNewValue, NotificationChain msgs) {
		EObject oldNewValue = newValue;
		newValue = newNewValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MessagePackage.EOBJECT_VALUE_UPDATE__NEW_VALUE, oldNewValue, newNewValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewValue(EObject newNewValue) {
		if (newNewValue != newValue) {
			NotificationChain msgs = null;
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MessagePackage.EOBJECT_VALUE_UPDATE__NEW_VALUE, null, msgs);
			if (newNewValue != null)
				msgs = ((InternalEObject)newNewValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MessagePackage.EOBJECT_VALUE_UPDATE__NEW_VALUE, null, msgs);
			msgs = basicSetNewValue(newNewValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.EOBJECT_VALUE_UPDATE__NEW_VALUE, newNewValue, newNewValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getOldValue() {
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOldValue(EObject newOldValue, NotificationChain msgs) {
		EObject oldOldValue = oldValue;
		oldValue = newOldValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MessagePackage.EOBJECT_VALUE_UPDATE__OLD_VALUE, oldOldValue, newOldValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldValue(EObject newOldValue) {
		if (newOldValue != oldValue) {
			NotificationChain msgs = null;
			if (oldValue != null)
				msgs = ((InternalEObject)oldValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MessagePackage.EOBJECT_VALUE_UPDATE__OLD_VALUE, null, msgs);
			if (newOldValue != null)
				msgs = ((InternalEObject)newOldValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MessagePackage.EOBJECT_VALUE_UPDATE__OLD_VALUE, null, msgs);
			msgs = basicSetOldValue(newOldValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.EOBJECT_VALUE_UPDATE__OLD_VALUE, newOldValue, newOldValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MessagePackage.EOBJECT_VALUE_UPDATE__NEW_VALUE:
				return basicSetNewValue(null, msgs);
			case MessagePackage.EOBJECT_VALUE_UPDATE__OLD_VALUE:
				return basicSetOldValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MessagePackage.EOBJECT_VALUE_UPDATE__TIMESTAMP:
				return getTimestamp();
			case MessagePackage.EOBJECT_VALUE_UPDATE__RESOURCE:
				return getResource();
			case MessagePackage.EOBJECT_VALUE_UPDATE__NEW_VALUE:
				return getNewValue();
			case MessagePackage.EOBJECT_VALUE_UPDATE__OLD_VALUE:
				return getOldValue();
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
			case MessagePackage.EOBJECT_VALUE_UPDATE__TIMESTAMP:
				setTimestamp((Instant)newValue);
				return;
			case MessagePackage.EOBJECT_VALUE_UPDATE__RESOURCE:
				setResource((String)newValue);
				return;
			case MessagePackage.EOBJECT_VALUE_UPDATE__NEW_VALUE:
				setNewValue((EObject)newValue);
				return;
			case MessagePackage.EOBJECT_VALUE_UPDATE__OLD_VALUE:
				setOldValue((EObject)newValue);
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
			case MessagePackage.EOBJECT_VALUE_UPDATE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case MessagePackage.EOBJECT_VALUE_UPDATE__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
			case MessagePackage.EOBJECT_VALUE_UPDATE__NEW_VALUE:
				setNewValue((EObject)null);
				return;
			case MessagePackage.EOBJECT_VALUE_UPDATE__OLD_VALUE:
				setOldValue((EObject)null);
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
			case MessagePackage.EOBJECT_VALUE_UPDATE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case MessagePackage.EOBJECT_VALUE_UPDATE__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
			case MessagePackage.EOBJECT_VALUE_UPDATE__NEW_VALUE:
				return newValue != null;
			case MessagePackage.EOBJECT_VALUE_UPDATE__OLD_VALUE:
				return oldValue != null;
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
		result.append(')');
		return result.toString();
	}

} //EObjectValueUpdateImpl
