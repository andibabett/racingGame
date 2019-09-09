package org.fasttrackit;

public class Vehicle {

    private static int totalCount;


   private String name;
   private double mileage;
   private double maxSpeed;
   private String fuelType;
   private double fuelLevel;
   private double travelDistance;
   private boolean running;

    public Vehicle() {
        totalCount++;
    }
//overload cele 2 public
    public double accelerate(double speed){
        return accelerate(speed,  1);

    }

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

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(double travelDistance) {
        this.travelDistance = travelDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public String getName() {
        return name;


    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", mileage=" + mileage +
                ", maxSpeed=" + maxSpeed +
                ", fuelType='" + fuelType + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", travelDistance=" + travelDistance +
                ", running=" + running +
                '}';
    }
}
