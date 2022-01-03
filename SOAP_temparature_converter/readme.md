
## A Springboot application client which consumes SOAP webservices 

1. Request to the application is in JSON
--------------------------------------------
     POST : http://localhost:8081/getfahrenheight
     
     {
        "celsius" :"10"
      }
2. Response will be in JSON
----------------------------------------
    {
    "celsiusToFahrenheitResult": "50"
     }
 -----------------
 
3. It connects to the hosted webservice : https://www.w3schools.com/xml/tempconvert.asmx

Inspirations:
 https://howtodoinjava.com/spring-boot/spring-soap-client-webservicetemplate/

Its had some initial trouble:
referred this stack :https://stackoverflow.com/questions/56347209/spring-boot-server-did-not-recognize-the-value-of-http-header-soapaction


