/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.trafficos.vaadin.views.intersection.system.search;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.gecko.vaadin.whiteboard.annotations.VaadinComponent;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.util.pushstream.PushStream;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import de.dim.trafficos.apis.IntersectionSystemService;
import de.dim.trafficos.apis.TLService;
import de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem;
import de.dim.trafficos.trafficlight.model.trafficlight.ChangedState;
import de.dim.trafficos.trafficlight.model.trafficlight.LightSignal;
import de.dim.trafficos.trafficlight.model.trafficlight.SignalValueType;
import de.dim.trafficos.trafficlight.model.trafficlight.TLModule;
import de.dim.trafficos.trafficlight.model.trafficlight.TLUpdate;
import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage;
import de.dim.trafficos.vaadin.views.main.MainView;

/**
 * 
 * @author ilenia
 * @since Feb 23, 2023
 */
@Route(value = "search", layout = MainView.class)
@PageTitle("Intersection System Search")
@Component(name = "IntersectionSystemSearchView", service=IntersectionSystemSearchView.class, scope = ServiceScope.PROTOTYPE)
@VaadinComponent()
public class IntersectionSystemSearchView extends VerticalLayout {

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	IntersectionSystemService intersectionSystemService;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	TLService tlService;

	@Reference(target = "(id=dim)")
	private MessagingService messagingService;

	@Reference
	TOSTrafficLightPackage tosTLPackage;

	@Reference(target = "(&(emf.model.name=trafficlight)(emf.resource.configurator.name=EMFJson))", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ResourceSet resourceSet;

	/** serialVersionUID */
	private static final long serialVersionUID = 6904213598828852819L;
	private static final String TOPIC_ROOT = "ilsa/";
	private Grid<IntersectionSystem> intersectionSystemGrid;
	private TLModuleGrid moduleGrid = new TLModuleGrid();
	private Map<String, PushStream<Message>> subscriptionsMap = new HashMap<>();
	private List<DisplayedTLModule> displayedModules = new ArrayList<>();
	private UI currentUI;

	@Activate
	public void renderView() {
		setSizeFull();
		currentUI = UI.getCurrent();
		Button showBtn = new Button("Show All", evt -> {
			List<IntersectionSystem> intersectionSystems = intersectionSystemService.getAllIntersectionSystems();			
			intersectionSystemGrid.setItems(intersectionSystems);
			intersectionSystemGrid.setVisible(true);			
		});

		createIntersectionSystemGrid(); 
		moduleGrid.setVisible(false);
		add(showBtn, intersectionSystemGrid, moduleGrid);
	}

	private void createIntersectionSystemGrid() {
		intersectionSystemGrid = new Grid<IntersectionSystem>();
		intersectionSystemGrid.addColumn(IntersectionSystem::getIntersectionName).setHeader("Intersection Name").setAutoWidth(true);
		intersectionSystemGrid.addColumn(new ComponentRenderer<>(Button::new, (btn, intersectionSystem) -> {
			btn.setText("Subscribe");
			btn.addClickListener(evt -> {
				if(btn.getText().equals("Subscribe")) {
					doSubscribe(intersectionSystem);
					btn.setText("Unsubscribe");
				}
				else {
					doUnsubscribe(intersectionSystem);
					btn.setText("Subscribe");
				}
			});
		})).setHeader("Subscribe/Unsubscribe").setAutoWidth(true);
		intersectionSystemGrid.setVisible(false);	
	}

	private void doUnsubscribe(IntersectionSystem intersectionSystem) {
		PushStream<Message> subscription = subscriptionsMap.remove(intersectionSystem.getId());
		if(subscription != null) subscription.close();		
		moduleGrid.setItems(Collections.emptyList());
		moduleGrid.setVisible(false);
		currentUI.setPollInterval(-1);
	}



	private void doSubscribe(IntersectionSystem intersectionSystem) {
		try {
			PushStream<Message> subscription = messagingService.subscribe(TOPIC_ROOT+intersectionSystem.getIntersectionName()+"/#");
			subscription.forEach(this::handleTrafficLightMessage);
			subscriptionsMap.put(intersectionSystem.getId(), subscription);
		} catch (Exception e) {
			Notification.show("Error while subscribing to topic " + TOPIC_ROOT+intersectionSystem.getIntersectionName()+"/#").addThemeVariants(NotificationVariant.LUMO_ERROR);
		}
		List<TLModule> modules = tlService.getTLModulesById(intersectionSystem.getTlModuleIds().toArray(new String[0]));
		displayedModules = new ArrayList<>();
		modules.forEach(m -> {
			m.getSignalTransmitter().forEach(st -> {
				DisplayedTLModule displayedModule = new DisplayedTLModule(String.valueOf(m.getAddress()), st.getSignalGroup().getId(), st.getLightSignal());
				displayedModules.add(displayedModule);
			});
		});
		moduleGrid.setItems(displayedModules);
		moduleGrid.setVisible(true);	
		currentUI.setPollInterval(500);
	}

	private void handleTrafficLightMessage(Message message) {
		String topic = message.topic();
		System.out.println("Message arrived! " + topic);
		String[] topicSegments = topic.split("/");
		if(topicSegments.length != 3) return;
		String moduleAddress = topicSegments[2];

		DisplayedTLModule module = displayedModules.stream().filter(m -> moduleAddress.equals(m.getAddress())).findFirst().orElse(null);
		if(module == null) return;

		byte[] content = message.payload().array();
		if (content.length == 0)
			return;

		Resource res = resourceSet.createResource(URI.createFileURI("temp.json"), "application/json");
		try {
			res.load(new ByteArrayInputStream(content),
					Collections.singletonMap(EMFJs.OPTION_ROOT_ELEMENT, tosTLPackage.getTLUpdate()));
			EList<EObject> contents = res.getContents();
			TLUpdate update = (TLUpdate) contents.get(0);
			for (ChangedState state : update.getChangedStates()) {
				String color = state.getColor();
				boolean on = state.isOn();
				SignalValueType value = getLightSignalFromColor(color);
				LightSignal light = module.getLights().stream().filter(l -> value.equals(l.getValue())).findFirst().orElse(null);
				if(light != null) light.setOn(on);
				currentUI.access(() -> {
					moduleGrid.getSignalLightGridsMap().get(module.getAddress()).getDataCommunicator().refresh(light);
				});
			}
		} catch (IOException e) {
			Notification.show("Error while decoding message from MQTT").addThemeVariants(NotificationVariant.LUMO_ERROR);
			e.printStackTrace();
		}
	}

	private SignalValueType getLightSignalFromColor(String color) {
		switch(color) {
		case "red":
			return SignalValueType.RED;
		case "green":
			return SignalValueType.GREEN;
		case "yellow":
			return SignalValueType.AMBER;
		default:
			throw new IllegalArgumentException("Color " + color + " not known!");
		}
	}
}
