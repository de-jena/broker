/*
 */
package de.dim.trafficos.trafficlight.model.trafficlight.impl;

import de.dim.trafficos.trafficlight.model.trafficlight.TLModule;
import de.dim.trafficos.trafficlight.model.trafficlight.TLModuleType;
import de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter;
import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TL Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.impl.TLModuleImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.impl.TLModuleImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.impl.TLModuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.impl.TLModuleImpl#getSignalTransmitter <em>Signal Transmitter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TLModuleImpl extends MinimalEObjectImpl.Container implements TLModule {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final int ADDRESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected int address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TLModuleType TYPE_EDEFAULT = TLModuleType.LML;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TLModuleType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSignalTransmitter() <em>Signal Transmitter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalTransmitter()
	 * @generated
	 * @ordered
	 */
	protected EList<TLSignalTransmitter> signalTransmitter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSTrafficLightPackage.eINSTANCE.getTLModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSTrafficLightPackage.TL_MODULE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(int newAddress) {
		int oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSTrafficLightPackage.TL_MODULE__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLModuleType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TLModuleType newType) {
		TLModuleType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSTrafficLightPackage.TL_MODULE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TLSignalTransmitter> getSignalTransmitter() {
		if (signalTransmitter == null) {
			signalTransmitter = new EObjectContainmentEList<TLSignalTransmitter>(TLSignalTransmitter.class, this, TOSTrafficLightPackage.TL_MODULE__SIGNAL_TRANSMITTER);
		}
		return signalTransmitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSTrafficLightPackage.TL_MODULE__SIGNAL_TRANSMITTER:
				return ((InternalEList<?>)getSignalTransmitter()).basicRemove(otherEnd, msgs);
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
			case TOSTrafficLightPackage.TL_MODULE__ID:
				return getId();
			case TOSTrafficLightPackage.TL_MODULE__ADDRESS:
				return getAddress();
			case TOSTrafficLightPackage.TL_MODULE__TYPE:
				return getType();
			case TOSTrafficLightPackage.TL_MODULE__SIGNAL_TRANSMITTER:
				return getSignalTransmitter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TOSTrafficLightPackage.TL_MODULE__ID:
				setId((String)newValue);
				return;
			case TOSTrafficLightPackage.TL_MODULE__ADDRESS:
				setAddress((Integer)newValue);
				return;
			case TOSTrafficLightPackage.TL_MODULE__TYPE:
				setType((TLModuleType)newValue);
				return;
			case TOSTrafficLightPackage.TL_MODULE__SIGNAL_TRANSMITTER:
				getSignalTransmitter().clear();
				getSignalTransmitter().addAll((Collection<? extends TLSignalTransmitter>)newValue);
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
			case TOSTrafficLightPackage.TL_MODULE__ID:
				setId(ID_EDEFAULT);
				return;
			case TOSTrafficLightPackage.TL_MODULE__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case TOSTrafficLightPackage.TL_MODULE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TOSTrafficLightPackage.TL_MODULE__SIGNAL_TRANSMITTER:
				getSignalTransmitter().clear();
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
			case TOSTrafficLightPackage.TL_MODULE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TOSTrafficLightPackage.TL_MODULE__ADDRESS:
				return address != ADDRESS_EDEFAULT;
			case TOSTrafficLightPackage.TL_MODULE__TYPE:
				return type != TYPE_EDEFAULT;
			case TOSTrafficLightPackage.TL_MODULE__SIGNAL_TRANSMITTER:
				return signalTransmitter != null && !signalTransmitter.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", address: ");
		result.append(address);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TLModuleImpl
