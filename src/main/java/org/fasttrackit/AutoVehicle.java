package org.fasttrackit;



//inheritance (is-a relationship)
public class AutoVehicle extends  Vehicle  {

   //has-a relationaship
    Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }
    public AutoVehicle(){
//        this.engine = new Engine();acelasi ca cel de jos, numai mai scurt

//        constructor overloading
        this(new Engine());

    }

//23.09.2019

}


