/*
 * Copyright (c) 2022 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion - initial API and implementation 
 */
package de.jena.model.icesensor;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ice SENSOR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.icesensor.IceSENSOR#getIce_id <em>Ice id</em>}</li>
 *   <li>{@link de.jena.model.icesensor.IceSENSOR#getCoords <em>Coords</em>}</li>
 *   <li>{@link de.jena.model.icesensor.IceSENSOR#getData <em>Data</em>}</li>
 *   <li>{@link de.jena.model.icesensor.IceSENSOR#isHas_beacon <em>Has beacon</em>}</li>
 *   <li>{@link de.jena.model.icesensor.IceSENSOR#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see de.jena.model.icesensor.IcesensorPackage#getIceSENSOR()
 * @model
 * @generated
 */
@ProviderType
public interface IceSENSOR extends EObject {
	/**
	 * Returns the value of the '<em><b>Ice id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ice id</em>' attribute.
	 * @see #setIce_id(String)
	 * @see de.jena.model.icesensor.IcesensorPackage#getIceSENSOR_Ice_id()
	 * @model
	 * @generated
	 */
	String getIce_id();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.IceSENSOR#getIce_id <em>Ice id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ice id</em>' attribute.
	 * @see #getIce_id()
	 * @generated
	 */
	void setIce_id(String value);

	/**
	 * Returns the value of the '<em><b>Coords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coords</em>' containment reference.
	 * @see #setCoords(Coords)
	 * @see de.jena.model.icesensor.IcesensorPackage#getIceSENSOR_Coords()
	 * @model containment="true"
	 * @generated
	 */
	Coords getCoords();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.IceSENSOR#getCoords <em>Coords</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coords</em>' containment reference.
	 * @see #getCoords()
	 * @generated
	 */
	void setCoords(Coords value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(Data)
	 * @see de.jena.model.icesensor.IcesensorPackage#getIceSENSOR_Data()
	 * @model containment="true"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.IceSENSOR#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Has beacon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has beacon</em>' attribute.
	 * @see #setHas_beacon(boolean)
	 * @see de.jena.model.icesensor.IcesensorPackage#getIceSENSOR_Has_beacon()
	 * @model required="true"
	 * @generated
	 */
	boolean isHas_beacon();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.IceSENSOR#isHas_beacon <em>Has beacon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has beacon</em>' attribute.
	 * @see #isHas_beacon()
	 * @generated
	 */
	void setHas_beacon(boolean value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' attribute.
	 * @see #setDetail(String)
	 * @see de.jena.model.icesensor.IcesensorPackage#getIceSENSOR_Detail()
	 * @model
	 * @generated
	 */
	String getDetail();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.IceSENSOR#getDetail <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' attribute.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(String value);

} // IceSENSOR
