package com.platformx.vehicle;

import com.platformx.interfaces.Vehicle;

public class Car implements Vehicle {

    int wheels;
    int passengers;
    boolean is_has_gas;

    public Car(int wheels, int passengers, boolean is_has_gas){
        this.wheels = wheels;
        this.passengers = passengers;
        this.is_has_gas = is_has_gas;
    }

    public int set_num_of_wheels(){
        return this.wheels;
    }

    public int set_num_of_passengers(){
        return this.passengers;
    }

    public boolean has_gas(){
        return this.is_has_gas;
    }

    public void driving(){
        System.out.println("Driving");
    }
}