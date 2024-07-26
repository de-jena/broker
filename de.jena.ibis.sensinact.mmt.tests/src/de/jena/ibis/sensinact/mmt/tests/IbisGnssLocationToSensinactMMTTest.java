/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.ibis.sensinact.mmt.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;

import org.gecko.qvt.osgi.api.ModelTransformationConstants;
import org.gecko.qvt.osgi.api.ModelTransformator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import de.jena.ibis.sensinact.mmt.tests.helper.IbisToSensinactTestHelper;
import de.jena.model.ibis.enumerations.GNSSCoordinateSystemEnumeration;
import de.jena.model.ibis.enumerations.GNSSQualityEnumeration;
import de.jena.model.ibis.enumerations.GNSSTypeEnumeration;
import de.jena.model.ibis.gnsslocationservice.GNSSLocationData;
import de.jena.model.ibis.gnsslocationservice.IbisGNSSLocationServiceFactory;
import de.jena.model.sensinact.ibis.IbisDevice;


/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
public class IbisGnssLocationToSensinactMMTTest {

	@InjectService(filter = "(" + ModelTransformationConstants.TRANSFORMATOR_ID + "=ibisToSensinact)")
	ModelTransformator transformator;

	
	@Test
	public void testAllData() throws DatatypeConfigurationException {  
		GNSSLocationData data = IbisGNSSLocationServiceFactory.eINSTANCE.createGNSSLocationData();
		data.setLatitude(IbisToSensinactTestHelper.createIbisGNSSCoordinates(78, "north"));
		data.setLongitude(IbisToSensinactTestHelper.createIbisGNSSCoordinates(46, "east"));
		data.setAltitude(IbisToSensinactTestHelper.createIbisDouble(300));
		data.setDate(IbisToSensinactTestHelper.createIbisDate(new Date()));
		data.setGNSSCoordinateSystem(GNSSCoordinateSystemEnumeration.IERS);
		data.setGNSSType(GNSSTypeEnumeration.GALILEO);
		data.setHoriziontalDilutionOfPrecision(IbisToSensinactTestHelper.createIbisDouble(7.5));
		data.setVerticalDilutionOfPrecision(IbisToSensinactTestHelper.createIbisDouble(18.7));
		data.setNumberOfSatellites(IbisToSensinactTestHelper.createIbisInt(7));
		data.setSignalQuality(GNSSQualityEnumeration.GPS);
		data.setSpeedOverGround(IbisToSensinactTestHelper.createIbisDouble(50.3));
		data.setTime(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		data.setTrackDegreeMagnetic(IbisToSensinactTestHelper.createIbisDouble(3.2));
		data.setTrackDegreeTrue(IbisToSensinactTestHelper.createIbisDouble(4.5));
		
		
		IbisDevice sensinactDevice = (IbisDevice) transformator.doTransformation(data);
		assertThat(sensinactDevice).isNotNull();
		
		de.jena.model.sensinact.ibis.GNSSLocationData sensinactData = sensinactDevice.getGnssLocationData();
		assertThat(sensinactData).isNotNull();
		assertThat(sensinactData.getTimestamp()).isNotNull();
		assertThat(sensinactData.getLatitudeDegree()).isEqualTo(78);
		assertThat(sensinactData.getLongitudeDegree()).isEqualTo(46);
		assertThat(sensinactData.getLatitudeDirection()).isEqualTo("north");
		assertThat(sensinactData.getLongitudeDirection()).isEqualTo("east");
		assertThat(sensinactData.getAltitude()).isEqualTo(300);
		assertThat(sensinactData.getDate()).isNotNull();
		assertThat(sensinactData.getGNSSCoordinateSystem()).isEqualTo(GNSSCoordinateSystemEnumeration.IERS.getLiteral());
		assertThat(sensinactData.getGNSSType()).isEqualTo(GNSSTypeEnumeration.GALILEO.getLiteral());
		assertThat(sensinactData.getHorizontalDilutionOfPrecision()).isEqualTo(7.5);
		assertThat(sensinactData.getVerticalDilutionOfPrecision()).isEqualTo(18.7);
		assertThat(sensinactData.getNumberOfSatellites()).isEqualTo(7);
		assertThat(sensinactData.getSignalQuality()).isEqualTo(GNSSQualityEnumeration.GPS.getLiteral());
		assertThat(sensinactData.getTime()).isNotNull();
		assertThat(sensinactData.getTrackDegreeMagnetic()).isEqualTo(3.2);
		assertThat(sensinactData.getTrackDegreeTrue()).isEqualTo(4.5);	
		assertThat(sensinactData.getSpeedOverGround()).isEqualTo(50.3);

		assertThat(sensinactData.getMetadata()).isNotEmpty();
		assertThat(sensinactData.getMetadata()).hasSize(16);		
	}
	
	
}
