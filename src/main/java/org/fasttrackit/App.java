package org.fasttrackit;

import org.w3c.dom.ls.LSOutput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {



        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1600;

       Car car = new Car(engine);
       car.setName("Dacia");
       car.setFuelLevel(60);
       car.setMileage(8.5);
       car.setMaxSpeed(180);
       car.setFuelType("Gasoline");

        System.out.println("Car object: " + car.toString());

        System.out.println(car.getName());
        System.out.println(car.getTravelDistance());
        System.out.println(car.isRunning());

        System.out.println(car.engine);

        car.accelerate(60, 1);

        car.accelerate(90);

        Engine engine2 = new Engine();
        engine.manufacturer = "VW";
        engine.capacity = 1600;

        Car car2 = new Car(engine2);
        car2.setName("Golf");
        car2.setFuelLevel(50);
        car2.setMileage(9);
        car2.doorCount= 3;
        car2.setMaxSpeed(170);
        car2.setFuelType("Gasoline");

        car.setName("Skoda");
        car = car2;
//        car.name = null;

        System.out.println("Modulo exemples");
        System.out.println(4 % 2);
        System.out.println(4 % 2);



                //concatenation
//        System.out.println("Car2 name: " + car2.setName();
//        System.out.println("Car1 name: " + car.setName();


//        System.out.println("Static variables example");
//
//
//// wee should only call static variables from the class itself (Car),
//// not from a variable containing an object of the class
//        car.totalCount = 1;
//        System.out.println("Total count in car:" + car.totalCount);
//
//        car2.totalCount = 12;
//        System.out.println("Total count in car after setting car2: " + car2.totalCount);
//        System.out.println("Total count in car2: " + car2.totalCount);
//        System.out.println("Total count in Car class: "+ Car.totalCount);

 Vehicle hybridCar = new HybridCar();
 hybridCar.setName("Cheater!!!");

// method implemention from objects class not from variables class
 hybridCar.accelerate(60,1);
        System.out.println("Fuel level: " + hybridCar.getFuelLevel());
        System.out.println("Travel distance " + hybridCar.getTravelDistance());

//    variable type decides what methods can be invoked#
//        type casting
        (HybridCar) hybridCar.fly();


    }


}
