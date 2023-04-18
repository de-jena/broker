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
package de.dim.trafficos.vaadin.helper;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

/**
 * 
 * @author ilenia
 * @since Feb 14, 2023
 */
public class MapComponent extends VerticalLayout {

	/** serialVersionUID */
	private static final long serialVersionUID = 5832647749520676969L;
	private LeafletMap map = new LeafletMap();
	private double latitude, longitude;

	public MapComponent() {
		setSizeFull();
        setPadding(false);
        map.setSizeFull();
        map.setView(50.9271, 11.5892, 13);
        
        HorizontalLayout hl = new HorizontalLayout();
        Label lat = new Label("Lat: " + latitude);
        Label lng = new Label("Lng: " + longitude);
        Button saveBtn = new Button("OK", evt -> {
        	map.getCurrentLatitude().then(latRes -> {
        		latitude = latRes.asNumber();
        		lat.setText("Lat: " + latRes.asNumber());
				map.getCurrentLongitude().then(lngRes -> {
					longitude = lngRes.asNumber();
					lng.setText("Lng: " + lngRes.asNumber());
				});
        	});
        });
        hl.add(lat, lng, saveBtn);
        add(map, hl);
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
}
