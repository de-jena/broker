/*
 */
package de.jena.sensinact.ocpp.chargepoint.util;

import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
@Component( name = OcppChargePointPackage.eNAME + "XMLProcessor", service = OcppChargePointXMLProcessor.class, scope = ServiceScope.SINGLETON)
public class OcppChargePointXMLProcessor extends XMLProcessor {

	@Reference
	private OcppChargePointResourceFactoryImpl resourceFactory; 


	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Activate
	public OcppChargePointXMLProcessor(
		@Reference(name = "EPackageRegistry", target = "(component.name=DefaultEPackageRegistry)") EPackage.Registry registry
		) {
		super(registry);
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
			registrations.put(XML_EXTENSION, resourceFactory);
			registrations.put(STAR_EXTENSION, resourceFactory);
		}
		return registrations;
	}

} //OcppChargePointXMLProcessor
