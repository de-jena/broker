/*
 */
package de.jena.sensinact.ocpp.chargepoint.configuration;

import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

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
public class OcppChargePointEPackageConfigurator implements EPackageConfigurator {
	
	private OcppChargePointPackage ePackage;

	protected OcppChargePointEPackageConfigurator(OcppChargePointPackage ePackage){
		this.ePackage = ePackage;
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(OcppChargePointPackage.eNS_URI, ePackage);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(OcppChargePointPackage.eNS_URI);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageConfigurator#getServiceProperties()
	 * @generated
	 */
	@Override
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, OcppChargePointPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, OcppChargePointPackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "ocppchargepoint");
		properties.put(EMFNamespaces.EMF_CONFIGURATOR_VERSION, "1.0");
		return properties;
	}
}