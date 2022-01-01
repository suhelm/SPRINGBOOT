This applicartion is using:

1. A basic Springboot application using Spring Web
2. RestTemplate to call http://api.exchangeratesapi.io/v1/latest which gives exchange rate vs USD/EUR and CAD/EUR
3. this application gets the rate and does a conversion between USD/CAD
4. The GET request : http://localhost:9900/getrate/USD/CAD/1234.     Where 1234 is the amount in USD for which we need the equivalent CAD
5. The Response looks like below:
    {base='EUR', ccy1='USD', ccy2='CAD', exRate=1.263915331817842, usdAmount=1234.0, cadEquivalent=1559.671519463217}
    
    
Okay, Now docker Support:

1 . to build the executable Jar file:
             ./mvnw clean package
2. Create a Dockerfile in the project folder of springboot

           FROM openjdk:8
           VOLUME /tmp
           EXPOSE 8080
           ADD target/exchangerate-0.0.1-SNAPSHOT.jar exchangerate-0.0.1-SNAPSHOT.jar
           ENTRYPOINT ["java","-jar","/exchangerate-0.0.1-SNAPSHOT.jar"]
 3.   docker build -f Dockerfile -t mydockerapp .
 4.   $ docker image ls       OR        $ docker images
 5.   docker run -p 9900:8080 mydockerapp
 6.   $ docker login
 7.   $ docker tag <imageName> <username>/<repositoryname>
       $ docker tag mydockerapp suhelfirdus/ex-rate-springboot
 8. $ docker push <username>/<repositoryname>:<tagname>
     $ docker push suhelfirdus/ex-rate-springboot:latest
  
  https://hub.docker.com/r/suhelfirdus/ex-rate-springboot/tags
  
