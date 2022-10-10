/**
 */
package de.jena.sensinact.ocpp.chargepoint.util;

import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OcppChargePointXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcppChargePointXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		OcppChargePointPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the OcppChargePointResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new OcppChargePointResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new OcppChargePointResourceFactoryImpl());
		}
		return registrations;
	}

} //OcppChargePointXMLProcessor
