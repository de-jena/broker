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
package de.dim.trafficos.vaadin.views.intersection;

import java.util.List;
import java.util.stream.Collectors;

import org.gecko.vaadin.whiteboard.annotations.VaadinComponent;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.tabs.TabSheetVariant;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

import de.dim.trafficos.apis.IntersectionService;
import de.dim.trafficos.apis.IntersectionSystemService;
import de.dim.trafficos.apis.TLService;
import de.dim.trafficos.common.model.common.TOSCommonPackage;
import de.dim.trafficos.intersection.model.intersection.Intersection;
import de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem;
import de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemPackage;
import de.dim.trafficos.trafficlight.model.trafficlight.TLModule;
import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage;
import de.dim.trafficos.vaadin.views.main.MainView;

/**
 * 
 * @author ilenia
 * @since Feb 7, 2023
 */
@Route(value = "intersectionsystem", layout = MainView.class)
@RouteAlias(value = "", layout = MainView.class)
@PageTitle("Intersection System Creation")
@NpmPackage(value = "leaflet", version = "^1.7.1")
@Component(name = "IntersectionSystemCreationView", service=IntersectionSystemCreationView.class, scope = ServiceScope.PROTOTYPE)
@VaadinComponent()
public class IntersectionSystemCreationView extends VerticalLayout {
	
	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	TLService tlService;
	
	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	IntersectionService intersectionService;
	
	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	IntersectionSystemService intersectionSystemService;
	
	@Reference
	TOSTrafficLightPackage tlPackage;
	
	@Reference
	TOSIntersectionSystemPackage intersectionSysPackage;
	
	@Reference
	TOSCommonPackage commonPackage;

	/** serialVersionUID */
	private static final long serialVersionUID = -1464134206403762518L;
	private Intersection intersection;
	private List<TLModule> tlModules;
	
	@Activate
	public void renderView() {
		TabSheet tabSheet = new TabSheet();
		tabSheet.setSizeFull();
		tabSheet.addClassName("tab-sheet");
		tabSheet.addThemeVariants(TabSheetVariant.LUMO_TABS_EQUAL_WIDTH_TABS);
		IntersectionTab intersectionTab = new IntersectionTab();		
		TrafficLightTab tlTab = new TrafficLightTab(tlPackage, commonPackage);
		tlTab.setEnabled(false);
		tabSheet.add("Intersection", intersectionTab);	
		tabSheet.add("Traffic Lights", tlTab).setEnabled(false);
		
		HorizontalLayout btnLayout = new HorizontalLayout();
		btnLayout.setWidthFull();
		btnLayout.setAlignItems(Alignment.CENTER);
		btnLayout.setAlignSelf(Alignment.CENTER);
		Button clearBtn = new Button("Clear All");
		Button saveBtn = new Button("Create System");
		saveBtn.setEnabled(false);
		btnLayout.add(clearBtn, saveBtn);
		
		add(tabSheet, btnLayout);
		
//		Listeners
		intersectionTab.getSubmitBtn().addClickListener(evt -> {
			intersection = intersectionService.createIntersection(intersectionTab.getResult().stream().collect(Collectors.toMap(d -> d.getIndex(), d-> d.getType())));
			if(intersection == null) {
				Notification.show("Something went wrong when creating the intersection!").addThemeVariants(NotificationVariant.LUMO_ERROR);
			}
			else {
				intersection.setName(intersectionTab.getIntersectionName());
				intersection.setDescription(intersectionTab.getIntersectionDescr());
				intersectionService.saveIntersection(intersection);
				Notification.show("Intersection saved successfully!").addThemeVariants(NotificationVariant.LUMO_SUCCESS);
				tabSheet.getTabAt(1).setEnabled(true);
			}
		});
		
		tlTab.getSubmitBtn().addClickListener(evt -> {
			tlModules = tlTab.getResult();
			tlModules = tlService.saveTLModules(tlModules.toArray(new TLModule[0]));	
			Notification.show("TL Modules saved successfully!").addThemeVariants(NotificationVariant.LUMO_SUCCESS);
			if(intersection != null) saveBtn.setEnabled(true);
		});
		
		clearBtn.addClickListener(evt -> {
			saveBtn.setEnabled(false);
			intersectionTab.clearTab();
			tlTab.clearTab();
		});
		
		saveBtn.addClickListener(evt -> {
			IntersectionSystem intersectionSystem = intersectionSysPackage.getTOSIntersectionSystemFactory().createIntersectionSystem();
			intersectionSystem.setIntersectionId(intersection.getId());
			intersectionSystem.getTlModuleIds().addAll(tlModules.stream().map(m -> m.getId()).collect(Collectors.toList()));
			intersectionSystemService.saveIntersectionSystem(intersectionSystem);
			Notification.show("Intersection System saved successfully!").addThemeVariants(NotificationVariant.LUMO_SUCCESS);
			saveBtn.setEnabled(false);
			intersectionTab.clearTab();
			tlTab.clearTab();
		});
	}

}
