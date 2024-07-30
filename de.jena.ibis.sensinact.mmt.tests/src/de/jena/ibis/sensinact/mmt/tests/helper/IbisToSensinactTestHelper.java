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
package de.jena.ibis.sensinact.mmt.tests.helper;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import de.jena.model.ibis.common.GNSSCoordinate;
import de.jena.model.ibis.common.IBISIPBoolean;
import de.jena.model.ibis.common.IBISIPDate;
import de.jena.model.ibis.common.IBISIPDateTime;
import de.jena.model.ibis.common.IBISIPDouble;
import de.jena.model.ibis.common.IBISIPInt;
import de.jena.model.ibis.common.IBISIPLanguage;
import de.jena.model.ibis.common.IBISIPNMTOKEN;
import de.jena.model.ibis.common.IBISIPString;
import de.jena.model.ibis.common.IbisCommonFactory;
import de.jena.model.ibis.common.InternationalTextType;

/**
 * 
 * @author ilenia
 * @since May 12, 2023
 */
public class IbisToSensinactTestHelper {
	
	public static IBISIPString createIbisString(String value) {
		IBISIPString ibisStr = IbisCommonFactory.eINSTANCE.createIBISIPString();
		ibisStr.setValue(value);
		return ibisStr;
	}
	
	public static InternationalTextType createIbisTextType(String value) {
		InternationalTextType text = IbisCommonFactory.eINSTANCE.createInternationalTextType();
		text.setValue(value);
		return text;
	}
	
	public static IBISIPBoolean createIbisBoolean(boolean value) {
		IBISIPBoolean ibisBoolean = IbisCommonFactory.eINSTANCE.createIBISIPBoolean();
		ibisBoolean.setValue(value);
		return ibisBoolean;
	}
	
	public static IBISIPNMTOKEN createIbisToken(String value) {
		IBISIPNMTOKEN ibisToken = IbisCommonFactory.eINSTANCE.createIBISIPNMTOKEN();
		ibisToken.setValue(value);
		return ibisToken;
	}
	
	public static IBISIPInt createIbisInt(int value) {
		IBISIPInt ibisInt = IbisCommonFactory.eINSTANCE.createIBISIPInt();
		ibisInt.setValue(value);
		return ibisInt;
	}
	
	public static IBISIPDouble createIbisDouble(double value) {
		IBISIPDouble ibisDouble = IbisCommonFactory.eINSTANCE.createIBISIPDouble();
		ibisDouble.setValue(value);
		return ibisDouble;
	}
	
	public static IBISIPLanguage createIbisLanguage(String value) {
		IBISIPLanguage language = IbisCommonFactory.eINSTANCE.createIBISIPLanguage();
		language.setValue(value);
		return language;
	}
	
	public static IBISIPDateTime createIbisDateTime(Date date) throws DatatypeConfigurationException {
		IBISIPDateTime timestamp = IbisCommonFactory.eINSTANCE.createIBISIPDateTime();
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		XMLGregorianCalendar xCal = DatatypeFactory.newInstance()
		    .newXMLGregorianCalendar(cal);
		timestamp.setValue(xCal);
		return timestamp;
	}
	
	public static IBISIPDate createIbisDate(Date date) throws DatatypeConfigurationException {
		IBISIPDate ibisDate = IbisCommonFactory.eINSTANCE.createIBISIPDate();
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		XMLGregorianCalendar xCal = DatatypeFactory.newInstance()
		    .newXMLGregorianCalendar(cal);
		ibisDate.setValue(xCal);
		return ibisDate;
	}

	public static GNSSCoordinate createIbisGNSSCoordinates(double degree, String direction) {
		GNSSCoordinate coord = IbisCommonFactory.eINSTANCE.createGNSSCoordinate();
		coord.setDegree(createIbisDouble(degree));
		coord.setDirection(createIbisString(direction));
		return coord;
	}

	
}
