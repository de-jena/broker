/**
 */
package de.jena.chirpstack.moisture.model.moisture.impl;

import de.jena.chirpstack.moisture.model.moisture.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChirpstackMoistureFactoryImpl extends EFactoryImpl implements ChirpstackMoistureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChirpstackMoistureFactory init() {
		try {
			ChirpstackMoistureFactory theChirpstackMoistureFactory = (ChirpstackMoistureFactory)EPackage.Registry.INSTANCE.getEFactory(ChirpstackMoisturePackage.eNS_URI);
			if (theChirpstackMoistureFactory != null) {
				return theChirpstackMoistureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChirpstackMoistureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChirpstackMoistureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ChirpstackMoisturePackage.DRAGINO: return createDragino();
			case ChirpstackMoisturePackage.SENSOR: return createSensor();
			case ChirpstackMoisturePackage.SOIL: return createSoil();
			case ChirpstackMoisturePackage.DEVICE: return createDevice();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dragino createDragino() {
		DraginoImpl dragino = new DraginoImpl();
		return dragino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Soil createSoil() {
		SoilImpl soil = new SoilImpl();
		return soil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChirpstackMoisturePackage getChirpstackMoisturePackage() {
		return (ChirpstackMoisturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChirpstackMoisturePackage getPackage() {
		return ChirpstackMoisturePackage.eINSTANCE;
	}

} //ChirpstackMoistureFactoryImpl
