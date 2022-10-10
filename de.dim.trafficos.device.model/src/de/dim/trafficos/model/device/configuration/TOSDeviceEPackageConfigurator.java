/*
 */
package de.dim.trafficos.model.device.configuration;

import de.dim.trafficos.model.device.TOSDevicePackage;

import java.util.HashMap;
import java.util.Map;

import org.gecko.emf.osgi.EMFNamespaces;
import org.gecko.emf.osgi.EPackageConfigurator;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * @see EPackageConfigurator
 * @generated
 */
public class TOSDeviceEPackageConfigurator implements EPackageConfigurator {
	
	private TOSDevicePackage ePackage;

	protected TOSDeviceEPackageConfigurator(TOSDevicePackage ePackage){
		this.ePackage = ePackage;
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(TOSDevicePackage.eNS_URI, ePackage);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(TOSDevicePackage.eNS_URI);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageConfigurator#getServiceProperties()
	 * @generated
	 */
	@Override
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, TOSDevicePackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, TOSDevicePackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "tos");
		properties.put(EMFNamespaces.EMF_MODEL_CONTENT_TYPE, "device#1.0");
		properties.put(EMFNamespaces.EMF_CONFIGURATOR_VERSION, "1.0");
		return properties;
	}
}