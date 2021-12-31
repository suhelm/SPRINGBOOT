package com.exchangerate;

import org.springframework.stereotype.Service;

@Service
public class RESTResponseImpl implements RESTRespone{

    private String baseCCY="EUR";
    private String ccy1="USD";
    private String ccy2="CAD";



    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public void setUsd_amount(double usd_amount) {
        this.usd_amount = usd_amount;
    }

    private double exchangeRate;
    private double convertedAmount;
    private double usd_amount;


    @Override
    public String toString() {
        return "{" +
                "base='" + baseCCY + '\'' +
                ", ccy1='" + ccy1 + '\'' +
                ", ccy2='" + ccy2 + '\'' +
                ", exRate=" + exchangeRate +
                ", usdAmount=" + usd_amount +
                ", cadEquivalent=" + convertedAmount +
                '}';
    }

    @Override
    public String buildResponse() {
        this.convertedAmount=this.usd_amount*this.exchangeRate;
        return this.toString();
    }
}
