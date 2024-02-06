/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
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
package de.dim.trafficos.gtfs.component.helper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import de.jena.udp.model.trafficos.common.Position;
import de.jena.udp.model.trafficos.common.TOSCommonFactory;
import de.jena.udp.model.trafficos.publictransport.PTStop;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportFactory;

/**
 * 
 * @author ilenia
 * @since Jul 5, 2023
 */
public class XMLReader {
	
	public static List<String> extractStopsDHIDsFromXML(String xmlFile, String ...municipalities) {
		List<String> stopIds = new ArrayList<>();
		try {
			NodeList nodeList = extractRootElement(xmlFile, "Items");
			for (int itr = 0; itr < nodeList.getLength(); itr++)   		{  
				Node node = nodeList.item(itr);  
				for(int i = 0; i < node.getChildNodes().getLength(); i++) {
					Node child = node.getChildNodes().item(i);
					if("StopPlace".equals(child.getNodeName())) {
						if(child.getNodeType() == Node.ELEMENT_NODE) {
							Element stopPlaceElement = (Element) child;
							Node municipalityNode = stopPlaceElement.getElementsByTagName("Municipality").item(0);
							if(municipalityNode.getNodeType() == Node.ELEMENT_NODE) {
								Element municipalityElement = (Element) municipalityNode;
								if(municipalities == null || municipalities.length == 0) {
									Node dhid = stopPlaceElement.getElementsByTagName("DHID").item(0);
									stopIds.add(dhid.getTextContent());
								}
								else if(List.of(municipalities).contains(municipalityElement.getElementsByTagName("Label").item(0).getTextContent())) {
									Node dhid = stopPlaceElement.getElementsByTagName("DHID").item(0);
									stopIds.add(dhid.getTextContent());
								}
							}
						}
					}
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
		return stopIds;
	}

	public static List<PTStop> extractAndCreatePTStopFromXML(String xmlFile, String ... municipalities) {
		List<PTStop> stops = new ArrayList<>();
		try {
			NodeList nodeList = extractRootElement(xmlFile, "Items");
			for (int itr = 0; itr < nodeList.getLength(); itr++)   		{  
				Node node = nodeList.item(itr);  
				for(int i = 0; i < node.getChildNodes().getLength(); i++) {
					Node child = node.getChildNodes().item(i);
					if("StopPlace".equals(child.getNodeName())) {
						if(child.getNodeType() == Node.ELEMENT_NODE) {
							Element stopPlaceElement = (Element) child;
							Node municipalityNode = stopPlaceElement.getElementsByTagName("Municipality").item(0);
							if(municipalityNode.getNodeType() == Node.ELEMENT_NODE) {
								Element municipalityElement = (Element) municipalityNode;
								if(List.of(municipalities).contains(municipalityElement.getElementsByTagName("Label").item(0).getTextContent())) {
									Node stopName = stopPlaceElement.getElementsByTagName("Name").item(0);
									Node dhid = stopPlaceElement.getElementsByTagName("DHID").item(0);
									Node location = stopPlaceElement.getElementsByTagName("Location").item(0);

									PTStop stop = TOSPublicTransportFactory.eINSTANCE.createPTStop();
									stop.setName(stopName.getTextContent().trim());
									stop.setDHID(dhid.getTextContent());
									if(location.getNodeType() == Node.ELEMENT_NODE) {
										Element locElement = (Element) location;
										Node lat = locElement.getElementsByTagName("Latitude").item(0);
										Node lng = locElement.getElementsByTagName("Longitude").item(0);
										Position position = TOSCommonFactory.eINSTANCE.createPosition();
										position.setLatitude(Double.parseDouble(lat.getTextContent()));
										position.setLongitude(Double.parseDouble(lng.getTextContent()));
										stop.setPosition(position);
									}
									String[] dhidParts = stop.getDHID().split(":");
									if(dhidParts.length == 3) {
										stop.setId(dhidParts[2]);
									}
									stops.add(stop);
								}
							}
						}
					}
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
		return stops;
	}


	private static NodeList extractRootElement(String xmlFile, String rootName) throws IOException, ParserConfigurationException, SAXException  {
		File file = new File(xmlFile);  
		//an instance of factory that gives a document builder  
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
		//an instance of builder to parse the specified xml file  
		DocumentBuilder db = dbf.newDocumentBuilder();  
		Document doc = db.parse(file);  
		doc.getDocumentElement().normalize();  
		NodeList nodeList = doc.getElementsByTagName(rootName);  
		return nodeList;
	}

}
