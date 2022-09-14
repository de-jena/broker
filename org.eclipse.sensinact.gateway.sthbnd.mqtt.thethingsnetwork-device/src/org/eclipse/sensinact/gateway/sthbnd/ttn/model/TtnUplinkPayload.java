/*
* Copyright (c) 2020 Kentyou.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
*    Kentyou - initial API and implementation
 */

package org.eclipse.sensinact.gateway.sthbnd.ttn.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sensinact.gateway.sthbnd.ttn.listener.TtnUplinkListener;
import org.eclipse.sensinact.gateway.sthbnd.ttn.packet.PayloadDecoder;

import jakarta.json.JsonException;
import jakarta.json.JsonObject;

public class TtnUplinkPayload extends TtnPacketPayload {

    private static final String PAYLOAD_DECODER = "(objectClass=" + PayloadDecoder.class.getCanonicalName() + ")";
    
    private final String applicationId;
    private final String deviceId;
    private final String hardwareSerial;
    private final int port;
    private final int counter;
    private final boolean confirmed;
    private final boolean isRetry;
    private final String payloadRaw;
    private final TtnMetadata metadata;
    private final List<TtnSubPacket> subPackets;

    public TtnUplinkPayload(String applicationId, String deviceId, String hardwareSerial, 
        int port, int counter,  boolean confirmed, boolean isRetry, String payloadRaw, TtnMetadata metadata) {
        this.applicationId = applicationId;
        this.deviceId = deviceId;
        this.hardwareSerial = hardwareSerial;
        this.port = port;
        this.counter = counter;
        this.confirmed = confirmed;
        this.isRetry = isRetry;
        this.metadata = metadata;
        this.payloadRaw = payloadRaw;
        subPackets = new ArrayList<>();
    }

    public TtnUplinkPayload(JsonObject json) throws JsonException {
    	JsonObject devIds = json.getJsonObject("end_device_ids");
        this.applicationId = devIds.getJsonObject("application_ids").getString("application_id");
        this.deviceId = devIds.getString("device_id");
        this.hardwareSerial = devIds.getString("dev_eui");
        JsonObject uplink = json.getJsonObject("uplink_message");
        this.port = uplink.getInt("f_port");
        this.counter = uplink.getInt("f_cnt");
        this.confirmed = json.getBoolean("confirmed");
        this.isRetry = json.getBoolean("is_retry");
        this.metadata = new TtnMetadata(uplink.getJsonObject("settings"));
        this.payloadRaw =uplink.getString("frm_payload");
        JsonObject location = uplink.getJsonObject("locations").getJsonObject("user");
        subPackets = new ArrayList<>();
        subPackets.add(new TtnSubPacket<>("admin", "location", null, null ,location.get("latitude") + ":" + location.get("longitude")));
        JsonObject payload = uplink.getJsonObject("decoded_payload");
        if(payload != null) {
        	payload.keySet().stream().map(k -> new TtnSubPacket<>("system", k, null,null,payload.get(k))).forEach(subPackets::add);
        }
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getHardwareSerial() {
        return hardwareSerial;
    }

    public int getPort() {
        return port;
    }

    public int getCounter() {
        return counter;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public boolean isRetry() {
        return isRetry;
    }

    public String getPayloadRaw() {
        return payloadRaw;
    }

    public TtnMetadata getMetadata() {
        return metadata;
    }    
    
    @Override
    public List<TtnSubPacket> getSubPackets() {
//        List<TtnSubPacket> subPackets = new ArrayList<>();
//        if (payloadRaw != null) {
//            try {
//                ServiceReference[] serviceReferences = this.mediator.getContext().getServiceReferences((String) null, PAYLOAD_DECODER);
//
//                if (serviceReferences != null) {
//                    for (ServiceReference serviceReference : serviceReferences) {
//                        Map<String, Object> decodedPayload = ((PayloadDecoder) mediator.getContext().getService(serviceReference)).decodeRawPayload(payloadRaw);
//
//                        if(!decodedPayload.isEmpty()) {
//                            for(Map.Entry<String, Object> payloadMap : decodedPayload.entrySet()) {
//                                if(payloadMap.getKey().equals("position")) {
//                                    subPackets.add(new TtnSubPacket<>("admin", "location", null,null,String.valueOf(payloadMap.getValue())));
//                                    continue;
//                                }
//                                if(TtnUplinkListener.DOWNLINK_MARKER.equals(payloadMap.getKey())){
//                                    subPackets.add(new TtnSubPacket<>(null, null, null, TtnUplinkListener.DOWNLINK_MARKER, payloadMap.getValue()));
//                                    continue;
//                                }                                
//                                String key = payloadMap.getKey();
//                                String[] keyElements = UriUtils.getUriElements(key);
//                                subPackets.add(new TtnSubPacket<>("content", keyElements[0],keyElements.length>1?keyElements[1]:null,
//                                	keyElements.length>2?keyElements[2]:null,String.valueOf(payloadMap.getValue())));
//                            }
//                            break;
//                        }
//                    }
//                }
//            } catch (InvalidSyntaxException e) {
//                e.printStackTrace();
//            }
//        }
        if(!subPackets.isEmpty() && (subPackets.size() > 1 || !TtnUplinkListener.DOWNLINK_MARKER.equals(subPackets.get(0).getMetadata()))) {
        	Double frequency = metadata.getFrequency();
            if(frequency != null)
             	subPackets.add(new TtnSubPacket<>("system", "frequency", null,null, frequency.doubleValue()));
            subPackets.add(new TtnSubPacket<>("system", "modulation", null,null,metadata.getModulation()));
            subPackets.add(new TtnSubPacket<>("system", "data_rate", null,null,metadata.getDataRate()));
            subPackets.add(new TtnSubPacket<>("system", "coding_rate", null,null,metadata.getCodingRate()));
            subPackets.add(new TtnSubPacket<>("system", "dataRaw", null, null, payloadRaw));
            subPackets.add(new TtnSubPacket<>("system", "dataRaw", null, null, payloadRaw));
        }
        return subPackets;
    }
}
