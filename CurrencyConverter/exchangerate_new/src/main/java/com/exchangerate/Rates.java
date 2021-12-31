package com.exchangerate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rates {

    @Override
    public String toString() {
        return "Rates{" +
                "USD='" + USD + '\'' +
                ", CAD='" + CAD + '\'' +
                '}';
    }

    @JsonProperty("USD")
    private String USD;

    public String getUSD() {
        return USD;
    }

    public void setUSD(String USD) {
        this.USD = USD;
    }

    public String getCAD() {
        return CAD;
    }

    public void setCAD(String CAD) {
        this.CAD = CAD;
    }

    @JsonProperty("CAD")
    private String CAD;


}
