<b> Dependency Injection By Constructor</B>

1. Create a Maven project
----------------------------------

2. Add Spring Core in POM.xml 
----------------------------------
                        <?xml version="1.0" encoding="UTF-8"?>
                        <project xmlns="http://maven.apache.org/POM/4.0.0"
                                 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                                 xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
                            <modelVersion>4.0.0</modelVersion>

                            <groupId>org.example</groupId>
                            <artifactId>SpringCoreTest</artifactId>
                            <version>1.0-SNAPSHOT</version>
                            <dependencies>
                                <dependency>
                                    <groupId>org.springframework</groupId>
                                    <artifactId>spring-context</artifactId>
                                    <version>5.3.3</version>
                                </dependency>
                                <dependency>
                                    <groupId>javax.annotation</groupId>
                                    <artifactId>javax.annotation-api</artifactId>
                                    <version>1.3.2</version>
                                </dependency>
                            </dependencies>

                        </project>

3. Create class Vehicle
----------------------------------


                        public class Vehicle {

                            int noOfDoors;

                            public Vehicle(int noOfDoors, int passengerCapacity, double price) {
                                this.noOfDoors = noOfDoors;
                                this.passengerCapacity = passengerCapacity;
                                this.price = price;
                            }

                            int passengerCapacity;
                            double price;

                            @Override
                            public String toString() {
                                return "Vehicle{" +
                                        "noOfDoors=" + noOfDoors +
                                        ", passengerCapacity=" + passengerCapacity +
                                        ", price=" + price +
                                        '}';
                            }
                        }
                        
4. Create The beans.xml and configure the bean:
------------------------
                      <?xml version="1.0" encoding="UTF-8"?>
                      <beans xmlns="http://www.springframework.org/schema/beans"
                             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                             xsi:schemaLocation="http://www.springframework.org/schema/beans
                              https://www.springframework.org/schema/beans/spring-beans.xsd">

                          <bean id="vehicle" class="Vehicle">

                              <constructor-arg index="0" value="1"/>
                              <constructor-arg index="1" value="4"/>
                              <constructor-arg index="2" value="1000"/>
                          </bean>


                      </beans>
                      
    5. Write the VehicleTest class:
--------------------------------------

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

                public class VehicleTest {
                    //Traditional
                    public static void main(String[] args) {
                        Vehicle v1=new Vehicle(4,5,10000);
                        System.out.println(v1);

                        // IOC by Spring
                        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
                        Vehicle v2=ctx.getBean("vehicle",Vehicle.class);
                        System.out.println(v2);
                    }


                }
 ------------------------
 OUTPUT :
Vehicle{noOfDoors=4, passengerCapacity=5, price=10000.0}
Vehicle{noOfDoors=1, passengerCapacity=4, price=1000.0}


     

