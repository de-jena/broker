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

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Collections;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.LongPoint;
import org.apache.lucene.document.StringField;
import org.apache.lucene.index.Term;
import org.gecko.emf.search.document.EObjectContextObjectBuilder;
import org.gecko.emf.search.document.EObjectDocumentIndexObjectContext;
import org.gecko.search.IndexActionType;

import de.jena.udp.model.trafficos.publictransport.PTFrequencyType;
import de.jena.udp.model.trafficos.publictransport.PTSchedule;

/**
 * 
 * @author ilenia
 * @since Jun 30, 2023
 */
public class PTScheduleIndexHelper {

	public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
	
	public static final String PT_SCHEDULE_ID = "pt_schedule_id";
	public static final String PT_SCHEDULE_ROUTE_ID_REF = "pt_schedule_route_id_ref";
	public static final String PT_SCHEDULE_ROUTE_NUM_REF = "pt_schedule_route_num_ref";
	public static final String PT_SCHEDULE_START = "pt_schedule_start";
	public static final String PT_SCHEDULE_END = "pt_schedule_end";
	public static final String PT_SCHEDULE_START_STR = "pt_schedule_start_str";
	public static final String PT_SCHEDULE_END_STR = "pt_schedule_end_str";
	public static final String PT_SCHEDULE_FREQUENY_DAYS = "pt_schedule_frequency_days";
	public static final String PT_SCHEDULE_INCLUDED_DAYS = "pt_schedule_included_days";
	public static final String PT_SCHEDULE_EXCLUDED_DAYS = "pt_schedule_excluded_days";

	public static EObjectDocumentIndexObjectContext mapPTSchedule(PTSchedule schedule, IndexActionType indexAction) {

		Document doc = new Document();
		doc.add(new StringField("id", schedule.getId(), Store.YES));
		doc.add(new StringField(PT_SCHEDULE_ID, schedule.getScheduleId(), Store.NO));
		
		if(schedule.getRefRouteId() != null) {
			doc.add(new StringField(PT_SCHEDULE_ROUTE_ID_REF, schedule.getRefRouteId(), Store.NO));
		}
		doc.add(new StringField(PT_SCHEDULE_ROUTE_NUM_REF, String.valueOf(schedule.getRefRouteNumber()), Store.NO));
		if(schedule.getStartDate() != null) {
			doc.add(new LongPoint(PT_SCHEDULE_START, schedule.getStartDate().atStartOfDay(ZoneId.of("UTC")).toInstant().toEpochMilli()));
			doc.add(new StringField(PT_SCHEDULE_START_STR, schedule.getStartDate().format(DATE_TIME_FORMATTER), Store.NO));
		}
		if(schedule.getEndDate() != null) {
			doc.add(new LongPoint(PT_SCHEDULE_END, schedule.getEndDate().plusDays(1).atStartOfDay(ZoneId.of("UTC")).toInstant().toEpochMilli()));
			doc.add(new StringField(PT_SCHEDULE_END_STR, schedule.getEndDate().format(DATE_TIME_FORMATTER), Store.NO));
		}
		for(PTFrequencyType frequencyDay : schedule.getFrequencyDays()) {
			doc.add(new StringField(PT_SCHEDULE_FREQUENY_DAYS, frequencyDay.toString(), Store.NO));
		}
		for(LocalDate day : schedule.getIncludedDate()) {
			doc.add(new StringField(PT_SCHEDULE_INCLUDED_DAYS, day.format(DATE_TIME_FORMATTER), Store.NO));
		}
		for(LocalDate day : schedule.getExcludedDate()) {
			doc.add(new StringField(PT_SCHEDULE_EXCLUDED_DAYS, day.format(DATE_TIME_FORMATTER), Store.NO));
		}

		EObjectContextObjectBuilder builder = (EObjectContextObjectBuilder) EObjectContextObjectBuilder.create()
				.withDocuments(Collections.singletonList(doc)).withSourceObject(schedule)
				.withIndexActionType(indexAction);

		if (IndexActionType.MODIFY.equals(indexAction) || IndexActionType.REMOVE.equals(indexAction)) {
			builder.withIdentifyingTerm(new Term("id", schedule.getId()));
		}
		return builder.build();
	}
}
