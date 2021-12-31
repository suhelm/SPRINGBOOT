package com.exchangerate;

import org.springframework.http.ResponseEntity;

public interface ExRateService {
    public ExRateResponseBody getRestResponse(String ccy1, String ccy2);
}
