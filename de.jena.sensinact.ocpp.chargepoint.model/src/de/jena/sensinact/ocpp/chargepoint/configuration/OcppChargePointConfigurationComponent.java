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
package de.jena.sensinact.ocpp.chargepoint.configuration;

import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

import de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl;

import de.jena.sensinact.ocpp.chargepoint.util.OcppChargePointResourceFactoryImpl;

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
@Component(name="OcppChargePointConfigurator", service= {EPackageConfigurator.class, ResourceFactoryConfigurator.class})
@EMFModel(emf_model_name=OcppChargePointPackage.eNAME, emf_model_nsURI={OcppChargePointPackage.eNS_URI}, emf_model_version="1.0")
@RequireEMF
@ProvideEMFModel(name = OcppChargePointPackage.eNAME, nsURI = { OcppChargePointPackage.eNS_URI }, version = "1.0" )
@ProvideEMFResourceConfigurator( name = OcppChargePointPackage.eNAME,
	contentType = { "" }, 
	fileExtension = {
	"ocppchargepoint"
 	},  
	version = "1.0"
)
public class OcppChargePointConfigurationComponent implements EPackageConfigurator, ResourceFactoryConfigurator {
	private ServiceRegistration<?> packageRegistration = null;
	
	@Activate
	public void activate(BundleContext ctx) {
		OcppChargePointPackage p = OcppChargePointPackageImpl.init();
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put("emf.model.name", OcppChargePointPackage.eNAME);
		properties.put("emf.model.nsURI", OcppChargePointPackage.eNS_URI);
		properties.put("fileExtension", "ocppchargepoint");
		String[] serviceClasses = new String[] {OcppChargePointPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, p, properties);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.ResourceFactoryConfigurator#configureResourceFactory(org.eclipse.emf.ecore.resource.Resource.Factory.Registry)
	 * @generated
	 */
	@Override
	public void configureResourceFactory(Registry registry) {
		registry.getExtensionToFactoryMap().put("ocppchargepoint", new OcppChargePointResourceFactoryImpl()); 
		 
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.ResourceFactoryConfigurator#unconfigureResourceFactory(org.eclipse.emf.ecore.resource.Resource.Factory.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureResourceFactory(Registry registry) {
		registry.getExtensionToFactoryMap().remove("ocppchargepoint"); 
		 
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(OcppChargePointPackage.eNS_URI, OcppChargePointPackageImpl.init());
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
		registry.remove(OcppChargePointPackage.eNS_URI);
	}
	
	@Deactivate
	public void deactivate() {
		EPackage.Registry.INSTANCE.remove(OcppChargePointPackage.eNAME);
		if(packageRegistration != null){
			packageRegistration.unregister();
		}
	}
}
