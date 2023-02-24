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
package de.dim.trafficos.vaadin.views.intersection.system.creation;

import de.dim.trafficos.intersection.model.intersection.RoadType;

/**
 * 
 * @author ilenia
 * @since Feb 7, 2023
 */
class DisplayedRoad implements Comparable<DisplayedRoad>{
	
	private Integer index;
	private RoadType type;
	
	DisplayedRoad(Integer index, RoadType type) {
		this.index = index;
		this.type = type;
	}
	
	Integer getIndex() {
		return index;
	}
	
	void setIndex(Integer index) {
		this.index = index;
	}
	
	RoadType getType() {
		return type;
	}

	/* 
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(DisplayedRoad r2) {
		return this.index.compareTo(r2.index);
	}

}
