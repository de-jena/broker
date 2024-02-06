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

import de.jena.udp.model.trafficos.publictransport.PTVehicle;

/**
 * 
 * @author ilenia
 * @since Jun 30, 2023
 */
public class PTVehicleIndexHelper {

	public static final String PT_VEHICLE_TYPE = "pt_vehicle_type";

	public static EObjectDocumentIndexObjectContext mapPublicTransport(PTVehicle publicTransport, IndexActionType indexAction) {

		Document doc = new Document();
		doc.add(new StringField("id", publicTransport.getId(), Store.YES));
		doc.add(new StringField(PT_VEHICLE_TYPE, publicTransport.getType().toString(), Store.NO));

		EObjectContextObjectBuilder builder = (EObjectContextObjectBuilder) EObjectContextObjectBuilder.create()
				.withDocuments(Collections.singletonList(doc)).withSourceObject(publicTransport)
				.withIndexActionType(indexAction);

		if (IndexActionType.MODIFY.equals(indexAction) || IndexActionType.REMOVE.equals(indexAction)) {
			builder.withIdentifyingTerm(new Term("id", publicTransport.getId()));
		}
		return builder.build();
	}
}
