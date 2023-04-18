/**
 */
package de.dim.trafficos.common.model.common.impl;

import de.dim.trafficos.common.model.common.*;

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
public class TOSCommonFactoryImpl extends EFactoryImpl implements TOSCommonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TOSCommonFactory init() {
		try {
			TOSCommonFactory theTOSCommonFactory = (TOSCommonFactory)EPackage.Registry.INSTANCE.getEFactory(TOSCommonPackage.eNS_URI);
			if (theTOSCommonFactory != null) {
				return theTOSCommonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TOSCommonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOSCommonFactoryImpl() {
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
			case TOSCommonPackage.ID_NAME_ELEMENT: return createIdNameElement();
			case TOSCommonPackage.ABSTRACT_DATA_ENTRY: return createAbstractDataEntry();
			case TOSCommonPackage.ABSTRACT_TIME_TABLE_ENTRY: return createAbstractTimeTableEntry();
			case TOSCommonPackage.LOCALIZABLE: return createLocalizable();
			case TOSCommonPackage.LOCATION: return createLocation();
			case TOSCommonPackage.NETWORK_LOCATION: return createNetworkLocation();
			case TOSCommonPackage.POSITION: return createPosition();
			case TOSCommonPackage.ADDRESS_LOCATION: return createAddressLocation();
			case TOSCommonPackage.DATA_ENTRY: return createDataEntry();
			case TOSCommonPackage.DATA_VALUE: return createDataValue();
			case TOSCommonPackage.OUTPUT: return createOutput();
			case TOSCommonPackage.PARAMETER: return createParameter();
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
			case TOSCommonPackage.PARAMETER_DATA_TYPE:
				return createParameterDataTypeFromString(eDataType, initialValue);
			case TOSCommonPackage.DIRECTION_TYPE:
				return createDirectionTypeFromString(eDataType, initialValue);
			case TOSCommonPackage.SCHEDULE_MODE_TYPE:
				return createScheduleModeTypeFromString(eDataType, initialValue);
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
			case TOSCommonPackage.PARAMETER_DATA_TYPE:
				return convertParameterDataTypeToString(eDataType, instanceValue);
			case TOSCommonPackage.DIRECTION_TYPE:
				return convertDirectionTypeToString(eDataType, instanceValue);
			case TOSCommonPackage.SCHEDULE_MODE_TYPE:
				return convertScheduleModeTypeToString(eDataType, instanceValue);
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
	public IdNameElement createIdNameElement() {
		IdNameElementImpl idNameElement = new IdNameElementImpl();
		return idNameElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractDataEntry createAbstractDataEntry() {
		AbstractDataEntryImpl abstractDataEntry = new AbstractDataEntryImpl();
		return abstractDataEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTimeTableEntry createAbstractTimeTableEntry() {
		AbstractTimeTableEntryImpl abstractTimeTableEntry = new AbstractTimeTableEntryImpl();
		return abstractTimeTableEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Localizable createLocalizable() {
		LocalizableImpl localizable = new LocalizableImpl();
		return localizable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkLocation createNetworkLocation() {
		NetworkLocationImpl networkLocation = new NetworkLocationImpl();
		return networkLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressLocation createAddressLocation() {
		AddressLocationImpl addressLocation = new AddressLocationImpl();
		return addressLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataEntry createDataEntry() {
		DataEntryImpl dataEntry = new DataEntryImpl();
		return dataEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataValue createDataValue() {
		DataValueImpl dataValue = new DataValueImpl();
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDataType createParameterDataTypeFromString(EDataType eDataType, String initialValue) {
		ParameterDataType result = ParameterDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue) {
		DirectionType result = DirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleModeType createScheduleModeTypeFromString(EDataType eDataType, String initialValue) {
		ScheduleModeType result = ScheduleModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScheduleModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOSCommonPackage getTOSCommonPackage() {
		return (TOSCommonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TOSCommonPackage getPackage() {
		return TOSCommonPackage.eINSTANCE;
	}

} //TOSCommonFactoryImpl
