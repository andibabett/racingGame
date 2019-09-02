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
       car.name = "Dacia";
       car.fuelLevel = 60;
       car.mileage = 8.5;
       car.doorCount = 5;
       car.maxSpeed = 180;
       car.fuelType = "Gasoline";


        System.out.println(car.name);
        System.out.println(car.travelDistance);
        System.out.println(car.running);

        System.out.println(car.engine);

        car.accelerate(60, 1);

        Engine engine2 = new Engine();
        engine.manufacturer = "VW";
        engine.capacity = 1600;

        Car car2 = new Car(engine2);
        car2.name = "Golf";
        car2.fuelLevel = 50;
        car2.mileage = 9;
        car2.doorCount= 3;
        car2.maxSpeed = 170;
        car2.fuelType = "Gasoline";

        car.name = "Skoda";
        car = car2
//        car.name = null;

        System.out.println("Modulo exemples");
        System.out.println(4 % 2);
        System.out.println(4 % 2);


                //concatenation
        System.out.println("Car2 name: " + car2.name);
        System.out.println("Car1 name: " + car.name);






    }
}
