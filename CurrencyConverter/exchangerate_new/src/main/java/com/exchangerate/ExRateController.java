package com.exchangerate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExRateController {
    @Autowired
    ExRateService exRateService;
    @Autowired
    RESTRespone restRespone;

    @GetMapping("/getrate/{ccy1}/{ccy2}/{amount}")
    public String getRate(@PathVariable String ccy1,@PathVariable String ccy2,@PathVariable double amount){
        ExRateResponseBody resp= this.exRateService.getRestResponse(ccy1,ccy2);

        Double usd_to_eur= (double) 1/Double.parseDouble(resp.getRates().getUSD());
        System.out.println("With 1 USD I can Buy how many EURO?" +usd_to_eur );
        //with this euro how many CAD we can buy?
        Double cad_to_usd= usd_to_eur* Double.parseDouble(resp.getRates().getCAD());
        System.out.println("With 1 USD I can Buy how many CAD?" +cad_to_usd );
        restRespone.setExchangeRate(cad_to_usd);
        restRespone.setUsd_amount(amount);
        return this.restRespone.buildResponse();
        //ExRateResponseBody resp=exRateService.getRestResponse(ccy1,ccy2);

        //return resp;

    }
}
