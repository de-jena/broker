/*
 */
package de.jena.sensinact.sthbnd.rest.tlc.control.model.control.configuration;

import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlFactory;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage;

import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.TlcControlPackageImpl;

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
@Component(name = "TlcControlConfigurator",
 	reference = @Reference( name = "ResourceSetFactory", service = org.gecko.emf.osgi.ResourceSetFactory.class, cardinality = ReferenceCardinality.MANDATORY)
 )
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=org.eclipse.emf.ecore,de.jena.sensinact.sthbnd.rest.tlc.control.model.control" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=org.eclipse.emf.ecore,de.jena.sensinact.sthbnd.rest.tlc.control.model.control" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.EPackageConfigurator\"" , "uses:=org.eclipse.emf.ecore,de.jena.sensinact.sthbnd.rest.tlc.control.model.control" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class TlcControlConfigurationComponent {
	
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
		TlcControlPackage ePackage = TlcControlPackageImpl.init();
		
		TlcControlEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
		registerEPackageService(ePackage, packageConfigurator, ctx);
		registerEFactoryService(ePackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * Registers the TlcControlEPackageConfigurator as a service.
	 *
	 * @generated
	 */
	private TlcControlEPackageConfigurator registerEPackageConfiguratorService(TlcControlPackage ePackage, BundleContext ctx){
		TlcControlEPackageConfigurator packageConfigurator = new TlcControlEPackageConfigurator(ePackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}

	/**
	 * Registers the TlcControlPackage as a service.
	 *
	 * @generated
	 */
	private void registerEPackageService(TlcControlPackage ePackage, EPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {TlcControlPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the TlcControlFactory as a service.
	 *
	 * @generated
	 */
	private void registerEFactoryService(TlcControlPackage ePackage, EPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {TlcControlFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getTlcControlFactory(), properties);
	}

	private void registerConditionService(EPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, TlcControlPackage.eNS_URI);
		conditionRegistration = ctx.registerService(Condition.class, Condition.INSTANCE, properties);
	}

	/**
	 * Deactivates and unregisteres everything.
	 *
	 * @generated
	 */
	@Deactivate
	public void deactivate() {
		conditionRegistration.unregister();
		eFactoryRegistration.unregister();
		packageRegistration.unregister();
		ePackageConfiguratorRegistration.unregister();
		EPackage.Registry.INSTANCE.remove(TlcControlPackage.eNS_URI);
	}
}
