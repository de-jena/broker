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

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.page.PendingJavaScriptResult;

/**
 * 
 * @author ilenia
 * @since Feb 14, 2023
 */
@NpmPackage(value = "@types/leaflet", version = "1.9.0")
@NpmPackage(value = "leaflet", version = "1.9.0")
@Tag("leaflet-map")
@CssImport("leaflet/dist/leaflet.css")
@JsModule("./components/leafletmap/leaflet-map.ts")
public class LeafletMap extends Component implements HasSize {

	private static final long serialVersionUID = 1L;

	public void setView(double latitude, double longitude, int zoomLevel) {
        getElement().callJsFunction("setView", latitude, longitude, zoomLevel);
    }
	
//	public void addClickListener() {
//        getElement().callJsFunction("addClickListener");
//    }
	
	public PendingJavaScriptResult getCurrentLatitude() {
		PendingJavaScriptResult jsRes = getElement().callJsFunction("getCurrentLatitude");
		return jsRes;
	}

	public PendingJavaScriptResult getCurrentLongitude() {
		PendingJavaScriptResult jsRes = getElement().callJsFunction("getCurrentLongitude");
		return jsRes;
	}

}