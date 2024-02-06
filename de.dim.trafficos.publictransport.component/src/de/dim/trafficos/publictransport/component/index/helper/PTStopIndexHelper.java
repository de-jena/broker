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

import de.jena.udp.model.trafficos.publictransport.PTStop;

/**
 * 
 * @author ilenia
 * @since Jul 4, 2023
 */
public class PTStopIndexHelper {
	
	public static final String PT_STOP_ID = "pt_stop_id";
	public static final String PT_STOP_DHID = "pt_stop_dhid";
	public static final String PT_STOP_NAME = "pt_stop_name";

	public static EObjectDocumentIndexObjectContext mapPTStop(PTStop ptStop, IndexActionType indexAction) {

		Document doc = new Document();
		doc.add(new StringField("id", ptStop.getId(), Store.YES));
		doc.add(new StringField(PT_STOP_DHID, ptStop.getDHID(), Store.NO));
		if(ptStop.getStopId() != null) {
			doc.add(new StringField(PT_STOP_ID, ptStop.getStopId(), Store.NO));
		}
		if(ptStop.getName() != null) {
			doc.add(new StringField(PT_STOP_NAME, ptStop.getName(), Store.NO));
		}

		EObjectContextObjectBuilder builder = (EObjectContextObjectBuilder) EObjectContextObjectBuilder.create()
				.withDocuments(Collections.singletonList(doc)).withSourceObject(ptStop)
				.withIndexActionType(indexAction);

		if (IndexActionType.MODIFY.equals(indexAction) || IndexActionType.REMOVE.equals(indexAction)) {
			builder.withIdentifyingTerm(new Term("id", ptStop.getId()));
		}
		return builder.build();
	}

}
