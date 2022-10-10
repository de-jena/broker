/*
 */
package de.dim.trafficos.model.device.util;

import de.dim.trafficos.model.device.TOSDevicePackage;

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
 * @see de.dim.trafficos.model.device.util.TOSDeviceResourceImpl
 * @generated
 */
 @Component( name = TOSDevicePackage.eNAME + "Factory", service = Resource.Factory.class, scope = ServiceScope.SINGLETON,
 	reference = @Reference( name = TOSDevicePackage.eNAME + "Package", service = TOSDevicePackage.class, cardinality = ReferenceCardinality.MANDATORY)
 )
 @ProvideEMFResourceConfigurator( name = TOSDevicePackage.eNAME,
	contentType = { "device#1.0" }, 
	fileExtension = {
	"tos"
 	},  
	version = "1.0.0"
)
public class TOSDeviceResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOSDeviceResourceFactoryImpl() {
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
		Resource result = new TOSDeviceResourceImpl(uri);
		return result;
	}

} //TOSDeviceResourceFactoryImpl
