package com.example.soap.soapclient;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SOAPConnector extends WebServiceGatewaySupport {

    public Object callWebService(String action, Object request){
        //return getWebServiceTemplate().marshalSendAndReceive(url, request);
        return getWebServiceTemplate().marshalSendAndReceive(request,new SoapActionCallback(action));
    }
}

