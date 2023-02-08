/*
 */
package de.dim.trafficos.common.model.common;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.common.model.common.TOSCommonPackage
 * @generated
 */
@ProviderType
public interface TOSCommonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TOSCommonFactory eINSTANCE = de.dim.trafficos.common.model.common.impl.TOSCommonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Id Name Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Name Element</em>'.
	 * @generated
	 */
	IdNameElement createIdNameElement();

	/**
	 * Returns a new object of class '<em>Abstract Data Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Data Entry</em>'.
	 * @generated
	 */
	AbstractDataEntry createAbstractDataEntry();

	/**
	 * Returns a new object of class '<em>Abstract Time Table Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Time Table Entry</em>'.
	 * @generated
	 */
	AbstractTimeTableEntry createAbstractTimeTableEntry();

	/**
	 * Returns a new object of class '<em>Localizable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Localizable</em>'.
	 * @generated
	 */
	Localizable createLocalizable();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Network Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Location</em>'.
	 * @generated
	 */
	NetworkLocation createNetworkLocation();

	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Address Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Location</em>'.
	 * @generated
	 */
	AddressLocation createAddressLocation();

	/**
	 * Returns a new object of class '<em>Data Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Entry</em>'.
	 * @generated
	 */
	DataEntry createDataEntry();

	/**
	 * Returns a new object of class '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Value</em>'.
	 * @generated
	 */
	DataValue createDataValue();

	/**
	 * Returns a new object of class '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output</em>'.
	 * @generated
	 */
	Output createOutput();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TOSCommonPackage getTOSCommonPackage();

} //TOSCommonFactory
