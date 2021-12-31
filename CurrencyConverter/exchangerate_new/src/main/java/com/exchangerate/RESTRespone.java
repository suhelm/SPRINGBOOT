package com.exchangerate;

public interface RESTRespone {
    public void setUsd_amount(double usd_amount);
    public void setExchangeRate(double exchangeRate);
    public String buildResponse();
}
