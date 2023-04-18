/*
 */
package de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.configuration;

import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadFactory;
import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadPackage;

import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkPayloadPackageImpl;

import java.util.Hashtable;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import org.gecko.emf.osgi.EPackageConfigurator;

import org.osgi.annotation.bundle.Capability;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import org.osgi.service.condition.Condition;

/**
 * The <b>PackageConfiguration</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * 
 * @generated
 */
@Component(name = "UplinkPayloadConfigurator",
 	reference = @Reference( name = "ResourceSetFactory", service = org.gecko.emf.osgi.ResourceSetFactory.class, cardinality = ReferenceCardinality.MANDATORY)
 )
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=org.eclipse.emf.ecore,de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadPackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=org.eclipse.emf.ecore,de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.EPackageConfigurator\"" , "uses:=org.eclipse.emf.ecore,de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class UplinkPayloadConfigurationComponent {
	
	private ServiceRegistration<?> packageRegistration = null;
	private ServiceRegistration<EPackageConfigurator> ePackageConfiguratorRegistration = null;
	private ServiceRegistration<?> eFactoryRegistration = null;
	private ServiceRegistration<?> conditionRegistration = null;

	/**
	 * Activates the Configuration Component.
	 *
	 * @generated
	 */
	@Activate
	public void activate(BundleContext ctx) {
		UplinkPayloadPackage ePackage = UplinkPayloadPackageImpl.eINSTANCE;
		
		UplinkPayloadEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
		registerEPackageService(ePackage, packageConfigurator, ctx);
		registerEFactoryService(ePackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * Registers the UplinkPayloadEPackageConfigurator as a service.
	 *
	 * @generated
	 */
	private UplinkPayloadEPackageConfigurator registerEPackageConfiguratorService(UplinkPayloadPackage ePackage, BundleContext ctx){
		UplinkPayloadEPackageConfigurator packageConfigurator = new UplinkPayloadEPackageConfigurator(ePackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}

	/**
	 * Registers the UplinkPayloadPackage as a service.
	 *
	 * @generated
	 */
	private void registerEPackageService(UplinkPayloadPackage ePackage, UplinkPayloadEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {UplinkPayloadPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the UplinkPayloadFactory as a service.
	 *
	 * @generated
	 */
	private void registerEFactoryService(UplinkPayloadPackage ePackage, UplinkPayloadEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {UplinkPayloadFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getUplinkPayloadFactory(), properties);
	}

	private void registerConditionService(UplinkPayloadEPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, UplinkPayloadPackage.eNS_URI);
		conditionRegistration = ctx.registerService(Condition.class, Condition.INSTANCE, properties);
	}

	/**
	 * Deactivates and unregisters everything.
	 *
	 * @generated
	 */
	@Deactivate
	public void deactivate() {
		conditionRegistration.unregister();
		eFactoryRegistration.unregister();
		packageRegistration.unregister();
		ePackageConfiguratorRegistration.unregister();
		EPackage.Registry.INSTANCE.remove(UplinkPayloadPackage.eNS_URI);
	}
}
