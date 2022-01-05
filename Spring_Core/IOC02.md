
1. beans2.xml
----------------
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="vehicle2" class="Vehicle2">
        <property name="NoOfDoors" value="4" />
        <property name="PassengerCapacity" value="10" />
        <property name="Price" value="5000" />

    </bean>


</beans>

2. Vehicle2 class// removed the constructor and addedd getter and setters
-----------
                       public class Vehicle2 {

                    public int getNoOfDoors() {
                        return noOfDoors;
                    }

                    public void setNoOfDoors(int noOfDoors) {
                        this.noOfDoors = noOfDoors;
                    }

                    public int getPassengerCapacity() {
                        return passengerCapacity;
                    }

                    public void setPassengerCapacity(int passengerCapacity) {
                        this.passengerCapacity = passengerCapacity;
                    }

                    public double getPrice() {
                        return price;
                    }

                    public void setPrice(double price) {
                        this.price = price;
                    }

                    int noOfDoors;
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
 3. Test
 -------------------
             import org.springframework.context.ApplicationContext;
            import org.springframework.context.support.ClassPathXmlApplicationContext;

            public class VehicleTest2 {
                //Traditional
                public static void main(String[] args) {

                    ApplicationContext ctx=new ClassPathXmlApplicationContext("beans2.xml");
                    Vehicle2 v2=ctx.getBean("vehicle2",Vehicle2.class);
                    System.out.println(v2);
                }


            }

