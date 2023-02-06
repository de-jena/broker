/*
 */
package de.dim.trafficos.intersection.model.intersection.util;

import de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage;

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
 * @see de.dim.trafficos.intersection.model.intersection.util.TOSIntersectionResourceImpl
 * @generated
 */
 @Component( name = TOSIntersectionPackage.eNAME + "Factory", service = Resource.Factory.class, scope = ServiceScope.SINGLETON,
 	reference = @Reference( name = TOSIntersectionPackage.eNAME + "Package", service = TOSIntersectionPackage.class, cardinality = ReferenceCardinality.MANDATORY)
 )
 @ProvideEMFResourceConfigurator( name = TOSIntersectionPackage.eNAME,
	contentType = { "" }, 
	fileExtension = {
	"tosintersection"
 	},  
	version = "1.0.0"
)
public class TOSIntersectionResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOSIntersectionResourceFactoryImpl() {
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
		Resource result = new TOSIntersectionResourceImpl(uri);
		return result;
	}

} //TOSIntersectionResourceFactoryImpl
