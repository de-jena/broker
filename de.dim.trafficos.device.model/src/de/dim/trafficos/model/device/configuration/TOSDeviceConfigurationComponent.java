/**
 * Copyright (c) 2012 - 2018 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.trafficos.model.device.configuration;

import de.dim.trafficos.model.device.TOSDevicePackage;

import de.dim.trafficos.model.device.impl.TOSDevicePackageImpl;

import de.dim.trafficos.model.device.util.TOSDeviceResourceFactoryImpl;

import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;

import org.gecko.emf.osgi.EPackageConfigurator;
import org.gecko.emf.osgi.ResourceFactoryConfigurator;

import org.gecko.emf.osgi.annotation.EMFModel;

import org.gecko.emf.osgi.annotation.provide.ProvideEMFModel;
import org.gecko.emf.osgi.annotation.provide.ProvideEMFResourceConfigurator;

import org.gecko.emf.osgi.annotation.require.RequireEMF;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * @see EPackageConfigurator
 * @see ResourceFactoryConfigurator
 * @generated
 */
@Component(name="TOSDeviceConfigurator", service= {EPackageConfigurator.class, ResourceFactoryConfigurator.class})
@EMFModel(emf_model_name=TOSDevicePackage.eNAME, emf_model_nsURI={TOSDevicePackage.eNS_URI}, emf_model_version="1.0")
@RequireEMF
@ProvideEMFModel(name = TOSDevicePackage.eNAME, nsURI = { TOSDevicePackage.eNS_URI }, version = "1.0" )
@ProvideEMFResourceConfigurator( name = TOSDevicePackage.eNAME,
	contentType = { "device#1.0" }, 
	fileExtension = {
	"tos"
 	},  
	version = "1.0"
)
public class TOSDeviceConfigurationComponent implements EPackageConfigurator, ResourceFactoryConfigurator {
	private ServiceRegistration<?> packageRegistration = null;
	
	@Activate
	public void activate(BundleContext ctx) {
		TOSDevicePackage p = TOSDevicePackageImpl.init();
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put("emf.model.name", TOSDevicePackage.eNAME);
		properties.put("emf.model.nsURI", TOSDevicePackage.eNS_URI);
		properties.put("fileExtension", "tos");
		properties.put("contentType", "device#1.0");
		String[] serviceClasses = new String[] {TOSDevicePackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, p, properties);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.ResourceFactoryConfigurator#configureResourceFactory(org.eclipse.emf.ecore.resource.Resource.Factory.Registry)
	 * @generated
	 */
	@Override
	public void configureResourceFactory(Registry registry) {
		registry.getExtensionToFactoryMap().put("tos", new TOSDeviceResourceFactoryImpl()); 
		registry.getContentTypeToFactoryMap().put("device#1.0", new TOSDeviceResourceFactoryImpl()); 
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.ResourceFactoryConfigurator#unconfigureResourceFactory(org.eclipse.emf.ecore.resource.Resource.Factory.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureResourceFactory(Registry registry) {
		registry.getExtensionToFactoryMap().remove("tos"); 
		registry.getContentTypeToFactoryMap().remove("device#1.0"); 
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(TOSDevicePackage.eNS_URI, TOSDevicePackageImpl.init());
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		if (packageRegistration != null) {
			packageRegistration.unregister();
		}
		registry.remove(TOSDevicePackage.eNS_URI);
	}
	
	@Deactivate
	public void deactivate() {
		EPackage.Registry.INSTANCE.remove(TOSDevicePackage.eNAME);
		if(packageRegistration != null){
			packageRegistration.unregister();
		}
	}
}
