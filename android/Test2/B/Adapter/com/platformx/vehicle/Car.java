package com.platformx.vehicle;

import com.platformx.interfaces.VehicleProperties;

public class Car extends Vehicle {

    public Car(int max_speed, VehicleProperties properties){
        super(max_speed, properties);
    }

    public void start(){
        System.out.println("Driving with " + getProperties().set_num_of_passengers());
    }

    public void stop(){
        System.out.println("Parking");
    }
 }