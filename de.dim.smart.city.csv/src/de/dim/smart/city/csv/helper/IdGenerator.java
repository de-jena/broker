/**
 * Copyright (c) 2012 - 2020 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.smart.city.csv.helper;

/**
 * Helper class to extract an identifier for each element from csv real data file
 * 
 * @author ilenia
 * @since Jul 24, 2020
 */
public class IdGenerator {
	
public static String generateId(String domain, String type) {
		
		String id = "";
		String[] domainSplit = domain.split("/");
		String genPart = createGeneralIdPart(domainSplit);
		if(genPart != null) {
			id += genPart;
			switch(type) {
			case "SGR":
				String sgId = extractSGId(domainSplit);
				if(sgId != null) {
					id += "." + sgId;
				}
				break;
			case "DET":
				String detId = extractDetId(domainSplit);
				if(detId != null) {
					id += "." + detId;
				}
				break;
			case "AMLI_R09":
				id += "." + "AMLI";
				break;
			case "AP_RELKNOTEN":
				String txId = extractParId(domainSplit);
				if(txId != null) {
					id += "." + txId;
				}
				break;
			}
		}		
		return id;
	}
	
	private static String extractParId(String[] domain) {
		String parId = "";
		
		if(domain.length < 6) {
			return null;
		}
		String nodeNr = extractFromId(domain[4]);
		String name = extractFromId(domain[5]);
		parId += nodeNr + "." + name;
		return parId;
	}
	
	private static String extractSGId(String[] domain) {
		String sgId = "";
		
		if(domain.length < 6) {
			return null;
		}
		String nodeNr = extractFromId(domain[4]);
		String sgNr = extractFromId(domain[5]);
		sgId += nodeNr + ".SGR" + sgNr;
		return sgId;
	}
	
	private static String extractDetId(String[] domain) {
		String detId = "";
		
		if(domain.length < 5) {
			return null;
		}
		detId = "CH"+extractFromId(domain[4]);		
		return detId;
	}
	
	private static String createGeneralIdPart(String[] domain) {
		
		String idGenPart = "";
		
		if(domain.length < 4) {
			return null;
		}
		String fnr = extractFromId(domain[3]);
		String znr = extractFromId(domain[2]);
		String shortName = extractFromId(domain[1]);
		
		idGenPart += fnr+"."+znr+"."+shortName;
		return idGenPart;
	}
	
	private static String extractFromId(String segment) {
		return segment.substring(segment.indexOf("='") + 2, segment.indexOf("']"));
	}

}
