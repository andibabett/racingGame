package org.fasttrackit;



//inheritance (is-a relationship)
public class AutoVehicle extends  Vehicle  {

   //has-a relationaship
    Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }
}


