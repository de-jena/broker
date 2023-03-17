/*
 */
package de.jena.model.ttn.impl;

import de.jena.model.ttn.Lora;
import de.jena.model.ttn.TTNPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lora</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.ttn.impl.LoraImpl#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.LoraImpl#getSpreadingFactor <em>Spreading Factor</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.LoraImpl#getCodingRate <em>Coding Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoraImpl extends MinimalEObjectImpl.Container implements Lora {
	/**
	 * The default value of the '{@link #getBandwidth() <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected static final long BANDWIDTH_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBandwidth() <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected long bandwidth = BANDWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpreadingFactor() <em>Spreading Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadingFactor()
	 * @generated
	 * @ordered
	 */
	protected static final int SPREADING_FACTOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpreadingFactor() <em>Spreading Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadingFactor()
	 * @generated
	 * @ordered
	 */
	protected int spreadingFactor = SPREADING_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodingRate() <em>Coding Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodingRate()
	 * @generated
	 * @ordered
	 */
	protected static final String CODING_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodingRate() <em>Coding Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodingRate()
	 * @generated
	 * @ordered
	 */
	protected String codingRate = CODING_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTNPackage.eINSTANCE.getLora();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getBandwidth() {
		return bandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBandwidth(long newBandwidth) {
		long oldBandwidth = bandwidth;
		bandwidth = newBandwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.LORA__BANDWIDTH, oldBandwidth, bandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSpreadingFactor() {
		return spreadingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpreadingFactor(int newSpreadingFactor) {
		int oldSpreadingFactor = spreadingFactor;
		spreadingFactor = newSpreadingFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.LORA__SPREADING_FACTOR, oldSpreadingFactor, spreadingFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodingRate() {
		return codingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodingRate(String newCodingRate) {
		String oldCodingRate = codingRate;
		codingRate = newCodingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.LORA__CODING_RATE, oldCodingRate, codingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TTNPackage.LORA__BANDWIDTH:
				return getBandwidth();
			case TTNPackage.LORA__SPREADING_FACTOR:
				return getSpreadingFactor();
			case TTNPackage.LORA__CODING_RATE:
				return getCodingRate();
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
			case TTNPackage.LORA__BANDWIDTH:
				setBandwidth((Long)newValue);
				return;
			case TTNPackage.LORA__SPREADING_FACTOR:
				setSpreadingFactor((Integer)newValue);
				return;
			case TTNPackage.LORA__CODING_RATE:
				setCodingRate((String)newValue);
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
			case TTNPackage.LORA__BANDWIDTH:
				setBandwidth(BANDWIDTH_EDEFAULT);
				return;
			case TTNPackage.LORA__SPREADING_FACTOR:
				setSpreadingFactor(SPREADING_FACTOR_EDEFAULT);
				return;
			case TTNPackage.LORA__CODING_RATE:
				setCodingRate(CODING_RATE_EDEFAULT);
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
			case TTNPackage.LORA__BANDWIDTH:
				return bandwidth != BANDWIDTH_EDEFAULT;
			case TTNPackage.LORA__SPREADING_FACTOR:
				return spreadingFactor != SPREADING_FACTOR_EDEFAULT;
			case TTNPackage.LORA__CODING_RATE:
				return CODING_RATE_EDEFAULT == null ? codingRate != null : !CODING_RATE_EDEFAULT.equals(codingRate);
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
		result.append(" (bandwidth: ");
		result.append(bandwidth);
		result.append(", spreadingFactor: ");
		result.append(spreadingFactor);
		result.append(", codingRate: ");
		result.append(codingRate);
		result.append(')');
		return result.toString();
	}

} //LoraImpl
