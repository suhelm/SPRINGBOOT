package com.exchangerate;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExRateServiceImpl implements  ExRateService {
    @Override
    public ExRateResponseBody getRestResponse(String ccy1,String ccy2) {

        StringBuilder sb=new StringBuilder();
        sb.append("http://api.exchangeratesapi.io/v1/latest?access_key=c68bd8b1f9fb6e1a26d7b1d8fbc1c2af&symbols=");
        sb.append(ccy1);
        sb.append(",");
        sb.append(ccy2);

        System.out.println(sb.toString());
        String baseUrl=sb.toString();
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
             = baseUrl;
        ExRateResponseBody response
            = restTemplate.getForObject(fooResourceUrl , ExRateResponseBody.class);
        System.out.println(response.getSuccess());
        System.out.println(response.toString());
        System.out.println(response.getRates().getUSD());
        System.out.println(response.getRates().getCAD());
        return response;
    }
}
