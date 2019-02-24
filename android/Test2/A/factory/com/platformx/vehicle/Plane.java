package com.platformx.vehicle;

import com.platformx.interfaces.Vehicle;

public class Plane implements Vehicle {

    int wheels;
    int passengers;
    boolean is_has_gas = false;

    public Plane(int wheels, int passengers){
        this.wheels = wheels;
        this.passengers = passengers;
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
    
    public void take_off(){
        System.out.println("Driving");
    }

    public void landing(){
        System.out.println("Landing");
    }
}