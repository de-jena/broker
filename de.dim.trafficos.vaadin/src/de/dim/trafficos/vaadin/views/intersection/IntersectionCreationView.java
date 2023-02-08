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

import org.gecko.vaadin.whiteboard.annotations.VaadinComponent;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.tabs.TabSheetVariant;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage;
import de.dim.trafficos.vaadin.views.main.MainView;

/**
 * 
 * @author ilenia
 * @since Feb 7, 2023
 */
@Route(value = "intersection", layout = MainView.class)
@RouteAlias(value = "", layout = MainView.class)
@PageTitle("Intersection Creation")
@Component(name = "IntersectionCreationView", service=IntersectionCreationView.class, scope = ServiceScope.PROTOTYPE)
@VaadinComponent()
public class IntersectionCreationView extends VerticalLayout {
	
	@Reference
	TOSTrafficLightPackage tlPackage;

	/** serialVersionUID */
	private static final long serialVersionUID = -1464134206403762518L;
	
	@Activate
	public void renderView() {
		TabSheet tabSheet = new TabSheet();
		tabSheet.setSizeFull();
		tabSheet.addClassName("tab-sheet");
		tabSheet.addThemeVariants(TabSheetVariant.LUMO_TABS_EQUAL_WIDTH_TABS);
		IntersectionTab intersectionTab = new IntersectionTab();		
		TrafficLightTab tlTab = new TrafficLightTab(tlPackage);
		tlTab.setEnabled(false);
		tabSheet.add("Intersection", intersectionTab);	
		tabSheet.add("Traffic Lights", tlTab);	
		add(tabSheet);
		
//		Listeners
		intersectionTab.getSubmitBtn().addClickListener(evt -> {
			List<DisplayedRoad> displayedRoads = intersectionTab.getRoads();
//			TODO: call the IntersectionService and create and save the actual Intersection!
			tlTab.setEnabled(true);
		});
	}

}
