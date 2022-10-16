/**
 * Copyright (c) 2012 - 2018 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emfcloud.jackson.databind.EMFContext;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.annotation.Testable;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.service.ServiceExtension;

import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.ApplicationIds;
import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.DataRate;
import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.EndDeviceIds;
import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.GatewayIds;
import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.Location;
import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.Lora;
import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.NetworkIds;
import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.RxMetadata;
import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.Settings;
import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload;
import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage;
import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadPackage;
import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.VersionIds;

@Testable
@ExtendWith(ServiceExtension.class)
public class TtnUplinkPayloadModelIntegrationTest {

	public static final String BASE_PATH = System.getProperty("base.path");
	private static TtnUplinkPayload payload1;
	private static TtnUplinkPayload payload2;


	@Test
	public void testBasicProperties() {
		
		assertThat(payload1.isConfirmed()).isEqualTo(false);
		assertThat(payload1.isRetry()).isEqualTo(false);
		assertThat(payload1.getReceivedAt()).isEqualTo("2022-10-11T10:29:24.183329324Z");
	}

	@Test
	public void testEndDeviceIds() {

		EndDeviceIds endDeviceIds = payload1.getEndDeviceIds();
		assertThat(endDeviceIds).isNotNull();
		assertThat(endDeviceIds.getDeviceId()).isEqualTo("eui-70b3d57ed004e8ff");
		assertThat(endDeviceIds.getDevEui()).isEqualTo("70B3D57ED004E8FF");
		assertThat(endDeviceIds.getJoinEui()).isEqualTo("0000000000000000");
		assertThat(endDeviceIds.getDevAddr()).isEqualTo("260BD17B");

		ApplicationIds applicationIds = endDeviceIds.getApplicationIds();
		assertThat(applicationIds).isNotNull();
		assertThat(applicationIds.getApplicationId()).isEqualTo("scj-simple-sensors");
	}

	@Test
	public void testCorrelationIds() {

		List<String> correlationIds = payload1.getCorrelationIds();
		assertThat(correlationIds).isNotNull();
		assertThat(correlationIds).isNotEmpty();
		assertThat(correlationIds).hasSize(7);
		assertThat(correlationIds).contains("as:up:01GF39F32Q0EG08888QT8A3RQJ",
				"gs:conn:01GF2RHREM0YVHBFC4BXNKDA57",
				"gs:up:host:01GF2RHRF48R6WK897513YF0T3",
				"gs:uplink:01GF39F2W82AAQDVW3PZ1SDN3Z",
				"ns:uplink:01GF39F2W90QZWD9Z6C30H8R0P",
				"rpc:/ttn.lorawan.v3.GsNs/HandleUplink:01GF39F2W97SM4GH0HB4NNS0JE",
				"rpc:/ttn.lorawan.v3.NsAs/HandleUplink:01GF39F32QR9T2A89MT29TN6J9");
	}

	@Test
	public void testUplinkMessage() {

		UplinkMessage uplinkMessage = payload1.getUplinkMessage();
		assertThat(uplinkMessage).isNotNull();
		assertThat(uplinkMessage.getSessionKeyId()).isEqualTo("AYOeGJ9RPhVUTdfbSrz7Uw==");
		assertThat(uplinkMessage.getFrmPayload()).isEqualTo("zcxgQg==");
		assertThat(uplinkMessage.getFPort()).isEqualTo(3);
		assertThat(uplinkMessage.getFCnt()).isEqualTo(1489);
		assertThat(uplinkMessage.getReceivedAt()).isEqualTo("2022-10-11T10:29:23.977430853Z");
		assertThat(uplinkMessage.getConsumedAirtime()).isEqualTo("0.092672s");
	}

	@Test
	public void testUplinkMessageMetadata() {

		UplinkMessage uplinkMessage = payload1.getUplinkMessage();
		assertThat(uplinkMessage).isNotNull();

		List<RxMetadata> metadataList = uplinkMessage.getRxMetadata();
		assertThat(metadataList).isNotNull();
		assertThat(metadataList).isNotEmpty();
		assertThat(metadataList).hasSize(1);

		RxMetadata metadata = metadataList.get(0);

		GatewayIds gatewayIds = metadata.getGatewayIds();
		assertThat(gatewayIds).isNotNull();
		assertThat(gatewayIds.getGatewayId()).isEqualTo("racsnet-ttnigw-01");
		assertThat(gatewayIds.getEui()).isEqualTo("58A0CBFFFE80264E");

		assertThat(metadata.getTime()).isEqualTo("2022-10-11T10:29:23.896912097Z");
		assertThat(metadata.getTimestamp()).isEqualTo(556888844);
		assertThat(metadata.getRssi()).isEqualTo(-81);
		assertThat(metadata.getChannelRssi()).isEqualTo(-81);
		assertThat(metadata.getSnr()).isEqualTo(9.25);
		assertThat(metadata.getUplinkToken()).isEqualTo("Ch8KHQoRcmFjc25ldC10dG5pZ3ctMDESCFigy//+gCZOEIzmxYkCGgwIg4uVmgYQxZXR0QMg4M2lyZqEBA==");
		assertThat(metadata.getReceivedAt()).isEqualTo("2022-10-11T10:29:23.916233790Z");

		Location location = metadata.getLocation();
		assertThat(location).isNotNull();
		assertThat(location.getLatitude()).isEqualTo(50.90764464);
		assertThat(location.getLongitude()).isEqualTo(11.56526928);
		assertThat(location.getAltitude()).isEqualTo(239);
		assertThat(location.getSource()).isEqualTo("SOURCE_REGISTRY");
	}

	@Test
	public void testUplinkMessageSettings() {

		UplinkMessage uplinkMessage = payload1.getUplinkMessage();
		assertThat(uplinkMessage).isNotNull();

		Settings settings = uplinkMessage.getSettings();
		assertThat(settings).isNotNull();

		assertThat(settings.getFrequency()).isEqualTo("868500000");
		assertThat(settings.getTime()).isEqualTo("2022-10-11T10:29:23.896912097Z");
		assertThat(settings.getTimestamp()).isEqualTo(556888844);

		DataRate dataRate = settings.getDataRate();
		assertThat(dataRate).isNotNull();
		Lora lora = dataRate.getLora();
		assertThat(lora).isNotNull();
		assertThat(lora.getBandwidth()).isEqualTo(125000);
		assertThat(lora.getSpreadingFactor()).isEqualTo(8);
		assertThat(lora.getCodingRate()).isEqualTo("4/5");
	}

	@Test
	public void testUplinkMessageNetworkIds() {

		UplinkMessage uplinkMessage = payload1.getUplinkMessage();
		assertThat(uplinkMessage).isNotNull();

		NetworkIds networkIds = uplinkMessage.getNetworkIds();
		assertThat(networkIds).isNotNull();
		assertThat(networkIds.getNetId()).isEqualTo("000013");
		assertThat(networkIds.getTenantId()).isEqualTo("ttn");
		assertThat(networkIds.getClusterId()).isEqualTo("eu1");
		assertThat(networkIds.getClusterAddress()).isEqualTo("eu1.cloud.thethings.network");
	}

	@Test
	public void testUplinkMessageDecodedPayload() {

		UplinkMessage uplinkMessage = payload1.getUplinkMessage();
		assertThat(uplinkMessage).isNotNull();

		EMap<String, Object> decodedPayload = uplinkMessage.getDecodedPayload();
		assertThat(decodedPayload).isNotNull();
		assertThat(decodedPayload).isNotEmpty();
		assertThat(decodedPayload.containsKey("humidity"));
		assertThat(decodedPayload.get("humidity")).isInstanceOf(BigDecimal.class);
		BigDecimal value = (BigDecimal) decodedPayload.get("humidity");
		assertThat(value).isEqualTo(BigDecimal.valueOf(56.20000076293945));
	}
	
	@Test
	public void testUplinkMessageVersionIds() {
		UplinkMessage uplinkMessage = payload2.getUplinkMessage();
		assertThat(uplinkMessage).isNotNull();
		
		VersionIds versionIds = uplinkMessage.getVersionIds();
		assertThat(versionIds).isNotNull();
		assertThat(versionIds.getBrandId()).isEqualTo("dragino");
		assertThat(versionIds.getModelId()).isEqualTo("lse01");
		assertThat(versionIds.getHardwareVersion()).isEqualTo("_unknown_hw_version_");
		assertThat(versionIds.getFirmwareVersion()).isEqualTo("1.3");
		assertThat(versionIds.getBandId()).isEqualTo("EU_863_870");	
	}

	@BeforeAll
	public static void beforeAll(@InjectService(timeout = 2000, filter="(&(emf.model.name=uplinkpayload)(emf.resource.configurator.name=EMFJson))") ServiceAware<ResourceSet> resSetAware, 
			@InjectService(timeout = 2000) ServiceAware<UplinkPayloadPackage> payloadPackServiceAware) {

		assertThat(resSetAware).isNotNull();
		assertThat(resSetAware.getServiceReferences()).hasSize(1);
		ResourceSet resSet = resSetAware.getService();
		assertThat(resSet).isNotNull();

		assertThat(payloadPackServiceAware).isNotNull();
		assertThat(payloadPackServiceAware.getServiceReferences()).hasSize(1);
		UplinkPayloadPackage uplinkPayloadPackage = payloadPackServiceAware.getService();
		assertThat(uplinkPayloadPackage).isNotNull();

		payload1 = extractPayloadFromFile(BASE_PATH + "/data/DeviceSignalTest.json", resSet, uplinkPayloadPackage);
		payload2 = extractPayloadFromFile(BASE_PATH + "/data/DeviceSignalTest2.json", resSet, uplinkPayloadPackage);
	}
	
	private static TtnUplinkPayload extractPayloadFromFile(String filePath, ResourceSet resSet, UplinkPayloadPackage uplinkPayloadPackage) {
		
		try(InputStream is = new FileInputStream(new File(filePath))) {
			Resource res = resSet.createResource(URI.createFileURI("temp.json"));
			Map<?, ?> options = Collections.singletonMap(EMFContext.Attributes.ROOT_ELEMENT, uplinkPayloadPackage.getTtnUplinkPayload());
			try {
				res.load(is, options);
				assertThat(res.getContents()).isNotEmpty();
				EObject eObj = res.getContents().get(0);
				assertThat(eObj).isInstanceOf(uplinkPayloadPackage.getTtnUplinkPayload().getInstanceClass());

				TtnUplinkPayload payload = (TtnUplinkPayload) eObj;
				assertThat(payload).isNotNull();
				return payload;
			} catch (IOException e) {
				fail("IOException " + e.getMessage());
			}
		} catch (FileNotFoundException e) {
			fail("FileNotFoundException " + e.getMessage());
		} catch (IOException e) {
			fail("IOException " + e.getMessage());
		}
		return null;
	}

}
