/**
 */
package de.dim.trafficos.trafficlight.model.trafficlight.impl;

import de.dim.trafficos.trafficlight.model.trafficlight.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class TOSTrafficLightFactoryImpl extends EFactoryImpl implements TOSTrafficLightFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TOSTrafficLightFactory init() {
		try {
			TOSTrafficLightFactory theTOSTrafficLightFactory = (TOSTrafficLightFactory)EPackage.Registry.INSTANCE.getEFactory(TOSTrafficLightPackage.eNS_URI);
			if (theTOSTrafficLightFactory != null) {
				return theTOSTrafficLightFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TOSTrafficLightFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOSTrafficLightFactoryImpl() {
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
			case TOSTrafficLightPackage.TL_MODULE: return createTLModule();
			case TOSTrafficLightPackage.TL_SIGNAL_TRANSMITTER: return createTLSignalTransmitter();
			case TOSTrafficLightPackage.TL_SIGNAL_GROUP: return createTLSignalGroup();
			case TOSTrafficLightPackage.LIGHT_SIGNAL: return createLightSignal();
			case TOSTrafficLightPackage.TL_UPDATE: return createTLUpdate();
			case TOSTrafficLightPackage.CHANGED_STATE: return createChangedState();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TOSTrafficLightPackage.TL_MODULE_TYPE:
				return createTLModuleTypeFromString(eDataType, initialValue);
			case TOSTrafficLightPackage.SIGNAL_VALUE_TYPE:
				return createSignalValueTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TOSTrafficLightPackage.TL_MODULE_TYPE:
				return convertTLModuleTypeToString(eDataType, instanceValue);
			case TOSTrafficLightPackage.SIGNAL_VALUE_TYPE:
				return convertSignalValueTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLModule createTLModule() {
		TLModuleImpl tlModule = new TLModuleImpl();
		return tlModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLSignalTransmitter createTLSignalTransmitter() {
		TLSignalTransmitterImpl tlSignalTransmitter = new TLSignalTransmitterImpl();
		return tlSignalTransmitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLSignalGroup createTLSignalGroup() {
		TLSignalGroupImpl tlSignalGroup = new TLSignalGroupImpl();
		return tlSignalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightSignal createLightSignal() {
		LightSignalImpl lightSignal = new LightSignalImpl();
		return lightSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLUpdate createTLUpdate() {
		TLUpdateImpl tlUpdate = new TLUpdateImpl();
		return tlUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangedState createChangedState() {
		ChangedStateImpl changedState = new ChangedStateImpl();
		return changedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLModuleType createTLModuleTypeFromString(EDataType eDataType, String initialValue) {
		TLModuleType result = TLModuleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTLModuleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalValueType createSignalValueTypeFromString(EDataType eDataType, String initialValue) {
		SignalValueType result = SignalValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOSTrafficLightPackage getTOSTrafficLightPackage() {
		return (TOSTrafficLightPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TOSTrafficLightPackage getPackage() {
		return TOSTrafficLightPackage.eINSTANCE;
	}

} //TOSTrafficLightFactoryImpl
