/*
 */
package de.dim.trafficos.trafficlight.model.trafficlight.configuration;

import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightFactory;
import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage;

import de.dim.trafficos.trafficlight.model.trafficlight.impl.TOSTrafficLightPackageImpl;

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
@Component(name = "TOSTrafficLightConfigurator",
 	reference = @Reference( name = "ResourceSetFactory", service = org.gecko.emf.osgi.ResourceSetFactory.class, cardinality = ReferenceCardinality.MANDATORY)
 )
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=org.eclipse.emf.ecore,de.dim.trafficos.trafficlight.model.trafficlight" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=org.eclipse.emf.ecore,de.dim.trafficos.trafficlight.model.trafficlight" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.EPackageConfigurator\"" , "uses:=org.eclipse.emf.ecore,de.dim.trafficos.trafficlight.model.trafficlight" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class TOSTrafficLightConfigurationComponent {
	
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
		TOSTrafficLightPackage ePackage = TOSTrafficLightPackageImpl.eINSTANCE;
		
		TOSTrafficLightEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
		registerEPackageService(ePackage, packageConfigurator, ctx);
		registerEFactoryService(ePackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * Registers the TOSTrafficLightEPackageConfigurator as a service.
	 *
	 * @generated
	 */
	private TOSTrafficLightEPackageConfigurator registerEPackageConfiguratorService(TOSTrafficLightPackage ePackage, BundleContext ctx){
		TOSTrafficLightEPackageConfigurator packageConfigurator = new TOSTrafficLightEPackageConfigurator(ePackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}

	/**
	 * Registers the TOSTrafficLightPackage as a service.
	 *
	 * @generated
	 */
	private void registerEPackageService(TOSTrafficLightPackage ePackage, TOSTrafficLightEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {TOSTrafficLightPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the TOSTrafficLightFactory as a service.
	 *
	 * @generated
	 */
	private void registerEFactoryService(TOSTrafficLightPackage ePackage, TOSTrafficLightEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {TOSTrafficLightFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getTOSTrafficLightFactory(), properties);
	}

	private void registerConditionService(TOSTrafficLightEPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, TOSTrafficLightPackage.eNS_URI);
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
		EPackage.Registry.INSTANCE.remove(TOSTrafficLightPackage.eNS_URI);
	}
}
