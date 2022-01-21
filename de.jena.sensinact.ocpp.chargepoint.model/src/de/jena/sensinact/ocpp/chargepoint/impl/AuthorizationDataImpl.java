/**
 */
package de.jena.sensinact.ocpp.chargepoint.impl;

import de.jena.sensinact.ocpp.chargepoint.AuthorizationData;
import de.jena.sensinact.ocpp.chargepoint.IdTagInfo;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.AuthorizationDataImpl#getIdTag <em>Id Tag</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.AuthorizationDataImpl#getIdTagInfo <em>Id Tag Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizationDataImpl extends MinimalEObjectImpl.Container implements AuthorizationData {
	/**
	 * The default value of the '{@link #getIdTag() <em>Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTag()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdTag() <em>Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTag()
	 * @generated
	 * @ordered
	 */
	protected String idTag = ID_TAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIdTagInfo() <em>Id Tag Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTagInfo()
	 * @generated
	 * @ordered
	 */
	protected IdTagInfo idTagInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.AUTHORIZATION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdTag() {
		return idTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdTag(String newIdTag) {
		String oldIdTag = idTag;
		idTag = newIdTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.AUTHORIZATION_DATA__ID_TAG, oldIdTag, idTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdTagInfo getIdTagInfo() {
		return idTagInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdTagInfo(IdTagInfo newIdTagInfo, NotificationChain msgs) {
		IdTagInfo oldIdTagInfo = idTagInfo;
		idTagInfo = newIdTagInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.AUTHORIZATION_DATA__ID_TAG_INFO, oldIdTagInfo, newIdTagInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdTagInfo(IdTagInfo newIdTagInfo) {
		if (newIdTagInfo != idTagInfo) {
			NotificationChain msgs = null;
			if (idTagInfo != null)
				msgs = ((InternalEObject)idTagInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OcppChargePointPackage.AUTHORIZATION_DATA__ID_TAG_INFO, null, msgs);
			if (newIdTagInfo != null)
				msgs = ((InternalEObject)newIdTagInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OcppChargePointPackage.AUTHORIZATION_DATA__ID_TAG_INFO, null, msgs);
			msgs = basicSetIdTagInfo(newIdTagInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.AUTHORIZATION_DATA__ID_TAG_INFO, newIdTagInfo, newIdTagInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OcppChargePointPackage.AUTHORIZATION_DATA__ID_TAG_INFO:
				return basicSetIdTagInfo(null, msgs);
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
			case OcppChargePointPackage.AUTHORIZATION_DATA__ID_TAG:
				return getIdTag();
			case OcppChargePointPackage.AUTHORIZATION_DATA__ID_TAG_INFO:
				return getIdTagInfo();
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
			case OcppChargePointPackage.AUTHORIZATION_DATA__ID_TAG:
				setIdTag((String)newValue);
				return;
			case OcppChargePointPackage.AUTHORIZATION_DATA__ID_TAG_INFO:
				setIdTagInfo((IdTagInfo)newValue);
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
			case OcppChargePointPackage.AUTHORIZATION_DATA__ID_TAG:
				setIdTag(ID_TAG_EDEFAULT);
				return;
			case OcppChargePointPackage.AUTHORIZATION_DATA__ID_TAG_INFO:
				setIdTagInfo((IdTagInfo)null);
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
			case OcppChargePointPackage.AUTHORIZATION_DATA__ID_TAG:
				return ID_TAG_EDEFAULT == null ? idTag != null : !ID_TAG_EDEFAULT.equals(idTag);
			case OcppChargePointPackage.AUTHORIZATION_DATA__ID_TAG_INFO:
				return idTagInfo != null;
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
		result.append(" (idTag: ");
		result.append(idTag);
		result.append(')');
		return result.toString();
	}

} //AuthorizationDataImpl
