/*
 */
package de.dim.trafficos.trafficlight.model.trafficlight.impl;

import de.dim.trafficos.common.model.common.impl.OutputImpl;

import de.dim.trafficos.trafficlight.model.trafficlight.LightSignal;
import de.dim.trafficos.trafficlight.model.trafficlight.TLSignalGroup;
import de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter;
import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TL Signal Transmitter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.impl.TLSignalTransmitterImpl#getSignalGroup <em>Signal Group</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.impl.TLSignalTransmitterImpl#getLightSignal <em>Light Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TLSignalTransmitterImpl extends OutputImpl implements TLSignalTransmitter {
	/**
	 * The cached value of the '{@link #getSignalGroup() <em>Signal Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroup()
	 * @generated
	 * @ordered
	 */
	protected TLSignalGroup signalGroup;

	/**
	 * The cached value of the '{@link #getLightSignal() <em>Light Signal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightSignal()
	 * @generated
	 * @ordered
	 */
	protected EList<LightSignal> lightSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLSignalTransmitterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSTrafficLightPackage.eINSTANCE.getTLSignalTransmitter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLSignalGroup getSignalGroup() {
		return signalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalGroup(TLSignalGroup newSignalGroup, NotificationChain msgs) {
		TLSignalGroup oldSignalGroup = signalGroup;
		signalGroup = newSignalGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSTrafficLightPackage.TL_SIGNAL_TRANSMITTER__SIGNAL_GROUP, oldSignalGroup, newSignalGroup);
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
	public void setSignalGroup(TLSignalGroup newSignalGroup) {
		if (newSignalGroup != signalGroup) {
			NotificationChain msgs = null;
			if (signalGroup != null)
				msgs = ((InternalEObject)signalGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSTrafficLightPackage.TL_SIGNAL_TRANSMITTER__SIGNAL_GROUP, null, msgs);
			if (newSignalGroup != null)
				msgs = ((InternalEObject)newSignalGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSTrafficLightPackage.TL_SIGNAL_TRANSMITTER__SIGNAL_GROUP, null, msgs);
			msgs = basicSetSignalGroup(newSignalGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSTrafficLightPackage.TL_SIGNAL_TRANSMITTER__SIGNAL_GROUP, newSignalGroup, newSignalGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LightSignal> getLightSignal() {
		if (lightSignal == null) {
			lightSignal = new EObjectContainmentEList<LightSignal>(LightSignal.class, this, TOSTrafficLightPackage.TL_SIGNAL_TRANSMITTER__LIGHT_SIGNAL);
		}
		return lightSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSTrafficLightPackage.TL_SIGNAL_TRANSMITTER__SIGNAL_GROUP:
				return basicSetSignalGroup(null, msgs);
			case TOSTrafficLightPackage.TL_SIGNAL_TRANSMITTER__LIGHT_SIGNAL:
				return ((InternalEList<?>)getLightSignal()).basicRemove(otherEnd, msgs);
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
			case TOSTrafficLightPackage.TL_SIGNAL_TRANSMITTER__SIGNAL_GROUP:
				return getSignalGroup();
			case TOSTrafficLightPackage.TL_SIGNAL_TRANSMITTER__LIGHT_SIGNAL:
				return getLightSignal();
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
			case TOSTrafficLightPackage.TL_SIGNAL_TRANSMITTER__SIGNAL_GROUP:
				setSignalGroup((TLSignalGroup)newValue);
				return;
			case TOSTrafficLightPackage.TL_SIGNAL_TRANSMITTER__LIGHT_SIGNAL:
				getLightSignal().clear();
				getLightSignal().addAll((Collection<? extends LightSignal>)newValue);
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
			case TOSTrafficLightPackage.TL_SIGNAL_TRANSMITTER__SIGNAL_GROUP:
				setSignalGroup((TLSignalGroup)null);
				return;
			case TOSTrafficLightPackage.TL_SIGNAL_TRANSMITTER__LIGHT_SIGNAL:
				getLightSignal().clear();
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
			case TOSTrafficLightPackage.TL_SIGNAL_TRANSMITTER__SIGNAL_GROUP:
				return signalGroup != null;
			case TOSTrafficLightPackage.TL_SIGNAL_TRANSMITTER__LIGHT_SIGNAL:
				return lightSignal != null && !lightSignal.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TLSignalTransmitterImpl
