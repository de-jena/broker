package de.jena.ilsa.sensinact.mmt;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.model.core.provider.Admin;
import org.eclipse.sensinact.model.core.provider.ProviderFactory;
import org.eclipse.sensinact.model.core.provider.Service;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

import de.jena.ilsa.sensinact.model.ilsa.Ilsa;
import de.jena.ilsa.sensinact.model.ilsa.IlsaFactory;
import de.jena.ilsa.sensinact.model.ilsa.Signal;
import de.jena.udp.model.geojson.FeatureCollection;
import de.jena.udp.model.trafficos.trafficlight.TLConfiguration;
import de.jena.udp.model.trafficos.trafficlight.TLModule;
import de.jena.udp.model.trafficos.trafficlight.TLSignal;
import de.jena.udp.model.trafficos.trafficlight.TLSignalGroup;
import de.jena.udp.model.trafficos.trafficlight.TLSignalState;
import de.jena.udp.model.trafficos.trafficlight.TOSTrafficLightFactory;
import de.jena.udp.model.trafficos.trafficlight.TOSTrafficLightPackage;

@RequireEMFJson
@Component(immediate = true)
public class HalloIlsaMMT {
	@Reference
	IlsaFactory ilsaFactory;
	@Reference
	TOSTrafficLightFactory tlFactory;
	@Reference
	ProviderFactory providerFactory;

	@Reference
	TOSTrafficLightPackage tlPackage;
	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME
			+ "=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ResourceSet> serviceObjects;
	@Reference
	private DataUpdate sensiNact;

	@Activate
	public void activate() throws IOException {
		System.out.println("Load config");
		TLConfiguration config = loadConfig();
		Ilsa ilsa = ilsaFactory.createIlsa(); // Provider
		Admin admin = providerFactory.createAdmin();
		ilsa.setId(config.getIntersectionId());
		ilsa.setAdmin(admin);
		admin.setFriendlyName(config.getIntersectionId());
//		admin.setLocation(null);
		EMap<String, Service> services = ilsa.getServices();

		List<TLSignal> signals = getSignals(config.getModules());
		for (TLSignal tlSignal : signals) {

			FeatureCollection observedArea = tlSignal.getObservedArea();
			EList<Integer> positions = tlSignal.getPositions();
			String channel = tlSignal.getChannel();
			String id = tlSignal.getId();
			TLSignalGroup signalGroup = tlSignal.getSignalGroup();

			TLSignalState signalState = tlFactory.createTLSignalState();
			signalState.setState("🟢🟡");// 🔴
			signalState.setId("K1/1");
//		signalState.get

			// s und signalstate über id mappen

			Signal signal = ilsaFactory.createSignal(); // Service
			signal.setSignalGroup(signalGroup.getId());
			signal.setType(tlSignal.getSignalType().getName());
			signal.setColor(signalState.getState());
//			signal.
//		signal.

			services.put(id, signal);
		}

		sensiNact.pushUpdate(ilsa);

	}

	private List<TLSignal> getSignals(EList<TLModule> modules) {
		return modules.stream().flatMap(m -> m.getSignals().stream()).collect(Collectors.toList());
	}

	/**
	 * @return
	 * @throws IOException
	 * 
	 */
	private TLConfiguration loadConfig() throws IOException {
		ResourceSet resourceSet = serviceObjects.getService();
		Resource res = resourceSet.createResource(URI.createFileURI("/home/grune/traffic/config.json"),
				"application/json");
		try {
			res.load(Collections.singletonMap(EMFJs.OPTION_ROOT_ELEMENT, tlPackage.getTLConfiguration()));
			return (TLConfiguration) res.getContents().get(0);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}
	}
}
