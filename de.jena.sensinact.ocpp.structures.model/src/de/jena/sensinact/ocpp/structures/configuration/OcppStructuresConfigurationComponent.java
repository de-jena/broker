/*
 */
package de.jena.sensinact.ocpp.structures.configuration;

import de.jena.sensinact.ocpp.structures.OcppStructuresPackage;

import de.jena.sensinact.ocpp.structures.impl.OcppStructuresPackageImpl;

import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.emf.ecore.EPackage;

import org.gecko.emf.osgi.EMFNamespaces;
import org.gecko.emf.osgi.EPackageConfigurator;

import org.gecko.emf.osgi.annotation.EMFModel;

import org.gecko.emf.osgi.annotation.provide.ProvideEMFModel;

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
@Component(name="OcppStructuresConfigurator", service= EPackageConfigurator.class)
@EMFModel(name=OcppStructuresPackage.eNAME, nsURI={OcppStructuresPackage.eNS_URI}, version="1.0.0")
@ProvideEMFModel(name = OcppStructuresPackage.eNAME, nsURI = { OcppStructuresPackage.eNS_URI }, version = "1.0.0")
public class OcppStructuresConfigurationComponent implements EPackageConfigurator {
	private ServiceRegistration<?> packageRegistration = null;
	
	@Activate
	public void activate(BundleContext ctx) {
		OcppStructuresPackage p = OcppStructuresPackageImpl.init();
		if(p == null){
			p= OcppStructuresPackageImpl.eINSTANCE;
			EPackage.Registry.INSTANCE.put(OcppStructuresPackage.eNS_URI,p);
		}
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, OcppStructuresPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, OcppStructuresPackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "ocppstructures");
		String[] serviceClasses = new String[] {OcppStructuresPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, p, properties);
	}

	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(OcppStructuresPackage.eNS_URI, OcppStructuresPackageImpl.init());
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(OcppStructuresPackage.eNS_URI);
	}
	
	@Deactivate
	public void deactivate() {
		EPackage.Registry.INSTANCE.remove(OcppStructuresPackage.eNS_URI);
		if(packageRegistration != null){
			packageRegistration.unregister();
		}
	}
}
