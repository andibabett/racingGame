package org.fasttrackit;

public class HybridCar extends Vehicle{

    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + "is accelerating with " + speed + "for" + durationInHours + "h");
       double actualSpeed = 2 * speed;


        double distance = actualSpeed + durationInHours;

        setTravelDistance(getTravelDistance() + distance);


        System.out.println("Cheater!!!");
        return distance;



    }
//exceptie de la : SEMNATURA METODEI TREBUIE SA FIE TOT TIMPUL LA FEL CA...
//    co-variant return type
    @Override
    protected HybridCar clone() throws CloneNotSupportedException {
        return new HybridCar()
    }
}
