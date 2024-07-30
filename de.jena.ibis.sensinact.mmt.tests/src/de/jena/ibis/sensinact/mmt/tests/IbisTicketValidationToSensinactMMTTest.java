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
import de.jena.model.ibis.common.IbisCommonFactory;
import de.jena.model.ibis.common.LineInformation;
import de.jena.model.ibis.common.StopInformation;
import de.jena.model.ibis.enumerations.DoorOpenStateEnumeration;
import de.jena.model.ibis.enumerations.RouteDeviationEnumeration;
import de.jena.model.ibis.enumerations.TicketRazziaInformationEnumeration;
import de.jena.model.ibis.enumerations.VehicleModeEnumeration;
import de.jena.model.ibis.ticketvalidationservice.CurrentLineData;
import de.jena.model.ibis.ticketvalidationservice.CurrentLineResponse;
import de.jena.model.ibis.ticketvalidationservice.CurrentTariffStopData;
import de.jena.model.ibis.ticketvalidationservice.CurrentTariffStopResponse;
import de.jena.model.ibis.ticketvalidationservice.IbisTicketValidationServiceFactory;
import de.jena.model.ibis.ticketvalidationservice.RazziaData;
import de.jena.model.ibis.ticketvalidationservice.RazziaResponse;
import de.jena.model.ibis.ticketvalidationservice.VehicleData;
import de.jena.model.ibis.ticketvalidationservice.VehicleDataResponse;
import de.jena.model.sensinact.ibis.IbisDevice;
import de.jena.model.sensinact.ibis.TicketValidationCurrentLineData;
import de.jena.model.sensinact.ibis.TicketValidationCurrentTariffStopData;
import de.jena.model.sensinact.ibis.TicketValidationRazziaData;
import de.jena.model.sensinact.ibis.TicketValidationVehicleData;


/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
public class IbisTicketValidationToSensinactMMTTest {

	@InjectService(filter = "(" + ModelTransformationConstants.TRANSFORMATOR_ID + "=ibisToSensinact)")
	ModelTransformator transformator;
	
	@Test
	public void testCurrentTariffStop() throws DatatypeConfigurationException {
		CurrentTariffStopResponse response = IbisTicketValidationServiceFactory.eINSTANCE.createCurrentTariffStopResponse();
		CurrentTariffStopData data = IbisTicketValidationServiceFactory.eINSTANCE.createCurrentTariffStopData();
		data.setTimeStamp(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		data.setCurrentTripRef(IbisToSensinactTestHelper.createIbisToken("testTripRef"));
		
		StopInformation stopInfo = IbisCommonFactory.eINSTANCE.createStopInformation();
		stopInfo.setArrivalExpected(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		stopInfo.setArrivalScheduled(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		stopInfo.setDepartureExpected(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		stopInfo.setDepartureScheduled(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		stopInfo.setDistanceToNextStop(IbisToSensinactTestHelper.createIbisInt(3));
		stopInfo.setPlatform(IbisToSensinactTestHelper.createIbisString("platformTest"));
		stopInfo.setRecordedArrivalTime(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		stopInfo.setStopIndex(IbisToSensinactTestHelper.createIbisInt(7));
		stopInfo.setStopRef(IbisToSensinactTestHelper.createIbisToken("stopRefTest"));
		stopInfo.getStopName().add(IbisToSensinactTestHelper.createIbisTextType("Stop Name 1"));
		stopInfo.getStopName().add(IbisToSensinactTestHelper.createIbisTextType("Stop Name 2"));
		stopInfo.getStopAlternativeName().add(IbisToSensinactTestHelper.createIbisTextType("Stop Alternative Name 1"));
		stopInfo.getStopAlternativeName().add(IbisToSensinactTestHelper.createIbisTextType("Stop Alternative Name 2"));
		stopInfo.getFareZone().add(IbisToSensinactTestHelper.createIbisToken("Fare Zone 1"));
		stopInfo.getFareZone().add(IbisToSensinactTestHelper.createIbisToken("Fare Zone 2"));
		data.setCurrentTariffStop(stopInfo);
		response.setCurrentTariffStopData(data);
		
		IbisDevice sensinactDevice = (IbisDevice) transformator.doTransformation(response);
		assertThat(sensinactDevice).isNotNull();
		TicketValidationCurrentTariffStopData sensinactData = sensinactDevice.getCurrentTariffStopData();
		assertThat(sensinactData).isNotNull();
		assertThat(sensinactData.getTimestamp()).isNotNull();
		assertThat(sensinactData.getArrivalExpected()).isNotNull();
		assertThat(sensinactData.getArrivalScheduled()).isNotNull();
		assertThat(sensinactData.getDepartureExpected()).isNotNull();
		assertThat(sensinactData.getDepartureScheduled()).isNotNull();
		assertThat(sensinactData.getRecordedArrivalTime()).isNotNull();
		assertThat(sensinactData.getPlatform()).isEqualTo("platformTest");
		assertThat(sensinactData.getStopRef()).isEqualTo("stopRefTest");
		assertThat(sensinactData.getStopIndex()).isEqualTo(7);
		assertThat(sensinactData.getDistanceToNextStop()).isEqualTo(3);
		assertThat(sensinactData.getStopName()).hasSize(2);
		assertThat(sensinactData.getStopName()).contains("Stop Name 1", "Stop Name 2");
		assertThat(sensinactData.getStopAlternativeName()).hasSize(2);
		assertThat(sensinactData.getStopAlternativeName()).contains("Stop Alternative Name 1", "Stop Alternative Name 2");
		assertThat(sensinactData.getFareZone()).hasSize(2);
		assertThat(sensinactData.getFareZone()).contains("Fare Zone 1", "Fare Zone 2");
		assertThat(sensinactData.getCurrentTripRef()).isEqualTo("testTripRef");

		assertThat(sensinactData.getMetadata()).isNotEmpty();
		assertThat(sensinactData.getMetadata()).hasSize(13);		
	}
	
	@Test
	public void testRazzia() throws DatatypeConfigurationException { 
		
		RazziaResponse response = IbisTicketValidationServiceFactory.eINSTANCE.createRazziaResponse();
		RazziaData data = IbisTicketValidationServiceFactory.eINSTANCE.createRazziaData();
		data.setTimeStamp(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		data.setRazziaState(TicketRazziaInformationEnumeration.RAZZIA);
	
		response.setRazziaData(data);
		
		IbisDevice sensinactDevice = (IbisDevice) transformator.doTransformation(response);
		assertThat(sensinactDevice).isNotNull();
		TicketValidationRazziaData sensinactData = sensinactDevice.getRazziaData();
		assertThat(sensinactData).isNotNull();
		assertThat(sensinactData.getTimestamp()).isNotNull();
		assertThat(sensinactData.getRazziaState()).isEqualTo(TicketRazziaInformationEnumeration.RAZZIA.getLiteral());
		

		assertThat(sensinactData.getMetadata()).isNotEmpty();
		assertThat(sensinactData.getMetadata()).hasSize(1);		
	}
	
	@Test
	public void testCurrentLine() throws DatatypeConfigurationException { 
		CurrentLineResponse response = IbisTicketValidationServiceFactory.eINSTANCE.createCurrentLineResponse();
		CurrentLineData data = IbisTicketValidationServiceFactory.eINSTANCE.createCurrentLineData();
		data.setTimeStamp(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		
		LineInformation lineInfo = IbisCommonFactory.eINSTANCE.createLineInformation();
		lineInfo.setLineRef(IbisToSensinactTestHelper.createIbisToken("lineRef"));
		lineInfo.setLineCode(IbisToSensinactTestHelper.createIbisInt(7));
		lineInfo.setLineNumber(IbisToSensinactTestHelper.createIbisInt(5));
		lineInfo.getLineName().add(IbisToSensinactTestHelper.createIbisTextType("name1"));
		lineInfo.getLineName().add(IbisToSensinactTestHelper.createIbisTextType("name2"));
		lineInfo.getLineShortName().add(IbisToSensinactTestHelper.createIbisTextType("n1"));
		lineInfo.getLineShortName().add(IbisToSensinactTestHelper.createIbisTextType("n2"));
		data.setCurrentLine(lineInfo);
		
		response.setCurrentLineData(data);
		
		IbisDevice sensinactDevice = (IbisDevice) transformator.doTransformation(response);
		assertThat(sensinactDevice).isNotNull();
		TicketValidationCurrentLineData sensinactData = sensinactDevice.getCurrentLineData();
		assertThat(sensinactData).isNotNull();
		assertThat(sensinactData.getTimestamp()).isNotNull();
		assertThat(sensinactData.getLineRef()).isEqualTo("lineRef");
		assertThat(sensinactData.getLineCode()).isEqualTo(7);
		assertThat(sensinactData.getLineNumber()).isEqualTo(5);	
		assertThat(sensinactData.getLineName()).contains("name1", "name2");
		assertThat(sensinactData.getLineShortName()).contains("n1", "n2");
		
		assertThat(sensinactData.getMetadata()).isNotEmpty();
		assertThat(sensinactData.getMetadata()).hasSize(5);		
	}
	
	@Test
	public void testVehicleData() throws DatatypeConfigurationException { 
		VehicleDataResponse response = IbisTicketValidationServiceFactory.eINSTANCE.createVehicleDataResponse();
		VehicleData data = IbisTicketValidationServiceFactory.eINSTANCE.createVehicleData();
		data.setTimeStamp(IbisToSensinactTestHelper.createIbisDateTime(new Date()));
		data.setVehicleRef(IbisToSensinactTestHelper.createIbisToken("vehicleRefTest"));
		data.setRouteDeviation(RouteDeviationEnumeration.ONROUTE);
		data.setDoorOpenState(DoorOpenStateEnumeration.SINGLE_DOOR_OPEN);
		data.setMovingDirectionForward(IbisToSensinactTestHelper.createIbisBoolean(true));
		data.setVehicleMode(VehicleModeEnumeration.BUS);		
		data.setDriverNumber(IbisToSensinactTestHelper.createIbisString("driver123"));
		
		response.setVehicleData(data);
				
		IbisDevice sensinactDevice = (IbisDevice) transformator.doTransformation(response);
		assertThat(sensinactDevice).isNotNull();
		TicketValidationVehicleData sensinactData = sensinactDevice.getVehicleData();
		assertThat(sensinactData).isNotNull();
		assertThat(sensinactData.getTimestamp()).isNotNull();
		assertThat(sensinactData.getVehicleRef()).isEqualTo("vehicleRefTest");
		assertThat(sensinactData.getRouteDeviation()).isEqualTo(RouteDeviationEnumeration.ONROUTE.getLiteral());
		assertThat(sensinactData.getDoorState()).isEqualTo(DoorOpenStateEnumeration.SINGLE_DOOR_OPEN.getLiteral());	
		assertThat(sensinactData.isMovingDirectionForward()).isTrue();
		assertThat(sensinactData.getVehicleMode()).isEqualTo(VehicleModeEnumeration.BUS.getLiteral());
		assertThat(sensinactData.getDriverNumber()).isEqualTo("driver123");	
		
		assertThat(sensinactData.getMetadata()).isNotEmpty();
		assertThat(sensinactData.getMetadata()).hasSize(6);		
	}
}
