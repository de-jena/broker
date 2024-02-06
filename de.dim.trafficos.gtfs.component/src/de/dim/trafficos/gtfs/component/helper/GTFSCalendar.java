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
package de.dim.trafficos.gtfs.component.helper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ilenia
 * @since Jul 6, 2023
 */
public class GTFSCalendar {
	
	private String serviceId;
	private boolean monday, tuesday, wednesday, thursday, friday, saturday, sunday;
	private LocalDate start, end; 
	private List<LocalDate> included = new ArrayList<>(), excluded = new ArrayList<>();
	
	public GTFSCalendar() {
		
	}
	
	public GTFSCalendar(String serviceId, LocalDate start, LocalDate end) {
		this.serviceId = serviceId;
		this.start = start;
		this.end = end;
	}
	
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public boolean isMonday() {
		return monday;
	}
	public void setMonday(boolean monday) {
		this.monday = monday;
	}
	public boolean isTuesday() {
		return tuesday;
	}
	public void setTuesday(boolean tuesday) {
		this.tuesday = tuesday;
	}
	public boolean isWednesday() {
		return wednesday;
	}
	public void setWednesday(boolean wednesday) {
		this.wednesday = wednesday;
	}
	public boolean isThursday() {
		return thursday;
	}
	public void setThursday(boolean thursday) {
		this.thursday = thursday;
	}
	public boolean isFriday() {
		return friday;
	}
	public void setFriday(boolean friday) {
		this.friday = friday;
	}
	public boolean isSaturday() {
		return saturday;
	}
	public void setSaturday(boolean saturday) {
		this.saturday = saturday;
	}
	public boolean isSunday() {
		return sunday;
	}
	public void setSunday(boolean sunday) {
		this.sunday = sunday;
	}
	public LocalDate getStart() {
		return start;
	}
	public void setStart(LocalDate start) {
		this.start = start;
	}
	public LocalDate getEnd() {
		return end;
	}
	public void setEnd(LocalDate end) {
		this.end = end;
	}
	public List<LocalDate>  getIncluded() {
		return included;
	}
	public void setIncluded(List<LocalDate>  included) {
		this.included = included;
	}
	public List<LocalDate>  getExcluded() {
		return excluded;
	}
	public void setExcluded(List<LocalDate>  excluded) {
		this.excluded = excluded;
	}

}
