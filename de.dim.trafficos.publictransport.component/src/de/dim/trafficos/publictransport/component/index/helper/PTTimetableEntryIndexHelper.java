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
import org.apache.lucene.document.IntField;
import org.apache.lucene.document.LongPoint;
import org.apache.lucene.document.StringField;
import org.apache.lucene.index.Term;
import org.gecko.emf.search.document.EObjectContextObjectBuilder;
import org.gecko.emf.search.document.EObjectDocumentIndexObjectContext;
import org.gecko.search.IndexActionType;

import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;

/**
 * 
 * @author ilenia
 * @since Jun 30, 2023
 */
public class PTTimetableEntryIndexHelper {

	public static final String PT_ENTRY_STOP_REF = "pt_entry_stop_ref";
	public static final String PT_ENTRY_SCHEDULE_REF = "pt_entry_schedule_ref";
	public static final String PT_ENTRY_ARRIVAL_TIME = "pt_entry_arrival_time";
	public static final String PT_ENTRY_DEPARTURE_TIME = "pt_entry_departure_time";
	public static final String PT_ENTRY_ARRIVAL_DAY_WRT_SCHEDULE = "pt_entry_arrival_day_wrt_schedule";
	public static final String PT_ENTRY_DEPARTURE_DAY_WRT_SCHEDULE = "pt_entry_departure_day_wrt_schedule";

	public static EObjectDocumentIndexObjectContext mapPTTimetableEntry(PTTimetableEntry entry, IndexActionType indexAction) {

		Document doc = new Document();
		doc.add(new StringField("id", entry.getId(), Store.YES));
		if(entry.getRefStopId() != null) {
			doc.add(new StringField(PT_ENTRY_STOP_REF, entry.getRefStopId(), Store.NO));
		}
		if(entry.getRefScheduleId() != null) {
			doc.add(new StringField(PT_ENTRY_SCHEDULE_REF, entry.getRefScheduleId(), Store.NO));
		}
		if(entry.getScheduledArrivalTime() != null) {
			doc.add(new LongPoint(PT_ENTRY_ARRIVAL_TIME, entry.getScheduledArrivalTime().toSecondOfDay()));
		}
		if(entry.getScheduledDepartureTime() != null) {
			doc.add(new LongPoint(PT_ENTRY_DEPARTURE_TIME, entry.getScheduledDepartureTime().toSecondOfDay()));
		}
		doc.add(new IntField(PT_ENTRY_ARRIVAL_DAY_WRT_SCHEDULE, entry.getArrivalDayAfterScheduleStart(), Store.NO));
		doc.add(new IntField(PT_ENTRY_DEPARTURE_DAY_WRT_SCHEDULE, entry.getDepartureDayAfterScheduleStart(), Store.NO));

		EObjectContextObjectBuilder builder = (EObjectContextObjectBuilder) EObjectContextObjectBuilder.create()
				.withDocuments(Collections.singletonList(doc)).withSourceObject(entry)
				.withIndexActionType(indexAction);

		if (IndexActionType.MODIFY.equals(indexAction) || IndexActionType.REMOVE.equals(indexAction)) {
			builder.withIdentifyingTerm(new Term("id", entry.getId()));
		}
		return builder.build();
	}
}
