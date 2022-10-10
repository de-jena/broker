/*
 */
package de.jena.sensinact.sthbnd.rest.tlc.control.model.control.util;

import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage;

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
 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.util.TlcControlResourceImpl
 * @generated
 */
 @Component( name = TlcControlPackage.eNAME + "Factory", service = Resource.Factory.class, scope = ServiceScope.SINGLETON,
 	reference = @Reference( name = TlcControlPackage.eNAME + "Package", service = TlcControlPackage.class, cardinality = ReferenceCardinality.MANDATORY)
 )
 @ProvideEMFResourceConfigurator( name = TlcControlPackage.eNAME,
	contentType = { "" }, 
	fileExtension = {
	"tlccontrol"
 	},  
	version = "1.0.0"
)
public class TlcControlResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TlcControlResourceFactoryImpl() {
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
		Resource result = new TlcControlResourceImpl(uri);
		return result;
	}

} //TlcControlResourceFactoryImpl
