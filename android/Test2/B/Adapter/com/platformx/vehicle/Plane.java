package com.platformx.vehicle;

import com.platformx.interfaces.VehicleProperties;

public class Plane extends Vehicle {

    public Plane(int max_speed, VehicleProperties properties){
        super(max_speed, properties);
    }

    public void start(){
        System.out.println("Take Off with " + getProperties().set_num_of_passengers());
    }

    public void stop(){
        System.out.println("Landing");
    }
 }