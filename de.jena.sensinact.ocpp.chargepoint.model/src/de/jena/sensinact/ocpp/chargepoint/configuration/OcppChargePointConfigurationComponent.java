/*
 */
package de.jena.sensinact.ocpp.chargepoint.configuration;

import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

import de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl;

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
@Component(name="OcppChargePointConfigurator", service= EPackageConfigurator.class)
@EMFModel(name=OcppChargePointPackage.eNAME, nsURI={OcppChargePointPackage.eNS_URI}, version="1.0.0")
@ProvideEMFModel(name = OcppChargePointPackage.eNAME, nsURI = { OcppChargePointPackage.eNS_URI }, version = "1.0.0")
public class OcppChargePointConfigurationComponent implements EPackageConfigurator {
	private ServiceRegistration<?> packageRegistration = null;
	
	@Activate
	public void activate(BundleContext ctx) {
		OcppChargePointPackage p = OcppChargePointPackageImpl.init();
		if(p == null){
			p= OcppChargePointPackageImpl.eINSTANCE;
			EPackage.Registry.INSTANCE.put(OcppChargePointPackage.eNS_URI,p);
		}
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, OcppChargePointPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, OcppChargePointPackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "ocppchargepoint");
		String[] serviceClasses = new String[] {OcppChargePointPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, p, properties);
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
		registry.remove(OcppChargePointPackage.eNS_URI);
	}
	
	@Deactivate
	public void deactivate() {
		EPackage.Registry.INSTANCE.remove(OcppChargePointPackage.eNS_URI);
		if(packageRegistration != null){
			packageRegistration.unregister();
		}
	}
}
