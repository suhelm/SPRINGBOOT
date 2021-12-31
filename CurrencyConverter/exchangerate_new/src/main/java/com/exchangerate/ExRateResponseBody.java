package com.exchangerate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExRateResponseBody {
    private String success;
    private long timestamp;


    public Rates getRates() {
        return rates;
    }

    @JsonProperty("rates")
    public void setRates(Rates rates) {
        this.rates = rates;
    }

    private Rates rates;

    public void setSuccess(String success) {
        this.success = success;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private String base;
    private Date date;

    public String getSuccess() {
        return success;
    }

    public long getTimestamp() {
        return timestamp;
    }


    @Override
    public String toString() {
        return "ExRateResponseBody{" +
                "success='" + success + '\'' +
                ", timestamp=" + timestamp +
                ", rates=" + rates +
                ", base='" + base + '\'' +
                ", date=" + date +
                '}';
    }

    public String getBase() {
        return base;
    }

    public Date getDate() {
        return date;
    }



}
