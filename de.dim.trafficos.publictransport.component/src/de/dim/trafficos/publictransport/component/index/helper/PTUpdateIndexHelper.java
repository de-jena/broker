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
import org.apache.lucene.document.LongPoint;
import org.apache.lucene.document.StringField;
import org.apache.lucene.index.Term;
import org.gecko.emf.search.document.EObjectContextObjectBuilder;
import org.gecko.emf.search.document.EObjectDocumentIndexObjectContext;
import org.gecko.search.IndexActionType;

import de.jena.udp.model.trafficos.publictransport.PTUpdate;

/**
 * 
 * @author ilenia
 * @since Jul 11, 2023
 */
public class PTUpdateIndexHelper {
	
	public static final String PT_REF_VEHICLE_ID = "pt_ref_vehicle_id";
	public static final String PT_UPDATE_TIMESTAMP = "pt_update_timestamp";
	public static final String PT_UPDATE_TYPE = "pt_update_type";
	public static final String PT_UPDATE_SOURCE = "pt_update_source";

	public static EObjectDocumentIndexObjectContext mapPTUpdate(PTUpdate update, IndexActionType indexAction) {

		Document doc = new Document();
		doc.add(new StringField("id", update.getId(), Store.YES));
		doc.add(new StringField(PT_REF_VEHICLE_ID, update.getRefVehicleId(), Store.NO));
		doc.add(new StringField(PT_UPDATE_TYPE, update.getType().toString(), Store.NO));
		if(update.getDataSource() != null) {
			doc.add(new StringField(PT_UPDATE_SOURCE, update.getDataSource().toString(), Store.NO));
		}
		doc.add(new LongPoint(PT_UPDATE_TIMESTAMP, update.getTimestamp()));
		
		EObjectContextObjectBuilder builder = (EObjectContextObjectBuilder) EObjectContextObjectBuilder.create()
				.withDocuments(Collections.singletonList(doc)).withSourceObject(update)
				.withIndexActionType(indexAction);

		if (IndexActionType.MODIFY.equals(indexAction) || IndexActionType.REMOVE.equals(indexAction)) {
			builder.withIdentifyingTerm(new Term("id", update.getId()));
		}
		return builder.build();
	}

}
