package com.example.soap.soapclient;

import com.example.soap.soapclient.generated.CelsiusToFahrenheit;
import com.example.soap.soapclient.generated.CelsiusToFahrenheitResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SOAPController {
    @Autowired
    SOAPConnector soapConnector;
    @PostMapping("/getfahrenheight")
    public CelsiusToFahrenheitResponse getFahrenheight(@RequestBody CelsiusToFahrenheit req){
        System.out.println("input " + req.getCelsius());
        CelsiusToFahrenheitResponse response = (CelsiusToFahrenheitResponse) soapConnector.callWebService("https://www.w3schools.com/xml/CelsiusToFahrenheit",req);
        System.out.println("Got Response As below ========= : ");
        System.out.println("FahrenheitResult : " + response.getCelsiusToFahrenheitResult().toString());
        return response;

    }
}
