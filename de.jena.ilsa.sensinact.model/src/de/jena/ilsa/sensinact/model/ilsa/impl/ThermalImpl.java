/*
 */
package de.jena.ilsa.sensinact.model.ilsa.impl;

import de.jena.ilsa.sensinact.model.ilsa.IlsaPackage;
import de.jena.ilsa.sensinact.model.ilsa.Thermal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.AdminImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thermal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.ilsa.sensinact.model.ilsa.impl.ThermalImpl#getTemperature <em>Temperature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThermalImpl extends AdminImpl implements Thermal {
	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final double TEMPERATURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected double temperature = TEMPERATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThermalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlsaPackage.Literals.THERMAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperature(double newTemperature) {
		double oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlsaPackage.THERMAL__TEMPERATURE, oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IlsaPackage.THERMAL__TEMPERATURE:
				return getTemperature();
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
			case IlsaPackage.THERMAL__TEMPERATURE:
				setTemperature((Double)newValue);
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
			case IlsaPackage.THERMAL__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
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
			case IlsaPackage.THERMAL__TEMPERATURE:
				return temperature != TEMPERATURE_EDEFAULT;
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
		result.append(" (temperature: ");
		result.append(temperature);
		result.append(')');
		return result.toString();
	}

} //ThermalImpl
