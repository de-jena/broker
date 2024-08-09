/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.ilsa.sensinact.geojson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.m2m.qvt.oml.blackbox.java.Module;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.Feature;
import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.LineString;
import org.eclipse.sensinact.gateway.geojson.MultiLineString;
import org.eclipse.sensinact.gateway.geojson.MultiPoint;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.geojson.Polygon;
import org.eclipse.sensinact.model.core.provider.ProviderPackage;
import org.gecko.qvt.osgi.annotations.ModuleName;
import org.gecko.qvt.osgi.annotations.QvtBlackbox;
import org.gecko.qvt.osgi.annotations.TemplatePath;
import org.gecko.qvt.osgi.annotations.TransformatorId;
import org.gecko.qvt.osgi.annotations.UnitQualifiedName;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.jena.ilsa.sensinact.model.ilsa.IlsaPackage;
import de.jena.udp.model.geojson.GeojsonPackage;
import de.jena.udp.model.trafficos.common.TOSCommonPackage;

/**
 * 
 * @author markus
 * @since 22.04.2024
 */
@Component(service = { GeoJsonBlackBox.class })
@QvtBlackbox
@TransformatorId("TLSTrafficLightToIlsa")
@ModuleName("GeoJsonBlackBox")
@UnitQualifiedName("de.jena.ilsa.sensinact.geojson.GeoJsonBlackBox")
@TemplatePath("de.jena.ilsa.sensinact.mmt/transformations/ilsa.qvto")
@Module(packageURIs = { GeojsonPackage.eNS_URI, ProviderPackage.eNS_URI, TOSCommonPackage.eNS_URI })
public final class GeoJsonBlackBox {

	@Reference
	GeojsonPackage geoJsonPackage;
	@Reference
	ProviderPackage providerPackage;
	@Reference
	IlsaPackage ilsaPackage;

	@Operation(contextual = true, description = "Converts from GeoJson into Sensorthing Feature Collections")
	public static FeatureCollection convertToFeatureCollection(de.jena.udp.model.geojson.GeoJSON sarea) {

		FeatureCollection fc = new FeatureCollection();
		if (sarea instanceof de.jena.udp.model.geojson.FeatureCollection) {
			de.jena.udp.model.geojson.FeatureCollection area = (de.jena.udp.model.geojson.FeatureCollection) sarea;

			area.getFeatures().forEach(f -> {
				Feature castFeature = new Feature();
				castFeature.properties = new HashMap<String, Object>();
				castFeature.properties.putAll(f.getProperties().map());

				if (f.getGeometry() instanceof de.jena.udp.model.geojson.LineString) {
					LineString ls = new LineString();
					de.jena.udp.model.geojson.LineString fls = (de.jena.udp.model.geojson.LineString) f;
					fls.getCoordinates().forEach(c -> {
						Coordinates coordinates = new Coordinates();
						coordinates.longitude = c[0];
						coordinates.latitude = c[1];

						ls.coordinates.add(coordinates);
					});
					castFeature.geometry = ls;
					fc.features.add(castFeature);
				}

				if (f.getGeometry() instanceof de.jena.udp.model.geojson.Polygon) {
					Polygon pg = new Polygon();
					de.jena.udp.model.geojson.Polygon fpg = (de.jena.udp.model.geojson.Polygon) f.getGeometry();
					pg.coordinates = new ArrayList<List<Coordinates>>();
					fpg.getCoordinates().forEach(c -> {
						ArrayList<Coordinates> list = new ArrayList<Coordinates>();

						for (Double[] p : c) {
							Coordinates coordinates = new Coordinates();
							coordinates.longitude = p[0];
							coordinates.latitude = p[1];
							list.add(coordinates);
						}

						pg.coordinates.add(list);

					});
					castFeature.geometry = pg;
					fc.features.add(castFeature);
				}
				if (f.getGeometry() instanceof de.jena.udp.model.geojson.Point) {
					Point pg = new Point();
					de.jena.udp.model.geojson.Point fp = (de.jena.udp.model.geojson.Point) f.getGeometry();
					EList<Double> co = fp.getCoordinates();
					Coordinates coordinates = new Coordinates();
					coordinates.longitude = co.get(0);
					coordinates.latitude = co.get(1);
					pg.coordinates = coordinates;
					castFeature.geometry = pg;
					fc.features.add(castFeature);
				}
				if (f.getGeometry() instanceof de.jena.udp.model.geojson.MultiPoint) {
					MultiPoint pg = new MultiPoint();
					de.jena.udp.model.geojson.MultiPoint fmp = (de.jena.udp.model.geojson.MultiPoint) f.getGeometry();
					pg.coordinates = new ArrayList<Coordinates>();

					for (Double[] p : fmp.getCoordinates()) {
						Coordinates coordinates = new Coordinates();
						coordinates.longitude = p[0];
						coordinates.latitude = p[1];
						pg.coordinates.add(coordinates);
					}

					castFeature.geometry = pg;
					fc.features.add(castFeature);
				}
				if (f.getGeometry() instanceof de.jena.udp.model.geojson.MultiLineString) {
					MultiLineString mls = new MultiLineString();
					de.jena.udp.model.geojson.MultiLineString fmls = (de.jena.udp.model.geojson.MultiLineString) f
							.getGeometry();
					mls.coordinates = new ArrayList<List<Coordinates>>();
					fmls.getCoordinates().forEach(c -> {
						ArrayList<Coordinates> list = new ArrayList<Coordinates>();
						for (Double[] p : c) {
							Coordinates coordinates = new Coordinates();
							coordinates.longitude = p[0];
							coordinates.latitude = p[1];
							list.add(coordinates);
						}
						mls.coordinates.add(list);
					});
					castFeature.geometry = mls;
					fc.features.add(castFeature);
				}

			});
		}
		return fc;
	}
}
