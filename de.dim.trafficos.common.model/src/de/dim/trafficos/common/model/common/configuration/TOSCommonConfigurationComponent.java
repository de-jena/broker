/*
 */
package de.dim.trafficos.common.model.common.configuration;

import de.dim.trafficos.common.model.common.TOSCommonFactory;
import de.dim.trafficos.common.model.common.TOSCommonPackage;

import de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl;

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
@Component(name = "TOSCommonConfigurator",
 	reference = @Reference( name = "ResourceSetFactory", service = org.gecko.emf.osgi.ResourceSetFactory.class, cardinality = ReferenceCardinality.MANDATORY)
 )
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.dim.trafficos.common.model.common.TOSCommonFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=org.eclipse.emf.ecore,de.dim.trafficos.common.model.common" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.dim.trafficos.common.model.common.TOSCommonPackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=org.eclipse.emf.ecore,de.dim.trafficos.common.model.common" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.EPackageConfigurator\"" , "uses:=org.eclipse.emf.ecore,de.dim.trafficos.common.model.common" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class TOSCommonConfigurationComponent {
	
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
		TOSCommonPackage ePackage = TOSCommonPackageImpl.eINSTANCE;
		
		TOSCommonEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
		registerEPackageService(ePackage, packageConfigurator, ctx);
		registerEFactoryService(ePackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * Registers the TOSCommonEPackageConfigurator as a service.
	 *
	 * @generated
	 */
	private TOSCommonEPackageConfigurator registerEPackageConfiguratorService(TOSCommonPackage ePackage, BundleContext ctx){
		TOSCommonEPackageConfigurator packageConfigurator = new TOSCommonEPackageConfigurator(ePackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}

	/**
	 * Registers the TOSCommonPackage as a service.
	 *
	 * @generated
	 */
	private void registerEPackageService(TOSCommonPackage ePackage, TOSCommonEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {TOSCommonPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the TOSCommonFactory as a service.
	 *
	 * @generated
	 */
	private void registerEFactoryService(TOSCommonPackage ePackage, TOSCommonEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {TOSCommonFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getTOSCommonFactory(), properties);
	}

	private void registerConditionService(TOSCommonEPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, TOSCommonPackage.eNS_URI);
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
		EPackage.Registry.INSTANCE.remove(TOSCommonPackage.eNS_URI);
	}
}
