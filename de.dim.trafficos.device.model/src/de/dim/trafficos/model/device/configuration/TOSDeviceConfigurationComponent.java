/*
 */
package de.dim.trafficos.model.device.configuration;

import de.dim.trafficos.model.device.TOSDevicePackage;

import de.dim.trafficos.model.device.impl.TOSDevicePackageImpl;

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
@Component(name="TOSDeviceConfigurator", service= EPackageConfigurator.class)
@EMFModel(name=TOSDevicePackage.eNAME, nsURI={TOSDevicePackage.eNS_URI}, version="1.0.0")
@ProvideEMFModel(name = TOSDevicePackage.eNAME, nsURI = { TOSDevicePackage.eNS_URI }, version = "1.0.0")
public class TOSDeviceConfigurationComponent implements EPackageConfigurator {
	private ServiceRegistration<?> packageRegistration = null;
	
	@Activate
	public void activate(BundleContext ctx) {
		TOSDevicePackage p = TOSDevicePackageImpl.init();
		if(p == null){
			p= TOSDevicePackageImpl.eINSTANCE;
			EPackage.Registry.INSTANCE.put(TOSDevicePackage.eNS_URI,p);
		}
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, TOSDevicePackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, TOSDevicePackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "tos");
		properties.put(EMFNamespaces.EMF_MODEL_CONTENT_TYPE, "device#1.0");
		String[] serviceClasses = new String[] {TOSDevicePackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, p, properties);
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
		registry.remove(TOSDevicePackage.eNS_URI);
	}
	
	@Deactivate
	public void deactivate() {
		EPackage.Registry.INSTANCE.remove(TOSDevicePackage.eNS_URI);
		if(packageRegistration != null){
			packageRegistration.unregister();
		}
	}
}
