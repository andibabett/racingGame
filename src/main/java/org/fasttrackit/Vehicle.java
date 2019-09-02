package org.fasttrackit;

public class Vehicle {


    String name;
    double mileage;
    double maxSpeed;
    String fuelType;
    double fuelLevel;
    double travelDistance;
    boolean running;


    //semnatura metodei
    public double accelerate(double speed, double durationInHours) {
        //corpul metodei/implementarea metodei
        //sout+enter
        System.out.println(name + "is accelerating with " + speed + "km/h for" + durationInHours + " h.");

        double distance = speed + durationInHours;

        System.out.println("Distance: " + distance);

        travelDistance = travelDistance + distance;
        //acestea 2 sunt la fel, a doua este prescurtare
        // travelDistance += distance;

        double usedFuel = distance * mileage / 100;
        System.out.println("Used fuel: " + usedFuel);
        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel" + fuelLevel);


        ///incrementing/discrementing by 1
       // fuelLevel = fuelLevel+1
        // fuelLevel += 1;
        // fuelLevel++;





        return distance;


    }


}
