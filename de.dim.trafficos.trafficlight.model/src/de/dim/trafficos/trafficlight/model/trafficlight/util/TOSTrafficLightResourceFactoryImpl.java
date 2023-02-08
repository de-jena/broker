/*
 */
package de.dim.trafficos.trafficlight.model.trafficlight.util;

import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage;

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
 * @see de.dim.trafficos.trafficlight.model.trafficlight.util.TOSTrafficLightResourceImpl
 * @generated
 */
 @Component( name = TOSTrafficLightPackage.eNAME + "Factory", service = Resource.Factory.class, scope = ServiceScope.SINGLETON,
 	reference = @Reference( name = TOSTrafficLightPackage.eNAME + "Package", service = TOSTrafficLightPackage.class, cardinality = ReferenceCardinality.MANDATORY)
 )
 @ProvideEMFResourceConfigurator( name = TOSTrafficLightPackage.eNAME,
	contentType = { "" }, 
	fileExtension = {
	"tostrafficlight"
 	},  
	version = "1.0"
)
public class TOSTrafficLightResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOSTrafficLightResourceFactoryImpl() {
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
		Resource result = new TOSTrafficLightResourceImpl(uri);
		return result;
	}

} //TOSTrafficLightResourceFactoryImpl
