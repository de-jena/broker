/*
 */
package de.dim.trafficos.intersectionsystem.model.intersectionsystem.configuration;

import de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemFactory;
import de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemPackage;

import de.dim.trafficos.intersectionsystem.model.intersectionsystem.impl.TOSIntersectionSystemPackageImpl;

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
@Component(name = "TOSIntersectionSystemConfigurator",
 	reference = @Reference( name = "ResourceSetFactory", service = org.gecko.emf.osgi.ResourceSetFactory.class, cardinality = ReferenceCardinality.MANDATORY)
 )
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=org.eclipse.emf.ecore,de.dim.trafficos.intersectionsystem.model.intersectionsystem" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemPackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=org.eclipse.emf.ecore,de.dim.trafficos.intersectionsystem.model.intersectionsystem" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.EPackageConfigurator\"" , "uses:=org.eclipse.emf.ecore,de.dim.trafficos.intersectionsystem.model.intersectionsystem" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class TOSIntersectionSystemConfigurationComponent {
	
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
		TOSIntersectionSystemPackage ePackage = TOSIntersectionSystemPackageImpl.eINSTANCE;
		
		TOSIntersectionSystemEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
		registerEPackageService(ePackage, packageConfigurator, ctx);
		registerEFactoryService(ePackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * Registers the TOSIntersectionSystemEPackageConfigurator as a service.
	 *
	 * @generated
	 */
	private TOSIntersectionSystemEPackageConfigurator registerEPackageConfiguratorService(TOSIntersectionSystemPackage ePackage, BundleContext ctx){
		TOSIntersectionSystemEPackageConfigurator packageConfigurator = new TOSIntersectionSystemEPackageConfigurator(ePackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}

	/**
	 * Registers the TOSIntersectionSystemPackage as a service.
	 *
	 * @generated
	 */
	private void registerEPackageService(TOSIntersectionSystemPackage ePackage, TOSIntersectionSystemEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {TOSIntersectionSystemPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the TOSIntersectionSystemFactory as a service.
	 *
	 * @generated
	 */
	private void registerEFactoryService(TOSIntersectionSystemPackage ePackage, TOSIntersectionSystemEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {TOSIntersectionSystemFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getTOSIntersectionSystemFactory(), properties);
	}

	private void registerConditionService(TOSIntersectionSystemEPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, TOSIntersectionSystemPackage.eNS_URI);
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
		EPackage.Registry.INSTANCE.remove(TOSIntersectionSystemPackage.eNS_URI);
	}
}
