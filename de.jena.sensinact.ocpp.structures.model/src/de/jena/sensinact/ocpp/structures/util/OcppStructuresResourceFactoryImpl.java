/*
 */
package de.jena.sensinact.ocpp.structures.util;

import de.jena.sensinact.ocpp.structures.OcppStructuresPackage;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.gecko.emf.osgi.annotation.provide.ProvideEMFResourceConfigurator;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.ocpp.structures.util.OcppStructuresResourceImpl
 * @generated
 */
 @Component( name = OcppStructuresPackage.eNAME + "Factory", service = Resource.Factory.class, scope = ServiceScope.SINGLETON,
 	reference = @Reference( name = OcppStructuresPackage.eNAME + "Package", service = OcppStructuresPackage.class, cardinality = ReferenceCardinality.MANDATORY)
 )
 @ProvideEMFResourceConfigurator( name = OcppStructuresPackage.eNAME,
	contentType = { "" }, 
	fileExtension = {
	"ocppstructures"
 	},  
	version = "1.0.0"
)
public class OcppStructuresResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcppStructuresResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new OcppStructuresResourceImpl(uri);
		return result;
	}

} //OcppStructuresResourceFactoryImpl
