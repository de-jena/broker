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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.json.JsonException;
import jakarta.json.JsonObject;

public class TtnMetadata {

    private final String time;
    private final double frequency;
    private final String modulation;
    private final String dataRate;
    private final String codingRate;
    private final List gateways;

    public TtnMetadata(String time, long frequency, String modulation, String dataRate, String codingRate, List gateways) {
        this.time = time;
        this.frequency = frequency;
        this.modulation = modulation;
        this.dataRate = dataRate;
        this.codingRate = codingRate;
        this.gateways = gateways;
    }

    public TtnMetadata(JsonObject json) throws JsonException {
        this.time = json.getString("time");
        this.frequency = json.getJsonNumber("frequency").doubleValue();
        this.modulation = json.getString("modulation");
        this.dataRate = json.getJsonObject("data_rate").getJsonObject("lora").get("bandwidth").toString();
        this.codingRate= json.getString("coding_rate");

        List<TtnGateway> gateways = new ArrayList<>();

//        for(int i = 0; i < json.optJSONArray("gateways").length(); i++) {
//            gateways.add(new TtnGateway(json.getJSONArray("gateways").getJSONObject(i)));
//        }

        this.gateways = gateways;
    }

    public String getTime() {
        return time;
    }

    public double getFrequency() {
        return frequency;
    }

    public String getModulation() {
        return modulation;
    }

    public String getDataRate() {
        return dataRate;
    }

    public String getCodingRate() {
        return codingRate;
    }

    public List getGateways() {
        return gateways;
    }

    public Map<String, Object> getData() {
        Map<String, Object> data = new HashMap<>();

        data.put("frequency", frequency);
        data.put("modulation", modulation);
        data.put("data_rate", dataRate);
        data.put("coding_rate", codingRate);

        return data;
    }
}
