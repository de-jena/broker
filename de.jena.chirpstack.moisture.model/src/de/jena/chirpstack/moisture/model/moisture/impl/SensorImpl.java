/*
 */
package de.jena.chirpstack.moisture.model.moisture.impl;

import de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage;
import de.jena.chirpstack.moisture.model.moisture.Sensor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.SensorImpl#getBattery <em>Battery</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.SensorImpl#getIflag <em>Iflag</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.SensorImpl#getSflag <em>Sflag</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.SensorImpl#getMod <em>Mod</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.SensorImpl#getTemperatureDS18B20 <em>Temperature DS18B20</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends ServiceImpl implements Sensor {
	/**
	 * The default value of the '{@link #getBattery() <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery()
	 * @generated
	 * @ordered
	 */
	protected static final double BATTERY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBattery() <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery()
	 * @generated
	 * @ordered
	 */
	protected double battery = BATTERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIflag() <em>Iflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIflag()
	 * @generated
	 * @ordered
	 */
	protected static final double IFLAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIflag() <em>Iflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIflag()
	 * @generated
	 * @ordered
	 */
	protected double iflag = IFLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSflag() <em>Sflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSflag()
	 * @generated
	 * @ordered
	 */
	protected static final double SFLAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSflag() <em>Sflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSflag()
	 * @generated
	 * @ordered
	 */
	protected double sflag = SFLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getMod() <em>Mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMod()
	 * @generated
	 * @ordered
	 */
	protected static final double MOD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMod() <em>Mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMod()
	 * @generated
	 * @ordered
	 */
	protected double mod = MOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperatureDS18B20() <em>Temperature DS18B20</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureDS18B20()
	 * @generated
	 * @ordered
	 */
	protected static final float TEMPERATURE_DS18B20_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTemperatureDS18B20() <em>Temperature DS18B20</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureDS18B20()
	 * @generated
	 * @ordered
	 */
	protected float temperatureDS18B20 = TEMPERATURE_DS18B20_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackMoisturePackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBattery() {
		return battery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBattery(double newBattery) {
		double oldBattery = battery;
		battery = newBattery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.SENSOR__BATTERY, oldBattery, battery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getIflag() {
		return iflag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIflag(double newIflag) {
		double oldIflag = iflag;
		iflag = newIflag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.SENSOR__IFLAG, oldIflag, iflag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSflag() {
		return sflag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSflag(double newSflag) {
		double oldSflag = sflag;
		sflag = newSflag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.SENSOR__SFLAG, oldSflag, sflag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMod() {
		return mod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMod(double newMod) {
		double oldMod = mod;
		mod = newMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.SENSOR__MOD, oldMod, mod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTemperatureDS18B20() {
		return temperatureDS18B20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperatureDS18B20(float newTemperatureDS18B20) {
		float oldTemperatureDS18B20 = temperatureDS18B20;
		temperatureDS18B20 = newTemperatureDS18B20;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.SENSOR__TEMPERATURE_DS18B20, oldTemperatureDS18B20, temperatureDS18B20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackMoisturePackage.SENSOR__BATTERY:
				return getBattery();
			case ChirpstackMoisturePackage.SENSOR__IFLAG:
				return getIflag();
			case ChirpstackMoisturePackage.SENSOR__SFLAG:
				return getSflag();
			case ChirpstackMoisturePackage.SENSOR__MOD:
				return getMod();
			case ChirpstackMoisturePackage.SENSOR__TEMPERATURE_DS18B20:
				return getTemperatureDS18B20();
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
			case ChirpstackMoisturePackage.SENSOR__BATTERY:
				setBattery((Double)newValue);
				return;
			case ChirpstackMoisturePackage.SENSOR__IFLAG:
				setIflag((Double)newValue);
				return;
			case ChirpstackMoisturePackage.SENSOR__SFLAG:
				setSflag((Double)newValue);
				return;
			case ChirpstackMoisturePackage.SENSOR__MOD:
				setMod((Double)newValue);
				return;
			case ChirpstackMoisturePackage.SENSOR__TEMPERATURE_DS18B20:
				setTemperatureDS18B20((Float)newValue);
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
			case ChirpstackMoisturePackage.SENSOR__BATTERY:
				setBattery(BATTERY_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.SENSOR__IFLAG:
				setIflag(IFLAG_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.SENSOR__SFLAG:
				setSflag(SFLAG_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.SENSOR__MOD:
				setMod(MOD_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.SENSOR__TEMPERATURE_DS18B20:
				setTemperatureDS18B20(TEMPERATURE_DS18B20_EDEFAULT);
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
			case ChirpstackMoisturePackage.SENSOR__BATTERY:
				return battery != BATTERY_EDEFAULT;
			case ChirpstackMoisturePackage.SENSOR__IFLAG:
				return iflag != IFLAG_EDEFAULT;
			case ChirpstackMoisturePackage.SENSOR__SFLAG:
				return sflag != SFLAG_EDEFAULT;
			case ChirpstackMoisturePackage.SENSOR__MOD:
				return mod != MOD_EDEFAULT;
			case ChirpstackMoisturePackage.SENSOR__TEMPERATURE_DS18B20:
				return temperatureDS18B20 != TEMPERATURE_DS18B20_EDEFAULT;
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
		result.append(" (battery: ");
		result.append(battery);
		result.append(", iflag: ");
		result.append(iflag);
		result.append(", sflag: ");
		result.append(sflag);
		result.append(", Mod: ");
		result.append(mod);
		result.append(", temperatureDS18B20: ");
		result.append(temperatureDS18B20);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
