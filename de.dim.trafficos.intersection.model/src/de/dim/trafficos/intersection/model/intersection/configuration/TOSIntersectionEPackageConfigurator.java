/*
 */
package de.dim.trafficos.intersection.model.intersection.configuration;

import de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage;

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
public class TOSIntersectionEPackageConfigurator implements EPackageConfigurator {
	
	private TOSIntersectionPackage ePackage;

	protected TOSIntersectionEPackageConfigurator(TOSIntersectionPackage ePackage){
		this.ePackage = ePackage;
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(TOSIntersectionPackage.eNS_URI, ePackage);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(TOSIntersectionPackage.eNS_URI);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageConfigurator#getServiceProperties()
	 * @generated
	 */
	@Override
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, TOSIntersectionPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, TOSIntersectionPackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "tosintersection");
		properties.put(EMFNamespaces.EMF_CONFIGURATOR_VERSION, "1.0");
		return properties;
	}
}