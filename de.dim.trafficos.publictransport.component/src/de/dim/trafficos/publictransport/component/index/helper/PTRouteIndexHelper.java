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
package de.dim.trafficos.publictransport.component.index.helper;

import java.util.Collections;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.StringField;
import org.apache.lucene.index.Term;
import org.gecko.emf.search.document.EObjectContextObjectBuilder;
import org.gecko.emf.search.document.EObjectDocumentIndexObjectContext;
import org.gecko.search.IndexActionType;

import de.jena.udp.model.trafficos.publictransport.PTRoute;

/**
 * 
 * @author ilenia
 * @since Jun 30, 2023
 */
public class PTRouteIndexHelper {

	public static final String PT_ROUTE_ID = "pt_route_id";
	public static final String PT_ROUTE_TYPE = "pt_route_type";
	public static final String PT_ROUTE_SHORT_NAME = "pt_route_short_name";
	public static final String PT_ROUTE_LONG_NAME = "pt_route_long_name";
	public static final String PT_ROUTE_COLOR = "pt_route_color";

	public static EObjectDocumentIndexObjectContext mapPTRoute(PTRoute route, IndexActionType indexAction) {

		Document doc = new Document();
		doc.add(new StringField("id", route.getId(), Store.YES));
		doc.add(new StringField(PT_ROUTE_ID, route.getRouteId(), Store.NO));
		doc.add(new StringField(PT_ROUTE_TYPE, route.getType().toString(), Store.NO));
		if(route.getShortName() != null) {
			doc.add(new StringField(PT_ROUTE_SHORT_NAME, route.getShortName(), Store.NO));
		}
		if(route.getLongName() != null) {
			doc.add(new StringField(PT_ROUTE_LONG_NAME, route.getLongName(), Store.NO));
		}
		if(route.getColor() != null) {
			doc.add(new StringField(PT_ROUTE_COLOR, route.getColor(), Store.NO));
		}

		EObjectContextObjectBuilder builder = (EObjectContextObjectBuilder) EObjectContextObjectBuilder.create()
				.withDocuments(Collections.singletonList(doc)).withSourceObject(route)
				.withIndexActionType(indexAction);

		if (IndexActionType.MODIFY.equals(indexAction) || IndexActionType.REMOVE.equals(indexAction)) {
			builder.withIdentifyingTerm(new Term("id", route.getId()));
		}
		return builder.build();
	}
}
