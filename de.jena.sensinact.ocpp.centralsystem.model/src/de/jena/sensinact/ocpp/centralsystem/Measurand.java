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
package de.jena.sensinact.ocpp.centralsystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Measurand</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getMeasurand()
 * @model extendedMetaData="name='Measurand'"
 * @generated
 */
@ProviderType
public enum Measurand implements Enumerator {
	/**
	 * The '<em><b>Current Export</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_EXPORT_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT_EXPORT(0, "CurrentExport", "Current.Export"),

	/**
	 * The '<em><b>Current Import</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_IMPORT_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT_IMPORT(1, "CurrentImport", "Current.Import"),

	/**
	 * The '<em><b>Current Offered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_OFFERED_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT_OFFERED(2, "CurrentOffered", "Current.Offered"),

	/**
	 * The '<em><b>Energy Active Export Register</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_ACTIVE_EXPORT_REGISTER_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGY_ACTIVE_EXPORT_REGISTER(3, "EnergyActiveExportRegister", "Energy.Active.Export.Register"),

	/**
	 * The '<em><b>Energy Active Import Register</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_ACTIVE_IMPORT_REGISTER_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGY_ACTIVE_IMPORT_REGISTER(4, "EnergyActiveImportRegister", "Energy.Active.Import.Register"),

	/**
	 * The '<em><b>Energy Reactive Export Register</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_REACTIVE_EXPORT_REGISTER_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGY_REACTIVE_EXPORT_REGISTER(5, "EnergyReactiveExportRegister", "Energy.Reactive.Export.Register"),

	/**
	 * The '<em><b>Energy Reactive Import Register</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_REACTIVE_IMPORT_REGISTER_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGY_REACTIVE_IMPORT_REGISTER(6, "EnergyReactiveImportRegister", "Energy.Reactive.Import.Register"),

	/**
	 * The '<em><b>Energy Active Export Interval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_ACTIVE_EXPORT_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGY_ACTIVE_EXPORT_INTERVAL(7, "EnergyActiveExportInterval", "Energy.Active.Export.Interval"),

	/**
	 * The '<em><b>Energy Active Import Interval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_ACTIVE_IMPORT_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGY_ACTIVE_IMPORT_INTERVAL(8, "EnergyActiveImportInterval", "Energy.Active.Import.Interval"),

	/**
	 * The '<em><b>Energy Reactive Export Interval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_REACTIVE_EXPORT_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGY_REACTIVE_EXPORT_INTERVAL(9, "EnergyReactiveExportInterval", "Energy.Reactive.Export.Interval"),

	/**
	 * The '<em><b>Energy Reactive Import Interval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_REACTIVE_IMPORT_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGY_REACTIVE_IMPORT_INTERVAL(10, "EnergyReactiveImportInterval", "Energy.Reactive.Import.Interval"),

	/**
	 * The '<em><b>Frequency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENCY_VALUE
	 * @generated
	 * @ordered
	 */
	FREQUENCY(11, "Frequency", "Frequency"),

	/**
	 * The '<em><b>Power Active Export</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_ACTIVE_EXPORT_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_ACTIVE_EXPORT(12, "PowerActiveExport", "Power.Active.Export"),

	/**
	 * The '<em><b>Power Active Import</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_ACTIVE_IMPORT_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_ACTIVE_IMPORT(13, "PowerActiveImport", "Power.Active.Import"),

	/**
	 * The '<em><b>Power Factor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_FACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_FACTOR(14, "PowerFactor", "Power.Factor"),

	/**
	 * The '<em><b>Power Offered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_OFFERED_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_OFFERED(15, "PowerOffered", "Power.Offered"),

	/**
	 * The '<em><b>Power Reactive Export</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_REACTIVE_EXPORT_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_REACTIVE_EXPORT(16, "PowerReactiveExport", "Power.Reactive.Export"),

	/**
	 * The '<em><b>Power Reactive Import</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_REACTIVE_IMPORT_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_REACTIVE_IMPORT(17, "PowerReactiveImport", "Power.Reactive.Import"),

	/**
	 * The '<em><b>RPM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RPM_VALUE
	 * @generated
	 * @ordered
	 */
	RPM(18, "RPM", "RPM"),

	/**
	 * The '<em><b>So C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SO_C_VALUE
	 * @generated
	 * @ordered
	 */
	SO_C(19, "SoC", "SoC"),

	/**
	 * The '<em><b>Temperature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURE(20, "Temperature", "Temperature"),

	/**
	 * The '<em><b>Voltage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLTAGE_VALUE
	 * @generated
	 * @ordered
	 */
	VOLTAGE(21, "Voltage", "Voltage");

	/**
	 * The '<em><b>Current Export</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_EXPORT
	 * @model name="CurrentExport" literal="Current.Export"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_EXPORT_VALUE = 0;

	/**
	 * The '<em><b>Current Import</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_IMPORT
	 * @model name="CurrentImport" literal="Current.Import"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_IMPORT_VALUE = 1;

	/**
	 * The '<em><b>Current Offered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_OFFERED
	 * @model name="CurrentOffered" literal="Current.Offered"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_OFFERED_VALUE = 2;

	/**
	 * The '<em><b>Energy Active Export Register</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_ACTIVE_EXPORT_REGISTER
	 * @model name="EnergyActiveExportRegister" literal="Energy.Active.Export.Register"
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_ACTIVE_EXPORT_REGISTER_VALUE = 3;

	/**
	 * The '<em><b>Energy Active Import Register</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_ACTIVE_IMPORT_REGISTER
	 * @model name="EnergyActiveImportRegister" literal="Energy.Active.Import.Register"
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_ACTIVE_IMPORT_REGISTER_VALUE = 4;

	/**
	 * The '<em><b>Energy Reactive Export Register</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_REACTIVE_EXPORT_REGISTER
	 * @model name="EnergyReactiveExportRegister" literal="Energy.Reactive.Export.Register"
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_REACTIVE_EXPORT_REGISTER_VALUE = 5;

	/**
	 * The '<em><b>Energy Reactive Import Register</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_REACTIVE_IMPORT_REGISTER
	 * @model name="EnergyReactiveImportRegister" literal="Energy.Reactive.Import.Register"
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_REACTIVE_IMPORT_REGISTER_VALUE = 6;

	/**
	 * The '<em><b>Energy Active Export Interval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_ACTIVE_EXPORT_INTERVAL
	 * @model name="EnergyActiveExportInterval" literal="Energy.Active.Export.Interval"
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_ACTIVE_EXPORT_INTERVAL_VALUE = 7;

	/**
	 * The '<em><b>Energy Active Import Interval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_ACTIVE_IMPORT_INTERVAL
	 * @model name="EnergyActiveImportInterval" literal="Energy.Active.Import.Interval"
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_ACTIVE_IMPORT_INTERVAL_VALUE = 8;

	/**
	 * The '<em><b>Energy Reactive Export Interval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_REACTIVE_EXPORT_INTERVAL
	 * @model name="EnergyReactiveExportInterval" literal="Energy.Reactive.Export.Interval"
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_REACTIVE_EXPORT_INTERVAL_VALUE = 9;

	/**
	 * The '<em><b>Energy Reactive Import Interval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_REACTIVE_IMPORT_INTERVAL
	 * @model name="EnergyReactiveImportInterval" literal="Energy.Reactive.Import.Interval"
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_REACTIVE_IMPORT_INTERVAL_VALUE = 10;

	/**
	 * The '<em><b>Frequency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENCY
	 * @model name="Frequency"
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_VALUE = 11;

	/**
	 * The '<em><b>Power Active Export</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_ACTIVE_EXPORT
	 * @model name="PowerActiveExport" literal="Power.Active.Export"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_ACTIVE_EXPORT_VALUE = 12;

	/**
	 * The '<em><b>Power Active Import</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_ACTIVE_IMPORT
	 * @model name="PowerActiveImport" literal="Power.Active.Import"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_ACTIVE_IMPORT_VALUE = 13;

	/**
	 * The '<em><b>Power Factor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_FACTOR
	 * @model name="PowerFactor" literal="Power.Factor"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_FACTOR_VALUE = 14;

	/**
	 * The '<em><b>Power Offered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_OFFERED
	 * @model name="PowerOffered" literal="Power.Offered"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_OFFERED_VALUE = 15;

	/**
	 * The '<em><b>Power Reactive Export</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_REACTIVE_EXPORT
	 * @model name="PowerReactiveExport" literal="Power.Reactive.Export"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_REACTIVE_EXPORT_VALUE = 16;

	/**
	 * The '<em><b>Power Reactive Import</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_REACTIVE_IMPORT
	 * @model name="PowerReactiveImport" literal="Power.Reactive.Import"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_REACTIVE_IMPORT_VALUE = 17;

	/**
	 * The '<em><b>RPM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RPM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RPM_VALUE = 18;

	/**
	 * The '<em><b>So C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SO_C
	 * @model name="SoC"
	 * @generated
	 * @ordered
	 */
	public static final int SO_C_VALUE = 19;

	/**
	 * The '<em><b>Temperature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE
	 * @model name="Temperature"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURE_VALUE = 20;

	/**
	 * The '<em><b>Voltage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLTAGE
	 * @model name="Voltage"
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_VALUE = 21;

	/**
	 * An array of all the '<em><b>Measurand</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Measurand[] VALUES_ARRAY =
		new Measurand[] {
			CURRENT_EXPORT,
			CURRENT_IMPORT,
			CURRENT_OFFERED,
			ENERGY_ACTIVE_EXPORT_REGISTER,
			ENERGY_ACTIVE_IMPORT_REGISTER,
			ENERGY_REACTIVE_EXPORT_REGISTER,
			ENERGY_REACTIVE_IMPORT_REGISTER,
			ENERGY_ACTIVE_EXPORT_INTERVAL,
			ENERGY_ACTIVE_IMPORT_INTERVAL,
			ENERGY_REACTIVE_EXPORT_INTERVAL,
			ENERGY_REACTIVE_IMPORT_INTERVAL,
			FREQUENCY,
			POWER_ACTIVE_EXPORT,
			POWER_ACTIVE_IMPORT,
			POWER_FACTOR,
			POWER_OFFERED,
			POWER_REACTIVE_EXPORT,
			POWER_REACTIVE_IMPORT,
			RPM,
			SO_C,
			TEMPERATURE,
			VOLTAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Measurand</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Measurand> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Measurand</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Measurand get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Measurand result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measurand</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Measurand getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Measurand result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measurand</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Measurand get(int value) {
		switch (value) {
			case CURRENT_EXPORT_VALUE: return CURRENT_EXPORT;
			case CURRENT_IMPORT_VALUE: return CURRENT_IMPORT;
			case CURRENT_OFFERED_VALUE: return CURRENT_OFFERED;
			case ENERGY_ACTIVE_EXPORT_REGISTER_VALUE: return ENERGY_ACTIVE_EXPORT_REGISTER;
			case ENERGY_ACTIVE_IMPORT_REGISTER_VALUE: return ENERGY_ACTIVE_IMPORT_REGISTER;
			case ENERGY_REACTIVE_EXPORT_REGISTER_VALUE: return ENERGY_REACTIVE_EXPORT_REGISTER;
			case ENERGY_REACTIVE_IMPORT_REGISTER_VALUE: return ENERGY_REACTIVE_IMPORT_REGISTER;
			case ENERGY_ACTIVE_EXPORT_INTERVAL_VALUE: return ENERGY_ACTIVE_EXPORT_INTERVAL;
			case ENERGY_ACTIVE_IMPORT_INTERVAL_VALUE: return ENERGY_ACTIVE_IMPORT_INTERVAL;
			case ENERGY_REACTIVE_EXPORT_INTERVAL_VALUE: return ENERGY_REACTIVE_EXPORT_INTERVAL;
			case ENERGY_REACTIVE_IMPORT_INTERVAL_VALUE: return ENERGY_REACTIVE_IMPORT_INTERVAL;
			case FREQUENCY_VALUE: return FREQUENCY;
			case POWER_ACTIVE_EXPORT_VALUE: return POWER_ACTIVE_EXPORT;
			case POWER_ACTIVE_IMPORT_VALUE: return POWER_ACTIVE_IMPORT;
			case POWER_FACTOR_VALUE: return POWER_FACTOR;
			case POWER_OFFERED_VALUE: return POWER_OFFERED;
			case POWER_REACTIVE_EXPORT_VALUE: return POWER_REACTIVE_EXPORT;
			case POWER_REACTIVE_IMPORT_VALUE: return POWER_REACTIVE_IMPORT;
			case RPM_VALUE: return RPM;
			case SO_C_VALUE: return SO_C;
			case TEMPERATURE_VALUE: return TEMPERATURE;
			case VOLTAGE_VALUE: return VOLTAGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Measurand(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Measurand
