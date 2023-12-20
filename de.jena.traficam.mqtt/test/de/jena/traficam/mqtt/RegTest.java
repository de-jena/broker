/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.traficam.mqtt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author grune
 * @since Sep 8, 2023
 */
public class RegTest {
	public static void main(String[] args) {
		match("67t");
		match("67km");
		match(" 67km");
		match("zz010767t");
	}

	private static void match(String text) {
		Pattern pattern = Pattern.compile("^[^a-z]+(\\d)+(g|t|km)"); //Pattern.CASE_INSENSITIVE
		Matcher matcher = pattern.matcher(text);
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found " + text);
	    } else {
	      System.out.println("Match not found" + text);
	    }
	}

}
